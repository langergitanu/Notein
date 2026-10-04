package com.aspose.words.internal;

import Oooo0.C20856OooooOo;
import Oooo0oO.o0Oo0oo;
import com.aspose.words.internal.zzZ0P;
import com.aspose.words.internal.zzZ1K;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ1M {
    static final zzZ1E<zzZ28> zzWii;
    static final zzZ1E<zzZ04> zzWij;
    static final zzZ1E<zzZ2D> zzWik;
    public static final zzZ1P zzWjd = new zzZ1P("DH");
    private static final zzZ1P zzWih = new zzZ1P("DH", zzK.DH);
    private static final zzZ1P zzWig = new zzZ1P("DH", zzK.MQV);
    private static final zzZ1P zzWif = new zzZ1P("DH", zzK.DHU);
    public static final zzZ zzWie = new zzZ();
    public static final zzM zzWid = new zzM();
    public static final zzU zzWic = new zzU();

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZ1M$6 */
    public static /* synthetic */ class C157376 {
        static final /* synthetic */ int[] zzWia;

        static {
            int[] iArr = new int[zzK.values().length];
            zzWia = iArr;
            try {
                iArr[zzK.DH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWia[zzK.MQV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzWia[zzK.DHU.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum zzK {
        DH,
        MQV,
        DHU
    }

    public static class zzL extends zzZ1E<zzZ04> {
        static final BigInteger zzWi9 = new BigInteger("52b800582b28e89d8ee581014ea4a1bc59cc3cc202562788ac40cbf9b1b11657019b556f112ecc9404b1de17630edcd0b8f9f4075e39624e94074b5060d3e699f726873b16e6ec49bdf689bcc275477da4170c7bbe93bfd5bc32a9556311d3f54d0e534118363deda2e3d25b6213b3d01f218c3f1d237967d128cd5a0f0caca8e287fd599d48ce297c8d92a4b7b2d95950a8ddb0e86e7b9bdc6abab91f758613762d185b2a5f516434f96c1bcba67f47bb780ade54dfa6a4f6a8d130aca76f9b28d77ef5eae1e254e5b61526b8c0fecf11b22e8630ebdd5e95f3902954526bd99eb8735263855b5f4d1ea32f6a0d2895ed292e9bb17a07ba1742a1619f4d95c9", 16);

        private zzL() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFF, reason: merged with bridge method [inline-methods] */
        public zzZ04 zzXFZ() {
            return (zzZ04) zzYZG.zzZ(zzZ1M.zzWig, new zzZ04(), new zzYZD<zzZ04>() { // from class: com.aspose.words.internal.zzZ1M.zzL.1
                private static void zzZ(zzZ04 zzz04) throws Exception {
                    zzYVB zzyvbZzXFP = zzZ1M.zzXFP();
                    zzYVB zzyvbZzZ = zzZ1M.zzZ(zzyvbZzXFP);
                    zzYVB zzyvbZzZ2 = zzZ1M.zzZ(zzyvbZzXFP);
                    zzz04.zzZ(new zzYS6((zzYSW) zzyvbZzXFP.zzXCO(), (zzYSW) zzyvbZzXFP.zzXCO()));
                    if (zzL.zzWi9.equals(zzz04.zzY(new zzYS5((zzYSV) zzyvbZzZ.zzXCP(), (zzYSV) zzyvbZzZ2.zzXCP())))) {
                        return;
                    }
                    zzYZD.zzTQ("KAT DH MQV agreement not verified");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ04 zzz04) throws Exception {
                    zzZ(zzz04);
                }
            });
        }

        public /* synthetic */ zzL(byte b) {
            this();
        }
    }

    public static final class zzM extends zzZ0S {
        public zzM() {
            super(zzZ1M.zzWig);
        }

        public static zzN zzY(zzZ3Z zzz3z, zzZ3Y zzz3y) {
            return new zzN(null, zzz3z, zzz3y);
        }

        public static zzN zzY(zzZ3Y zzz3y, zzZ3Z zzz3z, zzZ3Y zzz3y2) {
            return new zzN(zzz3y, zzz3z, zzz3y2);
        }
    }

    public static final class zzN extends zzZ1Q {
        private final zzZ3Y zzWhZ;
        private final zzZ3Z zzWi0;
        private final zzZ3Y zzWi1;

        public /* synthetic */ zzN(zzZ3Y zzz3y, zzZ3Z zzz3z, zzZ3Y zzz3y2) {
            this(zzz3y, zzz3z, zzz3y2, null);
        }

        public final zzZ3Y zzXFG() {
            return this.zzWhZ;
        }

        private zzN(zzZ3Y zzz3y, zzZ3Z zzz3z, zzZ3Y zzz3y2, zzZ1P zzz1p) {
            super(zzZ1M.zzWig, null);
            this.zzWi1 = zzz3y;
            this.zzWi0 = zzz3z;
            this.zzWhZ = zzz3y2;
        }
    }

    public static final class zzO extends zzZ1R<zzN> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ1R, com.aspose.words.internal.zzZ5X
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public zzZ1S<zzN> zzZ(zzZ5S zzz5s, final zzN zzn) {
            zzYSW zzyswZzZ = zzZ1M.zzZ((zzZ3Z) zzz5s);
            final zzZ04 zzz04ZzXFZ = zzZ1M.zzWij.zzXFZ();
            zzz04ZzXFZ.zzZ(new zzYS6(zzyswZzZ, zzn.zzWi0 == null ? zzyswZzZ : zzZ1M.zzZ(zzn.zzWi0)));
            return new zzZ1S<zzN>() { // from class: com.aspose.words.internal.zzZ1M.zzO.1
                @Override // com.aspose.words.internal.zzZ5Y
                public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                    return zzn;
                }

                @Override // com.aspose.words.internal.zzZ5Y
                public final byte[] zzZ(zzZ5R zzz5r) {
                    zzZ3Y zzz3y = (zzZ3Y) zzz5r;
                    zzYSV zzysv = new zzYSV(zzz3y.getY(), zzZ1M.zzZ(zzz3y.zzXGD()));
                    int fieldSize = zzz04ZzXFZ.getFieldSize();
                    zzZ3Y zzz3yZzXFG = zzn.zzXFG();
                    return zzZ1D.zzZ(zzYGT.zzU(fieldSize, zzz04ZzXFZ.zzY(new zzYS5(zzysv, new zzYSV(zzz3yZzXFG.getY(), zzZ1M.zzZ(zzz3yZzXFG.zzXGD()))))), zzn);
                }
            };
        }
    }

    public static final class zzP extends zzZ1O {
        private final zzZ2B zzWhU;
        private final zzYSZ zzWju;
        private final zzZ38 zzWly;

        public zzP(zzQ zzq, SecureRandom secureRandom) {
            super(zzq);
            zzZ2B zzz2b = new zzZ2B();
            this.zzWhU = zzz2b;
            if (zzZ5L.zzXH0()) {
                int iBitLength = zzq.zzWly.getP().bitLength();
                if (iBitLength < 2048) {
                    throw new zzZ0H("Attempt to create key of less than 2048 bits", zzq.zzXF4());
                }
                zzYZF.zzY(secureRandom, zzYZF.zzfx(iBitLength), zzZ1M.zzWjd);
            }
            zzYSZ zzysz = new zzYSZ(secureRandom, zzZ1M.zzZ(zzq.zzXGD()));
            this.zzWju = zzysz;
            this.zzWly = zzq.zzXGD();
            zzz2b.zzZ(zzysz);
        }

        @Override // com.aspose.words.internal.zzZ5U
        public final zzZ3G<zzZ3Y, zzZ3Z> zzXH4() {
            zzYVB zzyvbZzXG6 = this.zzWhU.zzXG6();
            zzYSV zzysv = (zzYSV) zzyvbZzXG6.zzXCP();
            zzYSW zzysw = (zzYSW) zzyvbZzXG6.zzXCO();
            zzZ1P zzz1p = (zzZ1P) zzXH6().zzXGV();
            zzZ1M.zzZ(zzz1p, zzyvbZzXG6);
            return new zzZ3G<>(new zzZ3Y(zzz1p, this.zzWly, zzysv.getY()), new zzZ3Z(zzz1p, this.zzWly, zzysw.getX()));
        }
    }

    public static final class zzQ extends zzZ0S {
        private final zzZ38 zzWly;

        public zzQ(zzZ38 zzz38) {
            this(zzZ1M.zzWjd, zzz38);
        }

        public final zzZ38 zzXGD() {
            return this.zzWly;
        }

        private zzQ(zzZ1P zzz1p, zzZ38 zzz38) {
            super(zzz1p);
            this.zzWly = zzz38;
        }
    }

    public static final class zzR {
        private final zzZ1J zzWhV;
        private final zzS zzWhW;
        private final SecureRandom zzWk5;

        public zzR(zzS zzs, SecureRandom secureRandom) {
            this(zzZ0P.zzZ.zzWdH, zzs, secureRandom);
        }

        public final zzZ38 zzXFH() {
            if (this.zzWhW.f51301L >= 2048) {
                zzZ36 zzz36ZzXFq = new zzZ1K.zzY(this.zzWhV, new zzZ1K.zzZ(this.zzWhW.f51301L, this.zzWhW.f51302N, this.zzWhW.zzWjt, this.zzWhW.zzWl1, this.zzWhW.zzWl0, this.zzWhW.zzWoA, this.zzWhW.zzWkM), this.zzWk5).zzXFq();
                zzZ35 zzz35ZzXGo = zzz36ZzXFq.zzXGo();
                return zzz35ZzXGo != null ? new zzZ38(zzz36ZzXFq.getP(), zzz36ZzXFq.getQ(), zzz36ZzXFq.getG(), null, new zzZ37(zzz35ZzXGo.getSeed(), zzz35ZzXGo.zzXGp(), zzz35ZzXGo.zzXGn())) : new zzZ38(zzz36ZzXFq.getP(), zzz36ZzXFq.getQ(), zzz36ZzXFq.getG());
            }
            if (zzZ5L.zzXH0()) {
                throw new zzZ0H("Requested DH parameter strength too small for approved mode: " + this.zzWhW.f51301L);
            }
            zzZ2A zzz2a = new zzZ2A();
            zzz2a.zzZ(this.zzWhW.f51301L, this.zzWhW.zzWjt, this.zzWk5);
            zzYSX zzysxZzXG5 = zzz2a.zzXG5();
            return new zzZ38(zzysxZzXG5.getP(), zzysxZzXG5.getQ(), zzysxZzXG5.getG(), zzysxZzXG5.zzXHB(), null);
        }

        private zzR(zzZ1J zzz1j, zzS zzs, SecureRandom secureRandom) {
            if (zzZ5L.zzXH0()) {
                int i = zzs.f51301L;
                if (i != 2048 && i != 3072) {
                    throw new zzZ0H(o0Oo0oo.OooO0O0(i, "Attempt to create parameters with unapproved key size [", "]"), zzZ1M.zzWjd);
                }
                zzYZF.zzZ(secureRandom, zzYZF.zzfx(i), zzZ1M.zzWjd, "Attempt to create parameters with unapproved RNG");
            }
            this.zzWhV = zzz1j;
            this.zzWhW = zzs;
            this.zzWk5 = secureRandom;
        }
    }

    public static final class zzS extends zzZ0S {

        /* JADX INFO: renamed from: L */
        private final int f51301L;

        /* JADX INFO: renamed from: N */
        private final int f51302N;
        private final int zzWjt;
        private final int zzWkM;
        private final BigInteger zzWl0;
        private final BigInteger zzWl1;
        private final byte[] zzWoA;

        public zzS(int i) {
            this(i, i > 1024 ? 256 : 160, zzYUL.zzf4(i));
        }

        private zzS(int i, int i2, int i3) {
            this(i, i2, i3, (byte) 0);
        }

        private zzS(int i, int i2, int i3, byte b) {
            super(zzZ1M.zzWjd);
            if (zzZ5L.zzXH0() && i3 < zzYUL.zzf4(i)) {
                throw new zzZ0H(C20856OooooOo.OooO0O0("Prime generation certainty ", i3, " inadequate for parameters of ", " bits", i), zzXF4());
            }
            this.f51301L = i;
            this.f51302N = i2;
            this.zzWjt = i3;
            this.zzWl1 = null;
            this.zzWl0 = null;
            this.zzWoA = null;
            this.zzWkM = -1;
        }
    }

    public static class zzT extends zzZ1E<zzZ28> {
        static final byte[] zzWhY = zzYGC.decode("8b2ba83764fc961a7aeb335d67aa206c1013be9127e2d37a43fa7fff45dd13d4699173a727f4fc88b66d5f53c8848667c090adb2879501d1f7fe53b430beb220b6cce85c5bff74c61b16dbc788ab1459eec1b6f03455862324210e72f7e1f01a55f464bbd996267d3693cdc61053d87a17cb93f6e5079188377db48774bc9232552440471218ec2834e0e29fcdba7e0b7caf9a8f679c4e4382f83f66f8a4dd61cc5d91d15440f10a0f76c3e3a495e7cc53993ba7fb3231310c79e2b587a10074030f158a560e85c89642da9c883f78947116d8ea0d94bfe77c6fb07a7fca8c524827f5779aa7f5428fec0d282f8aca22dd1d47ed61eb6584b5444c5344ab716e8b2ba83764fc961a7aeb335d67aa206c1013be9127e2d37a43fa7fff45dd13d4699173a727f4fc88b66d5f53c8848667c090adb2879501d1f7fe53b430beb220b6cce85c5bff74c61b16dbc788ab1459eec1b6f03455862324210e72f7e1f01a55f464bbd996267d3693cdc61053d87a17cb93f6e5079188377db48774bc9232552440471218ec2834e0e29fcdba7e0b7caf9a8f679c4e4382f83f66f8a4dd61cc5d91d15440f10a0f76c3e3a495e7cc53993ba7fb3231310c79e2b587a10074030f158a560e85c89642da9c883f78947116d8ea0d94bfe77c6fb07a7fca8c524827f5779aa7f5428fec0d282f8aca22dd1d47ed61eb6584b5444c5344ab716e");

        private zzT() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFI, reason: merged with bridge method [inline-methods] */
        public zzZ28 zzXFZ() {
            return (zzZ28) zzYZG.zzZ(zzZ1M.zzWif, new zzZ28(), new zzYZD<zzZ28>() { // from class: com.aspose.words.internal.zzZ1M.zzT.1
                private static void zzZ(zzZ28 zzz28) throws Exception {
                    zzYVB zzyvbZzXFP = zzZ1M.zzXFP();
                    zzYVB zzyvbZzZ = zzZ1M.zzZ(zzyvbZzXFP);
                    zzYVB zzyvbZzZ2 = zzZ1M.zzZ(zzyvbZzXFP);
                    zzz28.zzZ(new zzYSU((zzYSW) zzyvbZzXFP.zzXCO(), (zzYSW) zzyvbZzXFP.zzXCO()));
                    if (zzYGU.zzp(zzT.zzWhY, zzz28.zzX(new zzYST((zzYSV) zzyvbZzZ.zzXCP(), (zzYSV) zzyvbZzZ2.zzXCP())))) {
                        return;
                    }
                    zzYZD.zzTQ("KAT DH DHU agreement not verified");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ28 zzz28) throws Exception {
                    zzZ(zzz28);
                }
            });
        }

        public /* synthetic */ zzT(byte b) {
            this();
        }
    }

    public static final class zzU extends zzZ0S {
        public zzU() {
            super(zzZ1M.zzWif);
        }

        public static zzV zzZ(zzZ3Z zzz3z, zzZ3Y zzz3y) {
            return new zzV(null, zzz3z, zzz3y);
        }

        public static zzV zzZ(zzZ3Y zzz3y, zzZ3Z zzz3z, zzZ3Y zzz3y2) {
            return new zzV(zzz3y, zzz3z, zzz3y2);
        }
    }

    public static final class zzV extends zzZ1Q {
        private final zzZ3Y zzWhZ;
        private final zzZ3Z zzWi0;
        private final zzZ3Y zzWi1;

        public /* synthetic */ zzV(zzZ3Y zzz3y, zzZ3Z zzz3z, zzZ3Y zzz3y2) {
            this(zzz3y, zzz3z, zzz3y2, null);
        }

        private zzV(zzZ3Y zzz3y, zzZ3Z zzz3z, zzZ3Y zzz3y2, zzZ1P zzz1p) {
            super(zzZ1M.zzWif, null);
            this.zzWi1 = zzz3y;
            this.zzWi0 = zzz3z;
            this.zzWhZ = zzz3y2;
        }
    }

    public static final class zzW extends zzZ1R<zzV> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ1R, com.aspose.words.internal.zzZ5X
        public zzZ1S<zzV> zzZ(zzZ5S zzz5s, final zzV zzv) {
            zzYSU zzysu = new zzYSU(zzZ1M.zzZ((zzZ3Z) zzz5s), zzZ1M.zzZ(zzv.zzWi0));
            final zzZ28 zzz28ZzXFZ = zzZ1M.zzWii.zzXFZ();
            zzz28ZzXFZ.zzZ(zzysu);
            return new zzZ1S<zzV>() { // from class: com.aspose.words.internal.zzZ1M.zzW.1
                @Override // com.aspose.words.internal.zzZ5Y
                public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                    return zzv;
                }

                @Override // com.aspose.words.internal.zzZ5Y
                public final byte[] zzZ(zzZ5R zzz5r) {
                    zzZ3Y zzz3y = (zzZ3Y) zzz5r;
                    zzYSV zzysv = new zzYSV(zzz3y.getY(), zzZ1M.zzZ(zzz3y.zzXGD()));
                    return zzZ1D.zzZ(zzz28ZzXFZ.zzX(new zzYST(zzysv, new zzYSV(zzv.zzWhZ.getY(), zzysv.zzXCt()))), zzv);
                }
            };
        }
    }

    public static final class zzX extends zzZ1R<zzZ> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzZ1R, com.aspose.words.internal.zzZ5X
        public zzZ1S<zzZ> zzZ(zzZ5S zzz5s, final zzZ zzz) {
            zzYSW zzyswZzZ = zzZ1M.zzZ((zzZ3Z) zzz5s);
            final zzZ2D zzz2dZzXFZ = zzZ1M.zzWik.zzXFZ();
            zzz2dZzXFZ.zzZ(zzyswZzZ);
            return new zzZ1S<zzZ>() { // from class: com.aspose.words.internal.zzZ1M.zzX.1
                @Override // com.aspose.words.internal.zzZ5Y
                public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                    return zzz;
                }

                @Override // com.aspose.words.internal.zzZ5Y
                public final byte[] zzZ(zzZ5R zzz5r) {
                    zzZ3Y zzz3y = (zzZ3Y) zzz5r;
                    return zzZ1D.zzZ(zzYGT.zzU(zzz2dZzXFZ.getFieldSize(), zzz2dZzXFZ.zzY(new zzYSV(zzz3y.getY(), zzZ1M.zzZ(zzz3y.zzXGD())))), zzz);
                }
            };
        }
    }

    public static class zzY extends zzZ1E<zzZ2D> {
        static final BigInteger zzWi9 = new BigInteger("8b2ba83764fc961a7aeb335d67aa206c1013be9127e2d37a43fa7fff45dd13d4699173a727f4fc88b66d5f53c8848667c090adb2879501d1f7fe53b430beb220b6cce85c5bff74c61b16dbc788ab1459eec1b6f03455862324210e72f7e1f01a55f464bbd996267d3693cdc61053d87a17cb93f6e5079188377db48774bc9232552440471218ec2834e0e29fcdba7e0b7caf9a8f679c4e4382f83f66f8a4dd61cc5d91d15440f10a0f76c3e3a495e7cc53993ba7fb3231310c79e2b587a10074030f158a560e85c89642da9c883f78947116d8ea0d94bfe77c6fb07a7fca8c524827f5779aa7f5428fec0d282f8aca22dd1d47ed61eb6584b5444c5344ab716e", 16);

        private zzY() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXFJ, reason: merged with bridge method [inline-methods] */
        public zzZ2D zzXFZ() {
            return (zzZ2D) zzYZG.zzZ(zzZ1M.zzWih, new zzZ2D(), new zzYZD<zzZ2D>() { // from class: com.aspose.words.internal.zzZ1M.zzY.1
                private static void zzZ(zzZ2D zzz2d) throws Exception {
                    zzYVB zzyvbZzXFP = zzZ1M.zzXFP();
                    zzYVB zzyvbZzZ = zzZ1M.zzZ(zzyvbZzXFP);
                    zzz2d.zzZ(zzyvbZzXFP.zzXCO());
                    if (zzY.zzWi9.equals(zzz2d.zzY(zzyvbZzZ.zzXCP()))) {
                        return;
                    }
                    zzYZD.zzTQ("KAT DH agreement not verified");
                }

                @Override // com.aspose.words.internal.zzYZD
                public final /* synthetic */ void zzWN(zzZ2D zzz2d) throws Exception {
                    zzZ(zzz2d);
                }
            });
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    public static final class zzZ extends zzZ1Q {
        public zzZ() {
            this((byte) 0);
        }

        private zzZ(byte b) {
            super(zzZ1M.zzWjd, null);
        }
    }

    static {
        byte b = 0;
        zzY zzy = new zzY(b);
        zzWik = zzy;
        zzL zzl = new zzL(b);
        zzWij = zzl;
        zzT zzt = new zzT(b);
        zzWii = zzt;
        zzy.zzXFZ();
        zzl.zzXFZ();
        zzt.zzXFZ();
        zzXFQ();
    }

    private zzZ1M() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYVB zzXFP() {
        BigInteger bigInteger = new BigInteger("90EAF4D1AF0708B1B612FF35E0A2997EB9E9D263C9CE659528945C0D", 16);
        BigInteger bigInteger2 = new BigInteger("C196BA05AC29E1F9C3C72D56DFFC6154A033F1477AC88EC37F09BE6C5BB95F51C296DD20D1A28A067CCC4D4316A4BD1DCA55ED1066D438C35AEBAABF57E7DAE428782A95ECA1C143DB701FD48533A3C18F0FE23557EA7AE619ECACC7E0B51652A8776D02A425567DED36EABD90CA33A1E8D988F0BBB92D02D1D20290113BB562CE1FC856EEB7CDD92D33EEA6F410859B179E7E789A8F75F645FAE2E136D252BFFAFF89528945C1ABE705A38DBC2D364AADE99BE0D0AAD82E5320121496DC65B3930E38047294FF877831A16D5228418DE8AB275D7D75651CEFED65F78AFC3EA7FE4D79B35F62A0402A1117599ADAC7B269A59F353CF450E6982D3B1702D9CA83", 16);
        BigInteger bigInteger3 = new BigInteger("A59A749A11242C58C894E9E5A91804E8FA0AC64B56288F8D47D51B1EDC4D65444FECA0111D78F35FC9FDD4CB1F1B79A3BA9CBEE83A3F811012503C8117F98E5048B089E387AF6949BF8784EBD9EF45876F2E6A5A495BE64B6E770409494B7FEE1DBB1E4B2BC2A53D4F893D418B7159592E4FFFDF6969E91D770DAEBD0B5CB14C00AD68EC7DC1E5745EA55C706C4A1C5C88964E34D09DEB753AD418C1AD0F4FDFD049A955E5D78491C0B7A2F1575A008CCD727AB376DB6E695515B05BD412F5B8C2F4C77EE10DA48ABD53F5DD498927EE7B692BBBCDA2FB23A516C5B4533D73980B2A3B60E384ED200AE21B40D273651AD6060C13D97FD69AA13C5611A51B9085", 16);
        BigInteger bigInteger4 = new BigInteger("80d54802e42ce811d122ce2657c303013fc33c2f08f8ff1a9c4ebfd1", 16);
        BigInteger bigInteger5 = new BigInteger("76277e7f847626c252c76828a6142b75e92aaa69612c789686686f447d7361f58c54dac02f23a672157a239dedefaeadecdd94b8f581ec086d152517532c2a8465983f51a643491ddcc328792c9795674ba630b47f364670432d826e2733bc85a666c64e3607d599b125b79ff5a179c88ceee1972d3da80c77c7652b0dc2930f0bf81be1a782e27f35f82848ea0e1f2d4ff6d0c6a739bbc61bdb646d1a189a10421a76c2942254ec92e7f7d3bec0b6066eb70c9de6be50409e25f7d0e0b93fcc08a9f2694253238c6889a909f22b636924e54f6b12392ddf5016633646476b74257ffbb486723f1a3167c93f0e577c4e6d3734f4af38153c76850374c067e6c7", 16);
        zzYSX zzysx = new zzYSX(bigInteger2, bigInteger3, bigInteger);
        return new zzYVB(new zzYSV(bigInteger5, zzysx), new zzYSW(bigInteger4, zzysx));
    }

    private static void zzXFQ() {
        zzZ1P zzz1p = zzWjd;
        zzYZG.zzZ(zzz1p, new zzYZE(zzz1p) { // from class: com.aspose.words.internal.zzZ1M.4
            @Override // com.aspose.words.internal.zzYZE
            public final void zzXG9() throws Exception {
                zzYVB zzyvbZzXFP = zzZ1M.zzXFP();
                zzYSW zzysw = (zzYSW) zzyvbZzXFP.zzXCO();
                if (((zzYSV) zzyvbZzXFP.zzXCP()).getY().equals(zzysw.zzXCt().getG().modPow(zzysw.getX(), zzysw.zzXCt().getP()))) {
                    return;
                }
                zzYZE.zzTQ("FF primitive 'Z' computation failed");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzZ(zzZ1P zzz1p, zzYVB zzyvb) {
        int i = C157376.zzWia[(zzz1p == zzWjd ? zzK.DH : (zzK) zzz1p.zzXFS()).ordinal()];
        if (i == 1) {
            zzYZG.zzZ(zzz1p, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzZ1M.1
                private static boolean zzX(zzYVB zzyvb2) throws Exception {
                    zzZ2D zzz2d = new zzZ2D();
                    zzz2d.zzZ(zzyvb2.zzXCO());
                    BigInteger bigIntegerZzY = zzz2d.zzY(zzyvb2.zzXCP());
                    zzYVB zzyvbZzZ = zzZ1M.zzZ(zzyvb2);
                    zzz2d.zzZ(zzyvbZzZ.zzXCO());
                    BigInteger bigIntegerZzY2 = zzz2d.zzY(zzyvbZzZ.zzXCP());
                    zzz2d.zzZ(zzyvb2.zzXCO());
                    BigInteger bigIntegerZzY3 = zzz2d.zzY(zzyvbZzZ.zzXCP());
                    zzz2d.zzZ(zzyvbZzZ.zzXCO());
                    return (bigIntegerZzY.equals(bigIntegerZzY2) || bigIntegerZzY.equals(bigIntegerZzY3) || !bigIntegerZzY3.equals(zzz2d.zzY(zzyvb2.zzXCP()))) ? false : true;
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
            return;
        }
        if (i == 2) {
            zzYZG.zzZ(zzz1p, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzZ1M.2
                private static boolean zzX(zzYVB zzyvb2) throws Exception {
                    zzZ04 zzz04 = new zzZ04();
                    zzz04.zzZ(new zzYS6((zzYSW) zzyvb2.zzXCO(), (zzYSW) zzyvb2.zzXCO()));
                    BigInteger bigIntegerZzY = zzz04.zzY(new zzYS5((zzYSV) zzyvb2.zzXCP(), (zzYSV) zzyvb2.zzXCP()));
                    zzYVB zzyvbZzZ = zzZ1M.zzZ(zzyvb2);
                    zzYVB zzyvbZzZ2 = zzZ1M.zzZ(zzyvb2);
                    zzz04.zzZ(new zzYS6((zzYSW) zzyvb2.zzXCO(), (zzYSW) zzyvb2.zzXCO()));
                    BigInteger bigIntegerZzY2 = zzz04.zzY(new zzYS5((zzYSV) zzyvbZzZ.zzXCP(), (zzYSV) zzyvbZzZ2.zzXCP()));
                    zzz04.zzZ(new zzYS6((zzYSW) zzyvbZzZ.zzXCO(), (zzYSW) zzyvbZzZ2.zzXCO()));
                    return !bigIntegerZzY.equals(bigIntegerZzY2) && bigIntegerZzY2.equals(zzz04.zzY(new zzYS5((zzYSV) zzyvb2.zzXCP(), (zzYSV) zzyvb2.zzXCP())));
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
        } else if (i == 3) {
            zzYZG.zzZ(zzz1p, zzyvb, new zzYRU<zzYVB>() { // from class: com.aspose.words.internal.zzZ1M.3
                private static boolean zzX(zzYVB zzyvb2) throws Exception {
                    zzZ28 zzz28 = new zzZ28();
                    zzz28.zzZ(new zzYSU((zzYSW) zzyvb2.zzXCO(), (zzYSW) zzyvb2.zzXCO()));
                    byte[] bArrZzX = zzz28.zzX(new zzYST((zzYSV) zzyvb2.zzXCP(), (zzYSV) zzyvb2.zzXCP()));
                    zzYVB zzyvbZzZ = zzZ1M.zzZ(zzyvb2);
                    zzYVB zzyvbZzZ2 = zzZ1M.zzZ(zzyvb2);
                    zzz28.zzZ(new zzYSU((zzYSW) zzyvb2.zzXCO(), (zzYSW) zzyvb2.zzXCO()));
                    byte[] bArrZzX2 = zzz28.zzX(new zzYST((zzYSV) zzyvbZzZ.zzXCP(), (zzYSV) zzyvbZzZ2.zzXCP()));
                    zzz28.zzZ(new zzYSU((zzYSW) zzyvbZzZ.zzXCO(), (zzYSW) zzyvbZzZ2.zzXCO()));
                    return !zzYGU.zzp(bArrZzX, bArrZzX2) && zzYGU.zzp(bArrZzX2, zzz28.zzX(new zzYST((zzYSV) zzyvb2.zzXCP(), (zzYSV) zzyvb2.zzXCP())));
                }

                @Override // com.aspose.words.internal.zzYRU
                public final /* synthetic */ boolean zzWO(zzYVB zzyvb2) throws Exception {
                    return zzX(zzyvb2);
                }
            });
        } else {
            throw new IllegalStateException("Unhandled DH algorithm: " + zzz1p.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYVB zzZ(zzYVB zzyvb) {
        zzYSW zzysw = (zzYSW) zzyvb.zzXCO();
        zzYSX zzysxZzXCt = zzysw.zzXCt();
        BigInteger bigIntegerMod = zzysw.getX().multiply(BigInteger.valueOf(7L)).mod(zzysw.getX());
        if (bigIntegerMod.compareTo(BigInteger.valueOf(2L)) < 0) {
            bigIntegerMod = new BigInteger("0102030405060708090a0b0c0d0e0f101112131415161718", 16);
        }
        return new zzYVB(new zzYSV(zzysxZzXCt.getG().modPow(bigIntegerMod, zzysxZzXCt.getP()), zzysxZzXCt), new zzYSW(bigIntegerMod, zzysxZzXCt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSX zzZ(zzZ38 zzz38) {
        return new zzYSX(zzz38.getP(), zzz38.getG(), zzz38.getQ(), zzz38.getM(), zzz38.getL(), zzz38.zzXHB());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzYSW zzZ(final zzZ3Z zzz3z) {
        return (zzYSW) AccessController.doPrivileged(new PrivilegedAction<zzYSW>() { // from class: com.aspose.words.internal.zzZ1M.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.security.PrivilegedAction
            /* JADX INFO: renamed from: zzXFK, reason: merged with bridge method [inline-methods] */
            public zzYSW run() {
                return new zzYSW(zzz3z.getX(), zzZ1M.zzZ(zzz3z.zzXGD()));
            }
        });
    }
}
