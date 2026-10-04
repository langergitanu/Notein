package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZK3 {
    private Paragraph zzYtC;
    private boolean zzYtm;
    private ArrayList<zzZ> zzYtn = new ArrayList<>();
    private boolean zzYto;
    private DocumentBuilder zzZwh;

    public static class zzZ {
        private Bookmark zzYDu;
        private com.aspose.words.internal.zzY2 zzYtl;
        private zzYEF zzZsP;

        public zzZ(com.aspose.words.internal.zzY2 zzy2, zzYEF zzyef, Bookmark bookmark) {
            this.zzYtl = zzy2;
            this.zzZsP = zzyef;
            this.zzYDu = bookmark;
        }

        public final Bookmark getBookmark() {
            return this.zzYDu;
        }

        public final boolean zzZ4l() {
            return "\u200e".equals(this.zzYtl.getText()) || "\u200f".equals(this.zzYtl.getText());
        }

        public final com.aspose.words.internal.zzY2 zzZ4m() {
            return this.zzYtl;
        }

        public final zzYEF zzZYh() {
            return this.zzZsP;
        }
    }

    public zzZK3(DocumentBuilder documentBuilder, boolean z) {
        this.zzZwh = documentBuilder;
        this.zzYto = z;
    }

    private static boolean zzL3(String str) {
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            int iZzc = com.aspose.words.internal.zzZVU.zzc(str.charAt(i));
            if (iZzc == 1) {
                z = true;
            } else if (iZzc == 2) {
                z2 = true;
            }
            if (z && z2) {
                return true;
            }
        }
        return false;
    }

    private static String[] zzL4(String str) {
        if (!zzL3(str)) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        int iZzc = com.aspose.words.internal.zzZVU.zzc(str.charAt(0));
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            int iZzc2 = com.aspose.words.internal.zzZVU.zzc(cCharAt);
            if (iZzc != iZzc2 && (iZzc == 1 || iZzc2 == 1)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, sb.toString());
                sb.setLength(0);
                iZzc = iZzc2;
            }
            sb.append(cCharAt);
        }
        if (sb.length() > 0) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, sb.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private static int zzL5(String str) {
        if (str.length() > 0) {
            if (com.aspose.words.internal.zzZVU.zzc(str.charAt(0)) == 1) {
                return EditingLanguage.HEBREW;
            }
            for (int i = 0; i < str.length(); i++) {
                if (com.aspose.words.internal.zzZVU.zzc(str.charAt(i)) == 2) {
                    return 1025;
                }
            }
        }
        return 0;
    }

    public final boolean isEmpty() {
        return this.zzYtn.size() == 0;
    }

    public final void zzY(com.aspose.words.internal.zzY5 zzy5) {
        if (zzy5.getLength() <= 0) {
            return;
        }
        zzZ(zzy5.get(zzy5.getLength() + (-1)) == 0 ? "\u200e" : "\u200f", null, zzy5, false, null);
    }

    public final void zzZ(String str, zzYEF zzyef, com.aspose.words.internal.zzY5 zzy5, boolean z, Bookmark bookmark) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        Paragraph paragraph = this.zzYtC;
        if (paragraph != null && paragraph != this.zzZwh.getCurrentParagraph()) {
            this.zzYtn.clear();
        }
        this.zzYtm = z;
        com.aspose.words.internal.zzZQG.zzZ(this.zzYtn, new zzZ(new com.aspose.words.internal.zzY2(str, zzy5), zzyef, bookmark));
        this.zzYtC = this.zzZwh.getCurrentParagraph();
    }

    public final boolean zzZ4n() {
        for (int size = this.zzYtn.size() - 1; size >= 0; size--) {
            zzZ zzz = this.zzYtn.get(size);
            if (!zzz.zzZ4l()) {
                String text = zzz.zzZ4m().getText();
                return !this.zzYtm && text.length() > 0 && androidx.core.content.OooO0O0.OooO00o(1, text) == ' ';
            }
        }
        return false;
    }

    public final void zzZ4o() throws Exception {
        if (isEmpty()) {
            return;
        }
        if (this.zzYtC == this.zzZwh.getCurrentParagraph()) {
            com.aspose.words.internal.zzY2[] zzy2Arr = new com.aspose.words.internal.zzY2[this.zzYtn.size()];
            for (int i = 0; i < this.zzYtn.size(); i++) {
                zzy2Arr[i] = this.zzYtn.get(i).zzZ4m();
            }
            com.aspose.words.internal.zzY3[] zzy3ArrZzZ = com.aspose.words.internal.zzY9.zzZ(zzy2Arr, this.zzZwh.getParagraphFormat().getBidi(), this.zzYto, true);
            zzYEF zzyefZzZpG = this.zzZwh.zzZpG();
            for (com.aspose.words.internal.zzY3 zzy3 : zzy3ArrZzZ) {
                zzZ zzz = this.zzYtn.get(zzy3.zzXm());
                if (!zzz.zzZ4l()) {
                    this.zzZwh.zzZ(zzz.zzZYh(), true);
                    if (this.zzZwh.getFont().getBidi() != zzy3.zzXn()) {
                        this.zzZwh.getFont().setBidi(zzy3.zzXn());
                    }
                    if (zzz.getBookmark() != null) {
                        this.zzZwh.insertNode(zzz.getBookmark().getBookmarkStart());
                    }
                    zzZ(this.zzZwh.getFont().getBidi() ? zzL4(zzy3.getText()) : new String[]{zzy3.getText()}, zzy3);
                    if (zzz.getBookmark() != null) {
                        this.zzZwh.insertNode(zzz.getBookmark().getBookmarkEnd());
                    }
                }
            }
            this.zzZwh.zzZ(zzyefZzZpG, false);
        }
        this.zzYtn.clear();
        this.zzYtC = null;
    }

    private static void zzY(Font font, int i) {
        if (font.getLocaleIdBi() != i) {
            font.setLocaleIdBi(i);
        }
    }

    private void zzZ(String[] strArr, com.aspose.words.internal.zzY3 zzy3) {
        int localeIdBi = this.zzZwh.getFont().getLocaleIdBi();
        for (String str : strArr) {
            if (zzy3.zzXj()) {
                zzY(this.zzZwh.getFont(), EditingLanguage.HEBREW);
            } else {
                int iZzL5 = this.zzZwh.getFont().getBidi() ? zzL5(str) : 0;
                if (iZzL5 != 0) {
                    zzY(this.zzZwh.getFont(), iZzL5);
                } else {
                    zzY(this.zzZwh.getFont(), localeIdBi);
                }
            }
            this.zzZwh.write(str);
        }
    }
}
