package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYWL {
    public static final zzZ zzW4I;
    public static final zzZ zzW4J;
    public static final zzZ zzW4K;
    public static final zzZ zzW4L;
    public static final zzZ zzW4M;
    public static final zzZ zzW4N;
    private static final zzYUV zzW4O;
    private static final zzYUV zzW4P;
    private static final zzYUV zzW4Q;
    private static final zzYUV zzW4R;
    private static final zzYUV zzW4S;
    public static final zzYXR zzWb4;
    private static final zzYUV zzWhb;

    public static final class zzV implements zzYUV<zzYUR> {
        private final zzYV8 zzW4F;
        private final byte[] zzWiF;
        private static final byte[] zzWiG = zzYGC.decode("00112233445566778899aabbccddeeff");

        /* JADX INFO: renamed from: iv */
        private static final byte[] f51273iv = zzYGC.decode("000102030405060708090a0b0c0d0e0f");
        private static final byte[] key = zzYGC.decode("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f");

        public zzV(zzYV8 zzyv8, byte[] bArr) {
            this.zzW4F = zzyv8;
            this.zzWiF = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
        public zzYUR zzXFZ() {
            return (zzYUR) zzYVZ.zzZ(zzYWL.zzWb4, new zzYWK(this.zzW4F), new zzYVN<zzYWK>() { // from class: com.aspose.words.internal.zzYWL.zzV.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.aspose.words.internal.zzYVN
                /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
                public void zzWN(zzYWK zzywk) {
                    byte[] bArr = new byte[zzywk.zzXDn()];
                    zzywk.zzZ(new zzYS4(new zzYS7(zzV.key), zzV.f51273iv));
                    zzywk.update(zzV.zzWiG, 0, zzV.zzWiG.length);
                    zzywk.doFinal(bArr, 0);
                    if (zzYGU.zzp(zzV.this.zzWiF, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on encryption");
                }
            });
        }
    }

    public static final class zzW implements zzYUV<zzYUR> {
        static final byte[] zzWiG = zzYGC.decode("00112233445566778899aabbccddeeff");
        static final byte[] zzWiF = zzYGC.decode("ef9e732a7f2df185a71180ae583a0f93");
        static final byte[] key = zzYGC.decode("000102030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f");

        private zzW() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXG0, reason: merged with bridge method [inline-methods] */
        public zzYUR zzXFZ() {
            return (zzYUR) zzYVZ.zzZ(zzYWL.zzWb4, new zzYWK(), new zzYVN<zzYWK>() { // from class: com.aspose.words.internal.zzYWL.zzW.1
                private static void zzZ(zzYWK zzywk) {
                    byte[] bArr = new byte[zzywk.zzXDn()];
                    zzywk.zzZ(new zzYS7(zzW.key));
                    byte[] bArr2 = zzW.zzWiG;
                    zzywk.update(bArr2, 0, bArr2.length);
                    zzywk.doFinal(bArr, 0);
                    if (zzYGU.zzp(zzW.zzWiF, bArr)) {
                        return;
                    }
                    zzYVN.zzTQ("Failed self test on encryption");
                }

                @Override // com.aspose.words.internal.zzYVN
                public final /* synthetic */ void zzWN(zzYWK zzywk) throws Exception {
                    zzZ(zzywk);
                }
            });
        }

        public /* synthetic */ zzW(byte b) {
            this();
        }
    }

    public static final class zzX extends zzYX9<zzZ> {
        private static zzYUR zzZ(zzZ46 zzz46, zzZ zzz) {
            zzYUR zzyur = (zzYUR) zzz.zzWfZ.zzXFZ();
            if (!zzz.zzW4H) {
                zzyur.zzZ(new zzYS7(zzYWL.zzZ(zzz46, zzz.zzXGV()).zzXK4()));
                return zzyur;
            }
            if (zzz.f51276iv == null) {
                throw new IllegalArgumentException("Poly1305 requires a 128 bit IV when used with a block cipher");
            }
            zzyur.zzZ(new zzYS4(new zzYS7(zzYWL.zzZ(zzz46, zzz.zzXGV()).zzXK4()), zzz.f51276iv));
            return zzyur;
        }

        @Override // com.aspose.words.internal.zzYX9
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzZ(zzz46, (zzZ) zzz5q);
        }
    }

    public static final class zzY extends zzYX4 {
        private final zzYXR zzWb0;
        private final SecureRandom zzWk5;

        public zzY(SecureRandom secureRandom) {
            this(zzYWL.zzWb4, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYWJ zzywj = new zzYWJ();
            zzywj.zzZ(new zzYUS(this.zzWk5, 256));
            return new zzZ43(this.zzWb0, zzywj.zzXG8());
        }

        private zzY(zzYXR zzyxr, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            this.zzWk5 = secureRandom;
        }
    }

    public static final class zzZ extends zzYXQ<zzZ> {
        private final boolean zzW4H;
        private final zzYUV zzWfZ;

        private zzZ(zzYXR zzyxr, boolean z, byte[] bArr, int i, zzYUV zzyuv) {
            super(zzyxr, 16, bArr, i);
            this.zzW4H = z;
            this.zzWfZ = zzyuv;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYXQ
        /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] */
        public zzZ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzZ(zzyxr, this.zzW4H, bArr, i, this.zzWfZ);
        }

        public zzZ(zzYXR zzyxr) {
            this(zzyxr, false, null, 128, zzYWL.zzWhb);
        }

        public zzZ(zzYXR zzyxr, zzYUV zzyuv) {
            this(zzyxr, true, null, 128, zzyuv);
        }
    }

    static {
        zzYXR zzyxr = new zzYXR("Poly1305");
        zzWb4 = zzyxr;
        zzW zzw = new zzW((byte) 0);
        zzw.zzXFZ();
        zzWhb = zzw;
        zzV zzv = new zzV((zzYV8) zzYXY.zzS(zzZ1T.zzWjd).zzXFZ(), zzYGC.decode("7be23689db44d57e92ebc8a8a3889cec"));
        zzW4S = zzv;
        zzV zzv2 = new zzV(new zzYZ3(), zzYGC.decode("05dfbf3c18010cc02d1eec23798b62f7"));
        zzW4R = zzv2;
        zzV zzv3 = new zzV(new zzYW3(), zzYGC.decode("b916a6635980a54822304a84cf8e5cfd"));
        zzW4Q = zzv3;
        zzV zzv4 = new zzV(new zzYVX(), zzYGC.decode("f7c50b5c4eed1fbb6595fa04a36b33a0"));
        zzW4P = zzv4;
        zzV zzv5 = new zzV(new zzYVP(), zzYGC.decode("63c7226bf5344b102fd1906d7b20dc1c"));
        zzW4O = zzv5;
        zzW4N = new zzZ(zzyxr);
        zzW4M = new zzZ(zzyxr, zzv);
        zzW4L = new zzZ(zzyxr, zzv2);
        zzW4K = new zzZ(zzyxr, zzv3);
        zzW4J = new zzZ(zzyxr, zzv4);
        zzW4I = new zzZ(zzyxr, zzv5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzfw(zzyudZzZ.zzXEo())) {
            throw new zzZ5E("Poly1305 key must be 256 bits");
        }
        zzYVO.zzZ(zzyudZzZ, zzWb4, zzz5w);
        return zzyudZzZ;
    }

    private static boolean zzfw(int i) {
        return i != 256;
    }
}
