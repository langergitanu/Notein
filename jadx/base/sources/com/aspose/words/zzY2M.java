package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY2M {
    private String mName;
    private String mValue;

    private zzY2M(String str, String str2) {
        this.mName = str;
        this.mValue = str2;
    }

    public static zzY2M zzzh(String str) {
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(str, ':');
        if (strArrZzR.length < 2) {
            return null;
        }
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(com.aspose.words.internal.zzZKN.zzTX(strArrZzR[0]));
        String strZzTX = com.aspose.words.internal.zzZKN.zzTX(strArrZzR[1]);
        if (!"font-family".equals(strZzU2) && !com.aspose.words.internal.zzZKN.zzS(strZzTX, "#", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
            strZzTX = com.aspose.words.internal.zzZKN.zzU2(strZzTX);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strZzU2) && com.aspose.words.internal.zzZYD.zzXk(strZzTX)) {
            return new zzY2M(strZzU2, strZzTX);
        }
        return null;
    }

    public final String getName() {
        return this.mName;
    }

    public final String getValue() {
        return this.mValue;
    }
}
