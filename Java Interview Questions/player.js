function rounds_won(results){
    let pOne=0;
    let pTwo=0;
    for(let res in results){
        if(res==1)
            pOne+=1;
        else
            pTwo+=1;
    }
    if(pOne>=pTwo){
        return pOne;
    }
    else{
        return pTwo;
    }
}
