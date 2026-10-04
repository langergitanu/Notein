package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQX {
    private boolean zzYFD;
    private String zzYJS = "";
    private String zzYJR = "";
    private String zzYN = "";
    private String zzYL = "";
    private String zzYFC = "";

    public zzZQX() {
    }

    public static zzZQX zzM7(String str) {
        zzZQX zzzqx = new zzZQX();
        zzZR1 zzzr1 = new zzZR1(str, new FieldHyperlink());
        zzzqx.setAddress(zzzr1.zzT(0, true, true));
        zzzqx.setSubAddress(zzzr1.zzt("\\l", true));
        if (zzzr1.zzMj("\\n")) {
            zzzqx.setTarget("_blank");
        }
        zzzqx.setScreenTip(zzzr1.zzt("\\o", true));
        zzzqx.setTarget(zzzr1.zzt("\\t", true));
        zzzqx.zzM6(zzzr1.zzt("\\s", true));
        zzzqx.zzYFD = zzzr1.zzMj("\\h");
        return zzzqx;
    }

    public static zzZQX zzY(zzZR4 zzzr4) {
        zzzr4.getFieldType();
        FieldHyperlink fieldHyperlink = (FieldHyperlink) zzZQB.zzU(zzzr4);
        zzZQX zzzqx = new zzZQX();
        zzzqx.setAddress(fieldHyperlink.getAddress());
        zzzqx.setSubAddress(fieldHyperlink.getSubAddress());
        if (fieldHyperlink.getOpenInNewWindow()) {
            zzzqx.setTarget("_blank");
        }
        zzzqx.setScreenTip(fieldHyperlink.getScreenTip());
        zzzqx.setTarget(fieldHyperlink.getTarget());
        zzzqx.zzM6(fieldHyperlink.zzZfi());
        zzzqx.zzYFD = fieldHyperlink.zzZfh();
        return zzzqx;
    }

    public final String getAddress() {
        return this.zzYJS;
    }

    public final String getHRef() {
        return com.aspose.words.internal.zzZVR.zz5(this.zzYJS, this.zzYJR);
    }

    public final String getScreenTip() {
        return this.zzYN;
    }

    public final String getSubAddress() {
        return this.zzYJR;
    }

    public final String getTarget() {
        return this.zzYL;
    }

    public final void setAddress(String str) {
        if (str == null) {
            str = "";
        }
        this.zzYJS = str;
    }

    public final void setScreenTip(String str) {
        if (str == null) {
            str = "";
        }
        this.zzYN = str;
    }

    public final void setSubAddress(String str) {
        if (str == null) {
            str = "";
        }
        this.zzYJR = str;
    }

    public final void setTarget(String str) {
        if (str == null) {
            str = "";
        }
        this.zzYL = str;
    }

    public final void zzM6(String str) {
        if (str == null) {
            str = "";
        }
        this.zzYFC = str;
    }

    public final boolean zzZfh() {
        return this.zzYFD;
    }

    public final String zzZfi() {
        return this.zzYFC;
    }

    public final String zzZfj() {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, " HYPERLINK ");
        if (!com.aspose.words.internal.zzZKN.zzU3(this.zzYJS)) {
            com.aspose.words.internal.zzZNH.zzZ(sb, "{0} ", zzY0C.zzyw(this.zzYJS));
        }
        zzY(sb, "\\l", this.zzYJR);
        zzY(sb, "\\o", this.zzYN);
        zzY(sb, "\\t", this.zzYL);
        zzY(sb, "\\s", this.zzYFC);
        if (this.zzYFD) {
            com.aspose.words.internal.zzZNH.zzZ(sb, " {0} ", "\\h");
        }
        return sb.toString();
    }

    public zzZQX(String str, String str2, String str3, String str4, String str5, boolean z) {
        setAddress(str.replace("\"", "%22"));
        setSubAddress(str2);
        setScreenTip(str3);
        setTarget(str4);
        zzM6(str5);
        this.zzYFD = z;
    }

    private static void zzY(StringBuilder sb, String str, String str2) {
        if (com.aspose.words.internal.zzZKN.zzU3(str2)) {
            return;
        }
        com.aspose.words.internal.zzZNH.zzZ(sb, "{0} {1} ", str, zzZQP.zzM0(str2));
    }
}
