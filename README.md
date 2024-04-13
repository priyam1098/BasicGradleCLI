#Setup gradle project with kotlin
```agsl
gradle init --use-defaults --type java-application
```
use below commands
```agsl
./gradlew build
./gradlew clean
```
setup manifest to execute jars
```agsl
jar {
    manifest{
        attributes(
            'Main-class' : 'org.ixigo.Main'
        )
    }
}
```
create jar using 
```agsl
./gradlew jar      
```
execute jars
```agsl
java -jar build/libs/BasicGradleProject-1.0-SNAPSHOT.jar
```
