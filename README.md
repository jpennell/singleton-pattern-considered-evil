#Singleton pattern considered evil

A Java repository showing why the Singleton pattern is probably not in your best interest.  The code has
a Singleton implementation and a factory/concrete class implementation. It also includes unit tests 
(or lack thereof) showing the difficulties you will face should you use 
the Singleton pattern in your application.

##A quick note

**The concept of having one and only one instance of an object in your application is perfectly valid**. However, 
the Singleton pattern is not a good way to achieve this goal.

##Why?

* The pattern hides object dependencies, making unit testing a nightmare
* The pattern violates the single responsibility principle, since it handles its own construction
* You cannot extend a Singleton very easily because it has a private constructor

##A better way

* Dependency injection, [read about it](http://en.wikipedia.org/wiki/Dependency_injection), thank me later
* An interface, a factory, and a concrete implementation. Use the factory to inject to concrete implementation into 
the class that will use it.
  * The factory can instantiate, hold, and return the single instance of the class you need
  * It's mockable and testable
  * It follows object oriented best practices
* Also, [Guice](http://code.google.com/p/google-guice/)

##Additional reading
* [Singletons are Pathological Liars](http://misko.hevery.com/2008/08/17/singletons-are-pathological-liars/)
* [Where Have All The Singletons Gone](http://misko.hevery.com/2008/08/21/where-have-all-the-singletons-gone/)
* [Singleton Considered Stupid](https://sites.google.com/site/steveyegge2/singleton-considered-stupid)
* [Stackoverflow: What is so bad about Singletons?](http://stackoverflow.com/questions/137975/what-is-so-bad-about-singletons)