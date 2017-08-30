# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Greeter
  def initialize(name="Default")
    @name = name
  end
  
  def say_hi
    puts "#{@name} says HI !!"
  end
end
