/**
 * Created by Willem Sherwood on 10/5/2016.
 */
import java.util.Random;

class SlotMachine {
    private Slot[] slots;
    private final int _DEFAULTNUMBERSLOTS = 3;
    private final int _MaxSlots;
    private int currentBet = 0;
    private Random _RandomGenerator;

    /**
     * Default Constructor the sets _MaxSlots to 3
     */
    public SlotMachine(){
        _MaxSlots = _DEFAULTNUMBERSLOTS;
        buildSlots( _MaxSlots );
    }

    public SlotMachine(int numOfSlots){
        _MaxSlots = numOfSlots;
        buildSlots( _MaxSlots );
    }

    //Test Constructor
    public SlotMachine(boolean test){
        if( test ){
            _MaxSlots = _DEFAULTNUMBERSLOTS;

        }
        else{
            _MaxSlots = 0;
        }
        buildSlots( _MaxSlots );
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

    @Override
    public String toString(){
        StringBuilder sB = new StringBuilder();
        sB.append("Slot Machine: \n");

        for (Slot s:slots) {
            sB.append(s.toString()).append("\n");
        }
        return sB.toString();
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

    ///////-----------Slot Machine Factory------------

    private void buildSlots( int numSlots ){
        if( _MaxSlots != 0 ){
            System.err.println(" _MaxSlots has already been built!!!\n\n");
            //Break out of the function
        }

        slots = new Slot[numSlots];
        _RandomGenerator= new Random(0);

        for( int i = 0; i < numSlots; i++){
            slots[i] = new Slot(_RandomGenerator);
        }

    }
}
