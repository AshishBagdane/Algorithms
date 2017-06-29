package algorithms.bitmanipulation;

public class BitManipulator {
    
    public int leftShift(int number, int places) {
        return number << places;
    }
    
    public int rightShift(int number, int places) {
        return number >> places;
    }
    
    public int setBit(int number, int position) {
        int mask = 1 << position;
        return number | mask;
    }
    
    public int clearBit(int number, int position) {
        int mask = 1 << position;
        return number & ~mask;
    }
    
    public int flipBit(int number, int position) {
        int mask = 1 << position;
        return number ^ mask;
    }
    
    public boolean isBitSet(int number, int position) {
        int mask = 1 << position;
        return (number & mask) != 0;
    }
    
    public int modifyBit(int number, int position, int state) {
        int mask = 1 << position;
        return (number & ~mask) | (-state & mask);
    }
    
    public boolean isEven(int number) {
        return (number & 1) == 0;
    }
    
    public boolean isPowerofTwo(int number) {
        return (number & (number - 1)) == 0;
    }
    
    public int countSetBits(int number) {
        int count = 0;
        while(number != 0) {
            number &= number - 1;
            count++;
        }
        return count;
    }
}
