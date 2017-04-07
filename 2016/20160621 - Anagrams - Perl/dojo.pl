#!/usr/bin/env perl

sub find_anagrams  {
	my @words = @_;

	map {[$_]} @words[0..3]
}

sub is_anagram {
	my $first = join sort split /\s+/, shift;
	my $second = join sort split /\s+/, shift;
	print "$first == $second";
	return $first eq $second;
}
