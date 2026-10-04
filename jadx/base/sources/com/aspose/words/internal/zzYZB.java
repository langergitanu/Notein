package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYZB {
    public static final zzU zzWb5;
    public static final zzY zzWb6;
    public static final zzY zzWb7;
    public static final zzV zzWb8;
    public static final zzZ5W zzWb9;

    public static final class zzU extends zzYXN<zzU> {
        public zzU(zzYXR zzyxr) {
            this(zzyxr, null);
        }

        private static zzU zzX(zzYXR zzyxr, byte[] bArr) {
            return new zzU(zzyxr, bArr);
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzX(zzyxr, bArr);
        }

        private zzU(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 16, bArr);
            ((zzYWU) zzyxr.zzXFS()).zz5(bArr, 16);
        }
    }

    public static final class zzV extends zzYXN<zzV> {
        public zzV(zzYXR zzyxr) {
            this(zzyxr, null);
        }

        private static zzV zzZ(zzYXR zzyxr, byte[] bArr) {
            return new zzV(zzyxr, bArr);
        }

        @Override // com.aspose.words.internal.zzYXN
        public final /* synthetic */ zzYXO zzY(zzYXR zzyxr, byte[] bArr) {
            return zzZ(zzyxr, bArr);
        }

        private zzV(zzYXR zzyxr, byte[] bArr) {
            super(zzyxr, 16, bArr);
            ((zzYWU) zzyxr.zzXFS()).zz5(bArr, 16);
        }
    }

    public static final class zzW extends zzYX3<zzV> {
        @Override // com.aspose.words.internal.zzYX3
        public final /* bridge */ /* synthetic */ zzYV5 zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(z, zzz46, (zzV) zzz4m, secureRandom);
        }

        private static zzYV5 zzZ(boolean z, zzZ46 zzz46, zzV zzv, SecureRandom secureRandom) {
            return zzYYZ.zzZ(z, zzYZB.zzZ(zzz46, zzv.zzXGV()), (zzYUV<zzYV8>) zzYXY.zzS(zzZ1T.zzWjd), zzv, secureRandom);
        }
    }

    public static final class zzX extends zzYXA<zzU, zzZ46> {
        @Override // com.aspose.words.internal.zzYXA
        public final /* bridge */ /* synthetic */ zzYUC zzZ(boolean z, zzZ58 zzz58, zzZ4M zzz4m, SecureRandom secureRandom) {
            return zzZ(z, (zzZ46) zzz58, (zzU) zzz4m, secureRandom);
        }

        private static zzYUC zzZ(boolean z, zzZ46 zzz46, zzU zzu, SecureRandom secureRandom) {
            return zzYYZ.zzY(z, zzYZB.zzZ(zzz46, zzu.zzXGV()), zzYXY.zzS(zzZ1T.zzWjd), zzu, secureRandom);
        }
    }

    public static final class zzY extends zzYXQ<zzY> {
        private zzY(zzYXR zzyxr, byte[] bArr, int i) {
            super(zzyxr, 16, bArr, i);
        }

        private static zzY zzZ(zzYXR zzyxr, byte[] bArr, int i) {
            return new zzY(zzyxr, bArr, i);
        }

        @Override // com.aspose.words.internal.zzYXQ
        public final /* synthetic */ zzYXQ zzY(zzYXR zzyxr, byte[] bArr, int i) {
            return zzZ(zzyxr, bArr, i);
        }

        public zzY(zzYXR zzyxr) {
            this(zzyxr, null, zzYVO.zzY(zzyxr, 128));
        }
    }

    public static final class zzZ extends zzYXE<zzY> {
        @Override // com.aspose.words.internal.zzYXE
        public final /* bridge */ /* synthetic */ zzYTS zzZ(boolean z, zzZ46 zzz46, zzZ4M zzz4m) {
            return zzZ(z, zzz46, (zzY) zzz4m);
        }

        private static zzYTS zzZ(boolean z, zzZ46 zzz46, zzY zzy) {
            return zzYYZ.zzZ(z, zzYZB.zzZ(zzz46, zzy.zzXGV()), (zzYUV<zzYV8>) zzYXY.zzS(zzZ1T.zzWjd), zzy);
        }
    }

    static {
        zzZ1P zzz1p = zzZ1T.zzWjd;
        zzWb9 = zzz1p;
        zzWb8 = new zzV(new zzYXR(zzz1p.getName(), zzYWU.OpenPGPCFB));
        zzWb7 = new zzY(new zzYXR(zzz1p.getName(), zzYWU.OCB));
        zzWb6 = new zzY(new zzYXR(zzz1p.getName(), zzYWU.EAX));
        zzWb5 = new zzU(new zzYXR(zzz1p.getName(), zzYWU.RFC3211_WRAP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzZ(zzZ46 zzz46, zzZ5W zzz5w) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        int iZzXEo = zzyudZzZ.zzXEo();
        if (iZzXEo != 128 && iZzXEo != 192 && iZzXEo != 256) {
            throw new zzZ5E("AES key must be of length 128, 192, or 256");
        }
        zzYVO.zzZ(zzyudZzZ, zzZ1T.zzWjd, zzz5w);
        return zzyudZzZ;
    }
}
