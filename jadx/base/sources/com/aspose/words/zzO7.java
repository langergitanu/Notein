package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzO7 {
    private static String[] zzZpN = {"display", "border-top-style", "border-right-style", "border-bottom-style", "border-left-style", "border-top-width", "border-right-width", "border-bottom-width", "border-left-width", "border-top-color", "border-right-color", "border-bottom-color", "border-left-color", "background-color"};

    public static zzLU zzZ(HtmlSaveOptions htmlSaveOptions, Paragraph paragraph, String str, boolean z) {
        zzZGI zzzgiZzZW = zzZGI.zzZW(paragraph);
        zzzgiZzZW.isListItem();
        zzLU zzlu = new zzLU();
        zzlu.zzU(0.0d, 0.0d, 0.0d, 0.0d);
        zzN5 zzn5 = new zzN5();
        zzn5.setLeft(0.0d);
        zzn5.zzj(zzL5.zzQ(paragraph), paragraph.getParagraphFormat().getBidi()).zzZ(zzlu);
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            zzlu.zzZq("list-style-image", str);
            return zzlu;
        }
        if ((htmlSaveOptions.zzYZc() || htmlSaveOptions.zzYZ4()) && z) {
            zzlu.zzZs("list-style-type", zzZGP.zzY(zzzgiZzZW.getListLevel()).zzZ1l());
        }
        return zzlu;
    }

    public static boolean zzZ(ListLevel listLevel) {
        return listLevel.getNumberStyle() == 255 || listLevel.getNumberStyle() == 23;
    }

    public static void zzZ(zzLU zzlu, Paragraph paragraph, zzZHR zzzhr, zzZN8 zzzn8, zzZGL zzzgl, boolean z, boolean z2, boolean z3) throws Exception {
        boolean z4;
        String str;
        if (z) {
            z4 = z3;
        } else {
            zzZGI zzzgiZzZW = zzZGI.zzZW(paragraph);
            zzLU zzlu2 = new zzLU();
            z4 = z3;
            zzP3.zzZ(zzlu2, zzzgiZzZW.zzZ0S(), 3, 0, zzzhr, zzzn8, z4);
            for (String str2 : zzZpN) {
                zzlu2.remove(str2);
            }
            zzlu.zzW(zzlu2);
            zzlu.remove("display");
            ListLevel listLevel = zzzgiZzZW.getListLevel();
            if (zzZ(listLevel) && !z2) {
                zzlu.zzJ("serif");
                if (z4) {
                    zzlu.zzZr("-aw-font-family", paragraph.getListLabel().getFont().getName());
                    if (paragraph.getListLabel().getFont().getBold()) {
                        str = "bold";
                    } else {
                        str = "normal";
                    }
                    zzlu.zzZs("-aw-font-weight", str);
                    zzlu.zzZr("-aw-number-format", listLevel.getNumberFormat());
                }
            }
        }
        if (!z4 || zzzgl.zzZ1a() <= 0.0d) {
            return;
        }
        zzlu.zzZ("-aw-list-padding-sml", zzzgl.zzZ1a(), 4);
    }
}
