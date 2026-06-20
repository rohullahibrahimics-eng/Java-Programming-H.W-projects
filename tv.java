package testcircle;
public class tv {
    int volum=5;
    int channel=5;
    boolean state=false;
    void turnOn(){
        state=true;
    }
    
    void turnOf(){
        state=false;
    }
    
   void setvolum(int volum){
       if(state ==true && volum>=0 && volum<50)
        this.volum=volum;
    }
   void setChannel(int channel){
        if(state ==true && channel>=0 && channel<10)
       this.channel=channel;
   }
   int getchannel(){
       return channel;
   }
     int getvolum(){
       return volum;
   }
    
}
