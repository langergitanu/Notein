package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldBarcode extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\b", "\\u", "\\f");

    private BarcodeParameters zzZg7() {
        BarcodeParameters barcodeParameters = new BarcodeParameters();
        barcodeParameters.setPostalAddress(getPostalAddress());
        barcodeParameters.isBookmark(isBookmark());
        barcodeParameters.setFacingIdentificationMark(getFacingIdentificationMark());
        barcodeParameters.isUSPostalAddress(isUSPostalAddress());
        return barcodeParameters;
    }

    public String getFacingIdentificationMark() {
        return zzZgq().zzt("\\f", false);
    }

    public String getPostalAddress() {
        return zzZgq().zzDG(0);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        int i = 1;
        if (iZzTP != 0 && iZzTP != 1) {
            i = 2;
            if (iZzTP != 2) {
                return 0;
            }
        }
        return i;
    }

    public boolean isBookmark() {
        return zzZgq().zzMj("\\b");
    }

    public boolean isUSPostalAddress() {
        return zzZgq().zzMj("\\u");
    }

    public void setFacingIdentificationMark(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    public void setPostalAddress(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    @Override // com.aspose.words.Field
    public final zzYWB zzZgI() throws Exception {
        return zzZR6.zzY(getType(), getStart().zzYBb(), zzZg7());
    }

    public void isBookmark(boolean z) throws Exception {
        zzZgq().zzs("\\b", z);
    }

    public void isUSPostalAddress(boolean z) throws Exception {
        zzZgq().zzs("\\u", z);
    }
}
