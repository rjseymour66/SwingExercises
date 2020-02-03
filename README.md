# SwingExercises

Most simple windowing GUIs follow a pattern that is easy to learn and that will get you started with Swing. Following these guidelines is not the only way to create a GUI window class, but it is a simple and common way to do it, and it is basically the only way you’ve learned so far.

- A typical GUI is some windowing object of a class that is derived from the class JFrame and that contains a number of components, such as labels and buttons.
- When the user clicks the close-window button, the window should close, but this will not happen correctly unless your program registers a window listener to close the window. One way to accomplish this task is by writing the statement
addWindowListener(new WindowDestroyer()); within a constructor of the GUI class definition. You can use the definition
of WindowDestroyer given in Listing 13.2.
- You can group components together by placing the components in an object of JPanel—a panel—and then adding the panel to the GUI.
- The GUI—that is, the JFrame window—and each panel in the GUI should be given a layout manager, using the method setLayout.
- If any of the components, such as a button, generate action events, you need to make the GUI (or some other class) an action listener. Every element that generates an action event should have an action listener registered with it. You register an action listener by using the method addActionListener.
- To make a class an action listener, you need to write implements ActionListener at the end of the heading of the class definition. You also need to define the method actionPerformed in the class.
