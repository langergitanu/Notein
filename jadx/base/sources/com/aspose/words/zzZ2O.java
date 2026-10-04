package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2O implements zzZAE {
    private IMailMergeDataSourceRoot zzY5F;

    private zzZ2O(IMailMergeDataSourceRoot iMailMergeDataSourceRoot) {
        this.zzY5F = iMailMergeDataSourceRoot;
    }

    public static zzZAE zzZ(IMailMergeDataSourceRoot iMailMergeDataSourceRoot) {
        if (iMailMergeDataSourceRoot == null) {
            return null;
        }
        return new zzZ2O(iMailMergeDataSourceRoot);
    }

    @Override // com.aspose.words.zzZAE
    public final zzZAF zzJD(String str) throws Exception {
        return zzZ2N.zzZ(this.zzY5F.getDataSource(str));
    }
}
