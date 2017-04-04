# Bowling Game Kata

Create a program that takes a valid game of Bowling as a list of rolls and returns. This is a good opportunity to practice [TDD](https://en.wikipedia.org/wiki/Test-driven_development). The rules of bowling can be summarized as:

- Each game includes ten “frames” for the bowler.
- The game score is the total of all frame scores.
- In each frame, the bowler gets up to two tries to knock down a total of 10 pins.
- If in two tries, she does not knock all 10 pins down, her score for that frame is the total number of pins she knocked down in her two tries.
- If in two tries she knocks all 10 pins down (a “spare”) her score for the frame is ten plus the number of pins knocked down on her next throw (*i.e.*, her first throw of the next frame).
- If on her first roll in a frame she knocks down all 10 pins (a “strike”), she does not take a second roll in that frame and her score for the frame is 10 plus the number of pins knocked down in her next two rolls.
- If she gets a spare or strike in the last (tenth) frame, she gets to throw one or two more bonus balls, as appropriate. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the tenth frame.


It might be a good idea to start by assuming the following:

- It is not necessary to provide scores for intermediate frames (*i.e.*, the score of the game before the game is finished)
- We will only receive valid input

Once you are done, it is worth trying to drop these assumptions.

Thanks to [Uncle Bob](http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata). Also [Ron Jeffries](http://ronjeffries.com/xprog/articles/acsbowling/) and the [Coding Dojo](http://codingdojo.org/kata/Bowling/).

