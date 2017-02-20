En el framework, per a començar en el mode dummies, has d'accedir a les opcions i seleccionar-lo. Una vegada ixes de les opcions, dalt de la finestra,
on es troba el titol d'aquesta, s'aprecia que fica "Menu(Dummies)", que dona a entendre que l'aplicacio ha canviat a mode dummies correctament.

En cas de que estiga el mode dummies activat, cap dels CRUD guardarà fitxers automaticament, si vols guardar-los, s'ha de fer amb la funcio de Guardar on demand, pero
no es recomanable guardar-los ja que totes les dades son aleatories

Les opcions s'aguarden sempre automaticament en un fitxer unic per defecte, pero estan les opcions On-demand per a guardar la configuració en una altre fitxer o 
obrir-la desde un fitxer guardat previament. Quan s'obri la configuracio desde un fitxer, aquesta configuracio es guardara automaticament en l'arxiu per defecte 
de configuracio, ja que si no es guarden, no s'aplica al framework.

Una vegada entres al "Menu principal", estan els tres tipus d'usuaris a crear (Client,Administrador i Normal).

Si decidexies treballar com a Client, ens apareixen 2 opcions : Registrar-se i Iniciar sessio. Per a poder treballar com a client, has d'estar registrat en el sistema.
Si tens un usuari, al iniciar sessio pots Llegir, Actualitzar la informacio de l'usuari que ha iniciat la sessio o Esborrar el teu usuari. En el cas que esborres el 
teu usuari, automaticament ixiras al menu anterior.

Si vols treballar com a Admin, tens les dues mateixes opcions que un Client, no obstant, en el cas de voler Registrar-se, necesites primerament introduir una 
contrasenya (admin). Si pots iniciar sessio, tens permisos de Superadmin, es a dir, pots crear,llegir,eliminar i actualitzar dades dels Clients i dels Admins. 
Com a superadmin, tambe pots obrir i guardar fitxers dels dos tipus d'usuaris. Respecte al order, hauras de seleccionar de quin tipus d'usuari vols ordenar, i 
quan elegisques l'opcio de llegir, la llista d'usuaris s'haura ordenat o no depenent del tipus d'usuari que decidisques llegir. Per exemple, si ordenes per DNI 
els Clients i llegeixes els Admins, aquests no estaran ordenats per DNI. En resum, ordena unicament depenent del tipus d'usuari.

En els dos casos anteriors, tant a l'hora de registrar-se com d'actualitzar la informacio de l'usuari, es realitzen comprovacions de DNI i de nom d'usuari, per a 
comprovar que no existeixen les dades que introduixes dins del sistema.

Finalment, pel que respecta als usuaris Normals, nomes poden crear i llegir l'usuari que s'ha creat abans. Cada vegada que apretes l'opcio de crear, les dades 
es queden buides,per tant nomes es crea un unic usuari en tot el sistema.