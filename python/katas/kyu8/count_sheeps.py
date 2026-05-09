""" 
Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

For example,

[True,  True,  True,  False,
  True,  True,  True,  True ,
  True,  False, True,  False,
  True,  False, False, True ,
  True,  True,  True,  True ,
  False, False, True,  True]

The correct answer would be 17.

Hint: Don't forget to check for bad values like null/undefined
"""

sheeps = [True, False, False, True, True, True, False]

def count_sheeps(sheep):
    counter = 0
    for sheeps in sheep:
        if sheeps == True:
            counter += 1
    return counter

print(count_sheeps(sheeps))

"""  
============================================================================
 NOTES
 Another form of complete the exercise is:  return arrayOfSheeps.count(True)
 ============================================================================ 
 """