package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzMS {
    private String mName;
    private boolean zzZpe;

    public zzMS(String str, boolean z) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYD.zzXm(str);
        this.mName = str;
        this.zzZpe = z;
    }

    public final String getName() {
        return this.mName;
    }

    public final zzPS zzQ(zzL4 zzl4) {
        return zzY(new zzL2(zzl4), false, false);
    }

    public zzMP zzY(zzMP zzmp, zzQK zzqk) {
        return zzmp;
    }

    public abstract zzPS zzY(zzL2 zzl2, boolean z, boolean z2);

    public void zzZ(zzMP zzmp, CellFormat cellFormat) throws Exception {
    }

    public final boolean zzZVD() {
        return this.zzZpe;
    }

    public zzMP zzZW0() {
        return null;
    }

    public void zzY(zzMP zzmp, Shape shape) throws Exception {
    }

    public void zzZ(zzMP zzmp, Document document) {
    }

    public void zzZ(zzMP zzmp, Row row) throws Exception {
    }

    public void zzZ(zzMP zzmp, Shape shape) throws Exception {
    }

    public void zzZ(zzMP zzmp, Table table) throws Exception {
    }
}
