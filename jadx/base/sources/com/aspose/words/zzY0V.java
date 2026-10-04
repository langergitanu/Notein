package com.aspose.words;

import androidx.appcompat.widget.C21559Oooo0oO;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0V extends zzYUM {
    private static com.aspose.words.internal.zzZNR zzWUG = new com.aspose.words.internal.zzZNR("(\u0002)|(\u0003)|(\u0004)|(\u0005)|(\t)|(\r)|(\f|\u000b|\u000e)|(\u001e)|(\u001f)|([^\u0002\u0003\u0004\u0005\t\r\f\u000b\u000e\u001e\u001f]*)", 0);
    private boolean zzWUH;
    private boolean zzWUI;
    private zzY0P zzWVc;
    private zzY1S zzWVf;
    private int zzYNc = 0;

    public zzY0V(zzY0P zzy0p) {
        this.zzWVc = zzy0p;
        this.zzWVf = (zzY1S) zzy0p.zzZm2();
    }

    private void zzO(char c, int i) {
        String strZzt7 = (c != 11 || i == 0) ? null : zzYUQ.zzt7(i);
        if (c == 11 && i == 0) {
            this.zzWVf.zzZ("w:br", (String) null);
        } else {
            this.zzWVf.zzX("w:br", "w:type", zzYUQ.zzX(c, false), "w:clear", strZzt7);
        }
    }

    private void zzZkf() {
        this.zzWVf.zzZ("w:tab", (String) null);
    }

    private void zzZkg() {
        this.zzWVf.zzZ(this.zzYNc == 0 ? "w:footnoteRef" : "w:endnoteRef", (String) null);
    }

    private void zzyD(String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzWVf.zzZ(this.zzWVc.zzZlU() ? this.zzWUH ? "w:delInstrText" : "w:instrText" : this.zzWUH ? "w:delText" : this.zzWVf.zzYyI() ? "m:t" : "w:t", str);
        }
    }

    public final void zzEC(int i) {
        this.zzYNc = i;
    }

    @Override // com.aspose.words.zzYUM
    public final void zzT(zzYEF zzyef) {
        this.zzWVf.zzo();
        if (this.zzWUI) {
            this.zzWUI = false;
        }
        if (this.zzWUH) {
            this.zzWUH = false;
        }
    }

    public final void zzW(SpecialChar specialChar) throws Exception {
        zzY(specialChar);
    }

    @Override // com.aspose.words.zzYUM
    public final void zzY(Inline inline) throws Exception {
        String text = inline.getText();
        if (inline.zzZYh().contains(885)) {
            zzZ(this.zzWVc, inline);
            return;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(text)) {
            if (text.charAt(0) == 1) {
                return;
            }
            boolean zZzn = com.aspose.words.internal.zzZYD.zzn(text.charAt(0));
            boolean zContains = inline.zzZYh().contains(230);
            if (zZzn && zContains) {
                for (int i = 0; i < text.length(); i++) {
                    zzW(inline);
                    this.zzWVf.zzX("w:sym", "w:font", inline.zzZYh().getNameOther(), "w:char", com.aspose.words.internal.zzJB.zzWu(text.charAt(i)));
                    zzT(inline.zzZYh());
                }
                return;
            }
            zzW(inline);
            for (com.aspose.words.internal.zzZNT zzznt : zzWUG.zzUW(text)) {
                String strOooO00o = OooO0O0.OooO00o(zzznt, 10);
                if (com.aspose.words.internal.zzZYD.zzXk(strOooO00o)) {
                    zzyD(strOooO00o);
                } else if (C21559Oooo0oO.OooO0OO(zzznt, 1)) {
                    zzZkg();
                } else if (C21559Oooo0oO.OooO0OO(zzznt, 2)) {
                    this.zzWVf.zzZ("w:separator", (String) null);
                } else if (C21559Oooo0oO.OooO0OO(zzznt, 3)) {
                    this.zzWVf.zzZ("w:continuationSeparator", (String) null);
                } else if (C21559Oooo0oO.OooO0OO(zzznt, 4)) {
                    this.zzWVf.zzZ("w:annotationRef", (String) null);
                } else if (C21559Oooo0oO.OooO0OO(zzznt, 5)) {
                    zzZkf();
                } else if (C21559Oooo0oO.OooO0OO(zzznt, 6)) {
                    this.zzWVf.zzZ("w:cr", (String) null);
                } else {
                    String strOooO00o2 = OooO0O0.OooO00o(zzznt, 7);
                    if (com.aspose.words.internal.zzZYD.zzXk(strOooO00o2)) {
                        zzO(strOooO00o2.charAt(0), inline.zzZYh().zzZUF());
                    } else if (C21559Oooo0oO.OooO0OO(zzznt, 9)) {
                        if (!com.aspose.words.internal.zzZKN.zzS(text, ControlChar.zzZs3, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                            zzT(inline.zzZYh());
                            zzW(inline);
                        }
                        this.zzWVf.zzZ("w:softHyphen", (String) null);
                    } else if (C21559Oooo0oO.OooO0OO(zzznt, 8)) {
                        if (!com.aspose.words.internal.zzZKN.zzS(text, ControlChar.zzZs4, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                            zzT(inline.zzZYh());
                            zzW(inline);
                        }
                        this.zzWVf.zzZ("w:noBreakHyphen", (String) null);
                    }
                }
            }
            zzT(inline.zzZYh());
        }
    }

    public final boolean zzZ(zzYEF zzyef, zzZ9G zzz9g) throws Exception {
        boolean z = true;
        this.zzWUI = zzyef.zzYrV() || zzyef.zzXS3();
        if (!zzyef.zzYrW() && !zzyef.zzXS4()) {
            z = false;
        }
        this.zzWUH = z;
        zzY1S zzy1s = this.zzWVf;
        zzy1s.zzY(zzy1s.zzYyI() ? "m:r" : "w:r");
        return zzY0X.zzXSr().zzZ(zzyef, zzz9g, false, this.zzWVc);
    }

    public final void zzp(Run run) throws Exception {
        zzY(run);
    }

    @Override // com.aspose.words.zzYUM
    public final void zzW(Inline inline) throws Exception {
        zzYEF zzyefZzZYh = inline.zzZYh();
        if (this.zzWVc.zzXSe() && inline.getParentParagraph() != null && inline.getParentParagraph().isInCell()) {
            zzyefZzZYh = zzZ7R.zzZ(inline, 1);
        }
        zzZ(zzyefZzZYh, inline);
    }
}
