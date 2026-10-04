package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3I extends zzZ3J<zzZ2Z> implements zzZ5S {
    private int zzWlA;
    private BigInteger zzWlw;
    private final AtomicBoolean zzWlx;

    public zzZ3I(zzZ5W zzz5w, zzZ2Y<zzZ2Z> zzz2y, BigInteger bigInteger) {
        super(zzz5w, zzz2y);
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlw = bigInteger;
        this.zzWlA = zzXGF();
    }

    private int zzXGF() {
        return zzXGz().hashCode() + (this.zzWlw.hashCode() * 31);
    }

    private static BigInteger zzZ(zzZ94 zzz94) {
        try {
            byte[] bArrZzXL5 = zzZD9.zzYz(zzz94.zzXJ7()).zzXL5();
            byte[] bArr = new byte[bArrZzXL5.length];
            for (int i = 0; i != bArrZzXL5.length; i++) {
                bArr[i] = bArrZzXL5[(bArrZzXL5.length - 1) - i];
            }
            return new BigInteger(1, bArr);
        } catch (IOException e) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("Unable to parse DSA private key: ")), e);
        }
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
        zzZ3J.zzXGE();
        zzZ2X.checkPermission(zzYUM.zzVZy);
        if (this.zzWlx.getAndSet(true)) {
            return;
        }
        this.zzWlw = null;
        this.zzWlA = -1;
        zzXGG();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzZ3I)) {
            return false;
        }
        zzZ3I zzz3i = (zzZ3I) obj;
        return !isDestroyed() && !zzz3i.isDestroyed() && this.zzWlw.equals(zzz3i.zzWlw) && zzXGz().equals(zzz3i.zzXGz());
    }

    public final void finalize() throws Throwable {
        destroy();
    }

    public final byte[] getEncoded() {
        byte[] byteArray = getX().toByteArray();
        byte[] bArr = byteArray[0] == 0 ? new byte[byteArray.length - 1] : new byte[byteArray.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
        zzZ2Y<zzZ2Z> zzz2yZzXGz = zzXGz();
        return zzz2yZzXGz.zzXJx() != null ? zzZ2X.zzY(new zzZ86(zzZAE.zzWER, new zzZA9(zzz2yZzXGz.zzXJw(), zzz2yZzXGz.zzXJv(), zzz2yZzXGz.zzXJx())), new zzZC6(bArr)) : zzZ2X.zzY(new zzZ86(zzZAE.zzWER, new zzZA9(zzz2yZzXGz.zzXJw(), zzz2yZzXGz.zzXJv())), new zzZC6(bArr));
    }

    public final BigInteger getX() {
        zzZ2X.checkPermission(zzYUM.zzVZy);
        zzZ2X.zzZ(this);
        return this.zzWlw;
    }

    public final int hashCode() {
        return this.zzWlA;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return this.zzWlx.get();
    }

    @Override // com.aspose.words.internal.zzZ3J, com.aspose.words.internal.zzZ58
    public final zzZ5W zzXGV() {
        zzZ2X.zzZ(this);
        return super.zzXGV();
    }

    @Override // com.aspose.words.internal.zzZ3J
    public final zzZ2Y<zzZ2Z> zzXGz() {
        zzZ2X.zzZ(this);
        return super.zzXGz();
    }

    public zzZ3I(zzZ5W zzz5w, zzZ94 zzz94) {
        super(zzz5w, zzZAE.zzWER, zzz94.zzXJ8());
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlw = zzZ(zzz94);
        this.zzWlA = zzXGF();
    }
}
