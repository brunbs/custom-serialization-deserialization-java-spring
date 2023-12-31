# Custom Serializer and Deserializer in Java Spring Boot
<b>English:</b>

Little project to show how to use custom serializators / deserializator to manipulate your requests and responses in Java Spring Boot using Jackson <br>

This little project was created based on a problem that I've found at a job. We had built an application to persist data do database.<br>
The object received in the request body had about 200 attributes.<br>
At some time during development, our Tech Lead decided we should persist the data in Upper Case.<br>
While some of the team members suggested to do about 100 String.ToUpperCase() convertions manually (estimating about a week of effort including development and tests) I decided to use a different approach to save time efficiently.<br>
I decided to implement a custom deserializer to manipulate strings received in the request, taking me about 15 minutes to develop and tests locally.<br>
This saved us lots of time and worked perfectly so I decided to share and as a bonus show how to do the same during serialization too.<br>
<br>
You'll find three branches in this project:<br>
<br>
a) main - base code showing the default behavior of our application<br>
b) custom-serializer - implementation of custom serializer<br>
c) customer-deserializer - implementation of custom deserializer<br>

Just a reminder: I was not worried in exception handling or other problems, just focusing in using the serializer and deserializer. <br>

<br>
The main code produces this:<br>

![image](https://github.com/brunbs/custom-serialization-deserialization-java-spring/assets/62837683/f6fbf1be-cfde-4e10-b64f-f390037ba98a)

After the serializer/deserializer customization this is the result:<br>

![image](https://github.com/brunbs/custom-serialization-deserialization-java-spring/assets/62837683/5cfed925-8243-41f6-9926-14b0226ca1f8)


Hope you enjoy.<br>
<br>
PT-BR:<br>
<br>
Esse pequeno projeto visa mostrar como implementar um serializador e um deserializador customizado para manipular seus requests e responses no Java Spring boot.<br>
<br>
Ele foi criado baseado em um problema que me deparei em um desenvolvimento. Havíamos desenvolvido uma aplicação de persistência de informações recebidas no request.<br>
O objeto que recebíamos tinha cerca de 200 atributos, a maioria textuais.<br>
Um tempo depois de pronto, o Tech Lead disse que deveríamos persistir as informações textuais todas em upper case.<br>
Alguns integrantes do time sugeriram manipular individualmente mais de 100 string utilizando toUpperCase() manualmente, estimando essa tarefa (com testes inclusos) em UMA SEMANA.<br>
Eu resolvi fazer uma abordagem diferente: resolvi implementar um serializador personalizado.<br>
Por que um serializador?<br>
Porque a informação que recebíamos passava por uma api que atuava como um producer para Kafka, então antes de chegar na api de persistência, era possível manipular as informações nesse producer.<br>
Então adicionei o serializador no producer para converter todos os campos de texto para upper case.<br>
<br>
Isso levou cerca de 15 minutos para implementar e evitou um grande esforço de tempo para o time e funcionou perfeitamente.<br>
<br>
Vou aproveitar esse repositório para mostrar também como fazer uma deserialização customizada caso queira tratar isso no recebimento o request em vez de no envio do response.<br>
<br>
Esse repositório possui 3 branches:<br>
a) main - código base da aplicação mostrando o comportamento padrão antes das implementações customizadas de serialização / deserialização<br>
b) custom-serializer - implementação do serializador customizado<br>
c) customer-deserializer - implementação do deserializador customizado<br>

Obs: neste código não me preocupei com tratamento de exceções ou organizações mais complexas de código, apenas em mostrar o serializador e deserializador
