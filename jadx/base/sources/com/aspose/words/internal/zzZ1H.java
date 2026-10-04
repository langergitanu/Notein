package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ2I;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ1H {
    private static final zzZ1E<zzZ20> zzWgW;
    private static final zzZ1E<zzZ21> zzWgX;
    private static final zzZ1E<zzZ1Y> zzWgY;
    private static final zzZ1E<zzZ1Z> zzWii;
    private static final zzZ1E<zzZ1V> zzWij;
    private static final BigInteger zzWh4 = new BigInteger("deadbeef", 16);
    public static final zzZ1P zzWjd = new zzZ1P("EC");
    private static final zzZ1P zzWig = new zzZ1P("ECMQV", zzI.ECMQV);
    private static final zzZ1P zzWif = new zzZ1P("ECCDHU", zzI.ECCDHU);
    public static final zzT zzWh3 = new zzT(new zzZ1P("ECDSA", zzI.ECDSA), zzZ0P.zzZ.zzWdL);
    public static final zzZ zzWh2 = new zzZ(new zzZ1P("ECDH", zzI.ECDH));
    public static final zzZ zzWh1 = new zzZ(new zzZ1P("ECCDH", zzI.ECCDH));
    public static final zzK zzWh0 = new zzK();
    public static final zzV zzWgZ = new zzV();

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZ1H$9 */
    public static /* synthetic */ class C157209 {
        static final /* synthetic */ int[] zzWgU;

        static {
            int[] iArr = new int[zzI.values().length];
            zzWgU = iArr;
            try {
                iArr[zzI.ECDSA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWgU[zzI.ECDH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzWgU[zzI.ECCDH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzWgU[zzI.ECMQV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzWgU[zzI.ECCDHU.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum zzI {
        ECDSA,
        ECDH,
        ECCDH,
        ECMQV,
        ECCDHU
    }

    public static class zzJ extends zzZ1E<zzZ1V> {
        static final BigInteger zzWi9 = new BigInteger("8cae3483c0d3dac87d1c1d32be8e7b7a3c1558bd01cb7e7bb37c1c81126b0f98", 16);

        private zzJ() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXF7, reason: merged with bridge method [inline-methods] */
        public zzZ1V zzXFZ() {
            return (zzZ1V) zzYZG.zzZ(zzZ1H.zzWjd, new zzZ1V(), new zzYZD<zzZ1V>() { // from class: com.aspose.words.internal.zzZ1H.zzJ.1
                private static void zzZ(zzZ1V zzz1v) throws Exception {
                    zzYVB zzyvbZzXFP = zzZ1H.zzXFP();
                    zzYVB zzyvbZzZ = zzZ1H.zzZ(zzyvbZzXFP);
                    zzYVB zzyvbZzZ2 = zzZ1H.zzZ(zzyvbZzXFP);
                    zzz1v.zzZ(new zzYSH((zzYSE) zzyvbZzXFP.zzXCO(), (zzYSE) zzyvbZzXFP.zzXCO()));
                    if (zzJ.zzWi9.equals(zzz1v.zzY(new zzYSG((zzYSD) zzyvbZzZ.zzXCP(), (zzYSD) zzyvbZzZ2.zzXCP())))) {
                        return;
                    }
                    zzYZD.zzTQ("KAT ECMQV agreement not verified");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ1V zzz1v) throws Exception {
                    zzZ(zzz1v);
                }
            });
        }

        public /* synthetic */ zzJ(byte b) {
            this();
        }
    }

    public static final class zzK extends zzZ0S {
        public zzK() {
            super(zzZ1H.zzWig);
        }

        public static zzL zzY(zzZ3O zzz3o, zzZ3N zzz3n) {
            return new zzL(null, zzz3o, zzz3n);
        }

        public static zzL zzY(zzZ3N zzz3n, zzZ3O zzz3o, zzZ3N zzz3n2) {
            return new zzL(zzz3n, zzz3o, zzz3n2);
        }
    }

    public static final class zzL extends zzZ1Q {
        private final zzZ3N zzWgR;
        private final zzZ3O zzWgS;
        private final zzZ3N zzWgT;

        public /* synthetic */ zzL(zzZ3N zzz3n, zzZ3O zzz3o, zzZ3N zzz3n2) {
            this(zzz3n, zzz3o, zzz3n2, null);
        }

        public final zzZ3N zzXFc() {
            return this.zzWgR;
        }

        private zzL(zzZ3N zzz3n, zzZ3O zzz3o, zzZ3N zzz3n2, zzZ1P zzz1p) {
            super(zzZ1H.zzWig, null);
            this.zzWgT = zzz3n;
            this.zzWgS = zzz3o;
            this.zzWgR = zzz3n2;
        }
    }

    public static final class zzM extends zzZ1R<zzL> {
        public zzM() {
            zzZ1H.zzXFn();
            if (zzYGM.zzwd("org.bouncycastle.ec.disable_mqv")) {
                throw new UnsupportedOperationException("EC MQV has been disabled by setting \"org.bouncycastle.ec.disable_mqv\"");
            }
        }

        @Override // com.aspose.words.internal.zzZ1R
        /* JADX INFO: renamed from: zzX */
        public final /* synthetic */ zzZ1S zzZ(zzZ5S zzz5s, zzZ4M zzz4m) {
            return zzZ(zzz5s, (zzL) zzz4m);
        }

        @Override // com.aspose.words.internal.zzZ1R, com.aspose.words.internal.zzZ5X
        public final /* bridge */ /* synthetic */ zzZ5Y zzZ(zzZ5S zzz5s, zzZ4M zzz4m) {
            return zzZ(zzz5s, (zzL) zzz4m);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static zzZ1S<zzL> zzZ(zzZ5S zzz5s, zzL zzl) {
            zzZ3O zzz3o = (zzZ3O) zzz5s;
            if (zzZ5L.zzXH0()) {
                zzZ1H.zzZ(zzz5s.zzXGV(), zzz3o.zzXGy());
            }
            zzYSE zzyseZzZ = zzZ1H.zzZ(zzz3o);
            zzZ1V zzz1v = (zzZ1V) zzZ1H.zzWij.zzXFZ();
            zzz1v.zzZ(new zzYSH(zzyseZzZ, zzl.zzWgS == null ? zzyseZzZ : zzZ1H.zzZ(zzl.zzWgS)));
            return new zzZ23(zzz1v, zzl);
        }
    }

    public static final class zzN extends zzZ1O<zzO, zzZ3N, zzZ3O> {
        private final zzZ1X zzWgJ;
        private final zzZ1W zzWgK;
        private final zzZ33 zzWlm;

        public zzN(zzO zzo, SecureRandom secureRandom) {
            super(zzo);
            zzZ1W zzz1w = new zzZ1W();
            this.zzWgK = zzz1w;
            zzZ1H.zzXFn();
            if (zzZ5L.zzXH0()) {
                zzZ1H.zzZ(zzo.zzXF4(), zzo.zzXGy());
                zzYZF.zzY(secureRandom, zzYZF.zzX(zzo.zzXGy().zzXHv()), zzZ1H.zzWjd);
            }
            if (!zzXH6().zzXF4().equals(zzZ1H.zzWh2.zzXF4()) || zzYM2.ONE.equals(zzo.zzWlm.zzXHt())) {
                this.zzWgJ = new zzZ1X(zzZ1H.zzV(zzo.zzXGy()), secureRandom);
            } else {
                this.zzWgJ = new zzZ1X(zzZ1H.zzU(zzo.zzXGy()), secureRandom);
            }
            this.zzWlm = zzo.zzXGy();
            zzz1w.zzZ(this.zzWgJ);
        }

        @Override // com.aspose.words.internal.zzZ5U
        public final zzZ3G<zzZ3N, zzZ3O> zzXH4() {
            zzYVB zzyvbZzXG6 = this.zzWgK.zzXG6();
            zzYSD zzysd = (zzYSD) zzyvbZzXG6.zzXCP();
            zzYSE zzyse = (zzYSE) zzyvbZzXG6.zzXCO();
            zzZ1P zzz1pZzXF4 = zzXH6().zzXF4();
            zzZ1H.zzZ(zzz1pZzXF4, zzyvbZzXG6);
            return new zzZ3G<>(new zzZ3N(zzz1pZzXF4, this.zzWlm, zzysd.zzXCe()), new zzZ3O(zzz1pZzXF4, this.zzWlm, zzyse.zzXCf(), zzysd.zzXCe()));
        }
    }

    public static final class zzO extends zzZ0S {
        private final zzZ33 zzWlm;

        public zzO(zzZ33 zzz33) {
            this(zzZ1H.zzWjd, zzz33);
        }

        public final zzZ33 zzXGy() {
            return this.zzWlm;
        }

        public zzO(zzT zzt, zzZ33 zzz33) {
            this(zzt.zzXF4(), zzz33);
        }

        public zzO(zzZ zzz, zzZ33 zzz33) {
            this(zzz.zzXF4(), zzz33);
        }

        public zzO(zzZ33 zzz33, byte b) {
            this(zzZ1H.zzWig, zzz33);
        }

        private zzO(zzZ1P zzz1p, zzZ33 zzz33) {
            super(zzz1p);
            this.zzWlm = zzz33;
        }
    }

    public static class zzP extends zzZ1E<zzZ1Y> {
        private zzP() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXF8, reason: merged with bridge method [inline-methods] */
        public zzZ1Y zzXFZ() {
            return (zzZ1Y) zzYZG.zzZ(zzZ1H.zzWjd, new zzZ1Y(), new zzYZD<zzZ1Y>() { // from class: com.aspose.words.internal.zzZ1H.zzP.1
                private static void zzZ(zzZ1Y zzz1y) throws Exception {
                    zzYVB zzyvbZzXFP = zzZ1H.zzXFP();
                    zzYG1 zzyg1 = new zzYG1("72546832179840998877302529996971396893172522460793442785601695562409154906335");
                    byte[] bArrDecode = zzYGC.decode("1BD4ED430B0F384B4E8D458EFF1A8A553286D7AC21CB2F6806172EF5F94A06AD");
                    zzz1y.zzZ(true, (zzYV3) new zzYS3(zzyvbZzXFP.zzXCO(), zzyg1));
                    BigInteger[] bigIntegerArrZzX6 = zzz1y.zzX6(bArrDecode);
                    zzz1y.zzZ(false, (zzYV3) zzyvbZzXFP.zzXCP());
                    if (zzz1y.zzZ(bArrDecode, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1])) {
                        return;
                    }
                    zzYZD.zzTQ("signature fails");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ1Y zzz1y) throws Exception {
                    zzZ(zzz1y);
                }
            });
        }

        public /* synthetic */ zzP(byte b) {
            this();
        }
    }

    public static class zzQ extends zzZ1E<zzZ1Z> {
        static final byte[] zzWhY = zzYGC.decode("cad5c428ea0645794bc5634549e08a3ed563bd0cf32e909862e08b41d4b6fc17cad5c428ea0645794bc5634549e08a3ed563bd0cf32e909862e08b41d4b6fc17");

        private zzQ() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXF9, reason: merged with bridge method [inline-methods] */
        public zzZ1Z zzXFZ() {
            return (zzZ1Z) zzYZG.zzZ(zzZ1H.zzWjd, new zzZ1Z(), new zzYZD<zzZ1Z>() { // from class: com.aspose.words.internal.zzZ1H.zzQ.1
                private static void zzZ(zzZ1Z zzz1z) throws Exception {
                    zzYVB zzyvbZzXFP = zzZ1H.zzXFP();
                    zzYVB zzyvbZzZ = zzZ1H.zzZ(zzyvbZzXFP);
                    zzYVB zzyvbZzZ2 = zzZ1H.zzZ(zzyvbZzXFP);
                    zzz1z.zzZ(new zzYSL((zzYSE) zzyvbZzXFP.zzXCO(), (zzYSE) zzyvbZzXFP.zzXCO()));
                    if (zzYGU.zzp(zzQ.zzWhY, zzz1z.zzX(new zzYSK((zzYSD) zzyvbZzZ.zzXCP(), (zzYSD) zzyvbZzZ2.zzXCP())))) {
                        return;
                    }
                    zzYZD.zzTQ("KAT ECCDHU agreement not verified");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ1Z zzz1z) throws Exception {
                    zzZ(zzz1z);
                }
            });
        }

        public /* synthetic */ zzQ(byte b) {
            this();
        }
    }

    public static class zzR extends zzZ1E<zzZ20> {
        static final BigInteger zzWi9 = new BigInteger("cad5c428ea0645794bc5634549e08a3ed563bd0cf32e909862e08b41d4b6fc17", 16);

        private zzR() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFa, reason: merged with bridge method [inline-methods] */
        public zzZ20 zzXFZ() {
            return (zzZ20) zzYZG.zzZ(zzZ1H.zzWjd, new zzZ20(), new zzYZD<zzZ20>() { // from class: com.aspose.words.internal.zzZ1H.zzR.1
                private static void zzZ(zzZ20 zzz20) throws Exception {
                    zzYVB zzyvbZzXFP = zzZ1H.zzXFP();
                    zzYVB zzyvbZzZ = zzZ1H.zzZ(zzyvbZzXFP);
                    zzz20.zzZ(zzyvbZzXFP.zzXCO());
                    if (zzR.zzWi9.equals(zzz20.zzY(zzyvbZzZ.zzXCP()))) {
                        return;
                    }
                    zzYZD.zzTQ("KAT ECDH agreement not verified");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ20 zzz20) throws Exception {
                    zzZ(zzz20);
                }
            });
        }

        public /* synthetic */ zzR(byte b) {
            this();
        }
    }

    public static class zzS extends zzZ1E<zzZ21> {
        static BigInteger zzWi9 = new BigInteger("cad5c428ea0645794bc5634549e08a3ed563bd0cf32e909862e08b41d4b6fc17", 16);

        private zzS() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFb, reason: merged with bridge method [inline-methods] */
        public zzZ21 zzXFZ() {
            return (zzZ21) zzYZG.zzZ(zzZ1H.zzWjd, new zzZ21(), new zzYZD<zzZ21>() { // from class: com.aspose.words.internal.zzZ1H.zzS.1
                private static void zzZ(zzZ21 zzz21) throws Exception {
                    zzYVB zzyvbZzXFP = zzZ1H.zzXFP();
                    zzYVB zzyvbZzZ = zzZ1H.zzZ(zzyvbZzXFP);
                    zzz21.zzZ(zzyvbZzXFP.zzXCO());
                    if (zzS.zzWi9.equals(zzz21.zzY(zzyvbZzZ.zzXCP()))) {
                        return;
                    }
                    zzYZD.zzTQ("KAT ECDH agreement not verified");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ21 zzz21) throws Exception {
                    zzZ(zzz21);
                }
            });
        }

        public /* synthetic */ zzS(byte b) {
            this();
        }
    }

    public static final class zzT extends zzZ0S {
        private final zzZ1J zzWhV;

        public zzT(zzZ1P zzz1p, zzZ1J zzz1j) {
            super(zzz1p);
            if (zzz1j == null && zzZ5L.zzXH0()) {
                zzYZZ.checkPermission(zzYUM.zzVZw);
            }
            this.zzWhV = zzz1j;
        }

        public final zzT zzY(zzZ1J zzz1j) {
            return new zzT(zzXF4(), zzz1j);
        }
    }

    public static final class zzU extends zzZ0M<zzT> {
        public zzU() {
            zzZ1H.zzXFn();
        }

        @Override // com.aspose.words.internal.zzZ0M
        /* JADX INFO: renamed from: zzY */
        public final /* synthetic */ zzZ0V zzZ(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzZ(zzz5r, (zzT) zzz4m);
        }

        @Override // com.aspose.words.internal.zzZ0M, com.aspose.words.internal.zzZ4E
        public final /* bridge */ /* synthetic */ zzZ4P zzZ(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzZ(zzz5r, (zzT) zzz4m);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.aspose.words.internal.zzZ0M, com.aspose.words.internal.zzZ4E
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public final zzZ0W<zzT> zzY(zzZ5S zzz5s, zzT zzt) {
            zzZ3O zzz3o = (zzZ3O) zzz5s;
            if (zzZ5L.zzXH0()) {
                zzZ1H.zzZ(zzz5s.zzXGV(), zzz3o.zzXGy());
            }
            zzZ1Y zzz1y = (zzZ1Y) zzZ1H.zzWgY.zzXFZ();
            zzYUX zzyuxZzU = zzt.zzWhV != null ? zzZ0P.zzU(zzt.zzWhV) : new zzZ03();
            final zzYSE zzyseZzZ = zzZ1H.zzZ(zzz3o);
            return new zzZ2I(zzz1y, zzyuxZzU, zzt, new zzZ2I.zzZ() { // from class: com.aspose.words.internal.zzZ1H.zzU.1
                @Override // com.aspose.words.internal.zzZ2I.zzZ
                public final void zzZ(zzYV1 zzyv1, SecureRandom secureRandom) {
                    zzyv1.zzZ(true, new zzYS3(zzyseZzZ, secureRandom));
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static zzZ0V<zzT> zzZ(zzZ5R zzz5r, zzT zzt) {
            zzZ1Y zzz1y = (zzZ1Y) zzZ1H.zzWgY.zzXFZ();
            zzYUX zzyuxZzU = zzt.zzWhV != null ? zzZ0P.zzU(zzt.zzWhV) : new zzZ03();
            zzZ3N zzz3n = (zzZ3N) zzz5r;
            zzz1y.zzZ(false, (zzYV3) new zzYSD(zzz3n.zzXGA(), zzZ1H.zzV(zzz3n.zzXGy())));
            return new zzZ2H(zzz1y, zzyuxZzU, zzt);
        }
    }

    public static final class zzV extends zzZ0S {
        public zzV() {
            super(zzZ1H.zzWif);
        }

        public static zzW zzZ(zzZ3O zzz3o, zzZ3N zzz3n) {
            return new zzW(null, zzz3o, zzz3n);
        }

        public static zzW zzZ(zzZ3N zzz3n, zzZ3O zzz3o, zzZ3N zzz3n2) {
            return new zzW(zzz3n, zzz3o, zzz3n2);
        }
    }

    public static final class zzW extends zzZ1Q {
        private final zzZ3N zzWgR;
        private final zzZ3O zzWgS;
        private final zzZ3N zzWgT;

        public /* synthetic */ zzW(zzZ3N zzz3n, zzZ3O zzz3o, zzZ3N zzz3n2) {
            this(zzz3n, zzz3o, zzz3n2, null);
        }

        public final zzZ3N zzXFc() {
            return this.zzWgR;
        }

        private zzW(zzZ3N zzz3n, zzZ3O zzz3o, zzZ3N zzz3n2, zzZ1P zzz1p) {
            super(zzZ1H.zzWif, null);
            this.zzWgT = zzz3n;
            this.zzWgS = zzz3o;
            this.zzWgR = zzz3n2;
        }
    }

    public static final class zzX extends zzZ1R<zzW> {
        public zzX() {
            zzZ1H.zzXFn();
        }

        @Override // com.aspose.words.internal.zzZ1R
        /* JADX INFO: renamed from: zzX */
        public final /* synthetic */ zzZ1S zzZ(zzZ5S zzz5s, zzZ4M zzz4m) {
            return zzZ(zzz5s, (zzW) zzz4m);
        }

        @Override // com.aspose.words.internal.zzZ1R, com.aspose.words.internal.zzZ5X
        public final /* bridge */ /* synthetic */ zzZ5Y zzZ(zzZ5S zzz5s, zzZ4M zzz4m) {
            return zzZ(zzz5s, (zzW) zzz4m);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static zzZ1S<zzW> zzZ(zzZ5S zzz5s, zzW zzw) {
            zzZ3O zzz3o = (zzZ3O) zzz5s;
            if (zzZ5L.zzXH0()) {
                zzZ1H.zzZ(zzz5s.zzXGV(), zzz3o.zzXGy());
            }
            zzYSE zzyseZzZ = zzZ1H.zzZ(zzz3o);
            zzZ1Z zzz1z = (zzZ1Z) zzZ1H.zzWii.zzXFZ();
            zzz1z.zzZ(new zzYSL(zzyseZzZ, zzw.zzWgS == null ? zzyseZzZ : zzZ1H.zzZ(zzw.zzWgS)));
            return new zzZ22(zzz1z, zzw);
        }
    }

    public static final class zzY extends zzZ1R<zzZ> {
        public zzY() {
            zzZ1H.zzXFn();
        }

        @Override // com.aspose.words.internal.zzZ1R
        /* JADX INFO: renamed from: zzX */
        public final /* synthetic */ zzZ1S zzZ(zzZ5S zzz5s, zzZ4M zzz4m) {
            return zzZ(zzz5s, (zzZ) zzz4m);
        }

        @Override // com.aspose.words.internal.zzZ1R, com.aspose.words.internal.zzZ5X
        public final /* bridge */ /* synthetic */ zzZ5Y zzZ(zzZ5S zzz5s, zzZ4M zzz4m) {
            return zzZ(zzz5s, (zzZ) zzz4m);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static zzZ1S<zzZ> zzZ(zzZ5S zzz5s, zzZ zzz) {
            if (zzz.zzXF4() == zzZ1H.zzWh2.zzXF4()) {
                zzZ3O zzz3o = (zzZ3O) zzz5s;
                if (zzZ5L.zzXH0()) {
                    if (!BigInteger.ONE.equals(zzz3o.zzXGy().zzXHt())) {
                        throw new zzZ0H("ECDH can only be executed on curves with a co-factor of 1 in approved mode", zzz5s.zzXGV());
                    }
                    zzZ1H.zzZ(zzz5s.zzXGV(), zzz3o.zzXGy());
                }
                zzYSE zzyseZzY = !BigInteger.ONE.equals(zzz3o.zzXGy().zzXHt()) ? zzZ1H.zzY(zzz3o) : zzZ1H.zzZ(zzz3o);
                zzZ21 zzz21 = (zzZ21) zzZ1H.zzWgX.zzXFZ();
                zzz21.zzZ(zzyseZzY);
                return new zzZ23(zzz21, zzz);
            }
            if (zzz.zzXF4() != zzZ1H.zzWh1.zzXF4()) {
                throw new IllegalArgumentException("Incorrect algorithm in parameters for EC DH: " + zzz.zzXF4().getName());
            }
            zzZ3O zzz3o2 = (zzZ3O) zzz5s;
            if (zzZ5L.zzXH0()) {
                zzZ1H.zzZ(zzz5s.zzXGV(), zzz3o2.zzXGy());
            }
            zzYSE zzyseZzZ = zzZ1H.zzZ(zzz3o2);
            zzZ20 zzz20 = (zzZ20) zzZ1H.zzWgW.zzXFZ();
            zzz20.zzZ(zzyseZzZ);
            return new zzZ23(zzz20, zzz);
        }
    }

    public static final class zzZ extends zzZ1Q {
        public zzZ(zzZ1P zzz1p) {
            this(zzz1p, (byte) 0);
        }

        private zzZ(zzZ1P zzz1p, byte b) {
            super(zzz1p, null);
        }
    }

    static {
        byte b = 0;
        zzP zzp = new zzP(b);
        zzWgY = zzp;
        zzWgX = new zzS(b);
        zzWgW = new zzR(b);
        zzWij = new zzJ(b);
        zzWii = new zzQ(b);
        zzp.zzXFZ();
        zzXFm();
    }

    private zzZ1H() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSJ zzV(zzZ33 zzz33) {
        return zzz33 instanceof zzZ2W ? new zzYSF((zzZ2W) zzz33) : new zzYSJ(zzz33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYVB zzXFP() {
        zzZ72 zzz72ZzwN = zzZ9P.zzwN("P-256");
        zzYSJ zzysj = new zzYSJ(new zzZ33(zzz72ZzwN.zzXHv(), zzz72ZzwN.zzXHu(), zzz72ZzwN.zzXIz(), zzz72ZzwN.zzXHt(), zzz72ZzwN.getSeed()));
        return new zzYVB(new zzYSD(zzysj.zzXHv().zzVO(zzYGC.decode("03596375E6CE57E0F20294FC46BDFCFD19A39F8161B58695B3EC5B3D16427C274D")), zzysj), new zzYSE(new BigInteger("20186677036482506117540275567393538695075300175221296989956723148347484984008"), zzysj));
    }

    private static void zzXFm() {
        zzZ1P zzz1p = zzWjd;
        zzYZG.zzZ(zzz1p, new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ1H.6
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                zzZ72 zzz72ZzwN = zzZ9P.zzwN("P-256");
                zzZ33 zzz33 = new zzZ33(zzz72ZzwN.zzXHv(), zzz72ZzwN.zzXHu(), zzz72ZzwN.zzXIz(), zzz72ZzwN.zzXHt(), zzz72ZzwN.getSeed());
                if (zzz33.zzXHv().zzVO(zzYGC.decode("03596375E6CE57E0F20294FC46BDFCFD19A39F8161B58695B3EC5B3D16427C274D")).zzU(zzz33.zzXHu().zzK(new BigInteger("20186677036482506117540275567393538695075300175221296989956723148347484984008")))) {
                    return;
                }
                zzYZE.zzTQ("EC primitive 'Z' computation failed");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzXFn() {
        if (zzYGM.zzwd("org.bouncycastle.ec.disable")) {
            throw new UnsupportedOperationException("EC has been disabled by setting \"org.bouncycastle.ec.disable\"");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzZ(zzZ1P zzz1p, zzYVB zzyvb) {
        int i = C157209.zzWgU[(zzz1p == zzWjd ? zzI.ECDSA : (zzI) zzz1p.zzXFS()).ordinal()];
        if (i == 1) {
            zzYZG.zzZ(zzz1p, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzZ1H.1
                private static boolean zzX(zzYVB zzyvb2) throws Exception {
                    zzZ1Y zzz1y = new zzZ1Y();
                    zzz1y.zzZ(true, (zzYV3) new zzYS3(zzyvb2.zzXCO(), zzYZF.zzWbb));
                    byte[] bArr = new byte[32];
                    bArr[1] = 1;
                    BigInteger[] bigIntegerArrZzX6 = zzz1y.zzX6(bArr);
                    zzz1y.zzZ(false, (zzYV3) zzyvb2.zzXCP());
                    return zzz1y.zzZ(bArr, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1]);
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
            return;
        }
        if (i == 2) {
            zzYZG.zzZ(zzz1p, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzZ1H.2
                private static boolean zzX(zzYVB zzyvb2) throws Exception {
                    zzZ21 zzz21 = new zzZ21();
                    zzz21.zzZ(zzyvb2.zzXCO());
                    BigInteger bigIntegerZzY = zzz21.zzY(zzyvb2.zzXCP());
                    zzYVB zzyvbZzZ = zzZ1H.zzZ(zzyvb2);
                    zzz21.zzZ(zzyvbZzZ.zzXCO());
                    BigInteger bigIntegerZzY2 = zzz21.zzY(zzyvbZzZ.zzXCP());
                    zzz21.zzZ(zzyvb2.zzXCO());
                    BigInteger bigIntegerZzY3 = zzz21.zzY(zzyvbZzZ.zzXCP());
                    zzz21.zzZ(zzyvbZzZ.zzXCO());
                    return (bigIntegerZzY.equals(bigIntegerZzY2) || bigIntegerZzY.equals(bigIntegerZzY3) || !bigIntegerZzY3.equals(zzz21.zzY(zzyvb2.zzXCP()))) ? false : true;
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
            return;
        }
        if (i == 3) {
            zzYZG.zzZ(zzz1p, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzZ1H.3
                private static boolean zzX(zzYVB zzyvb2) throws Exception {
                    zzZ20 zzz20 = new zzZ20();
                    zzz20.zzZ(zzyvb2.zzXCO());
                    BigInteger bigIntegerZzY = zzz20.zzY(zzyvb2.zzXCP());
                    zzYVB zzyvbZzZ = zzZ1H.zzZ(zzyvb2);
                    zzz20.zzZ(zzyvbZzZ.zzXCO());
                    BigInteger bigIntegerZzY2 = zzz20.zzY(zzyvbZzZ.zzXCP());
                    zzz20.zzZ(zzyvb2.zzXCO());
                    BigInteger bigIntegerZzY3 = zzz20.zzY(zzyvbZzZ.zzXCP());
                    zzz20.zzZ(zzyvbZzZ.zzXCO());
                    return (bigIntegerZzY.equals(bigIntegerZzY2) || bigIntegerZzY.equals(bigIntegerZzY3) || !bigIntegerZzY3.equals(zzz20.zzY(zzyvb2.zzXCP()))) ? false : true;
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
            return;
        }
        if (i == 4) {
            zzYZG.zzZ(zzz1p, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzZ1H.4
                private static boolean zzX(zzYVB zzyvb2) throws Exception {
                    zzZ1V zzz1v = new zzZ1V();
                    zzz1v.zzZ(new zzYSH((zzYSE) zzyvb2.zzXCO(), (zzYSE) zzyvb2.zzXCO()));
                    BigInteger bigIntegerZzY = zzz1v.zzY(new zzYSG((zzYSD) zzyvb2.zzXCP(), (zzYSD) zzyvb2.zzXCP()));
                    zzYVB zzyvbZzZ = zzZ1H.zzZ(zzyvb2);
                    zzYVB zzyvbZzZ2 = zzZ1H.zzZ(zzyvb2);
                    zzz1v.zzZ(new zzYSH((zzYSE) zzyvb2.zzXCO(), (zzYSE) zzyvb2.zzXCO()));
                    BigInteger bigIntegerZzY2 = zzz1v.zzY(new zzYSG((zzYSD) zzyvbZzZ.zzXCP(), (zzYSD) zzyvbZzZ2.zzXCP()));
                    zzz1v.zzZ(new zzYSH((zzYSE) zzyvbZzZ.zzXCO(), (zzYSE) zzyvbZzZ2.zzXCO()));
                    return !bigIntegerZzY.equals(bigIntegerZzY2) && bigIntegerZzY2.equals(zzz1v.zzY(new zzYSG((zzYSD) zzyvb2.zzXCP(), (zzYSD) zzyvb2.zzXCP())));
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
        } else if (i == 5) {
            zzYZG.zzZ(zzz1p, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzZ1H.5
                private static boolean zzX(zzYVB zzyvb2) throws Exception {
                    zzZ1Z zzz1z = new zzZ1Z();
                    zzz1z.zzZ(new zzYSL((zzYSE) zzyvb2.zzXCO(), (zzYSE) zzyvb2.zzXCO()));
                    byte[] bArrZzX = zzz1z.zzX(new zzYSK((zzYSD) zzyvb2.zzXCP(), (zzYSD) zzyvb2.zzXCP()));
                    zzYVB zzyvbZzZ = zzZ1H.zzZ(zzyvb2);
                    zzYVB zzyvbZzZ2 = zzZ1H.zzZ(zzyvb2);
                    zzz1z.zzZ(new zzYSL((zzYSE) zzyvb2.zzXCO(), (zzYSE) zzyvb2.zzXCO()));
                    byte[] bArrZzX2 = zzz1z.zzX(new zzYSK((zzYSD) zzyvbZzZ.zzXCP(), (zzYSD) zzyvbZzZ2.zzXCP()));
                    zzz1z.zzZ(new zzYSL((zzYSE) zzyvbZzZ.zzXCO(), (zzYSE) zzyvbZzZ2.zzXCO()));
                    return !zzYGU.zzp(bArrZzX, bArrZzX2) && zzYGU.zzp(bArrZzX2, zzz1z.zzX(new zzYSK((zzYSD) zzyvb2.zzXCP(), (zzYSD) zzyvb2.zzXCP())));
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
        } else {
            throw new IllegalStateException("Unhandled EC algorithm: " + zzz1p.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSJ zzU(zzZ33 zzz33) {
        return zzz33 instanceof zzZ2W ? new zzYSF((zzZ2W) zzz33, zzz33.zzXGm()) : new zzYSJ(zzz33, zzz33.zzXGm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSE zzY(final zzZ3O zzz3o) {
        return (zzYSE) AccessController.doPrivileged(new PrivilegedAction<zzYSE>() { // from class: com.aspose.words.internal.zzZ1H.8
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXFd, reason: merged with bridge method [inline-methods] */
            public zzYSE run() {
                return new zzYSE(zzz3o.getS(), zzZ1H.zzU(zzz3o.zzXGy()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYVB zzZ(zzYVB zzyvb) {
        zzYSE zzyse = (zzYSE) zzyvb.zzXCO();
        zzYSJ zzysjZzXCg = zzyse.zzXCg();
        BigInteger bigIntegerZzXCf = zzyse.zzXCf();
        BigInteger bigInteger = zzWh4;
        BigInteger bigIntegerMod = bigIntegerZzXCf.add(bigInteger).mod(zzysjZzXCg.zzXIz());
        if (bigIntegerMod.compareTo(zzYM2.zzWkF) < 0) {
            bigIntegerMod = bigIntegerMod.add(bigInteger);
        }
        return new zzYVB(new zzYSD(zzysjZzXCg.zzXHu().zzK(bigIntegerMod), zzysjZzXCg), new zzYSE(bigIntegerMod, zzysjZzXCg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzZ(zzZ5W zzz5w, zzZ33 zzz33) {
        if (zzz33.zzXHv().getFieldSize() < 224) {
            throw new zzZ0H("Attempt to use curve with field size less than 224 bits", zzz5w);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSE zzZ(final zzZ3O zzz3o) {
        return (zzYSE) AccessController.doPrivileged(new PrivilegedAction<zzYSE>() { // from class: com.aspose.words.internal.zzZ1H.7
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXFd, reason: merged with bridge method [inline-methods] */
            public zzYSE run() {
                return new zzYSE(zzz3o.getS(), zzZ1H.zzV(zzz3o.zzXGy()));
            }
        });
    }
}
