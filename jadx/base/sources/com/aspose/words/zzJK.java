package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzJK extends zzJM implements Cloneable {
    private String zzZir;
    private String zzZis;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzRI(String str) {
        this.zzZir = str;
    }

    public final void zzRJ(String str) {
        this.zzZis = str;
    }

    @Override // com.aspose.words.zzJM
    public final int zzRM(String str) {
        return (zzJM.zzZn(str, this.zzZis) || zzJM.zzZn(str, this.zzZir)) ? 2 : 0;
    }

    @Override // com.aspose.words.zzJM
    public final zzJM zzZSs() {
        return (zzJM) memberwiseClone();
    }
}
