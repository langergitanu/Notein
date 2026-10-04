package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZ2T {
    private static SecureRandom zzWkr;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzZ2T$1 */
    public static /* synthetic */ class C157571 {
        static final /* synthetic */ int[] zzWkp;
        static final /* synthetic */ int[] zzWkq;

        static {
            int[] iArr = new int[zzZ00.values().length];
            zzWkp = iArr;
            try {
                iArr[zzZ00.PKCS7.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWkp[zzZ00.ISO7816_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzWkp[zzZ00.ISO10126_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzWkp[zzZ00.TBC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzWkp[zzZ00.X923.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zzWkp[zzZ00.CS1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zzWkp[zzZ00.CS2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zzWkp[zzZ00.CS3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[zzZ05.values().length];
            zzWkq = iArr2;
            try {
                iArr2[zzZ05.ECB.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                zzWkq[zzZ05.CBC.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                zzWkq[zzZ05.CFB8.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                zzWkq[zzZ05.CFB64.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                zzWkq[zzZ05.CFB128.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                zzWkq[zzZ05.OFB64.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                zzWkq[zzZ05.OFB128.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                zzWkq[zzZ05.CTR.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                zzWkq[zzZ05.CCM.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                zzWkq[zzZ05.GCM.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private static synchronized SecureRandom zzXGh() {
        try {
            if (zzWkr == null) {
                zzWkr = zzZ1L.zzWhK.zzXFD().zzX3(zzYGI.zzwb("Bouncy Castle FIPS Default Padder")).zzZ(zzYGN.zzWX(System.currentTimeMillis()), false, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzWkr;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzYV5 zzZ(zzYUV<zzYV8> zzyuv, zzZ0S zzz0s) {
        zzYV8 zzytr;
        zzYV8 zzyv8ZzXFZ = zzyuv.zzXFZ();
        zzZ00 zzz00 = (zzZ00) zzz0s.zzXF4().zzXFR();
        switch (C157571.zzWkq[((zzZ05) zzz0s.zzXF4().zzXFS()).ordinal()]) {
            case 2:
                if (zzz00 != zzZ00.CS1 && zzz00 != zzZ00.CS2 && zzz00 != zzZ00.CS3) {
                    zzytr = new zzYTR(zzyv8ZzXFZ);
                    zzyv8ZzXFZ = zzytr;
                    break;
                }
            case 1:
                if (zzz00 == null) {
                    return new zzYV5(zzyv8ZzXFZ);
                }
                switch (C157571.zzWkp[zzz00.ordinal()]) {
                    case 1:
                        return new zzYT6(zzyv8ZzXFZ, new zzYT7());
                    case 2:
                        return new zzYT6(zzyv8ZzXFZ, new zzYT8());
                    case 3:
                        return new zzYT6(zzyv8ZzXFZ, new zzYT9());
                    case 4:
                        return new zzYT6(zzyv8ZzXFZ, new zzYT5());
                    case 5:
                        return new zzYT6(zzyv8ZzXFZ, new zzYT4());
                    case 6:
                        return new zzYTK(1, zzyv8ZzXFZ);
                    case 7:
                        return new zzYTK(2, zzyv8ZzXFZ);
                    case 8:
                        return new zzYTK(3, zzyv8ZzXFZ);
                    default:
                        throw new IllegalArgumentException("Unknown padding passed to createBlockCipher: " + zzz0s.zzXF4());
                }
            case 3:
                zzytr = new zzYTP(zzyv8ZzXFZ, 8);
                zzyv8ZzXFZ = zzytr;
                if (zzz00 == null) {
                }
                break;
            case 4:
                zzytr = new zzYTP(zzyv8ZzXFZ, 64);
                zzyv8ZzXFZ = zzytr;
                if (zzz00 == null) {
                }
                break;
            case 5:
                zzytr = new zzYTP(zzyv8ZzXFZ, 128);
                zzyv8ZzXFZ = zzytr;
                if (zzz00 == null) {
                }
                break;
            case 6:
                zzytr = new zzYTI(zzyv8ZzXFZ, 64);
                zzyv8ZzXFZ = zzytr;
                if (zzz00 == null) {
                }
                break;
            case 7:
                zzytr = new zzYTI(zzyv8ZzXFZ, 128);
                zzyv8ZzXFZ = zzytr;
                if (zzz00 == null) {
                }
                break;
            case 8:
                zzytr = new zzYTG(zzyv8ZzXFZ);
                zzyv8ZzXFZ = zzytr;
                if (zzz00 == null) {
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown mode passed to createBlockCipher: " + zzz0s.zzXF4());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzYV5 zzZ(boolean z, zzYUD zzyud, zzYUV<zzYV8> zzyuv, zzZ4L zzz4l, SecureRandom secureRandom) {
        zzYS3 zzys3;
        zzYV5 zzyv5ZzZ = zzZ(zzyuv, (zzZ0S) zzz4l);
        zzYV3 zzyv3ZzZ = zzYZF.zzZ(zzyud);
        if (zzz4l.getIV() != null) {
            zzyv3ZzZ = new zzYS4(zzyv3ZzZ, zzz4l.getIV());
        }
        if ((((zzZ1P) zzz4l.zzXGV()).zzXFR() instanceof zzZ00) && ((zzZ00) ((zzZ1P) zzz4l.zzXGV()).zzXFR()).zzXE0().zzXCL() && z) {
            if (secureRandom != null) {
                zzys3 = new zzYS3(zzyv3ZzZ, secureRandom);
            } else {
                try {
                    zzys3 = new zzYS3(zzyv3ZzZ, zzZ5L.zzXGZ());
                } catch (IllegalStateException unused) {
                    zzys3 = new zzYS3(zzyv3ZzZ, zzXGh());
                }
            }
            zzyv3ZzZ = zzys3;
        }
        zzyv5ZzZ.zzZ(z, zzyv3ZzZ);
        return zzyv5ZzZ;
    }

    public static zzYTS zzZ(zzZ1P zzz1p, zzYUV<zzYV8> zzyuv) {
        int i = C157571.zzWkq[((zzZ05) zzz1p.zzXFS()).ordinal()];
        if (i == 9) {
            return new zzYTQ(zzyuv.zzXFZ());
        }
        if (i == 10) {
            return new zzYTM(zzyuv.zzXFZ());
        }
        throw new IllegalArgumentException("Unknown algorithm passed to createAEADCipher: " + zzz1p);
    }
}
