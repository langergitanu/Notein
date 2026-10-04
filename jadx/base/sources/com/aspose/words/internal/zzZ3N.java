package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3N extends zzZ3P implements zzZ5R {
    private final zzYLX zzWlk;

    public zzZ3N(zzZ5W zzz5w, zzZ33 zzz33, zzYLX zzylx) {
        super(zzz5w, zzz33);
        this.zzWlk = zzZ2X.zzZ(zzXGy().zzXHv(), zzylx);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3N)) {
            return false;
        }
        zzZ3N zzz3n = (zzZ3N) obj;
        if (this.zzWlk.zzU(zzz3n.zzWlk)) {
            return zzXGy().equals(zzz3n.zzXGy());
        }
        return false;
    }

    public final byte[] getEncoded() {
        return zzZ2X.zzZ(new zzZ7D(new zzZ86(zzZ6W.zzWoc, zzZ2X.zzX(zzXGy())), zzZD9.zzYz(new zzZ70(this.zzWlk).zzXL0()).zzXL5()));
    }

    public final int hashCode() {
        return zzXGy().hashCode() + (this.zzWlk.hashCode() * 31);
    }

    public final zzYLX zzXGA() {
        return this.zzWlk;
    }

    public zzZ3N(zzZ5W zzz5w, zzZ7D zzz7d) {
        super(zzz5w, zzz7d.zzXHJ());
        this.zzWlk = zzZ2X.zzY(zzXGy().zzXHv(), zzz7d.zzXHH().getBytes());
    }
}
