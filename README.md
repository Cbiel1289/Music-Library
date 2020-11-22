- Information:

Cameron Biel, University of Pittsburgh at Bradford, 11/21/2020




- Description of Code:


This code is a music library that is able to hold playlists, with information taken from user input, as well as songs outside of the library.
Once all of the information is to the users satisfaction, the code then outputs the playlists and songs in a clean, easy to read format for the user.


- Instructions on how to run code:

It is very simple to run the code, and all it requires from the user is to enter in various information for the playlists and songs, and will ask the user if they wish to add more playlists or songs. It is important to download demo_songs.txt and make sure that it is in the project folder but outside of the src folder.


- Example input and output:

Who is the owner of this library?: Cameron

Demo songs were added to the library.

Let's make a new playlist!

What is the name of the playlist?: Christmas Time

Please give a description: It's the most wonderful time of the year!

Lets add a song to the Christmas Time playlist

Enter song name: All I Want For Christmas Is You

Enter artist name: Mariah Carey

Enter genre: Holiday

Would you like to add another song to Christmas Time playlist? (y/n) y

Lets add a song to the Christmas Time playlist

Enter song name: Let it snow!

Enter artist name: Frank Sinatra

Enter genre: Holiday

Would you like to add another song to Christmas Time playlist? (y/n) n

Would you like to add another playlist to the library? (y/n): n

Would you like to add a song to the library? (y/n): y

Let's add a song to your song library.

Song name: Better Now

Artist name: Post Malone

Genre: Hip-Hop/Rap

Would you like to add another song to the library? (y/n): n

Would you like to add another library? (y/n): n

LIBRARY OWNER: Cameron

SONGS IN LIBRARY:
--------------------
Title: Let it snow!
Artist: Frank Sinatra
Genre: Holiday
--------------------
Title: A Milli
Artist: Lil Wayne
Genre: Rap
--------------------
Title: Better Now
Artist: Post Malone
Genre: Hip-Hop/Rap
--------------------
Title: Yeah!
Artist: Usher
Genre: Pop
--------------------
Title: Lonely (with benny blanco)
Artist: Justin Beiber
Genre: Pop
--------------------
Title: All I Want For Christmas Is You
Artist: Mariah Carey
Genre: Holiday
--------------------
Title: God Is A Woman
Artist: Ariana Grande
Genre: Pop
--------------------
Title: Bohemian Raphsody
Artist: Queen
Genre: Rock

PLAYLIST NAME: Christmas Time
PLAYLIST DESCRIPTION: It's the most wonderful time of the year!
--------------------
Title: Let it snow!
Artist: Frank Sinatra
Genre: Holiday
--------------------
Title: All I Want For Christmas Is You
Artist: Mariah Carey
Genre: Holiday



- Restrictions of code:

Various restrictions of the code regard user verification for inputs, as it is expected that the user will type in either a 'y' or a 'n' for yes or no questions. Any other character or number may end up causing the code to not function properly.

The demo songs text file must be included in the project directory, otherwise the code will not be able to read from the file and may cause some errors. The demo songs will not be added to the playlist if it is unable to locate the file.

There is theoretically a limit to the amount of playlists and songs that can be added, but that should not be a concern for the average user, unless one is trying to really test the limits of the code.

There is no way for the code to verify if the information that the user inputs for the playlist/songs is correct, or have any data previously stored other than in the demo songs text file. It is therefore expected that the user knows this information before entering it in, or looks it up.



- What java and coding concepts were used in this assignment:

Various java and coding concepts were used, including the use of inheritance and polymorphism, user input, file reading and output, exception handling and using try catch, advanced array concepts such as hashtables, various loops such as a do while loop, constructors, getters and setters. 
