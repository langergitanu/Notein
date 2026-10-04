package com.aspose.words.internal;

import Oooo0.C20856OooooOo;
import Oooo0oO.o0Oo0oo;
import com.aspose.words.internal.zzYG2;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ2I;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ1K {
    private static final zzYUV<zzZ24> zzWhb;
    public static final zzZ1P zzWjd = new zzZ1P("DSA", (Enum) null);
    public static final zzT zzWhc = new zzT();

    public static final class zzT extends zzZ0S {
        private final zzZ1J zzWhV;

        public zzT() {
            super(zzZ1K.zzWjd);
            this.zzWhV = zzZ0P.zzZ.zzWdL;
        }

        public final zzZ1J zzXFo() {
            return this.zzWhV;
        }

        public static zzT zzZ(zzZ1J zzz1j) {
            return new zzT(zzz1j);
        }

        private zzT(zzZ1J zzz1j) {
            super(zzZ1K.zzWjd);
            if (zzz1j == null && zzZ5L.zzXH0()) {
                zzYZZ.checkPermission(zzYUM.zzVZw);
            }
            this.zzWhV = zzz1j;
        }
    }

    public static final class zzU extends zzZ0M<zzT> {
        @Override // com.aspose.words.internal.zzZ0M
        /* JADX INFO: renamed from: zzY */
        public final /* synthetic */ zzZ0V zzZ(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzZ(zzz5r, (zzT) zzz4m);
        }

        @Override // com.aspose.words.internal.zzZ0M, com.aspose.words.internal.zzZ4E
        public final /* bridge */ /* synthetic */ zzZ4P zzZ(zzZ5R zzz5r, zzZ4M zzz4m) {
            return zzZ(zzz5r, (zzT) zzz4m);
        }

        @Override // com.aspose.words.internal.zzZ0M, com.aspose.words.internal.zzZ4E
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public final zzZ0W<zzT> zzY(zzZ5S zzz5s, zzT zzt) {
            zzZ24 zzz24 = (zzZ24) zzZ1K.zzWhb.zzXFZ();
            zzYUX zzyuxZzU = zzt.zzWhV != null ? zzZ0P.zzU(zzt.zzWhV) : new zzZ03();
            final zzYSO zzysoZzZ = zzZ1K.zzZ((zzZ3W) zzz5s);
            int iBitLength = zzysoZzZ.zzXCo().getP().bitLength();
            if (!zzZ5L.zzXH0() || iBitLength == 2048 || iBitLength == 3072) {
                return new zzZ2I(zzz24, zzyuxZzU, zzt, new zzZ2I.zzZ() { // from class: com.aspose.words.internal.zzZ1K.zzU.1
                    @Override // com.aspose.words.internal.zzZ2I.zzZ
                    public final void zzZ(zzYV1 zzyv1, SecureRandom secureRandom) {
                        zzyv1.zzZ(true, new zzYS3(zzysoZzZ, secureRandom));
                    }
                });
            }
            throw new zzZ0H(o0Oo0oo.OooO0O0(iBitLength, "Attempt to create signer with unapproved keysize [", "]"), zzZ1K.zzWjd);
        }

        public static zzZ0V<zzT> zzZ(zzZ5R zzz5r, zzT zzt) {
            zzZ24 zzz24 = (zzZ24) zzZ1K.zzWhb.zzXFZ();
            zzYUX zzyuxZzU = zzt.zzWhV != null ? zzZ0P.zzU(zzt.zzWhV) : new zzZ03();
            zzZ3V zzz3v = (zzZ3V) zzz5r;
            zzYSN zzysn = new zzYSN(zzz3v.getY(), zzZ1K.zzY(zzz3v.zzXGC()));
            int iBitLength = zzysn.zzXCo().getP().bitLength();
            if (zzZ5L.zzXH0() && iBitLength != 1024 && iBitLength != 2048 && iBitLength != 3072) {
                throw new zzZ0H(o0Oo0oo.OooO0O0(iBitLength, "Attempt to create verifier with unapproved keysize [", "]"), zzZ1K.zzWjd);
            }
            zzz24.zzZ(false, (zzYV3) zzysn);
            return new zzZ2H(zzz24, zzyuxZzU, zzt);
        }
    }

    public static final class zzV extends zzZ1O<zzW, zzZ3V, zzZ3W> {
        private final zzZ26 zzWh7;
        private final zzYSS zzWjr;
        private final zzZ36 zzWls;

        public zzV(zzW zzw, SecureRandom secureRandom) {
            super(zzw);
            zzZ26 zzz26 = new zzZ26();
            this.zzWh7 = zzz26;
            if (zzZ5L.zzXH0()) {
                int iBitLength = zzw.zzXGC().getP().bitLength();
                if (iBitLength != 2048 && iBitLength != 3072) {
                    throw new zzZ0H(o0Oo0oo.OooO0O0(iBitLength, "Attempt to create key pair with unapproved key size [", "]"), zzw.zzXF4());
                }
                zzYZF.zzY(secureRandom, zzYZF.zzfx(iBitLength), zzw.zzXF4());
            }
            zzZ36 zzz36ZzXGC = zzw.zzXGC();
            this.zzWls = zzz36ZzXGC;
            zzYSS zzyss = new zzYSS(secureRandom, zzZ1K.zzY(zzz36ZzXGC));
            this.zzWjr = zzyss;
            zzz26.zzZ(zzyss);
        }

        @Override // com.aspose.words.internal.zzZ5U
        public final zzZ3G<zzZ3V, zzZ3W> zzXH4() {
            zzYVB zzyvbZzXG6 = this.zzWh7.zzXG6();
            zzYSN zzysn = (zzYSN) zzyvbZzXG6.zzXCP();
            zzYSO zzyso = (zzYSO) zzyvbZzXG6.zzXCO();
            zzZ1P zzz1pZzXF4 = zzXH6().zzXF4();
            zzZ1K.zzW(zzyvbZzXG6);
            return new zzZ3G<>(new zzZ3V(zzz1pZzXF4, this.zzWls, zzysn.getY()), new zzZ3W(zzz1pZzXF4, this.zzWls, zzyso.getX()));
        }
    }

    public static final class zzW extends zzZ0S {
        private final zzZ36 zzWls;

        public zzW(zzZ36 zzz36) {
            super(zzZ1K.zzWjd);
            this.zzWls = zzz36;
        }

        public final zzZ36 zzXGC() {
            return this.zzWls;
        }
    }

    public static class zzX extends zzZ1E<zzZ24> {
        private zzX() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFp, reason: merged with bridge method [inline-methods] */
        public zzZ24 zzXFZ() {
            return (zzZ24) zzYZG.zzZ(zzZ1K.zzWjd, new zzZ24(), new zzYZD<zzZ24>() { // from class: com.aspose.words.internal.zzZ1K.zzX.1
                private static void zzZ(zzZ24 zzz24) throws Exception {
                    BigInteger bigInteger = new BigInteger("90EAF4D1AF0708B1B612FF35E0A2997EB9E9D263C9CE659528945C0D", 16);
                    BigInteger bigInteger2 = new BigInteger("C196BA05AC29E1F9C3C72D56DFFC6154A033F1477AC88EC37F09BE6C5BB95F51C296DD20D1A28A067CCC4D4316A4BD1DCA55ED1066D438C35AEBAABF57E7DAE428782A95ECA1C143DB701FD48533A3C18F0FE23557EA7AE619ECACC7E0B51652A8776D02A425567DED36EABD90CA33A1E8D988F0BBB92D02D1D20290113BB562CE1FC856EEB7CDD92D33EEA6F410859B179E7E789A8F75F645FAE2E136D252BFFAFF89528945C1ABE705A38DBC2D364AADE99BE0D0AAD82E5320121496DC65B3930E38047294FF877831A16D5228418DE8AB275D7D75651CEFED65F78AFC3EA7FE4D79B35F62A0402A1117599ADAC7B269A59F353CF450E6982D3B1702D9CA83", 16);
                    BigInteger bigInteger3 = new BigInteger("A59A749A11242C58C894E9E5A91804E8FA0AC64B56288F8D47D51B1EDC4D65444FECA0111D78F35FC9FDD4CB1F1B79A3BA9CBEE83A3F811012503C8117F98E5048B089E387AF6949BF8784EBD9EF45876F2E6A5A495BE64B6E770409494B7FEE1DBB1E4B2BC2A53D4F893D418B7159592E4FFFDF6969E91D770DAEBD0B5CB14C00AD68EC7DC1E5745EA55C706C4A1C5C88964E34D09DEB753AD418C1AD0F4FDFD049A955E5D78491C0B7A2F1575A008CCD727AB376DB6E695515B05BD412F5B8C2F4C77EE10DA48ABD53F5DD498927EE7B692BBBCDA2FB23A516C5B4533D73980B2A3B60E384ED200AE21B40D273651AD6060C13D97FD69AA13C5611A51B9085", 16);
                    zzZ26 zzz26 = new zzZ26();
                    zzz26.zzZ(new zzYSS(new zzYG1(zzYGC.decode("947813B589EDBA642411AD79205E43CE9B859327A4F84CF4B02628DB058A7B22771EA1852903711B")), new zzYSP(bigInteger2, bigInteger, bigInteger3)));
                    zzYVB zzyvbZzXG6 = zzz26.zzXG6();
                    zzz24.zzZ(true, (zzYV3) new zzYS3(zzyvbZzXG6.zzXCO(), new zzYG2(new zzYG2.zzZ("735959CC4463B8B440E407EECA8A473BF6A6D1FE657546F67D401F05"), new zzYG2.zzY(zzYGC.decode("01020304")))));
                    byte[] bArrDecode = zzYGC.decode("23097D223405D8228642A477BDA255B32AADBCE4BDA0B3F7E36C9DA7");
                    BigInteger[] bigIntegerArrZzX6 = zzz24.zzX6(bArrDecode);
                    zzz24.zzZ(false, (zzYV3) zzyvbZzXG6.zzXCP());
                    if (zzz24.zzZ(bArrDecode, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1])) {
                        return;
                    }
                    zzYZD.zzTQ("KAT signature not verified");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ24 zzz24) throws Exception {
                    zzZ(zzz24);
                }
            });
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    public static final class zzY {
        private final zzZ zzWh9;
        private final zzZ1J zzWhV;
        private final SecureRandom zzWk5;

        public zzY(zzZ zzz, SecureRandom secureRandom) {
            this(zzZ0P.zzZ.zzWdH, zzz, secureRandom);
        }

        public final zzZ36 zzXFq() {
            if (this.zzWh9.zzWl1 == null) {
                zzZ25 zzz25 = new zzZ25(zzZ0P.zzU(this.zzWhV));
                zzz25.zzZ(new zzYSQ(this.zzWh9.f51298L, this.zzWh9.f51299N, this.zzWh9.zzWjt, this.zzWk5, this.zzWh9.zzWkM));
                zzYSP zzyspZzXG3 = zzz25.zzXG3();
                zzYSM zzysmZzXCm = zzyspZzXG3.zzXCm();
                return new zzZ36(zzyspZzXG3.getP(), zzyspZzXG3.getQ(), zzyspZzXG3.getG(), new zzZ35(zzysmZzXCm.getSeed(), zzysmZzXCm.zzXGp(), zzysmZzXCm.zzXGn()));
            }
            if (this.zzWh9.zzWoA == null || this.zzWh9.zzWkM < 0) {
                return new zzZ36(this.zzWh9.zzWl1, this.zzWh9.zzWl0, zzZ25.zzY(this.zzWh9.zzWl1, this.zzWh9.zzWl0, this.zzWk5), null);
            }
            return new zzZ36(this.zzWh9.zzWl1, this.zzWh9.zzWl0, zzZ25.zzZ(zzZ0P.zzU(this.zzWhV), this.zzWh9.zzWl1, this.zzWh9.zzWl0, this.zzWh9.zzWoA, this.zzWh9.zzWkM), new zzZ35(this.zzWh9.zzWoA, -1, this.zzWh9.zzWkM));
        }

        public zzY(zzZ1J zzz1j, zzZ zzz, SecureRandom secureRandom) {
            if (zzZ5L.zzXH0()) {
                int i = zzz.f51298L;
                if (i != 2048 && i != 3072) {
                    throw new zzZ0H(o0Oo0oo.OooO0O0(i, "Attempt to create parameters with unapproved key size [", "]"), zzZ1K.zzWjd);
                }
                zzYZF.zzZ(secureRandom, zzYZF.zzfx(i), zzZ1K.zzWjd, "Attempt to create parameters with unapproved RNG");
            }
            this.zzWhV = zzz1j;
            this.zzWh9 = zzz;
            this.zzWk5 = secureRandom;
        }
    }

    public static final class zzZ extends zzZ0S {

        /* JADX INFO: renamed from: L */
        private final int f51298L;

        /* JADX INFO: renamed from: N */
        private final int f51299N;
        private final int zzWjt;
        private final int zzWkM;
        private final BigInteger zzWl0;
        private final BigInteger zzWl1;
        private final byte[] zzWoA;

        public zzZ(int i) {
            this(i, i > 1024 ? 256 : 160, zzYUL.zzf4(i));
        }

        private zzZ(int i, int i2, int i3) {
            this(i, i2, i3, null, null, null, -1);
        }

        public zzZ(int i, int i2, int i3, int i4) {
            this(i, i2, i3, null, null, null, i4);
        }

        public zzZ(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i) {
            this(bigInteger.bitLength(), bigInteger2.bitLength(), 0, bigInteger, bigInteger2, zzYGU.zzVI(bArr), i);
        }

        public zzZ(int i, int i2, int i3, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i4) {
            super(zzZ1K.zzWjd);
            if (zzZ5L.zzXH0() && bigInteger == null && i3 < zzYUL.zzf4(i)) {
                throw new zzZ0H(C20856OooooOo.OooO0O0("Prime generation certainty ", i3, " inadequate for parameters of ", " bits", i), zzXF4());
            }
            if (i4 <= 255) {
                this.f51298L = i;
                this.f51299N = i2;
                this.zzWjt = i3;
                this.zzWl1 = bigInteger;
                this.zzWl0 = bigInteger2;
                this.zzWoA = bArr;
                this.zzWkM = i4;
                return;
            }
            throw new IllegalArgumentException("Usage index must be in range 0 to 255 (or -1 to ignore)");
        }
    }

    static {
        zzX zzx = new zzX((byte) 0);
        zzx.zzXFZ();
        zzWhb = zzx;
    }

    private zzZ1K() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzW(zzYVB zzyvb) {
        zzYZG.zzZ(zzWjd, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzZ1K.2
            private static boolean zzX(zzYVB zzyvb2) {
                byte[] bArrDecode = zzYGC.decode("576a1f885e3420128c8a656097ba7d8bb4c6f1b1853348cf2ba976971dbdbefc");
                zzZ24 zzz24 = new zzZ24();
                zzz24.zzZ(true, (zzYV3) new zzYS3(zzyvb2.zzXCO(), zzYZF.zzWbb));
                BigInteger[] bigIntegerArrZzX6 = zzz24.zzX6(bArrDecode);
                zzz24.zzZ(false, (zzYV3) zzyvb2.zzXCP());
                return zzz24.zzZ(bArrDecode, bigIntegerArrZzX6[0], bigIntegerArrZzX6[1]);
            }

            @Override // com.aspose.words.internal.zzYRU
            public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                return zzX(zzyvb2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSO zzZ(final zzZ3W zzz3w) {
        return (zzYSO) AccessController.doPrivileged(new PrivilegedAction<zzYSO>() { // from class: com.aspose.words.internal.zzZ1K.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXFr, reason: merged with bridge method [inline-methods] */
            public zzYSO run() {
                return new zzYSO(zzz3w.getX(), zzZ1K.zzY(zzz3w.zzXGC()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSP zzY(zzZ36 zzz36) {
        return new zzYSP(zzz36.getP(), zzz36.getQ(), zzz36.getG());
    }
}
