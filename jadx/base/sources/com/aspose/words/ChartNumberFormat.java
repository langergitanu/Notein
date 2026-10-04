package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ChartNumberFormat {
    private zzZ9V zzZxT;
    private zzGK zzZyX;

    public ChartNumberFormat(zzZ9V zzz9v, zzGK zzgk) {
        this.zzZxT = zzz9v;
        this.zzZyX = zzgk;
    }

    private void zz2(String str) {
        zzGK zzgk = this.zzZyX;
        if (zzgk != null) {
            zzgk.zzT(WarningType.HINT, str);
        }
    }

    private boolean zz2K() {
        return zz4d() == null || zz4d().zzZLb();
    }

    private void zz2L() {
        if (this.zzZxT.isInherited()) {
            zzZ(new zzE8());
        }
    }

    private zzE8 zz4d() {
        return this.zzZxT.getNumFmt_INumberFormatProvider();
    }

    private void zzZ(zzE8 zze8) {
        this.zzZxT.setNumFmt_INumberFormatProvider(zze8);
    }

    public String getFormatCode() {
        return zz4d() != null ? zz4d().zzZLa() : "";
    }

    public boolean isLinkedToSource() {
        return zz2K();
    }

    public void setFormatCode(String str) {
        zz2L();
        isLinkedToSource(false);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zz4d().setFormatCode(str);
        } else {
            zz4d().setFormatCode("General");
            zz2("An empty string is incorrect NumberFormat, changed to General.");
        }
    }

    public void isLinkedToSource(boolean z) {
        if (zz2K() == z) {
            return;
        }
        zz2L();
        if (zz4d() == null) {
            zzZ(new zzE8());
        }
        zz4d().zzXR(z);
        zz4d().setFormatCode(z ? "" : "General");
    }
}
