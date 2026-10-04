package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZL2 {
    private boolean zzfn() {
        zzj();
        if (getNodeType() == 1 && !zzc()) {
            int depth = getDepth();
            while (read() && depth < getDepth()) {
            }
        }
        return getNodeType() == 2;
    }

    public abstract int getDepth();

    public abstract int getNodeType();

    public abstract boolean read();

    public abstract boolean zzc();

    public abstract String zzfm() throws Exception;

    public final void zzfo() {
        zzfn();
        read();
    }

    public final int zzfp() {
        do {
            int nodeType = getNodeType();
            if (nodeType == 10) {
                zzj();
                return getNodeType();
            }
            if (nodeType == 1 || nodeType == 2 || nodeType == 4 || nodeType == 12 || nodeType == 15 || nodeType == 9) {
                return nodeType;
            }
        } while (read());
        return getNodeType();
    }

    public abstract boolean zzj();
}
