package oOO000oO;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: renamed from: oOO000oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34333OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final BigInteger f123261OooO00o = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final BigInteger f123262OooO0O0 = BigInteger.valueOf(1);

    static {
        BigInteger.valueOf(2L);
        BigInteger.valueOf(3L);
        new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
        BigInteger.valueOf(743L).bitLength();
    }

    public static BigInteger OooO00o(int i, SecureRandom secureRandom) {
        if (i < 1) {
            throw new IllegalArgumentException("bitLength must be at least 1");
        }
        int i2 = (i + 7) / 8;
        byte[] bArr = new byte[i2];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i2 * 8) - i))));
        return new BigInteger(1, bArr);
    }
}
