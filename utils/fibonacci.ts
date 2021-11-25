import { NumberMap } from "./interfaces"

// computes the nth fibonacci term using DP
export const fibonacci = (num: number): number => {
  const _table: NumberMap = {}

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
