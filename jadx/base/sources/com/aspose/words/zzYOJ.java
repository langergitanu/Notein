package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOJ {
    int zzXJo;
    String zzXJp;
    int zzXJq;
    String zzXJr;
    String zzXJs;
    int zzXJt;
    int zzXJu;

    public zzYOJ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzXJu = zzzox.zzXc();
        int iZzX9 = zzzox.zzX9() & 65535;
        this.zzXJt = iZzX9;
        if (iZzX9 == 2) {
            this.zzXJs = zzk(zzzox);
            this.zzXJr = zzk(zzzox);
            zzzox.zzX9();
            int iZzX92 = zzzox.zzX9() & 65535;
            this.zzXJq = iZzX92;
            if (iZzX92 == 1) {
                zzzox.zzX9();
                this.zzXJp = zzk(zzzox);
                zzzox.zzX9();
            } else {
                if (iZzX92 != 3) {
                    return;
                }
                zzzox.zzXc();
                this.zzXJp = zzk(zzzox);
                this.zzXJo = zzzox.zzXc();
            }
        }
    }

    private static String zzk(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        StringBuilder sb = new StringBuilder();
        while (true) {
            char c = zzzox.readChar();
            if (c == 0) {
                return sb.toString();
            }
            sb.append(c);
        }
    }
}
