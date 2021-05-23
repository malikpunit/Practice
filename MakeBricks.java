class MakeBricks{

//https://codingbat.com/prob/p183562
public boolean makeBricks(int small, int big, int goal) {
  int requiredBig = goal/5;
  
  /*
  if neededBig <=availableBig
  
    goal4Small=goal-(neededBig*5) 
  
    (small-goal4Small)>=0 return true; else false;
  
  else 
    goal4Small=goal-(availableBig*5) 
  
    (small-goal4Small)>=0 return true; else false;
  */
  
  if(requiredBig>big){
    requiredBig = big;
  }
  
  int goal4Small = goal - (requiredBig*5);
  
  return (small-goal4Small)>=0?true:false;
  
}

}
