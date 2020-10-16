public class TerrapinCard {
private double balance;

  public TerrapinCard(double balance1) {
    balance = balance1;
  }

  public String toString() {
   return "The card has " + balance + " dollars"; 
  }

  //Paying with card & Balance Nonnegative

  public void payEconomical(){
    double x;
    x = balance; 
    balance = balance - 2.50;
    if (balance < 0){
      balance = x;
    }
  }

  public void payGourmet(){
    double y;
    y = balance; 
    balance = balance - 4.00;
    if (balance < 0){
      balance = y;
    }
  }

  //Loading money to card & Loading a negative amount

  public void loadMoney(double amount){
    double z = 150.0;
    double b = balance;
    if (amount < 0){
      balance = b;
    }else{
      balance += amount;
    }
    
    if (balance > 150){
      balance = z;
    }
  }

  public double getBalance(){
    return balance;
  }


}
