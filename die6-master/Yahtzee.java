public class Yahtzee
{
  /**
   * Contains the current value of the die   */
  private int numberOfDice = 5;
  // dice array
  private Die6[] dice = new Die6[numberOfDice]; 

  /**
   * Constructor to do an initial roll to set the first value
   */
  public Yahtzee() {
    // iterate through the array and add dice
    for (int i = 0; i < numberOfDice; i++) {
        dice[i] = new Die6();
    }      
  }
  
  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll() {
    // iterate through the array and roll 5 dice one at a time
    for (int i = 0; i < numberOfDice; i++) {
        dice[i].roll();
    }      
  }

  /**
   * Roll the die! Generate random number 1 <= x <= 6 and assign to value
   * Note that roll does NOT return the new value
   */
  public void roll(int dieNumber) {
    // roll one die
    // make sure die number is in range
    if (dieNumber >= 1 && dieNumber <= numberOfDice) {
        dice[dieNumber-1].roll();
    }
  }
  
  /**
   * turn int values to string
   */
  public String toString() {
    // get 5 dice values in a new string
    String str = "Dice values: ";
    
    for (int i = 0; i < numberOfDice; i++) {
        int value = dice[i].getValue();
        str = str + String.valueOf(value) + " ";
    }
    
    return str;
  }
  
  /**
   *  Summarize the dice by the number of dice of each value 
   */
  public String summarize() {

    int numberOfSides = 6;
    int count[] = new int[numberOfSides];
    String str = new String();
    
    // count the number of values
    for (int i = 0; i < numberOfDice; i++) {
        int value = dice[i].getValue();
        
        if (value == 1) {
            count[0]++;
        } else if(value == 2) {
            count[1]++;
        } else if (value == 3) {
            count[2]++;
        } else if (value == 4) {
            count[3]++;
        } else if (value == 5) {
            count[4]++;            
        } else if (value == 6) {
            count[5]++;
        }        
    }
   
    // print out the count in the summarize format
    for (int i = 0; i < numberOfSides; i++) {
        String stringValues = String.valueOf(i + 1) + "-" + String.valueOf(count[i]);
        // include "; " except for last item
        if(i < numberOfSides -1) {
            stringValues = stringValues + "; ";
        }
        
        // combine result
        str = str + stringValues;
    } 
    return str;
  } 
}
