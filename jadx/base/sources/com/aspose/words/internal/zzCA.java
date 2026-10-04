package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzCA {
    private zzKS zztA;
    zzCC zztz;

    public zzCA(zzCC zzcc) {
        zzZ4.zzY((Object) zzcc, "serializer");
        this.zztz = zzcc;
    }

    private zzKS zzZ(String str, Exception exc) {
        if (this.zztA == null) {
            this.zztA = new zzKS(str, exc);
        }
        if (this.zztA.zzIS() == exc) {
            return this.zztA;
        }
        throw new IllegalStateException("Current error context error is different to requested error.");
    }

    public final void zzCj() {
        if (this.zztA == null) {
            throw new IllegalStateException("Could not clear error context. Error context is already null.");
        }
        this.zztA = null;
    }

    public final boolean zzY(String str, Exception exc) {
        zzKS zzksZzZ = zzZ(str, exc);
        if (!zzksZzZ.zzIR()) {
            new zzKQ(zzksZzZ);
        }
        return zzksZzZ.zzIR();
    }
}
