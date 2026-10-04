package com.aspose.words;

import com.aspose.words.zzYY6;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYY4<TBookmarkWriter extends zzYY6> {
    private HtmlSaveOptions zzZE9;
    com.aspose.words.internal.zzZYG<ArrayList<TBookmarkWriter>> zzXXY = new com.aspose.words.internal.zzZYG<>();
    private int zzXXX = 0;

    public zzYY4(HtmlSaveOptions htmlSaveOptions) {
        this.zzZE9 = htmlSaveOptions;
    }

    public final String zzHL(String str) {
        Iterator<String> it = this.zzXXY.zzxs().iterator();
        while (it.hasNext()) {
            Iterator<TBookmarkWriter> it2 = this.zzXXY.get(it.next()).iterator();
            while (it2.hasNext()) {
                str = it2.next().zzKY(str);
            }
        }
        return str;
    }

    public abstract TBookmarkWriter zzP6(int i);

    public final void zzQ(zzZDN zzzdn) {
        zzZDS zzzdsZzJH;
        int iZzT;
        if ("a".equals(zzzdn.getName()) && (zzzdsZzJH = zzzdn.zzYXj().zzJH("href")) != null && (iZzT = com.aspose.words.internal.zzZKN.zzT(zzzdsZzJH.getValue(), "#", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) != -1) {
            zzYY6 zzyy6ZzP6 = zzP6(this.zzXXX);
            String strSubstring = zzzdsZzJH.getValue().substring(iZzT + 1);
            this.zzXXX++;
            if (!this.zzXXY.containsKey(strSubstring)) {
                this.zzXXY.zzW(strSubstring, new ArrayList<>());
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzXXY.get(strSubstring), zzyy6ZzP6);
            zzzdn.zzYXj().remove("href");
            zzzdn.zzYXj().zzZ(new zzZDQ("href", zzyy6ZzP6.zzaI()));
        }
        for (zzZDK zzzdk : zzzdn.zzYXk()) {
            if (zzzdk instanceof zzZDN) {
                zzQ((zzZDN) zzzdk);
            }
        }
    }

    public final void zzw(String str, int i, int i2) {
        for (com.aspose.words.internal.zzZNT zzznt : com.aspose.words.internal.zzZNR.zzZT(str, "<a name=\"|<div id=\"")) {
            int length = zzznt.getLength() + zzznt.getIndex();
            ArrayList<TBookmarkWriter> arrayList = this.zzXXY.get(str.substring(length, (com.aspose.words.internal.zzZKN.zzW(str, "\"", length, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) - length) + length));
            if (arrayList != null) {
                int iZzV4 = this.zzZE9.zzZ9Y().zzV4(str.substring(0, zzznt.getIndex()));
                for (TBookmarkWriter tbookmarkwriter : arrayList) {
                    tbookmarkwriter.zzP5(i);
                    tbookmarkwriter.zztY(i2);
                    tbookmarkwriter.zztX(iZzV4);
                }
            }
        }
    }
}
