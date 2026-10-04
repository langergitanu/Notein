package com.aspose.words;

import com.aspose.slides.C22226Oooo0oo;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWP extends zzYQ {
    private int zzXW9;
    private String zzXWa;
    private String zzYKG;
    private ArrayList<zzYWR> zzYKI;

    public zzYWP(String str, zzYDZ zzydz, ArrayList<zzYWR> arrayList, String str2) throws Exception {
        super(zzYQ.zzH(str, false), str, zzydz);
        this.zzYKI = arrayList;
        this.zzYKG = str2;
    }

    private void zzYB(String str, String str2) {
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            zzY(str);
            zzY("text");
            writeString(str2);
            zzn();
            zzn();
        }
    }

    private void zzYBp() throws Exception {
        String string;
        ArrayList<zzYWR> arrayList = this.zzYKI;
        if (arrayList != null) {
            arrayList.size();
        }
        int i = 1;
        int i2 = 0;
        for (zzYWR zzywr : this.zzYKI) {
            String str = zzywr.zzXWc;
            if (str == null) {
                str = this.zzXWa;
            }
            if (zzywr.zzXWf != null) {
                StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, "#");
                sbOooO0OO.append(zzywr.zzXWf);
                string = sbOooO0OO.toString();
            } else {
                string = str;
            }
            for (int i3 = i2 + 1; i3 < zzywr.zzXWe; i3++) {
                zzZ(i, "***", string);
            }
            while (i2 >= zzywr.zzXWe) {
                zzp();
                i2--;
            }
            String strZzVg = zzywr.zzXWd;
            if (strZzVg == null) {
                strZzVg = com.aspose.words.internal.zzZOQ.zzVg(str);
            }
            zzZ(i, strZzVg, string);
            i++;
            i2 = zzywr.zzXWe;
        }
        while (i2 > 0) {
            zzp();
            i2--;
        }
    }

    private void zzZ(int i, String str, String str2) {
        zzY("navPoint");
        this.zzXW9++;
        zzX("id", "np" + com.aspose.words.internal.zzJB.zz5(this.zzXW9));
        zzZj("playOrder", i);
        zzYB("navLabel", str);
        zzY(FirebaseAnalytics.Param.CONTENT);
        zzX("src", str2);
        zzp();
    }

    public final void zzZY1() throws Exception {
        startDocument();
        zzY("ncx", "-//NISO//DTD ncx 2005-1//EN", "http://www.daisy.org/z3986/2005/ncx-2005-1.dtd");
        zzY("ncx");
        zzX("xmlns", "http://www.daisy.org/z3986/2005/ncx/");
        zzX("version", "2005-1");
        zzX("xml:lang", zza3());
        zzY("head");
        zzZC("dtb:uid", this.zzYKG);
        zzZC("dtb:depth", "1");
        if (zza0().getExportGeneratorName()) {
            zzZC("dtb:generator", "Aspose.Words for Android via Java 24.3.0");
        }
        zzZC("dtb:totalPageCount", "0");
        zzZC("dtb:maxPageNumber", "0");
        zzp();
        zzYB("docTitle", zzYQ.zzTr(zz9Z().getBuiltInDocumentProperties().getTitle()));
        zzYB("docAuthor", zz9Z().getBuiltInDocumentProperties().getAuthor());
        this.zzXWa = zzYQ.zzTp(zza1());
        zzY("navMap");
        zzYBp();
        zzp();
        endDocument();
    }
}
