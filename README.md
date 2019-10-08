<!-- #######  YAY, I AM THE SOURCE EDITOR! #########-->
<p style="text-align: left;">&nbsp;</p>
<p style="text-align: justify;">Este projeto apresenta uma introdu&ccedil;&atilde;o ao EJB, uma das mais importantes tecnologias de desenvolvimento da plataforma Java EE, que permite desenvolver aplica&ccedil;&otilde;es corporativas de alta complexidade, oferecendo valiosos recursos ao desenvolvedor.</p>
<p style="text-align: justify;">A Vers&atilde;o 3.1 foi utilizada nos exemplos apresentados deste projeto. Os beans de sess&atilde;o, com exemplos de seus tr&ecirc;s subtipos (stateless, stateful e singleton).&nbsp;</p>
<p style="text-align: justify;">O conhecimento adquirido neste projeto &eacute; um ponto de partida para estudos avan&ccedil;ados sobre EJBs e o universo que h&aacute; por tr&aacute;s deles. No mercado de trabalho, a tecnologia EJB &eacute; bastante utilizada pelas empresas de desenvolvimento de softwares, e isso faz com que o EJB seja praticamente um item obrigat&oacute;rio no curr&iacute;culo de um bom desenvolvedor Java</p>
<p><strong><span class="subtitulo_texto">EJB na pr&aacute;tica</span></strong></p>
<p>Este projeto foi destinado &agrave; constru&ccedil;&atilde;o de exemplos dos tr&ecirc;s tipos de beans de sess&atilde;o (stateless, stateful e singleton), de forma simples, pr&aacute;tica e objetiva. <strong>O mais importante &eacute; entender em quais situa&ccedil;&otilde;es os beans de sess&atilde;o devem ser utilizados.</strong>&nbsp;Aumentando as chances de acerto na escolha do componente a ser utilizado.</p>
<p><strong><span class="subtitulo_texto">Tecnologias envolvidas</span></strong></p>
<p>Para a constru&ccedil;&atilde;o do exemplo, foi utilizado o JDK na vers&atilde;o 8 e o IDE Eclipse MARS com o servidor de aplica&ccedil;&atilde;o GlassFish na sua vers&atilde;o 4. A camada de apresenta&ccedil;&atilde;o foi constru&iacute;do com JSF 2.0, que serviu como entrada de dados para nossos componentes EJB. Por fim, ser&aacute; utilizado o EJB para a constru&ccedil;&atilde;o das nossas regras de neg&oacute;cio em sua vers&atilde;o mais recente, a 3.1.</p>
<p><strong><span class="subtitulo_texto">Configurando o ambiente</span></strong></p>
<p>O primeiro passo &eacute; a instala&ccedil;&atilde;o do servidor de aplica&ccedil;&atilde;o GlassFish, que ser&aacute; o container respons&aacute;vel por executar nossos exemplos no servidor. Para realizar a instala&ccedil;&atilde;o b&aacute;sica do GlassFish basta seguir os passos do assistente de instala&ccedil;&atilde;o at&eacute; o fim. Ap&oacute;s a conclus&atilde;o, abra o Eclipse na perspectiva Java EE e adicione o servidor GlassFish na view <em>Server</em>. Em seguida, clique com o bot&atilde;o direito sobre o GlassFish e selecione a op&ccedil;&atilde;o <em>Start</em> para iniciar seu servidor pela primeira vez. Feito isto, inicie um navegador e teste se o servidor est&aacute; em funcionamento atrav&eacute;s da URL <em>http://localhost:8080</em>. Se tudo ocorreu bem, ser&aacute; exibida uma p&aacute;gina do GlassFish.</p>
<p><strong><span class="subtitulo_texto">Criando o projeto</span></strong></p>
<p>Ap&oacute;s a instala&ccedil;&atilde;o e configura&ccedil;&atilde;o do servidor, o segundo passo &eacute; a cria&ccedil;&atilde;o do projeto no Eclipse. O projeto ser&aacute; do tipo <em>Dynamic Web Project</em>, que j&aacute; oferece um ambiente configurado para aplica&ccedil;&otilde;es web. Vamos aos passos para realizar a cria&ccedil;&atilde;o do projeto.</p>
<p>Abra a IDE Eclipse e clique em <em>File | New &gt; Dynamic Web Project</em>. No campo <em>Project Name</em>, informe o nome &ldquo;EJBAppProject&rdquo;. No combo <em>Dynamic web module version</em>, selecione a vers&atilde;o 3.0, respons&aacute;vel por dizer qual a vers&atilde;o do Java Servlet que ser&aacute; utilizada no projeto. Marque esta op&ccedil;&atilde;o, pois esta &eacute; a vers&atilde;o suportada pelo Java 6. Por &uacute;ltimo, na op&ccedil;&atilde;o <em>Configuration</em>, selecione <em>JavaServer Faces v2.0 Project</em>, que habilitar&aacute; o JSF no projeto, inclusive com a cria&ccedil;&atilde;o do arquivo <em>faces-config.xml</em>, respons&aacute;vel por conter as configura&ccedil;&otilde;es necess&aacute;rias do JSF. Depois, clique em <em>Next</em> e em <em>Next </em>novamente at&eacute; a tela <em>Web Module</em>. <strong>Nesta tela a op&ccedil;&atilde;o <em>Generate web.xml deployment descriptor </em>deve ser checada</strong>. Isto significa que o arquivo <em>web.xml</em>, respons&aacute;vel pelas configura&ccedil;&otilde;es do projeto web, deve ser criado automaticamente. Em seguida clique em <em>Next </em>novamente. Com isso, chegamos &agrave; &uacute;ltima tela de configura&ccedil;&atilde;o para a cria&ccedil;&atilde;o do projeto. <strong>Na op&ccedil;&atilde;o <em>JSF Implementation Library</em>, selecione <em>Disable Library Configuration</em>, que desabilitar&aacute; as configura&ccedil;&otilde;es de bibliotecas do JSF</strong> que podem ser adicionadas posteriormente, por&eacute;m, para nosso exemplo, n&atilde;o ser&aacute; necess&aacute;rio, por se tratar de uma aplica&ccedil;&atilde;o simples. <strong>Finalmente, no campo <em>URL Mapping Patterns</em>, deixe somente uma op&ccedil;&atilde;o, com <em>*.xhtml</em>, indicando que nossas p&aacute;ginas possuem a extens&atilde;o xhtml.</strong> Ap&oacute;s realizar as configura&ccedil;&otilde;es acima descritas clique em <em>Finish</em> e o projeto ser&aacute; criado no Eclipse. Para melhor compreens&atilde;o, examine os diret&oacute;rios para se familiarizar com a estrutura criada pelo projeto.</p>
<div class="nota">Este projeto ser&aacute; utilizado para criar os tr&ecirc;s exemplos dos beans de sess&atilde;o: Stateless, Stateful e Singleton.</div>
<p><strong><span class="subtitulo_texto">M&oacute;dulo Conversor de Graus, utilizando Stateless</span></strong></p>
<p>Conforme citado anteriormente, cada um dos beans de sess&atilde;o tem um comportamento espec&iacute;fico e deve ser utilizado levando em considera&ccedil;&atilde;o suas funcionalidades para atender bem o prop&oacute;sito desejado, sem comprometer desnecessariamente o uso da mem&oacute;ria do servidor ou at&eacute; mesmo a l&oacute;gica de neg&oacute;cio da aplica&ccedil;&atilde;o.</p>
<p>Os beans de sess&atilde;o stateless duram apenas uma requisi&ccedil;&atilde;o, por isso s&atilde;o mais leves e causam menos impacto no uso da mem&oacute;ria do servidor. Logo, devem ser utilizados sempre que n&atilde;o houver a necessidade de guardar o estado do bean entre as requisi&ccedil;&otilde;es. Um componente Stateless deve conter opera&ccedil;&otilde;es que s&atilde;o executadas e conclu&iacute;das em uma &uacute;nica chamada.</p>
<p>O exemplo a seguir &eacute; um componente que executa uma simples convers&atilde;o de graus Celsius para Fahrenheit. O componente recebe uma informa&ccedil;&atilde;o e retorna o grau convertido. Feita a convers&atilde;o, n&atilde;o existe a necessidade de guardar nenhuma informa&ccedil;&atilde;o. Assim, o componente pode voltar para o pool de beans at&eacute; ser invocado novamente para executar outra convers&atilde;o.</p>
<p>Dando andamento na constru&ccedil;&atilde;o do m&oacute;dulo de convers&atilde;o de graus, vamos criar dois pacotes para separar as funcionalidades da nossa aplica&ccedil;&atilde;o. O primeiro pacote ser&aacute; criado com o nome de <strong>manageBean</strong>, onde ficar&atilde;o os <em>Managed Beans</em> do <em>JSF</em> e o segundo com o nome de <strong>beans</strong>, onde os beans de sess&atilde;o do <em>EJB </em>ser&atilde;o salvos.</p>
<p>Em um projeto, os fontes Java ficam dentro de um pacote chamado source; no Eclipse, geralmente &eacute; apresentado como <em>src</em>. A partir do source &eacute; permitido criar uma estrutura de pacotes para fazer uma separa&ccedil;&atilde;o clara dos fontes e de suas respectivas funcionalidades. Para criar o primeiro pacote, clique com o bot&atilde;o direito sobre o source do projeto <em>EjbAppProject</em>, selecione <em>New</em> &gt; <em>Package</em>, d&ecirc; o nome de &ldquo;beans&rdquo; e clique em <em>Finish</em> para que o pacote seja criado.</p>
<p>Com o pacote criado, vamos codificar nossa primeira classe Java. Assim, clique com o bot&atilde;o direito no pacote <strong>beans</strong>, acesse a op&ccedil;&atilde;o <em>New </em>&gt;<em> Class</em>, digite o nome &ldquo;GrausBean&rdquo; e clique em <em>Finish</em>, para criar a nova classe. Posteriormente, adicione o c&oacute;digo da <strong>Listagem 1&nbsp;</strong>na classe <strong>GrausBean</strong>. Esta classe &eacute; nosso bean de sess&atilde;o EJB do tipo stateless, que cont&eacute;m as anota&ccedil;&otilde;es que indicam o tipo do bean de sess&atilde;o e o modo de acesso, que neste exemplo ser&aacute; local, al&eacute;m de um m&eacute;todo respons&aacute;vel por realizar a convers&atilde;o de graus.</p>
<p><strong>Listagem 1</strong>. Conversor de graus, @Stateless.</p>
<div><code class="code-sample"><code class="code-sample"></code></code>
<pre>  package beans;
   
  import javax.ejb.Local;
  import javax.ejb.Stateless;
   
  @Stateless
  @Local
  public class GrausBean {
      
      public double converterParaFahrenheit(double c) {
        return c * 1.8 + 32;
      }
  }</pre>
</div>
<p>Com o primeiro bean de sess&atilde;o criado, vamos adicionar o segundo pacote de fontes, onde ser&atilde;o criados os <em>Managed Beans</em> do JSF, que s&atilde;o classes gerenciadas pelo container que fazem o meio de campo entre as p&aacute;ginas JSF e o modelo de dados, como por exemplo, um bean de sess&atilde;o do EJB. Para criar o pacote, clique com o bot&atilde;o direito sobre o source do projeto <em>EJBAppProject</em>, acesse <em>New</em> &gt; <em>Package</em>, d&ecirc; o nome de &ldquo;manageBean&rdquo; e clique em <em>Finish</em> para que o pacote seja criado. Vamos agora criar nossa segunda classe Java. Para isso, clique com o bot&atilde;o direito nesse pacote, acesse <em>New </em>&gt;<em> Class</em>, informe o nome &ldquo;GrausManageBean&rdquo; e clique em <em>Finish</em>. A classe ser&aacute; criada e dever&aacute; receber o c&oacute;digo contido na <strong>Listagem 2</strong>. Esta classe &eacute; um <em>Managed Bean</em>, que em nosso projeto ser&aacute; o respons&aacute;vel por receber as instru&ccedil;&otilde;es da tela e realizar a inje&ccedil;&atilde;o do componente EJB para efetuar a convers&atilde;o de graus. Esse comportamento &eacute; feito atrav&eacute;s do uso da anota&ccedil;&atilde;o <strong>@EJB</strong>. Como j&aacute; aprendemos anteriormente, quando o container encontra esta anota&ccedil;&atilde;o, ele buscar&aacute; no pool uma inst&acirc;ncia dispon&iacute;vel e a disponibilizar&aacute; para o usu&aacute;rio de forma transparente. Ap&oacute;s realizar a inje&ccedil;&atilde;o do componente no c&oacute;digo, os m&eacute;todos que se encontram no bean podem ser acessados normalmente.</p>
<p><strong>Listagem 2</strong>. Graus ManagedBean, JSF.</p>
<div><code class="code-sample"><code class="code-sample"></code></code>
<pre>  package manageBean;
   
  import javax.ejb.EJB;
  import javax.faces.bean.ManagedBean;
   
  import beans.GrausBean;
   
  @ManagedBean
  public class GrausManageBean {
        
        @EJB
        GrausBean grausBean;
   
        double c;    
        double resultadoF;  
            
      public void converterParaFahrenheit() {
        this.resultadoF = this.grausBean.converterParaFahrenheit(c);
      }
   
        public double getC() {
              return c;
        }
        public void setC(double c) {
              this.c = c;
        }
        public double getResultadoF() {
              return resultadoF;
        }
        public void setResultadoF(double resultadoF) {
              this.resultadoF = resultadoF;
        }   
  }</pre>
</div>
<p>Com as classes prontas, &eacute; a vez de criar os arquivos web. Em um projeto web, todos os arquivos que ser&atilde;o apresentados no navegador, sejam estes p&aacute;ginas ou imagens, t&ecirc;m que estar dentro de uma pasta, chamada <em>WebContent</em>. Ao acessar a aplica&ccedil;&atilde;o pelo navegador, ele busca dentro desta pasta a p&aacute;gina a ser exibida. Baseado nisso, vamos criar uma pasta chamada <em>view </em>dentro de <em>WebContent </em>para armazenar as p&aacute;ginas usadas neste projeto. Para tanto, clique com o bot&atilde;o direito sobre a pasta <em>WebContent</em>, acesse <em>New</em> &gt; <em>Folder</em>, digite o nome &ldquo;view&rdquo; e clique em <em>Finish</em>. Ap&oacute;s a cria&ccedil;&atilde;o da pasta, vamos criar a primeira p&aacute;gina deste projeto. Deste modo, clique sobre a pasta <em>view</em> com o bot&atilde;o direito, navegue em <em>New</em> &gt; <em>XHTML Page</em>, d&ecirc; o nome de &ldquo;graus.xhtml&rdquo; e clique em <em>Finish</em>. Ap&oacute;s a cria&ccedil;&atilde;o do arquivo <em>graus.xhtml</em>, vamos adicionar os namespaces do JSF e a l&oacute;gica para a entrada de dados para realizar a convers&atilde;o de graus conforme o c&oacute;digo da <strong>Listagem 3</strong>.</p>
<p><strong>Listagem 3</strong>. P&aacute;gina Graus Web.</p>
<div><code class="code-sample"><code class="code-sample"></code></code>
<pre>  &lt;!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"&gt;
   
  &lt;html xmlns="http://www.w3.org/1999/xhtml"
   xmlns:h="http://java.sun.com/jsf/html"&gt;
   
  &lt;h:head&gt;
   &lt;title&gt;Converter Graus - Stateless&lt;/title&gt;
  &lt;/h:head&gt;
   
   &lt;h:body&gt; 
    &lt;h:form&gt;
     &lt;h:outputLabel value="Convers&atilde;o de Graus utilizando um bean Stateless"/&gt;
     &lt;hr/&gt;
     &lt;h:outputLabel value="Grau em Celsius: "/&gt;
     &lt;h:inputText value="#{grausManageBean.c}" &gt;&lt;/h:inputText&gt;
     &lt;h:commandButton action="#{grausManageBean.converterParaFahrenheit}" value="Converter"/&gt;&lt;br/&gt;
     &lt;h:outputLabel value="Em Fahrenheit: "/&gt;
     &lt;h:outputText value="#{grausManageBean.resultadoF}"/&gt;
    &lt;/h:form&gt; 
   &lt;/h:body&gt;
   &lt;/html&gt;</pre>
</div>
<p>Com os devidos arquivos criados, &eacute; necess&aacute;rio adicionar o projeto <em>EJBAppProject </em>no servidor de aplica&ccedil;&atilde;o GlassFish para que possa ser executado no container Java EE. Para fazer isto, clique com o bot&atilde;o direito sobre o servidor na <em>view</em> <em>Serves</em> e selecione <em>Add and Remove</em>. Em seguida clique sobre o projeto que estar&aacute; no quadrante &agrave; esquerda e depois em <em>Add</em>, fazendo com que o projeto passe para a direita.</p>
<p>Finalmente, inicie o servidor e acesse a URL <em>http://localhost:8080/EJBAppProject/view/graus.xhtml</em> para conferir as funcionalidades. Ao digitar os valores e clicar em converter, o componente EJB &eacute; injetado na aplica&ccedil;&atilde;o, recebe o valor digitado por par&acirc;metro, efetua a convers&atilde;o e em seguida retorna o resultado convertido. Feito isso, o componente volta para o pool e ficar&aacute; dispon&iacute;vel para efetuar as convers&otilde;es de quem o invocar. A <strong>Figura 1&nbsp;</strong>explica como a URL &eacute; montada para ser acessada no navegador.</p>
<p><img class="imagem_artigo" src="//arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/24/3/image004.png" /></p>
<p><strong>Figura 4.</strong> Detalhamento da URL de acesso ao m&oacute;dulo de convers&atilde;o de graus.</p>
<p>Como exerc&iacute;cio opcional, desenvolva uma nova convers&atilde;o de graus Fahrenheit para Celsius.</p>
<p><strong><span class="subtitulo_texto">M&oacute;dulo Controle de Visitas, utilizando Stateful</span></strong></p>
<p>O pr&oacute;ximo exemplo ser&aacute; com os beans de sess&atilde;o stateful, que possuem como principal caracter&iacute;stica a preserva&ccedil;&atilde;o do estado dos componentes, mesmo ap&oacute;s sofrer v&aacute;rias requisi&ccedil;&otilde;es. Com isso o consumo de mem&oacute;ria &eacute; elevado e por isso estes beans devem ser utilizados com cuidado para evitar uma sobrecarga do servidor. Cada sess&atilde;o de um bean do tipo Stateful permanece ligada sempre ao mesmo usu&aacute;rio, provendo servi&ccedil;os exclusivos a ele, ou seja, se o sistema estiver com mil usu&aacute;rios, existir&atilde;o mil inst&acirc;ncias do componente stateful na mem&oacute;ria. Um importante aliado no controle do uso da mem&oacute;ria j&aacute; mencionado neste artigo &eacute; o recurso chamado de passiva&ccedil;&atilde;o, que &eacute; executado de forma transparente, por&eacute;m possui m&eacute;todos callback que permitem criar seu pr&oacute;prio mecanismo de libera&ccedil;&atilde;o de recursos, utilizando as anota&ccedil;&otilde;es <strong>@PrePassivate</strong> e <strong>@PostActivate</strong>. A anota&ccedil;&atilde;o <strong>@Remove</strong> tamb&eacute;m deve ser usada sempre que poss&iacute;vel para excluir o bean quando o mesmo n&atilde;o for mais usado.</p>
<p>O exemplo com um bean de sess&atilde;o com estado ser&aacute; um sistema de controle de visitas de um hospital, o qual registra a entrada das pessoas. Ao chegar para realizar a visita, o nome da pessoa &eacute; inclu&iacute;do na lista. Se chegar mais um visitante, este tamb&eacute;m &eacute; inclu&iacute;do na listagem. Por&eacute;m, os nomes dos visitantes que j&aacute; est&atilde;o no local obviamente devem ser mantidos. Se o componente que armazena os nomes na listagem for do tipo stateful, este comportamento de manter os nomes salvos, mesmo sofrendo v&aacute;rias requisi&ccedil;&otilde;es, se d&aacute; de maneira autom&aacute;tica, poupando um grande esfor&ccedil;o e economizando um valioso tempo de desenvolvimento.</p>
<p>Como j&aacute; temos o pacote <strong>beans</strong> criado, vamos apenas adicionar um novo bean de sess&atilde;o, desta vez do tipo stateful. Portanto, clique com o bot&atilde;o direito sobre o pacote <strong>beans</strong>, acesse <em>New </em>&gt;<em> Class, </em>digite o nome &ldquo;VisitasBean&rdquo; e clique em <em>Finish</em>. A classe ser&aacute; criada e dever&aacute; receber o c&oacute;digo contido na <strong>Listagem 4</strong>. Esta classe &eacute; o nosso bean de sess&atilde;o EJB do tipo stateful. Observe que n&atilde;o existe a anota&ccedil;&atilde;o indicando se o bean &eacute; Local ou Remoto, sendo assim, prevalece a op&ccedil;&atilde;o default, que &eacute; Local. Al&eacute;m disso, temos um m&eacute;todo respons&aacute;vel por adicionar os nomes dos visitantes na lista e outro m&eacute;todo para recuperar os nomes para serem exibidos na aplica&ccedil;&atilde;o.</p>
<p><strong>Listagem 4</strong>. Controle de Visitas, @Stateful.</p>
<div><code class="code-sample"><code class="code-sample"></code></code>
<pre>  package beans;
   
  import java.util.HashSet;
  import java.util.Set;
   
  import javax.ejb.Local;
  import javax.ejb.Stateful;
   
  @Stateful
  public class VisitasBean {
    
    private Set&lt;String&gt; listaVisitantes = new HashSet&lt;String&gt;();
    
    public Set&lt;String&gt; getListaVisitantes() {
          return listaVisitantes;
    }
    
    public void entrouVisita(String visitante) {
          listaVisitantes.add(visitante);
    }
  }</pre>
</div>
<p>Vamos agora criar nosso Managed Bean do m&oacute;dulo de visitas. Deste modo, clique com o bot&atilde;o direito sobre o pacote <strong>managebean</strong>, acesse <em>New </em>&gt;<em> Class</em>, informe o nome &ldquo;VisitasManageBean&rdquo; e clique em Finish. Feito isso a classe ser&aacute; criada e dever&aacute; receber o c&oacute;digo da <strong>Listagem 5</strong>. Esta classe &eacute; um <em>Managed Bean </em>que no m&oacute;dulo de visitas ser&aacute; respons&aacute;vel por receber as instru&ccedil;&otilde;es da tela e realizar a inje&ccedil;&atilde;o do componente EJB atrav&eacute;s da anota&ccedil;&atilde;o <strong>@EJB</strong>, para salvar o nome do visitante e tamb&eacute;m para obter a lista dos visitantes junto ao componente e exibir para o usu&aacute;rio.</p>
<p><strong>Listagem 5</strong>. Visitas ManagedBean, JSF.</p>
<div><code class="code-sample"><code class="code-sample"></code></code>
<pre>  package manageBean;
   
  import java.util.ArrayList;
  import java.util.List;
   
  import javax.ejb.EJB;
  import javax.faces.bean.ManagedBean;
   
  import beans.VisitasBean;
  import javax.faces.bean.SessionScoped;
   
  @ManagedBean
  @SessionScoped
  public class VisitasManageBean {
        
        @EJB
        VisitasBean visitasBean;
        
        private String visitante;
   
        public void entrouVisita() {
              visitasBean.entrouVisita(visitante);           
        }      
        
        public List&lt;String&gt; getVisitas(){
               return new ArrayList&lt;String&gt;(visitasBean.getListaVisitantes());
        }
        
        public String getVisitante() {
              return visitante;
        }
   
        public void setVisitante(String visitante) {
              this.visitante = visitante;
        }
  }</pre>
</div>
<p>Agora, vamos criar a p&aacute;gina para realizar o cadastro dos visitantes. Como j&aacute; dissemos, toda p&aacute;gina web deve ser criada dentro da pasta <em>WebContent</em>. Assim sendo, clique com o bot&atilde;o direito sobre a pasta <em>view</em>, acesse <em>New</em> &gt; <em>XHTML Page</em>, d&ecirc; o nome de &ldquo;visitas.xhtml&rdquo; e clique em <em>Finish</em>. O arquivo <em>visitas.xhtml</em> ser&aacute; criado, restando adicionar os namespaces do JSF e a l&oacute;gica para a entrada de dados para realizar o cadastro e a visualiza&ccedil;&atilde;o dos visitantes. Fa&ccedil;a isso conforme o c&oacute;digo da <strong>Listagem 6</strong>.</p>
<p><strong>Listagem 6</strong>. P&aacute;gina Visitas Web.</p>
<div><code class="code-sample"><code class="code-sample"></code></code>
<pre>  &lt;!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"&gt;
   
  &lt;html xmlns="http://www.w3.org/1999/xhtml"
   xmlns:h="http://java.sun.com/jsf/html"
   xmlns:f="http://java.sun.com/jsf/core"&gt;
   
  &lt;h:head&gt;
   &lt;title&gt;Controle de Visitas - Stateful&lt;/title&gt;
  &lt;/h:head&gt;
   
   &lt;h:body&gt;
   &lt;h:form&gt;
   &lt;h:outputLabel value="Cadastro de Visitas utilizando um bean Stateful"/&gt;
   &lt;hr/&gt;
   &lt;h:outputLabel value="Nome de Visitante: "/&gt;
   &lt;h:inputText value="#{visitasManageBean.visitante}"/&gt;
   &lt;h:commandButton action="#{visitasManageBean.entrouVisita}" value="Incluir"/&gt;
   
   &lt;br/&gt;      
   &lt;h:dataTable value="#{visitasManageBean.visitas}" var="v" border="1"&gt;
         &lt;h:column&gt;
                &lt;f:facet name="header" &gt;
                       &lt;h:outputText value="Visitantes"/&gt;
                &lt;/f:facet&gt;
                 &lt;h:outputText value="#"/&gt;
         &lt;/h:column&gt;
   &lt;/h:dataTable&gt;
   &lt;/h:form&gt;
   &lt;/h:body&gt;
   &lt;/html&gt;</pre>
</div>
<p>Ap&oacute;s a cria&ccedil;&atilde;o dos arquivos necess&aacute;rios para a execu&ccedil;&atilde;o do m&oacute;dulo de controle de visitas, certifique-se que o projeto <em>EJBAppProject</em> esteja adicionado no servidor de aplica&ccedil;&atilde;o GlassFish clicando com o bot&atilde;o direito sobre o servidor na <em>view</em> <em>Serves &gt;</em> <em>Add and Remove</em>. O projeto deve estar no quadrante &agrave; direita. Se existirem mais projetos criados no Eclipse, &eacute; atrav&eacute;s desta op&ccedil;&atilde;o que devemos dizer ao servidor de aplica&ccedil;&atilde;o qual projeto queremos que seja implantado e qual projeto n&atilde;o queremos. Todos os projetos que estiverem no quadrante da direita ser&atilde;o implantados.</p>
<p>Feito isso, inicie o servidor e acesse a URL <em>http://localhost:8080/EJBAppProject/view/visitas.xhtml</em>. Ao digitar os nomes e clicar em incluir, o componente EJB &eacute; injetado na aplica&ccedil;&atilde;o, recebe o nome digitado por par&acirc;metro e, de maneira transparente, mant&eacute;m os nomes na sess&atilde;o. Cadastre mais nomes e observe que eles ser&atilde;o acumulados e n&atilde;o substitu&iacute;dos. Isto mostra que todo e qualquer valor de atributo ou lista de um componente stateful ser&aacute; preservado na sess&atilde;o.</p>
<p>Como exerc&iacute;cio opcional, crie a op&ccedil;&atilde;o para remover os nomes da lista de visitas.</p>
<div class="nota">Para comprovar os efeitos de um bean de sess&atilde;o Stateful, use diferentes navegadores. &Eacute; importante lembrar que ao usar v&aacute;rias abas de um mesmo navegador, elas compartilham da mesma sess&atilde;o. Ao cadastrar uma visita, pode-se atualizar a p&aacute;gina diversas vezes, ou at&eacute; mesmo abrir a aplica&ccedil;&atilde;o em outra aba do mesmo navegador, que as informa&ccedil;&otilde;es n&atilde;o ser&atilde;o perdidas. Por&eacute;m, ao abrir a aplica&ccedil;&atilde;o em outro navegador, consequentemente ser&aacute; criada uma nova sess&atilde;o, e as informa&ccedil;&otilde;es cadastradas anteriormente n&atilde;o ser&atilde;o exibidas.</div>
<p><strong><span class="subtitulo_texto">M&oacute;dulo Contador de Acessos, utilizando Singleton</span></strong></p>
<p>O &uacute;ltimo bean de sess&atilde;o que ser&aacute; apresentado &eacute; o singleton, que foi incorporado ao EJB na vers&atilde;o 3.1. Sabe-se que os stateless s&atilde;o beans de sess&atilde;o sem estado e os stateful s&atilde;o beans de sess&atilde;o com estado. J&aacute; os beans de sess&atilde;o singleton s&atilde;o criados apenas uma vez e todos os usu&aacute;rios acessam exatamente a mesma inst&acirc;ncia do componente. Logo, eles t&ecirc;m acesso &agrave;s mesmas informa&ccedil;&otilde;es contidas nela. Para ilustrar um exemplo do bean de sess&atilde;o singleton, imagine um simples contador de usu&aacute;rios logados. O primeiro usu&aacute;rio que acessar a aplica&ccedil;&atilde;o iniciar&aacute; o contador, fazendo com que ele receba o acesso de n&uacute;mero 1, e este valor ser&aacute; salvo em um componente singleton. Dessa forma, quando um novo usu&aacute;rio entrar no sistema e, como uma &uacute;nica inst&acirc;ncia do bean est&aacute; dispon&iacute;vel em toda a aplica&ccedil;&atilde;o, o contador adicionar&aacute; mais um acesso, marcando assim dois acessos.</p>
<p>Iniciando a constru&ccedil;&atilde;o do m&oacute;dulo contador de acessos, vamos criar um bean de sess&atilde;o do tipo singleton a partir do pacote <strong>beans</strong>. Para isto, clique com o bot&atilde;o direito sobre esse pacote, acesse <em>New </em>&gt;<em> Class</em>, informe o nome &ldquo;ContadorBean&rdquo; e clique em <em>Finish</em>. A classe ser&aacute; criada e dever&aacute; receber o c&oacute;digo apresentado na <strong>Listagem 7</strong>. Esta classe &eacute; o bean de sess&atilde;o EJB do tipo singleton, que cont&eacute;m as anota&ccedil;&otilde;es que indicam o tipo do bean de sess&atilde;o e o modo de acesso, que neste exemplo ser&aacute; local. Al&eacute;m disso, temos um m&eacute;todo respons&aacute;vel por incrementar o n&uacute;mero de acessos sempre que uma nova requisi&ccedil;&atilde;o for feita e outro m&eacute;todo para obter a quantidade de acessos para serem exibidos na aplica&ccedil;&atilde;o.</p>
<p><strong>Listagem 7</strong>. Contador de Usu&aacute;rios, @Singleton.</p>
<div><code class="code-sample"><code class="code-sample"></code></code>
<pre>  package beans;
   
  import javax.ejb.Local;
  import javax.ejb.Singleton;
   
  @Singleton
  @Local
  public class ContadorBean {
   
      int contador;
   
        public int getContador() {
              return contador;
        }
        
        public void incrementar(){
              contador++;
        }
  }</pre>
</div>
<p>Vamos agora criar nosso Managed Bean do m&oacute;dulo contador de acessos. Para isso, clique com o bot&atilde;o direito sobre o pacote <strong>manageBean</strong>, acesse <em>New </em>&gt;<em> Class</em>, digite o nome &ldquo;ContadorManageBean&rdquo; e clique em <em>Finish</em>. A classe ser&aacute; criada e dever&aacute; receber o c&oacute;digo contido na <strong>Listagem 8</strong>. Esta classe &eacute; o <em>Managed Bean</em> que no m&oacute;dulo contador de acessos ser&aacute; respons&aacute;vel por receber cada requisi&ccedil;&atilde;o da aplica&ccedil;&atilde;o e realizar a inje&ccedil;&atilde;o do componente EJB atrav&eacute;s a anota&ccedil;&atilde;o <strong>@EJB</strong>. A partir do momento que o componente for injetado, &eacute; poss&iacute;vel realizar a contagem dos acessos ao sistema e tamb&eacute;m obter a quantidade total de acessos e exibir para o usu&aacute;rio.</p>
<p><strong>Listagem 8</strong>. Contador ManagedBean, JSF.</p>
<div><code class="code-sample"><code class="code-sample"></code></code>
<pre>  package manageBean;
   
  import javax.ejb.EJB;
  import javax.faces.bean.ManagedBean;
  import javax.faces.bean.SessionScoped;
   
  import beans.ContadorBean;
   
  @ManagedBean
  @SessionScoped
  public class ContadorManageBean {
        
        @EJB
        ContadorBean contadorBean;
        
        public void incrementar() {
              contadorBean.incrementar();
        }
        
        public int getContador() {
              return contadorBean.getContador();
        }
  }</pre>
</div>
<p>Por &uacute;ltimo, vamos criar a p&aacute;gina para realizar a contagem de acessos. Esta p&aacute;gina ser&aacute; criada dentro da pasta <em>view</em>, que por sua vez est&aacute; dentro da pasta <em>WebContent</em>. Ent&atilde;o, clique com o bot&atilde;o direito sobre a pasta <em>view</em>, selecione <em>New</em> &gt; <em>XHTML Page</em>, d&ecirc; o nome de &ldquo;contador.xhtml&rdquo; e clique em <em>Finish</em>. Em seguida, adicione os <em>namespaces</em> do JSF e a l&oacute;gica para a contagem de acessos ao sistema conforme o c&oacute;digo da <strong>Listagem 9</strong>.</p>
<p><strong>Listagem 9</strong>. Contador Web.</p>
<div><code class="code-sample"><code class="code-sample"></code></code>
<pre>  &lt;!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"&gt;
   
  &lt;html xmlns="http://www.w3.org/1999/xhtml"
   xmlns:h="http://java.sun.com/jsf/html"&gt;
   
  &lt;h:head&gt;
   &lt;title&gt;Contador de Acesso - Singleton&lt;/title&gt;
  &lt;/h:head&gt;
   
   &lt;h:body onload="#{contadorManageBean.incrementar()}"&gt; 
   &lt;h:form&gt;
   &lt;h:outputLabel value="Contador de Acesso utilizando um bean Singleton"/&gt;
   &lt;hr/&gt;
    &lt;h:outputLabel value="Quantidade: "/&gt;
    &lt;h:outputText value="#{contadorManageBean.contador}"/&gt;
   &lt;/h:form&gt;
   &lt;/h:body&gt;
   &lt;/html&gt;</pre>
</div>
<p>Agora, inicie o servidor e acesse a URL <em>http://localhost:8080/EJBAppProject/view/contador.xhtml</em>. Cada vez que atualizar a pagina, ser&aacute; adicionado um registro ao contador do componente singleton.</p>
<div class="nota">Para comprovar os efeitos de um bean de sess&atilde;o Singleton, acesse a aplica&ccedil;&atilde;o em um navegador para incrementar o contador, inicie a aplica&ccedil;&atilde;o em um navegador diferente e verifique que o n&uacute;mero de acessos ser&aacute; incrementado. Isto deve acontecer independentemente do navegador, pois apenas uma inst&acirc;ncia do componente &eacute; criada, e ela &eacute; compartilhada com todos os usu&aacute;rios da aplica&ccedil;&atilde;o.</div>
