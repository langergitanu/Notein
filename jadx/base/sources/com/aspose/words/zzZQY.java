package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQY {
    private String zzYFE = "";

    private zzZQY() {
    }

    private void setProgId(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzYFE = str;
    }

    public static String zzM8(String str) {
        zzZQY zzzqy = new zzZQY();
        zzzqy.setProgId(str);
        return zzzqy.zzZfk();
    }

    public static zzZQY zzZ(zzZR4 zzzr4) {
        zzZQY zzzqy = new zzZQY();
        zzzqy.setProgId(zzZQB.zzU(zzzr4).zzZgq().zzT(0, true, true));
        return zzzqy;
    }

    private String zzZfk() {
        return com.aspose.words.internal.zzZKN.format(" EMBED {0} ", this.zzYFE);
    }

    public final String getProgId() {
        return this.zzYFE;
    }
}
