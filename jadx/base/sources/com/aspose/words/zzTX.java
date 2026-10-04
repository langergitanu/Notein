package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzTX {
    private static ArrayList<zzZ> zzZt7 = zzZYD();
    private static ArrayList<zzZ> zzZt6 = zzZYC();

    public static class zzZ {
        private int zzQt;
        private boolean zzZt3;
        private int zzZt4;
        private int zzZt5;
        private String zzjy;

        public zzZ(int i, int i2, int i3, String str, boolean z) {
            this.zzZt4 = i;
            this.zzZt5 = i2;
            this.zzQt = i3;
            this.zzjy = str;
            this.zzZt3 = z;
        }

        public final String getFontName() {
            return this.zzjy;
        }

        public final int zzTu() {
            return this.zzQt;
        }

        public final int zzZYA() {
            return this.zzZt5;
        }

        public final int zzZYB() {
            return this.zzZt4;
        }

        public final boolean zzZYz() {
            return this.zzZt3;
        }
    }

    private static zzZ zzMR(int i) {
        for (zzZ zzz : zzZt6) {
            if (zzz.zzZYB() <= i && i <= zzz.zzZYA()) {
                return zzz;
            }
        }
        return null;
    }

    private static void zzY(Run run) {
        Integer num = (Integer) zzZ7R.zzZ(run, 190, 0);
        if (num.intValue() != ((Integer) zzZ7R.zzZ(run, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, 0)).intValue()) {
            run.zzZYh().set(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, num);
        }
        boolean zZzW = zzZ7R.zzW((zzZ9G) run, 60);
        if (zZzW != zzZ7R.zzW((zzZ9G) run, 250)) {
            run.zzZYh().set(250, zzZU.zzYW(zZzW));
        }
        boolean zZzW2 = zzZ7R.zzW((zzZ9G) run, 70);
        if (zZzW2 != zzZ7R.zzW((zzZ9G) run, StyleIdentifier.SUBTLE_EMPHASIS)) {
            run.zzZYh().set(StyleIdentifier.SUBTLE_EMPHASIS, zzZU.zzYW(zZzW2));
        }
    }

    public static void zzZ(Run run) {
        zzZ zzz = null;
        int i = 0;
        while (i < run.zz0R()) {
            String text = run.getText();
            zzZ zzZ2 = zzZ(run, i);
            boolean z = zzZ2 != null;
            zzZ zzzZzZf = !z ? zzZf(text.charAt(i)) : zzZ2;
            if (zzz != zzzZzZf) {
                Run runZzng = run.zzng(i);
                if (zzz != null) {
                    zzZ(runZzng, zzz);
                }
                i = 0;
            }
            if (z) {
                i++;
            }
            i++;
            zzz = zzzZzZf;
        }
        if (zzz != null) {
            zzZ(run, zzz);
        }
    }

    private static ArrayList<zzZ> zzZYC() {
        ArrayList<zzZ> arrayList = new ArrayList<>();
        arrayList.add(new zzZ(128512, 128591, 0, "Segoe UI Emoji", false));
        return arrayList;
    }

    private static ArrayList<zzZ> zzZYD() {
        ArrayList<zzZ> arrayList = new ArrayList<>();
        arrayList.add(new zzZ(3456, 3583, EditingLanguage.SINHALESE, "Iskoola Pota", true));
        arrayList.add(new zzZ(3584, 3711, EditingLanguage.THAI, "Angsana New", true));
        arrayList.add(new zzZ(4608, 4991, EditingLanguage.AMHARIC, "Nyala", true));
        arrayList.add(new zzZ(6144, 6399, EditingLanguage.MONGOLIAN_MONGOLIAN, "Mongolian Baiti", true));
        arrayList.add(new zzZ(4608, 4991, 0, "Nyala", false));
        arrayList.add(new zzZ(5792, 5887, 0, "Segoe UI Historic", false));
        arrayList.add(new zzZ(6016, 6143, 0, "DaunPenh", false));
        arrayList.add(new zzZ(8288, 8288, 0, "Segoe UI Symbol", false));
        return arrayList;
    }

    private static zzZ zzZf(char c) {
        for (zzZ zzz : zzZt7) {
            if (zzz.zzZYB() <= c && c <= zzz.zzZYA()) {
                return zzz;
            }
        }
        return null;
    }

    private static void zzZ(Run run, zzZ zzz) {
        boolean z;
        boolean zZzW = zzZ7R.zzW((zzZ9G) run, StyleIdentifier.PLAIN_TABLE_2);
        if (zzz.zzZYz()) {
            if (!zZzW) {
                zzY(run);
            }
            run.zzZYh().zzQ(StyleIdentifier.PLAIN_TABLE_2, zzZU.zzZF6);
        }
        if (zzz.zzTu() != 0) {
            run.zzZYh().zzQ(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, Integer.valueOf(zzz.zzTu()));
        }
        if (com.aspose.words.internal.zzZKN.equals(zzz.getFontName(), run.getFont().getName()) || run.zz0R() == 0) {
            return;
        }
        char cCharAt = run.getText().charAt(0);
        String nameBi = zZzW ? run.getFont().getNameBi() : run.getFont().getName();
        FontInfo fontInfo = run.getDocument().getFontInfos().get(nameBi);
        if (fontInfo != null && !fontInfo.zzHC().equals(com.aspose.words.internal.zzJG.zzzU)) {
            z = !fontInfo.zzZ72().zzHC().zzWM(cCharAt);
        } else {
            com.aspose.words.internal.zzZXH zzzxhZzO = run.getDocument().zzZqy().zzO(nameBi, 0);
            z = zzzxhZzO == null || !zzzxhZzO.zzpP().zzC(cCharAt, true);
        }
        if (z) {
            run.getFont().setName(zzz.getFontName());
        }
    }

    private static zzZ zzZ(Run run, int i) {
        String text = run.getText();
        int i2 = i + 1;
        if (i2 < run.zz0R() && Character.isHighSurrogate(text.charAt(i)) && Character.isLowSurrogate(text.charAt(i2))) {
            return zzMR(com.aspose.words.internal.zzZVS.zzW(text.charAt(i), text.charAt(i2)));
        }
        return null;
    }
}
