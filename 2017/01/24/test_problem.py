#!/usr/bin/env python
# coding: utf-8

import unittest
from problem import *


class TestProblem(unittest.TestCase):
    def test_miojo_3_min_amp1_5_amp2_7_tempo_tot_10(self):
        total = calcula_miojo(3, 5, 7)
        self.assertEqual(total, 10)

    def test_miojo_2_min_amp1_5_amp2_7_tempo_tot_7(self):
        total = calcula_miojo(2, 5, 7)
        self.assertEqual(total, 7)

    def test_miojo_3_min_amp1_5_amp2_5_nao_pode(self):
        total = calcula_miojo(3, 5, 5)
        self.assertEqual(total, "Não é possivel calcular o tempo do miojo" )

    def test_miojo_3_min_amp1_7_amp2_5_tempo_tot_10(self):
        total = calcula_miojo(3, 7, 5)
        self.assertEqual(total, 10)

    def test_miojo_2_min_amp1_7_amp2_5_tempo_tot_10(self):
        total = calcula_miojo(2, 7, 5)
        self.assertEqual(total, 7)   

if __name__ == "__main__":
    unittest.main()

