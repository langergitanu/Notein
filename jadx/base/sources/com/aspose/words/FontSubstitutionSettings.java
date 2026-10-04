package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FontSubstitutionSettings {
    private FontNameSubstitutionRule zzYwG;
    private FontConfigSubstitutionRule zzYwH;
    private DefaultFontSubstitutionRule zzYwI;
    private FontInfoSubstitutionRule zzYwJ;
    private TableSubstitutionRule zzYwK;

    public FontSubstitutionSettings(Object obj) {
        this.zzYwK = new TableSubstitutionRule(obj);
        this.zzYwJ = new FontInfoSubstitutionRule(obj);
        this.zzYwI = new DefaultFontSubstitutionRule(obj);
        FontConfigSubstitutionRule fontConfigSubstitutionRule = new FontConfigSubstitutionRule(obj);
        this.zzYwH = fontConfigSubstitutionRule;
        fontConfigSubstitutionRule.setEnabled(false);
        this.zzYwG = new FontNameSubstitutionRule(obj);
    }

    public DefaultFontSubstitutionRule getDefaultFontSubstitution() {
        return this.zzYwI;
    }

    public FontConfigSubstitutionRule getFontConfigSubstitution() {
        return this.zzYwH;
    }

    public FontInfoSubstitutionRule getFontInfoSubstitution() {
        return this.zzYwJ;
    }

    public FontNameSubstitutionRule getFontNameSubstitution() {
        return this.zzYwG;
    }

    public TableSubstitutionRule getTableSubstitution() {
        return this.zzYwK;
    }
}
