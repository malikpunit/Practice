class EvenlySpaced{

  //https://codingbat.com/prob/p198700
  public boolean evenlySpaced(int a, int b, int c) {
  //1. sort them
  //2. check diff(medium-small) == (large-medium)
  
  if(a>=b){
    if(a>=c){
      if(b>=c){
        //a>b>c
        return checkEvenlySpacedSorted(a,b,c);
      } else{
        //a>c>b
        return checkEvenlySpacedSorted(a,c,b);
      }
      
    } else{
      //c>a>b
      return checkEvenlySpacedSorted(c,a,b);
    }
  } else {
    if(b>=c){
      if(a>=c){
        //b>a>c
        return checkEvenlySpacedSorted(b,a,c);
        
      } else{
        //b>c>a
        
        return checkEvenlySpacedSorted(b,c,a);
      }
    } else{
      //c>b>a
      return checkEvenlySpacedSorted(c,b,a);
    }
  }
}  

private boolean checkEvenlySpacedSorted(int a, int b, int c){
  return (a-b)==(b-c);
}

}
