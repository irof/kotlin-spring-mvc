kotlin-spring-mvc
============================================================

[JIG](https://github.com/dddjava/Jig) のKotlin出力サンプルプロジェクト。
がっつり作る気はあまりないです。

`src/main/kotlin`が読めないため、ソースは `src/main/java` においています。

see: [dddjava/Jig/issues/291](https://github.com/dddjava/Jig/issues/291)

## 構造

[Isolating the Domain](https://github.com/system-sekkei/isolating-the-domain) に準じます。


## JIG

![[ビジネスルール関連図]](sample_business-rule-relation.png)

### Gradleプラグイン

```
./gradlew jig
```

### CLI

```
./gradlew build
./java -jar jig-cli.jar --directory.sources=src/main/java --directory.classes=build/classes/kotlin/main
```

