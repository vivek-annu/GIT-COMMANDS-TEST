package com.techmahendra;


public class Tech {


    MyService myService= new MyService();

    public boolean redeemPoint(String customerId, String amount)
    {

        boolean flag=false;
        if(customerId!=null && !customerId.isEmpty() && amount!=null && !amount.isEmpty()) {
          try {
              Double toRedeem = Double.valueOf(amount);
              double currentPoints = myService.getPoints(customerId);
              double newPoints = currentPoints - toRedeem;
              myService.save(customerId, newPoints);
            //  log.info("Points redeemed for customer {}", customerId);
             return true;
          }catch (Exception e){
            //  log.error(e);
              throw  new RuntimeException(e);
          }
        }
        return flag;

    }
    public static void main(String[] args) {

    }
}
