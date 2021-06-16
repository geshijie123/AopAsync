# springboot AOP 切面异步

### aop切面会影响接口效率吗？
> 会  正常使用切面代码需要 **同步** 执行切片逻辑 需要执行时间。

### aop异步如何配置？
> 1. applicationMain 添加 @EnableAsync
> 2. aop 无反的方法 添加 @Async
> 
### aop是单例模式，可以处理并发吗?
> aop 和 controller 一样可以处理并发，异步后也是线程池处理的，
> 从线程id可以看出，如果是同步 controller与aop 线程id相同
> 如果是异步 @Async注解过的方法 线程id与访问时的线程并不是一个。