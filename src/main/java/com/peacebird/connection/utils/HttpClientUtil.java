package com.peacebird.connection.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xu.yunfeng01
 * @Date: 2021/3/28 20:43
 * @Description: todo
 */
public class HttpClientUtil {

    /**
     * @Param: 
     * @Return: 
     * @Description:
     * @Date: 2021/3/28
     */
    public static JSONObject postRequest(String url, JSONObject object) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();

        HttpPost post = new HttpPost(url);
        post.setHeader("Content-type", "application/json");
        //参数传入
        StringEntity utils = new StringEntity(object.toString(),"utf-8");
        CloseableHttpResponse response1 = null;
        post.setEntity(utils);
        response1=client.execute(post);

        return  JSONObject.parseObject( EntityUtils.toString(response1.getEntity(),"utf-8"));
    }
  
   /**
    * @Param: 
    * @Return:
    * @Description:
    * @Date: 2021/3/28
    */
    public static JSONObject getRequestNotParams(String url) throws IOException {

        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        CloseableHttpResponse response =  client.execute(get);
        String str = EntityUtils.toString(response.getEntity(),"utf-8");
        if(response!=null){

            return  JSONObject.parseObject(str);
        }
        Map map = new HashMap();
        map.put("tpn001","空值");
        return new JSONObject(map);
    }
  
    /**
     * @Param:
     * @Return: 
     * @Description:
     * @Date: 2021/3/28
     */
    public static JSONObject getRequestParams(String url, JSONObject object) throws Exception {
        StringBuilder sb = new StringBuilder();
        object.entrySet().forEach(x->{
            sb.append(x.getKey()+"="+x.getValue()+"&");
        });
        sb.replace(sb.lastIndexOf("&"),sb.length(),"");
        sb.replace(sb.lastIndexOf(" "),sb.lastIndexOf(" ")+1,"+");
        URL url2 = new URL(url+"?"+sb.toString());
        URI uri = new URI("http",url2.getUserInfo(),url2.getHost(),url2.getPort(),url2.getPath(),url2.getQuery(),null);
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(uri);
        CloseableHttpResponse response =  client.execute(get);
        String str = EntityUtils.toString(response.getEntity(),"utf-8");
        if(response!=null){
            return  JSONObject.parseObject(str);
        }
        Map map = new HashMap();
        map.put("tpn001","空值");
        return new JSONObject(map);
    }


}
