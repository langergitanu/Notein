package com.aspose.words.internal;

import com.aspose.words.internal.zzYY5;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3B extends zzZ3C implements zzZ5S, Destroyable {
    private int zzWlA;
    private byte[] zzWlh;
    private boolean zzWli;
    private final byte[] zzWlj;
    private final AtomicBoolean zzWlx;
    private zzZD2 zzWwm;

    public zzZ3B(zzZ5W zzz5w, byte[] bArr, byte[] bArr2) {
        super(zzz5w);
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlj = zzYGU.zzVI(bArr);
        this.zzWlA = zzXGF();
        this.zzWwm = null;
        if (bArr2 == null) {
            this.zzWli = false;
            this.zzWlh = zzYY5.zzZ(zzz5w, bArr);
        } else {
            this.zzWli = true;
            this.zzWlh = zzYGU.zzVI(bArr2);
        }
    }

    private int zzXGF() {
        return zzYGU.hashCode(this.zzWlj) + (zzXGV().hashCode() * 31);
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        zzXGE();
        if (this.zzWlx.getAndSet(true)) {
            return;
        }
        zzYGU.zzWa(this.zzWlj);
        byte[] bArr = this.zzWlh;
        if (bArr != null) {
            zzYGU.zzWa(bArr);
        }
        this.zzWlh = null;
        this.zzWli = false;
        this.zzWwm = null;
        this.zzWlA = -1;
    }

    public final boolean equals(Object obj) {
        zzXGE();
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3B)) {
            return false;
        }
        zzZ3B zzz3b = (zzZ3B) obj;
        if (isDestroyed() || zzz3b.isDestroyed() || !zzYGU.zzp(this.zzWlj, zzz3b.zzWlj)) {
            return false;
        }
        return zzXGV().equals(zzz3b.zzXGV());
    }

    public final void finalize() throws Throwable {
        destroy();
    }

    public final byte[] getEncoded() {
        zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        zzZ2X.zzZ(this);
        byte[] bArr = this.zzWli ? this.zzWlh : null;
        return zzXGV().equals(zzYY5.zzZ.zzW7t) ? zzZ2X.zzZ(new zzZ86(zzZA7.zzWDU), new zzZC6(this.zzWlj), this.zzWwm, bArr) : zzZ2X.zzZ(new zzZ86(zzZA7.zzWDV), new zzZC6(this.zzWlj), this.zzWwm, bArr);
    }

    public final int hashCode() {
        zzXGE();
        return this.zzWlA;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        zzXGE();
        return this.zzWlx.get();
    }

    public final byte[] zzXGL() {
        zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        zzZ2X.zzZ(this);
        return zzYGU.zzVI(this.zzWlj);
    }

    public final byte[] zzXGx() {
        zzZ2X.zzZ(this);
        return zzYGU.zzVI(this.zzWlh);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzZ3B(zzZ94 zzz94) throws IOException {
        zzZDA zzzda = zzZA7.zzWDU;
        super(zzzda.equals(zzz94.zzXJ8().zzXJk()) ? zzYY5.zzZ.zzW7t : zzYY5.zzZ.zzW7s);
        this.zzWlx = new AtomicBoolean(false);
        byte[] bArrZzVI = zzYGU.zzVI(zzZD9.zzYz(zzz94.zzXJ7()).zzXL5());
        this.zzWlj = bArrZzVI;
        if (zzz94.zzXJ6()) {
            this.zzWli = true;
            this.zzWlh = zzYGU.zzVI(zzz94.zzXJ5().zzXL5());
        } else {
            this.zzWlh = null;
        }
        if (zzzda.equals(zzz94.zzXJ8().zzXJk())) {
            if (bArrZzVI.length != 56) {
                throw new IllegalArgumentException("raw key data incorrect size");
            }
        } else if (bArrZzVI.length != 32) {
            throw new IllegalArgumentException("raw key data incorrect size");
        }
        this.zzWwm = zzz94.zzXJ9();
        this.zzWlA = zzXGF();
    }
}
