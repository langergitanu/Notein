package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.miui.penengine.p596e.C18773h;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOX {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("deletion", "insertion", "format-change", "change-info", ContextChain.TAG_PRODUCT, C18773h.f57233c, "list", "table", "numbered-paragraph", "soft-page-break", "regular-polygon", "page-thumbnail", "measure", "scene", "change", "change-end", "change-start", "section", "a", "caption", "circle", "connector", "control", "custom-shape", "ellipse", "frame", "g", "line", "path", "polygon", "polyline", DrawToolFactory.LASSO_TYPE_RECT, "alphabetical-index", "table-of-content", "illustration-index", "table-index", "object-index", "user-index", "bibliography", "creator", "date");

    public static void zzJ(zzYQ7 zzyq7) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzyq7.getDocument().zzZpV().zzYWc = TelemetryEventStrings.Value.TRUE.equals(zzyq9ZzYuT.zzV("track-changes", TelemetryEventStrings.Value.TRUE));
        while (zzyq9ZzYuT.zzQ("tracked-changes")) {
            if ("changed-region".equals(zzyq9ZzYuT.getLocalName())) {
                zzZQ(zzyq7);
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static zzYRD zzS(zzYQ9 zzyq9) {
        zzYRD zzyrd = new zzYRD();
        while (zzyq9.zzQ("insertion")) {
            if ("change-info".equals(zzyq9.getLocalName())) {
                zzZ(zzyq9, zzyrd);
            } else {
                zzyq9.zzk();
            }
        }
        return zzyrd;
    }

    private static void zzY(zzYQ7 zzyq7, zzYS9 zzys9) throws Exception {
        Body body = new Body(zzyq7.getDocument());
        zzYR8.zzZ(zzyq7, body, null);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Body>) zzys9.zzYwI(), body);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYS9 zzys9) throws Exception {
        Body body = new Body(zzyq7.getDocument());
        zzYPC.zzV(zzyq7, body);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Body>) zzys9.zzYwI(), body);
    }

    private static zzYS9 zzZP(zzYQ7 zzyq7) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYS9 zzys9 = new zzYS9();
        while (zzyq9ZzYuT.zzQ("deletion")) {
            String localName = zzyq9ZzYuT.getLocalName();
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
                case 3:
                    zzZ(zzyq9ZzYuT, zzys9);
                    continue;
                case 4:
                case 5:
                    zzZ(zzyq7, localName, zzys9);
                    continue;
                case 6:
                    zzY(zzyq7, zzys9);
                    continue;
                case 7:
                    zzZ(zzyq7, zzys9);
                    continue;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                    zzyq7.zzZ(1, true, "text:deletion");
                    break;
            }
            zzyq9ZzYuT.zzk();
        }
        return zzys9;
    }

    private static void zzZQ(zzYQ7 zzyq7) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzYT8 zzyt8 = new zzYT8();
        while (zzyq9ZzYuT.zzi()) {
            if ("id".equals(zzyq9ZzYuT.getLocalName())) {
                if ("text".equals(zzyq9ZzYuT.getPrefix())) {
                    zzyt8.zzGw(zzyq9ZzYuT.getValue());
                }
                if ("xml".equals(zzyq9ZzYuT.getPrefix())) {
                    zzyt8.zzGw(zzyq9ZzYuT.getValue());
                }
            }
        }
        while (zzyq9ZzYuT.zzQ("changed-region")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 0) {
                zzyt8.zzZ(zzZP(zzyq7));
            } else if (iZzTP == 1) {
                zzyt8.zzZ(zzS(zzyq9ZzYuT));
            } else if (iZzTP != 2) {
                zzyq9ZzYuT.zzk();
            } else {
                zzyq7.zzZ(1, true, "changed-region");
            }
        }
        com.aspose.words.internal.zzZQF.zzY(zzyq7.zzYuw(), zzyt8.zzYxW(), zzyt8);
    }

    private static void zzZ(zzYQ7 zzyq7, String str, zzYS9 zzys9) throws Exception {
        Paragraph paragraph = new Paragraph(zzyq7.getDocument());
        zzYQC.zzX(zzyq7, paragraph);
        zzYQB zzyqb = (zzYQB) zzyq7.zzYuS().zzY(zzyq7.zzYuP(), "paragraph", zzyq7.zzYuO(), true);
        zzYQC.zzZ(zzyq7, paragraph, str, zzyqb == null ? null : zzyqb.zzZYh(), (CompositeNode) null);
        zzYQC.zzZ(zzyq7, zzyqb, paragraph);
        zzYQC.zzZ7(paragraph);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Paragraph>) zzys9.zzYwI(), paragraph);
    }

    private static void zzZ(zzYQ9 zzyq9, zzYTB zzytb) {
        zzytb.zzZ(new zzYTA());
        while (zzyq9.zzQ("change-info")) {
            int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
            if (iZzTP == 39) {
                zzytb.zzYxX().zza(zzyq9.readString());
            } else if (iZzTP != 40) {
                zzyq9.zzk();
            } else {
                zzytb.zzYxX().zz9(com.aspose.words.internal.zzJB.zzZy(zzyq9.readString()));
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, zzZAM zzzam) {
        zzYT8 zzyt8;
        com.aspose.words.internal.zzD3<zzYT8> zzd3ZzYuv = zzyq7.zzYuv();
        if (zzd3ZzYuv.getCount() > 0 && (zzyt8 = zzd3ZzYuv.get(zzd3ZzYuv.getCount() - 1)) != null) {
            zzYTA zzytaZzYxX = ((zzYRD) zzyt8.zzYxV()).zzYxX();
            zzzam.getRunPr_IInline().zzQ(14, new zzZV8(0, zzytaZzYxX.zzQF(), zzytaZzYxX.zzkT()));
        }
    }
}
