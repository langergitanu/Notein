package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class OleControl implements zzZBL {
    private String mName;
    private com.aspose.words.internal.zzAA zzXJg;
    private int zzYG = zzY41.zzXUb();
    protected static final String HTML_SELECT_CLSID = "5512d122-5cc6-11cf-8d67-00aa00bdce1d";
    protected static final String HTML_SUBMIT_BUTTON_CLSID = "5512d110-5cc6-11cf-8d67-00aa00bdce1d";
    protected static final String HTML_HIDDEN_CLSID = "5512d11c-5cc6-11cf-8d67-00aa00bdce1d";
    protected static final String HTML_TEXT_CLSID = "5512d11a-5cc6-11cf-8d67-00aa00bdce1d";
    protected static final String OPTION_BUTTON_CONTROL_CLSID = "8bd21d50-ec42-11ce-9e0d-00aa006002f3";
    protected static final String LABEL_CONTROL_CLSID = "978c9e23-d4b0-11ce-bf2d-00aa003f40d0";
    protected static final String TEXT_BOX_CONTROL_CLSID = "8bd21d10-ec42-11ce-9e0d-00aa006002f3";
    protected static final String CHECK_BOX_CONTROL_CLSID = "8bd21d40-ec42-11ce-9e0d-00aa006002f3";
    protected static final String TOGGLE_BUTTON_CONTROL_CLSID = "8bd21d60-ec42-11ce-9e0d-00aa006002f3";
    protected static final String SPIN_BUTTON_CONTROL_CLSID = "79176fb0-b7f2-11ce-97ef-00aa006d2776";
    protected static final String COMBO_BOX_CONTROL_CLSID = "8bd21d30-ec42-11ce-9e0d-00aa006002f3";
    protected static final String COMMAND_BUTTON_CONTROL_CLSID = "d7053240-ce69-11cd-a777-00dd01143c57";
    protected static final String IMAGE_CONTROL_CLSID = "4c599241-6926-101b-9992-00000b65c6f9";
    protected static final String SCROLL_BAR_CONTROL_CLSID = "dfd181e0-5e2f-11ce-a449-00aa004a803d";
    protected static final String TAB_STRIP_CONTROL_CLSID = "eae50eb0-4a62-11ce-bed6-00aa00611080";
    protected static final String LIST_BOX_CONTROL_CLSID = "8bd21d20-ec42-11ce-9e0d-00aa006002f3";
    protected static final String FORM_CONTROL_CLSID = "c62a69f0-16dc-11ce-9e98-00aa00574a4f";
    protected static final String FRAME_CONTROL_CLSID = "6e182020-f460-11ce-9bcd-00aa00608e01";
    protected static final String MULTI_PAGE_CONTROL_CLSID = "46e31370-3f7a-11ce-bed6-00aa00611080";
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("5512d118-5cc6-11cf-8d67-00aa00bdce1d", HTML_SELECT_CLSID, HTML_SUBMIT_BUTTON_CLSID, HTML_HIDDEN_CLSID, HTML_TEXT_CLSID, OPTION_BUTTON_CONTROL_CLSID, LABEL_CONTROL_CLSID, TEXT_BOX_CONTROL_CLSID, CHECK_BOX_CONTROL_CLSID, TOGGLE_BUTTON_CONTROL_CLSID, SPIN_BUTTON_CONTROL_CLSID, COMBO_BOX_CONTROL_CLSID, COMMAND_BUTTON_CONTROL_CLSID, IMAGE_CONTROL_CLSID, SCROLL_BAR_CONTROL_CLSID, TAB_STRIP_CONTROL_CLSID, LIST_BOX_CONTROL_CLSID, FORM_CONTROL_CLSID, FRAME_CONTROL_CLSID, MULTI_PAGE_CONTROL_CLSID);

    public OleControl(String str) {
        this.mName = str;
    }

    public static boolean zzDf(String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8;
        return com.aspose.words.internal.zzZKN.zzX(str, OPTION_BUTTON_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, LABEL_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, TEXT_BOX_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, CHECK_BOX_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, TOGGLE_BUTTON_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, SPIN_BUTTON_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, COMBO_BOX_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, COMMAND_BUTTON_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, IMAGE_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, SCROLL_BAR_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, TAB_STRIP_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, LIST_BOX_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, FORM_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, FRAME_CONTROL_CLSID, i) || com.aspose.words.internal.zzZKN.zzX(str, MULTI_PAGE_CONTROL_CLSID, i);
    }

    private static boolean zzJ(com.aspose.words.internal.zzAA zzaa) throws Exception {
        zzYTR zzytrZzQ = zzYTR.zzQ(zzaa);
        return (zzytrZzQ == null || (zzytrZzQ.zzYyk() & 4096) == 0) ? false : true;
    }

    private static String zzK(com.aspose.words.internal.zzAA zzaa) throws Exception {
        zzYTO zzytoZzP = zzYTO.zzP(zzaa);
        return zzytoZzP != null ? zzytoZzP.getValue() : "";
    }

    private void zzL(com.aspose.words.internal.zzAA zzaa) throws Exception {
        zzUD zzud = new zzUD();
        zzud.setProgId(getProgId());
        zzud.zzW(new com.aspose.words.internal.zzZOZ(getClsidVirtual()));
        zzud.zzSW(getUserType());
        zzud.zzZ(zzZ6p());
        zzud.zzW(zzaa);
    }

    public static OleControl zzM(com.aspose.words.internal.zzAA zzaa) throws Exception {
        OleControl zzzfv;
        if (!zzJ(zzaa)) {
            return null;
        }
        String strZzK = zzK(zzaa);
        switch (zzUR.zzTP(zzaa.zzAC().toString())) {
            case 0:
                zzzfv = new zzZFV(strZzK);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                zzzfv = new zzZFY(strZzK);
                break;
            case 5:
                zzzfv = new zzYNN(strZzK);
                break;
            case 6:
                zzzfv = new zzZ78(strZzK);
                break;
            case 7:
                zzzfv = new TextBoxControl(strZzK);
                break;
            case 8:
                zzzfv = new zzVY(strZzK);
                break;
            case 9:
                zzzfv = new zzY50(strZzK);
                break;
            case 10:
                zzzfv = new zzY9N(strZzK);
                break;
            case 11:
                zzzfv = new zzUX(strZzK);
                break;
            case 12:
                zzzfv = new zzUW(strZzK);
                break;
            case 13:
                zzzfv = new zzZ8M(strZzK);
                break;
            case 14:
                zzzfv = new zzYDU(strZzK);
                break;
            case 15:
                zzzfv = new zzY73(strZzK);
                break;
            case 16:
                zzzfv = new zzZ4L(strZzK);
                break;
            case 17:
                zzzfv = new zzZMO(strZzK);
                break;
            case 18:
                zzzfv = new zzZLS(strZzK);
                break;
            case 19:
                zzzfv = new zzYWX(strZzK);
                break;
            default:
                zzzfv = new OleControl(strZzK);
                break;
        }
        zzzfv.zzX(zzaa);
        return zzzfv;
    }

    @Override // com.aspose.words.zzZBL
    @ReservedForInternalUse
    @Deprecated
    public String getClsidInternal() {
        return getClsidVirtual();
    }

    public String getClsidVirtual() {
        return com.aspose.words.internal.zzZOZ.zzZXP.toString();
    }

    @Override // com.aspose.words.zzZBL
    @ReservedForInternalUse
    @Deprecated
    public String getExtensionForUser(String str) {
        return "";
    }

    @Override // com.aspose.words.zzZBL
    @ReservedForInternalUse
    @Deprecated
    public String getFileNameForUser() {
        return "";
    }

    @Override // com.aspose.words.zzZBL
    @ReservedForInternalUse
    @Deprecated
    public int getId() {
        return this.zzYG;
    }

    @Override // com.aspose.words.zzZBL
    public String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.zzZBL
    @ReservedForInternalUse
    @Deprecated
    public zzYOC getOleObject() throws Exception {
        if (this.zzXJg != null) {
            new zzYTO(getName()).zzW(this.zzXJg);
            return new zzYOC(this.zzXJg);
        }
        com.aspose.words.internal.zzAA zzaa = new com.aspose.words.internal.zzAA(new com.aspose.words.internal.zzZOZ(getClsidVirtual()));
        zzL(zzaa);
        zzYTR.zzYyl().zzW(zzaa);
        new zzYTO(getName()).zzW(zzaa);
        zzW(zzaa);
        return new zzYOC(zzaa);
    }

    public String getProgId() {
        return "";
    }

    public String getUserType() {
        return "";
    }

    public boolean isForms2OleControl() {
        return zzDf(getClsidVirtual());
    }

    @Override // com.aspose.words.zzZBL
    @ReservedForInternalUse
    @Deprecated
    public boolean isForms2OleControlInternal() {
        return isForms2OleControl();
    }

    @Override // com.aspose.words.zzZBL
    public void saveForUser(com.aspose.words.internal.zzZOP zzzop, zzZ9A zzz9a) {
    }

    @Override // com.aspose.words.zzZBL
    @ReservedForInternalUse
    @Deprecated
    public void setId(int i) {
        this.zzYG = i;
    }

    public void setName(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "Name");
        this.mName = str;
    }

    public int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        return 0;
    }

    public void zzW(com.aspose.words.internal.zzAA zzaa) throws Exception {
    }

    public void zzX(com.aspose.words.internal.zzAA zzaa) throws Exception {
        this.zzXJg = zzaa;
    }

    public void zzZ(com.aspose.words.internal.zzZOX zzzox) throws Exception {
    }

    public zzVB zzZ6p() {
        return null;
    }
}
