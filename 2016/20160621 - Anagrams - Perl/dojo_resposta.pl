sub find_anagrams {
   my @words = @_;
   for my $word(@words) {
      push @{ $anagrams{join "", sort split //, $word} }, $word
   }
   return [ values %anagrams ]
}

use Data::Dumper;
print Dumper find_anagrams(qw/beta beats tabu beat alert beast later/)
