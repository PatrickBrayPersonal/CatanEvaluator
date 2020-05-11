public class CatanSpot{
  private int ID;
  private CatanTile[] borderTiles = new CatanTile[3];
  private CatanSpot[] borderSpots = new CatanSpot[3];
  //private int tileBorderCount;
  private CatanPort port;
  private double QSP;
  private int feature;
  private int owner;


  CatanSpot(int ID){
    this.ID = ID;
  }
  public void setID(int a){
    ID = a;
  }
  public int getID(){
    return ID;
  }
  public void setBorderTiles(CatanTile[] a){
    borderTiles = a;
  }
  public CatanTile[] getBorderTiles(){
    return borderTiles;
  }
  public void setBorderSpots(CatanSpot[] a){
    borderSpots = a;
  }
  public CatanSpot[] getBorderSpots(){
    return borderSpots;
  }
  public void setQSP(double a){
    QSP = a;
  }
  public double getQSP(){
    return QSP;
  }
  public void setPort(CatanPort a){
    port = a;
  }
  public CatanPort getPort(){
    return port;
  }
  public int getFeature(){
    return feature;
  }
  public void setFeature(int a){
    feature = a;
  }
  public int getOwner(){
    return owner;
  }
  public void setOwnder(int a){
    owner = a;
  }
}
