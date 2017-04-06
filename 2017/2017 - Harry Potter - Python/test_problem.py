#!/usr/bin/env python
# coding: utf-8

import unittest
from problem import *


class TestProblem(unittest.TestCase):
    def test_umlivro(self):
        self.assertEqual(42, livro(1))

    def test_doislivros(self):
        self.assertEqual(84, livro(2))

    def test_treslivros(self):
        self.assertEqual(126, livro(3))

    def test_quatrolivros(self):
        self.assertEqual(168, livro(4))

    def test_cincolivros(self):
        self.assertEqual(210, livro(5))

    def test_calculadesconto(self):
        self.assertEqual(0,calculadesconto(1))
        self.assertEqual(5,calculadesconto(2))
           



if __name__ == "__main__":
    unittest.main()

