# Tactic: Heart-Beat; Context: Self-driving cars (CryoHeart)

We've all heard of design patterns, and patterns are composed of tactics. In this project I've demonstrated the heartbeat tactic. A java based project.
##### Composed of :
  - JDK : corretto 1.8.0_265
  - Kryonet : A Java library that provides a clean and simple API for TCP and UDP client/server network communication using NIO.
  - Hardwork!

# What is the Heart-Beat Tactic?
One module(Sender) will keep on relaying its status after a specified interval and another module(Receiver) will be registered to listen to this. If the Sender dies, let's just say its JVM crashes due to some fault, it will flatline and the Receiver would be made aware of this.

# Demonstration

1. Run the Supervisor.java; It'll prompt you to press "Enter" when other modules are online, don't press enter yet.
    ![Image](https://github.com/s1mar/Tactic-Heart-Beat-Context-Self-driving-cars/blob/master/screens/step1_launchSuper.jpg?raw=true)
2. Run the EnvironmentPerception.java & VehicleControl.java files, you'd see that they have started transmitting their status(pit-pit).
    ![Image](https://github.com/s1mar/Tactic-Heart-Beat-Context-Self-driving-cars/blob/master/screens/step2_launchothers.jpg?raw=true)
3. Go Back to Supervisor.java and press the Enter key. It will register the receivers and in response to the relaying status they will output(dub-dub).
    ![Image](https://github.com/s1mar/Tactic-Heart-Beat-Context-Self-driving-cars/blob/master/screens/step3_pressEnter.jpg?raw=true)
4. Now, to simulate a random fault, I created this class (Zeher.java) and I've hooked it up to the Environment Perception Module. You can also disable or enable from the Manifest file.
    ![Image](https://github.com/s1mar/Tactic-Heart-Beat-Context-Self-driving-cars/blob/master/screens/disable_enable_zeher.jpg?raw=true)
5. When a random fault will occur in the Environment Perception Module then due to the Heart-Beat tactic, the supervisor will get to know of it and can then take appropriate measures.
    ![Image](https://github.com/s1mar/Tactic-Heart-Beat-Context-Self-driving-cars/blob/master/screens/step4_env_crashed.jpg?raw=true)


# Note
The purpose of this project is not to build a self-driving car software stack(that's for something in the future) but to rather understand the importance of the Heart-Beat tactic and demonstrate how it can be used to bolster and improve the availability of your modules. For me personally, it was also to understand running processes and IPC(Inter Process Communication), I first made this using RMI but then I thought, what if I use a web-server, sockers or perhaps NIO, my curiosity got the better of me and last night to early morning, I came up with this. I hope you like it and if you do, I wouldn't mind if you want to buy me a coffee(Colombian Roast).