import sbt._

object MainBuild extends Build {
  //scala-in action
  val scalainaction = Project("scalainaction", file("scalainaction"))
  val scinaction_ch01 = Project("scalainaction-ch01", file("scalainaction/ch01"))
  val scinaction_ch02 = Project("scalainaction-ch02", file("scalainaction/ch02"))
  val scinaction_ch03 = Project("scalainaction-ch03", file("scalainaction/ch03"))
  val scinaction_ch03_mongo = Project("scalainaction-ch03-scala-mongo-driver", file("scalainaction/ch03/scala-mongo-driver"))
  val scinaction_ch04 = Project("scalainaction-ch04", file("scalainaction/ch04"))
  val scinaction_ch05 = Project("scalainaction-ch05", file("scalainaction/ch05"))

  //slick-tutorial
  val slickTutorial = Project("slick-tutorial", file("slick-tutorial"))
  val helloSlick = Project("hello-slick", file("slick-tutorial/hello-slick"))
  val essentialSlick = Project("essential-slick", file("slick-tutorial/essential-slick"))
  val slickStarting = Project("slick-starting-on-the-right-foot", file("slick-tutorial/slick-starting-on-the-right-foot"))

  //play-tutorial
  /*val playTutorial = Project("play-tutorial", file("play-tutorial"))
  val playSlickEx = Project("essential-slick-play-integration", file("play-tutorial/play-slick-example"))*/

  val main = Project("scala-tutorial", file("."))
      .aggregate(
        scalainaction,
        scinaction_ch01,
        scinaction_ch02,
        scinaction_ch03,
        scinaction_ch03_mongo,
        scinaction_ch04,
        scinaction_ch05,
        slickTutorial,
        helloSlick,
        essentialSlick,
        slickStarting
  )
}