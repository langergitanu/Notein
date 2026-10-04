package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldAdvance extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\d", "\\l", "\\r", "\\u", "\\x", "\\y");

    public String getDownOffset() {
        return zzZgq().zzt("\\d", false);
    }

    public String getHorizontalPosition() {
        return zzZgq().zzt("\\x", false);
    }

    public String getLeftOffset() {
        return zzZgq().zzt("\\l", false);
    }

    public String getRightOffset() {
        return zzZgq().zzt("\\r", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 0 || iZzTP == 1 || iZzTP == 2 || iZzTP == 3 || iZzTP == 4 || iZzTP == 5) ? 2 : 0;
    }

    public String getUpOffset() {
        return zzZgq().zzt("\\u", false);
    }

    public String getVerticalPosition() {
        return zzZgq().zzt("\\y", false);
    }

    public void setDownOffset(String str) throws Exception {
        zzZgq().zzZd("\\d", str);
    }

    public void setHorizontalPosition(String str) throws Exception {
        zzZgq().zzZd("\\x", str);
    }

    public void setLeftOffset(String str) throws Exception {
        zzZgq().zzZd("\\l", str);
    }

    public void setRightOffset(String str) throws Exception {
        zzZgq().zzZd("\\r", str);
    }

    public void setUpOffset(String str) throws Exception {
        zzZgq().zzZd("\\u", str);
    }

    public void setVerticalPosition(String str) throws Exception {
        zzZgq().zzZd("\\y", str);
    }
}
