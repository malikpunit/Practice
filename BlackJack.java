class BlackJack{

// https://codingbat.com/prob/p117019

public int blackjack(int a, int b) {
  /*
  diffa = 21 -a;
  diffb = 21 -b;
  
  if diffa<0 and diffb<0 return 0;
  
  if diffa>0 and diffa<diffb diffa; else diffb;
  
  
  */
  int diffa = (21 - a);
  int diffb = (21 - b);
  
  if(diffa < 0 && diffb < 0) return 0;
  
  
  if((diffa >= 0) && (diffa <= diffb)){
    return a;
  } else {
    if(diffb<0){
      return a;
    }
    return b;
  }
  
}


}
