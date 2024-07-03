# Configuración de docker
```
# Usar una imagen base de OpenJDK
FROM openjdk:21

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar todo el contenido del directorio actual a /app en el contenedor
COPY . /app/

# Compilar todos los archivos Java en el directorio de origen
RUN javac src/main/java/org/example/*.java

# Definir el comando por defecto para ejecutar la aplicación
CMD ["java", "-cp", "src/main/java", "org.example.Game"]
```
![alt text](image.png)

# Construcción de la imagen Docker
```docker build -t tower-defense-game .```

![alt text](image-1.png)

![alt text](image-2.png)
# Ejecución del contenedor
```docker run -it --name tower-defense-container tower-defense-game```
![alt text](image-3.png)
# Configuración de redes y volúmenes en Docker
## Crear una red personalizada
```docker network create game-network```
![alt text](image-4.png)
## Ejecutar el contenedor en la red
```docker run -it --name tower-defense-container --network game-network tower-defense-game```
![alt text](image-9.png)
```docker rm tower-defense-container```
![alt text](image-8.png)

![alt text](image-5.png)


## Crear y montar un Volumen
```docker volume create game-data```
![alt text](image-6.png)
```docker run -it --name tower-defense-container --network game-network -v game-data:/app/data towerdefense-game```
![alt text](image-10.png)
```docker rm tower-defense-container```
![alt text](image-11.png)
```docker run -it --name tower-defense-container --network game-network -v game-data:/app/data e318f11cb88b2320c6ca6c89c99cdfd1bdc55ded682518df595a2b031a40fef6```
![alt text](image-12.png)

![alt text](image-13.png)
# Interacción con contenedores usando docker exec
## Acceder al contenedor en ejecución
```docker exec -it tower-defense-container /bin/bash```
![alt text](image-14.png)
![alt text](image-16.png)
![alt text](image-15.png)

## Ejecutar comandos dentro del contenedor
ls /app

![alt text](image-17.png)

# Implementación con Docker Compose
## Crear un archivo docker-compose.yml
```version: '3'
services:
 game:
 image: tower-defense-game
 networks:
 - game-network
 volumes:
 - game-data:/app/data
networks:
 game-network:
 driver: bridge
volumes:
 game-data:
 driver: local
 ```

![alt text](image-18.png)
## Iniciar los servicios

```docker-compose up -d```
![alt text](image-21.png)
![alt text](image-20.png)
![alt text](image-19.png)

# Despliegue en Kubernetes
## Crear archivos de despliegue y servicio 
### deployment.yaml
```apiVersion: apps/v1
kind: Deployment
metadata:
 name: tower-defense-deployment
spec:
 replicas: 1
 selector:
 matchLabels:
 app: tower-defense-game
 template:
 metadata:
 labels:
 app: tower-defense-game
 spec:
 containers:
 - name: tower-defense-game
 image: tower-defense-game
 ports:
 - containerPort: 8080
 ```
![alt text](image-22.png)
### service.yaml
 ```
 yaml
apiVersion: v1
kind: Service
metadata:
 name: tower-defense-service
spec:
 selector:
 app: tower-defense-game
 ports:
 - protocol: TCP
 port: 80
 targetPort: 8080
 type: LoadBalancer 
 ```
 ![alt text](image-23.png)

### Aplicar los archivos de configuración en Kubernetes
 ```kubectl apply -f deployment.yaml ```
![alt text](image-24.png)
 ```kubectl apply -f service.yaml ```
![alt text](image-25.png)
### Verificar el estado del despliegue
 ```kubectl get pods ```
![alt text](image-26.png)
 ```kubectl get services ```
![alt text](image-27.png)