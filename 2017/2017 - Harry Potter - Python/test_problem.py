#!/usr/bin/env python
# coding: utf-8

import unittest
from problem import *


class TestProblem(unittest.TestCase):
    def test_umlivro(self):
        self.assertEqual(42, livro(1))

    def test_doislivro(self):
        self.assertEqual(84, livro(2))


if __name__ == "__main__":
    unittest.main()

