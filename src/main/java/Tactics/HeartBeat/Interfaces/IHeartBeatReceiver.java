package Tactics.HeartBeat.Interfaces;

public interface IHeartBeatReceiver extends IHeartBeatReceiverForSender {

    void start(); //start operation
    void stop();  //cease operation
    void notifyFault(); //notifies to the class for which it is monitoring that a fault has occured in the sender

    public interface IFaultMonitor{
        public void faultDetected();
    }
}
