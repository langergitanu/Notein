package com.aspose.words;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes6.dex */
final class zzZH4 {
    private boolean zzYpA;
    private boolean zzYpw;
    private Node zzYpx;
    private byte zzYpy;
    private int zzYpz;
    private zzZAO zzYt4;
    private DocumentBase zzZCL;

    public zzZH4(DocumentBase documentBase, boolean z, zzZAO zzzao) {
        this.zzYt4 = zzzao;
        this.zzZCL = documentBase;
        this.zzYpA = z;
    }

    private void zzH(Node node, boolean z) {
        if (!zzZDY.zzM(this.zzYpx, node)) {
            this.zzYpx = z ? node : null;
        }
        if (zzZDY.zzM(this.zzYpx, node)) {
            this.zzYt4.zzZ3E().zzX("dir", z ? "rtl" : "ltr");
        }
        this.zzYpw = false;
        this.zzYpy = (byte) -1;
    }

    private boolean zzI(Node node, boolean z) {
        return zzZDY.zzM(this.zzYpx, node) || z;
    }

    private void zzK(boolean z, boolean z2) {
        String str = z ? "rtl" : "ltr";
        if (z != z2) {
            this.zzYt4.zzZ3E().zzX("dir", str);
        }
        if (zzZ(this.zzYpy, z)) {
            this.zzYt4.zzZ3E().zzZN("span", 0);
            this.zzYt4.zzZ3E().zzX("dir", str);
            this.zzYt4.zzZ3E().zzYXX().zzyz(1);
            this.zzYt4.zzZ3E().endElement("span");
        }
        this.zzYpy = z ? (byte) 1 : (byte) 0;
    }

    private static boolean zzZ(byte b, boolean z) {
        if (b != -1) {
            if ((b == 1) != z) {
                return true;
            }
        }
        return false;
    }

    private void zzzs(int i) {
        String strZzzi = zzZGF.zzzi(i);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzzi)) {
            this.zzYt4.zzZ3E().zzX(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, strZzzi);
        }
    }

    public final void zzR(Section section) {
        zzH(section, section.zzYvR().getBidi());
    }

    public final void zzV(Font font, int i) {
        if (this.zzYpA) {
            int localeIdBi = (font.getBidi() || font.getComplexScript()) ? font.getLocaleIdBi() : font.zzBk(i);
            if (localeIdBi != this.zzYpz) {
                zzzs(localeIdBi);
            }
        }
        if (font.getBidi() || this.zzYpx != null || this.zzYpw) {
            boolean z = false;
            zzK(font.getBidi(), this.zzYpx != null);
            if (font.getBidi() && this.zzYpx == null) {
                z = true;
            }
            this.zzYpw = z;
        }
    }

    public final void zzW(Paragraph paragraph, zzYMX zzymx) {
        if (zzymx == null) {
            zzymx = paragraph.zzZYj();
        }
        zzH(paragraph, zzymx.getBidi());
    }

    public final void zzZ1D() {
        this.zzYpz = EditingLanguage.ENGLISH_US;
        Style style = this.zzZCL.getStyles().get(0);
        if (style != null) {
            this.zzYpz = style.getFont().zzBk(3);
        }
        zzzs(this.zzYpz);
    }

    public final void zzx(Table table) {
        zzH(table, table.getFirstRow().zzZYf().zzXXa().getBidi());
    }

    public final boolean zzy(Table table) {
        return zzI(table, table.getFirstRow().zzZYf().zzXXa().getBidi());
    }
}
