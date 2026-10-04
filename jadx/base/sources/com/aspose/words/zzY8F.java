package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8F {
    private com.aspose.words.internal.zzIM<Style> zzX8Y = new com.aspose.words.internal.zzIM<>();
    private zzYMX zzX8Z;
    private zzYEF zzX90;
    private zzU8 zzZGE;

    public zzY8F(zzU8 zzu8) {
        this.zzZGE = zzu8;
        StyleCollection styles = zzu8.zzZZ6().getStyles();
        StyleCollection styles2 = this.zzZGE.zzZZ5().getStyles();
        zzYEF zzyef = (zzYEF) styles2.zzY37().zzbn();
        this.zzX90 = zzyef;
        zzyef.zzX(styles.zzY37());
        zzYMX zzymx = (zzYMX) styles2.zzY36().zzbn();
        this.zzX8Z = zzymx;
        zzymx.zzX(styles.zzY36());
    }

    private static String zz5(Style style) {
        return style.getBuiltIn() ? com.aspose.words.internal.zzZKN.format("StyleIdentifier.{0}", Integer.valueOf(style.getStyleIdentifier())) : com.aspose.words.internal.zzZKN.format("'{0}'", style.getName());
    }

    private static int zz6(Style style) {
        return (style.getType() == 2 && style.zzY3v() == 10) ? StyleIdentifier.NIL : style.zzY3v();
    }

    private Style zz7(Style style) {
        Style styleZzZ7 = style.getBuiltIn() ? this.zzZGE.zzZZ6().getStyles().zzZ7(style.getStyleIdentifier(), false) : this.zzZGE.zzZZ6().getStyles().zz0(style.getName(), false);
        if (styleZzZ7 == null || !zzU(styleZzZ7, style)) {
            return null;
        }
        return styleZzZ7;
    }

    private void zz8(Style style) {
        if (style.zzY3v() == 12287 || style.zzY3v() == 10) {
            zzY(this.zzX90, style.zzZYh());
            if (style.getType() != 2) {
                zzY(this.zzX8Z, style.zzZYj());
            }
        }
    }

    private int zz9(Style style) throws Exception {
        if (style.zzZ7j() == 10) {
            return 10;
        }
        Style styleZz7 = zz7(style);
        if (styleZz7 == null) {
            return zza(style);
        }
        styleZz7.setSemiHidden(this.zzZGE.zzZup.getTarget() == 0 && style.getSemiHidden());
        return zzV(styleZz7, style);
    }

    private static boolean zzU(Style style, Style style2) {
        if (style == null && style2 == null) {
            return true;
        }
        if ((style != null && style2 == null) || style == null || style.getType() != style2.getType()) {
            return false;
        }
        int iZz6 = zz6(style);
        int iZz62 = zz6(style2);
        if (iZz6 != 12287 || iZz62 == 12287) {
            return iZz6 == 12287 || iZz62 != 12287;
        }
        return false;
    }

    private int zzV(Style style, Style style2) throws Exception {
        if (style == null || style2 == null) {
            return 0;
        }
        if (this.zzX8Y.contains(style)) {
            return this.zzZGE.zzN8(style2.zzZ7j());
        }
        this.zzX8Y.add(style);
        if (this.zzZGE.zzN4(style2.zzZ7j())) {
            return this.zzZGE.zzN8(style2.zzZ7j());
        }
        if (style2.zzY3v() != 12287 && style2.zzY3v() != 10) {
            zzV(style.zzY3j(), style2.zzY3j());
        }
        if (style.getType() != 3 && style.getStyleIdentifier() != 65) {
            zzU6.zzSU(com.aspose.words.internal.zzZKN.format("Compare {0}.", zz5(style2)));
            zzZMF.zzZ(style, style2, this.zzZGE);
        }
        this.zzZGE.zzYl(style2.zzZ7j(), style.zzZ7j());
        return style.zzZ7j();
    }

    private static void zzY(zzZS zzzs, zzZS zzzs2) {
        for (int i = 0; i < zzzs.getCount(); i++) {
            zzY(zzzs, zzzs2, zzzs.zzT3(i));
        }
    }

    public final void zzY26() throws Exception {
        zzU6.zzSU("{Style sheet}");
        zzU6.zzZZ2();
        Iterator<Style> it = this.zzZGE.zzZZ5().getStyles().iterator();
        while (it.hasNext()) {
            zz9(it.next());
        }
        zzU6.zzZZ1();
    }

    public final int zza(Style style) throws Exception {
        if (this.zzZGE.zzN4(style.zzZ7j())) {
            return this.zzZGE.zzN8(style.zzZ7j());
        }
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("Import {0}.", zz5(style)));
        Style styleZzY3l = style.zzY3l();
        styleZzY3l.zzBl(this.zzZGE.zzZZ6().getStyles().zzY30());
        zz8(styleZzY3l);
        this.zzZGE.zzZZ6().getStyles().zzZ(styleZzY3l, (String[]) null);
        this.zzZGE.zzYl(style.zzZ7j(), styleZzY3l.zzZ7j());
        if (style.zzY3v() != 12287) {
            styleZzY3l.zzl5(zz9(style.zzY3j()));
        }
        if (style.zzY3t() != 12287) {
            styleZzY3l.zzl3(zz9(style.getLinkedStyle()));
        }
        if (style.zzZYj().getListId() != 0) {
            styleZzY3l.zzZYj().zzxC(zzZ4K.zzZ(0, style.zzZYj().getListId(), this.zzZGE));
            if (styleZzY3l.getType() == 4) {
                styleZzY3l.getList().zzYPa().zzxh(styleZzY3l.zzZ7j());
            }
        }
        return styleZzY3l.zzZ7j();
    }

    private static void zzY(zzZS zzzs, zzZS zzzs2, int i) {
        if (zzzs2.contains(i)) {
            return;
        }
        zzzs2.zzQ(i, zzzs.get(i));
    }
}
