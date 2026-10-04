package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5X {
    private static zzZWM zzYNh = new zzZWM();
    private static zzZX3 zzYNm;
    private static zzZWG zzYNn;
    private static zzZWH zzYNp;

    static {
        zzZWS zzzws = new zzZWS();
        zzZXA zzzxa = new zzZXA(new zzZXB(), new zzZWJ());
        zzZX1 zzzx1 = new zzZX1(zzzws, zzYNh);
        zzzxa.zzZ(new zzZYI(new zzYVG(zzzws, zzzx1), zzzxa, zzYNh));
        zzYNp = new zzZWH(new zzZX0(zzzx1, zzzxa));
        zzY2D zzy2d = new zzY2D();
        zzYNn = new zzZWG(zzzx1, zzzws);
        zzYNm = new zzZX3(zzzx1, zzzws, zzy2d);
    }

    public static void zzY(Document document, byte[] bArr) throws Exception {
        com.aspose.words.internal.zz79 zz79Var = new com.aspose.words.internal.zz79(new com.aspose.words.internal.zzZOR(bArr));
        zzZW9.zzZ(zzZ(document, zz79Var, zz79Var.zzZ(zz79Var.zzZ((com.aspose.words.internal.zz77) null, zzZWV.zz0(0, false)), zzZWV.zz0(10, false))));
    }

    private static zzZ5W zzZ(Document document, com.aspose.words.internal.zz79 zz79Var, com.aspose.words.internal.zz77 zz77Var) throws Exception {
        return new zzZ5W(document, zz79Var, zz77Var, zzYNn, zzYNp, zzYNm, zzYNh);
    }
}
