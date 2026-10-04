package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz4 extends zzY4K {
    private com.aspose.words.internal.zzZNR zzZFn;

    public zz4() {
        super(false, true, 0);
        this.zzZFn = new com.aspose.words.internal.zzZNR("^\\d+(\\.|\\s|(?!.))", 0);
    }

    @Override // com.aspose.words.zzY4K
    public final String zzPm(int i) {
        String strZzZI = "";
        for (int i2 = 0; i2 <= i; i2++) {
            strZzZI = com.aspose.words.internal.zzZKN.zzZI(strZzZI, com.aspose.words.internal.zzZQB.zzRq(i2) + ".");
        }
        return strZzZI;
    }

    @Override // com.aspose.words.zzY4K
    public final zzY4L zzTD(String str) {
        com.aspose.words.internal.zzZNT zzzntZzUX;
        if (com.aspose.words.internal.zzJB.zzZ7(str)) {
            return null;
        }
        if (str.length() > 0 && str.charAt(0) == '0') {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strZzT = str;
        int length = 0;
        char cCharAt = 0;
        do {
            zzzntZzUX = this.zzZFn.zzUX(strZzT);
            if (!zzzntZzUX.zzhL()) {
                break;
            }
            cCharAt = zzzntZzUX.getValue().charAt(zzzntZzUX.getValue().length() - 1);
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, com.aspose.words.internal.zzZYD.isDigit(cCharAt) ? zzzntZzUX.getValue() : zzzntZzUX.getValue().substring(0, zzzntZzUX.getValue().length() - 1));
            length += zzzntZzUX.getValue().length();
            strZzT = com.aspose.words.internal.zzZKN.zzT(strZzT, 0, zzzntZzUX.getLength());
        } while (!com.aspose.words.internal.zzZYD.zzX(zzzntZzUX.getValue(), " ", true));
        if (arrayList.size() == 0) {
            return null;
        }
        if (!getDetectNumberingWithWhitespaces() && cCharAt != '.') {
            return null;
        }
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        return new zzY4L(strArr, com.aspose.words.internal.zzZKN.zzTX(str.substring(0, length)));
    }

    @Override // com.aspose.words.zzY4K
    public final String zzTE(String str) {
        int iZzZo = com.aspose.words.internal.zzJB.zzZo(str);
        return iZzZo == Integer.MIN_VALUE ? "" : Integer.toString(iZzZo + 1);
    }

    @Override // com.aspose.words.zzY4K
    public final boolean zzTF(String str) {
        return "1".equals(str);
    }
}
