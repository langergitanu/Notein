package com.aspose.words.internal;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public class zzYN4 extends DHParameterSpec {

    /* JADX INFO: renamed from: f */
    private final zzZ37 f51242f;
    private final BigInteger zzWkO;
    private final BigInteger zzWl0;
    private final int zzWtq;

    public zzYN4(zzZ38 zzz38) {
        this(zzz38.getP(), zzz38.getQ(), zzz38.getG(), zzz38.zzXHB(), zzz38.getM(), zzz38.getL(), zzz38.zzXGq());
    }

    public final BigInteger getQ() {
        return this.zzWl0;
    }

    public final zzZ37 zzXGq() {
        return this.f51242f;
    }

    public final BigInteger zzXHB() {
        return this.zzWkO;
    }

    public zzYN4(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, null, bigInteger2, null, 0, null);
    }

    public zzYN4(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this(bigInteger, null, bigInteger2, null, i, null);
    }

    public zzYN4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, zzZ37 zzz37) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i, zzz37);
    }

    private zzYN4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, int i2, zzZ37 zzz37) {
        super(bigInteger, bigInteger3, i2);
        this.zzWl0 = bigInteger2;
        this.zzWkO = bigInteger4;
        this.zzWtq = i;
        this.f51242f = zzz37;
    }
}
