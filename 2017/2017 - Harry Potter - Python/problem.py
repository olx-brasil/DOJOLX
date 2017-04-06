#!/usr/bin/env python
# coding: utf-8

descontos = {1:0, 2:5, 3:10, 4:15, 5:20}

def livro(liv):
	liv*=42
	return liv

def calculadesconto(num_liv):
	if num_liv > len(descontos):
		return descontos[len(descontos)]
	percentual_descontos = descontos[num_liv]
	return percentual_descontos