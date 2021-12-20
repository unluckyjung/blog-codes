package other;

import domain.BlogerName;

public class OtherClass {

    public static String getUserName() {
        System.out.println(BlogerName.getName());
        return BlogerName.getName();
    }
}
