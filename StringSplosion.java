class StringSplosion{
  //https://codingbat.com/prob/p117334
public String stringSplosion(String str) {
  int len = str.length();
  String exploded = "";
  String substring = "";
  for(int i = 0; i < len; i++){
    substring += str.charAt(i);
    exploded += (substring);
  }
  return exploded;
}
}
