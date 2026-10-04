package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldFileSize extends Field implements zzZBA {
    static zzZB5 zzYGm = new zzZ(0);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\k", "\\m");

    public static class zzZ implements zzZB5 {
        private zzZ() {
        }

        @Override // com.aspose.words.zzZB5
        public final zzTL zzW(Document document, zzZBB zzzbb) {
            return FieldFileSize.zzV(document, zzzbb);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public static int zzMk(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 0 || iZzTP == 1) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ7P zzV(Document document, zzZBB zzzbb) {
        String originalFileName = document.getOriginalFileName();
        int length = 0;
        if (originalFileName != null) {
            try {
                length = (int) new com.aspose.words.internal.zzZOT(originalFileName).getLength();
                if (zzzbb.zzMj("\\m")) {
                    length = com.aspose.words.internal.zzAN.zzZG(((double) length) / 1000000.0d);
                } else if (zzzbb.zzMj("\\k")) {
                    length = com.aspose.words.internal.zzAN.zzZG(((double) length) / 1000.0d);
                }
            } catch (Exception unused) {
            }
        }
        return new zzZ7P(length);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        return zzMk(str);
    }

    public boolean isInKilobytes() {
        return zzZgq().zzMj("\\k");
    }

    public boolean isInMegabytes() {
        return zzZgq().zzMj("\\m");
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        return new zzZP5(this, zzV(getStart().zzYBb(), zzZgq()));
    }

    public void isInKilobytes(boolean z) throws Exception {
        zzZgq().zzs("\\k", z);
    }

    public void isInMegabytes(boolean z) throws Exception {
        zzZgq().zzs("\\m", z);
    }
}
