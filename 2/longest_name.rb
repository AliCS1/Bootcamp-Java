def longest_name(names)
    longest = ''
    names.each do |name|
        #binding.irb
      if longest.length < name.length
        longest = name
      end
    end
    longest
  end
  
  people = ['Adam', 'Clara', 'George', 'Jane'];
  
  p longest_name(people)