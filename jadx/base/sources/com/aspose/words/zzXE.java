package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXE extends zzZS1 {

    public static class zzZ implements zzZ8R {
        private int zzZAR;

        public zzZ(int i) {
            this.zzZAR = i;
        }

        @Override // com.aspose.words.zzZ8R
        public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
            zzzow.writeByte((byte) this.zzZAR);
        }
    }

    public zzXE() {
        super(1);
    }

    @Override // com.aspose.words.zzZS1
    public final Object zzOI(int i) {
        return new zzZ(i);
    }
}
