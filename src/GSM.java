
public class GSM {

    String model;
    boolean hasSimCard;
    String simMobilNumber;
    int outgoingCallDuration;
    int lastIncomeCallDuration;
    int lastOutgoingDuration;

    void insertSimCard(String simMobilNumber) {
        // 0 8 + more 8 digits
        if (!simMobilNumber.matches("[0][8][0-9]{8}")) {
            System.out.println("Invalid phone number");
        } else {
            this.simMobilNumber = simMobilNumber;
            hasSimCard = true;
        }
    }

    void removeSimCard() {
        hasSimCard = false;
    }

    void call(GSM receiver, int duration) {

        if (duration < 0) {
            System.out.println("Invalid call duration value");
        } else if (!receiver.hasSimCard || !hasSimCard) {
            System.out.println("Caller or receiver haven`t sim card");
        } else if (receiver.simMobilNumber.equals(simMobilNumber)) {
            System.out.println("You can`t call to yourself.");
        } else {
            lastOutgoingDuration = duration;
            outgoingCallDuration += duration;
            receiver.lastIncomeCallDuration = duration;
        }
    }

    double getSumForCall()
    {
        return outgoingCallDuration * Call.callPrice;
    }
}
