# A better way to start your projects

Introducing MU Project. If you're a CS/IS student at the University of Mount Union, use MU Project to quickly get up and running with a simple application. 

## MUPanel.java

A simple Frame with several UI elements already hooked up for you. 

![a simple frame](http://f.cl.ly/items/2I362P0M3z313z2e083G/mupanel.png)

## MetroButton.java

A Metro-style subclass of JButton. They have a simple style, and nice aesthetic for any project. Also makes instantiating and customizing colors really easy. For instance: 

```java
demoMetroButton = new MetroButton("I'm BLUE!", Color.decode("#71b3c7"));
demoMetroButton.setBounds(50, 220, 100, 50);
demoMetroButton.addActionListener(this);
this.add(demoMetroButton);
```

## Contribute / Problem? 

Want to help contribute to MU Project? Just fork the project, make changes, and submit a pull request. I'll check for changes periodically. 

If you've encountered a problem with the code, please [submit a new issue](https://github.com/dreger/mu-project/issues/new) and we can get working on it. 

You can reach me on Twitter [@dreger](http://twitter.com/dreger), or through email. 