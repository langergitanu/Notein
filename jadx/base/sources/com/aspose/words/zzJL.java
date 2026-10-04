package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzJL extends zzJM implements Cloneable {
    private String zzZit;
    private String zzZiu;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzRK(String str) {
        this.zzZit = str;
    }

    public final void zzRL(String str) {
        this.zzZiu = str;
    }

    @Override // com.aspose.words.zzJM
    public final int zzRM(String str) {
        if (zzJM.zzZn(str, this.zzZiu)) {
            return 1;
        }
        return zzJM.zzZn(str, this.zzZit) ? 2 : 0;
    }

    @Override // com.aspose.words.zzJM
    public final zzJM zzZSs() {
        return (zzJM) memberwiseClone();
    }
}
