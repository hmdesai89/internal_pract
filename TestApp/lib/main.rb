# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

puts "Hello World\n"

x =1.00
y = 2
print x.to_s

puts "\nHarsh"+" "+"Desai"
puts 1.class

#define a constant - starts with upper case
# You cannot change the value using constant
# However it issues just a warning whenever constant
#is changed example below

#A_CONSTANT = 3.14
#A_CONSTANT = 1.55
#puts A_CONSTANT


# return a file object

#write_handler = File.new("Test.out", "w")
#
#write_handler.puts("Random test").to_s
#
#write_handler.close
#
#data_from_file = File.read("Test.out")
#
#puts "Data from file :" + data_from_file

=begin
This snippet
represents multiline comments.
Hope you understand it pal. No hard
feelings :)
=end

age =12

if (age >= 5) && (age <=6)
  puts "I dont like this stye of coding"
elsif (age >=7) && (age<=13)
  puts "He is a teenager"
end

## Comparision operator

# Comparators : == != <> <= >=
#Logical: $$ || ! and or not
# true, false are boolean


#This is a comparator which will return either -1 , 0 , 1 depending upon value
#puts "5 <=> 10 = " + (5 <=> 10).to_s
#
#unless age < 4
#  puts "need to go to school"
#end
#
#def hello(name)
#  puts "Hello world in function #{name.capitalize}"
#end
#
#hello("Harsh")


#
#greet = Greeter.new("test")
#greet.say_hi


# loop example
#x = 1
#loop do 
#  x+=1 # x = x+1
#  next unless (x%2) == 0
#  puts x
#  break if x>=10
#end



# while loop
#y = 1
#
#while y <=10
#  y+=1
#  next unless (y%2) == 0
#  puts y
#end


#until loop
#a = 1
#until a>=10
#  a+=1
#  puts a
#end

#arrays and for loop
#numbers = [1,2,3,4,5]
#groceries = ["bananas", "tomatoes"]
#
#for number in numbers
#  puts "#{number}"
#end
#
#groceries.each  do  |food|
#  puts "get some #{food}"
#end
#
#(0..5).each do |i|
#  puts "# #{i}"
#end


#function
# variables are pass by value
#
#def add_nums(num1, num2)
#  return num1.to_i + num2.to_i
#end
#
#puts add_nums(3,4)
#
#x = 1
#
#def change_x(x)
#  x = 4
#end
#
#change_x(x)
#
#puts "x = #{x}"



#Exceptions
#print "Enter a number : "
#first_num = gets.to_i
#print "Enter second number : "
#second_num = gets.to_i
#
#begin
#  answer = first_num/ second_num
#rescue
#  puts "You can't divide by zero"
#  exit
#end
#
#puts "#{answer}"


#Exception in Ruby
#def check_age(age)
#  raise ArgumentError, "Enter Positive Number" unless age > 0
#end
#
#begin
#  check_age(1)
#  puts "first statement done"
#  check_age(-2)
#  puts "Second statement done"
#  rescue ArgumentError
#    puts "Please enter a possible age"
#end

# String Example
#puts "Add them #{4+5} \n\n"
#puts 'Add them #{4+5} \n\n'
#
## multiline string
#
#multiline_string = <<EOM
#This is a very very long string 
#which can have para
#  and interpolation like #{5+7} 
#\n
#EOM
#  
#puts multiline_string
#
#first_name = "Harsh"
#last_name = "Desai"
#
#full_name = first_name + last_name
#
#puts full_name
#
#puts full_name.include?("Harsh")
#
#puts full_name.count("aieou").to_s



#Object
#class Animal
#  def initialize
#    puts "Creatign a new Animal"
#  end
#  
#  def set_name(new_name)
#    @name = new_name
#  end
#  
#  def get_name
#    @name
#  end
#  
#  def name
#    @name
#    
#  end
#  
#  def name=(new_name)
#    if new_name.is_a?(Numeric)
#      puts "Name can't be a Number"
#    else
#      @name = new_name
#    end
#  end
#end
#
#cat = Animal.new
#
#cat.set_name("fluffy")
#
#puts cat.get_name
#puts cat.name
#
#cat.name=(1234)
#
#
#class Dog
##  attr_reader :name, :height, :weight
##  attr_writer :name, :height, :weight
#
#  attr_accessor :name, :height, :weight
#  
#  
#  def bark
#    return "Generic Bark"
#  end
#end
#
#rover = Dog.new
#rover.name = "Rover"
#
#rover.name = "Rover"
#
#puts rover.name
#
#class GermanShepard < Dog
#  def bark
#    return "Loud Bark"
#  end
#end
#
#max = GermanShepard.new
#
#max.name = "max"
#
#printf "%s %s\n", max.name, max.bark


#Modules
#
#require_relative "human"
#require_relative "smart"
#
#module Animal
#  def make_sound
#    puts "Grrr"
#  end
#end
#
#
#class Dog
#  include Animal
#end
#
#rover = Dog.new
#rover.make_sound
#
#class Scientist
#  include Human
#  prepend Smart
#  
#  def act_smart
#    return "E = mc^2"
#  end
#end
#
#einstein = Scientist.new
#
#einstein.name = "Albert"
#
#puts einstein.name
#
#einstein.run
#
#puts einstein.name+" says "+ einstein.act_smart 
# 


## Polymorphism
#class Bird
#  def tweet(bird_type)
#    bird_type.tweet
#  end
#end
#
#class Cardinal < Bird
#  def tweet
#    puts "Tweet tweet"
#  end
#end
#
#class Parrot < Bird
#  def tweet
#    puts "Squak"
#  end
#end
#
#generic_bird = Bird.new
#generic_bird.tweet(Cardinal.new)
#generic_bird.tweet(Parrot.new)

#Symbols - Strings that cannot be changed
# used for hash and keys
# :harsh is a symbol

#puts :harsh
#puts :harsh.to_s
#puts :harsh.class
#puts :harsh.object_id


#array1 = Arry.new
#array2= Arry.new(5) # default value is nill
#array3 = Arry.new(5,"Empty")





