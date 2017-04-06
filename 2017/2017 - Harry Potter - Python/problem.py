#!/usr/bin/env python
# coding: utf-

descontos = {1:0, 2:5, 3:10, 4:15, 5:20}

def livro(liv):
	liv*=42
	return liv

def calculadesconto(num_liv):
	percentual_descontos = descontos[num_liv]
	if num_liv == 2:
		return 5
	return percentual_descontos