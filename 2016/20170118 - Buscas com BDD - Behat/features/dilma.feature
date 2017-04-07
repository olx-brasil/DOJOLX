#language:pt
Funcionalidade: Busca na Web
  Eu como usuário devo ir no Wikipedia
  Buscar Dilma e ver o resultado

  Cenário: Buscar no Wikipedia
    Dado estou em "https://pt.wikipedia.org"
    Quando preencho "searchInput" com "dilma"
    E pressiono "go"
    Então devo ver "Dilma Rousseff"

  Cenário: Buscar no DuckDuckGo
    Dado estou em "https://duckduckgo.com"
    Quando preencho "q" com "dilma"
    E pressiono "search_button_homepage"
    Entao devo ver "Dilma Rousseff"

  Cenário: Buscar Tré no Google
    Dado estou em "https://www.google.com.br"
    Quando preencho "q" com "Tré"
    E pressiono "Pesquisa Google"
    Então devo ver "TRE"
