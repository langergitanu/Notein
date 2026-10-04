package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYVU {
    public static final zzYXR zzWb4 = new zzYXR("SipHash");
    public static final zzYXR zzW16 = new zzYXR("SipHash-2-4");
    public static final zzYXR zzW15 = new zzYXR("SipHash-4-8");

    public static final class zzX extends zzYX9<zzZ> {
        private static zzYUR zzZ(zzZ46 zzz46, zzZ zzz) {
            zzYUR zzyurZzY = zzY(zzz);
            if (zzyurZzY.zzXDn() != (zzz.zzXH3() + 7) / 8) {
                zzyurZzY = new zzYTT(zzyurZzY, zzz.zzWdl);
            }
            zzyurZzY.zzZ(zzYVO.zzZ(zzYVU.zzT(zzz46, zzz)));
            return zzyurZzY;
        }

        @Override // com.aspose.words.internal.zzYX9
        public final /* synthetic */ zzYUR zzY(zzZ46 zzz46, zzZ5Q zzz5q) {
            return zzZ(zzz46, (zzZ) zzz5q);
        }

        private static zzYUR zzY(zzZ zzz) {
            if (zzz.zzXGV() == zzYVU.zzW16) {
                return new zzYVT(2, 4);
            }
            if (zzz.zzXGV() == zzYVU.zzW15) {
                return new zzYVT(4, 8);
            }
            throw new IllegalArgumentException("Unknown algorithm passed to createMAC: " + zzz.zzXGV());
        }
    }

    public static final class zzY extends zzYX4 {
        private final zzYXR zzWb0;
        private final SecureRandom zzWk5;

        public zzY(zzYXR zzyxr, SecureRandom secureRandom) {
            this.zzWb0 = zzyxr;
            this.zzWk5 = secureRandom;
        }

        @Override // com.aspose.words.internal.zzYX4
        public final zzZ46 zzXDT() {
            zzYZ0 zzyz0 = new zzYZ0();
            zzyz0.zzZ(new zzYUS(this.zzWk5, 128));
            return new zzZ43(this.zzWb0, zzyz0.zzXG8());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYUD zzT(zzZ46 zzz46, zzZ4M zzz4m) {
        zzYUD zzyudZzZ = zzYWI.zzZ(zzz46);
        if (zzfw(zzyudZzZ.zzXEo())) {
            throw new zzZ5E("SipHash key must be of length 128 bits");
        }
        zzZ5W zzz5wZzXGV = zzz46.zzXGV();
        if (zzz5wZzXGV == zzWb4 || zzz5wZzXGV == zzz4m.zzXGV()) {
            return zzyudZzZ;
        }
        throw new zzZ5E("Key not for appropriate algorithm");
    }

    private static boolean zzfw(int i) {
        return i != 128;
    }

    public static final class zzZ extends zzYXO<zzYXR> implements zzZ5Q<zzZ> {
        private final int zzWdl;

        private zzZ(zzYXR zzyxr, int i) {
            super(zzyxr);
            this.zzWdl = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ5Q
        /* JADX INFO: renamed from: zzfh, reason: merged with bridge method [inline-methods] */
        public zzZ zzg1(int i) {
            return new zzZ(zzXGV(), i);
        }

        @Override // com.aspose.words.internal.zzZ5Q
        public final int zzXH3() {
            return this.zzWdl;
        }

        public zzZ() {
            this(zzYVU.zzW16);
        }

        public zzZ(zzYXR zzyxr) {
            this(zzyxr, 64);
        }
    }
}
