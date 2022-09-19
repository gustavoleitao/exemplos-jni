#include "Calculadora.h"

JNIEXPORT jint JNICALL Java_Calculadora_soma(JNIEnv *env, jobject obj, jint a, jint b){
    return a + b;
}