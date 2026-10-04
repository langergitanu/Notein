package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYJG {
    private static com.aspose.words.internal.zzZNR zzXBU = new com.aspose.words.internal.zzZNR("^\\.($|[/\\\\])", 0);
    private String zzXBV;
    private String zzXBW;
    private String zzYmo;
    private String zzYmp;
    private zzY86 zzYs0;

    public zzYJG(String str, zzY86 zzy86, String str2, String str3, String str4, boolean z, boolean z2) throws Exception {
        this.zzYs0 = zzy86;
        this.zzXBW = str4;
        String strZzVg = "";
        if (zzy86 != null) {
            this.zzYmp = "";
            this.zzYmo = "";
        } else {
            boolean zZzXk = com.aspose.words.internal.zzZYD.zzXk(str);
            boolean zZzXk2 = com.aspose.words.internal.zzZYD.zzXk(str2);
            boolean zZzXk3 = com.aspose.words.internal.zzZYD.zzXk(str3);
            if (zZzXk2) {
                this.zzYmp = str2;
                if (!com.aspose.words.internal.zzZOQ.zzVc(str2) && z2) {
                    String strZzVd = zZzXk ? com.aspose.words.internal.zzZOQ.zzVd(com.aspose.words.internal.zzZOQ.zzVf(str)) : "";
                    if (com.aspose.words.internal.zzZYD.zzXk(strZzVd)) {
                        this.zzYmp = com.aspose.words.internal.zzZOQ.zzZW(strZzVd, this.zzYmp);
                    }
                }
            } else if (zZzXk) {
                this.zzYmp = com.aspose.words.internal.zzZOQ.zzVd(com.aspose.words.internal.zzZOQ.zzVf(str));
            } else {
                this.zzYmp = "";
            }
            if (!z && zZzXk3) {
                this.zzYmo = zzXBU.zzZS(str3, "");
            } else if (z || !zZzXk2) {
                this.zzYmo = "";
            } else {
                this.zzYmo = str2;
            }
            strZzVg = zZzXk ? com.aspose.words.internal.zzZOQ.zzVg(str) : com.aspose.words.internal.zzZKN.format("Aspose.Words.{0}", com.aspose.words.internal.zzZOZ.zziD());
        }
        this.zzXBV = strZzVg;
    }

    public final String zzCL(String str) throws Exception {
        return com.aspose.words.internal.zzZVR.zzWF(str) ? str : com.aspose.words.internal.zzZVR.zz3(this.zzYmo, com.aspose.words.internal.zzZOQ.zzVh(str));
    }

    public final String zzCM(String str) throws Exception {
        return com.aspose.words.internal.zzZOQ.zzZW(this.zzYmp, str);
    }

    public final String zzYlK() {
        return this.zzXBV;
    }

    public final zzY86 zzYlL() {
        return this.zzYs0;
    }

    public final void zzYlM() throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzYmp)) {
            throw new IllegalStateException(this.zzXBW);
        }
        if (com.aspose.words.internal.zzZOV.zzYb(this.zzYmp)) {
            return;
        }
        com.aspose.words.internal.zzZOV.zzVp(this.zzYmp);
    }
}
