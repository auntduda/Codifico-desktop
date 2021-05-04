//package databasecurso;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONML;
//import org.json.JSONObject;
//import org.json.JSONPointer;
//import org.json.JSONPointerException;
//import org.json.JSONPropertyIgnore;
//import org.json.JSONPropertyName;
//import org.json.JSONString;
//import org.json.JSONStringer;
//import org.json.JSONTokener;
//import org.json.JSONWriter;
//import org.json.Property;
//import org.json.XML;
//import org.json.XMLParserConfiguration;
//import org.json.XMLTokener;
//import org.json.XMLXsiTypeConverter;
//
//public class DataBaseCurso {
//    JSONObject licao1 = new JSONObject();
//
//    licao1.put("tela1", "O pensamento computacional é a ciência que estuda a habilidade de humana de resolver problemas lógicos de maneira que uma máquina possa entender a orientação que lhe foi dada. De maneira mais ampla, o pensamento computacional é aplicável no cotidiano de todos, ao ser apresentado um problema que exige solução.\nPara tanto, o estudo da estruturação da linha de raciocínio humana segue 4 princípios fundamentais: Decomposição; Reconhecimento de Padrões; Abstração; e Desenvolvimento da Solução.");
//    licao1.put("tela2", "Para começar a elaborar a solução de um problema, é preciso que haja a decomposição do problema maior em sub-problemas menores. De maneira análoga, para se fazer comida, é preciso começar a pensar em quais ingredientes serão utilizados na receita a ser feita. Esta etapa é fundamental para a busca de uma resposta, porque o ato de decompor auxilia o indivíduo a observar os sub-problemas de maneira clara e objetiva, para que estes possam ser resolvidos.\nPor exemplo, o ato de desenhar um ser humano pode ser decomposto em diferentes regiões da imagem a ser produzida, as quais podem ser divididas em representações mais simples de uma determinada parte do corpo humano. Após separar estas sub-partes do corpo, é possível adicionar os detalhes ao desenho, e enfim, compor uma pessoa só.");
//    licao1.put("tela3", "Teste1");
//    licao1.put("questao1", "O ato de decompor um problema em sub-problemas é fundamental para que");
//    licao1.put("respostaA1", "o usuário possa contabilizar quantos sub-problemas existem");
//    licao1.put("respostaB1", "a criação de uma estrutura de dado 'grafo' possa ser construída");
//    licao1.put("respostaC1", "a resposta do problema possa ser gerada de maneira mais simples");
//    licao1.put("repostaD1", "o problema possa ser decomposto");
//    licao1.put("tela4", "O reconhecimento de padrões é realizado após a decomposição do problema maior em sub-problemas, os quais poderão ter, ou não, uma forma semelhante de serem resolvidos. Observar que problemas menores podem ser resolvidos da mesma maneira é importante para que não haja esforço desnecessário na solução dos mesmos, já que seguem um mesmo modelo de conclusão.\nPor exemplo: todos os dias, ao acordar, alguma pessoa se levanta, lava o rosto, escova seus dentes, arruma a cama e troca de roupa, para que possa, então, tomar café da manhã. Portanto, caso qualquer pessoa queira tomar café da manhã, é necessário que ela realize esta ação rotineira, e então, coma.");
//    licao1.put("tela5", "Teste2");
//    licao1.put("questao2", "A solução geral para problemas semelhantes é importante porque");
//    licao1.put("respostaA2", "é possível escovar os dentes antes de tomar café da manhã");
//    licao1.put("respostaB2", "é exigido menos tempo de execução do problema maior");
//    licao1.put("respostaC2", "é necessário agrupar problemas iguais");
//    licao1.put("repostaD2", "rotinas são atividades cansativas de se realizar");
//    licao1.put("tela6", "A abstração de um problema se dá como a parte mais importante do processo de desenvolvimento do pensamento computacional, uma vez que a passagem de informações à maquina se dá a partir desta etapa.\nA abstração se dá a partir da seleção de informações relevantes ou não de certo problema, bem como a cararcterização destas informações para que o computador processe os dados obtidos. De maneira análoga, a abstração se dá a partir da coleta de informações de um questionário voltado a alunos de uma isntituição, a qual deseja saber qual é a média de idades dentre os componentes do ambiente. Assim, não é necessário saber qual é o nome, a turma, ou conteúdo favorito de cada aluno, e sim, a idade de cada um deles, representada por um número inteiro.");
//    licao1.put("tela7", "Teste3");
//    licao1.put("questao3", "Suponha que o Intituto Brasileiro de Geografia e Estatística (IBGE) deseje levantar porcentagens de quantas pessoas são caracterizadas pelo nome João no território brasileiro. Para que esse tipo de informação possa ser fornecida a um aparat tecnológico de análise, é necessário fornecer");
//    licao1.put("respostaA3", "a quantidade de pessoas de nome João");
//    licao1.put("respostaB3", "o nome completo de todas as pessoas que tem João em sua composição");
//    licao1.put("respostaC3", "a quantidade de pessoas que não tem seu nome caracterizado como João");
//    licao1.put("respostaD3", "a quantidade de pessoas de nome Maria");
//    licao1.put("tela8", "Por fim, o problema deve ser estruturado em uma sequência de decisões e instruções, as quais realizarão tarefas sequenciais que, ao final, entregarão o resultado solicitado. Esta etapa, denominada Algoritmo, é fundamental na implementação da solução de problemas diversos, já que o computador só se comunica com seres humanos a partir daquilo que chamamos de Linguagem de Programação.\nTome como exemplo o ato de convidar uma pessoa para um encontro: você pergunta à pessoa se ela gostaria de sair com você, e espera uma resposta para que uma decisão seja tomada. Caso a pessoa diga que sim, vocês tem um encontro marcado, e caso a resposta seja não, você pode chorar no caminho para casa.");
//    licao1.put("tela9", "Teste4");
//    licao1.put("questao4", "Por que é necessário estipular uma sequência de instruções?");
//    licao1.put("respostaA4",  "porque não sabemos para onde vamos, e nem de onde viemos.");
//    licao1.put("respostaB4", "porque os dados informados pelo usuário constroem instruções próprias ao serem fornecidos à máquina");
//    licao1.put("respostaC4", "porque é preciso dizer quais passos serão feitos para que o problema tenha solução");
//    licao1.put("respostaD4", "porque o algoritmo recebe dados do usuário, e é necessário que haja um programa para eles");
//}
