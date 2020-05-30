class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexes = new ArrayList<>();

  if (s == null || p == null || s.length() < p.length()) {
    return indexes;
  }
  Map<Character, Integer> map = new HashMap<>();
  for (int i = 0; i < p.length(); i++) {
    char ch = p.charAt(i);
    map.put(ch, map.getOrDefault(ch, 0) + 1);
  }

  int start = 0, diff = p.length();

  for (int i = 0; i < s.length(); i++) {
    if (i >= p.length()) {
      char firstChar = s.charAt(start);

      if (map.get(firstChar) >= 0) {
        diff++;
      }

      map.put(firstChar, map.getOrDefault(firstChar, 0) + 1);
      start++;
    }

    char ch = s.charAt(i);

    map.put(ch, map.getOrDefault(ch, 0) - 1);
    if (map.get(ch) >= 0) {
      diff--;
    }

    if (diff == 0) {
      indexes.add(start);
    }
  }

  return indexes;
    }
}