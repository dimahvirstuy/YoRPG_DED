# YoRPG_DED
Our feature additions:
- Specialize is personalized for each character type. Each one is a lot more luck-based, since before, at least
in our version, whenever you said you were feeling lucky, your character always did well. Now, each specialize is 
personalized so if you're a Cat, for example, whenever you say you're lucky, there's a 50% chance that your next attack
will be 100000000 bigger and your defense will be 10000000 stronger. However the other 50% will be losing 5 health which
is a lot for a character with 100 max health. Other characters like pineapple had their own special abilities.
- STORYTIME! We added two story modes: forest and tower. They're in beta mode right now and only consist of one move. In
the start menu after you decide on character, name, and difficulty, you pick your story next. For forest, you set out to 
retrieve a farmer's tools stolen by a bunch of little boys. However these boys face bigger troubles as they wander into 
a forest rumored to be troublesome. For tower, your quest is to defeat a dragon in a tournament in order to please your
sponsor. In both, you inevitably have to fight.
~~~~~~~~~~~~~~~~
Code restructurings:
-For Storytime, we only had to alter the YoRPG.java file. We had to create an extra two methods; 
playForest and playTower. These methods just held print statements and for forest, a choosing 
statement. playTurn wasn't altered at all, only in the main method did we have to account for 
picking which story mode you're doing using a simple ifelse. In the newGame function we had to 
add a variable which held which storymode the player picked.
- For specialize, we just had to edit the superclass character and all of its subclasses. We 
only altered the specialize method to fit each character.
- We fixed the front end so that when a player or monster attacked, it wouldn't show up as negative.
~~~~~~~~~~~~~~~~
Instructions:
-The instructions are straight to the point. You compile and run and the game asks you questions to which you input the choice.
So for example if the question was. "Do you want to go on? 1) yes 2) no". You'd either put 1 or 2 and press enter to make
your choice. You only have to use keys 1-5 to play the entire game. In order to win, you have to defeat the monster or monster(s)
in whatever story mode you pick to play.