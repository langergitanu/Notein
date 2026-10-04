package com.aspose.words.internal;

import com.aspose.words.internal.zzYYW;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ1H;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYYJ {
    public static final zzY zzW8b;
    public static final zzY zzW8c;
    public static final zzZ5W zzWb9;

    public enum zzV {
        ECDSA,
        ECDDSA
    }

    public static final class zzW extends zzYXD {
        private final zzZ1H.zzN zzW89;

        public zzW(zzX zzx, SecureRandom secureRandom) {
            super(zzx);
            zzYYJ.zzXFn();
            this.zzW89 = new zzZ1H.zzN(new zzZ1H.zzO(zzx.zzWlm), secureRandom);
        }

        @Override // com.aspose.words.internal.zzYXD
        public final zzZ3G zzXDI() {
            zzZ3G<zzZ3N, zzZ3O> zzz3gZzXH4 = this.zzW89.zzXH4();
            final zzZ5W zzz5wZzXGV = zzXH6().zzXGV();
            final zzZ3N zzz3n = (zzZ3N) zzz3gZzXH4.zzXGw();
            final zzZ3O zzz3o = (zzZ3O) zzz3gZzXH4.zzXGv();
            return (zzZ3G) AccessController.doPrivileged(new PrivilegedAction<zzZ3G>() { // from class: com.aspose.words.internal.zzYYJ.zzW.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: zzXDB, reason: merged with bridge method [inline-methods] */
                public zzZ3G run() {
                    return new zzZ3G(new zzZ3N(zzz5wZzXGV, zzz3n.zzXGy(), zzz3n.zzXGA()), new zzZ3O(zzz5wZzXGV, zzz3o.zzXGy(), zzz3o.getS(), zzz3n.zzXGA()));
                }
            });
        }
    }

    public static final class zzX extends zzYXO {
        private final zzZ33 zzWlm;

        public zzX(zzZ33 zzz33) {
            this(zzYYJ.zzWb9, zzz33);
        }

        public zzX(zzY zzy, zzZ33 zzz33) {
            this(zzy.zzXGV(), zzz33);
        }

        private zzX(zzZ5W zzz5w, zzZ33 zzz33) {
            super(zzz5w);
            this.zzWlm = zzz33;
        }
    }

    public static final class zzY extends zzYXO {
        private final zzZ5K zzW8y;

        public zzY(zzYXR zzyxr, zzZ5K zzz5k) {
            super(zzyxr);
            if (zzyxr.zzXFS() == zzV.ECDDSA && zzz5k == null) {
                throw new IllegalArgumentException("ECDDSA cannot be used with a NULL digest");
            }
            this.zzW8y = zzz5k;
        }

        public final zzZ5K zzXDF() {
            return this.zzW8y;
        }

        public final zzY zzY(zzZ5K zzz5k) {
            return new zzY((zzYXR) zzXGV(), zzz5k);
        }
    }

    static {
        zzZ1P zzz1p = zzZ1H.zzWjd;
        zzWb9 = zzz1p;
        zzYXR zzyxr = new zzYXR(zzz1p.getName(), zzV.ECDSA);
        zzZ1J zzz1j = zzZ0P.zzZ.zzWdL;
        zzW8c = new zzY(zzyxr, zzz1j);
        zzW8b = new zzY(new zzYXR(zzz1p.getName(), zzV.ECDDSA), zzz1j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzXFn() {
        if (zzYGM.zzwd("org.bouncycastle.ec.disable")) {
            throw new UnsupportedOperationException("EC has been disabled by setting \"org.bouncycastle.ec.disable\"");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSE zzZ(final zzZ3O zzz3o) {
        return (zzYSE) AccessController.doPrivileged(new PrivilegedAction<zzYSE>() { // from class: com.aspose.words.internal.zzYYJ.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXFd, reason: merged with bridge method [inline-methods] */
            public zzYSE run() {
                return new zzYSE(zzz3o.getS(), zzYYJ.zzV(zzz3o.zzXGy()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSJ zzV(zzZ33 zzz33) {
        return zzz33 instanceof zzZ2W ? new zzYSF((zzZ2W) zzz33) : new zzYSJ(zzz33);
    }

    public static final class zzZ extends zzYX7<zzY> {
        public zzZ() {
            zzYYJ.zzXFn();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYX7
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public zzZ4S<zzY> zzU(zzZ5S zzz5s, zzY zzy) {
            zzZ3O zzz3o = (zzZ3O) zzz5s;
            zzYUX zzyuxZzZ = zzy.zzW8y != null ? zzYW6.zzZ(zzy.zzW8y) : new zzYWT();
            zzYYH zzyyh = zzy.zzXGV() == zzYYJ.zzW8c.zzXDF() ? new zzYYH(new zzYW7()) : new zzYYH(new zzYX1(zzYW6.zzZ(zzy.zzW8y)));
            final zzYSE zzyseZzZ = zzYYJ.zzZ(zzz3o);
            return new zzYYW(zzyyh, zzyuxZzZ, zzy, new zzYYW.zzZ() { // from class: com.aspose.words.internal.zzYYJ.zzZ.1
                @Override // com.aspose.words.internal.zzYYW.zzZ
                public final void zzZ(zzYV1 zzyv1, SecureRandom secureRandom) {
                    zzyv1.zzZ(true, new zzYS3(zzyseZzZ, secureRandom));
                }
            });
        }

        @Override // com.aspose.words.internal.zzYX7
        public final /* synthetic */ zzZ4P zzX(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzZ(zzz5r, (zzY) zzz4m);
        }

        private static zzZ4P<zzY> zzZ(zzZ5R zzz5r, zzY zzy) {
            zzYYH zzyyh = new zzYYH();
            zzYUX zzyuxZzZ = zzy.zzW8y != null ? zzYW6.zzZ(zzy.zzW8y) : new zzYWT();
            zzZ3N zzz3n = (zzZ3N) zzz5r;
            zzyyh.zzZ(false, (zzYV3) new zzYSD(zzz3n.zzXGA(), zzYYJ.zzV(zzz3n.zzXGy())));
            return new zzYYV(zzyyh, zzyuxZzZ, zzy);
        }
    }
}
