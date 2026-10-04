package com.aspose.words;

import com.aspose.words.ref.RefBoolean;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPW {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("config-item", "config-item-map-indexed", "config-item-map-named", "config-item-set", "UseFormerTextWrapping", "AddParaSpacingToTableCells", "ShowRedlineChanges", "AddParaTableSpacing", "AddExternalLeading", "ZoomType", "ZoomFactor", "UseFormerLineSpacing");

    public static void zzJ(zzYQ7 zzyq7) throws Exception {
        boolean z = true;
        zzyq7.getDocument().zzZpV().zzYVg.setDoNotUseHTMLParagraphAutoSpacing(true);
        zzYQO zzyqoZzEn = zzyq7.zzYuU().zzEn("/settings.xml");
        if (zzyqoZzEn == null) {
            return;
        }
        zzYQ9 zzyq9 = new zzYQ9(zzyqoZzEn.zzYvo());
        zzyq7.zzT(zzyq9);
        zzYQ7.zzQ(zzyq7, "document-settings");
        while (zzyq9.zzQ("document-settings")) {
            if ("settings".equals(zzyq9.getLocalName())) {
                RefBoolean refBoolean = new RefBoolean(z);
                zzZ(zzyq7, refBoolean);
                z = refBoolean.get();
            } else {
                zzyq9.zzk();
            }
        }
        if (z) {
            Document document = zzyq7.getDocument();
            CompatibilityOptions compatibilityOptions = zzyq7.getDocument().zzZpV().zzYVg;
            if (document.zzZqn() == null) {
                document.zzZ(new zzYO3());
            }
            document.zzZqn().zzYr4();
            document.zzZqn().zzYrc();
            compatibilityOptions.zzZYT().zzZ(new zzKR("compatibilityMode", "http://schemas.microsoft.com/office/word", "15"));
        }
    }

    private static void zzU(zzYQ7 zzyq7, RefBoolean refBoolean) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        CompatibilityOptions compatibilityOptions = zzyq7.getDocument().zzZpV().zzYVg;
        String strZzV = zzyq9ZzYuT.zzV("name", null);
        if (strZzV == null) {
        }
        switch (zzUR.zzTP(strZzV)) {
            case 4:
                refBoolean.set(zzyq9ZzYuT.zzg());
                break;
            case 5:
                zzyq7.zzS7(zzyq9ZzYuT.zzg());
                break;
            case 6:
                zzyq7.getDocument().zzZpV().zzWD(zzyq9ZzYuT.zzg());
                break;
            case 7:
                compatibilityOptions.setDoNotUseHTMLParagraphAutoSpacing(zzyq9ZzYuT.zzg());
                break;
            case 8:
                compatibilityOptions.setNoLeading(!zzyq9ZzYuT.zzg());
                break;
            case 9:
                zzyq7.getDocument().getViewOptions().setZoomType(zzyq9ZzYuT.zzh());
                break;
            case 10:
                zzyq7.getDocument().getViewOptions().setZoomPercent(zzyq9ZzYuT.zzh());
                break;
            case 11:
                compatibilityOptions.setApplyBreakingRules(zzyq9ZzYuT.zzg());
                break;
            default:
                zzyq7.zzT(65536, androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzYQ7.zzE7(com.aspose.words.internal.zzZKN.format("'config:config-item' element whose 'config:name' attribute is '{0}'", strZzV)), ". Import of 'config:config-item' elements is supported for elements whose 'config:name' attribute is one of following values only: 'AddParaSpacingToTableCells', 'ShowRedlineChanges', 'AddParaTableSpacing', 'AddExternalLeading', 'ZoomType', 'ZoomFactor', 'UseFormerLineSpacing'"));
                break;
        }
    }

    private static void zzV(zzYQ7 zzyq7, RefBoolean refBoolean) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("config-item-map-indexed")) {
            if ("config-item-map-entry".equals(zzyq9ZzYuT.getLocalName())) {
                zzX(zzyq7, refBoolean);
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }

    private static void zzW(zzYQ7 zzyq7, RefBoolean refBoolean) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        if ("Views".equals(zzyq9ZzYuT.zzV("name", ""))) {
            zzV(zzyq7, refBoolean);
        } else {
            zzyq7.zzT(65536, androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzYQ7.zzE7(com.aspose.words.internal.zzZKN.format("'config:config-item-map-indexed' element whose 'config:name' attribute is '{0}'", zzyq9ZzYuT.getValue())), ". Import of 'config:config-item-map-indexed' elements is supported for elements whose 'config:name' attribute is 'Views' only"));
        }
    }

    private static void zzX(zzYQ7 zzyq7, RefBoolean refBoolean) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if ("name".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(65536, false, "config:config-item-map-entry");
            }
        }
        while (zzyq9ZzYuT.zzQ("config-item-map-entry")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 0) {
                zzU(zzyq7, refBoolean);
            } else if (iZzTP == 1 || iZzTP == 2) {
                zzyq7.zzZ(65536, true, "config:config-item-map-entry");
            } else {
                zzyq7.zzYuT().zzk();
            }
        }
    }

    private static void zzY(zzYQ7 zzyq7, RefBoolean refBoolean) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzi()) {
            if ("name".equals(zzyq9ZzYuT.getLocalName())) {
                zzyq7.zzZ(65536, false, "config:config-item-set");
            }
        }
        while (zzyq9ZzYuT.zzQ("config-item-set")) {
            int iZzTP = zzUR.zzTP(zzyq9ZzYuT.getLocalName());
            if (iZzTP == 0) {
                zzU(zzyq7, refBoolean);
            } else if (iZzTP == 1) {
                zzW(zzyq7, refBoolean);
            } else if (iZzTP == 2) {
                zzyq7.zzZ(65536, true, "config:config-item-set");
            } else if (iZzTP != 3) {
                zzyq7.zzYuT().zzk();
            } else {
                zzY(zzyq7, refBoolean);
            }
        }
    }

    private static void zzZ(zzYQ7 zzyq7, RefBoolean refBoolean) {
        zzYQ9 zzyq9ZzYuT = zzyq7.zzYuT();
        while (zzyq9ZzYuT.zzQ("settings")) {
            if ("config-item-set".equals(zzyq9ZzYuT.getLocalName())) {
                zzY(zzyq7, refBoolean);
            } else {
                zzyq9ZzYuT.zzk();
            }
        }
    }
}
