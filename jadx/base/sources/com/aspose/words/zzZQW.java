package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQW {
    private String zzYFA = "";
    private boolean zzYFB;

    private void setSourceFullName(String str) {
        if (str == null) {
            str = "";
        }
        this.zzYFA = str;
    }

    public static zzZQW zzX(zzZR4 zzzr4) throws Exception {
        if (zzzr4.getFieldType() != 67) {
            zzzr4.getFieldType();
        }
        zzZB7 zzzb7 = (zzZB7) zzZQB.zzU(zzzr4);
        zzZQW zzzqw = new zzZQW();
        zzzqw.setSourceFullName(zzzb7.getSourceFullName());
        zzzqw.zzYFB = zzzb7.isLinked();
        return zzzqw;
    }

    public final String getSourceFullName() {
        return this.zzYFA;
    }

    public final boolean isLinkOnly() {
        return this.zzYFB;
    }
}
