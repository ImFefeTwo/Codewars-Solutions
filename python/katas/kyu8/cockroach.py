""" The cockroach is one of the fastest insects. Write a function which takes its speed in km per hour and returns it in cm per second, rounded down to the integer (= floored). 
For example: 1.08 --> 30

Note! The input is a Real number (actual type is language dependent) and is >= 0. The result should be an Integer.
"""

def cockroach_speed(s):
    return int(s / 0.036)

print(cockroach_speed(1.08))

"""  
============================================================================
 NOTES
 "0.036" is a magic number. Could be improved by declaring a constant.
 Example: KM_H_TO_CM_S = 0.036
 return int(s / KM_H_TO_CM_S)
 In addition, we can use math.floor for explicit rounding down.
 return math.floor(s / KM_H_TO_CM_S)
 ============================================================================ 
 """