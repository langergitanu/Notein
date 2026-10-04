package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class zzZ6F {
    public static final String DATA = zzZAQ.zzWFM.getId();
    public static final String DIGEST_MD5;
    public static final String DIGEST_SHA1;
    public static final String DIGEST_SHA224;
    public static final String DIGEST_SHA256;
    public static final String DIGEST_SHA384;
    public static final String DIGEST_SHA512;
    private static final Map zzWmG;
    private static final Set zzWmH;
    private static final String zzWmI;
    private static final String zzWmJ;
    private static final String zzWmK;
    private static final String zzWmL;
    private static final String zzWmM;
    public static final String zzWmN;
    public static final String zzWmO;
    public static final String zzWmP;
    public static final String zzWmQ;
    public static final String zzWmR;
    public static final String zzWmS;
    public static final String zzWmT;
    public static final String zzWmU;
    public static final String zzWmV;
    public static final String zzWmW;
    protected zzYHG zzWmA;
    protected Map zzWmB;
    protected List zzWmC;
    protected List zzWmD;
    protected List zzWmE;
    protected List zzWmF;

    static {
        String id = zzZ9K.zzWyW.getId();
        DIGEST_SHA1 = id;
        String id2 = zzZ9O.zzWAI.getId();
        DIGEST_SHA224 = id2;
        String id3 = zzZ9O.zzWAL.getId();
        DIGEST_SHA256 = id3;
        String id4 = zzZ9O.zzWAK.getId();
        DIGEST_SHA384 = id4;
        String id5 = zzZ9O.zzWAJ.getId();
        DIGEST_SHA512 = id5;
        DIGEST_MD5 = zzZ96.zzWy5.getId();
        zzWmW = zzZAE.zzWF1.getId();
        zzWmV = zzZ8R.zzWBE.getId();
        zzWmU = zzZ8R.zzWBF.getId();
        zzWmT = zzZ8R.zzWu4.getId();
        zzWmS = zzZ96.zzWyA.getId();
        String id6 = zzZ6W.zzWnC.getId();
        zzWmR = id6;
        zzZDA zzzda = zzZ6W.zzWoe;
        String id7 = zzzda.getId();
        zzWmQ = id7;
        zzWmP = zzZ96.zzWys.getId();
        zzWmO = zzZAE.zzWER.getId();
        zzWmN = zzZAE.zzWEQ.getId();
        String id8 = zzzda.getId();
        zzWmM = id8;
        String id9 = zzZ6W.zzWoa.getId();
        zzWmL = id9;
        String id10 = zzZ6W.zzWo9.getId();
        zzWmK = id10;
        String id11 = zzZ6W.zzWo8.getId();
        zzWmJ = id11;
        String id12 = zzZ6W.zzWo7.getId();
        zzWmI = id12;
        HashSet hashSet = new HashSet();
        zzWmH = hashSet;
        HashMap map = new HashMap();
        zzWmG = map;
        hashSet.add(id6);
        hashSet.add(id7);
        hashSet.add(id8);
        hashSet.add(id9);
        hashSet.add(id10);
        hashSet.add(id11);
        hashSet.add(id12);
        map.put(id, id8);
        map.put(id2, id9);
        map.put(id3, id10);
        map.put(id4, id11);
        map.put(id5, id12);
    }

    public zzZ6F() {
        this(new zzYHJ());
    }

    public final void zzZ(zzYGK zzygk) throws zzZ6M {
        this.zzWmF.addAll(zzZ6C.zzY(zzygk));
    }

    private zzZ6F(zzYHG zzyhg) {
        this.zzWmF = new ArrayList();
        this.zzWmE = new ArrayList();
        this.zzWmD = new ArrayList();
        this.zzWmC = new ArrayList();
        this.zzWmB = new HashMap();
        this.zzWmA = zzyhg;
    }

    public final void zzZ(zzZ65 zzz65) {
        this.zzWmC.add(zzz65);
    }
}
