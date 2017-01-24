# dojo-clojure

The dojo solution achieved on 25/07/2016

## Proposal

Implement the following matrix and array functions:
- (matrix *width* *height*): create matrix with *width* columns and *height* lines;
- (getij *matrix* *i* *j*): retrieve elements from *matrix* on (*i*,*j*) position;
- (replace-idx *coll* *idx* *x*): replace element in *coll* on *idx* position by *x*;
- (setij *matrix* *i* *j* *x*): replace element in *matrix* on (*i*,*j*) by *x*;
- (diag *matrix*): retrieve the elements of *matrix*'s main diagonal.

## Usage

Run iteractive terminal:
```
lein repl
> (require '[dojo-clojure.core :refer :all] :reload)
;; start using the functions
```

Run tests:
```
lein test
```
