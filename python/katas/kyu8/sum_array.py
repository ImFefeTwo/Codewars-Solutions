
"""
Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative. If the array is empty, return 0.
Examples

Input: [1, 5.2, 4, 0, -1]
Output: 9.2

Input: [-2.398]
Output: -2.398

Input: []
Output: 0
Assumptions

You can assume that you are given a (possibly empty) valid array containing only numbers.

What We're Testing

We're testing basic loops and math operations. This is for beginners who are just learning loops and math operations.
Advanced users may find this extremely easy and can easily write this in one line. 
"""

my_array = [10, 20, 60]

def sum_array(list):
    sum = 0
    for item in list:
        sum += item
    return sum


print(sum_array(my_array))

"""  
============================================================================
 NOTES
 In this exercise I am shadowing the sum() and list() function. A more efficient solution could be: 
 def sum_array(a):
    return sum(a)
 ============================================================================ 
 """


