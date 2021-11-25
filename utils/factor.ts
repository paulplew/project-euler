/**
 * Factors the number into it's prime factorization.
 * 
 * @param  {number} n the number to be factored
 * @returns {number[]} an array of the factors of the given number
 */
export const factor = (n: number): number[] => {
  /**
   * A helper for {@link factor} that stores the factors so far.
   * @private
   * 
   * @param  {number} n the number to be factored
   * @param  {number[]} soFar the factors so far
   * @returns {number[]} a list of the factors of the remaining n
   */
  const _factorHelper = (n: number, soFar: number[]): number[] => {
    if (n % 2 === 0) {
      soFar.push(2);
      return _factorHelper(n / 2, soFar);
    } 

  }
  
  return [];
}