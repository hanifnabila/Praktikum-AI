information([I], keterangan(I)) :- 
    member(I, [kemarin, tadi]).

verb([V], katakerja(V)) :- 
    member(V, [makan, minum]).

noun([N], katabenda(N)) :- 
    member(N, [manusia, anjing, nasi, daging, air]).

determiner([D], determinan(D)) :- 
    member(D, [seorang, seekor]).

verb_phrase(VP, predikat(VTree)) :- 
    verb(VP, VTree).

verb_phrase(VP, frasa_kerja(VTree, NTree)) :- 
    verb(V, VTree), 
    noun(N, NTree), 
    append(V, N, VP).

noun_phrase(NP, subyek(DTree, NTree)) :- 
    determiner(D, DTree), 
    noun(N, NTree), append(D, N, NP).

sentence(S, kalimat(NPTree, VPTree, ITree)) :- 
        noun_phrase(NP, NPTree), 
        verb_phrase(VP, VPTree), 
        information(I, ITree), 
        append(NP, VP, NPVP), 
        append(NPVP, I, S).

sentence(S, kalimat(NPTree, VPTree)) :- 
    noun_phrase(NP, NPTree), 
    verb_phrase(VP, VPTree), 
    append(NP, VP, S).