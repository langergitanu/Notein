package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzLG {
    public final boolean hasMoreTokens() {
        zzLH zzlhZzZVU = zzZVU();
        zzZVT();
        return !zzlhZzZVU.zzYC();
    }

    public final zzLH zzZU9() {
        zzLH zzlhZzZVU = zzZVU();
        return zzlhZzZVU.isWhitespace() ? zzZVU() : zzlhZzZVU;
    }

    public final void zzZUa() {
        if (zzZVU().isWhitespace()) {
            zzZVU();
        }
        zzZVT();
    }

    public abstract void zzZVT();

    public abstract zzLH zzZVU();
}
