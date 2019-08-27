public class XO {

  public static boolean getXO (String str) {
    str = str.toLowerCase();
    int counterX = 0;
    int counterO = 0;
    boolean found = false;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i)=='o'){
        counterO++;
      }
      else if(str.charAt(i)=='x'){
        counterX++;
      }
    }
    if(counterX==counterO){
      found = true;
    }
    else{
      found = false;
    }
    return found;
  }
}
