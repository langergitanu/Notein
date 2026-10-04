package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz7L implements zzZCF {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("*/", "+-", "+/", "?:", "abs", "at2", "cat2", "cos", "max", "min", "mod", "pin", "sat2", "sin", "sqrt", "tan", "val");

    private static String[] zzG(String[] strArr) {
        int i = 0;
        for (String str : strArr) {
            if (com.aspose.words.internal.zzZYD.zzXk(str)) {
                i++;
            }
        }
        String[] strArr2 = new String[i];
        int i2 = 0;
        for (String str2 : strArr) {
            if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
                strArr2[i2] = str2;
                i2++;
            }
        }
        return strArr2;
    }

    private static String[] zzOC(String str) {
        String[] strArrZzG = zzG(com.aspose.words.internal.zzZKN.zzR(str, ControlChar.SPACE_CHAR));
        if (strArrZzG.length != 0) {
            return strArrZzG;
        }
        throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Bad formula '{0}'.", str) + "\r\nParameter name: formula");
    }

    @Override // com.aspose.words.zzZCF
    public final zz7M zzOD(String str) {
        zz7M zz0d;
        String[] strArrZzOC = zzOC(str);
        String str2 = strArrZzOC[0];
        switch (zzUR.zzTP(str2)) {
            case 0:
                zz0d = new zz0D(strArrZzOC, new zzYWV());
                break;
            case 1:
                zz0d = new zz0D(strArrZzOC, new zzU());
                break;
            case 2:
                zz0d = new zz0D(strArrZzOC, new zzV());
                break;
            case 3:
                zz0d = new zz0D(strArrZzOC, new zzZ8P());
                break;
            case 4:
                zz0d = new zz4J(strArrZzOC, new zzX());
                break;
            case 5:
                zz0d = new zz02(strArrZzOC, new zz1());
                break;
            case 6:
                zz0d = new zz0D(strArrZzOC, new zzT6());
                break;
            case 7:
                zz0d = new zz02(strArrZzOC, new zzT5());
                break;
            case 8:
                zz0d = new zz02(strArrZzOC, new zzYZM());
                break;
            case 9:
                zz0d = new zz02(strArrZzOC, new zzYYN());
                break;
            case 10:
                zz0d = new zz0D(strArrZzOC, new zzYXG());
                break;
            case 11:
                zz0d = new zz0D(strArrZzOC, new zzYLQ());
                break;
            case 12:
                zz0d = new zz0D(strArrZzOC, new zzYB8());
                break;
            case 13:
                zz0d = new zz02(strArrZzOC, new zzYB7());
                break;
            case 14:
                zz0d = new zz4J(strArrZzOC, new zzY9H());
                break;
            case 15:
                zz0d = new zz02(strArrZzOC, new zzY68());
                break;
            case 16:
                zz0d = new zz4J(strArrZzOC, new zzZ41());
                break;
            default:
                throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Unknown formula type '{0}'.", str2) + "\r\nParameter name: formula");
        }
        zz0d.zzOE(str);
        return zz0d;
    }
}
