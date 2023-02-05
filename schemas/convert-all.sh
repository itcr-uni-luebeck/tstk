#/bin/bash

cmd_ts="node $(realpath convert-typescript/node_modules)/json-schema-to-typescript/dist/src/cli.js"
cmd_kt="java -jar $(realpath convert-kotlin/convert-kotlin.jar)"

mkdir -pv kotlin
mkdir -pv typescript

output_dir_kt=$(realpath kotlin)
output_dir_ts=$(realpath typescript)


pushd schema > /dev/null
for f in *.schema.json;
do 
  echo "Found: $f"
  output_ts="$output_dir_ts/${f/.schema.json/.d.ts}"
  sh -c "$cmd_ts -i $f -o $output_ts"
  echo "  Wrote TS to $output_ts"

  sh -c "$cmd_kt $f $output_dir_kt" > /dev/null
  echo "  Wrote KT to $output_dir_kt"

  echo "\n"
done

popd > /dev/null
tree $output_dir_ts
echo "\n"
tree $output_dir_kt
