class Test {
  public static void main(String[] args) {
   String messageToEncode=args[0];
   int shift =(int)(args[0]);
   Cipher cipher= new Cipher(shift);
   System.out.println(cipher.encode(messageToEncode));
  }
}
