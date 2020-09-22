package com.aha.demo;

/**
 * @author: guangxush
 * @create: 2019/05/18
 */
public class ServiceProducerImpl implements ServiceProducer{
    @Override
    public String sendData(String data) {
        return "I am service producer!!!, the data is "+ data;
    }


    @Override
    public String exeSomething(String str) {
        A a = new A();
        a.show(str);
        return a.getStr(str);
    }

    class A{

        public void show(String aaa){
            System.out.println(aaa);
        }

        public String getStr(String str){
            return str;
        }
    }
}
