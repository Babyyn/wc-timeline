./gradlew :timeline:clean

./gradlew :timeline_api:assembleRelease
./gradlew :timeline_api:publish -Penv=stag -PpublishAar=true
./gradlew :timeline_api:publish -Penv=prod -PpublishAar=true

./gradlew :timeline:assembleRelease publishAar
./gradlew :timeline:publish -Penv=stag -PpublishAar=true
./gradlew :timeline:publish -Penv=prod -PpublishAar=true
