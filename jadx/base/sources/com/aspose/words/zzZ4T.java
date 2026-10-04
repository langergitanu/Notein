package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ4T extends zzZ28 {
    private com.aspose.words.internal.zzZNR zzYcY = new com.aspose.words.internal.zzZNR("\\[[^\\[\\]]+\\]\\([^\\(\\)]+\\) |  \r\n              (\\[[^\\[\\]]+\\]){1,2}(?!:) |\r\n              (\\[[^\\[\\]]+\\]):\\<.*\\>", 4);
    private com.aspose.words.internal.zzZYI zzYcX = new com.aspose.words.internal.zzZYI();
    private com.aspose.words.internal.zzIM<String> zzYcW = new com.aspose.words.internal.zzIM<>();

    private static String zzJc(String str) {
        int iLastIndexOf = str.lastIndexOf(91) + 1;
        return com.aspose.words.internal.zzZKN.zzU2(com.aspose.words.internal.zzZKN.zzTX(str.substring(iLastIndexOf, ((str.lastIndexOf(93) - r0) - 1) + iLastIndexOf)));
    }

    @Override // com.aspose.words.zzZ28
    public final int getType() {
        return 4;
    }

    @Override // com.aspose.words.zzZ28
    public final boolean zzZ(zzZ27 zzz27) {
        com.aspose.words.internal.zzZYI zzzyi;
        Iterator<com.aspose.words.internal.zzZNT> it = this.zzYcY.zzUW(zzz27.zzYIT()).iterator();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            com.aspose.words.internal.zzZNT next = it.next();
            String value = next.getValue();
            int i3 = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
            if (!com.aspose.words.internal.zzZKN.zzW(value, ")", i3)) {
                String strZzJc = zzJc(next.getValue());
                int i4 = this.zzYcX.get(strZzJc);
                if (com.aspose.words.internal.zzZKN.zzW(next.getValue(), ">", i3)) {
                    this.zzYcW.add(strZzJc);
                    if (!com.aspose.words.internal.zzZYI.zzWm(i4)) {
                        i += i4;
                        zzzyi = this.zzYcX;
                        i2 = 0;
                    }
                } else if (!this.zzYcW.contains(strZzJc)) {
                    zzzyi = this.zzYcX;
                    if (!com.aspose.words.internal.zzZYI.zzWm(i4)) {
                        i2 = i4 + 1;
                    }
                }
                zzzyi.set(strZzJc, i2);
            }
            i++;
        }
        setCount(getCount() + i);
        return i > 0;
    }

    @Override // com.aspose.words.zzZ28
    public final int zzZjs() {
        return 3;
    }
}
