# A better way to start your projects

Introducing the new MU Project. If you're a student at the University of Mount Union, this project folder will give you all the source code you need to get up and running with a simple JFrame and other simple elements. 

## MUPanel.java

A simple Frame with several UI elements already hooked up for you. 

![a simple frame](http://f.cl.ly/items/2I362P0M3z313z2e083G/mupanel.png)

## MetroButton.java

A Metro-style subclass of JButton. They have a simple style, and nice aesthetic for any project. Also makes instantiating and customizing colors really easy. For instance: 

```java
demoDregerButton = new DregerButton("I'm BLUE!", Color.decode("#71b3c7"));
demoDregerButton.setBounds(50, 220, 100, 50);
demoDregerButton.addActionListener(this);
this.add(demoDregerButton);
```

## Contribute / Problem? 

Want to help contribute to MU Project? Just fork the project, make changes, and submit a pull request. I'll check for changes periodically. 

If you've encountered a problem with the code, please [submit a new issue](https://github.com/dreger/mu-project/issues/new) and we can get working on it. 

You can reach me on Twitter [@dreger](http://twitter.com/dreger), or through email. 