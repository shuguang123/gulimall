package com.atguigu.gulimall.thirdparty;

import java.io.ByteArrayInputStream;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;

@SpringBootTest
public class ThirdpartyApplicationTests {

    @Test
    public void contextLoads() {}

    @Autowired
    private OSSClient ossClient;

    @Test
    public void testUpload() throws Exception {
        // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
        String endpoint = "https://oss-cn-shanghai.aliyuncs.com";

        String accessKeyId = "LTAI5tBPhvqmfRjEoSCmjr6B";
        String accessKeySecret = "jDw1UUi06rpPl1O2nAIsOCePObaKes";

        // 填写Bucket名称，例如examplebucket。
        String bucketName = "gulimall-ysg";
        // 填写Object完整路径，例如exampledir/exampleobject.txt。Object完整路径中不能包含Bucket名称。
        String objectName = "exampleobject3.txt";

        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            String content = "Hello OSS";
            // ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(content.getBytes()));
            ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(content.getBytes()));
        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }
    }

}
