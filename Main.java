class Main {
  public static void main(String[] args) {
     runTests();
  }
  public void runTests(){
    // Here is an example test case
   String messageToEncode="here is a top secret message";
   String sampleEncoded="khuh lv d wrs vhfuhw phvvdjh";
   int shift =3;
   Cipher cipher= new Cipher(shift);
   String myEncodedResult = cipher.encode(messageToEncode);
   boolean encodeWorked = myEncodedResult.equals(sampleEncoded);
   System.out.println("Did encode work?"+ encodedWorked);
    
   String myDecodedResult = cipher.decode(sampleEncoded);
   boolean decodeWorked = myDecodedResult.equals(messageToEncode);
   System.out.println("Did decode work?"+ decodedWorked);
    

  // TODO: implement 3 more test cases, like the one above using inputs that handle the edge cases you've identified.
  }
  
   
}
