package Test;

import com.aliyun.oss.OSSClient;

import java.io.File;


/**
 * \* Author: sky
 * \* Date: 2019/7/2
 * \* Description:
 * \
 */
public class UploadAli {
    public static void main(String[] args) {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI8iPTtYNX8amx";
        String accessKeySecret = "7fwenx5yF1MT7HVJpRoHwvFiZLXKQD";
        // 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        ossClient.putObject("cxlsky", "blog/img/text.jpg", new File("C:/Users/史锴源/Desktop/壁纸头像/abc.jpg"));
        ossClient.shutdown();
    }
}