package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY10 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("cnfStyle", "divId", "wBefore", "wAfter", "gridBefore", "gridAfter", "cantSplit", "trHeight", "tblHeader", "tblCellSpacing", "jc", "annotation", "h-rule", "val");

    public static void zzZ(zzY6G zzy6g, zzYVB zzyvb) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        if (zzyvb.zzYyZ().zzZrB()) {
            zzyu4ZzZsD.zzYyH();
            return;
        }
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    zzyu4ZzZsD.zzYyH();
                    break;
                case 1:
                    zzy6g.zzQ(5015, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                case 2:
                    PreferredWidth preferredWidthZzX = zzyu4ZzZsD.zzX(null);
                    zzy6g.zzQ(4253, preferredWidthZzX);
                    zzy6g.zzQ(4250, Integer.valueOf(preferredWidthZzX.zzYmE()));
                    zzy6g.zzQ(4251, Integer.valueOf(preferredWidthZzX.zzYmE()));
                    break;
                case 3:
                    PreferredWidth preferredWidthZzX2 = zzyu4ZzZsD.zzX(null);
                    zzy6g.zzQ(4261, preferredWidthZzX2);
                    zzy6g.zzQ(4260, Integer.valueOf(preferredWidthZzX2.zzYmE()));
                    break;
                case 4:
                    zzy6g.zzQ(5104, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                case 5:
                    zzyu4ZzZsD.zzk();
                    break;
                case 6:
                    zzy6g.zzQ(4360, Boolean.valueOf(!zzyu4ZzZsD.zzYyD()));
                    break;
                case 7:
                    zzZ(zzy6g, zzyu4ZzZsD);
                    break;
                case 8:
                    zzy6g.zzQ(4040, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 9:
                    PreferredWidth preferredWidthZzU = zzyu4ZzZsD.zzU(null);
                    if (preferredWidthZzU != null) {
                        zzy6g.zzQ(4290, preferredWidthZzU);
                    }
                    break;
                case 10:
                    zzy6g.setAlignment(zzYUB.zzT(zzyu4ZzZsD.zzV("val", null), null));
                    break;
                case 11:
                    zzY1U.zzO(zzyvb, zzy6g);
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private static void zzZ(zzY6G zzy6g, zzYU4 zzyu4) {
        boolean z = false;
        boolean z2 = false;
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 12) {
                zzy6g.setHeightRule(zzYUB.zzHv(zzyu4.getValue()));
                z2 = true;
            } else if (iZzTP != 13) {
                zzyu4.zzZ(16777216, 13, com.aspose.words.internal.zzZKN.format("Tag or attribute with name '{0}' is unexpected.", zzyu4.getLocalName()));
            } else {
                zzy6g.setHeight(zzyu4.zzb());
                z = true;
            }
        }
        if (!z || z2) {
            return;
        }
        zzy6g.setHeightRule(0);
    }
}
