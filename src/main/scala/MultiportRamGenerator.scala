import spinal.core._

object MultiportRamGenerator {
  def main(args: Array[String]): Unit = {
    val cfg = RamCfg() // set config in RamCfg.scala
    SpinalConfig().generateVerilog(MultiportRamComponent(cfg)).printPruned()
  }
}
