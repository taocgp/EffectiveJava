package com.justao.effective.item36;

import java.util.HashSet;
import java.util.Set;
/**
 * 堅持使用@注解 除非具體類實現了接口或抽象類的方法
 * @author tao
 *
 */
public class Bigram {
	private final char first;
	private final char second;
	
	public Bigram(char first, char second) {
		this.first = first;
		this.second = second;
	}
	@Override
	public boolean equals(Object o) {
		if(! (o instanceof Bigram))
			return false;
		Bigram b = (Bigram)o;
		return b.first == first && b.second == second;
	}
	@Override
	public int hashCode() {
		return 31*first + second;
	}
	/*
	 * 程序入口
	 */
	public static void main(String[] args) {
		Set<Bigram> s = new HashSet<Bigram>();
		for (int i = 0; i < 10; i++) {
			for(char ch = 'a';  ch<='z'; ch++){
				s.add( new Bigram(ch, ch) );
			}
		}
		System.out.println(s.size());
	}
}
