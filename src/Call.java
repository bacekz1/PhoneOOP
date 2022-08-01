public class Call {
    static double callPrice;
    private GSM caller;
    private GSM receiver;
    private int duration;

    Call(GSM caller, GSM receiver, int duration) {
        setCaller(caller);
        setReceiver(receiver);
        setDuration(duration);
    }

    private Call() {
    }

     GSM getCaller() {
        return caller;
    }

    void setCaller(GSM caller) {
        if (isNull(caller)) {
            System.out.println("Caller can`t be null");
        } else {
            this.caller = caller;
        }
    }

     GSM getReceiver() {
        return receiver;
    }

     void setReceiver(GSM receiver) {
        if (isNull(receiver)) {
            System.out.println("Receiver can`t be null");
        } else {
            this.receiver = receiver;
        }
    }

     int getDuration() {
        return duration;
    }

     void setDuration(int duration) {
        if (duration < 0) {
            System.out.println("Call duration should be positive");
        }
        this.duration = duration;
    }

    private boolean isNull(Object o) {
        return o == null;
    }
}
