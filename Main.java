class Main {
  public static void main(String[] args) {
     runTests();
  }
  public static void runTests(){
    // Here is an example test case
   String messageToEncode="here is a top secret message";
   String sampleEncoded="khuh lv d wrs vhfuhw phvvdjh";
   int shift =3;
   String myEncodedResult = Cipher.encode(messageToEncode, shift);
   boolean encodeWorked = myEncodedResult.equals(sampleEncoded);
   System.out.println("Did encode work?"+ encodeWorked);
    
   String myDecodedResult = Cipher.decode(sampleEncoded,shift);
   boolean decodeWorked = myDecodedResult.equals(messageToEncode);
   System.out.println("Did decode work?"+ decodeWorked);
    

  // TODO: implement 3 more test cases, like the one above using inputs that handle the edge cases you've identified.
  }
  
   
}
