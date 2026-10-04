package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public class zzYG2 extends SecureRandom {

    /* JADX INFO: renamed from: eX */
    private static BigInteger f50799eX = new BigInteger("01020304ffffffff0506070811111111", 16);

    /* JADX INFO: renamed from: eY */
    private static BigInteger f50800eY = new BigInteger("1111111105060708ffffffff01020304", 16);

    /* JADX INFO: renamed from: eZ */
    private static BigInteger f50801eZ = new BigInteger("3020104ffffffff05060708111111", 16);

    /* JADX INFO: renamed from: fa */
    private static final boolean f50802fa;

    /* JADX INFO: renamed from: fb */
    private static final boolean f50803fb;

    /* JADX INFO: renamed from: fc */
    private static final boolean f50804fc;

    /* JADX INFO: renamed from: fd */
    private byte[] f50805fd;

    /* JADX INFO: renamed from: fe */
    private int f50806fe;

    public static class zzV {
        byte[] data;

        public zzV(byte[] bArr) {
            this.data = bArr;
        }
    }

    public static class zzW extends SecureRandom {
        byte[] data;
        int index;

        public zzW() {
            super(null, new zzX());
            this.data = zzYGC.decode("01020304ffffffff0506070811111111");
            this.index = 0;
        }

        @Override // java.security.SecureRandom, java.util.Random
        public final void nextBytes(byte[] bArr) {
            System.arraycopy(this.data, this.index, bArr, 0, bArr.length);
            this.index += bArr.length;
        }
    }

    public static class zzX extends Provider {
        public zzX() {
            super("BCFIPS_FIXED_RNG", 1.0d, "BCFIPS Fixed Secure Random Provider");
        }
    }

    public static class zzY extends zzV {
        public zzY(byte[] bArr) {
            super(bArr);
        }
    }

    public static class zzZ extends zzV {
        public zzZ(byte[] bArr) {
            super(bArr);
        }

        public zzZ(byte[] bArr, byte b) {
            super(zzYG2.zzQ(2048, bArr));
        }

        public zzZ(String str) {
            this(zzYGC.decode(str));
        }
    }

    static {
        BigInteger bigInteger = new BigInteger(128, new zzW());
        BigInteger bigInteger2 = new BigInteger(120, new zzW());
        f50802fa = bigInteger.equals(f50800eY);
        f50804fc = bigInteger.equals(f50799eX);
        f50803fb = bigInteger2.equals(f50801eZ);
    }

    public zzYG2(zzV... zzvArr) {
        super(null, new zzX());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        if (!f50804fc) {
            if (!f50802fa) {
                throw new IllegalStateException("Unrecognized BigInteger implementation");
            }
            for (int i2 = 0; i2 != zzvArr.length; i2++) {
                try {
                    zzV zzv = zzvArr[i2];
                    if (zzv instanceof zzZ) {
                        byte[] bArr = zzv.data;
                        int length = bArr.length - (bArr.length % 4);
                        int i3 = 0;
                        while (i3 < length) {
                            i3 += 4;
                            byteArrayOutputStream.write(bArr, bArr.length - i3, 4);
                        }
                        if (bArr.length - length != 0) {
                            for (int i4 = 0; i4 != 4 - (bArr.length - length); i4++) {
                                byteArrayOutputStream.write(0);
                            }
                        }
                        for (int i5 = 0; i5 != bArr.length - length; i5++) {
                            byteArrayOutputStream.write(bArr[length + i5]);
                        }
                    } else {
                        byteArrayOutputStream.write(zzv.data);
                    }
                } catch (IOException unused) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        } else if (f50803fb) {
            while (i != zzvArr.length) {
                try {
                    zzV zzv2 = zzvArr[i];
                    if (zzv2 instanceof zzZ) {
                        byte[] bArr2 = zzv2.data;
                        int length2 = bArr2.length - (bArr2.length % 4);
                        for (int length3 = (bArr2.length - length2) - 1; length3 >= 0; length3--) {
                            byteArrayOutputStream.write(bArr2[length3]);
                        }
                        for (int length4 = bArr2.length - length2; length4 < bArr2.length; length4 += 4) {
                            byteArrayOutputStream.write(bArr2, length4, 4);
                        }
                    } else {
                        byteArrayOutputStream.write(zzv2.data);
                    }
                    i++;
                } catch (IOException unused2) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        } else {
            while (i != zzvArr.length) {
                try {
                    byteArrayOutputStream.write(zzvArr[i].data);
                    i++;
                } catch (IOException unused3) {
                    throw new IllegalArgumentException("can't save value source.");
                }
            }
        }
        this.f50805fd = byteArrayOutputStream.toByteArray();
    }

    public static /* synthetic */ byte[] zzQ(int i, byte[] bArr) {
        return zzR(2048, bArr);
    }

    private static byte[] zzR(int i, byte[] bArr) {
        int i2;
        int i3;
        int i4 = (i + 7) / 8;
        if (i4 <= bArr.length) {
            if (!f50802fa || i >= bArr.length * 8 || (i2 = i % 32) == 0) {
                return bArr;
            }
            int i5 = ((i + 31) / 32) * 4;
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, i5 - bArr.length, bArr.length);
            zzYGN.zzN(zzYGN.zzZN(bArr2, 0) << (32 - i2), bArr2, 0);
            return bArr2;
        }
        byte[] bArr3 = new byte[i4];
        System.arraycopy(bArr, 0, bArr3, i4 - bArr.length, bArr.length);
        if (!f50802fa || (i3 = i % 32) == 0) {
            return bArr3;
        }
        int i6 = ((i + 31) / 32) * 4;
        byte[] bArr4 = new byte[i6];
        System.arraycopy(bArr, 0, bArr4, i6 - bArr.length, bArr.length);
        zzYGN.zzN(zzYGN.zzZN(bArr4, 0) << (32 - i3), bArr4, 0);
        return bArr4;
    }

    private int zzXyi() {
        byte[] bArr = this.f50805fd;
        int i = this.f50806fe;
        this.f50806fe = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        byte[] bArr = new byte[i];
        nextBytes(bArr);
        return bArr;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this.f50805fd, this.f50806fe, bArr, 0, bArr.length);
        this.f50806fe += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        return (zzXyi() << 24) | (zzXyi() << 16) | (zzXyi() << 8) | zzXyi();
    }

    @Override // java.util.Random
    public long nextLong() {
        return (((long) zzXyi()) << 56) | (((long) zzXyi()) << 48) | (((long) zzXyi()) << 40) | (((long) zzXyi()) << 32) | (((long) zzXyi()) << 24) | (((long) zzXyi()) << 16) | (((long) zzXyi()) << 8) | ((long) zzXyi());
    }
}
