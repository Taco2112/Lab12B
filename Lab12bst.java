// Lab12bvst.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.



import java.util.ArrayList;

class Main {
 public static void main(String[] args)
	{   
    Deck deck = new Deck();
    System.out.println(deck);
	}
}


class Deck 
{
	private ArrayList<Card> cards;
	private int size;

	public Deck() 
  {
    size = 52;
		cards = new ArrayList<Card>();
	}    
	
	private void intializeDeck(){
	  String[] suits = {"Clubs","Hearts","Spades","Diamonds"};
	  String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
	  int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	  int index = 0;
	  
	  for(int t = 0; t < 4; t++){
	    for(int k = 0; k < 13; k++){
	      Card temp = new Card(suits[t],ranks[k],values[k]);
	      cards.add(temp);
	      index++;
	    }
	  }
	}
	
	public String toString(){
	  String deck = "";
    for(int t = 0; t < 52; t++){
      Card temp = (Card)cards.get(t);
      deck += temp.toString() + "\n";
    }
    return deck;
	}
}


// TO DO LIST
/*
in this lab i am going to have to complete the follwoing

-complete the constructor so that all 52 cards of a normal card deck are assigned to the cards array
- re-define the toString method for the Deck class so that it can be used to display the attribute values in a convenient manner
      Okay thats pretty much it
      THATS ALL YOU HAVE TO DO :D two things isn't that great.
      but wait...
  Make sure to take advantage of the toString method that already exists in the Card class
  YOU DONT HAVE TO BUT IT'S A GOOD THING TO DO :D
*/
//now lets get a job :D AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH 
//"LOOP THE ARRAY , PUT THE TO STRING IN , AND HOLD THAT SUCKKA "
