package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYZ2 {
    public static final zzW zzW9a;
    private static final zzZ zzW9b;
    public static final zzYXR zzWb4;

    public static final class zzX extends zzYX2<zzW> {
        private static zzYUE zzZ(boolean z, zzZ46 zzz46, zzW zzw) {
            zzYUE zzyueZzXFZ = zzYZ2.zzW9b.zzXFZ();
            zzYS8 zzys8ZzZ = zzYVO.zzZ(zzYZ2.zzZ(zzz46, zzw.zzXGV()));
            byte[] bArr = zzw.f51276iv;
            if (bArr == null || bArr.length != 12) {
                throw new IllegalArgumentException("IV must be 12 bytes long");
            }
            zzyueZzXFZ.zzZ(z, new zzYS4(zzys8ZzZ, bArr));
            return zzyueZzXFZ;
        }

        @Override // com.aspose.words.internal.zzYX2
        public final /* synthetic */ zzYUE zzY(boolean z, zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(z, zzz46, (zzW) zzz4m);
        }
    }

    public static final class zzY extends zzYX4 {
        private final zzYXR zzWb0;
        private final SecureRandom zzWk5;

        public zzY(SecureRandom secureRandom) {
            this(zzYZ2.zzWb4, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, 256));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }

        private zzY(zzYXR zzyxr, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            this.zzWk5 = secureRandom;
        }
    }

    public static final class zzZ implements zzYUV<zzYUE> {
        static final byte[] zzWiG = zzYGC.decode("00112233445566778899aabbccddeeff");
        static final byte[] zzWiF = zzYGC.decode("39ec094e9d907f1d0524a9cc7401a4b6");

        /* JADX INFO: renamed from: iv */
        static final byte[] f51282iv = zzYGC.decode("000000000000000000000000");
        static final byte[] key = zzYGC.decode("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f");

        private zzZ() {
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXDN, reason: merged with bridge method [inline-methods] */
        public final zzYUE zzXFZ() {
            return (zzYUE) zzYVZ.zzZ(zzYZ2.zzWb4, new zzYZ1(), new zzYVN<zzYZ1>() { // from class: com.aspose.words.internal.zzYZ2.zzZ.1
                private static void zzZ(zzYZ1 zzyz1) {
                    byte[] bArr = zzZ.zzWiG;
                    byte[] bArr2 = new byte[bArr.length];
                    byte[] bArr3 = zzZ.key;
                    zzYS7 zzys7 = new zzYS7(bArr3);
                    byte[] bArr4 = zzZ.f51282iv;
                    zzyz1.zzZ(true, new zzYS4(zzys7, bArr4));
                    zzyz1.zzY(bArr, 0, bArr.length, bArr2, 0);
                    byte[] bArr5 = zzZ.zzWiF;
                    if (!zzYGU.zzp(bArr5, bArr2)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzyz1.zzZ(false, new zzYS4(new zzYS7(bArr3), bArr4));
                    zzyz1.zzY(bArr5, 0, bArr5.length, bArr2, 0);
                    if (zzYGU.zzp(bArr, bArr2)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYZ1 zzyz1) throws Exception {
                    zzZ(zzyz1);
                }
            });
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("ChaCha20");
        zzWb4 = zzyxr;
        zzZ zzz = new zzZ((byte) 0);
        zzz.zzXFZ();
        zzW9b = zzz;
        zzW9a = new zzW(zzyxr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzfw(zzyudZzZ.zzXEo())) {
            throw new zzZ5E("ChaCha20 key must be 256 bits");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return zzyudZzZ;
    }

    private static boolean zzfw(int i) {
        return i != 256;
    }

    public static final class zzW extends zzYXN<zzW> {
        private zzW(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 12, bArr);
            if (bArr != null && bArr.length != 12) {
                throw new IllegalArgumentException("IV must be 12 bytes long");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYXN, com.aspose.words.internal.zzZ4L
        /* JADX INFO: renamed from: zzL, reason: merged with bridge method [inline-methods] */
        public zzW zzW(SecureRandom secureRandom) {
            byte[] bArr = new byte[12];
            secureRandom.nextBytes(bArr);
            return zzT(zzXGV(), bArr);
        }

        private static zzW zzT(zzYXR zzyxr, byte[] bArr) {
            return new zzW(zzyxr, bArr);
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzT(zzyxr, bArr);
        }

        public zzW(zzYXR zzyxr) {
            this(zzyxr, null);
        }
    }
}
