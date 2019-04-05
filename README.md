# Hearthstone Artbook

## Présentation

Projet de programmation mobile fait dans le cadre de la troisième année au sein de l'ESIEA.
Celui-ci démontrant l'utilisation d'une architecture MVVM dans une application Android codé en Java.

Cette application affiche une liste des cartes du jeu *Hearthstone* utilisant l'API hearthstonejson.

### Consignes respectées:

 -   Clean Architecture & **MVVM**
 - Appels à une **API REST**
 - **2 écrans** avec **animations** de transition
 - Affichage d'une liste dans un **RecyclerView**
 - Affichage du **détail de l'item** lors du clique
 - **GitFlow**
 - Stockage des données dans le **cache**
 - Autres:
	 - **Barre de recherche** filtrant par *nom de carte* ou par *classe* d'appartenance
	 - Retour à la liste depuis le détail d'une carte en **balayant** l'écran vers la droite
	
## Fonctionnalités 

### Ecran d'accueil

 - **Premier écran** contenant la barre de recherche et la liste des cartes, chaque carte affichant :
	 - Son **artwork** 
	 - Son **nom**
	 - Sa **classe** ( en Anglais )
	 - Son **texte descriptif**

![Premier écran contenant la barre de recherche et la liste des cartes](https://lh3.googleusercontent.com/oqbbeMDAHpA3XDlCUlwfCPUFUTDFtEnVSggaZ0aqtQnCQ6tEjd2qqsv4O9VOS75RISF5fIWwKByz)
          
          
 ### Ecran de détail

 - **Second écran** contenant le détail de la carte, on y retrouve ainsi :
	 - Comme dans la liste son artwork, son nom, sa classe et son texte descriptif
	 - **Le nom de l'artiste** ayant dessiné l'artwork
	 - Puis logé dans un  NestedScroll view **la carte** en elle même ( affichant ainsi ses dégâts d'attaques , ses points de vie, sa rareté, son coût, son effet, etc...)

![](https://lh3.googleusercontent.com/OFSkflkG4wz8JyCfu9LYtuvst1NOH0YGMxI_z7km9nvkzjfJonEL8SJejjHKCqnZiwB0BTl94Tiv) ![](https://lh3.googleusercontent.com/t2_Oa9XNjQDAfIS6vMtVTdHlHO2C-bkZ_D5xEJiGtfoiNsfH70ddx76h_3RgdtM9qpb4YppXO_zS)

### Animation entre écrans

 - **Animation** entre l'écran d'accueil et l'écran de détails ( avec vu du **NestedScrollView**).

![](https://media.giphy.com/media/iY8CPcM0QupwQ0GS9G/giphy.gif)

### Filtrage de la liste à l'aide d'une barre de recherche

 - **Filtre** permettant de rechercher une carte contenant des **termes spécifique** ou, de spécifier **une classe** dont on veut voir les cartes ( le nom de la classe étant en Anglais ).
 
![](https://media.giphy.com/media/1AgDPLDVmapXFP7v3I/giphy.gif) ![enter image description here](https://media.giphy.com/media/NS5WuKFPtLdadLWmds/giphy.gif)

### Retour au menu

 - **Gestuelle** permettant de retourner à la liste en balayant l'écran vers la droite.


![](https://media.giphy.com/media/5mWKLFZEaS4P6Zbb7i/giphy.gif)





























