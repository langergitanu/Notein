package com.aspose.words;

import com.aspose.slides.PatternStyle;

/* JADX INFO: loaded from: classes6.dex */
class zzZ5Q extends zzZ5P {
    private String zzYeE;
    private String zzYeF;
    private int zzYeG = 0;
    private com.aspose.words.internal.zzZQ9 zzYeH;
    private com.aspose.words.internal.zzZQ9 zzYeI;
    private String zzYeJ;
    private int zzYeK;

    public zzZ5Q(String str, String str2) {
        this.zzYeF = str;
        this.zzYeE = str2;
        com.aspose.words.internal.zzZQ9 zzzq9 = com.aspose.words.internal.zzZQ9.zz34;
        this.zzYeI = zzzq9;
        this.zzYeJ = "";
        this.zzYeH = zzzq9;
        this.zzYeK = 0;
    }

    private static boolean zzJo(String str) {
        if (!(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, 65, 111, 112, 101, 115, 84, PatternStyle.Divot, 116, 111, 108, 97, 102, 32, 114, 111, 32}) + "Android via Java").equals(str)) {
            if ((com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 67, 104, 110, 108, 111, 97, 100, 101, 116, 84, PatternStyle.Divot, 116, 111, 108, 97, 102, 32, 114, 111, 32}) + "Android via Java").equals(str) || com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, 65, 111, 112, 101, 115, 84, PatternStyle.Divot, 116, 111, 108, 97}).equals(str) || ((com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 67, 104, 110, 108, 111, 97, 100, 101, 116, 84, PatternStyle.Divot, 116, 111, 108, 97}).equals(str) && "Android via Java".equals(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{78, PatternStyle.Divot, 84, 69}))) || com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, 65, 111, 112, 101, 115, 84, PatternStyle.Divot, 116, 111, 108, 97, 80, 32, 111, 114, 117, 100, 116, 99, 70, 32, 109, 97, 108, 105, 121}).equals(str) || com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 67, 104, 110, 108, 111, 97, 100, 101, 116, 84, PatternStyle.Divot, 116, 111, 108, 97, 80, 32, 111, 114, 117, 100, 116, 99, 70, 32, 109, 97, 108, 105, 121}).equals(str) || "Aspose.Words for Android via Java".equals(str))) {
                return true;
            }
            if (com.aspose.words.internal.zzZKN.zzX("Android via Java", com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{97, 74, 97, 118, 65, PatternStyle.Divot, 100, 110, 111, 114, 100, 105}), com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                String str2 = "Aspose.Words" + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{102, 32, 114, 111, 32}) + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{110, 65, 114, 100, 105, 111, 100});
                String strZzYP = com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{115, 65, 111, 112, 101, 115, 84, PatternStyle.Divot, 116, 111, 108, 97, 102, 32, 114, 111, 65, 32, 100, 110, 111, 114, 100, 105});
                if (com.aspose.words.internal.zzZKN.equals(str, str2) || com.aspose.words.internal.zzZKN.equals(str, strZzYP)) {
                    return true;
                }
            }
            if ("Aspose.Words".equals(str) && "Android via Java".equals(com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{78, PatternStyle.Divot, 84, 69}))) {
                return true;
            }
            if (!("Aspose.Words" + com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{80, 32, 111, 114, 117, 100, 116, 99, 70, 32, 109, 97, 108, 105, 121})).equals(str) && !com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{110, 69, 101, 116, 112, 114, 105, 114, 101, 115, 83, 32, 112, 117, 111, 112, 116, 114}).equals(str) && !com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{101, 68, 101, 118, 111, 108, 101, 112, 32, 114, 117, 83, 112, 112, 114, 111, 116}).equals(str) && !com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{117, 66, 105, 115, 101, 110, 115, 115, 83, 32, 112, 117, 111, 112, 116, 114}).equals(str)) {
                return false;
            }
        }
        return true;
    }

    private static int zzT(com.aspose.words.internal.zzZQ9 zzzq9, com.aspose.words.internal.zzZQ9 zzzq92) {
        if (zzzq9.zzkP() < zzzq92.zzkP()) {
            return -1;
        }
        return zzzq9.zzkP() > zzzq92.zzkP() ? 1 : 0;
    }

    private boolean zzY(zzZ5Q zzz5q) {
        return com.aspose.words.internal.zzZKN.equals(this.zzYeF, zzz5q.zzYeF) && com.aspose.words.internal.zzZKN.equals(this.zzYeE, zzz5q.zzYeE);
    }

    public static com.aspose.words.internal.zzZQ9 zzYRj() {
        return com.aspose.words.internal.zzZQ9.zzZ("2024.03.01", com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{121, 121, 121, 121, 77, PatternStyle.Divot, PatternStyle.Divot, 77, 100, 100}), com.aspose.words.internal.zzZP1.zzj8());
    }

    public boolean equals(Object obj) {
        zzZ5Q zzz5q = (zzZ5Q) com.aspose.words.internal.zzZKW.zzZ(obj, zzZ5Q.class);
        if (zzz5q != null) {
            return zzY(zzz5q);
        }
        return false;
    }

    public final String getData() {
        return this.zzYeF;
    }

    public final String getSerialNumber() {
        return this.zzYeJ;
    }

    public int hashCode() {
        return (this.zzYeF + this.zzYeE).hashCode();
    }

    @Override // com.aspose.words.zzZ5P
    public final boolean isMetered() {
        return false;
    }

    public final void zzJn(String str) {
        this.zzYeJ = str;
    }

    public final void zzJp(String str) {
        com.aspose.words.internal.zzZKN.zzU3(str);
        if (zzJo(str)) {
            this.zzYeG = 1;
            if (com.aspose.words.internal.zzZYD.zzX(str, com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{111, 67, 104, 110, 108, 111, 97, 100, 101, 116}), true)) {
                this.zzYeK = 1;
            }
        }
    }

    public final String zzYRf() {
        return this.zzYeE;
    }

    public final int zzYRg() {
        return this.zzYeG;
    }

    public final com.aspose.words.internal.zzZQ9 zzYRh() {
        return this.zzYeI;
    }

    public final int zzYRi() {
        return this.zzYeK;
    }

    public final boolean zzYRk() {
        com.aspose.words.internal.zzZQ9 zzzq9ZzQO = com.aspose.words.internal.zzZQ9.zzQO();
        if (com.aspose.words.internal.zzZQ9.zzY(zzzq9ZzQO, zzYRj())) {
            zzzq9ZzQO = zzYRj();
        }
        return zzT(this.zzYeH, zzzq9ZzQO) < 0;
    }

    public final boolean zzYRl() {
        boolean z = zzT(this.zzYeI, zzYRj()) < 0;
        if (z || com.aspose.words.internal.zzZQ9.zzZ(this.zzYeI, com.aspose.words.internal.zzZQ9.zz34) || this.zzYeI.getYear() < 2099 || com.aspose.words.internal.zzZQ9.zzQO().getMillisecond() % 10 > 1) {
            return z;
        }
        return true;
    }

    @Override // com.aspose.words.zzZ5P
    public final boolean zzYRm() {
        return false;
    }

    @Override // com.aspose.words.zzZ5P
    public final boolean zzYRn() {
        return (this.zzYeG != 1 || zzYRk() || zzYRl()) ? false : true;
    }

    public final void zzb(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzYeH = zzzq9;
    }

    public final void zzc(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzYeI = zzzq9;
    }

    @Override // com.aspose.words.zzZ5P
    public final boolean zzxT(int i) {
        com.aspose.words.internal.zzZO0.zzhV().zzYP(new byte[]{116, 83, 110, 97, 97, 100, 111, 108, 101, 110, 108, 32, 99, 105, 110, 101, 101, 115, 100, 32, 101, 111, 110, 115, 116, 39, 115, 32, 112, 117, 111, 112, 116, 114, 112, 32, 117, 108, 105, 103, 115, 110, 40, 32, 101, 102, 116, 97, 114, 117, 115, 101, PatternStyle.Divot, 41});
        return false;
    }
}
