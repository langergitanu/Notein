package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldAddressBlock extends Field implements zzZAT, zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static com.aspose.words.internal.zzZYG<String> zzYGr;

    static {
        com.aspose.words.internal.zzZYG<String> zzzyg = new com.aspose.words.internal.zzZYG<>(false);
        zzYGr = zzzyg;
        zzzyg.zzW("TITLE0", "Courtesy Title");
        zzYGr.zzW("NICK0", "Nickname");
        zzYGr.zzW("FIRST0", "First Name");
        zzYGr.zzW("MIDDLE0", "Middle Name");
        zzYGr.zzW("LAST0", "Last Name");
        zzYGr.zzW("SUFFIX0", "Suffix");
        zzYGr.zzW("TITLE1", "Spouse Courtesy Title");
        zzYGr.zzW("NICK1", "Spouse Nickname");
        zzYGr.zzW("FIRST1", "Spouse First Name");
        zzYGr.zzW("MIDDLE1", "Spouse Middle Name");
        zzYGr.zzW("LAST1", "Spouse Last Name");
        zzYGr.zzW("SUFFIX1", "Spouse Suffix");
        zzYGr.zzW("COMPANY", "Company");
        zzYGr.zzW("STREET1", "Address 1");
        zzYGr.zzW("STREET2", "Address 2");
        zzYGr.zzW("CITY", "City");
        zzYGr.zzW("STATE", "State");
        zzYGr.zzW("POSTAL", "Postal Code");
        zzYGr.zzW("COUNTRY", "Country or Region");
        zzUR = new com.aspose.words.internal.zzZHW("\\d", "\\c", "\\e", "\\f", "\\l");
    }

    public String getExcludedCountryOrRegionName() {
        return zzZgq().zzt("\\e", false);
    }

    @Override // com.aspose.words.zzZAT
    public String[] getFieldNames() throws Exception {
        return new zzZMG(this, null).zzZ6u();
    }

    public boolean getFormatAddressOnCountryOrRegion() {
        return zzZgq().zzMj("\\d");
    }

    public String getIncludeCountryOrRegionName() {
        return zzZgq().zzt("\\c", false);
    }

    public String getLanguageId() {
        return zzZgq().zzt("\\l", false);
    }

    @Override // com.aspose.words.zzZAT
    @ReservedForInternalUse
    @Deprecated
    public String getMergeFormat() {
        return getNameAndAddressFormat();
    }

    public String getNameAndAddressFormat() {
        return zzZgq().zzt("\\f", false);
    }

    @Override // com.aspose.words.zzZAT
    @ReservedForInternalUse
    @Deprecated
    public String getPlaceholderValue(zzZA9 zzza9, zzYZF zzyzf) throws Exception {
        String strZzLj = zzza9.zzLj(zzyzf.getName());
        return com.aspose.words.internal.zzZYD.zzXk(strZzLj) ? com.aspose.words.internal.zzZKN.format("{0}{1}{2}", zzyzf.getTextBefore(), strZzLj, zzyzf.getTextAfter()) : "";
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
        if (iZzTP != 0) {
            return (iZzTP == 1 || iZzTP == 2 || iZzTP == 3 || iZzTP == 4) ? 2 : 0;
        }
        return 1;
    }

    @Override // com.aspose.words.zzZAT
    @ReservedForInternalUse
    @Deprecated
    public Document iFormattableMergeField_FetchDocument() {
        return getStart().zzYBb();
    }

    public void setExcludedCountryOrRegionName(String str) throws Exception {
        zzZgq().zzZf("\\e", str);
    }

    public void setFormatAddressOnCountryOrRegion(boolean z) throws Exception {
        zzZgq().zzs("\\d", z);
    }

    public void setIncludeCountryOrRegionName(String str) throws Exception {
        zzZgq().zzZe("\\c", str);
    }

    public void setLanguageId(String str) throws Exception {
        zzZgq().zzZf("\\l", str);
    }

    public void setNameAndAddressFormat(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        zzZAF zzzaf = (zzZAF) zzZgo().zzZav().zzA(this);
        if (zzzaf == null) {
            return zzYZH.zzS(this, "«AddressBlock»");
        }
        zzYZH.zzY(this, null);
        return new zzZP5(this, new zzZMG(this, zzzaf).zzZ6w());
    }
}
