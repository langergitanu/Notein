package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYF3 {
    private zzYEM zzXwl;

    private void zzA(Style style) throws Exception {
        this.zzXwl.zzYel().zzW(style.zzl1(0), false);
    }

    private void zzB(Style style) throws Exception {
        this.zzXwl.zzYfW().zzYV(zzY8T.zzh(style.getStyleIdentifier(), style.getName()));
        String strZzW = style.getStyles().zzW(style, false);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzW)) {
            this.zzXwl.zzYfW().zzYV(",");
            this.zzXwl.zzYfW().zzYV(strZzW);
        }
        this.zzXwl.zzYfW().zzYj8();
        this.zzXwl.zzYfW().zzYj4();
    }

    private static String zznU(int i) {
        if (i == 1) {
            return "\\s";
        }
        if (i == 2) {
            return "\\*\\cs";
        }
        if (i == 3) {
            return "\\*\\ts";
        }
        throw new IllegalStateException("Unexpected style type.");
    }

    private void zzy(Style style) throws Exception {
        Style styleZzE = zzYF5.zzE(style);
        this.zzXwl.zzYek().zzY(styleZzE.zzZYj(), false, false);
        this.zzXwl.zzYel().zzW(styleZzE.zzZYh(), false);
        TableStyle tableStyle = (TableStyle) styleZzE;
        this.zzXwl.zzYej().zzY(tableStyle.zz6G(), true);
        this.zzXwl.zzYei().zzZ(tableStyle.zzZYf(), true);
        for (ConditionalStyle conditionalStyle : ((TableStyle) style).getConditionalStyles().zzZY9()) {
            String strZzp3 = zzYHY.zzp3(conditionalStyle.zzZYk());
            if (com.aspose.words.internal.zzZYD.zzXk(strZzp3)) {
                zzB(style);
                this.zzXwl.zzYfW().zzFg();
                this.zzXwl.zzYfW().zzYj5();
                this.zzXwl.zzYfW().zzZ5(zznU(style.getType()), style.zzZ7j());
                this.zzXwl.zzYfW().zzCD("\\tsrowd");
                if (conditionalStyle.zzZYi()) {
                    this.zzXwl.zzYek().zzY(conditionalStyle.zzZYj(), false, false);
                }
                if (conditionalStyle.zzZYg()) {
                    this.zzXwl.zzYel().zzW(conditionalStyle.zzZYh(), false);
                }
                if (conditionalStyle.zzZYe()) {
                    this.zzXwl.zzYei().zzZ(conditionalStyle.zzZYf(), true);
                }
                if (conditionalStyle.zzZYc()) {
                    this.zzXwl.zzYei().zzZ(conditionalStyle.zzZYd(), true);
                }
                if (conditionalStyle.zzZYb()) {
                    this.zzXwl.zzYej().zzY(conditionalStyle.zz6G(), true);
                }
                this.zzXwl.zzYfW().zzCD(strZzp3);
            }
        }
    }

    private void zzz(Style style) throws Exception {
        this.zzXwl.zzYek().zzY(style.zzqw(3), false, false);
        this.zzXwl.zzYel().zzW(style.zzl1(this.zzXwl.zzYec() ? 1 : 0), false);
    }

    public final void zzZ(zzYEM zzyem) throws Exception {
        this.zzXwl = zzyem;
        zzyem.zzYfW().zzFg();
        StyleCollection styles = zzyem.getDocument().getStyles();
        if (styles.zzYi5().zzYU9()) {
            this.zzXwl.zzYfW().zzCD("\\noqfpromote");
        }
        this.zzXwl.zzYfW().zzCC("\\stylesheet");
        for (int i = 0; i < styles.getCount(); i++) {
            Style style = styles.get(i);
            if (zzY0C.zzZ(style, zzyem.getDocument().getWarningCallback(), 12) && style.getType() != 4 && style.zzZ7j() != 12) {
                this.zzXwl.zzYfW().zzFg();
                this.zzXwl.zzYfW().zzYj5();
                this.zzXwl.zzYfW().zzZ5(zznU(style.getType()), style.zzZ7j());
                if (style.getType() == 3) {
                    this.zzXwl.zzYfW().zzCD("\\tsrowd");
                }
                if (style.getType() == 2) {
                    this.zzXwl.zzYfW().zzCD("\\additive");
                }
                if (style.zzY3v() != 12287 && style.zzY3v() != 12) {
                    this.zzXwl.zzYfW().zzZ5("\\sbasedon", style.zzY3v());
                }
                if ((style.getType() == 1 || style.getType() == 3) && style.zzY3u() != 12287) {
                    this.zzXwl.zzYfW().zzZ5("\\snext", style.zzY3u());
                }
                if (style.getAutomaticallyUpdate()) {
                    this.zzXwl.zzYfW().zzCD("\\sautoupd");
                }
                if (style.getHidden()) {
                    this.zzXwl.zzYfW().zzCD("\\shidden");
                }
                if (style.zzY3t() != 12287) {
                    this.zzXwl.zzYfW().zzZ5("\\slink", style.zzY3t());
                }
                if (style.getLocked()) {
                    this.zzXwl.zzYfW().zzCD("\\slocked");
                }
                if (style.zzY3p()) {
                    this.zzXwl.zzYfW().zzCD("\\spersonal");
                }
                if (style.zzY3r()) {
                    this.zzXwl.zzYfW().zzCD("\\scompose");
                }
                if (style.zzY3q()) {
                    this.zzXwl.zzYfW().zzCD("\\sreply");
                }
                if (style.zzY3s() != 0) {
                    this.zzXwl.zzYfW().zzZ5("\\styrsid", style.zzY3s());
                }
                if (style.getSemiHidden()) {
                    this.zzXwl.zzYfW().zzCD("\\ssemihidden");
                }
                if (style.isQuickStyle()) {
                    this.zzXwl.zzYfW().zzCD("\\sqformat");
                }
                if (style.getPriority() != 99) {
                    this.zzXwl.zzYfW().zzZ5("\\spriority", style.getPriority());
                }
                if (style.getUnhideWhenUsed()) {
                    this.zzXwl.zzYfW().zzCD("\\sunhideused");
                }
                int type = style.getType();
                if (type == 1) {
                    zzz(style);
                } else if (type == 2) {
                    zzA(style);
                } else {
                    if (type != 3) {
                        throw new IllegalStateException("Unexpected style type.");
                    }
                    zzy(style);
                }
                zzB(style);
            }
        }
        this.zzXwl.zzYfW().zzYj3();
        this.zzXwl.zzYfW().zzFg();
    }
}
