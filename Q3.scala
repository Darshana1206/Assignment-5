package functiondata

object Q3 {
  def main(args:Array[String])={
  val acc1 = new Account("973254553V","70637012","K.M.D.R Bandara",20000);
  val acc2 = new Account("199732504553","83977472","K.M.T Bandara",15000);
  println("Initial Balances: \n");
  println(acc1);
  println(acc2);
  acc1.transferMoney(acc2,15000);
  println("Balances after Transfer: \n");
  println(acc1);
  println(acc2);
}

class Account(id:String, accountNo:String, name:String, amount:Double){
  val nic = id;
  val accountNumber = accountNo;
  val fullName = name;
  var balance = amount;

  def withdraw(amount: Double) = this.balance -= amount;
  def deposit(amount: Double) = this.balance += amount;
  def transferMoney(bankAccount: Account,amount:Double): Unit ={
    this.withdraw(amount);
    bankAccount.deposit(amount);
  }
  override def toString: String = "NIC: "+this.nic+"\nAccountNumber: "+this.accountNumber+"\nFull Name: "+this.fullName+"\nBalance: "+this.balance+"\n";
}
}