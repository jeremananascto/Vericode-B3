#### Build: Tecnologias Utilizadas

**Selenium**: interagir com os elementos web da página

**Junit**: testar o software em Java

**Cucumber**: escrever os teste em linguagem mais humana e BDD

**Java**: linguagem de programação

**Maven**: para gerenciamento de dependências

**Intellij**: IDE para implementação do projeto


#### :bulb: Pré requisitos

- Instalar o Java: [Download](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)

- Instalar JDK [Download]( https://www.oracle.com/br/java/technologies/javase/javase-jdk11-downloads.html)

- Instalar Intellij [Download](https://www.jetbrains.com/pt-br/idea/download/?section=windows)

- Variáveis de Ambiente Java e Maven [Tutorial](https://www.linkedin.com/pulse/como-configurar-meu-ambiente-para-criar-aplica%C3%A7%C3%B5es-java-monteiro/?articleId=6661590243470266369)

- Clonar o projeto

  ```
  git clone https://github.com/
  ```

- Entrar na página do projeto

  ```
  cd desafioVericodeB3
  ```

- Download Chrome Webdriver [Download](https://chromedriver.chromium.org/downloads) - Como achar a versão do seu [Chrome](https://support.google.com/chrome/answer/95414?co=GENIE.Platform%3DDesktop&hl=pt-BR#zippy=%2Cprocurar-atualiza%C3%A7%C3%B5es-e-ver-a-vers%C3%A3o-atual-do-navegador)

    - Crie uma pasta "driver" dentro da raiz do projeto, e extraia o arquivo nela.

------

#### :bulb: Estrutura Arquivo

<pre>
    -- src

    |-- test
    
    |  |-- java
    
    |  |  |-- io
    
    |  |  |  |-- cucumber
    
    |  |  |  |  |-- desafio
    
    |  |-- resources
    
    |  |  |-- io
    
    |  |  |  |-- cucumber
    
    |  |  |  |  |-- avaliacao
    
    |  |  |  |  |  |-- preencherformulario.feature
      
    |  |-- java
    
    |  |  |-- io
    
    |  |  |  |-- cucumber
    
    |  |  |  |  |-- avaliacao
    
    |  |  |  |  |  |-- RunCucumberTest.java
    
    |  |  |  |  |  |-- Pages
    
    |  |  |  |  |  |  |-- InsurantDataPage.java
   
    |  |  |  |  |  |  |-- VehicleDataPage.java
    
    |  |  |  |  |  |-- Servicos
    
    |  |  |  |  |  |  |-- Configuracao.java
    
    |  |  |  |  |  |-- Steps
    
    |  |  |  |  |  |  |-- InsurantDataSteps.java
         
    |  |  |  |  |  |  |-- VehicleDataSteps.java
