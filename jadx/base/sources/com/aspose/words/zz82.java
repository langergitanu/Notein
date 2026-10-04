package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zz82 implements Cloneable {
    private boolean zzZ3X;
    private zzH1 zzZ3Z;
    private String zzZ40;
    private zzFK zzZ41;
    private zzFT zzZ42;
    private zzZZW zzZ43;
    private zz4T zzZ44;
    private zz4G zzZ45;
    private boolean zzZ46;
    private zzD9 zzZ47;
    private zz7X zzZ48;
    private String zzZ49;
    private String zzkB;
    private com.aspose.words.internal.zzZOZ zzZ3Y = com.aspose.words.internal.zzZOZ.zzZXP;
    private com.aspose.words.internal.zzZYT<byte[]> zzZ3W = new com.aspose.words.internal.zzZYT<>();

    public zz82(String str, String str2) {
        this.zzkB = str;
        this.zzZ49 = str2;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public static zz82 zzZ(com.aspose.words.internal.zzZYG<zz82> zzzyg, String str) {
        zz82 zz82Var = zzzyg.get(str);
        if (zz82Var != null) {
            return zz82Var;
        }
        zz82 zz82Var2 = new zz82(str, null);
        zzzyg.set(str, zz82Var2);
        return zz82Var2;
    }

    public final String getUri() {
        return this.zzkB;
    }

    public final String zzIe(int i) {
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(this.zzZ49, (Map<String, String>) null);
        boolean z = i == 2;
        boolean z2 = !com.aspose.words.internal.zzZKN.equals(zzo.getNamespaceURI(), zzZX5.zzMQ(zzo.getNamespaceURI()));
        return (z2 == (true ^ com.aspose.words.internal.zzZKN.equals(zzo.getNamespaceURI(), zzZX5.zzMP(zzo.getNamespaceURI()))) || z2 != z) ? zzo.zzZ(new zz6D(z), (com.aspose.words.internal.zzZSO) null) : this.zzZ49;
    }

    public final void zzO(com.aspose.words.internal.zzZOZ zzzoz) {
        this.zzZ3Y = zzzoz;
    }

    public final void zzOI(String str) {
        this.zzZ40 = str;
    }

    public final void zzOJ(String str) {
        this.zzZ49 = str;
    }

    public final void zzW(zzFT zzft) {
        this.zzZ42 = zzft;
    }

    public final void zzX(zz7X zz7x) {
        this.zzZ48 = zz7x;
    }

    public final void zzXh(boolean z) {
        this.zzZ3X = z;
    }

    public final void zzXi(boolean z) {
        this.zzZ46 = z;
    }

    public final void zzY(zzD9 zzd9) {
        this.zzZ47 = zzd9;
    }

    public final boolean zzZBM() {
        return this.zzZ3X;
    }

    public final com.aspose.words.internal.zzZYT<byte[]> zzZBN() {
        return this.zzZ3W;
    }

    public final zzH1 zzZBO() {
        return this.zzZ3Z;
    }

    public final String zzZBP() {
        return this.zzZ40;
    }

    public final com.aspose.words.internal.zzZOZ zzZBQ() {
        return this.zzZ3Y;
    }

    public final zzFK zzZBR() {
        if (this.zzZ41 == null) {
            this.zzZ41 = new zzFK();
        }
        return this.zzZ41;
    }

    public final zzFT zzZBS() {
        return this.zzZ42;
    }

    public final zzZZW zzZBT() {
        return this.zzZ43;
    }

    public final boolean zzZBU() {
        return this.zzZ46;
    }

    public final zz4T zzZBV() {
        return this.zzZ44;
    }

    public final zz4G zzZBW() {
        return this.zzZ45;
    }

    public final zzD9 zzZBX() {
        return this.zzZ47;
    }

    public final zz7X zzZBY() {
        return this.zzZ48;
    }

    public final String zzZBZ() {
        return this.zzZ49;
    }

    public final zz82 zzZC0() {
        zz82 zz82Var = (zz82) memberwiseClone();
        zz4T zz4t = this.zzZ44;
        if (zz4t != null) {
            zz82Var.zzZ44 = zz4t.zzZy0();
        }
        zz7X zz7x = this.zzZ48;
        if (zz7x != null) {
            zz82Var.zzZ48 = zz7x.zzZQ6();
        }
        zz4G zz4g = this.zzZ45;
        if (zz4g != null) {
            zz82Var.zzZ45 = zz4g.zzZxK();
        }
        zzZZW zzzzw = this.zzZ43;
        if (zzzzw != null) {
            zz82Var.zzZ43 = zzzzw.zzZs2();
        }
        zzFT zzft = this.zzZ42;
        if (zzft != null) {
            zz82Var.zzZ42 = zzft.zzZNH();
        }
        zzFK zzfk = this.zzZ41;
        if (zzfk != null) {
            zz82Var.zzZ41 = zzfk.zzZN7();
        }
        zzH1 zzh1 = this.zzZ3Z;
        if (zzh1 != null) {
            zz82Var.zzZ3Z = zzh1.zzZQc();
        }
        return zz82Var;
    }

    public final void zzX(zzH1 zzh1) {
        this.zzZ3Z = zzh1;
    }

    public final void zzY(zz4G zz4g) {
        this.zzZ45 = zz4g;
    }

    public static zz82 zzZ(byte[] bArr, DocumentBase documentBase) {
        zzH1 zzh1 = new zzH1();
        zzh1.zzY(documentBase);
        zzh1.zzYt(bArr);
        zz82 zz82Var = new zz82("{96DAC541-7B7A-43D3-8B79-37D633B846F1}", null);
        zz82Var.zzZ3Z = zzh1;
        return zz82Var;
    }

    public final void zzZ(zz4T zz4t) {
        this.zzZ44 = zz4t;
    }

    public final void zzZ(zzZZW zzzzw) {
        this.zzZ43 = zzzzw;
    }
}
