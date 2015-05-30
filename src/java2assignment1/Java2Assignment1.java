/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2assignment1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Muthaiah
 */
public class Java2Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*GregorianCalendar date=new GregorianCalendar();
        //System.out.println(date.toZonedDateTime().toString());
        DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(formatter.format(new Date()));*/
        //toCheck();
        /*Map<Integer,Integer> productId_quantity=new LinkedHashMap<>();
        productId_quantity.put(3, 3);
        productId_quantity.put(4, 4);
        JSONArray purchases=new JSONArray();*/
        toCheck();
    }
    
    public static void toOrder(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Customer Name");
        String customerName=scan.nextLine();
        System.out.println("Enter the Customer Id:");
        int customerId=scan.nextInt();
        /*System.out.println("Enter the Product Id which you want to buy:");
        int productId=scan.nextInt();
        System.out.println("Enter the Quantity you need:");
        int quantity=scan.nextInt();*/
        Order order=new Order(customerId,customerName);
        //order.setListOfPurchase(productId, quantity);
        if(order.customerId==0 || order.customerName.equals("")){
            try {
                throw new RuntimeException("Need Customer Id or Customer Name");
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
            

        } if(order.productId_quantity.isEmpty()){
            try {
                throw new RuntimeException("Purchase Order List should not be ZERO");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
    
    public static void toCheck(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Customer Name");
        String customerName=scan.nextLine();
        System.out.println("Enter the Customer Id:");
        int customerId=scan.nextInt();
        Order order=new Order(customerId,customerName);
        
        order.setListOfPurchase(3, 3);
        order.setListOfPurchase(5, 1);
        System.out.println(order.toJSON());
    }
    
}
