package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZII extends zzZUY {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("middle", "center", "absmiddle", "left", "right", "justify");

    public static void zzS(zzZAS zzzas, zzPR zzpr) {
        zzL4 zzl4ZzS2 = zzL4.zzS2(zzzas.zzKM("width"));
        if (zzl4ZzS2 != null) {
            zzpr.zzV(new zzM3("width", zzl4ZzS2, (byte) 0));
        }
    }

    public static void zzT(zzZAS zzzas, zzPR zzpr) {
        zzL4 zzl4ZzS2 = zzL4.zzS2(zzzas.zzKM("height"));
        if (zzl4ZzS2 != null) {
            zzpr.zzV(new zzM3("height", zzl4ZzS2, (byte) 0));
        }
    }

    public void zzY(zzZAS zzzas, zzPR zzpr) {
    }

    public abstract void zzZ(zzZAS zzzas, zzPR zzpr);

    @Override // com.aspose.words.zzZUY
    public final void zzZ(zzZBM zzzbm, zzPR zzpr) {
        zzZ((zzZAS) zzzbm, zzpr);
    }

    public static void zzZ(zzZBM zzzbm, zzPR zzpr, boolean z) {
        int iZzTP = zzUR.zzTP(com.aspose.words.internal.zzZKN.zzU2(zzzbm.getAttributeValue("align", "")));
        if (iZzTP == 0 || iZzTP == 1) {
            zzpr.zzV(new zzM3("text-align", zzL4.zzZmw, (byte) 0));
            return;
        }
        if (iZzTP == 2) {
            if (z) {
                zzpr.zzV(new zzM3("text-align", zzL4.zzZmF, (byte) 0));
            }
        } else if (iZzTP == 3) {
            zzpr.zzV(new zzM3("text-align", zzL4.zzZmy, (byte) 0));
        } else if (iZzTP == 4) {
            zzpr.zzV(new zzM3("text-align", zzL4.zzZmx, (byte) 0));
        } else {
            if (iZzTP != 5) {
                return;
            }
            zzpr.remove("text-align");
        }
    }

    @Override // com.aspose.words.zzZUY
    public final void zzY(zzZBM zzzbm, zzPR zzpr) {
        zzY((zzZAS) zzzbm, zzpr);
    }
}
