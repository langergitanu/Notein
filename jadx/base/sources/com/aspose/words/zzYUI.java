package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUI {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("rsidRoot", "rsid", "bookFoldPrinting", "bookFoldRevPrinting", "mirrorMargins", "printTwoOnOne", "top", "bottom", "left", "right", "blockQuote", "bodyDiv", "divsChild", "divBdr", "marLeft", "marRight", "marTop", "marBottom");

    public static void zzV(zzYU4 zzyu4, zzZZF zzzzf) {
        while (zzyu4.zzQ("rsids")) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 0) {
                String strZzV = zzyu4.zzV("val", null);
                if (com.aspose.words.internal.zzZYD.zzXk(strZzV)) {
                    zzzzf.zzYVk = zzYU3.zzGU(strZzV);
                }
            } else if (iZzTP == 1) {
                String strZzV2 = zzyu4.zzV("val", null);
                if (com.aspose.words.internal.zzZYD.zzXk(strZzV2)) {
                    zzzzf.zzYVj.add(Integer.valueOf(zzYU3.zzGU(strZzV2)));
                }
            }
        }
    }

    private static void zzY(zzYVB zzyvb, zzZK1 zzzk1) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzYO3 zzyo3ZzZqn = zzyvb.zzZqn();
        while (zzyu4ZzZsD.zzQ("div")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 10:
                    zzzk1.zzA9(1);
                    break;
                case 11:
                    zzzk1.zzA9(2);
                    break;
                case 12:
                    zzZ(zzyvb, zzzk1.getId());
                    break;
                case 13:
                    zzZ(zzyvb, zzzk1);
                    break;
                case 14:
                    zzzk1.zzZYj().zzQ(1592, Integer.valueOf(zzyu4ZzZsD.zzV(zzyo3ZzZqn)));
                    break;
                case 15:
                    zzzk1.zzZYj().zzQ(1593, Integer.valueOf(zzyu4ZzZsD.zzV(zzyo3ZzZqn)));
                    break;
                case 16:
                    zzzk1.zzZYj().zzQ(1594, Integer.valueOf(zzyu4ZzZsD.zzV(zzyo3ZzZqn)));
                    break;
                case 17:
                    zzzk1.zzZYj().zzQ(1595, Integer.valueOf(zzyu4ZzZsD.zzV(zzyo3ZzZqn)));
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }

    public static void zzZ(zzYVB zzyvb, zzZZF zzzzf) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
        if (iZzTP == 2) {
            if (zzyu4ZzZsD.zzYyD()) {
                zzzzf.zzYWh = 3;
                return;
            }
            return;
        }
        if (iZzTP == 3) {
            if (zzyu4ZzZsD.zzYyD()) {
                zzzzf.zzYWh = 4;
            }
        } else if (iZzTP == 4) {
            if (zzyu4ZzZsD.zzYyD()) {
                zzzzf.zzYWh = 1;
            }
        } else if (iZzTP != 5) {
            zzyu4ZzZsD.zzk();
        } else if (zzyu4ZzZsD.zzYyD()) {
            zzzzf.zzYWh = 2;
        }
    }

    public static void zzt(zzYVB zzyvb) {
        zzZ(zzyvb, 0);
    }

    private static void zzZ(zzYVB zzyvb, int i) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        if (zzyvb.zzYyZ().zzZrB()) {
            zzyu4ZzZsD.zzYyH();
            return;
        }
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            if ("div".equals(zzyu4ZzZsD.getLocalName())) {
                zzZK1 zzzk1 = new zzZK1(zzyu4ZzZsD.zzX("id", -1));
                zzzk1.setParentId(i);
                zzY(zzyvb, zzzk1);
                zzzk1.zzZ4i();
                zzyvb.getDocument().zzZq2().zzZ(zzzk1);
            } else {
                zzyu4ZzZsD.zzk();
            }
        }
    }

    private static void zzZ(zzYVB zzyvb, zzZK1 zzzk1) {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("divBdr")) {
            switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
                case 6:
                    zzzk1.zzZYj().zzQ(1350, zzyu4ZzZsD.zzYyB());
                    break;
                case 7:
                    zzzk1.zzZYj().zzQ(1370, zzyu4ZzZsD.zzYyB());
                    break;
                case 8:
                    zzzk1.zzZYj().zzQ(1360, zzyu4ZzZsD.zzYyB());
                    break;
                case 9:
                    zzzk1.zzZYj().zzQ(1380, zzyu4ZzZsD.zzYyB());
                    break;
                default:
                    zzyu4ZzZsD.zzk();
                    break;
            }
        }
    }
}
