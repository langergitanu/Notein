package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
enum zzYWU {
    ECB(zzYV7.ECB),
    CBC(zzYV7.CBC),
    CBCMAC(zzYV7.CBCMAC),
    CFB8(zzYV7.CFB8),
    CFB8MAC(zzYV7.CFB8MAC),
    CFB16(zzYV7.CFB16),
    CFB32(zzYV7.CFB32),
    CFB64(zzYV7.CFB64),
    CFB128(zzYV7.CFB128),
    CFB256(zzYV7.CFB256),
    OFB8(zzYV7.OFB8),
    OFB16(zzYV7.OFB16),
    OFB32(zzYV7.OFB32),
    OFB64(zzYV7.OFB64),
    OFB128(zzYV7.OFB128),
    OFB256(zzYV7.OFB256),
    CTR(zzYV7.CTR),
    GCM(zzYV7.GCM),
    CCM(zzYV7.CCM),
    OCB(zzYV7.OCB),
    EAX(zzYV7.EAX),
    GOSTMAC(zzYV7.GOSTMAC),
    CMAC(zzYV7.CMAC),
    GMAC(zzYV7.GMAC),
    WRAP(zzYV7.WRAP),
    WRAPPAD(zzYV7.WRAPPAD),
    RFC3217_WRAP(zzYV7.RFC3217_WRAP),
    RFC3211_WRAP(zzYV7.RFC3211_WRAP),
    OpenPGPCFB(zzYV7.OpenPGPCFB),
    GCFB(zzYV7.GCFB),
    GOFB(zzYV7.GOFB),
    ISO9797alg3(zzYV7.ISO9797alg3);

    private final zzYV7 zzWbO;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzYWU$1 */
    public static /* synthetic */ class C155891 {
        static final /* synthetic */ int[] zzWbM;

        static {
            int[] iArr = new int[zzYV7.values().length];
            zzWbM = iArr;
            try {
                iArr[zzYV7.CBC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWbM[zzYV7.CFB8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zzWbM[zzYV7.CFB16.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zzWbM[zzYV7.CFB32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zzWbM[zzYV7.CFB64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zzWbM[zzYV7.CFB128.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zzWbM[zzYV7.CFB256.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zzWbM[zzYV7.OFB8.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zzWbM[zzYV7.OFB16.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                zzWbM[zzYV7.OFB32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                zzWbM[zzYV7.OFB64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                zzWbM[zzYV7.OFB128.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                zzWbM[zzYV7.OFB256.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                zzWbM[zzYV7.CTR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    zzYWU(zzYV7 zzyv7) {
        this.zzWbO = zzyv7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final byte[] zz5(byte[] bArr, int i) {
        switch (C155891.zzWbM[this.zzWbO.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                if (bArr != null && bArr.length != i) {
                    throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "IV must be ", " bytes long"));
                }
                return bArr;
            case 14:
                if (bArr != null && bArr.length > i) {
                    throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "CTR IV must be less than ", " bytes long"));
                }
                return bArr;
            default:
                return bArr;
        }
    }

    public final zzYV7 zzXE1() {
        return this.zzWbO;
    }

    public final byte[] zzZ(int i, SecureRandom secureRandom) {
        if (this.zzWbO.zzXCM()) {
            return this.zzWbO.zzY(i, secureRandom);
        }
        return null;
    }
}
