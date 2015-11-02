@echo off
echo Copying only Java Source from 'main\java'
robocopy "%CD%\src\main\java" "%CD%\mergedSrc" *.java /S /njh /njs /ndl /nc /ns /np
echo Copying Resources from 'main\resources'
robocopy "%CD%\src\main\resources" "%CD%\mergedSrc" *.* /S /njh /njs /ndl /nc /ns /np
echo DONE