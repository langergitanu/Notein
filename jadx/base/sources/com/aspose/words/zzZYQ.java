package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYQ implements com.aspose.words.internal.zzH6 {
    private com.aspose.words.internal.zzF4 zzYQN;
    private com.aspose.words.internal.zzF8 zzYQO;
    private zzZYZ zzYSF;
    private IWarningCallback zzZG0;

    public zzZYQ(zzZYZ zzzyz, com.aspose.words.internal.zzF8 zzf8, IWarningCallback iWarningCallback) {
        this.zzZG0 = iWarningCallback;
        this.zzYSF = zzzyz;
        this.zzYQO = zzf8;
        this.zzYQN = new zzY21(iWarningCallback);
    }

    public final IWarningCallback getWarningCallback() {
        return this.zzZG0;
    }

    @Override // com.aspose.words.internal.zzH6
    public final com.aspose.words.internal.zzH6 zzFE() {
        return zzZo7();
    }

    @Override // com.aspose.words.internal.zzH6
    public final com.aspose.words.internal.zzF8 zzFF() {
        return this.zzYQO;
    }

    @Override // com.aspose.words.internal.zzH6
    public final com.aspose.words.internal.zzH3 zzFG() {
        return this.zzYSF;
    }

    @Override // com.aspose.words.internal.zzH6
    public final com.aspose.words.internal.zzF4 zzHq() {
        return this.zzYQN;
    }

    public final com.aspose.words.internal.zzH6 zzZo7() {
        return new zzZYQ(this.zzYSF, this.zzYQO, null);
    }

    public final zzZYZ zzZqy() {
        return this.zzYSF;
    }
}
