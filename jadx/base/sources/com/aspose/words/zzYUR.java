package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUR {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("w:tblPrChange", "w:tblPrExChange", "w:trPrChange");

    private static zzY6G zzO(zzY6G zzy6g) {
        if (zzy6g.zz6D()) {
            WordAttrCollection wordAttrCollection = (WordAttrCollection) zzy6g.zzbn();
            wordAttrCollection.zzW(zzP(zzy6g));
            wordAttrCollection.remove(10010);
            if (wordAttrCollection.getCount() > 0) {
                wordAttrCollection.zzZ(zzy6g.zzYsN());
                return (zzY6G) wordAttrCollection;
            }
        } else if (zzy6g.zzYrW() || zzy6g.zzYrV()) {
            return zzy6g;
        }
        return null;
    }

    private static zzY6G zzP(zzY6G zzy6g) {
        zzY6G zzy6g2 = (zzY6G) zzy6g.zzbn();
        zzy6g2.zzYpN();
        return zzy6g2;
    }

    private static void zzX(zzYUS zzyus, zzY6G zzy6g, zzYU6 zzyu6, boolean z, zzZ9W zzz9w, boolean z2) throws Exception {
        if (z || zzyus.zzXSR <= 0) {
            return;
        }
        if (z2) {
            zzyu6.zzY("w:tblPrEx");
        }
        zzZ(zzyus, zzyu6, z);
        zzZ("w:tblPrExChange", zzy6g, zzyu6, z, zzz9w, zzz9w.zzZmh());
        if (z2) {
            zzyu6.zzp();
        }
    }

    private static void zzY(zzYUS zzyus, zzY6G zzy6g, zzYU6 zzyu6, boolean z, zzZ9W zzz9w, boolean z2) throws Exception {
        if (zzyus.zzXSS <= 0) {
            if (zzy6g == null) {
                return;
            }
            if (!zzy6g.zzYrW() && !zzy6g.zzYrV()) {
                return;
            }
        }
        boolean z3 = zzz9w.getCompliance() == 2;
        if (z2) {
            zzyu6.zzY("w:trPr");
        }
        zzyu6.zzYz("w:divId", zzyus.zzXTx);
        int i = zzyus.zzXSQ;
        if (i != 0) {
            zzyu6.zzYz("w:gridBefore", com.aspose.words.internal.zzJB.zzWF(i));
        }
        int i2 = zzyus.zzXSO;
        if (i2 > 0) {
            zzyu6.zzYz("w:gridAfter", com.aspose.words.internal.zzJB.zzWF(i2));
        }
        PreferredWidth preferredWidth = zzyus.zzXSM;
        if (preferredWidth == null || !preferredWidth.zzYmB()) {
            int i3 = zzyus.zzXSP;
            if (i3 != 0) {
                zzyu6.zzV("w:wBefore", i3, z3);
            }
        } else {
            zzyu6.zzZ("w:wBefore", zzyus.zzXSM, z3);
        }
        PreferredWidth preferredWidth2 = zzyus.zzXSL;
        if (preferredWidth2 == null || !preferredWidth2.zzYmB()) {
            int i4 = zzyus.zzXSN;
            if (i4 != 0) {
                zzyu6.zzV("w:wAfter", i4, z3);
            }
        } else {
            zzyu6.zzZ("w:wAfter", zzyus.zzXSL, z3);
        }
        if (zzyus.zzXSX) {
            zzyu6.zzZ("w:hidden", (String) null);
        }
        Object obj = zzyus.zzXSZ;
        if (obj != null) {
            if (((Boolean) obj).booleanValue()) {
                zzyu6.zzZl("w:cantSplit", 0);
            } else {
                zzyu6.zzZ("w:cantSplit", (String) null);
            }
        }
        zzyu6.zzX("w:trHeight", zzyus.zzXSK ? "w:hRule" : "w:h-rule", zzyus.zzXT1, "w:val", zzyus.zzXT2);
        Object obj2 = zzyus.zzXT0;
        if (obj2 != null) {
            if (((Boolean) obj2).booleanValue()) {
                zzyu6.zzZ("w:tblHeader", (String) null);
            } else {
                zzyu6.zzZl("w:tblHeader", 0);
            }
        }
        zzyu6.zzZ("w:tblCellSpacing", zzyus.zzXTg, z3);
        zzyu6.zzYz("w:jc", zzyus.zzXTh);
        zzZ("w:trPrChange", zzy6g, zzyu6, z, zzz9w, zzz9w.zzZmh());
        if (zzy6g != null) {
            if (zzy6g.zzYrW()) {
                zzyu6.zzZ(zzy6g.getDeleteRevision(), zzz9w.zzZpW());
                zzyu6.zzZmP();
            }
            if (zzy6g.zzYrV()) {
                zzyu6.zzZ(zzy6g.getInsertRevision(), zzz9w.zzZpW());
                zzyu6.zzZmP();
            }
        }
        if (z2) {
            zzyu6.zzp();
        }
    }

    public static void zzZ(zzY6G zzy6g, boolean z, boolean z2, zzZ9W zzz9w) throws Exception {
        Object obj;
        if (zzy6g == null) {
            return;
        }
        zzYU6 zzyu6ZzZm2 = zzz9w.zzZm2();
        zzYUS zzyus = new zzYUS(zzP(zzy6g), z2, zzz9w);
        zzY6G zzy6gZzO = zzO(zzy6g);
        if (zzy6gZzO != null && (obj = zzyus.zzXSY) != null && ((Boolean) obj).booleanValue()) {
            zzy6gZzO.zzXXq();
        }
        if (z) {
            zzZ(zzyus, zzy6gZzO, zzyu6ZzZm2, z2, zzz9w, true);
            return;
        }
        if (zzyus.zzXSK) {
            zzyu6ZzZm2.zz0("w:rsidR", zzyus.zzXST);
            zzyu6ZzZm2.zz0("w:rsidTr", zzyus.zzXSU);
        }
        zzX(zzyus, zzy6gZzO, zzyu6ZzZm2, z2, zzz9w, true);
        zzY(zzyus, zzy6gZzO, zzyu6ZzZm2, z2, zzz9w, true);
    }

    private static void zzZ(zzYUS zzyus, zzY6G zzy6g, zzYU6 zzyu6, boolean z, zzZ9W zzz9w, boolean z2) throws Exception {
        if (z2) {
            zzyu6.zzY("w:tblPr");
        }
        zzZ(zzyus, zzyu6, zzz9w);
        if (zzyus.zzXSR > 0) {
            zzZ(zzyus, zzyu6, z);
        }
        zzZ("w:tblPrChange", zzy6g, zzyu6, z, zzz9w, zzz9w.zzZmh());
        if (z2) {
            zzyu6.zzp();
        }
    }

    private static void zzZ(String str, zzY6G zzy6g, zzYU6 zzyu6, boolean z, zzZ9W zzz9w, boolean z2) throws Exception {
        if (zzy6g == null || !zzy6g.zz6D()) {
            return;
        }
        zzYUS zzyus = new zzYUS(zzy6g, z, zzz9w);
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0) {
            if (zzyus.zzXSR > 0) {
                zzyu6.zzZ(zzy6g.zzYsN(), str, zzz9w.zzZpW());
                zzZ(zzyus, (zzY6G) null, zzyu6, z, zzz9w, z2);
                zzyu6.zzZmP();
                return;
            }
            return;
        }
        if (iZzTP == 1) {
            if (zzyus.zzXSR > 0) {
                zzyu6.zzZ(zzy6g.zzYsN(), str, zzz9w.zzZpW());
                zzX(zzyus, null, zzyu6, z, zzz9w, z2);
                zzyu6.zzZmP();
                return;
            }
            return;
        }
        if (iZzTP == 2) {
            if (zzyus.zzXSS > 0) {
                zzyu6.zzZ(zzy6g.zzYsN(), str, zzz9w.zzZpW());
                zzY(zzyus, null, zzyu6, z, zzz9w, z2);
                zzyu6.zzZmP();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unexpected tag name.");
    }

    private static void zzZ(zzYUS zzyus, zzYU6 zzyu6, zzZ9W zzz9w) {
        zzyu6.zzYz("w:tblStyle", zzyus.zzXTy);
        zzyu6.zzYz("w:tblStyleRowBandSize", zzyus.zzXTw);
        zzyu6.zzYz("w:tblStyleColBandSize", zzyus.zzXTv);
        if (zzyus.zzXSK && zzz9w.getCompliance() != 0) {
            int mswVersion = zzz9w.getDocument().zzYBa().getCompatibilityOptions().getMswVersion();
            if (mswVersion == 0 || mswVersion > 11) {
                zzyu6.zzYz("w:tblCaption", zzyus.zzXSW);
            }
            zzyu6.zzYz("w:tblDescription", zzyus.zzXSV);
        }
        zzyu6.zzX("w:tblpPr", "w:leftFromText", zzyus.zzXTt, "w:rightFromText", zzyus.zzXTr, "w:topFromText", zzyus.zzXTu, "w:bottomFromText", zzyus.zzXTs, "w:vertAnchor", zzyus.zzXTq, "w:horzAnchor", zzyus.zzXTp, "w:tblpXSpec", zzyus.zzXTo, "w:tblpX", zzyus.zzXTn, "w:tblpYSpec", zzyus.zzXTm, "w:tblpY", zzyus.zzXTl);
        if (!zzyus.zzXTk) {
            zzyu6.zzYz("w:tblOverlap", zzyus.zzXSK ? "never" : "Never");
        }
        if (zzyus.zzXTj) {
            zzyu6.zzZ("w:bidiVisual", (String) null);
        }
    }

    private static void zzY(zzYUS zzyus, zzYU6 zzyu6, boolean z) {
        boolean z2 = zzyus.zzXSK;
        if (!z2 && !z) {
            String str = zzyus.zzXT3;
            if (str == null) {
                zzyu6.zzYz("w:tblLook", com.aspose.words.internal.zzJB.zzWu(zzY6G.zzjU(TableStyleOptions.DEFAULT)));
                return;
            } else if (com.aspose.words.internal.zzZKN.equals(str, com.aspose.words.internal.zzJB.zzWu(zzY6G.zzjU(TableStyleOptions.DEFAULT_2003)))) {
                return;
            }
        } else {
            String str2 = zzyus.zzXT3;
            if (str2 == null) {
                return;
            }
            if (z2 && zzyus.zzXSJ == 2) {
                zzZ(zzY6G.zzjU(zzYU3.zzGU(str2)), zzyu6);
                return;
            }
        }
        zzyu6.zzYz("w:tblLook", zzyus.zzXT3);
    }

    private static void zzZ(zzYUS zzyus, zzYU6 zzyu6, boolean z) throws Exception {
        boolean z2 = zzyus.zzXSK && zzyus.zzXSJ == 2;
        zzyu6.zzZ("w:tblW", zzyus.zzXTi, z2);
        zzyu6.zzYz("w:jc", zzyus.zzXTh);
        zzyu6.zzZ("w:tblCellSpacing", zzyus.zzXTg, z2);
        zzyu6.zzZ("w:tblInd", zzyus.zzXTf, z2);
        zzyu6.zzV("w:tblBorders", "w:top", zzyus.zzXTa, z2 ? "w:start" : "w:left", zzyus.zzXTc, "w:bottom", zzyus.zzXTe, z2 ? "w:end" : "w:right", zzyus.zzXTb, "w:insideH", zzyus.zzXTd, "w:insideV", zzyus.zzXT9);
        zzyu6.zzW(zzyus.zzXT8);
        if (!z && !((Boolean) zzyus.zzXSY).booleanValue()) {
            zzyu6.zzX("w:tblLayout", "w:type", zzyus.zzXSK ? "fixed" : "Fixed");
        }
        zzyu6.zzZ("w:tblCellMar", zzyus.zzXT7, zzyus.zzXT6, zzyus.zzXT5, zzyus.zzXT4, z2);
        zzY(zzyus, zzyu6, z);
    }

    private static void zzZ(int i, zzYU6 zzyu6) {
        if (i == 0) {
            return;
        }
        zzyu6.zzY("w:tblLook");
        zzyu6.zzx("w:firstColumn", (i & 128) != 0);
        zzyu6.zzx("w:firstRow", (i & 32) != 0);
        zzyu6.zzx("w:lastColumn", (i & 256) != 0);
        zzyu6.zzx("w:lastRow", (i & 64) != 0);
        zzyu6.zzx("w:noHBand", (i & 512) == 0);
        zzyu6.zzx("w:noVBand", (i & 1024) == 0);
        zzyu6.zzp();
    }
}
