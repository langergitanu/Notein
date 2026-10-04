package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class LanguagePreferences {
    private static boolean zzLX;
    private com.aspose.words.internal.zzIM<Integer> zzYgZ = new com.aspose.words.internal.zzIM<>();
    private int zzYgY = EditingLanguage.ENGLISH_US;

    private int getLocaleId() {
        return (zzZ3X.zzwQ(this.zzYgY) || zzZ3X.zzwP(this.zzYgY)) ? this.zzYgY : EditingLanguage.ENGLISH_US;
    }

    private int getLocaleIdBi() {
        if (zzZ3X.zzwJ(this.zzYgY) || zzYUq()) {
            return 1025;
        }
        if (zzZ3X.zzwI(this.zzYgY) || zzYUr()) {
            return EditingLanguage.HEBREW;
        }
        return 1025;
    }

    private int getLocaleIdFarEast() {
        if (zzZ3X.zzwL(this.zzYgY)) {
            return zzYUv();
        }
        int iZzYUu = zzYUu();
        return iZzYUu != 1033 ? iZzYUu : getLocaleId();
    }

    private boolean zzYUp() {
        return this.zzYgZ.contains(Integer.valueOf(EditingLanguage.JAPANESE));
    }

    private boolean zzYUq() {
        for (Integer num : this.zzYgZ) {
            num.intValue();
            if (zzZ3X.zzwJ(num.intValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean zzYUr() {
        return this.zzYgZ.contains(Integer.valueOf(EditingLanguage.HEBREW));
    }

    private boolean zzYUs() {
        return this.zzYgZ.contains(Integer.valueOf(EditingLanguage.CHINESE_TAIWAN)) || this.zzYgZ.contains(Integer.valueOf(EditingLanguage.CHINESE_HONG_KONG)) || this.zzYgZ.contains(Integer.valueOf(EditingLanguage.CHINESE_MACAO));
    }

    private boolean zzYUt() {
        return this.zzYgZ.contains(2052) || this.zzYgZ.contains(Integer.valueOf(EditingLanguage.CHINESE_SINGAPORE));
    }

    private int zzYUu() {
        if (zzYUt()) {
            return 2052;
        }
        return zzYUs() ? EditingLanguage.CHINESE_TAIWAN : zzYUp() ? EditingLanguage.JAPANESE : EditingLanguage.ENGLISH_US;
    }

    private int zzYUv() {
        if (zzZ3X.zzwO(this.zzYgY)) {
            return 2052;
        }
        if (zzZ3X.zzwN(this.zzYgY)) {
            return EditingLanguage.CHINESE_TAIWAN;
        }
        int i = this.zzYgY;
        return i == 1041 ? EditingLanguage.JAPANESE : i == 1042 ? EditingLanguage.KOREAN : EditingLanguage.ENGLISH_US;
    }

    public void addEditingLanguage(int i) {
        this.zzYgZ.add(Integer.valueOf(i));
    }

    public void addEditingLanguages(int[] iArr) {
        com.aspose.words.internal.zzZ4.zzY((Object) iArr, "languages");
        for (int i : iArr) {
            addEditingLanguage(i);
        }
    }

    public int getDefaultEditingLanguage() {
        return this.zzYgY;
    }

    public void setDefaultEditingLanguage(int i) {
        this.zzYgY = i;
    }

    public final void zzB(DocumentBase documentBase) {
        if (zzLX) {
            return;
        }
        zzYEF zzyefZzY37 = documentBase.getStyles().zzY37();
        zzyefZzY37.zzN(380, Integer.valueOf(getLocaleId()));
        zzyefZzY37.zzN(390, Integer.valueOf(getLocaleIdFarEast()));
        zzyefZzY37.zzN(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, Integer.valueOf(getLocaleIdBi()));
        int iZzYUv = zzYUv();
        documentBase.zzZpV().zzYUZ = iZzYUv;
        if (zzZ3X.zzwL(this.zzYgY)) {
            documentBase.zzZpV().zzYVg.setUseFELayout(true);
            zzyefZzY37.zzQ(235, zzU1.zzMW(131075));
            Theme themeZzZqI = documentBase.zzZqI();
            if (themeZzZqI != null && themeZzZqI.zzXVF() != null) {
                themeZzZqI.zzXVF().zzX33 = iZzYUv;
            }
            zzyefZzY37.setLocaleIdFarEast(iZzYUv);
        }
    }
}
