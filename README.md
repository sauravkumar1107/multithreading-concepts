Multithreading: 

- Process vs thread : Threads share the same address space, hence context switching is less expensive and cost of communication is relatively low
- e.g. typing (i/o thread) and spellchecker (another thread), logger, parallel workflow execution, parallel API calls
- Daemon thread: might get terminated by JVM if there is no user thread running
- Two ways to create a thread: Extending Thread class overriding run() 
- and implementing Runnable FunctionalInterface passing the object of this concrete class to constructor of Thread class
- Preferred approach is using Runnable interface since Java allows implementing multiple interfaces but does not allow extending multiple classes
- synchronized block/method (static and non-static methods)
- Thread safety and thread safe classes e.g. StringBuffer is a thread safe class but StringBuilder isn't
- volatile keyword
- Producer-Consumer problem
- Thread states







ref - https://www.youtube.com/watch?v=WldMTtUWqTg
