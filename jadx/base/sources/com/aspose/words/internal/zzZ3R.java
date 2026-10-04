package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3R extends zzZ3J<zzZ33> implements zzZ5S {
    private int zzWlA;
    private BigInteger zzWlw;
    private final AtomicBoolean zzWlx;

    public zzZ3R(zzZ5W zzz5w, zzZ2Y<zzZ33> zzz2y, BigInteger bigInteger) {
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
            zzZDK zzzdkZzXJ7 = zzz94.zzXJ7();
            if (zzzdkZzXJ7 instanceof zzZDD) {
                return zzZDD.zzYB(zzzdkZzXJ7).zzXKM();
            }
            byte[] bArrZzXL5 = zzZD9.zzYz(zzzdkZzXJ7).zzXL5();
            byte[] bArr = new byte[bArrZzXL5.length];
            for (int i = 0; i != bArrZzXL5.length; i++) {
                bArr[i] = bArrZzXL5[(bArrZzXL5.length - 1) - i];
            }
            return new BigInteger(1, bArr);
        } catch (IOException e) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("Unable to parse ECGOST3410 private key: ")), e);
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
        if (!(obj instanceof zzZ3R)) {
            return false;
        }
        zzZ3R zzz3r = (zzZ3R) obj;
        return !isDestroyed() && !zzz3r.isDestroyed() && this.zzWlw.equals(zzz3r.zzWlw) && zzXGz().equals(zzz3r.zzXGz());
    }

    public final void finalize() throws Throwable {
        destroy();
    }

    public final byte[] getEncoded() {
        byte[] bArr = new byte[32];
        zzZ(bArr, getS());
        if (zzXGz().zzXJw() == null) {
            return zzZ2X.zzY(new zzZ86(zzZAE.zzWEQ), new zzZC6(bArr));
        }
        return zzZ2X.zzY(new zzZ86(zzZAE.zzWEQ, new zzZA9(zzXGz().zzXJw(), zzXGz().zzXJv(), zzXGz().zzXJx())), new zzZC6(bArr));
    }

    public final BigInteger getS() {
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
    public final zzZ2Y<zzZ33> zzXGz() {
        zzZ2X.zzZ(this);
        return super.zzXGz();
    }

    public zzZ3R(zzZ5W zzz5w, zzZ94 zzz94) {
        super(zzz5w, zzZAE.zzWEQ, zzz94.zzXJ8());
        this.zzWlx = new AtomicBoolean(false);
        this.zzWlw = zzZ(zzz94);
        this.zzWlA = zzXGF();
    }

    private static void zzZ(byte[] bArr, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i = 0; i != 32; i++) {
            bArr[i] = byteArray[(byteArray.length - 1) - i];
        }
    }
}
