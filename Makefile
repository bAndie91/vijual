
default:
	false

target/vijual-0.1.0-standalone.jar: src/vijual.clj project.clj
	lein uberjar

$(PREFIX)/bin/vijual: target/vijual-0.1.0-standalone.jar
	install $< $@
