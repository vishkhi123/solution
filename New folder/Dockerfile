FROM node:7
WORKDIR /app
COPY . /package.json
RUN npm install
COPY .  /app
CMD node app.js
EXPOSE 8080

