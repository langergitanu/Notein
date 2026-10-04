package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldSaveDate extends Field implements zzZBA {
    static zzZB5 zzYGm = new zzZ(0);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\h", "\\s", "\\u");

    public static class zzZ implements zzZB5 {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZB5
        public final zzTL zzW(Document document, zzZBB zzzbb) {
            return FieldSaveDate.zzy(document);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzKF zzy(Document document) {
        return new zzKF(com.aspose.words.internal.zzR1.zzZ(document.getBuiltInDocumentProperties().zz7f()));
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 0 || iZzTP == 1 || iZzTP == 2) ? 1 : 0;
    }

    public boolean getUseLunarCalendar() {
        return zzZgq().zzMj("\\h");
    }

    public boolean getUseSakaEraCalendar() {
        return zzZgq().zzMj("\\s");
    }

    public boolean getUseUmAlQuraCalendar() {
        return zzZgq().zzMj("\\u");
    }

    public void setUseLunarCalendar(boolean z) throws Exception {
        zzZgq().zzs("\\h", z);
    }

    public void setUseSakaEraCalendar(boolean z) throws Exception {
        zzZgq().zzs("\\s", z);
    }

    public void setUseUmAlQuraCalendar(boolean z) throws Exception {
        zzZgq().zzs("\\u", z);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        return new zzZP5(this, zzy(getStart().zzYBb()));
    }
}
