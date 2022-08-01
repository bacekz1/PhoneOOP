
public class GSM {

    private String model;
    private boolean hasSimCard;
    private String simMobilNumber;
    private int outgoingCallDuration;
    private int lastIncomeCallDuration;
    private int lastOutgoingDuration;

    private Call[] calls;

    void insertSimCard(String simMobilNumber) {
        // 0 8 + more 8 digits
        if (!simMobilNumber.matches("[0][8][0-9]{8}")) {
            System.out.println("Invalid phone number");
        } else {
            this.simMobilNumber = simMobilNumber;
            this.hasSimCard = true;
        }
    }

    void removeSimCard() {
        this.hasSimCard = false;
    }

    void call(GSM receiver, int duration) {
        if (duration < 0) {
            System.out.println("Invalid call duration value");
        } else if (!receiver.hasSimCard) {
            System.out.println("Caller haven`t sim card");
        } else if (!this.hasSimCard) {
            System.out.println("Receiver haven`t sim card");
        } else if (receiver.simMobilNumber.equals(this.simMobilNumber)) {
            System.out.println("You can`t call to yourself");
        } else {
            lastOutgoingDuration = duration;
            outgoingCallDuration += duration;
            receiver.lastIncomeCallDuration = duration;
            Call caller = new Call(this, receiver, duration);
            Call receiver1 = new Call(receiver, this, duration);
            receiver.addCall(receiver1);
            addCall(caller);
        }
    }

    void printInfoForTheLastOutgoingCall() {
        System.out.println(lastOutgoingDuration);
    }

    void printInfoForTheLastIncomingCall() {
        System.out.println(this.lastIncomeCallDuration);
    }

    double getSumForCall() {
        return outgoingCallDuration * Call.callPrice;
    }

    //todo write implementation of ArrayList
    private void addCall(Call call) {
        if (isNull(call)) {
            System.out.println("call should`t be null");
        } else {
            System.out.println("Todo GSM class");
        }
    }

    private boolean isNull(Object o) {
        return o == null;
    }
}
