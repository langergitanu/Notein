package com.aspose.words;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYQ extends zzYU6 {
    private static com.aspose.words.internal.zzZO0 zzZDp = new com.aspose.words.internal.zzZNI(false);
    private String zzZDq;
    private zzYQO zzZDr;
    private zzYDZ zzZFZ;

    public zzYQ(String str, String str2, zzYDZ zzydz) throws Exception {
        this(new zzYQO(str), str2, zzydz);
    }

    public static String zzH(String str, boolean z) {
        return com.aspose.words.internal.zzZKN.format(z ? "{0}.ncx" : "OEBPS/{0}.ncx", str);
    }

    public static String zzTp(String str) {
        return com.aspose.words.internal.zzZKN.format("{0}.html", str);
    }

    public static String zzTq(String str) {
        return com.aspose.words.internal.zzZKN.format("OEBPS/{0}.opf", str);
    }

    public static String zzTr(String str) {
        return com.aspose.words.internal.zzZYD.zzXk(str) ? str : "Untitled";
    }

    public final String zz9Y() {
        return zzTq(this.zzZDq);
    }

    public final Document zz9Z() {
        return this.zzZFZ.zzYfy;
    }

    public final void zzV(String str, String str2, String str3, String str4) {
        if (com.aspose.words.internal.zzZYD.zzXk(str4)) {
            zzY(str);
            zzX(str2, str3);
            writeString(str4);
            zzp();
        }
    }

    public final void zzZC(String str, String str2) {
        zzY("meta");
        zzX("name", str);
        zzX(FirebaseAnalytics.Param.CONTENT, str2);
        zzp();
    }

    public final HtmlSaveOptions zza0() {
        return (HtmlSaveOptions) this.zzZFZ.zzXpa;
    }

    public final String zza1() {
        return this.zzZDq;
    }

    public final zzYQO zza2() {
        return this.zzZDr;
    }

    public final String zza3() {
        Style style = this.zzZFZ.zzYfy.getStyles().get(0);
        if (style == null) {
            return "en-US";
        }
        String strZzzi = zzZGF.zzzi(style.getFont().getLocaleId());
        return com.aspose.words.internal.zzZYD.zzXk(strZzzi) ? strZzzi : "en-US";
    }

    private zzYQ(zzYQO zzyqo, String str, zzYDZ zzydz) throws Exception {
        super(zzyqo.zzYvo(), zzZDp, zzydz.zzXpa.getPrettyFormat(), true);
        this.zzZDr = zzyqo;
        this.zzZDq = str;
        this.zzZFZ = zzydz;
    }
}
