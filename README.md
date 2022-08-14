


#  Bounded wildcards / Curingas delimitados - Java

A partir do código abaixo criei as funções **copy** e **printList**. O objetivo foi trazer elementos de uma lista para outra mais genérica, que contenha Integer e Double.

	List<Integer> myInts  =  Arrays.asList(1, 2, 3, 4);
	List<Double> myDoubles  =  Arrays.asList(3.14, 6.28);
	List<Object> myObjs  =  new  ArrayList<Object>();

	copy(myInts, myObjs);
	printList(myObjs);

	System.out.println("-----");	
	
	copy(myDoubles, myObjs);
	printList(myObjs);

### Resultado:

	1
	2
	3
	4
	-----
	1
	2
	3
	4
	3.14
	6.28



---
Ferramentas utilizadas: 
<p align="left">
<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>
<a href="https://www.w3.org/html/" target="_blank" rel="noreferrer"> 
 <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/>