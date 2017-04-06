#!/usr/bin/env python
# coding: utf-8

import unittest
from problem import *

class TestProblem(unittest.TestCase):
    def test_valorTotalPorQtdLivro(self):
        self.assertEqual(42, livro(1))
        self.assertEqual(84, livro(2))
        self.assertEqual(126, livro(3))
        self.assertEqual(168, livro(4))
        self.assertEqual(210, livro(5))

    def test_calculadesconto(self):
        self.assertEqual(0,calculadesconto(1))
        self.assertEqual(5,calculadesconto(2))
        self.assertEqual(10,calculadesconto(3))
        self.assertEqual(15,calculadesconto(4))
        self.assertEqual(20,calculadesconto(5))
        self.assertEqual(20,calculadesconto(10))

if __name__ == "__main__":
    unittest.main()