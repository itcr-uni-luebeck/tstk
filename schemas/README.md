# Schema generation for TS frontend and Kt backend

JSON schemas are compiled to typescript definitions (using
https://www.npmjs.com/package/json-schema-to-typescript) and to Kotlin
data classes (using
https://github.com/pwall567/json-kotlin-schema-codegen).

The TypeScript compilation is invoked via the respective cli.js file via
Node (requires an installation of Node, and a `npm install` in the
[`convert-typescript` directory](./convert-typescript).

The Kotlin compilation is done by means of a small Kotlin project using
the IntelliJ build system. Open the [`convert-kotlin` directory](./convert-kotlin) 
in IntelliJ. Make sure the libraries are installed (this
*should* happen automatically), and the artifacts are build, so that a
JAR file is generated.

Then, the bash script [`convert-all.sh`](./convert-all.sh) can be used to convert all
definitions (with a `.schema.json` file extension) in the [`schema`
directory](./schema) to TS and Kt.

