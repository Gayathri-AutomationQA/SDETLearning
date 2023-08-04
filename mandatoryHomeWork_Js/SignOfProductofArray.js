/**
 * @param {number[]} nums
 * @return {number}
 */
var arraySign = function(nums) {

    let negFlag = false;
    for(let element of nums){
        if(element < 0)  negFlag = !negFlag;
        if(element===0)  return 0;                
    }

    return  (negFlag) ? -1:1;
}