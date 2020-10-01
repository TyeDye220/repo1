package cse360assignment02;
/**
 * This is a machine that will add or subtract to/from a total
 * @author Tyler
 *
 */
public class AddingMachine {
	/**
	 * This is the total
	 */
  private int total;
  /**
   * This keeps track of the history of the events
   */
  private String history;
  
  /**
   * Creates a new AddingMachine with a total of 0
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = total + "";
  }
  
  /**
   * This method gets the total
   * @return total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * This method adds the parameter to the total variable
   * @param value
   */
  public void add (int value) {
	  total += value;
	  history += " + " + value;
  }

  /**
   * This method subtracts the parameter from the total variable
   * @param value
   */
  public void subtract (int value) {
	  total -= value;
	  history += " - " + value;
  }

  /**
   * This returns the history of the actions
   * @return history
   */
  public String toString () {
    return history;
  }

  /**
   * This method clears
   */
  public void clear() {
	  total = 0;
	  history = total + "";
  }
}