#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
$symbol_pound!/bin/bash
javadoc -docletpath target/${artifactId}-${version}-jar-with-dependencies.jar -doclet ${package}.Doclet "$symbol_dollar@"
