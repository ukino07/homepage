package com.homepage;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;

import static org.junit.Assert.assertEquals;

/**
 * Created by u_kino07 on 2018. 6. 4..
 */
public class CustomDataSourceTest {
    @Test
    public void masterDataSource() throws Exception {
        RdbmsConfig config = new RdbmsConfig();
        Connection connection = config.masterDataSource().getConnection();
        ResultSet set = connection.prepareStatement("SELECT 1").executeQuery();
        set.next();

//        set.isLast()

        assertEquals(set.getInt(1), 1);
    }

    @Test
    public void slaveDataSource() throws Exception {
        RdbmsConfig config = new RdbmsConfig();
        Connection connection = config.slaveDataSource().getConnection();
        ResultSet set = connection.prepareStatement("SELECT 1").executeQuery();
        set.next();

        assertEquals(set.getInt(1), 1);
    }

}