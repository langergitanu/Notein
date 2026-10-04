package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAI {
    private boolean zzWFb;
    private boolean zzWFc;
    private Object zzWFd;
    private zzZDD zzWFe;
    private zzZD3 zzWFf;

    private zzZAI(zzZD3 zzzd3) throws IOException {
        this.zzWFf = zzzd3;
        this.zzWFe = (zzZDD) zzzd3.zzXKC();
    }

    public static zzZAI zzY7(Object obj) throws IOException {
        if (obj instanceof zzZD4) {
            return new zzZAI(((zzZD4) obj).zzXKD());
        }
        if (obj instanceof zzZD3) {
            return new zzZAI((zzZD3) obj);
        }
        throw new IOException(C22206OooOOo0.OooO0OO(obj, "unknown object encountered: "));
    }

    public final zzZD1 zzXJH() throws IOException {
        if (!this.zzWFc || !this.zzWFb) {
            throw new IOException("getCerts() and/or getCrls() has not been called.");
        }
        if (this.zzWFd == null) {
            this.zzWFd = this.zzWFf.zzXKC();
        }
        return (zzZD1) this.zzWFd;
    }

    public final zzZD1 zzXJI() throws IOException {
        if (!this.zzWFc) {
            throw new IOException("getCerts() has not been called.");
        }
        this.zzWFb = true;
        if (this.zzWFd == null) {
            this.zzWFd = this.zzWFf.zzXKC();
        }
        Object obj = this.zzWFd;
        if (!(obj instanceof zzZCX) || ((zzZCX) obj).zzXKy() != 1) {
            return null;
        }
        zzZD1 zzzd1 = (zzZD1) ((zzZCX) this.zzWFd).zzYR(17, false);
        this.zzWFd = null;
        return zzzd1;
    }

    public final zzZD1 zzXJJ() throws IOException {
        this.zzWFc = true;
        zzZDK zzzdkZzXKC = this.zzWFf.zzXKC();
        this.zzWFd = zzzdkZzXKC;
        if (!(zzzdkZzXKC instanceof zzZCX) || ((zzZCX) zzzdkZzXKC).zzXKy() != 0) {
            return null;
        }
        zzZD1 zzzd1 = (zzZD1) ((zzZCX) this.zzWFd).zzYR(17, false);
        this.zzWFd = null;
        return zzzd1;
    }

    public final zzZAO zzXJK() throws IOException {
        return new zzZAO((zzZD3) this.zzWFf.zzXKC());
    }

    public final zzZD1 zzXJL() throws IOException {
        zzZDK zzzdkZzXKC = this.zzWFf.zzXKC();
        return zzzdkZzXKC instanceof zzZD2 ? ((zzZD2) zzzdkZzXKC).zzXKB() : (zzZD1) zzzdkZzXKC;
    }
}
