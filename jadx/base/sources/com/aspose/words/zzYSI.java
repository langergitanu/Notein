package com.aspose.words;

import com.google.firebase.messaging.Constants;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;

/* JADX INFO: loaded from: classes6.dex */
final class zzYSI {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("font-face-decls", "automatic-styles", "body", "scripts", "text", "chart", "database", "drawing", "image", "presentation", "spreadsheet", "allow-deletes", "allow-inserts", "allow-updates", "apply-filter", "command", "command-type", "control-implementation", "datasource", "detail-fields", "enctype", "escape-processing", "filter", "ignore-result", "master-fields", "method", "name", "navigation-mode", "order", "tab-cycle", "target-frame", "actuate", "href", C18437z2.f56754h, "checkbox", "button", "combobox", "connection-resource", "date", "file", "fixed-text", "form", "formatted-text", "frame", "generic-control", "grid", "hidden", "image-frame", "listbox", "number", "password", "properties", "radio", "textarea", "time", "value-range", "event-listeners", "id", "current-state", Constants.ScionAnalytics.PARAM_LABEL, "data-field", "disabled", "image-align", "image-position", "is-tristate", "linked-cell", "printable", "state", "tab-index", "tab-stop", NoteMeta.PROPERTY_TITLE, "value", "visual-effect", "bind");

    private static void zzA(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("checkbox")) {
            if ("properties".equals(zzyq9ZzYuT.getLocalName()) || "event-listeners".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(1, true, "form:checkbox");
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static zzYSM zzB(zzYQ7 zzyq7) {
        zzYSM zzysm = new zzYSM();
        zzZ(zzyq7, zzysm);
        zzA(zzyq7);
        return zzysm;
    }

    private static void zzC(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            switch (zzUR.zzTP(zzyq9ZzYuT.getLocalName())) {
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
                    zzyq7.zzZ(256, false, "office:form");
                    break;
                default:
                    zzyq7.zzYi("form", zzyq9ZzYuT.getLocalName());
                    break;
            }
        }
    }

    private static void zzD(zzYQ7 zzyq7) {
        zzYRW zzyrw = new zzYRW();
        zzC(zzyq7);
        zzZ(zzyq7, zzyrw);
        zzyq7.zzYuQ().zzZ(zzyrw);
    }

    private static void zzE(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if ("apply-design-mode".equals(zzyq9ZzYuT.getLocalName()) || "automatic-focus".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(256, false, "office:forms");
            }
        }
        while (zzyq9ZzYuT.zzQ("forms")) {
            if ("form".equals(zzyq9ZzYuT.getLocalName())) {
                zzD(zzyq7);
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static void zzF(zzYQ7 zzyq7) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if (AiFeatureConfig.DEFAULT_AI_ASSISTANT_MODEL_LOCATION.equals(zzyq9ZzYuT.getLocalName()) || "use-soft-page-breaks".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(65536, false, "office:text");
            }
        }
    }

    private static void zzG(zzYQ7 zzyq7) {
        if (zzyq7.zzYuH().size() <= 0) {
            return;
        }
        Section lastSection = zzyq7.getDocument().getLastSection();
        if (lastSection == null) {
            lastSection = zzYPZ.zzY(zzyq7.zzYuR().zzEq("Standard"));
            zzyq7.getDocument().getSections().add(lastSection);
        }
        for (Paragraph paragraph : zzyq7.zzYuH()) {
            if (paragraph.getParentNode() == null) {
                lastSection.getBody().appendChild(paragraph);
            }
        }
        zzyq7.zzYuH().clear();
    }

    private static void zzH(zzYQ7 zzyq7) {
        for (Section section : zzyq7.getDocument().getSections()) {
            if (zzyq7.zzYuD() && section.zzYvR().zzPk(2390) == null) {
                section.zzYvR().zzRE(true);
            }
        }
        zzZYR zzzyr = zzyq7.getDocument().zzZpV().zzYW6;
        if (zzyq7.zzYuD()) {
            zzzyr.zzWv(true);
            zzzyr.zzFG(2);
        }
    }

    private static void zzI(zzYQ7 zzyq7) {
        for (Section section : zzyq7.getDocument().getSections()) {
            if (!section.zzYB3() && !section.getBody().zz6T()) {
                section.getBody().getParagraphs().add(new Paragraph(zzyq7.getDocument()));
            }
        }
    }

    public static void zzJ(zzYQ7 zzyq7) throws Exception {
        zzyq7.zzSe(true);
        zzYQO zzyqoZzEn = zzyq7.zzYuU().zzEn("/content.xml");
        if (zzyqoZzEn == null) {
            return;
        }
        zzYQ9 zzyq9 = new zzYQ9(zzyqoZzEn.zzYvo());
        zzyq7.zzT(zzyq9);
        zzZ3Z zzz3z = new zzZ3Z(zzyq7.getDocument(), zzyq7.zzYyZ());
        zzYQ7.zzQ(zzyq7, "document-content");
        while (zzyq9.zzQ("document-content")) {
            int iZzTP = zzUR.zzTP(zzyq9.getLocalName());
            if (iZzTP == 0) {
                zzYRZ.zzZ(zzyq7, zzz3z);
            } else if (iZzTP == 1) {
                zzYTM.zzZ(zzyq7, zzz3z);
            } else if (iZzTP == 2) {
                zzY(zzyq7, zzz3z);
            } else if (iZzTP != 3) {
                zzyq9.zzk();
            } else {
                zzyq7.zzZ(1, true, "office:document-content");
            }
        }
        zzI(zzyq7);
        zzH(zzyq7);
        zzz3z.zzW(zzyqoZzEn.zzYvo(), true);
    }

    private static void zzX(zzYQ7 zzyq7, zzZ3Z zzz3z) throws Exception {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        zzF(zzyq7);
        CompositeNode compositeNodeZzZ = null;
        while (zzyq9ZzYuT.zzQ("text")) {
            zzz3z.zzYX(zzyq7.zzYuT().zz5());
            zzyq7.zzE5(zzYOU.zzDr(zzyq7.zzYuT().zzV("style-name", "Standard")));
            zzYR0 zzyr0ZzZW = zzYP5.zzZW(zzyq7);
            if (!zzYOU.zzDJ(zzyq9ZzYuT.getLocalName())) {
                compositeNodeZzZ = zzYP5.zzZ(zzyq7, zzyr0ZzZW, compositeNodeZzZ);
            }
            if (!zzYP5.zzZ(zzyq7, compositeNodeZzZ, zzyr0ZzZW, "office:text")) {
                if ("forms".equals(zzyq9ZzYuT.getLocalName())) {
                    zzE(zzyq7);
                } else {
                    zzyq9ZzYuT.zzk();
                }
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, zzZ3Z zzz3z) throws Exception {
        zzyq7.zzA(false, true);
        while (zzyq7.zzYuT().zzQ("body")) {
            switch (zzUR.zzTP(zzyq7.zzYuT().getLocalName())) {
                case 4:
                    zzX(zzyq7, zzz3z);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    zzyq7.zzZ(1, true, "office:body");
                    break;
                default:
                    zzyq7.zzYuT().zzk();
                    break;
            }
        }
        zzG(zzyq7);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYRW zzyrw) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("form")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 4 && iZzTP != 8) {
                switch (iZzTP) {
                    case 34:
                        zzyrw.zzYwh().zzZ(zzB(zzyq7));
                        continue;
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                        break;
                    default:
                        zzyq9ZzYuT.zzk();
                        continue;
                }
            }
            zzyq7.zzZ(1, true, "office:form");
        }
        zzyq7.zzYuQ().zzZ(zzyrw);
    }

    private static void zzZ(zzYQ7 zzyq7, zzYSM zzysm) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP != 17 && iZzTP != 26) {
                switch (iZzTP) {
                    case 57:
                        if ("form".equals(zzyq9ZzYuT.getPrefix())) {
                            zzysm.setId(zzyq9ZzYuT.getValue());
                        } else {
                            zzyq7.zzZ(1, false, "form:checkbox");
                            continue;
                        }
                        break;
                    case 58:
                        zzysm.zzFZ(zzyq9ZzYuT.getValue());
                        continue;
                    case 59:
                        zzysm.zzFY(zzyq9ZzYuT.getValue());
                        continue;
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                        break;
                    default:
                        zzyq7.zzYi("checkbox", zzyq9ZzYuT.getLocalName());
                        continue;
                }
            }
            zzyq7.zzZ(256, false, "form:checkbox");
        }
    }
}
