
/**
 *
 * @author Adeyemi Ademola
 */
import java.util.Scanner;
public class Sudoku {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sudoku myGame = new Sudoku();
        myGame.checkAnswer();
        // TODO code application logic here
        

        //Creating a scanner object
    }
    public void checkAnswer()
    {
        Scanner input = new Scanner(System.in);
                
        int[][] ourArray = new int[9][9];
        
        //Parent Loop for obtaining, storing value and performing logic   
        for(int i = 0; i < ourArray.length; ++i)
        {
            //a new array that holds a copy of the 9 elements in the initial array(ourArray) elements
            int[] count = new int[10];  
            
            System.out.printf("Enter the nine elements of row %d%n", i);
            
            //Nexted loop which holds value for the 9 columns in a row 
            for( int j = 0; j < ourArray[i].length; ++j)
            {
                //Stores elements which playes input from the keyboard          
                ourArray[i][j] = input.nextInt(); 
                
                //condition to check if element entered is > 0 and <=9
                if(ourArray[i][j] > 0 && ourArray[i][j] <= 9)
                {
                    //counter that records occurence
                    count[ourArray[i][j]]++;
                    
                    //nexted condition for checking the number of times an element occurred
                    if (count[ourArray[i][j]] > 1)
                    {

                        System.out.printf("We've seen %d  before", ourArray[i][j]);
                         --j;
                        System.out.println();
                        System.out.println("Enter a different digit");               
                    }
                                                         
                    
                }
                else
                    {
                        System.out.println("Enter a digit between 0 and 10 excluding 0 and 10");
                        --j;
                        
                    }
                }
            System.out.println();
            
            //nexted loop for printing result
            for(int a = 0; a < ourArray.length; ++a)
            {
                for(int b = 0; b < ourArray[a].length; ++b)
                {
                    System.out.printf("%4d", ourArray[a][b]);
                }
                        System.out.println();
            }
		System.out.println();
            
            //check if the 3 by 3 matrice has numbers 1 to 9
            if(i == 8)
            {
                System.out.println("You failed. Try again");
            }
                
                
        }
                           
            
                
    }
           
} 

  
    

