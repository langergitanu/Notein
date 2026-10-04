package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZOL extends zzZOJ {
    private StringBuilder zzZX3;

    public zzZOL(StringBuilder sb) {
        this.zzZX3 = sb;
    }

    public final String toString() {
        return this.zzZX3.toString();
    }

    @Override // com.aspose.words.internal.zzZOJ
    public final void write(String str) {
        if (str != null) {
            this.zzZX3.append(str);
        }
    }

    @Override // com.aspose.words.internal.zzZOJ
    public final void zzZR(char c) throws Exception {
        this.zzZX3.append(c);
    }

    public zzZOL() {
        this.zzZX3 = new StringBuilder();
    }
}
