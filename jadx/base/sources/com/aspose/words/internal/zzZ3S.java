package com.aspose.words.internal;

import com.aspose.words.internal.zzYM1;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3S extends zzZ3U implements zzZ5R {
    private zzYLX zzWln;

    public zzZ3S(zzZ5W zzz5w, zzZ34 zzz34, zzYLX zzylx) {
        super(zzz5w, zzz34);
        this.zzWln = zzZ2X.zzZ(zzXGB().zzXGy().zzXHv(), zzylx);
    }

    private static zzYLX zzZ(zzZ34 zzz34, zzZ7D zzz7d) {
        try {
            byte[] bArrZzXL5 = zzZD9.zzYz(zzz7d.zzXHI()).zzXL5();
            if (zzz7d.zzXHJ().zzXJk().equals(zzZ8G.zzWta)) {
                zzZ3U.zzXf(bArrZzXL5);
            }
            return zzZ8H.zzZ(zzz34.zzXGy().zzXHv(), bArrZzXL5);
        } catch (IOException unused) {
            throw new IllegalArgumentException("Invalid info structure in DSTU4145 public key");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzZ3S) {
            zzZ3S zzz3s = (zzZ3S) obj;
            if (this.zzWln.zzU(zzz3s.zzWln) && zzXGB().equals(zzz3s.zzXGB())) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getEncoded() {
        if (this.zzWlq != null) {
            byte[] bArrZzZ = zzZ8H.zzZ(this.zzWln);
            if (this.zzWlq.zzXJk().equals(zzZ8G.zzWta)) {
                zzZ3U.zzXf(bArrZzZ);
            }
            return zzZ2X.zzZ(this.zzWlq, new zzZC6(bArrZzZ));
        }
        zzZ34 zzz34ZzXGB = zzXGB();
        if (zzz34ZzXGB.zzXGy() instanceof zzZ2W) {
            return zzZ2X.zzZ(new zzZ86(zzZ8G.zzWt9, new zzZ8I(((zzZ2W) zzz34ZzXGB.zzXGy()).zzXGj(), zzz34ZzXGB.zzXIw())), new zzZC6(zzZ8H.zzZ(this.zzWln)));
        }
        if (!(zzz34ZzXGB.zzXGy().zzXHv() instanceof zzYM1.zzZ)) {
            throw new IllegalArgumentException("Unable to encode binary parameters");
        }
        return zzZ2X.zzZ(new zzZ86(zzZ8G.zzWt9, new zzZ8I(new zzZ8K(zzz34ZzXGB.zzXGy()))), new zzZC6(zzZ8H.zzZ(this.zzWln)));
    }

    public final int hashCode() {
        return zzXGB().hashCode() + (this.zzWln.hashCode() * 31);
    }

    public final zzYLX zzXGA() {
        return this.zzWln;
    }

    public zzZ3S(zzZ5W zzz5w, zzZ7D zzz7d) {
        super(zzz5w, zzz7d.zzXHJ());
        zzZ34 zzz34ZzXGB = zzXGB();
        this.zzWln = zzZ2X.zzZ(zzz34ZzXGB.zzXGy().zzXHv(), zzZ(zzz34ZzXGB, zzz7d));
    }
}
