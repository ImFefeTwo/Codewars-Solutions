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