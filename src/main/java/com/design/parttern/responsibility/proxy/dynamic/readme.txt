Spring AOP使用了两种代理机制：
 一种是基于JDK的动态代理；
 另一种是基于CGLib的动态代理。
 之所以需要两种代理机制，很大程度上是因为JDK本身只提供接口的代理，而不支持类的代理。 
JDK l.3以后，Java提供了动态代理的技术，允许开发者在运行期创建接口的代理实例。JDK的动态代理主要涉及到java.lang.reflect包中的两个类：
Proxy和InvocationHandler。
其中InvocationHandler是一个接口，可以通过实现该接口定义横切逻辑，并通过反射机制调用目标类的代码，动态将横切逻辑和业务逻辑编织在一起。
而Proxy利用InvocationHandler动态创建一个符合某一接口的实例，生成目标类的代理对象。



限制：
使用JDK创建代理有一个限制，即它只能为接口创建代理实例，这一点我们可从Proxy的接口newProxyInstance(ClassLoader loader, Class[] interfaces，InvocationHandler h)
的方法签名中就看得很清楚：第二个入参interfaces就是需要代理实例实现的接口列表。

对于没有通过接口定义业务方法的类，如何动态创建代理实例呢？
CGLib作为一个替代者，填补了这个空缺。CGLib采用非常底层的字节码技术，可以为一个类创建子类，并在子类中采用方法拦截的技术拦截所有父类方法的调用，并顺势织入横切逻辑。
但因为采用的是继承，所以不能对final修饰的类进行代理。有关cglib的使用请大家自行参阅资料，此处不在详述。