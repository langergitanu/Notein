package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYUG {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("rules", "idmap", "start", "end", "idref", "connectloc");

    private static void zzJ(zzYU4 zzyu4) {
        zzyu4.zzZ(65536, 2, com.aspose.words.internal.zzZKN.format("Tag with name '{0}' is not supported.", zzyu4.getLocalName()));
    }

    private static void zzW(zzYU4 zzyu4, Map<String, zzTM> map) {
        zzTM zztm = new zzTM();
        String value = "";
        while (zzyu4.zzi()) {
            if ("idref".equals(zzyu4.getLocalName())) {
                value = zzyu4.getValue();
            }
        }
        while (zzyu4.zzQ("r")) {
            if ("proxy".equals(zzyu4.getLocalName())) {
                zzZ(zzyu4, zztm);
            } else {
                zzyu4.zzk();
            }
        }
        if (com.aspose.words.internal.zzZYD.zzXk(zztm.zzZsC) && com.aspose.words.internal.zzZYD.zzXk(zztm.zzZsB) && !map.containsKey(value)) {
            com.aspose.words.internal.zzZQF.zzY(map, value, zztm);
        }
    }

    private static void zzX(zzYU4 zzyu4, Map<String, zzTM> map) {
        while (zzyu4.zzQ("rules")) {
            if ("r".equals(zzyu4.getLocalName())) {
                zzW(zzyu4, map);
            } else {
                zzyu4.zzk();
            }
        }
    }

    private static void zzY(zzYU4 zzyu4, Map<String, zzTM> map) {
        while (zzyu4.zzQ("shapelayout")) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 0) {
                zzX(zzyu4, map);
            } else if (iZzTP != 1) {
                zzyu4.zzk();
            }
        }
    }

    public static void zzZ(zzYU4 zzyu4, Map<String, zzTM> map) {
        String localName = zzyu4.getLocalName();
        while (zzyu4.zzQ(localName)) {
            if ("shapelayout".equals(zzyu4.getLocalName())) {
                zzY(zzyu4, map);
            } else {
                zzyu4.zzk();
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzTM zztm) {
        while (true) {
            boolean z = false;
            while (zzyu4.zzi()) {
                int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
                if (iZzTP == 2) {
                    z = true;
                } else if (iZzTP != 3) {
                    if (iZzTP != 4) {
                        if (iZzTP != 5) {
                            zzJ(zzyu4);
                        } else if (z) {
                            zztm.zzZsE = zzyu4.zzb();
                        } else {
                            zztm.zzZsD = zzyu4.zzb();
                        }
                    } else if (z) {
                        zztm.zzZsC = zzyu4.getValue();
                    } else {
                        zztm.zzZsB = zzyu4.getValue();
                    }
                }
            }
            return;
        }
    }
}
