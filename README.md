# Project-factory

Java practice projects and small console applications.

## Project structure

```text
src/
|-- BankApp/   Bank account console application
`-- test1/     Java OOP practice projects
```

## Run BankApp

From the repository root in PowerShell:

```powershell
$files = Get-ChildItem src -Recurse -Filter *.java | ForEach-Object FullName
javac -encoding UTF-8 -d out $files
java -cp out BankApp.Test
```

The entry point is `BankApp.Test`.
