package com.aspose.words.internal;

import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;

/* JADX INFO: loaded from: classes5.dex */
final class zz5B extends zz33 {
    private zz59 zzk8;
    private zz3M zzk9;
    private zz1G zzka;

    public zz5B(zz4W zz4w, zz1G zz1g) throws Exception {
        super(zz4w);
        this.zzka = zz1g;
        this.zzk8 = new zz59(zz4w);
        this.zzk9 = new zz5A(zz4w, zz1g, zz1g.zzuo(), zz1g.zzuk());
    }

    private String getSubtype() {
        return this.zzka.zzuo().zzPl().zzHG() ? "/CIDFontType0" : "/CIDFontType2";
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Font");
        zzfy.zzH("/Subtype", getSubtype());
        zzfy.zzF("/BaseFont", this.zzka.zzus());
        zzfy.zzH("/CIDToGIDMap", "/Identity");
        zzfy.zzZ("/FontDescriptor", this.zzk9);
        this.zzka.zzZ(this.zzk8);
        zzfy.zzM("/DW", 1000);
        zzfy.zzZ("/W", this.zzk8);
        zzfy.zzYY("/CIDSystemInfo");
        zzfy.zzFd();
        zzfy.zzD("/Ordering", AbstractDevicePopManager.CertificateProperties.ORGANIZATION_UNIT);
        zzfy.zzD("/Registry", "Adobe");
        zzfy.zzM("/Supplement", 0);
        zzfy.zzFc();
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFX zzfx) throws Exception {
        this.zzk8.zzY(zzfx);
        this.zzk9.zzY(zzfx);
    }
}
