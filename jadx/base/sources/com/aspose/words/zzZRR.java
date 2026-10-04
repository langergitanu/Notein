package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZRR implements zzZAF {
    private boolean zzYHW;

    @Override // com.aspose.words.zzZAF
    public final int getFieldCount() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZAF
    public final String getTableName() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZAF
    public final boolean getValue(String str, Ref<Object> ref) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZAG
    public final boolean moveNext() {
        if (this.zzYHW) {
            return false;
        }
        this.zzYHW = true;
        return true;
    }

    @Override // com.aspose.words.zzZAG
    public final void reset() {
        throw new IllegalStateException();
    }

    public abstract zzZAF zzMp(String str) throws Exception;

    @Override // com.aspose.words.zzZAF
    public final int zzMq(String str) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZ(int i, Ref<Object> ref) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZAG
    public final boolean zzZha() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZhb() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.zzZAF
    public final zzZAF zzu(String str, boolean z) throws Exception {
        return zzMp(str);
    }
}
