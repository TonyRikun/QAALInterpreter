@echo off
set var=%cd%
call "C:\Program Files (x86)\Microsoft Visual Studio\2022\BuildTools\VC\Auxiliary\Build\vcvars64.bat"
cd %var%

REM echo Cleaning old build...
REM cmd /c ".\gradlew -q clean"
REM echo:
REM echo ============================================
REM echo:
REM echo Building the project
REM cmd /c ".\gradlew -q build"
for /f %%f in ('dir /b .\test_cases\Tests') do (
echo:
echo ============================================
echo:
echo %%f
echo:
type .\test_cases\Tests\%%f | .\gradlew -q run > output.txt
fc /b output.txt .\test_cases\Answers\%%~nf.simp.answers > nul
    if errorlevel 1 (
        echo Output does not match expected for %%f
    ) else (
        echo Output matches expected answer for %%f
		cd ./cpp/QuEst/build
		nmake
		.\demo
		cd ../../..
    )
)
pause