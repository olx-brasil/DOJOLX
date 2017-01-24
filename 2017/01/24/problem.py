#!/usr/bin/env python
# coding: utf-8
def calcula_miojo(temp, amp1, amp2):
    if amp1 == amp2:
        return "Não é possivel calcular o tempo do miojo"

    menor = amp1
    maior = amp2

    if menor > maior:
        aux = maior
        maior = menor
        menor = aux

    diferenca = abs(amp2 - amp1)
    if diferenca == temp:       
        return maior
    else: 
       return calcula_miojo(temp, menor + menor, maior) 
