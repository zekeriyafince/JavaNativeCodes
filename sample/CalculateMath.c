#include "sample_CalculateMath.h"
#include <string.h>

JNIEXPORT jint JNICALL Java_sample_CalculateMath_calcSquare
  (JNIEnv *env, jobject obj, jint num) {
   return num * num;
}

void main(){}
