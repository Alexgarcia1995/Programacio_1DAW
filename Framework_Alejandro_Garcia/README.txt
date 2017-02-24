
[Opcions]
Hi ha diferents opcions dins de l'aplicacio:
{Data}: Dona a elegir a l'usuari diferents tipus de format de la data (dd/mm/yyyy, dd-mm-yyyy, yyyy/mm/dd, yyyy-mm-dd)
{Decimals}: Permet a l'usuari elegir quants decimals vol, fins un maxim de 3
{Moneda}:Permet a l'usuari elegir entre tres tipus de moneda (Euros[€],Pound[£],Dolar[$])
{Tema}:Permet elegir 4 tipus de temes(GTK,METAL,WINDOWS,MOTIF)
{Dummies}:Per seleccionar com vols que treballe la aplicacio
{Format fitxer}:Selecciona els tipus de fitxers amb el qual treballa tota la aplicacio(xml,json,txt)
{Llengua}:Permet canviar totalment el llenguatge de tota la aplicacio (Angles,Espanyol, Catala)

En el framework, per a començar en el mode dummies, has d'accedir a les opcions i seleccionar-lo. Una vegada ixes de les opcions, dalt de la finestra,
on es troba el titol d'aquesta, s'aprecia que fica "Menu(Dummies)", que dona a entendre que l'aplicacio ha canviat a mode dummies correctament.

Les opcions s'aguarden sempre automaticament en un fitxer unic per defecte, pero estan les opcions On-demand per a guardar la configuració en una altre fitxer o 
obrir-la desde un fitxer guardat previament. Quan s'obri la configuracio desde un fitxer, aquesta configuracio es guardara automaticament en l'arxiu per defecte de configuracio, ja que si no es guarden, no s'aplica al framework.

Si en algun moment la carrega del fitxer de configuració dona error, la aplicacio te opcions per defecte, es a dir, es carregaran
unes opcions per a que no falle la aplicacio

[CRUD]
Tota la aplicacio treballa referent a unes funcions.  (crear,llegir,actualitzar,eliminar,obrir fitxers i guardar fitxers).
{Crear}: Permet crear un usuari i depenent del tipus, demanara mes dades o menys
{Llegir}: Permet llegir tots els usuaris dels fitxers o be llegir un unic usuari, el qual es selecciona en un desplegable.
{Actualitzar}:Actualitza la informacio del usuaris que es seleccione.
{Eliminar}:Permet eliminar tots els usuaris dels fitxers o be eliminar nomes un usuari, el qual es selecciona en un desplegable.
{Obrir}:Obri manualment un fitxer de usuaris. Si s'obri un fitxer de un tipus de usuari diferent al que estas treballant, no dona
cap error en el moment, sino que el dona error a l'hora de realitzar qualsevol accio de les mencionades anteriorment
{Guardar}:Guarda manualment els canvis realitzats en el tipus de usuari.


[Dummies]
En cas de que estiga el mode dummies activat,tota clase de usuaris pot fer totes les opcions del CRUD. Cap de CRUD guardarà fitxers automaticament, si vols guardar-los
, s'ha de fer amb la funcio de Guardar on demand, pero no es recomanable guardar-los ja que totes les dades son aleatories. 

[Menu principal]

Una vegada entres al "Menu principal", estan els tres tipus d'usuaris a crear (Client,Administrador i Normal).

[Client]
Si decidexies treballar com a Client, ens apareixen 2 opcions : Registrar-se i Iniciar sessio. Per a poder treballar com a client, has d'estar registrat en el sistema.
Si tens un usuari, al iniciar sessio pots Llegir, Actualitzar la informacio de l'usuari que ha iniciat la sessio o Esborrar el teu usuari. En el cas que esborres el 
teu usuari, automaticament ixiras al menu d'iniciar sessio.

[Admin]
Si vols treballar com a Admin, tens les dues mateixes opcions que un Client, no obstant, en el cas de voler Registrar-se, necesites primerament introduir una 
contrasenya (admin). Si pots iniciar sessio, tens permisos de Superadmin, es a dir, pots crear,llegir,eliminar i actualitzar dades tant de Clients com de Admins. 
Com a superadmin, tambe pots obrir i guardar fitxers dels dos tipus d'usuaris. Respecte al order, hauras de seleccionar de quin tipus d'usuari vols ordenar, i 
quan elegisques l'opcio de llegir, la llista d'usuaris s'haura ordenat o no depenent del tipus d'usuari que decidisques llegir. Per exemple, si ordenes per DNI 
els Clients i llegeixes els Admins, aquests no estaran ordenats per DNI. En resum, ordena unicament depenent del tipus d'usuari. Al igual que el client, si borres
el teu usuari ixira al menu d'iniciar sessio.

[Extra]
En els dos casos anteriors, tant a l'hora de registrar-se com d'actualitzar la informacio de l'usuari, es realitzen comprovacions de DNI i de nom d'usuari, per a 
comprovar que no existeixen les dades que introduixes dins del sistema.

[Normal]
Finalment, pel que respecta als usuaris Normals, nomes poden crear i llegir l'usuari que s'ha creat abans. Cada vegada que apretes l'opcio de crear, les dades 
es queden buides,per tant nomes es crea un unic usuari en tot el sistema.
