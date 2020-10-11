public interface Payable                                             
   {                                                                    
   double getPaymentAmount();
   }
public class Invoice implements Payable
   {
      private int quantity;
      private double pricePerItem;

     public Invoice(int count, double price )
      {
         setQuantity( count );
         setPricePerItem( price );
      }
      public void setQuantity( int count )
      {
         if ( count >= 0 )
            quantity = count;
         else
            throw new IllegalArgumentException( "Quantity must be >= 0" );
      }

      public int getQuantity()
      {
         return quantity;
      }

      public void setPricePerItem( double price )
      {
         if ( price >= 0.0 )
            pricePerItem = price;
         else
            throw new IllegalArgumentException("Price per item must be >= 0" );
      }
      public double getPricePerItem()
      {
         return pricePerItem;
      }                                                          
      public double getPaymentAmount()                                    
      {                                                                   
      return getQuantity() * getPricePerItem();
      }                                  
   }
public class SalaryEmployee
   {
      private double weeklySalary;

       public SalaryEmployee(double salary )
      {
         setWeeklySalary( salary );
      }

      public void setWeeklySalary( double salary )
      {
         if ( salary >= 0.0 )
            weeklySalary = salary;
         else
            throw new IllegalArgumentException("Weekly salary must be >= 0.0" );
      }
      public double getWeeklySalary()
      {
         return weeklySalary;
      }                              
      public double getPaymentAmount()                                  
      {                                                                 
      return getWeeklySalary();                                      
      }
}

public class Question_9
   {
      public static void main( String[] args )
      {
         Payable[] payableObjects = new Payable[ 2 ];
         payableObjects[ 0 ] = new Invoice( 2, 375.00 );
	 payableObjects[ 1 ] = new SalaryEmployee( 1200.00 );
	 for ( Payable currentPayable : payableObjects )
	 {
		System.out.println("payment due" +currentPayable.getPaymentAmount())
	 }
       }
}
