#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
javadoc -docletpath target$symbol_escape${artifactId}-${version}-jar-with-dependencies.jar -doclet ${package}.Doclet %*
