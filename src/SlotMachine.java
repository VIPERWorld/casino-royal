/**
 * Created by Willem Sherwood on 10/5/2016.
 */

class SlotMachine {
    private Slot[] slots;
    private final int _DEFAULTNUMBERSLOTS = 3;
    private final MaxSlots;
    private int currentBet = 0;
    private final Random _RANDOMGENERATOR;

    /**
     * Default Constructor the sets _MaxSlots to 3
     */
    public SlotMachine(){
        buildSlots( _DEFAULTNUMBERSLOTS );
    }

    public SlotMachine(int numOfSlots){
        buildSlots( numOfSlots );
    }

    //Test Constructor
    public SlotMachine(bool test){
        if( test ){
            buildSlots( _DEFAULTNUMBERSLOTS );
            
        }
    }

    public void spin(){

    }

    public void display(){

    }

    public void changeBet(int coins){
        if( coins < 0 ) {
            removeCoins(coins);
        }
        else{
            addCoins(coins);
        }
    }
    
    //--------------Private Methods-------------
    private void addCoins(int coins){
        currentBet += coins;
    }

    private void removeCoins(int coins){
        if( currentBet - coins < 0 ){
            currentBet = 0;
        }
        else{
            currentBet -= coins;
        }
	   
    }

    //-----------Slot Machine Factory------------

    private void buildSlots( int numSlots ){
        if( _MaxSlots != 0 ){
            System.err.println(this.toString() + "_MaxSlots has already been built!!!");
            return;                              //Break out of the function
        }

        _MaxSlots = numSlots;
        slots = new Slot[numSlots];

        for( int i = 0; i < numSlots; i++){
            
        }

    }
}
