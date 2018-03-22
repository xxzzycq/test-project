package com.xxzzycq.hive.metastore.test;

import com.xxzzycq.hive.metastore.HiveMetastoreClient;
import com.xxzzycq.hive.metastore.HiveMetastoreClientFactory;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.thrift.TException;
import org.junit.Test;

import java.util.List;

/**
 * Created by yangchangqi on 2018/3/21.
 */
public class TestHiveMestoreConnection {
    public static HiveMetastoreClient getThriftConnectedClient() {
        //String hiveMetaStoreHost, int hiveMetaStorePort, UserGroupInformation kerberosUserGroupInfo
        HiveMetastoreClient client;
        try {
            HiveMetastoreClientFactory clientFactory = new HiveMetastoreClientFactory(10 * 1000);
            client = clientFactory.create(
                    "192.168.177.79",
                    9083,
                    UserGroupInformation.getCurrentUser(),
                    false);
        } catch (Exception e) {
            throw new RuntimeException(
                    "Failed connecting to Hive metastore", e);
        }
        return client;
    }

    @Test
    public void testConnection() {
        for (int i = 0; i < 5000; i++) {
            try (HiveMetastoreClient client = getThriftConnectedClient()) {
                List<String> allDatabases = client.get_all_databases();
                System.out.println(i + 1);
            } catch (TException e) {
                e.printStackTrace();
            }
        }
    }
}
