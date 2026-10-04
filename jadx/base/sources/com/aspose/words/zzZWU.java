package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWU {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("cnfStyle", "divId", "wBefore", "wAfter", "gridBefore", "gridAfter", "cantSplit", "trHeight", "tblHeader", "tblCellSpacing", "jc", "trPrChange", "del", "ins", "hidden", "hRule", "val");

    public static void zzX(zzYVB zzyvb, zzY6G zzy6g) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        if (zzyvb.zzYyZ().zzZrB()) {
            zzyu4ZzZsD.zzYyH();
            return;
        }
        while (zzyu4ZzZsD.zzQ("trPr")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 0:
                    zzyu4ZzZsD.zzYyH();
                    break;
                case 1:
                    zzy6g.zzQ(5015, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                case 2:
                    PreferredWidth preferredWidthZzX = zzyu4ZzZsD.zzX(zzyo3ZzZqn);
                    zzy6g.zzQ(4253, preferredWidthZzX);
                    zzy6g.zzQ(4250, Integer.valueOf(preferredWidthZzX.zzYmE()));
                    zzy6g.zzQ(4251, Integer.valueOf(preferredWidthZzX.zzYmE()));
                    break;
                case 3:
                    PreferredWidth preferredWidthZzX2 = zzyu4ZzZsD.zzX(zzyo3ZzZqn);
                    zzy6g.zzQ(4261, preferredWidthZzX2);
                    zzy6g.zzQ(4260, Integer.valueOf(preferredWidthZzX2.zzYmE()));
                    break;
                case 4:
                    zzy6g.zzQ(5104, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                case 5:
                    zzy6g.zzQ(5105, Integer.valueOf(zzyu4ZzZsD.zzYyE()));
                    break;
                case 6:
                    zzy6g.zzQ(4360, Boolean.valueOf(!zzyu4ZzZsD.zzYyD()));
                    break;
                case 7:
                    zzZ(zzy6g, zzyu4ZzZsD, zzyo3ZzZqn);
                    break;
                case 8:
                    zzy6g.zzQ(4040, Boolean.valueOf(zzyu4ZzZsD.zzYyD()));
                    break;
                case 9:
                    PreferredWidth preferredWidthZzU = zzyu4ZzZsD.zzU(zzyo3ZzZqn);
                    if (preferredWidthZzU != null) {
                        zzy6g.zzQ(4290, preferredWidthZzU);
                    }
                    break;
                case 10:
                    zzy6g.setAlignment(zzYUB.zzT(zzyu4ZzZsD.zzV("val", null), zzyo3ZzZqn));
                    break;
                case 11:
                    zzZYI.zzY(zzyvb, zzy6g);
                    break;
                case 12:
                    zzZYI.zzZ(zzyvb, zzy6g, 1);
                    break;
                case 13:
                    zzZYI.zzZ(zzyvb, zzy6g, 0);
                    break;
                case 14:
                    zzy6g.zzQ(4520, Boolean.TRUE);
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    private static void zzZ(zzY6G zzy6g, zzYU4 zzyu4, zzYO3 zzyo3) {
        int iZzHv = 0;
        int iZzT = 0;
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 15) {
                iZzHv = zzYUB.zzHv(zzyu4.getValue());
            } else if (iZzTP != 16) {
                zzyu4.zzZ(16777216, 9, com.aspose.words.internal.zzZKN.format("Unexpected attribute '{0}' is occurred while reading document, ignored.", zzyu4.getLocalName()));
            } else if (!com.aspose.words.internal.zzZKN.zzS(zzyu4.getValue(), " ", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                iZzT = zzyu4.zzT(zzyo3);
            }
        }
        zzy6g.zzQ(4120, new zzZKP(iZzHv, iZzT));
    }
}
