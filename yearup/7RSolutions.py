""" 
SCROLL PAST THE REFERENCE GUIDE TO SEE THE PROBLEM SOLUTIONS
"""

def Reference():
	# Here I'm going to try and give you a reference to as much shit as I can
	# Like this, use a '#' to comment out code. Comments are not run by the computer
	def variables():
		# Variables are literoo, they store data that you can do shit with
		# You can name them whatever, maybe not with certain characters. Keep the name relevant
		demo_int = 4 # Int or integer
		demo_float = 3.6 # A float, floating point number, anything with a decimal
		demo_char = 'a' # A single character
		demo_string = 'Strings can have numbers too look 1434124' # a string is text wrapped in ' ' or " "
		demo_list = [1, 2, 3, 4, 'whack', 6] # Lists store other data inside itself
		demo_dictionary = {"these":4, "are":3.2, "keys":'daddy'}
		# Where a list stores data with an index (0, 1, 2, ... , length-1)
		# Dictionaries store data with 'keys.' I'll demostrate later
		demo_boolean = True # boolean's are either true or false
		demo_boolean = False # This changes the value of demo_boolean from true to false
		# True and False need a capital first letter in python
		# You can change the value of any data type, not just boolean, with few exceptions

	def operations():
		# You can do basic operations to data (variables and raw data)
		demo_add = 3 + 3 # sets demo_add == 6
		demo_mod = 4 % 2 # sets demo_mod == 0 (the remainder of 4 / 2)
		# Other operatiosn: x / y (divide), x * y (multiply), x ** y (Raises x to the power of y)
		# Parenthesis work too. (4 + 2) == 4 + 2 == 6. Don't forget PEMDAS

	def comparison():
		# Super important, comparisons resolve as either True or False
		4 == 4 # Returns true if the left equals the right
		'test' == 'test' # Works with strings and other data types
		2 >= 12 # "Greater than or equal to," in this case false
		1 <= 4 # "Less than or equal to." in this case true
		6 < 18 # Less than
		18 > 4 # Greater than
		18 != 'mano' # Not equal to, returns True if the two sides are unequal
		# You can use variables in place of any of those

	def logics():
		# Not sure of a good word for this, but these will help you handle your logicking
		boolean_input = True
		# if/else/elif
		if boolean_input:
			# If boolean_input (or whatever between 'if' and the colon) resolves to True
			# Executes whatever is in here
		elif not boolean_input: # keyword 'not' flips the boolean from True to False or False to True
			# If the if statement is false, it goes to the next elif (short for else if)
			# Does the same thing as an if statement. But you don't need to have an elif
			# You can have as many of these as you want
		else:
			# If nothing from any if or elif checks is True, executes this
			# You don't need an else statement, but you can't have more tha one

		# loops
		while boolean_input: # Called a While loop, believe it or not
			# Executes these repeatedly until the parameter is no longer true
			# Be careful with this one, because nothing is changing boolean_input to False...
			# This would be an infinite loop, unless we use:
			break # 'break' halts whatever loop it's in as soon as it gets to it

		for i in range(0,4): # This is a for loop
			# For loops only work for things than can be iterated over
			# Like a while loops, it executes whatever is in this block
			# In this case, range(0,4) return the list
			# [0, 1, 2, 3]
			# This for loop iterates over this list. So i == 0, then 1, then 2, then 3
		for char in "sos":
			# In this case, the string is iterable. It goes character by character
			# So char == 's', then 'o', then 's' again 


	def splicing():
		# This requires its own section super useful shit
		# Splicing works for strings, dictionaries, and lists, maybe a few others
		demo_string = 'Hey NiBBers'
		# Remember in splicing we start counting from 0 instead of one
		demo_string[0] == 'H' # This is true because position 0 (first position) of demo_string is H
		demo_string[2] == 'y' # Position 2 (third position) of 'Hey Nibbers' is y
		# Some neato tricks (this works in python, but not all languages)
		demo_string[-1] == 's' # -1 is the LAST position, it starts counting backwards!!
		demo_string[0:2] == 'He' # demo_string[start:end] to but not including the end index
		# Works for lists in a similar way
		demo_list == [1, 2, 3, 4, 'different than whack', 18]
		demo_list[1] == 2 # Remember, the first position is 0
		demo_list[4] == 'different than whack' # because this string is at the 4th index
		demo_list[4][2:4] == 'ff' # This prints the 2nd-4th index of the 4th entry of demo_list
		# Dictionaries are a little different. They use keys instead of an index
		demo_dict = {"this":4, "a":5, "key":'wow! :O', 3:"sick"} # The key is left of the colon, the entry is the right
		demo_dict["this"] == 4 # You call the key instead of an index
		demo_dict[3] == "sick" # You don't have to use a string as a key

	def functions(InputA, Input2):
		# Functions are dope if you ever have a process that you have to do more than once
		# You write the instruction in the function once, and make the function do the work
		def add(a, b): # Here's an example function, a and b are your parameters
			# We want it to add a and b together
			# I usually comment what my function does right here too
			return a + b # returns the sum!
			# Return STOPS the function and gives the function a value
		demo_var = add(3, 122) # now demo_var == 125, crazy!!

		# But if we don't use return
		def b_add(a, b):
			a + b

		demo_var = b_add(122, 3) # this gives us an error, because b_add(a, b) doesn't return anything!

		# Functions have a feature called scoping
		# Things created inside of a function only exist inside of the function
		# Functions don't have access to anything outside unless it is passed in through the parameters
		shit_tits = 20
		def black_box(): # I called it black box because functions are kind of a black box
			shit_tits += 5 # this throws an error because shit_tits doesn't exist here!
			# Can't add 5 to NULL
		def box_black():
			shit_tits = 0 # Here we create it inside the function
			shit_tits += 5 # now shit_tits is 5

		shit_tits == 20 # This remains true, because what happened inside box_black didn't effect this version of shit_tits

	def some_built_in_functions():
		# Here are some things built in to python that are super useful
		print("dick") # prints "dick" on the screen. You can also use variables and shit
		# Print is the holy fucking grail of python. It is so useful for debugging
		# If you want to find out how something works, throw some print statements around!
		len("string or list or whatever") # Prints the length of the input.
		# Either the number of characters in a string, or entries in a list/dictionary
		range(0, 10) # range(start, stop) Usually used in loops, returns a list of numbers between start and stop
		range(0, 10, 2) # range(start, stop, step) has an option parameter!!
		# Returns list of every number from 0-10 going 2 at a time
		str(4) == '4' # Takes the input and turns it into a string (str)
		int('5') == 5 # Tries to turn the input into an int
		# And more of those data changing types		


# I'm wrapping all the solutions in a FUNCTION so they aren't automatically run
# You can run the solutions individually
# Remember these are just my solutions, not THE solution. You might have a better way of doing it
# For instructions on running a problem, scroll to the bottom

def Problem1(x):
	# Print all even numbers between 0 and x, where x is a positive or negative int

	# In this case, x can be positive or negative so we have to compensate
	i = 0 # Initialize our counter, we can call it anything we want
	while i <= x: # We want it to start at 0 and stop at x if it's even
		print(i) 
		if x >= 0: # Increses i by 2 if it's going toward a positive numeber, or
			i += 2
		else: # Decreses i by 2 if it's going toward a negative number
			i -=2

def Problem2A(x):
	# If integer x is odd, print true. If even, print false

	# There are two ways to solve this problem
	# We're gonna use the % (modulo or mod).
	# % divides the first number by the second, but gives the REMAINDER
	# So 10 % 3 == 1, 4 % 2 == 0, 5 % 3 == 2, etc
	if x % 2 == 0: # Basically checking if x divides evenly by 2
		print('false') # If it does, then it's even. But we're checking for odds!
	else:
		print('true') # If it doesn't divide by 2, then it is odd

def Problem2B(x):
	# Another shorter, faster, but uglier way to do the same problem
	print(x % 2 == 1)
	# If x is odd, then x % 2 is 1. (1 == 1) returns true, and thus print true
	# If x is even, then x % 2 is 0. (0 == 1) returns false, thus prints false

	# Later on it might be a good idea to find a way to handle if x has a decimal

def Problem3(dna_sequence):
	# Counts the numbers of A's, C's, T's, and G's in dna_sequence and prints

	# First we want to be able to iterate from start to finish of dna_sequence
	# But we can't guaruntee how long it is! So we're going to use len(<string>)
	# What len() does is returns the LENGTH of a string (and some other data types)
	
	### SOME IMPORTANT CONTEXT ###
	# In programming languages, we start counting at 0
	# We're gonna use a technique called string splicing
	# Let's pretend dna_sequence == 'ACTG'
	# In this case dna_sequence[0] returns the FIRST character, which is 'A'
	# dna_sequence[1] returns the second, etc
	# So in this case:
	# dna_sequence[0] == 'A'
	# dna_sequence[1] == 'C'
	# dna_sequence[2] == 'G'
	# dna_sequence[3] == 'T'
	# but dna_sequence[4] gives us an ERROR, because it goes longer than the length of the string
	# because of that, we have to stop one before the length of the string, not at it
	i = 0 # Init our loop counter
	# we're also going to initialize our letter counters!
	countA = 0
	countC = 0
	countT = 0
	countG = 0
	while i < len(dna_sequence): # while i is between 0 and len(dna_sequence)-1:
		if dna_sequence[i] == 'A': 
			# checks if dna_sequence at the current position is the letter A
			countA += 1 # and if it is, increase countA
		elif dna_sequence[i] == 'C':
			# and repeat for all the letters
			countC += 1
		elif dna_sequence[i] == 'T':
			# this method is tedious to write, but there's a better way to do it
			countT += 1
		elif dna_sequence[i] == 'G':
			countG += 1
		else:
			# Just in case a lose character found it's way into the string
			print("This isn't dna bitch")
		i += 1 # make sure you increase i or you'll loop forever
	# and when we're done, we can print!!
	print(countA, countC, countT, countG) # Prints with spaces between

"""
To run a problem's solution, call the function somewhere down here without any indentation, like this

ProblemX(<input>)

Save this file, make sure it ends in .py
Go into your shell (Powershell or Babun or something)
Find the directory this file is in using cd and ls
# cd <folder> : goes into a folder (also called directory)
# ls : lists the content of your current folder
When you find it, type
python <file>.py

and it'll run!
"""