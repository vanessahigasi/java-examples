package tech.bts.javaexamples.products;

import tech.bts.javaexamples.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayProducts {

    public static void main(String[] args) {

        //new object
        Product p1 = new Product("iphone",1000,true);
        Product p2 = new Product("tv",300,true);
        Product p3 = new Product("MacPro",1800,true);

        //create a list of products
        /**

        List<Product> products2 = Arrays.asList(p1,p2,p3);
         */

        List<Product> products = new ArrayList<Product>();

        products.add(p1);
        products.add(p2);
        products.add(p3);


        int columnWidth = 10;

        List<String> fieldNames = Arrays.asList("Name","Price","Available");


        String title = "";


        for (String fieldName : fieldNames) {
            title += StringUtil.padRight(fieldName, columnWidth);

        }


        String line = StringUtil.repeat("-",columnWidth * fieldNames.size());

        System.out.println(title);
        System.out.println(line);

        for (Product product : products) {
            String productLine = StringUtil.padRight(product.getName(),columnWidth)
                    + StringUtil.padRight("" + product.getPrice(),columnWidth)
                    + StringUtil.padRight("" + product.isAvailable(),columnWidth)
                    ;

            System.out.println(productLine);
        }

    }
}
