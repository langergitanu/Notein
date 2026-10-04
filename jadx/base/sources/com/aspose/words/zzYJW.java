package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJW {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("DigestValue", "DigestMethod", "Transforms");
    private String zzXCt;
    private String zzXCu;
    private zzY4W zzXCv = new zzY4W();
    private zzZ9K zzXCw;
    private boolean zzZiG;
    private String zzkB;

    public zzYJW(String str) {
        this.zzkB = str;
    }

    private static String zzCS(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (1 > str.charAt(i) || str.charAt(i) > '\t') {
                sb.append(str.charAt(i));
            } else {
                com.aspose.words.internal.zzZNH.zzZ(sb, "&#{0};", Character.valueOf((char) (str.charAt(i) + '0')));
            }
        }
        return sb.toString();
    }

    private String zzpB(int i) throws Exception {
        return com.aspose.words.internal.zzZQB.zzYT(com.aspose.words.internal.zzIL.zzZ(com.aspose.words.internal.zzS1.zzYu(i), this.zzXCv.zzU(this.zzXCw.zzZ(this)).zzWy()));
    }

    public final String getName() {
        return com.aspose.words.internal.zzZKN.zzR(zzXYX.zzyj(this.zzkB), '?')[0];
    }

    public final String getUri() {
        return this.zzkB;
    }

    public final boolean isExternal() {
        return !com.aspose.words.internal.zzZKN.zzS(this.zzkB, "#", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    public final boolean isValid() {
        return this.zzZiG;
    }

    public final void zzRw(boolean z) {
        this.zzZiG = z;
    }

    public final zzZ9K zzYm6() {
        return this.zzXCw;
    }

    public final zzY4W zzYm7() {
        return this.zzXCv;
    }

    public final String zzYm8() {
        return this.zzXCt;
    }

    public final String zzYm9() {
        return this.zzXCu;
    }

    public final void zzZ(com.aspose.words.internal.zzP zzp, int i) throws Exception {
        zzp.zzY("Reference");
        zzp.zzX("URI", zzCS(this.zzkB));
        this.zzXCv.zzX(zzp);
        zzp.zzY("DigestMethod");
        zzp.zzX("Algorithm", DigitalSignatureUtil.zzLJ(i));
        zzp.zzp();
        zzp.zzZ("DigestValue", zzpB(i));
        zzp.zzo();
    }

    public zzYJW(String str, String str2) {
        this.zzkB = com.aspose.words.internal.zzZKN.format("{0}?ContentType={1}", str, str2);
    }

    public zzYJW(com.aspose.words.internal.zzO zzo) {
        this.zzkB = zzo.zzV("URI", null);
        while (zzo.zzQ("Reference")) {
            int iZzTP = zzUR.zzTP(zzo.getLocalName());
            if (iZzTP == 0) {
                this.zzXCu = zzo.readString();
            } else if (iZzTP == 1) {
                this.zzXCt = zzo.zzV("Algorithm", "");
            } else if (iZzTP != 2) {
                zzo.zzk();
            } else {
                this.zzXCv.zzX(zzo);
            }
        }
    }

    public final void zzZ(zzZ9K zzz9k) {
        this.zzXCw = zzz9k;
    }
}
