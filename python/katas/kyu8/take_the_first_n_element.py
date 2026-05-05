""" 
Create a function that accepts a list/array and a number n, and returns a list/array of the first n elements from the list/array.
If you need help, here's a reference:
https://docs.python.org/3/library/stdtypes.html#sequence-types-list-tuple-range 
"""

test = [1, 2, 3, 5, 8, 13]

def take(arr, n):
    element = []
    for i in range(min(n, len(arr))):
        element.append(arr[i])
    return element

print(take(test, 3))
        
