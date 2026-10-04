package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzCG {
    public static zzCH[] zzYC(String str) {
        String[] strArrZzR = zzZKN.zzR(str, ',');
        zzCH[] zzchArr = new zzCH[strArrZzR.length];
        for (int i = 0; i < strArrZzR.length; i++) {
            String[] strArrZzR2 = zzZKN.zzR(strArrZzR[i], '=');
            zzchArr[i] = new zzCH(strArrZzR2[0], Integer.parseInt(strArrZzR2[1]));
        }
        return zzchArr;
    }

    public static void zzZ(zzEZ zzez, String str, int i) {
        String value = zzez.getValue();
        StringBuilder sb = new StringBuilder(str.length() + value.length() + 4);
        zzZNH.zzU(sb, value);
        if (!zzZKN.equals(value, "")) {
            sb.append(',');
        }
        zzZNH.zzU(sb, str);
        sb.append('=');
        sb.append(i);
        zzez.setValue(sb.toString());
    }
}
