package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGK {
    private zzYHZ zzXuG;
    private zzYHB zzXuI;
    private zzYEM zzXwl;

    public zzYGK(zzYEM zzyem) {
        this.zzXwl = zzyem;
        this.zzXuG = zzyem.zzYfW();
    }

    private void zzx(boolean z, boolean z2) throws Exception {
        for (zzZ7N zzz7n : z2 ? this.zzXuI.zzYiy() : this.zzXuI.zzYiz()) {
            Object value = zzz7n.getValue();
            switch (zzz7n.zzKh()) {
                case 60:
                case 250:
                    this.zzXuG.zz6(z ? "\\ab" : "\\b", ((zzZU) value).toBool());
                    break;
                case 70:
                case StyleIdentifier.SUBTLE_EMPHASIS /* 260 */:
                    this.zzXuG.zz6(z ? "\\ai" : "\\i", ((zzZU) value).toBool());
                    break;
                case 190:
                case StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4 /* 350 */:
                    this.zzXuG.zzZ5(z ? "\\afs" : "\\fs", ((Integer) value).intValue());
                    break;
                case 230:
                case 270:
                    if (z) {
                        this.zzXuG.zzZ5("\\af", this.zzXwl.zzT((zzU1) value));
                    }
                    break;
                case StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2 /* 340 */:
                case 380:
                    if (z) {
                        this.zzXuG.zzZ5("\\alang", ((Integer) value).intValue());
                    } else {
                        this.zzXuG.zzZ5("\\lang", this.zzXuI.zzYiD() ? 1024 : ((Integer) value).intValue());
                        this.zzXuG.zzZ5("\\langnp", ((Integer) value).intValue());
                    }
                    break;
                case 390:
                    if (!z) {
                        this.zzXuG.zzZ5("\\langfe", this.zzXuI.zzYiD() ? 1024 : ((Integer) value).intValue());
                        this.zzXuG.zzZ5("\\langfenp", ((Integer) value).intValue());
                    }
                    break;
                default:
                    com.aspose.words.internal.zzZKN.format("Unhandled font attribute: {0}", Integer.valueOf(zzz7n.zzKh()));
                    break;
            }
        }
    }

    public final void zzZ(zzYHB zzyhb, boolean z) throws Exception {
        this.zzXuI = zzyhb;
        if (z) {
            zzx(false, false);
            return;
        }
        if (zzyhb.zzYiz().size() == 0 && this.zzXuI.zzYiy().size() == 0) {
            return;
        }
        if (this.zzXuI.zzYiC() == 1 && this.zzXuI.zzYiB() == -1) {
            zzZ("\\ltrch", false, "\\rtlch", true);
            return;
        }
        if ((this.zzXuI.zzYiC() == -1 && this.zzXuI.zzYiB() == -1) || (this.zzXuI.zzYiC() == 0 && this.zzXuI.zzYiB() == -1)) {
            zzZ("\\rtlch", true, "\\ltrch", false);
            return;
        }
        if (this.zzXuI.zzYiC() == -1 && this.zzXuI.zzYiB() == 1) {
            zzZ("\\fcs0", false, "\\fcs1", true);
            return;
        }
        if (this.zzXuI.zzYiC() == -1 && this.zzXuI.zzYiB() == 0) {
            zzZ("\\fcs1", true, "\\fcs0", false);
            return;
        }
        if (this.zzXuI.zzYiC() == 0 && this.zzXuI.zzYiB() == 0) {
            zzZ("\\rtlch\\fcs1", true, "\\ltrch\\fcs0", false);
            return;
        }
        if (this.zzXuI.zzYiC() == 0 && this.zzXuI.zzYiB() == 1) {
            zzZ("\\rtlch\\fcs0", false, "\\ltrch\\fcs1", true);
            return;
        }
        if (this.zzXuI.zzYiC() == 1 && this.zzXuI.zzYiB() == 0) {
            zzZ("\\ltrch\\fcs1", false, "\\rtlch\\fcs0", true);
        } else if (this.zzXuI.zzYiC() == 1 && this.zzXuI.zzYiB() == 1) {
            zzZ("\\ltrch\\fcs0", false, "\\ltrch\\fcs1", true);
        } else {
            zzx(false, false);
        }
    }

    private void zzZ(String str, boolean z, String str2, boolean z2) throws Exception {
        this.zzXuG.zzCD(str);
        zzx(true, z);
        this.zzXuG.zzCD(str2);
        zzx(false, z2);
    }
}
