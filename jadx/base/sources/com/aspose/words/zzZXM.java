package com.aspose.words;

import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXM {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("name", "enabled", "calcOnExit", "entryMacro", "exitMacro", "helpText", "statusText", "textInput", "checkBox", "ddList", C18437z2.f56754h, "val", "maxLength", "default", "format", "size", "sizeAuto", "checked", "result", "listEntry");

    public static void zzJ(zzYU4 zzyu4, zzYO3 zzyo3) {
        zzZMM zzzmm = new zzZMM();
        while (zzyu4.zzQ("ffData")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 0:
                    zzzmm.setName(zzyu4.zzV("val", null));
                    break;
                case 1:
                    zzzmm.setEnabled(zzyu4.zzYyD());
                    break;
                case 2:
                    zzzmm.zzVE(zzyu4.zzYyD());
                    break;
                case 3:
                    zzzmm.setEntryMacro(zzyu4.zzV("val", null));
                    break;
                case 4:
                    zzzmm.setExitMacro(zzyu4.zzV("val", null));
                    break;
                case 5:
                    zzzmm.zzVD(true);
                    while (zzyu4.zzi()) {
                        int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
                        if (iZzTP == 10) {
                            zzzmm.zzVD("text".equals(zzyu4.getValue()));
                        } else if (iZzTP != 11) {
                            zzyu4.getLocalName();
                        } else {
                            zzzmm.setHelpText(zzyu4.getValue());
                        }
                    }
                    break;
                case 6:
                    zzzmm.zzVC(true);
                    while (zzyu4.zzi()) {
                        int iZzTP2 = zzUR.zzTP(zzyu4.getLocalName());
                        if (iZzTP2 == 10) {
                            zzzmm.zzVC("text".equals(zzyu4.getValue()));
                        } else if (iZzTP2 != 11) {
                            zzyu4.getLocalName();
                        } else {
                            zzzmm.setStatusText(zzyu4.getValue());
                        }
                    }
                    break;
                case 7:
                    zzZ(zzyu4, zzzmm);
                    break;
                case 8:
                    zzZ(zzyu4, zzzmm, zzyo3);
                    break;
                case 9:
                    zzY(zzyu4, zzzmm);
                    break;
                default:
                    zzyu4.zzk();
                    break;
            }
        }
        zzyu4.zzW(zzzmm);
    }

    private static void zzY(zzYU4 zzyu4, zzZMM zzzmm) {
        while (zzyu4.zzQ("ddList")) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 13) {
                zzzmm.zzAW(zzyu4.zzYyE());
            } else if (iZzTP == 18) {
                zzzmm.zzAV(zzyu4.zzYyE());
            } else if (iZzTP != 19) {
                zzyu4.zzk();
            } else {
                zzzmm.getDropDownItems().add(zzyu4.zzV("val", null));
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzZMM zzzmm) {
        while (zzyu4.zzQ("textInput")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 10:
                    zzzmm.setTextInputType(zzZXP.zzNn(zzyu4.zzV("val", null)));
                    break;
                case 11:
                default:
                    zzyu4.zzk();
                    break;
                case 12:
                    zzzmm.zzAY(zzyu4.zzYyE());
                    break;
                case 13:
                    zzzmm.setTextInputDefault(zzyu4.zzV("val", null));
                    break;
                case 14:
                    zzzmm.setTextInputFormat(zzyu4.zzV("val", null));
                    break;
            }
        }
    }

    private static void zzZ(zzYU4 zzyu4, zzZMM zzzmm, zzYO3 zzyo3) {
        while (zzyu4.zzQ("checkBox")) {
            switch (zzUR.zzTP(zzyu4.getLocalName())) {
                case 13:
                    zzzmm.zzVA(zzyu4.zzYyD());
                    break;
                case 14:
                default:
                    zzyu4.zzk();
                    break;
                case 15:
                    zzzmm.zzVB(false);
                    zzzmm.zzAX(zzyu4.zzW(zzyo3));
                    break;
                case 16:
                    zzzmm.zzVB(zzyu4.zzYyD());
                    break;
                case 17:
                    zzzmm.zzVz(zzyu4.zzYyD());
                    break;
            }
        }
    }
}
