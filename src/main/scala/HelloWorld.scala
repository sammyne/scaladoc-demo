/**
 * 演示 scaladoc 包注释的工具包。
 * 
 * @author sammyne
 * @version 0.1
 * @since 0.1
 */
package com.github.sammyne.scaladocdemo

/**
 * 演示 scaladoc 注释的工具类。
 */
class HelloWorld {

    /**
     * 在终端向 who 指定的名称问号。
     * 
     * @param who 待问号的人名。
     */
    def helloWorldTo(who: String): Unit = {
        println(s"hello world, my dear $who")
    }

    /** 
     * 一个过时的方法。
     * 
     * @deprecated 替换为 iAmNotDeprecated。
     */
    def iAmDeprecated() = println("I'm deprecated :(")

    /** 
     * 过时方法的替代方法。
     * 
     * @note 这是 iAmDeprecated 的升级版。
     */
    def iAmNotDeprecated() = println("I'm not deprecated :)")

    /** 
     * 计算 x+1 的值。
     * 
     * @param x 待加 1 的值
     * @return x 加 1 的结果。
     */
    def increment(x:Int): Int = x+1
}
