package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldGreetingLine extends Field implements zzZAT, zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static String[] zzYDY;
    private static com.aspose.words.internal.zzZYG<String> zzYGr;
    private StringBuilder zzYDV;
    private String zzYDW;
    private String zzYDX;

    static {
        com.aspose.words.internal.zzZYG<String> zzzyg = new com.aspose.words.internal.zzZYG<>(false);
        zzYGr = zzzyg;
        zzYDY = new String[]{"<<_TITLE0_>><<_LAST0_>>", "<<_TITLE0_>><<and _TITLE1_>><<_LAST0_>>", "<<_TITLE0_>><<_FIRST0_>><<_LAST0_>><<_SUFFIX0_>>", "<<_TITLE0_>><<_NICK0_>><<_LAST0_>><<_SUFFIX0_>>", "<<_FIRST0_>><<_LAST0_>><<_SUFFIX0_>>", "<<_NICK0_>><<_LAST0_>><<_SUFFIX0_>>", "<<_FIRST0_>><<and _FIRST1_>><<_LAST0_>>", "<<_NICK0_>><<and _FIRST1_>><<_LAST0_>>", "<<_FIRST0_>>", "<<_NICK0_>>", "<<_FIRST0_>><<and _FIRST1_>>", "<<_NICK0_>><<and _FIRST1_>>", "<<Mr. and Mrs. _LAST0_>>"};
        zzzyg.zzW("TITLE0", "Courtesy Title");
        zzYGr.zzW("NICK0", "Nickname");
        zzYGr.zzW("FIRST0", "First Name");
        zzYGr.zzW("LAST0", "Last Name");
        zzYGr.zzW("SUFFIX0", "Suffix");
        zzYGr.zzW("TITLE1", "Spouse Courtesy Title");
        zzYGr.zzW("NICK1", "Spouse Nickname");
        zzYGr.zzW("FIRST1", "Spouse First Name");
        zzYGr.zzW("LAST1", "Spouse Last Name");
        zzUR = new com.aspose.words.internal.zzZHW("\\e", "\\f", "\\l", "BEFORE", "AFTER", "TITLE1", "FIRST1");
    }

    private boolean zzZdU() {
        String string = this.zzYDV.toString();
        for (String str : zzYDY) {
            if (com.aspose.words.internal.zzZYD.zzi(string, str)) {
                return true;
            }
        }
        return false;
    }

    public String getAlternateText() {
        return zzZgq().zzt("\\e", false);
    }

    @Override // com.aspose.words.zzZAT
    public String[] getFieldNames() throws Exception {
        return new zzZMG(this, null).zzZ6u();
    }

    public String getLanguageId() {
        return zzZgq().zzt("\\l", false);
    }

    @Override // com.aspose.words.zzZAT
    @ReservedForInternalUse
    @Deprecated
    public String getMergeFormat() {
        return getNameFormat();
    }

    public String getNameFormat() {
        return zzZgq().zzt("\\f", false);
    }

    @Override // com.aspose.words.zzZAT
    @ReservedForInternalUse
    @Deprecated
    public String getPlaceholderValue(zzZA9 zzza9, zzYZF zzyzf) throws Exception {
        com.aspose.words.internal.zzZHW zzzhw = zzUR;
        int iZzTP = zzzhw.zzTP(zzyzf.getName().toUpperCase());
        if (iZzTP == 3) {
            this.zzYDX = com.aspose.words.internal.zzZKN.zzTX(zzyzf.getTextAfter());
            return "";
        }
        if (iZzTP == 4) {
            this.zzYDW = com.aspose.words.internal.zzZKN.zzTX(zzyzf.getTextAfter());
            return "";
        }
        String strZzLj = zzza9.zzLj(zzyzf.getName());
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzLj)) {
            return "";
        }
        int iZzTP2 = zzzhw.zzTP(zzyzf.getName().toUpperCase());
        if (iZzTP2 == 5 || iZzTP2 == 6) {
            com.aspose.words.internal.zzZNH.zzZ(this.zzYDV, "<<_and {0}_>>", zzyzf.getName());
            return com.aspose.words.internal.zzZKN.format("and {0}", strZzLj);
        }
        com.aspose.words.internal.zzZNH.zzZ(this.zzYDV, "<<_{0}_>>", zzyzf.getName());
        return strZzLj;
    }

    @Override // com.aspose.words.zzZAT
    @ReservedForInternalUse
    @Deprecated
    public com.aspose.words.internal.zzZYG<String> getPlaceholdersToFieldsMap() {
        return zzYGr;
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 0 || iZzTP == 1 || iZzTP == 2) ? 2 : 0;
    }

    @Override // com.aspose.words.zzZAT
    @ReservedForInternalUse
    @Deprecated
    public Document iFormattableMergeField_FetchDocument() {
        return getStart().zzYBb();
    }

    public void setAlternateText(String str) throws Exception {
        zzZgq().zzZf("\\e", str);
    }

    public void setLanguageId(String str) throws Exception {
        zzZgq().zzZf("\\l", str);
    }

    public void setNameFormat(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        zzZAF zzzaf = (zzZAF) zzZgo().zzZav().zzA(this);
        if (zzzaf == null) {
            return zzYZH.zzS(this, "«GreetingLine»");
        }
        StringBuilder sb = this.zzYDV;
        if (sb == null) {
            this.zzYDV = new StringBuilder();
        } else {
            sb.setLength(0);
        }
        String strZzZ6v = new zzZMG(this, zzzaf).zzZ6v();
        if (!com.aspose.words.internal.zzZYD.zzXk(strZzZ6v) || !zzZdU()) {
            strZzZ6v = getAlternateText();
        }
        zzYZH.zzY(this, null);
        return new zzZP5(this, com.aspose.words.internal.zzZKN.format("{0} {1}{2}", this.zzYDX, strZzZ6v, this.zzYDW));
    }
}
