import { NumberMap } from "./interfaces"

/**
 * Computes the nth fibonacci term using a dynamic programming table.
 * 
 * @param  {number} num the number fibonacci to compute
 * @returns {number} the value of the nth fibonacci
 */
export const fibonacci = (num: number): number => {
  /**
   * The table that stores the previous fibonaccis
   * @private
   */
  const _table: NumberMap = {}

  
  /**
   * A helper for computing the nth fibonacci term.
   * @private
   * 
   * @param  {number} n the nth fibonacci to compute
   * @returns {number} the value of the nth fibonacci
   */
  const _f = (n: number): number => {
    if (_table[n]) {
      return _table[n];
    } else if (n === 0 || n === 1) {
      _table[n] = 1;
      return _table[n];
    } else {
      _table[n] = _f(n - 1) + _f(n - 2);
      return _table[n];
    }
  }

  return _f(num)
}
