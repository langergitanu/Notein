package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ22 {
    private ArrayList<ArrayList<zzZ1V>> zzY3Y = new ArrayList<>();
    private ArrayList<zzZ1V> zzY3Z;
    private Footnote zzYqa;

    private static String zzv3(int i) {
        return com.aspose.words.internal.zzZKN.format("{0}{1}{2}", "[^", Integer.valueOf(i), "]");
    }

    public final void zzP(Footnote footnote) {
        ArrayList<zzZ1V> arrayList = new ArrayList<>(1);
        this.zzY3Z = arrayList;
        com.aspose.words.internal.zzZQG.zzZ(this.zzY3Y, arrayList);
        this.zzYqa = footnote;
    }

    public final boolean zzYIv() {
        return this.zzYqa != null;
    }

    public final void zzYIw() {
        this.zzYqa = null;
    }

    public final void zzZ(zzZ1V zzz1v) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzY3Z, zzz1v);
    }

    public final Footnote zzZ1W() {
        return this.zzYqa;
    }

    public final String zzZAT() {
        return zzv3(this.zzY3Y.size());
    }

    public final void zzZ(zzZ1M zzz1m) throws Exception {
        int i = 0;
        while (i < this.zzY3Y.size()) {
            com.aspose.words.internal.zzZNH.zzU(zzz1m.zzZeE(), zzz1m.zzYHF().getParagraphBreak());
            int i2 = i + 1;
            com.aspose.words.internal.zzZNH.zzU(zzz1m.zzZeE(), com.aspose.words.internal.zzZKN.format("{0}: ", zzv3(i2)));
            ArrayList<zzZ1V> arrayList = this.zzY3Y.get(i);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList.get(i3).zzIg();
                if (i3 < arrayList.size() - 1) {
                    com.aspose.words.internal.zzZNH.zzU(zzz1m.zzZeE(), zzz1m.zzYHF().getParagraphBreak());
                }
            }
            i = i2;
        }
    }
}
