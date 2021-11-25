import { NumberMap } from "./interfaces";

// used to compute the factorial of a given number num
export const factorial = (num: number): number => {
  // empty object for DP 
  const _table: NumberMap = {};
  
  const _f = (n: number): number => {
    if (_table[n]) {
      return _table[n];
    } else if (n === 0) {
      _table[n] = 1;
      return 1;
    } else {
      _table[n] = n * _f(n - 1);
      return _table[n];
    }
  }

  return _f(num)
}

