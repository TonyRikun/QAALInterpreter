@echo off

call "C:\Program Files (x86)\Microsoft Visual Studio\2022\BuildTools\VC\Auxiliary\Build\vcvars64.bat"
REM exit
REM echo hi
REM pause
nmake /?
setlocal enabledelayedexpansion
set i=0
for /f "tokens=2" %%a in ('tasklist ^| findstr cmd.exe') do (
    set /a i+=1
    if !i!==2 (
        set "secondPID=%%a"
        goto :continue
    )
)
:continue
tasklist | find "cmd.exe"
pause
echo The PID of the second cmd.exe instance is: %secondPID%
endlocal
pause