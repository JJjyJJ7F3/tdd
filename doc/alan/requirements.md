## The rule of the game Wordz
To play Wordz, a player will have up to six attempts to guess a five-letter word. After each attempt,
letters in the word are highlighted as follows:
- The correct letter in the correct position has a black background
- The correct letter in the wrong position has a gray background
- Incorrect letters not present in the word have a white background
The player can use this feedback to make a better next guess. Once a player guesses the word correctly,
they score some points. They get six points for a correct guess on the first attempt, five points for a
correct guess on the second attempt, and one point for a correct guess on the sixth and final attempt.
Players compete against each other in various rounds to gain the highest score. Wordz is a fun game
as well as a gentle brain workout

Technically, we are going to create the backend web service component for this game. It will expose
an Application Programming Interface (API) so that a user interface can use the service and will
keep track of the game state in a database.
To focus on the techniques of TDD, we will leave certain things out of our scope, such as user
authentication and the user interface. A production version would, of course, include these aspects.
But to implement these features, we don’t need any new TDD techniques.
This simple design will allow us to fully explore TDD through all the layers of a typical web application

## decisions
- Supporting a variable number of letters in a word
- Representing the score using a simple enum of INCORRECT, PART_CORRECT, or CORRECT
- Accessing each score by its position in the word, zero-based