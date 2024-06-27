//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

# Criado por https://www.toptal.com/developers/gitignore/api/java,eclipse,visualstudiocode,intellij+all
        # Edite em https://www.toptal.com/developers/gitignore?templates=java,eclipse,visualstudiocode,intellij+all

        ###Eclipse###
        .metadados
caixa/
tmp/
        *.tmp
*.bak
*.swp
*~.nib
propriedades locais
.configurações/
        .loadpath
        .recomendadores

# Construtores de ferramentas externas
.externalToolBuilders/

        # "Configurações de inicialização do Eclipse" armazenadas localmente
*.lançar

# Específico do PyDev (IDE Python para Eclipse)
*.pydevprojeto

# Específico de CDT (ferramentas de desenvolvimento C/C++)
.cprojeto

# CDT- ferramentas automáticas
.autotools

# Processador de anotação Java (APT)
.factorypath

# Específico para PDT (ferramentas de desenvolvimento PHP)
.buildpath

# plugin sbteclipse
.alvo

# Plug-in Tern
.tern-projeto

# Plugin TeXlipse
.texlipse

# STS (Suíte de ferramentas Spring)
.springBeans

# Recomendadores de código
        .recomendadores/

        # Processamento de anotação
        .apt_generated/
        .apt_generated_test/

        # Scala IDE específico (desenvolvimento Scala e Java para Eclipse)
.cache-principal
        .scala_dependencies
        .planilha

# Remova o comentário desta linha se desejar ignorar o arquivo de descrição do projeto.
# Normalmente, este arquivo seria rastreado se contivesse configurações de compilação/dependência:
        #.projeto

###Eclipse Patch###
        # Ferramentas de inicialização Spring
.sts4-cache/

        ### Intellij + todos ###
        # Abrange IDEs JetBrains: IntelliJ, RubyMine, PhpStorm, AppCode, PyCharm, CLion, Android Studio, WebStorm e Rider
# Referência: https://intellij-support.jetbrains.com/hc/en-us/articles/206544839

        # Coisas específicas do usuário
.idea/**/workspace.xml
.ideia/**/tarefas.xml
.idea/**/usage.statistics.xml
        .idea/**/dicionários
.idea/**/prateleira

# Específico do usuário da AWS
.idea/**/aws.xml

#Arquivos gerados
.idea/**/contentModel.xml

# Arquivos sensíveis ou de alta rotatividade
.idea/**/dataSources/
        .idea/**/dataSources.ids
.idea/**/dataSources.local.xml
.idea/**/sqlDataSources.xml
.idea/**/dynamic.xml
.idea/**/uiDesigner.xml
.idea/**/dbnavigator.xml

#Gradle
.idea/**/gradle.xml
        .idea/**/bibliotecas

# Gradle e Maven com importação automática
# Ao usar Gradle ou Maven com importação automática, você deve excluir arquivos de módulo,
        # já que eles serão recriados e poderão causar rotatividade. Remova o comentário se estiver usando
# importação automática.
        # .idea/artefatos
# .idea/compiler.xml
#.idea/jarRepositories.xml
#.idea/modules.xml
# .idea/*.iml
# .idea/módulos
# *.iml
# *.ipr

# CMake
cmake-construir-*/

# Plug-in do Mongo Explorer
.idea/**/mongoSettings.xml

# Formato de projeto baseado em arquivo
*.iws

#IntelliJ
fora/

        # plugin mpeltonen/sbt-idea
        .idea_modules/

        # Plug-in JIRA
atlassian-ide-plugin.xml

# Plugin Clojure cursivo
        .idea/replstate.xml

#Plugin SonarLint
.idea/sonarlint/

        # Plugin Crashlytics (para Android Studio e IntelliJ)
com_crashlytics_export_strings.xml
crashlytics.properties
crashlytics-build.properties
tecido.propriedades

# Cliente Rest baseado em editor
        .idea/httpRequests

# Arquivo de cache serializado do Android Studio 3.1+
        .idea/caches/build_file_checksums.ser

### Intellij + todos os patches ###
        # Ignore tudo, exceto configurações de estilo de código e configurações de execução
# que deveriam ser compartilhados entre as equipes.

.ideia/*

!.idea/codeStyles
!.idea/runConfigurações

###Java###
#Arquivo de classe compilado
*.aula

# Arquivo de log
*.registro

#Arquivos BlueJ
*.ctxt

# Ferramentas Móveis para Java (J2ME)
.mtj.tmp/

# Arquivos de pacote #
*.jar
*.guerra
*.nar
*.orelha
*.fecho eclair
*.tar.gz
*.rar

# logs de falhas de máquinas virtuais, consulte http://www.java.com/en/download/help/error_hotspot.xml
hs_err_pid*
repetição_pid*

###VisualStudioCode###
.vscode/*
!.vscode/settings.json
!.vscode/tasks.json
!.vscode/launch.json
!.vscode/extensões.json
!.vscode/*.code-snippets

# Histórico local para código do Visual Studio
.história/

# Construídas extensões de código do Visual Studio
*.vsix

###Patch do VisualStudioCode###
# Ignorar todo o histórico local de arquivos
.história
.ionido

# Fim de https://www.toptal.com/developers/gitignore/api/java,eclipse,visualstudiocode,intellij+all