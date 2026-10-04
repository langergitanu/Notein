package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYD extends zzYU6 {
    private int zzYPh;
    private zzZX5 zzYPi;
    private com.aspose.words.internal.zz77 zzYPj;
    private String zzYPk;
    private ArrayList<String> zzYPl;
    private IWarningCallback zzZG0;
    private int zzjZ;

    public zzZYD(com.aspose.words.internal.zz77 zz77Var, boolean z, int i, int i2, IWarningCallback iWarningCallback) throws Exception {
        super(zz77Var.zzR1(), new com.aspose.words.internal.zzZNI(false), z, i == 0);
        this.zzYPj = zz77Var;
        this.zzjZ = i;
        this.zzYPh = i2;
        this.zzYPi = new zzZX5(this.zzjZ == 2);
        this.zzZG0 = iWarningCallback;
    }

    private void zzWq(boolean z) {
        StringBuilder sb = new StringBuilder("w14 w15");
        sb.append(z ? " wp14" : "");
        sb.append(this.zzYPh >= 16 ? " w16se w16cid" : "");
        sb.append(this.zzYPh >= 17 ? " w16 w16cex w16sdtdh" : "");
        zzX("mc:Ignorable", sb.toString());
    }

    private boolean zzZmJ() {
        return this.zzjZ == 2;
    }

    private boolean zzZmK() {
        return this.zzjZ != 0;
    }

    private void zzZmQ() {
        zzX("xmlns:cx", this.zzYPi.zzZlo());
        zzX("xmlns:cx1", this.zzYPi.zzZln());
        zzX("xmlns:cx2", this.zzYPi.zzZlm());
        zzX("xmlns:cx3", this.zzYPi.zzZll());
        zzX("xmlns:cx4", this.zzYPi.zzZlk());
        zzX("xmlns:cx5", this.zzYPi.zzZlj());
    }

    private void zzZmR() {
        zzX("xmlns:w14", this.zzYPi.zzZlq());
        zzX("xmlns:w15", this.zzYPi.zzZlp());
    }

    private void zzZmS() {
        zzX("xmlns:mc", this.zzYPi.zzZlx());
    }

    private void zzZmT() {
        if (zzZmK()) {
            zzZmS();
        }
        zzX("xmlns:r", this.zzYPi.zzZlE());
        zzX("xmlns:w", this.zzYPi.zzZlD());
        if (zzZmK()) {
            zzZmR();
            zzZn0();
            zzWq(false);
        }
    }

    private void zzZn0() {
        if (this.zzYPh >= 16) {
            zzX("xmlns:w16cid", this.zzYPi.zzZlh());
            zzX("xmlns:w16se", this.zzYPi.zzZli());
        }
        if (this.zzYPh >= 17) {
            zzX("xmlns:w16", this.zzYPi.zzZlg());
            zzX("xmlns:w16cex", this.zzYPi.zzZlf());
            zzX("xmlns:w16sdtdh", this.zzYPi.zzZle());
        }
    }

    public static String zzg(com.aspose.words.internal.zzPV zzpv) {
        return com.aspose.words.internal.zzZKN.format("{0}{1}{2}", com.aspose.words.internal.zzJB.zzWv(zzpv.zzPC()), com.aspose.words.internal.zzJB.zzWv(zzpv.zzPB()), com.aspose.words.internal.zzJB.zzWv(zzpv.zzPA()));
    }

    public final void zzNT(String str) {
        this.zzYPk = str;
    }

    public final void zzNU(String str) {
        zzZ(str);
        if (zzZmK()) {
            zzX("xmlns:wpc", this.zzYPi.zzZlw());
            zzZmQ();
            zzZmS();
        } else {
            zzX("xmlns:ve", this.zzYPi.zzZlx());
        }
        zzX("xmlns:o", "urn:schemas-microsoft-com:office:office");
        zzX("xmlns:r", this.zzYPi.zzZlE());
        zzX("xmlns:m", this.zzYPi.zzZlr());
        zzX("xmlns:v", "urn:schemas-microsoft-com:vml");
        if (zzZmK()) {
            zzX("xmlns:wp14", this.zzYPi.zzZlv());
        }
        zzX("xmlns:wp", this.zzYPi.zzZlA());
        zzX("xmlns:w10", "urn:schemas-microsoft-com:office:word");
        zzX("xmlns:w", this.zzYPi.zzZlD());
        if (zzZmK()) {
            zzZmR();
        }
        zzX("xmlns:wne", this.zzYPi.zzZlC());
        if (zzZmK()) {
            zzZn0();
            zzX("xmlns:wpg", this.zzYPi.zzZlu());
            zzX("xmlns:wpi", this.zzYPi.zzZlt());
            zzX("xmlns:wps", this.zzYPi.zzZls());
            zzWq(true);
        }
    }

    public final void zzT(int i, String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, i, 9, str);
        }
    }

    @Override // com.aspose.words.zzYU6
    public final void zzV(zzZV8 zzzv8, int i) {
        zzZ(zzzv8.getType() == 0 ? "w:customXmlInsRangeEnd" : "w:customXmlDelRangeEnd", i, "", com.aspose.words.internal.zzZQ9.zz35);
        zzo();
    }

    @Override // com.aspose.words.zzYU6
    public final void zzW(Shading shading) {
        if (shading == null || shading.isInherited()) {
            return;
        }
        zzX("w:shd", "w:val", zzY8T.zzZ6(shading.getTexture(), true), "w:color", shading.zzYbJ(), "w:fill", shading.zzYbK(), "w:themeColor", shading.zzYbI(), "w:themeShade", shading.zz8N(), "w:themeTint", shading.zz8M(), "w:themeFill", shading.zzYbH(), "w:themeFillShade", shading.zzYbG(), "w:themeFillTint", shading.zzYbF());
    }

    @Override // com.aspose.words.zzYU6
    public final void zzX(zzZV8 zzzv8, int i) {
        zzZ(zzzv8.getType() == 0 ? "w:cellIns" : "w:cellDel", zzzv8, i);
    }

    @Override // com.aspose.words.zzYU6
    public final void zzY(zzZV8 zzzv8, int i) {
        zzZ(zzzv8.getType() == 0 ? "w:ins" : "w:del", zzzv8, i);
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZ(String str, Border border) {
        zzX(str, "w:val", zzZXP.zzF8(border.getLineStyle()), "w:sz", Integer.valueOf(border.zz8L()), "w:space", Integer.valueOf(border.zz8K()), "w:color", border.zz8Q(), "w:themeColor", border.zz8O(), "w:themeShade", border.zz8N(), "w:themeTint", border.zz8M(), "w:shadow", zzYU6.zzSx(border.getShadow()), "w:frame", zzYU6.zzSx(border.zz8P()));
    }

    public final void zzZj(String str, String str2) {
        zzY(str);
        zzX("r:id", str2);
        zzp();
    }

    public final String zzZmL() {
        return this.zzYPk;
    }

    public final ArrayList<String> zzZmM() {
        if (this.zzYPl == null) {
            this.zzYPl = new ArrayList<>();
        }
        return this.zzYPl;
    }

    public final com.aspose.words.internal.zz77 zzZmN() {
        return this.zzYPj;
    }

    @Override // com.aspose.words.zzYU6
    public final boolean zzZmO() {
        return "application/vnd.openxmlformats-officedocument.wordprocessingml.styles+xml".equals(this.zzYPj.getContentType());
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZmP() {
        zzp();
    }

    public final void zzZmU() {
        zzZ("w:styles");
        zzZmT();
    }

    public final void zzZmV() {
        zzZ("w:webSettings");
        zzZmT();
    }

    public final void zzZmW() {
        zzZ("w:settings");
        if (zzZmK()) {
            zzZmS();
        }
        zzX("xmlns:o", "urn:schemas-microsoft-com:office:office");
        zzX("xmlns:r", this.zzYPi.zzZlE());
        zzX("xmlns:m", this.zzYPi.zzZlr());
        zzX("xmlns:v", "urn:schemas-microsoft-com:vml");
        zzX("xmlns:w10", "urn:schemas-microsoft-com:office:word");
        zzX("xmlns:w", this.zzYPi.zzZlD());
        if (zzZmK()) {
            zzZmR();
            zzZn0();
        }
        zzX("xmlns:sl", this.zzYPi.zzZlB());
        if (zzZmK()) {
            zzWq(false);
        }
    }

    public final void zzZmX() {
        zzZ("Properties");
        if (zzZmJ()) {
            zzX("xmlns", "http://purl.oclc.org/ooxml/officeDocument/customProperties");
            zzX("xmlns:vt", "http://purl.oclc.org/ooxml/officeDocument/docPropsVTypes");
        } else {
            zzX("xmlns", "http://schemas.openxmlformats.org/officeDocument/2006/custom-properties");
            zzX("xmlns:vt", "http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes");
        }
    }

    public final void zzZmY() {
        zzZ("Properties");
        if (zzZmJ()) {
            zzX("xmlns", "http://purl.oclc.org/ooxml/officeDocument/extendedProperties");
            zzX("xmlns:vt", "http://purl.oclc.org/ooxml/officeDocument/docPropsVTypes");
        } else {
            zzX("xmlns", "http://schemas.openxmlformats.org/officeDocument/2006/extended-properties");
            zzX("xmlns:vt", "http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes");
        }
    }

    public final void zzZmZ() {
        zzZ("w:fonts");
        zzZmT();
    }

    public final int zzZtY() {
        return this.zzjZ;
    }

    @Override // com.aspose.words.zzYU6
    public final void zzw(String str, boolean z) {
        if (z) {
            zzX(str, "1");
        }
    }

    @Override // com.aspose.words.zzYU6
    public final void zzx(String str, boolean z) {
        zzX(str, z ? "1" : "0");
    }

    @Override // com.aspose.words.zzYU6
    public final void zzy(String str, boolean z) {
        if (z) {
            zzZ(str, (String) null);
        } else {
            zzYz(str, "0");
        }
    }

    @Override // com.aspose.words.zzYU6
    public final void zzz(String str, boolean z) {
        zzYz(str, z ? "1" : "0");
    }

    @Override // com.aspose.words.zzYU6
    public final void zzX(zzYX5 zzyx5, int i) {
        String str;
        if (zzyx5.getType() == 2) {
            return;
        }
        if (zzyx5.getType() == 0) {
            str = "w:customXmlMoveFromRangeStart";
        } else {
            str = "w:customXmlMoveToRangeStart";
        }
        zzZ(str, zzyx5, i);
    }

    @Override // com.aspose.words.zzYU6
    public final void zzY(zzYX5 zzyx5, int i) {
        if (zzyx5.getType() != 2) {
            zzZ(zzyx5.getType() == 0 ? "w:moveFrom" : "w:moveTo", zzyx5, i);
        }
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZ(zzZMK zzzmk, String str, int i) {
        zzZ(str, i, zzzmk.getAuthor(), zzzmk.zzZx());
    }

    @Override // com.aspose.words.zzYU6
    public final void zzW(zzZV8 zzzv8, int i) {
        zzZ(zzzv8.getType() == 0 ? "w:customXmlInsRangeStart" : "w:customXmlDelRangeStart", zzzv8, i);
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZ(zzZV8 zzzv8, int i) {
        zzZ(zzzv8.getType() == 0 ? "w:ins" : "w:del", i, zzzv8.getAuthor(), zzzv8.zzZx());
    }

    @Override // com.aspose.words.zzYU6
    public final void zzW(zzYX5 zzyx5, int i) {
        String str;
        if (zzyx5.getType() == 2) {
            return;
        }
        if (zzyx5.getType() == 0) {
            str = "w:customXmlMoveFromRangeEnd";
        } else {
            str = "w:customXmlMoveToRangeEnd";
        }
        zzZ(str, i, "", com.aspose.words.internal.zzZQ9.zz35);
        zzo();
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZ(zzYX5 zzyx5, int i) {
        zzZ(zzyx5.getType() == 1 ? "w:moveTo" : "w:moveFrom", i, zzyx5.getAuthor(), zzyx5.zzZx());
    }

    @Override // com.aspose.words.zzYU6
    public final void zzZ(zzYTV zzytv, int i) {
        String str = zzytv.zzYyr() ? "w:ins" : "w:numberingChange";
        if ("w:numberingChange".equals(str) && this.zzjZ == 2) {
            zzT(65536, com.aspose.words.internal.zzZKN.format("The element '{0}' is not supported by Strict Open XML Document format, discarded.", "numberingChange"));
            return;
        }
        zzZ(str, i, zzytv.getAuthor(), zzytv.zzZx());
        if (zzytv.zzYys()) {
            zzX("w:original", zzYU3.zzZ(zzytv));
        }
        zzo();
    }

    public final void zzW(zzJH zzjh) {
        zzX("a:pt", "x", zzjh.zzZSp().getString(), "y", zzjh.zzZSo().getString());
    }

    public final void zzZ(zz3Z zz3z, String str, String str2, boolean z) {
        if (!zz3z.isEmpty() || z) {
            zzY(com.aspose.words.internal.zzZKN.format("{0}:{1}", str, str2));
            if (!zz3z.isEmpty()) {
                zzZ(str, "l", zz3z.zzZwF());
                zzZ(str, "t", zz3z.zzZwG());
                zzZ(str, "r", zz3z.zzZwE());
                zzZ(str, "b", zz3z.zzZwH());
            }
            zzo();
        }
    }

    private void zzZ(String str, String str2, double d) {
        if (com.aspose.words.internal.zzAN.zzZG(zz3W.zzXy(d)) != 0) {
            zz0(zz56.zzZl(str, str2), zz3W.zzS(d, this.zzjZ == 2));
        }
    }

    private void zzZ(String str, zzYJC zzyjc, int i) {
        zzZ(str, i, zzyjc.getAuthor(), zzyjc.zzZx());
        zzo();
    }

    private void zzZ(String str, int i, String str2, com.aspose.words.internal.zzZQ9 zzzq9) {
        zzY(str);
        zzZj("w:id", i);
        zz0("w:author", str2);
        if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9, com.aspose.words.internal.zzZQ9.zz35)) {
            return;
        }
        zz0("w:date", com.aspose.words.internal.zzJB.zzR(zzzq9));
    }
}
