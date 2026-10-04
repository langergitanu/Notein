package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY4X {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("http://www.w3.org/TR/2001/REC-xml-c14n-20010315", "http://schemas.openxmlformats.org/package/2006/RelationshipTransform");

    public static zzY4X zzAa(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            return new zzXG();
        }
        if (iZzTP == 1) {
            return new zzYJO();
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unknown transform algorithm '{0}'", str));
    }

    public static zzY4X zzM(com.aspose.words.internal.zzO zzo) {
        zzY4X zzy4xZzAa = zzAa(zzo.zzV("Algorithm", null));
        zzy4xZzAa.zzX(zzo);
        return zzy4xZzAa;
    }

    public abstract void zzX(com.aspose.words.internal.zzO zzo);

    public abstract void zzX(com.aspose.words.internal.zzP zzp);

    public abstract com.aspose.words.internal.zzZOR zzZB(com.aspose.words.internal.zzZOP zzzop) throws Exception;
}
