package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYVR {
    public static final zzU zzW0E;
    public static final zzU zzW0F;
    public static final zzY zzW0G;
    public static final zzU zzW0H;
    public static final zzY zzW0I;
    public static final zzY zzW0J;
    public static final zzY zzW0K;
    public static final zzZ5W zzWb9;

    public static final class zzU extends zzYXN<zzU> {
        private zzU(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 8, zzyxr.zz5(bArr, 8));
        }

        private static zzU zzN(zzYXR zzyxr, byte[] bArr) {
            return new zzU(zzyxr, bArr);
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzN(zzyxr, bArr);
        }

        public zzU(zzYXR zzyxr) {
            this(zzyxr, null);
        }
    }

    public static final class zzV extends zzYX3<zzU> {
        private static zzYV5 zzY(boolean z, zzZ46 zzz46, zzU zzu, SecureRandom secureRandom) {
            return zzYYZ.zzZ(z, zzYVR.zzZ(zzz46, zzu.zzXGV()), (zzYUV<zzYV8>) zzYXY.zzS(zzZ0I.zzWjd), zzu, secureRandom);
        }

        @Override // com.aspose.words.internal.zzYX3
        public final /* synthetic */ zzYV5 zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzY(z, zzz46, (zzU) zzz4m, secureRandom);
        }
    }

    public static final class zzW extends zzYX9<zzY> {
        private static zzYUR zzZ(zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(zzYVR.zzZ(zzz46, zzy.zzXGV()), (zzYUV<zzYV8>) zzYXY.zzS(zzZ0I.zzWjd), zzy);
        }

        @Override // com.aspose.words.internal.zzYX9
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzZ(zzz46, (zzY) zzz5q);
        }
    }

    public static final class zzX extends zzYXA<zzU, zzZ46> {
        @Override // com.aspose.words.internal.zzYXA
        public final /* bridge */ /* synthetic */ zzYUC zzZ(boolean z, zzZ58 zzz58, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(z, (zzZ46) zzz58, (zzU) zzz4m, secureRandom);
        }

        private static zzYUC zzZ(boolean z, zzZ46 zzz46, zzU zzu, SecureRandom secureRandom) {
            return zzYYZ.zzY(z, zzYVR.zzZ(zzz46, zzu.zzXGV()), zzYXY.zzS(zzZ0I.zzWjd), zzu, secureRandom);
        }
    }

    public static final class zzY extends zzYXQ<zzY> {
        private zzY(zzYXR zzyxr, byte[] bArr, int i) {
            super(zzyxr, 8, bArr, i);
        }

        private static zzY zzM(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i);
        }

        @Override // com.aspose.words.internal.zzYXQ
        public final /* synthetic */ zzYXQ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return zzM(zzyxr, bArr, i);
        }

        public zzY(zzYXR zzyxr) {
            this(zzyxr, null, zzYVO.zzY(zzyxr, 64));
        }
    }

    public static final class zzZ extends zzYXE<zzY> {
        @Override // com.aspose.words.internal.zzYXE
        public final /* bridge */ /* synthetic */ zzYTS zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(z, zzz46, (zzY) zzz4m);
        }

        private static zzYTS zzZ(boolean z, zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(z, zzYVR.zzZ(zzz46, zzy.zzXGV()), (zzYUV<zzYV8>) zzYXY.zzS(zzZ0I.zzWjd), zzy);
        }
    }

    static {
        zzZ1P zzz1p = zzZ0I.zzWjd;
        zzWb9 = zzz1p;
        String name = zzz1p.getName();
        zzYWU zzywu = zzYWU.CBCMAC;
        zzW0K = new zzY(new zzYXR(name, zzywu));
        zzW0J = new zzY(new zzYXR(zzz1p.getName(), zzywu, zzYWM.ISO7816_4));
        zzW0I = new zzY(new zzYXR(zzz1p.getName(), zzYWU.CFB8MAC));
        zzW0H = new zzU(new zzYXR(zzz1p.getName(), zzYWU.OpenPGPCFB));
        zzW0G = new zzY(new zzYXR(zzz1p.getName(), zzYWU.EAX));
        zzW0F = new zzU(new zzYXR(zzz1p.getName(), zzYWU.RFC3217_WRAP));
        zzW0E = new zzU(new zzYXR(zzz1p.getName(), zzYWU.RFC3211_WRAP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        zzff(zzyudZzZ.zzXEo());
        zzYVO.zzZ(zzyudZzZ, zzZ0I.zzWjd, zzz5w);
        return zzyudZzZ;
    }

    private static void zzff(int i) {
        if (i != 112 && i != 168 && i != 128 && i != 192) {
            throw new zzZ5E("DESEDE key must be of length 128 or 192 bits");
        }
    }
}
