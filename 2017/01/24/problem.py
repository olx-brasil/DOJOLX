#!/usr/bin/env python
# coding: utf-8
def calcula_miojo(temp, amp1, amp2):
    if amp1 == amp2:
        return "Não é possivel calcular o tempo do miojo"

    diferenca = abs(amp2 - amp1)
    if diferenca == temp:
        maior_amp = amp1 if amp1 > amp2 else amp2
        return maior_amp

    else: 
       menor = amp1 if amp1 < amp2 else amp2
       maior = amp1 if amp1 > amp2 else amp2
       return calcula_miojo(temp, menor + menor, maior) 
