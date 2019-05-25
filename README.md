kotlin-spring-mvc
============================================================

[JIG](https://github.com/dddjava/Jig) のKotlin出力サンプルプロジェクト。
がっつり作る気はあまりないです。

## 構造

[Isolating the Domain](https://github.com/system-sekkei/isolating-the-domain) に準じます。


## JIG

### Gradleプラグイン

```
gradlew jig
```

### CLI

```
gradlew build
java -jar jig-cli.jar --directory.sources=src/main/kotlin --directory.classes=build/classes/kotlin/main
```

