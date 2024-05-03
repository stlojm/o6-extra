def sort_anagrams(arr):
    anagrams = {}
    for word in arr:
        sorted_word = ''.join(sorted(word))
        if sorted_word in anagrams:
            anagrams[sorted_word].append(word)
        else:
            anagrams[sorted_word] = [word]
    
    sorted_arr = []
    for key in sorted(anagrams.keys()):
        sorted_arr.extend(anagrams[key])
    
    return sorted_arr

# Example usage
arr = ["cat", "dog", "act", "god", "tac"]
result = sort_anagrams(arr)
print(result)
 // time complexity O(nlogn)
  //The space complexity is O(n)
