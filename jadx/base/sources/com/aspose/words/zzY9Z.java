package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzY9Z extends zzYA3 implements zzZ99 {
    private int zzXbA;
    private String zzXce;
    private Node zzYR6;

    public zzY9Z(Node node) {
        int i;
        super(EditingLanguage.ARABIC_YEMEN);
        this.zzYR6 = node;
        CompositeNode ancestor = node.getAncestor(InlineStory.class);
        if (ancestor != null) {
            int nodeType = ancestor.getNodeType();
            if (nodeType == 19) {
                i = 4;
            } else if (nodeType != 20) {
                return;
            } else {
                i = ((Footnote) ancestor).getFootnoteType() == 0 ? 2 : 3;
            }
            this.zzXbA = i;
        }
    }

    private static zzZ2D zzZg(zzYAU zzyau) {
        while (zzyau != null && zzyau.zza9() != null) {
            zzYCT zzyctZzYTk = zzyau.zza9().zzYTk();
            zzZ2D zzz2d = (zzZ2D) com.aspose.words.internal.zzZKW.zzZ(zzyctZzYTk, zzZ2D.class);
            if (zzz2d == null) {
                if (((zzZKX) com.aspose.words.internal.zzZKW.zzZ(zzyctZzYTk, zzZKX.class)) == null) {
                    zzUI zzui = (zzUI) com.aspose.words.internal.zzZKW.zzZ(zzyctZzYTk, zzUI.class);
                    if (zzui == null) {
                        zzYC0 zzyc0 = (zzYC0) com.aspose.words.internal.zzZKW.zzZ(zzyctZzYTk, zzYC0.class);
                        if (zzyc0 == null) {
                            break;
                        }
                        zzyau = ((zzYBY) zzyc0.zza9()).zzY8N();
                    } else {
                        zzyau = zzui.zzZZC();
                    }
                } else {
                    return null;
                }
            } else {
                return zzz2d;
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return 1;
    }

    @Override // com.aspose.words.zzZ99
    public final String getScreenTip() {
        return null;
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() throws Exception {
        int i = this.zzXbA;
        if ((i == 2 || i == 3) && zzY6S() != null) {
            return ((zzYVN) zzY6S().zzYTk()).zzYzk().getText();
        }
        this.zzYR6.getText();
        char cCharAt = this.zzYR6.getText().charAt(0);
        if (cCharAt == 2) {
            zzZ2D zzz2dZzZg = zzZg(this);
            return zzz2dZzZg == null ? "1" : zzYTW.zzM(1, ((zzZ35) zzz2dZzZg.zzYTt()).zzYLj(), true);
        }
        if (cCharAt == 5) {
            return " ";
        }
        throw new IllegalStateException("Unexpected reference char.");
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzY9Z zzy9z = new zzY9Z(this.zzYR6);
        zzZB(zzy9z);
        return zzy9z;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzY7n() {
        return this.zzXbA;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzY7r() {
        return 1024;
    }

    @Override // com.aspose.words.zzZ99
    public final String zzYWa() {
        return null;
    }

    @Override // com.aspose.words.zzZ99
    public final String zzZkA() {
        if (zza8().zzYT3() && (zzaa() instanceof zzYVI) && this.zzXce == null) {
            this.zzXce = com.aspose.words.internal.zzZKN.format("#_AsposeWordsSpanRef{0}", Integer.valueOf(hashCode()));
        }
        return this.zzXce;
    }
}
