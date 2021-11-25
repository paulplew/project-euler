/**
 * A helper for the {@link range} that stores the values so far.
 * 
 * @param  {number} start the starting value for the range
 * @param  {number} end the ending value for the range
 * @param  {number[]} soFar the values that have been stored so far
 * @returns {number[]} an array that is the range from start to the end inclusive
 */
const rangeHelper = (start: number, end: number, soFar: number[]): number[] => {
  if (start > end) {
    return soFar;
  } else {
    soFar.push(start);
    return rangeHelper(start + 1, end, soFar)
  }
}
/**
 * Generates a range from some starting value to some ending value, inclusively.
 * 
 * @param  {number} start the starting value for the range
 * @param  {number} end the ending value for the range
 * @returns {number[]} an array that is the range from start to end inclusive
 */
export const range = (start: number, end: number): number[] => {
  return rangeHelper(start, end, []);
}
