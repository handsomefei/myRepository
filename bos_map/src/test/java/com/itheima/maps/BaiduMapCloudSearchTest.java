package com.itheima.maps;

import java.io.IOException;
import java.net.URLEncoder;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.itheima.entity.Constant;
import com.itheima.entity.LBSPoint;

// 云检索 
public class BaiduMapCloudSearchTest {
	@Test
	// 周边检索
	public void demo1() throws IOException {
		HttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(
				"http://api.map.baidu.com/geosearch/v3/nearby?ak="+Constant.AK+"&geotable_id="+ Constant.GEOTABLE_ROUTE_ID +"&location=117.218528,36.659157&radius=1000");

		HttpResponse httpResponse = httpClient.execute(httpGet);
		HttpEntity httpEntity = httpResponse.getEntity();
		Header[] allHeaders = httpResponse.getAllHeaders();
		for (Header header : allHeaders) {
//			System.out.println(header.getName() + ":" + header.getValue());
		}
		String body = EntityUtils.toString(httpEntity);
		System.out.println(body);
		LBSPoint parse = JSONObject.parseObject(body, LBSPoint.class);
		System.out.println(parse);
	}

	@Test
	// 本地检索
	public void demo2() throws IOException {
		HttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(
				"http://api.map.baidu.com/geosearch/v3/local?region=北京&ak="+Constant.AK+"&geotable_id="+Constant.GEOTABLE_ROUTE_ID+"&location=116.647367,39.899552&radius=1000");

		HttpResponse httpResponse = httpClient.execute(httpGet);
		HttpEntity httpEntity = httpResponse.getEntity();
		System.out.println(EntityUtils.toString(httpEntity));
	}

	@Test
	// 云地理编码
	public void demo3() throws IOException {
		String address = URLEncoder.encode("好嫂子", "utf-8");
		String url = "http://api.map.baidu.com/cloudgc/v1?geotable_id="+ Constant.GEOTABLE_ROUTE_ID +"&ak="+Constant.AK+"&address="
				+ address;
		System.out.println(url);

		HttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);

		HttpResponse httpResponse = httpClient.execute(httpGet);
		HttpEntity httpEntity = httpResponse.getEntity();
		System.out.println(EntityUtils.toString(httpEntity));
	}
}
