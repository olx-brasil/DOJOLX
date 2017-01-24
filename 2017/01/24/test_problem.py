#!/usr/bin/env python
# coding: utf-8

import unittest
from problem import *


class TestProblem(unittest.TestCase):
    def test_miojo_3_min_amp1_5_amp2_7_tempo_tot_10(self):
        total = calcula_miojo(3, 5, 7)
        assertEqual(total)



if __name__ == "__main__":
    unittest.main()

