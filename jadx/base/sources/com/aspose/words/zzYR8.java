package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.miui.penengine.p596e.C18773h;

/* JADX INFO: loaded from: classes6.dex */
final class zzYR8 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("list-header", "list-item", "continue-numbering", "continue-list", "id", "start-value", "style-override", ContextChain.TAG_PRODUCT, C18773h.f57233c, "list", "soft-page-break", "number");

    private static void zzX(zzYQ7 zzyq7, CompositeNode compositeNode, zzYR7 zzyr7) throws Exception {
        zzZ(zzyq7, zzyr7);
        zzZ(zzyq7, compositeNode, "list-item", zzyr7);
    }

    private static void zzY(zzYQ7 zzyq7, CompositeNode compositeNode, zzYR7 zzyr7) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq7.zzrM(zzyq7.zzZ0C() + 1);
        while (zzyq9ZzYuT.zzQ("list")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            boolean z = false;
            if (iZzTP == 0) {
                zzyq7.zzS6(true);
                zzo(zzyq7);
                zzZ(zzyq7, compositeNode, "list-header", zzyr7);
                zzyq7.zzS6(false);
            } else if (iZzTP != 1) {
                zzyq9ZzYuT.zzk();
            } else {
                boolean zIsListItem = zzyq7.isListItem();
                zzyq7.zzS6(true);
                zzX(zzyq7, compositeNode, zzyr7);
                if (compositeNode.getNodeType() == 20 && zIsListItem) {
                    z = true;
                }
                zzyq7.zzS6(z);
            }
            zzyq7.zzS9(true);
        }
        zzyq7.zzrM(zzyq7.zzZ0C() - 1);
    }

    public static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, zzYR7 zzyr7) throws Exception {
        int iZzp = zzp(zzyq7);
        if (zzyq7.zzZ0C() == -1) {
            if (iZzp == 1) {
                zzyq7.zzS9(true);
            }
            if (iZzp == 0) {
                zzyq7.zzS9(false);
            }
        } else {
            zzyq7.zzS9(true);
        }
        if (zzyr7 == null || (zzyq7.zzYuP() != null && !com.aspose.words.internal.zzZKN.equals(zzyq7.zzYuP(), zzyr7.getName()))) {
            zzyr7 = (zzYR7) com.aspose.words.internal.zzZKW.zzZ(zzyq7.zzYuS().zzK(zzyq7.zzYuP(), null, zzyq7.zzYuO()), zzYR7.class);
        }
        zzY(zzyq7, compositeNode, zzyr7);
        if (zzyq7.zzZ0C() == -1) {
            zzyq7.zzS9(false);
        }
    }

    private static void zzo(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if ("id".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, false, "text:list-header");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    private static int zzp(zzYQ7 zzyq7) {
        zzyq7.zzE5(null);
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        ?? Equals = -1;
        while (zzyq9ZzYuT.zzi()) {
            if (!zzyq7.zzV(zzyq9ZzYuT)) {
                int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
                if (iZzTP == 2) {
                    Equals = TelemetryEventStrings.Value.TRUE.equals(zzyq9ZzYuT.getValue());
                } else if (iZzTP == 3) {
                    Equals = 1;
                } else if (iZzTP != 4) {
                    zzyq7.zzYi("list", zzyq9ZzYuT.getLocalName());
                } else {
                    zzyq7.zzZ(256, false, "text:list");
                }
            }
        }
        return Equals == true ? 1 : 0;
    }

    private static void zzZ(zzYQ7 zzyq7, zzYR7 zzyr7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 4) {
                if (iZzTP != 5) {
                    if (iZzTP != 6) {
                        zzyq7.zzYi("list-item", zzyq9ZzYuT.getLocalName());
                    }
                } else if (zzyr7 != null) {
                    zzyr7.setList(zzyq7.getDocument().getLists().addCopy(zzyr7.getList()));
                    int iZzb = zzyq9ZzYuT.zzb();
                    ListLevel listLevel = zzyr7.getList().getListLevels().get(zzyq7.zzZ0C());
                    if (ListLevel.zzx9(iZzb)) {
                        listLevel.setStartAt(iZzb);
                    } else if (!zzyr7.getList().zzxy(listLevel.zzYOa())) {
                        zzZ4B zzz4b = new zzZ4B(zzyq7.getDocument(), listLevel.zzYOa());
                        zzz4b.zzYbY = iZzb;
                        zzz4b.zzYbX = true;
                        zzyr7.getList().zzYPb().zzZ(zzz4b);
                    }
                }
            }
            zzyq7.zzZ(256, false, "text:list-item");
        }
    }

    private static void zzZ(zzYQ7 zzyq7, CompositeNode compositeNode, String str, zzYR7 zzyr7) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        boolean z = true;
        while (zzyq9ZzYuT.zzQ(str)) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 7:
                case 8:
                    zzYQC.zzZ(zzyq7, zzyq9ZzYuT.getLocalName(), str, compositeNode, zzyr7, z);
                    z = false;
                    break;
                case 9:
                    zzZ(zzyq7, compositeNode, zzyr7);
                    break;
                case 10:
                case 11:
                    zzyq7.zzZ(1, true, str);
                    break;
                default:
                    zzyq9ZzYuT.zzk();
                    break;
            }
        }
    }
}
