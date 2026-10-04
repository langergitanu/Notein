package com.aspose.words.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zz4V extends zz3Q {
    private static HashMap<String, String> zzjx;
    private String zzjy;

    static {
        HashMap<String, String> map = new HashMap<>();
        zzjx = map;
        zzZQF.zzY(map, "Arial", "Helvetica");
        zzZQF.zzY(zzjx, "Arial Italic", "Helvetica-Oblique");
        zzZQF.zzY(zzjx, "Arial Bold", "Helvetica-Bold");
        zzZQF.zzY(zzjx, "Arial Bold Italic", "Helvetica-BoldOblique");
        zzZQF.zzY(zzjx, "Courier New", "Courier");
        zzZQF.zzY(zzjx, "Courier New Italic", "Courier-Oblique");
        zzZQF.zzY(zzjx, "Courier New Bold", "Courier-Bold");
        zzZQF.zzY(zzjx, "Courier New Bold Italic", "Courier-BoldOblique");
        zzZQF.zzY(zzjx, "Times New Roman", "Times-Roman");
        zzZQF.zzY(zzjx, "Times New Roman Italic", "Times-Italic");
        zzZQF.zzY(zzjx, "Times New Roman Bold", "Times-Bold");
        zzZQF.zzY(zzjx, "Times New Roman Bold Italic", "Times-BoldItalic");
        zzZQF.zzY(zzjx, "Symbol", "Symbol");
    }

    public zz4V(zz4W zz4w, boolean z, boolean z2, zz3P zz3p, String str) {
        super(zz4w, z, z2, "Symbol".equals(str) ? new zz1N() : new zz1E(), zz3p);
        this.zzjy = str;
    }

    public static String zzU(zzZXH zzzxh) {
        return (String) zzQW.zzZ(zzjx, zzzxh.getFullFontName());
    }

    public static boolean zzV(zzZXH zzzxh) {
        return zzjx.containsKey(zzzxh.getFullFontName());
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzH("/Type", "/Font");
        zzfy.zzH("/Subtype", "/Type1");
        zzfy.zzG("/BaseFont", this.zzjy);
        zzun().zzI(zzfy);
        zzfy.zzFc();
    }
}
