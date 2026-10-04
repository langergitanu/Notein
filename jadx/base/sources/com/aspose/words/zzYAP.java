package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYAP {
    private Comment zzXcD;
    private zzYAQ zzXcE;
    private zzYAQ zzXcF;
    private zzYAQ zzXcG;

    public final void zzJ(Comment comment) {
        this.zzXcD = comment;
    }

    public final int zzW(zzYAQ zzyaq) {
        if (zzyaq == this.zzXcG) {
            return 1;
        }
        if (zzyaq == this.zzXcF) {
            return 2;
        }
        return zzyaq == this.zzXcE ? 3 : 0;
    }

    public final Comment zzY5Y() {
        return this.zzXcD;
    }

    public final zzYAQ zzY63() {
        return this.zzXcG;
    }

    public final zzYAQ zzY64() {
        return this.zzXcE;
    }

    public final zzYAQ zzY65() {
        return this.zzXcF;
    }

    public final void zzZ(zzYAQ zzyaq, int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unexpected marker type.");
                }
                if (this.zzXcE != null) {
                    throw new IllegalStateException("End value already initialized.");
                }
                this.zzXcE = zzyaq;
            } else {
                if (this.zzXcF != null) {
                    throw new IllegalStateException("Start value already initialized.");
                }
                this.zzXcF = zzyaq;
            }
        } else {
            if (this.zzXcG != null) {
                throw new IllegalStateException("Master value already initialized.");
            }
            this.zzXcG = zzyaq;
        }
        zzyaq.zzZ(this);
    }
}
