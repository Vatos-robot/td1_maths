# Utilisez une image de base contenant Java 8 et sbt installé
FROM openjdk:8-jdk-alpine

# Définir le répertoire de travail dans l'image
WORKDIR /app

# Copiez le fichier build.sbt et les sources dans le conteneur
COPY build.sbt .
COPY src ./src

# Exécutez sbt pour télécharger et installer les dépendances
# hadolint ignore=DL3018
RUN apk update && apk add --no-cache curl bash && \
    curl -Ls https://git.io/sbt > sbt && \
    chmod +x sbt && \
    ./sbt update

# Exposez le port utilisé par votre application
EXPOSE 8080

# Exécutez l'application
# hadolint ignore=DL3025
CMD ["./sbt", "run"]