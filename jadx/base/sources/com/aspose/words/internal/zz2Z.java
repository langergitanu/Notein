package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz2Z {
    public static void zzD(zzFY zzfy) throws Exception {
        zzfy.zzH("/Footnote", "/Note");
        zzfy.zzH("/Endnote", "/Note");
        zzfy.zzH("/Annotation", "/Sect");
        zzfy.zzH("/Textbox", "/Sect");
    }

    public static String zzTN(int i) {
        return zzZKN.format("{0}{1}", "/H", Integer.valueOf(i));
    }

    public static String zzX(zzBD zzbd) {
        return zzbd.zzBD() != 1 ? "/Figure" : "/Formula";
    }

    public static String zzX(zzB2 zzb2) {
        return (zzb2.zzBz() || zzb2.zzBy()) ? "/TH" : "/TD";
    }
}
