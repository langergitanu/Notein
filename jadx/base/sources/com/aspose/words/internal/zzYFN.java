package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYFN implements zzYFT {

    @Deprecated
    protected final zzZQY zzWOA;

    public zzYFN(zzZQY zzzqy) {
        this.zzWOA = zzzqy;
    }

    public static boolean zzXl(String str, String str2) {
        return (str == null || str.length() == 0) ? str2 == null || str2.length() == 0 : str2 != null && str.equals(str2);
    }

    public abstract int getEventType();

    public String toString() {
        return "[Stax Event #" + getEventType() + "]";
    }

    @Override // com.aspose.words.internal.zzZQN
    public zzZQY zzlj() {
        return this.zzWOA;
    }
}
