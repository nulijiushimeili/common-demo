package com.aha.demo;

import java.net.InetSocketAddress;

public class RpcClientTest {

    public static void main(String[] args) {

        ServiceProducer service = RPCClient.getRemoteProxyObj(ServiceProducer.class, new InetSocketAddress("localhost", 8088));
        System.out.println(service.sendData("test"));
        System.out.println(service.exeSomething("ssss"));
    }
}
