package com.aspose.words.internal;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYZ {
    private static SecureRandom zzWkr;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzYYZ$1 */
    public static /* synthetic */ class C156321 {
        static final /* synthetic */ int[] zzW97;
        static final /* synthetic */ int[] zzW98;

        static {
            int[] iArr = new int[zzYWM.values().length];
            zzW97 = iArr;
            try {
                iArr[zzYWM.PKCS7.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzW97[zzYWM.ISO7816_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzW97[zzYWM.ISO10126_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzW97[zzYWM.TBC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzW97[zzYWM.X923.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zzW97[zzYWM.CS1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zzW97[zzYWM.CS2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zzW97[zzYWM.CS3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[zzYWU.values().length];
            zzW98 = iArr2;
            try {
                iArr2[zzYWU.ECB.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                zzW98[zzYWU.CBC.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                zzW98[zzYWU.CFB8.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                zzW98[zzYWU.CFB64.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                zzW98[zzYWU.CFB128.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                zzW98[zzYWU.CFB256.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                zzW98[zzYWU.OFB64.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                zzW98[zzYWU.OFB128.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                zzW98[zzYWU.OFB256.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                zzW98[zzYWU.CTR.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                zzW98[zzYWU.OpenPGPCFB.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                zzW98[zzYWU.GCFB.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                zzW98[zzYWU.GOFB.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                zzW98[zzYWU.CCM.ordinal()] = 14;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                zzW98[zzYWU.EAX.ordinal()] = 15;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                zzW98[zzYWU.GCM.ordinal()] = 16;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                zzW98[zzYWU.OCB.ordinal()] = 17;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                zzW98[zzYWU.CBCMAC.ordinal()] = 18;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                zzW98[zzYWU.CMAC.ordinal()] = 19;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                zzW98[zzYWU.GMAC.ordinal()] = 20;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                zzW98[zzYWU.CFB8MAC.ordinal()] = 21;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                zzW98[zzYWU.GOSTMAC.ordinal()] = 22;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                zzW98[zzYWU.ISO9797alg3.ordinal()] = 23;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                zzW98[zzYWU.WRAP.ordinal()] = 24;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                zzW98[zzYWU.WRAPPAD.ordinal()] = 25;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                zzW98[zzYWU.RFC3211_WRAP.ordinal()] = 26;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                zzW98[zzYWU.RFC3217_WRAP.ordinal()] = 27;
            } catch (NoSuchFieldError unused35) {
            }
        }
    }

    private static synchronized SecureRandom zzXGh() {
        try {
            if (zzWkr == null) {
                zzWkr = zzZ1L.zzWhK.zzXFD().zzX3(zzYGI.zzwb("Bouncy Castle General Default Padder")).zzW(zzYGN.zzWX(System.currentTimeMillis()), false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzWkr;
    }

    public static zzYUC zzY(boolean z, zzYUD zzyud, zzYUV<zzYV8> zzyuv, zzZ4L zzz4l, SecureRandom secureRandom) {
        return zzZ(z, (zzYS8) new zzYS7(zzyud.zzXK4()), zzyuv, zzz4l, false, secureRandom);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzYV5 zzZ(zzYUV<zzYV8> zzyuv, zzZ4M zzz4m) {
        zzYV8 zzytr;
        zzYXR zzyxr = (zzYXR) zzz4m.zzXGV();
        zzYV8 zzyv8ZzXFZ = zzyuv.zzXFZ();
        zzYWM zzywm = (zzYWM) zzyxr.zzXFR();
        switch (C156321.zzW98[((zzYWU) zzyxr.zzXFS()).ordinal()]) {
            case 2:
                if (zzywm != zzYWM.CS1 && zzywm != zzYWM.CS2 && zzywm != zzYWM.CS3) {
                    zzytr = new zzYTR(zzyv8ZzXFZ);
                    zzyv8ZzXFZ = zzytr;
                    break;
                }
            case 1:
                if (zzywm != null) {
                    return new zzYV5(zzyv8ZzXFZ);
                }
                switch (C156321.zzW97[zzywm.ordinal()]) {
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
                        throw new IllegalArgumentException("Unknown padding passed to createBlockCipher: " + zzz4m.zzXGV());
                }
            case 3:
                zzytr = new zzYTP(zzyv8ZzXFZ, 8);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            case 4:
                zzytr = new zzYTP(zzyv8ZzXFZ, 64);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            case 5:
                zzytr = new zzYTP(zzyv8ZzXFZ, 128);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            case 6:
                zzytr = new zzYTP(zzyv8ZzXFZ, 256);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            case 7:
                zzytr = new zzYTI(zzyv8ZzXFZ, 64);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            case 8:
                zzytr = new zzYTI(zzyv8ZzXFZ, 128);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            case 9:
                zzytr = new zzYTI(zzyv8ZzXFZ, 256);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            case 10:
                zzytr = new zzYTG(zzyv8ZzXFZ);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            case 11:
                zzytr = new zzYTH(zzyv8ZzXFZ);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            case 12:
                zzytr = new zzYTN(zzyv8ZzXFZ);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            case 13:
                zzytr = new zzYTL(zzyv8ZzXFZ);
                zzyv8ZzXFZ = zzytr;
                if (zzywm != null) {
                }
                break;
            default:
                throw new IllegalArgumentException("Unknown algorithm passed to createBlockCipher: " + zzyxr.getName());
        }
    }

    public static zzYV5 zzZ(boolean z, zzYUD zzyud, zzYUV<zzYV8> zzyuv, zzZ4L zzz4l, SecureRandom secureRandom) {
        return zzZ(z, new zzYS7(zzyud.zzXK4()), zzyuv, zzz4l, secureRandom);
    }

    public static zzYV5 zzZ(boolean z, zzYS8 zzys8, zzYUV<zzYV8> zzyuv, zzZ4L zzz4l, SecureRandom secureRandom) {
        zzYS3 zzys3;
        zzYV5 zzyv5ZzZ = zzZ(zzyuv, zzz4l);
        zzYV3 zzys4 = zzys8;
        if (zzz4l.getIV() != null) {
            zzys4 = new zzYS4(zzys8, zzz4l.getIV());
        }
        zzYV3 zzyv3 = zzys4;
        if (((zzYXR) zzz4l.zzXGV()).zzXFR() instanceof zzYWM) {
            zzyv3 = zzys4;
            zzyv3 = zzys4;
            if (((zzYWM) ((zzYXR) zzz4l.zzXGV()).zzXFR()).zzXE0().zzXCL() && z) {
                if (secureRandom != null) {
                    zzys3 = new zzYS3(zzys4, secureRandom);
                } else {
                    try {
                        zzys3 = new zzYS3(zzys4, zzZ5L.zzXGZ());
                    } catch (IllegalStateException unused) {
                        zzys3 = new zzYS3(zzys4, zzXGh());
                    }
                }
                zzyv3 = zzys3;
            }
        }
        zzyv5ZzZ.zzZ(z, zzyv3);
        return zzyv5ZzZ;
    }

    private static zzYTS zzZ(zzYXR zzyxr, zzYUV<zzYV8> zzyuv) {
        switch (C156321.zzW98[((zzYWU) zzyxr.zzXFS()).ordinal()]) {
            case 14:
                return new zzYTQ(zzyuv.zzXFZ());
            case 15:
                return new zzYTO(zzyuv.zzXFZ());
            case 16:
                return new zzYTM(zzyuv.zzXFZ());
            case 17:
                return new zzYTJ(zzyuv.zzXFZ(), zzyuv.zzXFZ());
            default:
                throw new IllegalArgumentException("Unknown algorithm passed to createAEADCipher: " + zzyxr.getName());
        }
    }

    public static zzYTS zzZ(boolean z, zzYUD zzyud, zzYUV<zzYV8> zzyuv, zzZ5P zzz5p) {
        return zzZ(z, new zzYS7(zzyud.zzXK4()), zzyuv, zzz5p);
    }

    public static zzYTS zzZ(boolean z, zzYS8 zzys8, zzYUV<zzYV8> zzyuv, zzZ5P zzz5p) {
        zzYTS zzytsZzZ = zzZ((zzYXR) zzz5p.zzXGV(), zzyuv);
        if (zzz5p.getIV() != null) {
            zzytsZzZ.zzZ(z, new zzYT3(zzys8, zzz5p.zzXH3(), zzz5p.getIV()));
            return zzytsZzZ;
        }
        zzytsZzZ.zzZ(z, zzys8);
        return zzytsZzZ;
    }

    public static zzYUR zzZ(zzYUD zzyud, zzYUV<zzYV8> zzyuv, zzYXQ zzyxq) {
        return zzZ(new zzYS7(zzyud.zzXK4()), zzyuv, zzyxq);
    }

    public static zzYUR zzZ(zzYS8 zzys8, zzYUV<zzYV8> zzyuv, zzYXQ zzyxq) {
        zzYUR zzyurZzZ = zzZ(zzyxq, zzyuv);
        if (zzyxq.getIV() != null) {
            zzyurZzZ.zzZ(new zzYS4(zzys8, zzyxq.getIV()));
            return zzyurZzZ;
        }
        zzyurZzZ.zzZ(zzys8);
        return zzyurZzZ;
    }

    private static zzYUR zzZ(zzZ5Q zzz5q, zzYUV<zzYV8> zzyuv) {
        zzYWM zzywm = (zzYWM) ((zzYXR) zzz5q.zzXGV()).zzXFR();
        int i = C156321.zzW98[((zzYWU) ((zzYXR) zzz5q.zzXGV()).zzXFS()).ordinal()];
        if (i != 14) {
            switch (i) {
                case 18:
                    if (zzywm != null) {
                        if (zzywm == zzYWM.ISO7816_4) {
                            return new zzYTZ(zzyuv.zzXFZ(), zzz5q.zzXH3(), new zzYT8());
                        }
                        throw new IllegalArgumentException("Unknown padding passed to MAC operator factory: " + zzz5q.zzXGV().getName());
                    }
                    return new zzYTZ(zzyuv.zzXFZ(), zzz5q.zzXH3());
                case 19:
                    return new zzYTX(zzyuv.zzXFZ(), zzz5q.zzXH3());
                case 20:
                    return new zzYTW(new zzYTM(zzyuv.zzXFZ()), zzz5q.zzXH3());
                case 21:
                    return new zzYTY(zzyuv.zzXFZ());
                case 22:
                    return new zzYXV();
                case 23:
                    if (zzywm != null) {
                        if (zzywm == zzYWM.ISO7816_4) {
                            return new zzYWW(zzyuv.zzXFZ(), zzz5q.zzXH3(), new zzYT8());
                        }
                        throw new IllegalArgumentException("Unknown padding passed to MAC operator factory: " + zzz5q.zzXGV().getName());
                    }
                    return new zzYWW(zzyuv.zzXFZ());
                default:
                    throw new IllegalArgumentException("Unknown algorithm passed to MAC operator factory: " + zzz5q.zzXGV().getName());
            }
        }
        return new zzYU0(new zzYTQ(zzyuv.zzXFZ()), zzz5q.zzXH3());
    }

    public static zzYUC zzZ(boolean z, zzYUD zzyud, zzYUV<zzYV8> zzyuv, zzZ4L zzz4l, boolean z2, SecureRandom secureRandom) {
        return zzZ(z, new zzYS7(zzyud.zzXK4()), zzyuv, zzz4l, z2, secureRandom);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzYUC zzZ(boolean z, zzYS8 zzys8, zzYUV<zzYV8> zzyuv, zzZ4L zzz4l, boolean z2, SecureRandom secureRandom) {
        zzYUC zzyrs;
        zzYUC zzywd;
        zzYXR zzyxr = (zzYXR) zzz4l.zzXGV();
        boolean z3 = true;
        switch (C156321.zzW98[((zzYWU) zzyxr.zzXFS()).ordinal()]) {
            case 24:
                zzyrs = new zzYRS(zzyuv.zzXFZ(), z2);
                zzywd = zzyrs;
                z3 = false;
                zzYV3 zzys3 = zzys8;
                if (zzz4l.getIV() != null) {
                    zzys3 = new zzYS4(zzys8, zzz4l.getIV());
                }
                if (z && z3) {
                    if (secureRandom == null) {
                        zzys3 = new zzYS3(zzys3, secureRandom);
                    } else {
                        throw new IllegalArgumentException("No SecureRandom provided when one required");
                    }
                }
                zzywd.zzZ(z, zzys3);
                return zzywd;
            case 25:
                zzyrs = new zzYRR(zzyuv.zzXFZ(), z2);
                zzywd = zzyrs;
                z3 = false;
                zzYV3 zzys32 = zzys8;
                if (zzz4l.getIV() != null) {
                }
                if (z) {
                    if (secureRandom == null) {
                    }
                }
                zzywd.zzZ(z, zzys32);
                return zzywd;
            case 26:
                zzywd = new zzYWD(zzyuv.zzXFZ());
                zzYV3 zzys322 = zzys8;
                if (zzz4l.getIV() != null) {
                }
                if (z) {
                }
                zzywd.zzZ(z, zzys322);
                return zzywd;
            case 27:
                if (zzyxr.equals(zzYVR.zzW0F.zzXGV())) {
                    zzywd = new zzYYQ();
                } else if (zzyxr.equals(zzYWH.zzW3U.zzXGV())) {
                    zzywd = new zzYWE();
                } else {
                    throw new IllegalArgumentException("Unknown RFC3217 algorithm passed to Key Wrap operator factory: " + zzyxr.getName());
                }
                zzYV3 zzys3222 = zzys8;
                if (zzz4l.getIV() != null) {
                }
                if (z) {
                }
                zzywd.zzZ(z, zzys3222);
                return zzywd;
            default:
                throw new IllegalArgumentException("Unknown algorithm passed to Key Wrap operator factory: " + zzyxr.getName());
        }
    }
}
