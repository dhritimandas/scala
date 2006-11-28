
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2006, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// generated on Tue Nov 28 14:03:53 CET 2006 (with fancy comment) (with extra methods)
// $Id$

package scala


/**
 * Function with 1 parameters. In the following example the definition of
 * <code>succ</code> is a shorthand for the anonymous class definition
 * <code>anonfun1</code>:
 * <pre>
 * <b>object</b> Main <b>extends</b> Application {
 *
 *   <b>val</b> succ = (x: Int) => x + 1
 *
 *   <b>val</b> anonfun1 = <b>new</b> Function1[Int, Int] {
 *     <b>def</b> apply(x: Int): Int = x + 1
 *   }
 *
 *   Console.println(succ(0))
 *   Console.println(anonfun1(0))
 * }</pre>
 */
trait Function1 [-T1, +R] extends AnyRef {
  def apply(v1:T1): R
  override def toString() = "<function>"

  def compose[A](g: A => T1): A => R = { x => apply(g(x)) }
  def andThen[A](g: R => A): T1 => A = g compose this

}
