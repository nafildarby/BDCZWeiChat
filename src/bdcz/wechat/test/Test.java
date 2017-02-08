package bdcz.wechat.test;

public class Test {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        //10���߳�
        for (int i = 0; i < 10; i++) {
            new Thread(new TestThread(sbf, sb)).start();
        }
    }
}
 
class TestThread implements Runnable {
    StringBuffer sbf;
    StringBuilder sb;
 
    TestThread(StringBuffer sbf, StringBuilder sb) {
        this.sb = sb;
        this.sbf = sbf;
    }
 
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sb.append("1");
            sbf.append("1");
            System.out.println(sb.length() + "/" + sbf.length());
        }
    }
}


class SBTester {
	StringBuffer sbf;
    StringBuilder sb;
    
    
    public void testAppend(){
    	sb.append("1");
        sbf.append("1");
        System.out.println(sb.length() + "/" + sbf.length());
    }
}
