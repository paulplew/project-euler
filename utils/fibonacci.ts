import { NumberMap } from "./interfaces"

/**
 * Computes the nth fibonacci term using a dynamic programming table.
 * 
 * @param  {number | bigint} num the number fibonacci to compute
 * @returns {bigint} the value of the nth fibonacci
 */
export const fibonacci = (num: number | bigint): bigint => {
  /**
   * The table that stores the previous fibonaccis
   * @private
   */
  const _table: NumberMap = {}

  
  /**
   * A helper for computing the nth fibonacci term.
   * @private
   * 
   * @param  {bigint} n the nth fibonacci to compute
   * @returns {number} the value of the nth fibonacci
   */
  const _f = (n: bigint): bigint => {
    if (_table[n.toString()]) {
      return _table[n.toString()];
    } else if (n === 0n || n === 1n) {
      _table[n.toString()] = 1n;
      return _table[n.toString()];
    } else {
      _table[n.toString()] = _f(n - 1n) + _f(n - 2n);
      return _table[n.toString()];
    }
  }

  return _f(BigInt(num))
}
