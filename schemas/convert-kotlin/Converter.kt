import net.pwall.json.schema.codegen.CodeGenerator
import java.io.File

const val PACKAGE = "de.uniluebeck.itcrl.tstk.backend.schema"
const val USAGE = "[converter] {inputFile} {outputDirectory}"

fun main(args: Array<String>) {
    val argList = args.toList()
    val inputFile = argList.getOrNull(0)?.let {
        File(it)
    } ?: throw IllegalArgumentException(USAGE)
    val outputDir = argList.getOrNull(1) ?: throw IllegalArgumentException(USAGE)

    val codeGenerator = CodeGenerator().apply {
        basePackageName = PACKAGE
        baseDirectoryName = outputDir
    }
    codeGenerator.generate(inputFile)
    println("Converted $inputFile")
}