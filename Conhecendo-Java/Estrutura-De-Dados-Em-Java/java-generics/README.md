## Generics

Lista<String> minhaLista = new Lista<>();
public class Lista<T> {
	private T t;
	.
	.
	.
}

Contexto:
- Evitar casting excessivo
- Evitar códigos redundantes
- Encontrar erros em tempo de compilação
- Introduzido desde o Java SE 5.0

## Wildcards

Unknown Wildcards (Unbounded)
Bounded Wildcard (Upper Bounded/Lower Bounded)

## Unknown Wildcard

public void imprimeLista(List<?> lista){
	for(Object obj : lista){
		System.out.println(obj);
	}
}
List<Aluno> minhaLista = new List<Aluno>();
imprimeLista(minhaLista);

## UpperBounded Wildcard

public void imprimeLista(List<? extends Pessoa> listaPessoas){
	for(Pessoa p : listaPessoas){
		System.out.println(p);
	}
}
List<Aluno> minhaLista = new List<Aluno>();
imprimeLista(minhaLista);

## LowerBounded Wildcard

public void imprimeLista(List<? super Pessoa> listaPessoas){
	for(Pessoa p : listaPessoas){
		System.out.println(p);
	}
}
List<Aluno> minhaLista = new List<Aluno>();
imprimeLista(minhaLista);

## Convenção

K para "Key", exemplo : Map<K,V>
V para "Value", exemplo : Map<K,V>
E para "Element", exemplo : List<E>
T para "Type", exemplo : Collections#addAll
? quando genérico

