package builder;

public class Program {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        String s  = stringBuffer
                .append("AAA")
                .append(1)
                .append("BBB")
                .insert(2, "DDD")
                .toString();

        Order order1 = new OrderBuilder()
                .setClientName("Client #1")
                .setPrice(200.5)
                .setQnt(4)
                .setProductId(12454)
                .setSign(true)
                .build();
    }

}
