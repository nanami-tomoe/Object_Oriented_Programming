public class CounterTester
{
   public static void main(String[] args)
   {
      Counter tally = new Counter(); // 생성자가 없으면 적정한 생성자 알아서 생성 
      tally.click();
      tally.click();
      tally.click();
      System.out.println(tally.getValue());
      tally.undo();
      System.out.println(tally.getValue());
      tally.undo();
      tally.undo();
      tally.undo();
      System.out.println(tally.getValue());
   }
}
