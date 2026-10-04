package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZWF {
    private static void zzQ(zzZXR zzzxr) throws Exception {
        StyleCollection styles = zzzxr.getDocument().getStyles();
        for (int i = 0; i < styles.getCount(); i++) {
            zzZ(zzzxr, styles.get(i));
        }
    }

    private static void zzR(zzZXR zzzxr) {
        zzZ73 zzz73ZzYi5 = zzzxr.getDocument().getStyles().zzYi5();
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("w:latentStyles");
        zzzydZzZlV.zzx("w:defLockedState", zzz73ZzYi5.zzYUf());
        zzzydZzZlV.zzZj("w:defUIPriority", zzz73ZzYi5.zzYUc());
        zzzydZzZlV.zzx("w:defSemiHidden", zzz73ZzYi5.zzYUd());
        zzzydZzZlV.zzx("w:defUnhideWhenUsed", zzz73ZzYi5.zzYUb());
        zzzydZzZlV.zzx("w:defQFormat", zzz73ZzYi5.zzYUe());
        zzzydZzZlV.zzZj("w:count", zzz73ZzYi5.zzYUa());
        if (zzz73ZzYi5.getCount() <= 0) {
            zzz73ZzYi5.zzYU3();
        }
        for (int i = 0; i < zzz73ZzYi5.getCount(); i++) {
            zzZ74 zzz74Zzy3 = zzz73ZzYi5.zzy3(i);
            String strZzh = zzY8T.zzh(zzz74Zzy3.getStyleIdentifier(), "");
            if (com.aspose.words.internal.zzZYD.zzXk(strZzh) && (zzzxr.zzZlS().zzYqX() || (zzz74Zzy3.getStyleIdentifier() != 372 && zzz74Zzy3.getStyleIdentifier() != 373 && zzz74Zzy3.getStyleIdentifier() != 374 && zzz74Zzy3.getStyleIdentifier() != 375))) {
                zzzydZzZlV.zzY("w:lsdException");
                zzzydZzZlV.zzX("w:name", strZzh);
                if (zzz74Zzy3.getLocked() != zzz73ZzYi5.zzYUf()) {
                    zzzydZzZlV.zzx("w:locked", zzz74Zzy3.getLocked());
                }
                if (zzz74Zzy3.getSemiHidden() != zzz73ZzYi5.zzYUd()) {
                    zzzydZzZlV.zzx("w:semiHidden", zzz74Zzy3.getSemiHidden());
                }
                if (zzz74Zzy3.zzYUi() != zzz73ZzYi5.zzYUc()) {
                    zzzydZzZlV.zzZj("w:uiPriority", zzz74Zzy3.zzYUi());
                }
                if (zzz74Zzy3.getUnhideWhenUsed() != zzz73ZzYi5.zzYUb()) {
                    zzzydZzZlV.zzx("w:unhideWhenUsed", zzz74Zzy3.getUnhideWhenUsed());
                }
                if (zzz74Zzy3.zzYUl() != zzz73ZzYi5.zzYUe()) {
                    zzzydZzZlV.zzx("w:qFormat", zzz74Zzy3.zzYUl());
                }
                zzzydZzZlV.zzp();
            }
        }
        zzzydZzZlV.zzp();
    }

    private static void zzS(zzZXR zzzxr) throws Exception {
        StyleCollection styles = zzzxr.getDocument().getStyles();
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("w:docDefaults");
        zzzydZzZlV.zzY("w:rPrDefault");
        zzYEF zzyefZzY37 = styles.zzY37();
        zzY(zzyefZzY37, 390);
        zzY(zzyefZzY37, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2);
        zzYUO.zzZ(zzyefZzY37, zzyefZzY37, zzzxr);
        zzzydZzZlV.zzp();
        zzzydZzZlV.zzY("w:pPrDefault");
        zzYUU.zzZ(styles.zzY36(), zzzxr);
        zzzydZzZlV.zzp();
        zzzydZzZlV.zzp();
    }

    public static void zzU(zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzJ = zzzxr.zzJ("styles.xml", "application/vnd.openxmlformats-officedocument.wordprocessingml.styles+xml", zzzxr.zzZmp().zzZkS());
        zzzxr.zzY(zzzydZzJ);
        zzzydZzJ.zzZmU();
        zzS(zzzxr);
        if (zzzxr.zzZlS().zzYqV()) {
            zzR(zzzxr);
        }
        zzQ(zzzxr);
        zzzydZzJ.endDocument();
        zzzxr.zzZlX();
    }

    private static void zzY(zzYEF zzyef, int i) {
        if (zzyef.zzVE(i) && ((Integer) zzyef.get(i)).intValue() == 127) {
            zzyef.remove(i);
        }
    }

    private static void zzZ(zzZXR zzzxr, Style style) throws Exception {
        if (zzY0C.zzZ(style, zzzxr.getDocument().getWarningCallback(), 9)) {
            zzZYD zzzydZzZlV = zzzxr.zzZlV();
            zzzydZzZlV.zzY("w:style");
            zzzydZzZlV.zzX("w:type", zzZXP.zzF7(style.getType()));
            int styleIdentifier = style.getStyleIdentifier();
            if (styleIdentifier == 0 || styleIdentifier == 65 || styleIdentifier == 105 || styleIdentifier == 107) {
                zzzydZzZlV.zzX("w:default", "1");
            } else if (styleIdentifier == 4094) {
                zzzydZzZlV.zzX("w:customStyle", "1");
            }
            zzzydZzZlV.zzX("w:styleId", zzzxr.zzFs(style.zzZ7j()));
            zzzydZzZlV.zzYz("w:name", zzY8T.zzh(style.getStyleIdentifier(), style.getName()));
            zzzydZzZlV.zzYz("w:aliases", style.getStyles().zzW(style, false));
            if (zzY0C.zzhF(style.zzY3v())) {
                zzzydZzZlV.zzYz("w:basedOn", zzzxr.zzFs(style.zzY3v()));
            }
            if (style.zzY3u() != style.zzZ7j() && zzY0C.zzhF(style.zzY3u())) {
                zzzydZzZlV.zzYz("w:next", zzzxr.zzFs(style.zzY3u()));
            }
            if (zzY0C.zzhF(style.zzY3t())) {
                zzzydZzZlV.zzYz("w:link", zzzxr.zzFs(style.zzY3t()));
            }
            zzzydZzZlV.zze("w:autoRedefine", style.getAutomaticallyUpdate());
            zzzydZzZlV.zze("w:hidden", style.getHidden());
            zzzydZzZlV.zzZk("w:uiPriority", style.getPriority());
            zzzydZzZlV.zze("w:semiHidden", style.getSemiHidden());
            zzzydZzZlV.zze("w:unhideWhenUsed", style.getUnhideWhenUsed());
            zzzydZzZlV.zze("w:qFormat", style.isQuickStyle());
            zzzydZzZlV.zze("w:locked", style.getLocked());
            zzzydZzZlV.zze("w:personal", style.zzY3p());
            zzzydZzZlV.zze("w:personalCompose", style.zzY3r());
            zzzydZzZlV.zze("w:personalReply", style.zzY3q());
            if (style.zzY3s() != 0) {
                zzzydZzZlV.zzYz("w:rsid", zzYU3.zzsV(style.zzY3s()));
            }
            if (style.zzZYj().getTabStops() != null && style.zzZYj().getTabStops().getCount() <= 0) {
                style.zzZYj().remove(EditingLanguage.GUARANI);
            }
            if (style.getType() != 2) {
                zzYUU.zzZ(style.zzZYj(), zzzxr);
            }
            zzYUO.zzZ(style.zzZYh(), style, zzzxr);
            if (style.getType() == 3) {
                TableStyle tableStyle = (TableStyle) style;
                zzYUR.zzZ(tableStyle.zzZYf(), true, true, zzzxr);
                zzYUR.zzZ(tableStyle.zzZYd(), false, true, zzzxr);
                zzYVE.zzZ(tableStyle.zz6G(), zzzxr);
                Iterator<ConditionalStyle> it = tableStyle.getConditionalStyles().zzZY9().iterator();
                while (it.hasNext()) {
                    zzZ(it.next(), zzzxr);
                }
            }
            zzzydZzZlV.zzp();
        }
    }

    private static void zzZ(ConditionalStyle conditionalStyle, zzZXR zzzxr) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("w:tblStylePr");
        zzzydZzZlV.zz0("w:type", zzY8T.zzkT(conditionalStyle.zzZYk()));
        if (conditionalStyle.zzZYi()) {
            zzYUU.zzZ(conditionalStyle.zzZYj(), zzzxr);
        }
        if (conditionalStyle.zzZYg()) {
            zzYUO.zzZ(conditionalStyle.zzZYh(), conditionalStyle.zzZYh(), zzzxr);
        }
        if (conditionalStyle.zzZYe() || conditionalStyle.zzZYb()) {
            zzYUR.zzZ(conditionalStyle.zzZYf(), true, true, zzzxr);
        }
        if (conditionalStyle.zzZYc()) {
            zzYUR.zzZ(conditionalStyle.zzZYd(), false, true, zzzxr);
        }
        if (conditionalStyle.zzZYb()) {
            zzYVE.zzZ(conditionalStyle.zz6G(), zzzxr);
        }
        zzzydZzZlV.zzp();
    }
}
