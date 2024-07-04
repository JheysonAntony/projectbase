#author: Jheyson Atahuaman
#language: es

Característica: Abriri una página web

  Yo como usuario
  Quiero realizar una prueba de abrir una pagina
  Para comprobar lo robusto y control de errores de la aplicacion o pagina web

  @successful
  Escenario: abrir con el navegador chrome la pagina web x
    Dado que el usuario abre el sitio web de pruebas
    Cuando ingresa al navegador chrome
    Entonces visualizara el titulo de la pagina "cucumber"