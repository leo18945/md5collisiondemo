# MD5 Collision Demo

Test result:

md5(4dc968ff0ee35c209572d4777b721587d36fa7b21bdc56b74a3dc0783e7b9518afbfa20***2***a8284bf36e8e4b55b35f427593d849676da0d1***d***55d8360fb5f07fea2) => 008EE33A9D58B51CFEB425B0959121C9  
md5(4dc968ff0ee35c209572d4777b721587d36fa7b21bdc56b74a3dc0783e7b9518afbfa20***0***a8284bf36e8e4b55b35f427593d849676da0d1***5***55d8360fb5f07fea2) => 008EE33A9D58B51CFEB425B0959121C9  
two md5 hashes are equal? true

md5(d131dd02c5e6eec4693d9a0698aff95c2fcab5***8***712467eab4004583eb8fb7f8955ad340609f4b30283e4888325***7***1415a085125e8f7cdc99fd91dbd***f***280373c5bd8823e3156348f5bae6dacd436c919c6dd53e2***b***487da03fd02396306d248cda0e99f33420f577ee8ce54b67080***a***80d1ec69821bcb6a8839396f965***2***b6ff72a70) => 79054025255FB1A26E4BC422AEF54EB4  
md5(d131dd02c5e6eec4693d9a0698aff95c2fcab5***0***712467eab4004583eb8fb7f8955ad340609f4b30283e4888325***f***1415a085125e8f7cdc99fd91dbd***7***280373c5bd8823e3156348f5bae6dacd436c919c6dd53e2***3***487da03fd02396306d248cda0e99f33420f577ee8ce54b67080***2***80d1ec69821bcb6a8839396f965***a***b6ff72a70) => 79054025255FB1A26E4BC422AEF54EB4  
two md5 hashes are equal? true

md5(0e306561559aa787d00bc6f70bbdfe3404cf03659e7***0***4f8534c00ffb659c4c8740cc942feb2da115a3f415***5***cbb8607497386656d7d1f34a42059d78f5a8dd1ef) => CEE9A457E790CF20D4BDAA6D69F01E41  
md5(0e306561559aa787d00bc6f70bbdfe3404cf03659e7***4***4f8534c00ffb659c4c8740cc942feb2da115a3f415***d***cbb8607497386656d7d1f34a42059d78f5a8dd1ef) => CEE9A457E790CF20D4BDAA6D69F01E41  
two md5 hashes are equal? true

ref:  
https://crypto.stackexchange.com/questions/1434/are-there-two-known-strings-which-have-the-same-md5-hash-value

https://emaragkos.gr/infosec-adventures/create-your-own-md5-collisions/

https://second.wiki/wiki/implementacic3b3n_de_colisic3b3n_en_md5

https://tanishq.page/blogfiles/seedlabs/MD5-collision-crypto.html

https://medium.com/@shrutiavinodh/md5-collision-attack-lab-a-cryptographic-security-seedlab-448329a57f9b
