all: compile

compile:
	javac *.java

clean:
	rm -rf *.class

run:
	java appRun

step: clean all run