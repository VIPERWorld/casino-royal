
/**
 * Created by Willem Sherwood on 10/5/2016.
 */
class SlotMachine {
    private Slot[] slots;
    private final int _DEFAULTNUMBERSLOTS = 3;
    private int _MaxSlots = 0;
    private int currentBet = 0;

    /**
     * Default Constructor the sets _MaxSlots to 3
     */
    public SlotMachine(){
        buildSlots( _DEFAULTNUMBERSLOTS );
    }

    public SlotMachine(int numOfSlots ){
        buildSlots( numOfSlots );
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

    private void addCoins(int coins){
        currentBet += coins;
    }

    private void removeCoins(int coins){
        currentBet -= coins;
    }

    //-----------Slot Machine Factory------------

    private void buildSlots( int numSlots ){
        if( _MaxSlots != 0 ){
            System.err.println(this.toString() + "_MaxSlots has already been built!!!");
            return;                             //Break out of the function
        }

        _MaxSlots = numSlots;
        slots = new Slot[numSlots];

        for( int i = 0; i < numSlots; i++)
        {

        }

    }
}
