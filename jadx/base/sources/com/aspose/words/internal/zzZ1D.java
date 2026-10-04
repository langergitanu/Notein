package com.aspose.words.internal;

import com.aspose.words.internal.zzYZG;
import com.aspose.words.internal.zzZ0P;
import o000o0o.C24611OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ1D {
    private static zzYUV<zzYUX> zzWgv;
    public static final zzX zzWgw;
    public static final zzX zzWgx;
    private static final byte[] zzWko = new byte[1];
    public static final zzT zzWgG = new zzT(new zzZ1P("CounterMode"));
    public static final zzP zzWgF = new zzP(new zzZ1P("FeedbackMode"));
    public static final zzR zzWgE = new zzR(new zzZ1P("DoublePipelineIterationMode"));
    public static final zzF zzWgD = new zzF(new zzZ1P("SSH"), zzG.SHA1);
    public static final zzM zzWgC = new zzM(new zzZ1P("IKEv2"), zzN.SHA1);
    public static final zzH zzWgB = new zzH(new zzZ1P("SRTP"), zzI.AES_CM);
    public static final zzB zzWgA = new zzB(new zzZ1P("TLS1.0"));
    public static final zzB zzWgz = new zzB(new zzZ1P("TLS1.1"));
    public static final zzA zzWgy = new zzA(new zzZ1P("TLS1.2"), zzD.SHA256_HMAC);

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZ1D$4 */
    public static /* synthetic */ class C157064 {
        static final /* synthetic */ int[] zzWgs;

        static {
            int[] iArr = new int[zzJ.values().length];
            zzWgs = iArr;
            try {
                iArr[zzJ.AES_CMAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWgs[zzJ.TRIPLEDES_CMAC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzWgs[zzJ.SHA1_HMAC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzWgs[zzJ.SHA224_HMAC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzWgs[zzJ.SHA256_HMAC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zzWgs[zzJ.SHA384_HMAC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zzWgs[zzJ.SHA512_HMAC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zzWgs[zzJ.SHA512_224_HMAC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zzWgs[zzJ.SHA512_256_HMAC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static final class zzA extends zzB {
        private final zzD zzWfN;

        public zzA(zzZ1P zzz1p, zzD zzd) {
            super(zzz1p);
            this.zzWfN = zzd;
        }

        public final zzA zzY(zzD zzd) {
            return new zzA(zzXF4(), zzd);
        }

        @Override // com.aspose.words.internal.zzZ1D.zzB
        public final zzC zzZ(byte[] bArr, String str, byte[]... bArr2) {
            return new zzC(new zzZ1P(zzXF4(), this.zzWfN), zzYGU.zzVI(bArr), str, zzYGU.zzY(bArr2));
        }
    }

    public static class zzB extends zzZ0S {
        public zzB(zzZ1P zzz1p) {
            super(zzz1p);
        }

        public zzC zzZ(byte[] bArr, String str, byte[]... bArr2) {
            return new zzC(zzXF4(), zzYGU.zzVI(bArr), str, zzYGU.zzY(bArr2));
        }
    }

    public static final class zzC extends zzZ0S {
        private final String label;
        private final byte[] zzWfO;
        private final byte[] zzWoA;

        public zzC(zzZ1P zzz1p, byte[] bArr, String str, byte[] bArr2) {
            super(zzz1p);
            this.zzWfO = bArr;
            this.label = str;
            this.zzWoA = bArr2;
        }
    }

    public enum zzD {
        SHA256_HMAC(zzZ0P.zzZ.zzWdG),
        SHA384_HMAC(zzZ0P.zzZ.zzWdE),
        SHA512_HMAC(zzZ0P.zzZ.zzWdC);

        private final zzZ1P zzWjX;

        zzD(zzZ1P zzz1p) {
            this.zzWjX = zzz1p;
        }
    }

    public static final class zzE extends zzZ1C<zzC> {
        @Override // com.aspose.words.internal.zzZ59
        /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
        public final zzZ5A<zzC> zzY(final zzC zzc) {
            final zzD zzd = (zzD) zzc.zzXF4().zzXFS();
            zzYZF.zzZ(this.zzWlB, zzc.zzXF4());
            if (zzd != null) {
                return new zzK(this.zzWlB, new zzV<zzC>() { // from class: com.aspose.words.internal.zzZ1D.zzE.2
                    @Override // com.aspose.words.internal.zzZ1D.zzV
                    public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                        return zzc;
                    }

                    @Override // com.aspose.words.internal.zzZ1D.zzV
                    public final void zzz(byte[] bArr, int i, int i2) {
                        zzC zzc2 = zzc;
                        System.arraycopy(zzZ1D.zzZ(zzc2, zzd, zzc2.zzWfO, zzc.label, i2), 0, bArr, 0, i2);
                    }
                });
            }
            final zzYTV zzytv = new zzYTV((zzYUX) zzZ1D.zzWgv.zzXFZ());
            final zzYUR zzyurZzT = zzZ0P.zzT(zzZ0P.zzZ.zzWdK);
            return new zzK(this.zzWlB, new zzV<zzC>() { // from class: com.aspose.words.internal.zzZ1D.zzE.1
                @Override // com.aspose.words.internal.zzZ1D.zzV
                public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                    return zzc;
                }

                @Override // com.aspose.words.internal.zzZ1D.zzV
                public final void zzz(byte[] bArr, int i, int i2) {
                    zzC zzc2 = zzc;
                    System.arraycopy(zzZ1D.zzZ(zzc2, zzc2.zzWfO, zzc.label, i2, zzytv, zzyurZzT), 0, bArr, 0, i2);
                }
            });
        }
    }

    public static final class zzF extends zzZ0S {
        zzG zzWfV;

        public zzF(zzZ1P zzz1p, zzG zzg) {
            super(zzz1p);
            this.zzWfV = zzg;
        }
    }

    public enum zzG {
        SHA1(zzZ0P.zzZ.zzWdL),
        SHA224(zzZ0P.zzZ.zzWdJ),
        SHA256(zzZ0P.zzZ.zzWdH),
        SHA384(zzZ0P.zzZ.zzWdF),
        SHA512(zzZ0P.zzZ.zzWdD);

        private final zzZ1P zzWjX;

        zzG(zzZ1P zzz1p) {
            this.zzWjX = zzz1p;
        }
    }

    public static class zzH extends zzZ0S {
        private final zzI zzWfX;

        public zzH(zzZ1P zzz1p, zzI zzi) {
            super(zzz1p);
            this.zzWfX = zzi;
        }
    }

    public enum zzI {
        AES_CM(zzZ1T.zzWje);

        private final zzYUV<zzYV8> zzWfZ;
        private final zzZ1P zzWjX;

        zzI(zzYUV zzyuv) {
            this.zzWjX = zzz1p;
            this.zzWfZ = zzyuv;
        }
    }

    public enum zzJ {
        AES_CMAC(zzZ1T.zzWiR.zzXF4()),
        TRIPLEDES_CMAC(zzZ0I.zzWcK.zzXF4()),
        SHA1_HMAC(zzZ0P.zzZ.zzWdK),
        SHA224_HMAC(zzZ0P.zzZ.zzWdI),
        SHA256_HMAC(zzZ0P.zzZ.zzWdG),
        SHA384_HMAC(zzZ0P.zzZ.zzWdE),
        SHA512_HMAC(zzZ0P.zzZ.zzWdC),
        SHA512_224_HMAC(zzZ0P.zzZ.zzWdA),
        SHA512_256_HMAC(zzZ0P.zzZ.zzWdy);

        private final zzZ1P zzWjX;

        zzJ(zzZ1P zzz1p) {
            this.zzWjX = zzz1p;
        }

        public final zzZ1P zzXF4() {
            return this.zzWjX;
        }
    }

    public static class zzK<T extends zzZ4M> implements zzZ5A<T> {
        private final zzV<T> zzWg1;
        private final zzZ1P zzWjX;
        private final boolean zzWlB;

        public zzK(boolean z, zzV<T> zzv) {
            this.zzWlB = z;
            this.zzWg1 = zzv;
            this.zzWjX = (zzZ1P) zzv.zzXH6().zzXGV();
        }

        @Override // com.aspose.words.internal.zzZ5A
        public final void zzXi(byte[] bArr) {
            zzi(bArr, bArr.length);
        }

        @Override // com.aspose.words.internal.zzZ5A
        public final void zzi(byte[] bArr, int i) {
            zzYZF.zzZ(this.zzWlB, this.zzWjX);
            this.zzWg1.zzz(bArr, 0, i);
        }
    }

    public static class zzL implements zzYRV<zzYUX> {
        private static final byte[] zzWkl = zzYGI.zzwb("abc");
        private static final byte[] zzWkk = zzYGC.decode("900150983cd24fb0d6963f7d28e17f72");

        private zzL() {
        }

        private static boolean zzZ(zzYUX zzyux) {
            byte[] bArr = zzWkl;
            zzyux.update(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[zzyux.zzQI()];
            zzyux.doFinal(bArr2, 0);
            return zzYGU.zzp(bArr2, zzWkk);
        }

        @Override // com.aspose.words.internal.zzYRV
        public final /* synthetic */ boolean zzWO(zzYUX zzyux) throws Exception {
            return zzZ(zzyux);
        }

        public /* synthetic */ zzL(byte b) {
            this();
        }
    }

    public static class zzM extends zzZ0S {
        private final zzN zzWg2;

        public zzM(zzZ1P zzz1p, zzN zzn) {
            super(zzz1p);
            this.zzWg2 = zzn;
        }
    }

    public enum zzN {
        SHA1(zzZ0P.zzZ.zzWdK),
        SHA224(zzZ0P.zzZ.zzWdI),
        SHA256(zzZ0P.zzZ.zzWdG),
        SHA384(zzZ0P.zzZ.zzWdE),
        SHA512(zzZ0P.zzZ.zzWdC);

        private final zzZ1P zzWjX;

        zzN(zzZ1P zzz1p) {
            this.zzWjX = zzz1p;
        }
    }

    public static final class zzO extends zzZ1E<zzZ09> {
        private final zzZ1P zzWjX;
        private static final byte[] zzWgm = zzYGC.decode("dff1e50ac0b69dc40f1051d46c2b069c");
        private static final byte[] zzWg5 = {1};
        private static final byte[] zzWg7 = {2};
        private static final byte[] zzWgj = zzYGC.decode("af7eb5b9a3eb72a1a0cb");
        private static final byte[] zzWgi = zzYGC.decode("cf65681ac0d3c4f65ce0");
        private static final byte[] zzWgh = zzYGC.decode("bfe9d9a6cd8b7befe0fb");
        private static final byte[] zzWgg = zzYGC.decode("71d5790138202ab1edc9");
        private static final byte[] zzWgf = zzYGC.decode("650d3f9da0f4a8bcf602");
        private static final byte[] zzWge = zzYGC.decode("2a9375ae10e75a9a5ba2");
        private static final byte[] zzWgd = zzYGC.decode("e0f3f35c27358f3d0dda");
        private static final byte[] zzWgc = zzYGC.decode("5fd1372077522505be4a");
        private static final byte[] zzWgb = zzYGC.decode("ae930bec79b81ee15c67");

        public zzO(zzJ zzj) {
            this.zzWjX = new zzZ1P(zzZ1D.zzWgF.zzXF4(), zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] zzX(zzJ zzj) {
            switch (C157064.zzWgs[zzj.ordinal()]) {
                case 1:
                    return zzWgj;
                case 2:
                    return zzWgi;
                case 3:
                    return zzWgh;
                case 4:
                    return zzWgg;
                case 5:
                    return zzWgf;
                case 6:
                    return zzWge;
                case 7:
                    return zzWgd;
                case 8:
                    return zzWgc;
                case 9:
                    return zzWgb;
                default:
                    throw new zzYZG.zzZ("unknown PRF");
            }
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXEV, reason: merged with bridge method [inline-methods] */
        public final zzZ09 zzXFZ() {
            final zzJ zzj = (zzJ) this.zzWjX.zzXFS();
            return (zzZ09) zzYZG.zzZ(this.zzWjX, new zzZ09((zzYUR) zzZ1D.zzZ(zzj).zzXFZ()), new zzYZD<zzZ09>() { // from class: com.aspose.words.internal.zzZ1D.zzO.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.aspose.words.internal.zzYZD
                /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
                public void zzWN(zzZ09 zzz09) {
                    zzz09.zzZ(zzYSA.zzX(zzO.zzWgm, zzO.zzWg5, zzO.zzWg7));
                    byte[] bArr = new byte[10];
                    zzz09.zzC(bArr, 0, 10);
                    if (zzYGU.zzp(zzO.zzX(zzj), bArr)) {
                        return;
                    }
                    zzYZD.zzTQ("failed self test on generation: " + zzYGC.zzVE(bArr));
                }
            });
        }
    }

    public static final class zzP extends zzZ0S {
        private final zzU zzWg8;
        private final int zzWgn;
        private final zzJ zzWgo;

        public zzP(zzZ1P zzz1p) {
            this(zzz1p, zzJ.SHA1_HMAC);
        }

        private zzP(zzZ1P zzz1p, zzJ zzj) {
            super(zzz1p);
            this.zzWgo = zzj;
            this.zzWgn = -1;
            this.zzWg8 = null;
        }
    }

    public static final class zzQ extends zzZ1E<zzZ0A> {
        private final zzZ1P zzWjX;
        private static final byte[] zzWgm = zzYGC.decode("dff1e50ac0b69dc40f1051d46c2b069c");
        private static final byte[] zzWg7 = {2};
        private static final byte[] zzWgj = zzYGC.decode("ace76ed103e31681ed03");
        private static final byte[] zzWgi = zzYGC.decode("41d79be29b5c34ffa40d");
        private static final byte[] zzWgh = zzYGC.decode("e5e5666cb2a73b8ce638");
        private static final byte[] zzWgg = zzYGC.decode("c4c12b540e51d106abd8");
        private static final byte[] zzWgf = zzYGC.decode("b6c232a28b4b450210ee");
        private static final byte[] zzWge = zzYGC.decode("48268b8bf87297a5ce8f");
        private static final byte[] zzWgd = zzYGC.decode("52d86063e22a84188285");
        private static final byte[] zzWgc = zzYGC.decode("d1f521fbc7e736685709");
        private static final byte[] zzWgb = zzYGC.decode("dca0e9d25e22ca54c0ca");

        public zzQ(zzJ zzj) {
            this.zzWjX = new zzZ1P(zzZ1D.zzWgE.zzXF4(), zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] zzX(zzJ zzj) {
            switch (C157064.zzWgs[zzj.ordinal()]) {
                case 1:
                    return zzWgj;
                case 2:
                    return zzWgi;
                case 3:
                    return zzWgh;
                case 4:
                    return zzWgg;
                case 5:
                    return zzWgf;
                case 6:
                    return zzWge;
                case 7:
                    return zzWgd;
                case 8:
                    return zzWgc;
                case 9:
                    return zzWgb;
                default:
                    throw new zzYZG.zzZ("unknown PRF");
            }
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXEY, reason: merged with bridge method [inline-methods] */
        public final zzZ0A zzXFZ() {
            final zzJ zzj = (zzJ) this.zzWjX.zzXFS();
            return (zzZ0A) zzYZG.zzZ(this.zzWjX, new zzZ0A((zzYUR) zzZ1D.zzZ(zzj).zzXFZ()), new zzYZD<zzZ0A>() { // from class: com.aspose.words.internal.zzZ1D.zzQ.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.aspose.words.internal.zzYZD
                /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
                public void zzWN(zzZ0A zzz0a) {
                    zzz0a.zzZ(zzYSB.zzv(zzQ.zzWgm, zzQ.zzWg7));
                    byte[] bArr = new byte[10];
                    zzz0a.zzC(bArr, 0, 10);
                    if (zzYGU.zzp(zzQ.zzX(zzj), bArr)) {
                        return;
                    }
                    zzYZD.zzTQ("failed self test on generation: " + zzYGC.zzVE(bArr));
                }
            });
        }
    }

    public static final class zzR extends zzZ0S {
        private final zzU zzWg8;
        private final int zzWgn;
        private final zzJ zzWgo;

        public zzR(zzZ1P zzz1p) {
            this(zzz1p, zzJ.SHA1_HMAC);
        }

        private zzR(zzZ1P zzz1p, zzJ zzj) {
            super(zzz1p);
            this.zzWgo = zzj;
            this.zzWgn = -1;
            this.zzWg8 = null;
        }
    }

    public static final class zzS extends zzZ1E<zzZ0B> {
        private final zzZ1P zzWjX;
        private static final byte[] zzWgm = zzYGC.decode("dff1e50ac0b69dc40f1051d46c2b069c");
        private static final byte[] zzWgl = {1};
        private static final byte[] zzWgk = {2};
        private static final byte[] zzWgj = zzYGC.decode("53023e21d00cc5046b15");
        private static final byte[] zzWgi = zzYGC.decode("d4e062f13b0baefa4943");
        private static final byte[] zzWgh = zzYGC.decode("76f881b780e4939d485a");
        private static final byte[] zzWgg = zzYGC.decode("66db824abdf2b4e85de2");
        private static final byte[] zzWgf = zzYGC.decode("3a46d9be7ab8ea092558");
        private static final byte[] zzWge = zzYGC.decode("d209b2f985ff77301fd1");
        private static final byte[] zzWgd = zzYGC.decode("0c51da7c89503acc0050");
        private static final byte[] zzWgc = zzYGC.decode("86e14446abd90b94c828");
        private static final byte[] zzWgb = zzYGC.decode("26593c9ef9b39d94bafc");

        public zzS(zzJ zzj) {
            this.zzWjX = new zzZ1P(zzZ1D.zzWgG.zzXF4(), zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] zzX(zzJ zzj) {
            switch (C157064.zzWgs[zzj.ordinal()]) {
                case 1:
                    return zzWgj;
                case 2:
                    return zzWgi;
                case 3:
                    return zzWgh;
                case 4:
                    return zzWgg;
                case 5:
                    return zzWgf;
                case 6:
                    return zzWge;
                case 7:
                    return zzWgd;
                case 8:
                    return zzWgc;
                case 9:
                    return zzWgb;
                default:
                    throw new zzYZG.zzZ("unknown PRF");
            }
        }

        @Override // com.aspose.words.internal.zzYUV
        /* JADX INFO: renamed from: zzXF2, reason: merged with bridge method [inline-methods] */
        public final zzZ0B zzXFZ() {
            final zzJ zzj = (zzJ) this.zzWjX.zzXFS();
            return (zzZ0B) zzYZG.zzZ(this.zzWjX, new zzZ0B((zzYUR) zzZ1D.zzZ(zzj).zzXFZ()), new zzYZD<zzZ0B>() { // from class: com.aspose.words.internal.zzZ1D.zzS.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.aspose.words.internal.zzYZD
                /* JADX INFO: renamed from: zzZ, reason: merged with bridge method [inline-methods] */
                public void zzWN(zzZ0B zzz0b) {
                    zzz0b.zzZ(new zzYSC(zzS.zzWgm, zzS.zzWgl, zzS.zzWgk));
                    byte[] bArr = new byte[10];
                    zzz0b.zzWP(bArr);
                    if (zzYGU.zzp(zzS.zzX(zzj), bArr)) {
                        return;
                    }
                    zzYZD.zzTQ("failed self test on generation: " + zzYGC.zzVE(bArr));
                }
            });
        }
    }

    public static final class zzT extends zzZ0S {
        private final int zzWgn;
        private final zzJ zzWgo;

        public zzT(zzZ1P zzz1p) {
            this(zzz1p, zzJ.SHA1_HMAC);
        }

        private zzT(zzZ1P zzz1p, zzJ zzj) {
            super(zzz1p);
            this.zzWgo = zzj;
            this.zzWgn = 8;
        }
    }

    public enum zzU {
        AFTER_ITERATION_DATA(1),
        AFTER_FIXED_INPUT(2),
        BEFORE_ITERATION_DATA(0);

        private final int code;

        zzU(int i) {
            this.code = i;
        }
    }

    public interface zzV<T extends zzZ4M> {
        T zzXH6();

        void zzz(byte[] bArr, int i, int i2);
    }

    public static final class zzW extends zzZ1C<zzY> {
        @Override // com.aspose.words.internal.zzZ59
        /* JADX INFO: renamed from: zzX, reason: merged with bridge method [inline-methods] */
        public final zzZ5A<zzY> zzY(zzY zzy) {
            return zzy.zzXF4().getName().startsWith(zzZ1D.zzWgx.zzXF4().getName()) ? zzZ1D.zzZ(this.zzWlB, zzy) : zzZ1D.zzY(this.zzWlB, zzy);
        }
    }

    public static final class zzX extends zzZ0S {
        zzZ zzWgq;

        public zzX(zzZ1P zzz1p, zzZ zzz) {
            super(zzz1p);
            this.zzWgq = zzz;
        }

        public final zzY zzX1(byte[] bArr) {
            return new zzY(new zzZ1P(zzXF4(), this.zzWgq), zzYGU.zzVI(bArr));
        }

        public final zzZ zzXF3() {
            return this.zzWgq;
        }

        public final zzX zzY(zzZ zzz) {
            return new zzX(zzXF4(), zzz);
        }
    }

    public static final class zzY extends zzZ0S {

        /* JADX INFO: renamed from: iv */
        private final byte[] f51297iv;
        private final byte[] zzWks;

        public zzY(zzZ1P zzz1p, byte[] bArr) {
            this(zzz1p, bArr, null);
        }

        public final zzY zzX2(byte[] bArr) {
            return new zzY(zzXF4(), this.zzWks, zzYGU.zzVI(bArr));
        }

        private zzY(zzZ1P zzz1p, byte[] bArr, byte[] bArr2) {
            super(zzz1p);
            this.zzWks = bArr;
            this.f51297iv = bArr2;
        }
    }

    public enum zzZ {
        SHA1(zzZ0P.zzZ.zzWdL),
        SHA224(zzZ0P.zzZ.zzWdJ),
        SHA256(zzZ0P.zzZ.zzWdH),
        SHA384(zzZ0P.zzZ.zzWdF),
        SHA512(zzZ0P.zzZ.zzWdD),
        SHA512_224(zzZ0P.zzZ.zzWdB),
        SHA512_256(zzZ0P.zzZ.zzWdz),
        SHA3_224(zzZ0P.zzZ.zzWdx),
        SHA3_256(zzZ0P.zzZ.zzWdv),
        SHA3_384(zzZ0P.zzZ.zzWdt),
        SHA3_512(zzZ0P.zzZ.zzWdr);

        private final zzZ1P zzWjX;

        zzZ(zzZ1P zzz1p) {
            this.zzWjX = zzz1p;
        }

        public final zzZ1P zzXF4() {
            return this.zzWjX;
        }
    }

    static {
        zzZ1P zzz1p = new zzZ1P("X9.63");
        zzZ zzz = zzZ.SHA1;
        zzWgx = new zzX(zzz1p, zzz);
        zzWgw = new zzX(new zzZ1P("Concatenation"), zzz);
        zzJ zzj = zzJ.AES_CMAC;
        new zzS(zzj).zzXFZ();
        zzJ zzj2 = zzJ.TRIPLEDES_CMAC;
        new zzS(zzj2).zzXFZ();
        zzJ zzj3 = zzJ.SHA1_HMAC;
        new zzS(zzj3).zzXFZ();
        zzJ zzj4 = zzJ.SHA224_HMAC;
        new zzS(zzj4).zzXFZ();
        zzJ zzj5 = zzJ.SHA256_HMAC;
        new zzS(zzj5).zzXFZ();
        zzJ zzj6 = zzJ.SHA384_HMAC;
        new zzS(zzj6).zzXFZ();
        zzJ zzj7 = zzJ.SHA512_HMAC;
        new zzS(zzj7).zzXFZ();
        zzJ zzj8 = zzJ.SHA512_224_HMAC;
        new zzS(zzj8).zzXFZ();
        zzJ zzj9 = zzJ.SHA512_256_HMAC;
        new zzS(zzj9).zzXFZ();
        new zzO(zzj).zzXFZ();
        new zzO(zzj2).zzXFZ();
        new zzO(zzj3).zzXFZ();
        new zzO(zzj4).zzXFZ();
        new zzO(zzj5).zzXFZ();
        new zzO(zzj6).zzXFZ();
        new zzO(zzj7).zzXFZ();
        new zzO(zzj8).zzXFZ();
        new zzO(zzj9).zzXFZ();
        new zzQ(zzj).zzXFZ();
        new zzQ(zzj2).zzXFZ();
        new zzQ(zzj3).zzXFZ();
        new zzQ(zzj4).zzXFZ();
        new zzQ(zzj5).zzXFZ();
        new zzQ(zzj6).zzXFZ();
        new zzQ(zzj7).zzXFZ();
        new zzQ(zzj8).zzXFZ();
        new zzQ(zzj9).zzXFZ();
        zzWgv = new zzYUV<zzYUX>() { // from class: com.aspose.words.internal.zzZ1D.3
            private static zzYUX zzXF5() {
                return (zzYUX) zzYZG.zzZ(zzZ1D.zzWgA.zzXF4(), new zzZ06(), new zzL((byte) 0));
            }

            @Override // com.aspose.words.internal.zzYUV
            public final /* synthetic */ zzYUX zzXFZ() {
                return zzXF5();
            }
        };
    }

    private zzZ1D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ1E<zzYUR> zzZ(zzJ zzj) {
        zzZ1E<zzYUR> zzz1eZzX = zzj == zzJ.TRIPLEDES_CMAC ? zzZ0I.zzX(zzZ0I.zzWcK.zzXF4()) : zzj == zzJ.AES_CMAC ? zzZ1T.zzX(zzZ1T.zzWiR.zzXF4()) : zzZ0P.zzX(zzj.zzWjX);
        if (zzz1eZzX != null) {
            return zzz1eZzX;
        }
        throw new IllegalArgumentException("Unknown algorithm passed to FipsKDF.createPRF: " + zzj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ5A<zzY> zzY(boolean z, final zzY zzy) {
        zzYZF.zzZ(z, zzy.zzXF4());
        final zzZ2P zzz2p = new zzZ2P(zzZ0P.zzU(((zzZ) zzy.zzXF4().zzXFS()).zzWjX));
        zzz2p.zzZ(new zzYS9(zzy.zzWks, zzy.f51297iv));
        return new zzK(z, new zzV<zzY>() { // from class: com.aspose.words.internal.zzZ1D.2
            @Override // com.aspose.words.internal.zzZ1D.zzV
            public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                return zzy;
            }

            @Override // com.aspose.words.internal.zzZ1D.zzV
            public final void zzz(byte[] bArr, int i, int i2) {
                zzz2p.zzC(bArr, 0, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] zzZ(zzC zzc, zzD zzd, byte[] bArr, String str, int i) {
        byte[] bArrZzn = zzYGU.zzn(zzYGI.zzwb(str), zzc.zzWoA);
        byte[] bArr2 = new byte[i];
        zzZ(zzZ0P.zzT(zzd.zzWjX), bArr, bArrZzn, bArr2);
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] zzZ(zzC zzc, byte[] bArr, String str, int i, zzYUR zzyur, zzYUR zzyur2) {
        byte[] bArrZzn = zzYGU.zzn(zzYGI.zzwb(str), zzc.zzWoA);
        int length = (bArr.length + 1) / 2;
        byte[] bArr2 = new byte[length];
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(bArr, bArr.length - length, bArr3, 0, length);
        byte[] bArr4 = new byte[i];
        byte[] bArr5 = new byte[i];
        zzZ(zzyur, bArr2, bArrZzn, bArr4);
        zzZ(zzyur2, bArr3, bArrZzn, bArr5);
        for (int i2 = 0; i2 < i; i2++) {
            bArr4[i2] = (byte) (bArr4[i2] ^ bArr5[i2]);
        }
        return bArr4;
    }

    private static void zzZ(zzYUR zzyur, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        zzyur.zzZ(new zzYS7(bArr));
        int iZzXDn = zzyur.zzXDn();
        int iOooO00o = C24611OooO00o.OooO00o(bArr3.length, iZzXDn, 1, iZzXDn);
        int iZzXDn2 = zzyur.zzXDn();
        byte[] bArr4 = new byte[iZzXDn2];
        byte[] bArr5 = new byte[zzyur.zzXDn()];
        byte[] bArr6 = bArr2;
        int i = 0;
        while (i < iOooO00o) {
            zzyur.update(bArr6, 0, bArr6.length);
            zzyur.doFinal(bArr4, 0);
            zzyur.update(bArr4, 0, iZzXDn2);
            zzyur.update(bArr2, 0, bArr2.length);
            zzyur.doFinal(bArr5, 0);
            int i2 = iZzXDn * i;
            System.arraycopy(bArr5, 0, bArr3, i2, Math.min(iZzXDn, bArr3.length - i2));
            i++;
            bArr6 = bArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzZ5A<zzY> zzZ(boolean z, final zzY zzy) {
        zzYZF.zzZ(z, zzy.zzXF4());
        final zzZ0C zzz0c = new zzZ0C(zzZ0P.zzU(((zzZ) zzy.zzXF4().zzXFS()).zzWjX));
        zzz0c.zzZ(new zzYS9(zzy.zzWks, zzy.f51297iv));
        return new zzK(z, new zzV<zzY>() { // from class: com.aspose.words.internal.zzZ1D.1
            @Override // com.aspose.words.internal.zzZ1D.zzV
            public final /* bridge */ /* synthetic */ zzZ4M zzXH6() {
                return zzy;
            }

            @Override // com.aspose.words.internal.zzZ1D.zzV
            public final void zzz(byte[] bArr, int i, int i2) {
                zzz0c.zzC(bArr, 0, i2);
            }
        });
    }

    public static byte[] zzZ(byte[] bArr, zzZ1Q zzz1q) {
        zzJ zzj = zzz1q.zzWiq;
        byte[] bArr2 = zzz1q.zzWAR;
        zzZ1P zzz1p = zzz1q.zzWir;
        zzW zzw = new zzW();
        zzX zzx = zzz1q.zzWip;
        if (zzj == zzJ.TRIPLEDES_CMAC && zzZ5L.zzXH0()) {
            throw new zzZ0H("Requested PRF has insufficient security level for approved mode: " + zzj.name());
        }
        if (zzj != null) {
            zzYUR zzyurZzXFZ = zzZ(zzj).zzXFZ();
            if (bArr2 == null) {
                if (zzyurZzXFZ instanceof zzYTV) {
                    zzyurZzXFZ.zzZ(new zzYS7(new byte[((zzYTV) zzyurZzXFZ).zzXCH().zzXE6()]));
                } else {
                    zzyurZzXFZ.zzZ(new zzYS7(new byte[16]));
                }
            } else {
                zzyurZzXFZ.zzZ(new zzYS7(zzYGU.zzVI(bArr2)));
            }
            byte[] bArr3 = new byte[zzyurZzXFZ.zzXDn()];
            zzyurZzXFZ.update(bArr, 0, bArr.length);
            zzyurZzXFZ.doFinal(bArr3, 0);
            zzYGU.fill(bArr, (byte) 0);
            return bArr3;
        }
        if (zzz1p != null) {
            zzYUU zzyuuZzU = zzZ0P.zzU(zzz1p);
            byte[] bArr4 = new byte[zzyuuZzU.zzQI()];
            zzyuuZzU.update(bArr, 0, bArr.length);
            zzyuuZzU.doFinal(bArr4, 0);
            zzYGU.fill(bArr, (byte) 0);
            return bArr4;
        }
        if (zzx == null) {
            return bArr;
        }
        zzZ5A<T> zzz5aZzY = zzw.zzY(zzx.zzX1(bArr).zzX2(bArr2));
        zzYGU.fill(bArr, (byte) 0);
        byte[] bArr5 = new byte[zzz1q.zzWio];
        zzz5aZzY.zzXi(bArr5);
        return bArr5;
    }
}
