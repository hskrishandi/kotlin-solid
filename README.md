# PostUploader

## Description
This project demonstrates the usage of SOLID principle. The program can store three types of post which is text, image,
and video, and can delete it.

## Environment
1. Install Kotlin and JDK

## Build and Run
Build
```bash
./gradlew build
```

Run
```bash
./gradlew run --console=plain
```

## Usage

To add post:
```bash
new text <title> <text>
new image <title> <filename>
new video <title> <filename>
```

To delete post:
```bash
delete <id>
```

To print all:
```bash
print
```

