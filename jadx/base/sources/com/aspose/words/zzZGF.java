package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGF {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("fr-029");

    private static int zzKt(String str) {
        return zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(str)) != 0 ? 127 : 7180;
    }

    public static int zzKu(String str) {
        int iZzKt = zzKt(str);
        if (iZzKt != 127) {
            return iZzKt;
        }
        int iZzYx = com.aspose.words.internal.zzBM.zzYx(str);
        return iZzYx == 127 ? com.aspose.words.internal.zzBM.zzYw(com.aspose.words.internal.zzZKN.zzU1(str)) : iZzYx;
    }

    private static String zzzh(int i) {
        return i != 1034 ? i != 7180 ? "" : "fr-029" : "es-ES";
    }

    public static String zzzi(int i) {
        String strZzzh = zzzh(i);
        return com.aspose.words.internal.zzZYD.zzXk(strZzzh) ? strZzzh : com.aspose.words.internal.zzBM.zzVn(i);
    }
}
