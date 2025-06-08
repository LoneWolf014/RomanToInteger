# RomanToInteger

>> This is a java program that converts Roman Number to Integer Number...
>> HOW THIS WORKS:
>>   1. Basically there is a trick for roman number which is -> the numbers are based on addition and subtraction.
>>   2. if the left number is less than right number then it will subtract the right number with left number.
>>          (e.g.: iv -> i, v ->
>>                  i < v ->
>>                  v - i ->
>>                  5 - 1 -> 4 =>
>>                  iv = 4)
>>   3. Similarly if the left number is greater than right number then it will add both.
>>   4. if both left and right numbers are equal then also it will add.
>>   5. Therefore, we need to check a condition: if(left<right): subtract else: add
>>   6. but before we check the condition we need to realize that the input roman number we get is a string... so we need to check each character in the string
>>   7. First... we will get an input string in the main function... this input string 'Roman' will be passed to the function ConvRom2Num.
>>   8. Inside Function ConvRom2Num, it will convert the string to lowercase to avoid case errors since we dealing with switch case.
>>   9. it will run a loop to traverse the string from right to left and take each character from the string (we can also do left to right... i find right to left convenient while learning this program from chatGPT).
>>   10. Inside this loop we first call the ConvChar2Num function to get the roman number for each character.
>>   11. this function converts each character to it's respective number using a switch case and returns the integer.
>>   12. the returned integer will be stored in the variable 'curr'.
>>   13. it will start comparing the previous number to the current number and do the addition/subtraction operation.
          (>> e.g.: vii - [v, i, i] => traverse from right to left which means [i, i, v]
           >>  curr = ConvChar2Num(i) => curr = 1; prev = 0; num = 0
           >>  if(curr < prev) - false; else - num+=curr => num = 1; prev = curr => prev = 1
--
           >>  curr = ConvChar2Num(i) => curr = 1; prev = 1; num = 1
           >>  if(curr < prev) - false; else - num+=curr => num = 2; prev = curr => prev = 1
--
           >>  curr = ConvChar2Num(v) => curr = 5; prev = 1; num = 2
           >>  if(curr < prev) - false; else - num+=curr => num = 7 )
>>   14. Then it will return the 'num' back to the main function which will be stored in 'Number'. and print in the output.
