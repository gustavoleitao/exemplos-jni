# JNI

Este simples programa demonstra o uso da tecnologia JNI (Java Native Interface) que permite criar e executar programas escritos em linguagens Nativas a partir do Java.

Neste exemplo é criado uma simples biblioteca na linguagem C, que depois é chamada através da linguagem Java.

## Compilando código nativo

Para compilar o código escrito em C, execute:

### Linux
```
gcc -o libcalculadora.so -shared -fPIC
	-I/usr/lib/jvm/java-11-openjdk-11.0.13.0.8-4.el8_5.x86_64/include/ 
	-I/usr/lib/jvm/java-11-openjdk-11.0.13.0.8-4.el8_5.x86_64/include/linux 
	Calculadora.c
```

> Troque o caminho acima para o path de sua JVM

### Mac
```
gcc -o libcalculadora.jnilib -shared 
	-I/Library/Developer/CommandLineTools/SDKs/MacOSX10.15.sdk/System/Library/Frameworks/JavaVM.framework/Versions/A/Headers 
	Calculadora.c
```

> Troque o caminho acima para o path de sua JVM

## Compilando código Java

```
javac Calculadora.java -h ../c
```

## Executando

Uma vez que a lib esteja criada, execute através do seguinte comando:

```
java -Djava.library.path=./c Calculadora 8 9
```

> O parâmetro -Djava.library.path deve informar o path da lib criada