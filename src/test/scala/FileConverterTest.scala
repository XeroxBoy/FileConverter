import org.scalatest.FunSpec

class FileConverterTest extends FunSpec {

  describe("FileConverterTest") {

    it("should csvConvert") {
      new FileConverter().csvConvert("")
    }

  }
}
