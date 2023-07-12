package NetworkProgramming;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Arrays;

public class InetExample {
    public static void main(String[] args) {
        try{
            System.out.println("For Remote Host.");
            InetAddress ia =InetAddress.getByName("www.facebook.com");
            System.out.println("Host name:"+ia.getHostName());
            System.out.println("Host address:"+ia.getHostAddress());
            System.out.println("IPv4:"+ Inet4Address.getByName("www.facebook.com"));
            System.out.println("IPv6:"+ Inet6Address.getByName("www.facebook.com"));
            System.out.println("All:"+ Arrays.toString(InetAddress.getAllByName("www.facebook.com")));

            System.out.println("For local host:");
            InetAddress lia=InetAddress.getLocalHost();
            System.out.println("Host Name:"+lia.getHostName());
            System.out.println("Host Address:"+lia.getHostAddress());
        }
        catch (Exception e){
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }
    }
}
