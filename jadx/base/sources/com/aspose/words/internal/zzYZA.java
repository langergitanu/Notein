package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYZA {
    private static final zzZ zzWb2;
    public static final zzYXR zzWb4 = new zzYXR("ARC4");
    public static final zzW zzWb3 = new zzW();

    public static final class zzW extends zzYXO {
        public zzW() {
            super(zzYZA.zzWb4);
        }
    }

    public static final class zzX extends zzYX2<zzW> {
        private static zzYUE zzZ(boolean z, zzZ46 zzz46, zzW zzw) {
            zzYZ9 zzyz9ZzXFZ = zzYZA.zzWb2.zzXFZ();
            zzyz9ZzXFZ.zzZ(z, zzYVO.zzZ(zzYZA.zzZ(zzz46, zzw.zzXGV())));
            return zzyz9ZzXFZ;
        }

        @Override // com.aspose.words.internal.zzYX2
        public final /* synthetic */ zzYUE zzY(boolean z, zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(z, zzz46, (zzW) zzz4m);
        }
    }

    public static final class zzY extends zzYX4 {
        private final zzYXR zzWb0 = zzYZA.zzWb4;
        private final int zzWiC;
        private final SecureRandom zzWk5;

        public zzY(int i, SecureRandom secureRandom) {
            if (zzYZA.zzfw(i)) {
                throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "Attempt to create key with invalid key size [", "]: RC4"));
            }
            this.zzWiC = i;
            this.zzWk5 = secureRandom;
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, this.zzWiC));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }
    }

    public static final class zzZ implements zzYUV<zzYZ9> {
        private zzZ() {
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXDU, reason: merged with bridge method [inline-methods] */
        public final zzYZ9 zzXFZ() {
            return (zzYZ9) zzYVZ.zzZ(zzYZA.zzWb4, new zzYZ9(), new zzYVN<zzYZ9>() { // from class: com.aspose.words.internal.zzYZA.zzZ.1
                private static void zzZ(zzYZ9 zzyz9) {
                    byte[] bArrDecode = zzYGC.decode("00112233445566778899aabbccddeeff");
                    byte[] bArrDecode2 = zzYGC.decode("1035d3faeefacf4afea5343bc4e8876c");
                    int length = bArrDecode.length;
                    byte[] bArr = new byte[length];
                    zzYS7 zzys7 = new zzYS7(zzYGC.decode("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f"));
                    zzyz9.zzZ(true, zzys7);
                    zzyz9.zzY(bArrDecode, 0, bArrDecode.length, bArr, 0);
                    if (!zzYGU.zzp(bArrDecode2, bArr)) {
                        zzYVN.zzTQ("Failed self test on encryption");
                    }
                    zzyz9.zzZ(false, zzys7);
                    zzyz9.zzY(bArr, 0, length, bArr, 0);
                    if (zzYGU.zzp(bArrDecode, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on decryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYZ9 zzyz9) throws Exception {
                    zzZ(zzyz9);
                }
            });
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    static {
        zzZ zzz = new zzZ((byte) 0);
        zzz.zzXFZ();
        zzWb2 = zzz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzfw(zzyudZzZ.zzXEo())) {
            throw new zzZ5E("Key the wrong size for ARC4");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return zzyudZzZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzfw(int i) {
        return i < 40 || i > 2048;
    }
}
