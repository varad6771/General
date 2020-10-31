def is_anagram(str1, str2):
	ctr = 0
	s2dict = dict()

	for i in range(len(str2)):
		s2dict[i] = str2[i]


	for i in range(len(str1)):
		if str1[i] in s2dict.values():
			ctr = ctr + 1

	if ctr == len(str1):
		return True
	else:
		return False



if __name__ == "__main__":
	istring1 = input().strip()
	istring2 = input().strip()
	print(is_anagram(istring1, istring2))