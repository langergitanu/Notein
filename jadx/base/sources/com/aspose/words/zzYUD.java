package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUD {
    private static com.aspose.words.internal.zzZNR zzXSB = new com.aspose.words.internal.zzZNR("[^-a-zA-Z0-9]*", 0);
    private com.aspose.words.internal.zzFQ<String> zzXSC;
    private com.aspose.words.internal.zzD3<String[]> zzXSD;
    private com.aspose.words.internal.zzD3<String> zzXSE;

    public zzYUD(StyleCollection styleCollection) {
        int count = styleCollection.getCount();
        this.zzXSE = new com.aspose.words.internal.zzD3<>(count);
        this.zzXSD = new com.aspose.words.internal.zzD3<>();
        this.zzXSC = new com.aspose.words.internal.zzX6();
        for (int i = 0; i < count; i++) {
            zzL(styleCollection.get(i));
        }
    }

    private String zzH2(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "styleId");
        int i = 0;
        String str2 = str;
        while (this.zzXSC.contains(str2)) {
            str2 = str + i;
            i++;
        }
        return str2;
    }

    private void zzL(Style style) {
        String strZzAO = style.getBuiltIn() ? zzY8T.zzAO(zzY8T.zzh(style.getStyleIdentifier(), style.getName())) : style.getName();
        int iZzZ7j = style.zzZ7j();
        String strZzYA = zzYA("a", strZzAO);
        this.zzXSE.add(iZzZ7j, strZzYA);
        String strZzW = style.getStyles().zzW(style, false);
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzW)) {
            return;
        }
        String[] strArrZzR = com.aspose.words.internal.zzZKN.zzR(strZzW, ',');
        int length = strArrZzR.length;
        while (true) {
            length--;
            if (length < 0) {
                this.zzXSD.add(iZzZ7j, strArrZzR);
                return;
            }
            strArrZzR[length] = zzYA(strZzYA, strArrZzR[length]);
        }
    }

    private String zzYA(String str, String str2) {
        String strZzZS = zzXSB.zzZS(str2, "");
        if (!com.aspose.words.internal.zzZKN.equals(strZzZS, "")) {
            str = strZzZS;
        }
        String strZzH2 = zzH2(str);
        this.zzXSC.add(strZzH2);
        return strZzH2;
    }

    public final String zzFs(int i) {
        return this.zzXSE.get(i);
    }

    public final String[] zzt0(int i) {
        return this.zzXSD.get(i);
    }
}
