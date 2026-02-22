gradlew *args:
	#!/usr/bin/env bash
	export JAVA_HOME=/opt/homebrew/Cellar/openjdk@21/21.0.10/libexec/openjdk.jdk/Contents/Home/
	./gradlew {{ args }}
