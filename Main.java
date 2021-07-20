class Main {
  public static void main(String[] args) {
   String messageToEncode="here is a top secret message";
   String sampleEncoded="khuh lv d wrs vhfuhw phvvdjh";
   int shift =3;
   Cipher cipher= new Cipher(shift);
   System.out.println("Did it work?"+cipher.encode(messageToEncode).equals(sampleEncoded));

    // Bonus Followup Problem1 might want to add code here

  }
   
}
