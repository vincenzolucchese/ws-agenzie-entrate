package com.demo.httpclientConi;

import java.io.DataOutputStream;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.util.Scanner;

import javax.net.ssl.SSLContext;

import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.FileRequestEntity;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.BasicHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class TestWSHTTPS {
    private static final int TIME_OUT = 10000;    
    public static void main(String[] args) throws Exception {
    	
    	String URL = "https://invioSS730pTest.sanita.finanze.it/Ricevute730ServiceWeb/ricevutePdf";
        final String FILE = "C:/WORKSPACES/CONI/httpclientConi/src/main/java/com/demo/httpclientConi/soapmessage.xml";    
        
//        URL obj = new URL(URL);
//        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//        con.setConnectTimeout(TIME_OUT);
//        byte[] fileBytes = Files.readAllBytes(Paths.get(FILE));
//        String fileContent = new String(fileBytes, "UTF-8");
//        // request headers (add all headers needed)
//        con.setRequestMethod("POST");
//        con.setRequestProperty("Content-length", String.valueOf(fileBytes.length));
//        con.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
//        // Send post request
//        con.setDoOutput(true);
//        con.setReadTimeout(TIME_OUT);
//        
//        con.setRequestProperty("Authorization", " Basic VVhONlZNREQ6UDJTUERWRjQ=");
//        
//        DataOutputStream outputStream= new DataOutputStream(con.getOutputStream());
//        outputStream.write(fileContent.getBytes());
//        int responseCode = con.getResponseCode();
//        System.out.println("responseCode:" + responseCode);
//        InputStream in = null;
//        if (con.getResponseCode() >= 200 && con.getResponseCode()<= 300 ) {
//            in = con.getInputStream();
//        } else {
//            in = con.getErrorStream();
//        }
//        System.out.println("\nSending 'POST' request to URL : " + URL);
//        System.out.println("Response Code : " + responseCode);
//        Scanner s = new Scanner(in).useDelimiter("\\A");
//        String result = s.hasNext() ? s.next() : "";
//        System.out.println(result);
        
        
    	HttpPost request = new HttpPost(URL);
    	String authHeader = "Basic VVhONlZNREQ6UDJTUERWRjQ=";
    	request.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
    	 
	    TrustStrategy acceptingTrustStrategy = (cert, authType) -> true;
	    SSLContext sslContext = SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
	    SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, 
	      NoopHostnameVerifier.INSTANCE);
	     
	    Registry<ConnectionSocketFactory> socketFactoryRegistry = 
	      RegistryBuilder.<ConnectionSocketFactory> create()
	      .register("https", sslsf)
	      .register("http", new PlainConnectionSocketFactory())
	      .build();
	 
	    BasicHttpClientConnectionManager connectionManager = 
	      new BasicHttpClientConnectionManager(socketFactoryRegistry);
	   
	    HttpHost targetHost = new HttpHost("invioSS730pTest.sanita.finanze.it");
	    

    	
	    AuthCache authCache = new BasicAuthCache();
	    authCache.put(targetHost, new BasicScheme());
	     
	    // Add AuthCache to the execution context
	    HttpClientContext context = HttpClientContext.create();
	    CredentialsProvider credsProvider = new BasicCredentialsProvider();
	    credsProvider.setCredentials(AuthScope.ANY, 
	      new UsernamePasswordCredentials("UXN6VMDD", "P2SPDVF4"));
	    context.setCredentialsProvider(credsProvider);
	    context.setAuthCache(authCache);

	    CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslsf)
	  	      .setConnectionManager(connectionManager).build();
	    EntityBuilder eb = EntityBuilder.create();
	    eb.setFile(new File(FILE));
	    HttpEntity aaa = eb.build();
	    
	    request.setEntity(aaa);
	    CloseableHttpResponse response = httpClient.execute(request,context);
	    
	   
	    HttpEntity entity = response.getEntity();	   
	    
	    System.out.println( EntityUtils.toString(entity));
    	int statusCode = response.getStatusLine().getStatusCode();
    	System.out.println(statusCode);
    }
   

}