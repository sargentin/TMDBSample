TMDB Sample pour Android
========================

Selon l'énoncé préalablement donné, cette application exercice contient les éléments suivants :
* Vues List/Detail (pour smartphone et tablette) avec rotation
* Les données viennent de [The Movie Database](https://www.themoviedb.org/documentation/api)
* La liste contient des vignettes, et le titre du film en mode smartphone
* Dans la vue de détail, les affiches des films sont agrandis, et il est également possible de partager le film

**En BONUS :**
Le mode offline est implémenté via Realms.
Seuls la liste des films populaires a été utilisé pour cet exercice.

Les librairies suivantes ont été utilisé :
* [Realm](https://realm.io/docs/java/latest/) (bien évidemment) pour la base de données offline
* [Volley](https://developer.android.com/training/volley/index.html) comme client HTTP
* [Gson](https://github.com/google/gson) pour le traitement des données JSON
* et [Picasso](https://square.github.io/picasso/) pour la récupération des images depuis TMDB
