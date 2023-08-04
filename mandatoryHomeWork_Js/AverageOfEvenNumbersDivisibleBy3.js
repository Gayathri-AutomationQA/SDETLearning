/**
 * @param {number[]} nums
 * @return {number}
 */
var averageValue = function(nums) {
  nums = nums.filter(a=>a%6=== 0)
  return nums.length>0 ? parseInt(nums.reduce((a,b) => a + b)/nums.length) : 0;
};