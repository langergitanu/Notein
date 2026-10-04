package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz8Z {
    private zz8P zzZ5r;
    private zz8U zzZ5s;
    private zz9A zzZ5t;
    private Shape zzZ5u;
    private zz9P zzZ5v;
    private zz9M zzZ5w;
    private zz8W zzZ5x = new zz8W(this);
    private zz50 zzZ5y;
    private zzAV zzZ6Z;
    private zzAL zzZ73;
    private zzB6 zzZhM;

    public zz8Z(zz50 zz50Var, zzAV zzav) {
        this.zzZ5y = zz50Var;
        this.zzZ6Z = zzav;
        zzAL zzal = new zzAL(this.zzZ6Z.zzZER());
        this.zzZ73 = zzal;
        this.zzZ5w = new zz9M(zzal);
        this.zzZ5v = new zz9P(this);
        this.zzZ5u = new Shape(this.zzZ6Z.zzZye().getDocument(), (byte) 0);
        this.zzZhM = new zzB6(this);
        this.zzZ5s = new zz8U(this);
        this.zzZ5r = new zz8P(this);
        this.zzZ5t = new zz9A();
    }

    public final DocumentBase getDocument() {
        return this.zzZ6Z.zzZye().getDocument();
    }

    public final String zzZCE() {
        return this.zzZ6Z.zzZES().getUniqueId();
    }

    public final zz8P zzZCF() {
        return this.zzZ5r;
    }

    public final zz8U zzZCG() {
        return this.zzZ5s;
    }

    public final zzB6 zzZCH() {
        return this.zzZhM;
    }

    public final zz9A zzZCI() {
        return this.zzZ5t;
    }

    public final Shape zzZCJ() {
        return this.zzZ5u;
    }

    public final zz9P zzZCK() {
        return this.zzZ5v;
    }

    public final zz9M zzZCL() {
        return this.zzZ5w;
    }

    public final zz8W zzZCM() {
        return this.zzZ5x;
    }

    public final zz8S zzZCN() {
        return this.zzZ6Z.zzZEQ();
    }

    public final zzAT zzZCO() {
        return this.zzZ6Z.zzZEP();
    }

    public final zzAV zzZCP() {
        return this.zzZ6Z;
    }

    public final zzZC3 zzZCQ() {
        return this.zzZ5y.zzZIB();
    }

    public final long zzZCR() {
        return com.aspose.words.internal.zzZPW.zzG((float) (((double) Float.intBitsToFloat((int) this.zzZ5y.zzZIz())) / 2.834645669291339d), (float) (((double) com.aspose.words.internal.zzZPW.zzYz(this.zzZ5y.zzZIz())) / 2.834645669291339d));
    }

    public final long zzZCS() {
        return com.aspose.words.internal.zzZPW.zzG(com.aspose.words.internal.zzSA.zzp(Float.intBitsToFloat((int) this.zzZ5y.zzZIz())), com.aspose.words.internal.zzSA.zzp(com.aspose.words.internal.zzZPW.zzYz(this.zzZ5y.zzZIz())));
    }

    public final zz50 zzZCT() {
        return this.zzZ5y;
    }

    public final zz9L zzZES() {
        return this.zzZ6Z.zzZES();
    }

    public final zzAL zzZEk() {
        return this.zzZ73;
    }
}
