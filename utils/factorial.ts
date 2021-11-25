/**
 * Computes the factorial of the given number
 * 
 * @param  {number} num the number to be factorialized
 * @returns {number} the factorial of the given number
 */
export const factorial = (num: number): number => {
  /**
   * A helper for computing the factorial of a number
   * 
   * @param  {number} n the number to be factorialized
   * @returns {number} the factorial of the given number
   */
  const _factorialHelper = (n: number): number => {
    if (n === 0) {
      return 1;
    } else {
      return n * _factorialHelper(n - 1);
    }
  }

  return _factorialHelper(num)
}

