export const isPalindrome = (a: any): boolean => {
  const _isPalindromeHelper = (str: string): boolean => {
    // console.log(str);
    if (str.length === 0 || str.length === 1) {
      return true;
    } else {
      return str.charAt(0) === str.charAt(str.length - 1) &&
        _isPalindromeHelper(str.substr(1, str.length - 2));
    }
  }

  return _isPalindromeHelper(String(a));
};
