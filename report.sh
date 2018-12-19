#!/usr/bin/env bash
./gradlew clean jacocoTestReport
cp -r ./app/build/reports/jacoco/jacocoTestReport/html/ ./build/
open ./build/index.html