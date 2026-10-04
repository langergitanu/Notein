package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldMergeBarcode extends Field implements zzZAA, zzZBA {
    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public boolean canWorkAsMergeField() {
        return true;
    }

    public boolean getAddStartStopChar() {
        return zzZgq().zzMj("\\d");
    }

    public String getBackgroundColor() {
        return zzZgq().zzt("\\b", false);
    }

    public String getBarcodeType() {
        return zzZgq().zzDG(1);
    }

    public String getBarcodeValue() {
        return zzZgq().zzDG(0);
    }

    public String getCaseCodeStyle() {
        return zzZgq().zzt("\\c", false);
    }

    public boolean getDisplayText() {
        return zzZgq().zzMj("\\t");
    }

    public String getErrorCorrectionLevel() {
        return zzZgq().zzt("\\q", false);
    }

    public boolean getFixCheckDigit() {
        return zzZgq().zzMj("\\x");
    }

    public String getForegroundColor() {
        return zzZgq().zzt("\\f", false);
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public String getMergeFieldName() {
        return getBarcodeValue();
    }

    public String getPosCodeStyle() {
        return zzZgq().zzt("\\p", false);
    }

    public String getScalingFactor() {
        return zzZgq().zzt("\\s", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        return zzZR6.getSwitchType(str);
    }

    public String getSymbolHeight() {
        return zzZgq().zzt("\\h", false);
    }

    public String getSymbolRotation() {
        return zzZgq().zzt("\\r", false);
    }

    @Override // com.aspose.words.zzZAA
    @ReservedForInternalUse
    @Deprecated
    public boolean isMergeValueRequired() {
        return true;
    }

    public void setAddStartStopChar(boolean z) throws Exception {
        zzZgq().zzs("\\d", z);
    }

    public void setBackgroundColor(String str) throws Exception {
        zzZgq().zzZf("\\b", str);
    }

    public void setBarcodeType(String str) throws Exception {
        zzZgq().zzB(1, str);
    }

    public void setBarcodeValue(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setCaseCodeStyle(String str) throws Exception {
        zzZgq().zzZf("\\c", str);
    }

    public void setDisplayText(boolean z) throws Exception {
        zzZgq().zzs("\\t", z);
    }

    public void setErrorCorrectionLevel(String str) throws Exception {
        zzZgq().zzZf("\\q", str);
    }

    public void setFixCheckDigit(boolean z) throws Exception {
        zzZgq().zzs("\\x", z);
    }

    public void setForegroundColor(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    public void setPosCodeStyle(String str) throws Exception {
        zzZgq().zzZf("\\p", str);
    }

    public void setScalingFactor(String str) throws Exception {
        zzZgq().zzZf("\\s", str);
    }

    public void setSymbolHeight(String str) throws Exception {
        zzZgq().zzZf("\\h", str);
    }

    public void setSymbolRotation(String str) throws Exception {
        zzZgq().zzZf("\\r", str);
    }
}
