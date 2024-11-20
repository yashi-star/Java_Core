package LEARNING_JAVA;


// Java AWT (Abstract Window Toolkit) is an API to develop Graphical User Interface (GUI) or windows-based applications in Java.
// Java AWT components are platform-dependent i.e. components are displayed according to the view of operating system. AWT is heavy weight i.e. its components are using the resources of underlying operating system (OS).
// The java.awt package provides classes for AWT API such as TextField, Label, TextArea, RadioButton, CheckBox, Choice, List etc.
// All the elements like the button, text fields, scroll bars, etc. are called components.
//In order to place every component in a particular position on a screen, we need to add them to a container.
//The Container is a component in AWT that can contain another components like buttons, textfields, labels etc. 
//The classes that extends Container class are known as container such as Frame, Dialog and Panel.
//TYPES OF CONTAINER Window ,Panel,Frame,Dialog


//window-The window is the container that have no borders and menu bars.
// You must use frame, dialog or another window for creating a window.
// We need to create an instance of Window class to create this container.

//Panel- is the container that doesn't contain title bar, border or menu bar. 
//It is generic container for holding the componentr,have other components like button, text field etc.
// An instance of Panel class creates a container, in which we can add components.

//Frame -is the container that contain title bar and border and can have menu bars.
//It can have other components like button, text field, scrollbar etc. 
//Frame is most widely used container while developing an AWT application.

//There are two ways to create a GUI using Frame in AWT.
//By extending Frame class (inheritance)
//by creating the object of Frame class (association)


//Changing the state of an object is known as an event. For example, click on button, dragging mouse etc.
// The java.awt.event package provides many event classes and Listener interfaces for event handling.

// Java Swing tutorial is a part of Java Foundation Classes (JFC) that is used to create window-based applications.
// It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.
// Unlike AWT, Java Swing provides platform-independent and lightweight components.
// The javax.swing package provides classes for java swing API such as JButton, JTextField, JTextArea, JRadioButton, JCheckbox, JMenu, JColorChooser etc.
//he Java Foundation Classes (JFC) are a set of GUI components which simplify the development of desktop applications.
public class Swing{
 public static void main(String[] args) {
     
 }
}
