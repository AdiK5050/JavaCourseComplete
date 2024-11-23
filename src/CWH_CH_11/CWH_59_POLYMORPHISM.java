package CWH_CH_11;
//Taking reference of a smartphone again
interface GPS{
    void satelliteConnect();
    void searchLocation();
    void trackLocation();
}
interface GCam{
    void takesPhotos();
    void takesVideos();
}
interface Phone{
    void calls();
    void picksUp();
    void hangsUp();
}
interface allMedia extends GCam{
    void showsPhotos();
    void showsVideos();
}

//Implementing interfaces in a new class

class SmartPhoneRealme implements GPS , GCam , Phone , allMedia{
    public void satelliteConnect(){
        System.out.println("Connecting to satellite");
    }
    public void searchLocation(){
        System.out.println("Searcing...");
    }
    public void trackLocation(){
        System.out.println("Getting IP Address");
    }
    public void takesPhotos(){
        System.out.println("CHEESE!");
    }
    public void takesVideos(){
        System.out.println("YOU ARE BEING RECORDED");
    }
    public void calls(){
        System.out.println("Calling...");
    }
    public void picksUp(){
        System.out.println("Ongoing call");
    }
    public void hangsUp(){
        System.out.println("Call ended");
    }
    public void showsPhotos(){
        System.out.println("Showing photos taken");
    }
    public void showsVideos(){
        System.out.println("Playing videos");
    }
    public void myFiles(){
        System.out.println("Storage Info. calculating... ");
    }
}

public class CWH_59_POLYMORPHISM {
    public static void main(String[] args){

        //Showcasing Polymorphism
        SmartPhoneRealme Itismine = new SmartPhoneRealme();
        GPS gpsOnly = new SmartPhoneRealme();

        Itismine.trackLocation();
        Itismine.calls();
        //Here by using GPS as reference we restricted the class to use only methods of GPS
        //this is polymorphism
        gpsOnly.trackLocation();//Possible
        //gpsOnly.calls();//NOt Possible
        //gpsOnly.myFiles();//NOT Possible

    }
}
