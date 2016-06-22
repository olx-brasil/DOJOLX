use Test::More; #tests => 2;
do "dojo.pl";

my @expected = (["alert", "later"], ["beta", "beat"], ["beats", "beast"], ["tabu"]);
my @result = find_anagrams(qw/beta beats tabu beat alert beast later/);
print "(@result)\n";
ok(@result == 4);
is(ref $result[0], "ARRAY");

#test if is anagram
my $anagram_result = is_anagram("beta", "beat");
ok($anagram_result);
my $second_result = is_anagram("beta", "beats");
ok(not $second_result);

done_testing;
