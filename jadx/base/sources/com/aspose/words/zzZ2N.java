package com.aspose.words;

import com.aspose.words.ref.Ref;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2N implements zzZAF {
    private IMailMergeDataSource zzY5E;

    private zzZ2N(IMailMergeDataSource iMailMergeDataSource) {
        this.zzY5E = iMailMergeDataSource;
    }

    public static zzZAF zzZ(IMailMergeDataSource iMailMergeDataSource) {
        if (iMailMergeDataSource == null) {
            return null;
        }
        return new zzZ2N(iMailMergeDataSource);
    }

    @Override // com.aspose.words.zzZAF
    public final int getFieldCount() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzZAF
    public final String getTableName() throws Exception {
        return this.zzY5E.getTableName();
    }

    @Override // com.aspose.words.zzZAF
    public final boolean getValue(String str, Ref<Object> ref) throws Exception {
        return this.zzY5E.getValue(str, ref);
    }

    @Override // com.aspose.words.zzZAG
    public final boolean moveNext() throws Exception {
        return this.zzY5E.moveNext();
    }

    @Override // com.aspose.words.zzZAG
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzZAF
    public final int zzMq(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.words.zzZAG
    public final boolean zzZha() {
        return false;
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZhb() {
        return false;
    }

    @Override // com.aspose.words.zzZAF
    public final zzZAF zzu(String str, boolean z) throws Exception {
        return zzZ(this.zzY5E.getChildDataSource(str));
    }

    @Override // com.aspose.words.zzZAF
    public final boolean zzZ(int i, Ref<Object> ref) {
        throw new UnsupportedOperationException();
    }
}
