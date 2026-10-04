package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXW {
    private static String zzFy(int i) {
        return com.aspose.words.internal.zzZKN.format("acd{0}", Integer.valueOf(i));
    }

    private static void zzY(zzZXS zzzxs, zzZYD zzzyd) throws Exception {
        Document document = zzzxs.getDocument();
        if (document.zzZqL() || document.zzZqM()) {
            zzzyd.zzY("wne:toolbars");
            if (document.zzZqL()) {
                zzzyd.zzY("wne:acdManifest");
                for (int i = 0; i < document.zzZqD().size(); i++) {
                    zzzyd.zzY("wne:acdEntry");
                    zzzyd.zz0("wne:acdName", zzFy(i));
                    zzzyd.zzp();
                }
                zzzyd.zzp();
            }
            if (document.zzZqM()) {
                Ref<String> ref = new Ref<>(null);
                com.aspose.words.internal.zz77 zz77VarZzZ = zzzxs.zzZmf().zzZ(zzzyd.zzZmN(), "attachedToolbars.bin", "application/vnd.ms-word.attachedToolbars", zzzxs.zzZmp().zzZkt(), ref);
                String str = ref.get();
                zz77VarZzZ.zzR1().write(document.zzZqE(), 0, document.zzZqE().length);
                zzzyd.zzZj("wne:toolbarData", str);
            }
            zzzyd.zzp();
        }
    }

    public static void zzZ(zzZXS zzzxs) throws Exception {
        if (zzzxs.getDocument().zzZqN()) {
            zzZYD zzzydZzJ = zzzxs.zzJ("customizations.xml", "application/vnd.ms-word.keyMapCustomizations+xml", zzzxs.zzZmp().zzZky());
            zzzydZzJ.zzZ("wne:tcg");
            zzzydZzJ.zzX("xmlns:r", zzzxs.zzZlR().zzZlE());
            zzzydZzJ.zzX("xmlns:wne", zzzxs.zzZlR().zzZlC());
            zzZ(zzzxs, zzzydZzJ);
            zzY(zzzxs, zzzydZzJ);
            zzZ(zzzxs, (zzYU6) zzzydZzJ);
            zzzydZzJ.endDocument();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void zzZ(zzZXS zzzxs, zzZYD zzzyd) {
        Document document = zzzxs.getDocument();
        if (document.zzZqK()) {
            zzzyd.zzY("wne:keymaps");
            for (zzZ7B zzz7b : document.zzZqC()) {
                if (zzz7b.zzYhl != 0) {
                    zzzyd.zzY("wne:keymap");
                    if (zzz7b.zzYhl == 1) {
                        zzzyd.zzZj("wne:mask", 1);
                    }
                    zzZ(zzzyd, "wne:chmPrimary", zzz7b.zzYhp);
                    zzZ(zzzyd, "wne:chmSecondary", zzz7b.zzYho);
                    zzZ(zzzyd, "wne:kcmPrimary", zzz7b.zzYhn);
                    zzZ(zzzyd, "wne:kcmSecondary", zzz7b.zzYhm);
                    switch (zzz7b.zzYhl) {
                        case 0:
                        case 1:
                            zzzyd.zzp();
                            break;
                        case 2:
                            zzzyd.zzY("wne:acd");
                            zzzyd.zz0("wne:acdName", zzFy(zzz7b.zzYhk));
                            zzzyd.zzp();
                            zzzyd.zzp();
                            break;
                        case 3:
                            zzzyd.zzY("wne:fci");
                            zzzyd.zz0("wne:fciIndex", com.aspose.words.internal.zzJB.zzWu(zzz7b.zzYhj));
                            zzzyd.zz0("wne:swArg", com.aspose.words.internal.zzJB.zzWu(zzz7b.zzYhi));
                            zzzyd.zzp();
                            zzzyd.zzp();
                            break;
                        case 4:
                            zzzyd.zzY("wne:macro");
                            zzzyd.zz0("wne:macroName", zzz7b.zzYhh);
                            zzzyd.zzp();
                            zzzyd.zzp();
                            break;
                        case 5:
                            zzzyd.zzY("wne:wch");
                            zzzyd.zz0("wne:val", com.aspose.words.internal.zzJB.zzWs(zzz7b.zzYhg));
                            zzzyd.zzp();
                            zzzyd.zzp();
                            break;
                        case 6:
                            zzzyd.zzY("wne:wll");
                            zzzyd.zz0("wne:macroName", zzz7b.zzYhh);
                            zzzyd.zzp();
                            zzzyd.zzp();
                            break;
                        default:
                            throw new IllegalStateException("Unknown keymap type.");
                    }
                }
            }
            zzzyd.zzp();
        }
    }

    private static void zzZ(zzYU6 zzyu6, String str, int i) {
        if (i != 0) {
            zzyu6.zz0(str, com.aspose.words.internal.zzJB.zzWu(i));
        }
    }

    private static void zzZ(zzZXS zzzxs, zzYU6 zzyu6) {
        Document document = zzzxs.getDocument();
        if (document.zzZqL()) {
            zzyu6.zzY("wne:acds");
            for (int i = 0; i < document.zzZqD().size(); i++) {
                zzP zzp = document.zzZqD().get(i);
                if (zzp.zzZGx != 0) {
                    zzyu6.zzY("wne:acd");
                    zzyu6.zzU("wne:argValue", zzp.zzZGw);
                    zzyu6.zz0("wne:acdName", zzFy(i));
                    zzyu6.zz0("wne:fciIndexBasedOn", com.aspose.words.internal.zzJB.zzWu(zzp.zzZGx));
                    zzyu6.zzp();
                }
            }
            zzyu6.zzp();
        }
    }
}
