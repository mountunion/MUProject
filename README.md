# A better way to start your projects

CS/IS student at the University of Mount Union can use MU Project to get up and running quickly with a simple starter application. 

## MUPanel.java

Just a humble little Frame with several UI elements already hooked up. If you just want the Frame with nothing else, I've marked what to delete from the source code.  

![a simple frame](http://f.cl.ly/items/2I362P0M3z313z2e083G/mupanel.png)

## MetroButton.java

A Metro-style subclass of JButton. With a simple style, they can bring a nice aesthetic to any project. Instantiating is super easy; just choose a title and background color (hex code or Color.Something) to get started. Metro Buttons also have a subtle hover effect, which darkens your background color to show focus. 

```java
demoMetroButton = new MetroButton("I'm BLUE!", Color.decode("#71b3c7"));
demoMetroButton.setBounds(50, 220, 100, 50);
demoMetroButton.addActionListener(this);
this.add(demoMetroButton);
```

## Contribute / Problem? 

I'd love to see MU Project grow into a rock solid set of sensible defaults for new Java projects. To help contribute, sign in with your GitHub account, fork the project, make changes, and submit a pull request. 

If you encounter a problem with any of the code please [submit a new issue](https://github.com/dreger/mu-project/issues/new) and we can get working on it right away. 

You can reach me on Twitter [@dreger](http://twitter.com/dreger), or through email. 