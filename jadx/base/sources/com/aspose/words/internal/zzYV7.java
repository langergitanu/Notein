package com.aspose.words.internal;

import com.google.android.gms.stats.CodePackage;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public enum zzYV7 {
    ECB("ECB", false),
    CBC("CBC", true),
    CBCMAC("CBCMAC", false),
    CFB8("CFB8", true),
    CFB16("CFB16", true),
    CFB32("CFB32", true),
    CFB64("CFB64", true),
    CFB128("CFB128", true),
    CFB256("CFB256", true),
    OFB8("OFB8", true),
    OFB16("OFB16", true),
    OFB32("OFB32", true),
    OFB64("OFB64", true),
    OFB128("OFB128", true),
    OFB256("OFB256", true),
    CTR("CTR", true),
    GCM(CodePackage.GCM, true),
    CCM("CCM", true),
    OCB("OCB", true),
    EAX("EAX", true),
    GOSTMAC("MAC", false),
    CMAC("CMAC", false),
    GMAC("GMAC", true),
    WRAP("WRAP", false),
    WRAPPAD("WRAPPAD", false),
    RFC3217_WRAP("RFC3217WRAP", false),
    RFC3211_WRAP("RFC3211WRAP", true),
    OpenPGPCFB("OPENPGPCFB", false),
    GCFB("GCFB", true),
    GOFB("GOFB", true),
    CFB8MAC("CFB8MAC", false),
    ISO9797alg3("ISO979ALG3", false);

    private final boolean zzVZE;
    private final String zzVZF;

    /* JADX INFO: renamed from: com.aspose.words.internal.zzYV7$1 */
    public static /* synthetic */ class C155611 {
        static final /* synthetic */ int[] zzWbM;

        static {
            int[] iArr = new int[zzYV7.values().length];
            zzWbM = iArr;
            try {
                iArr[zzYV7.CCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zzWbM[zzYV7.OCB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    zzYV7(String str, boolean z) {
        this.zzVZF = str;
        this.zzVZE = z;
    }

    public final boolean zzXCM() {
        return this.zzVZE;
    }

    public final String zzXCN() {
        return this.zzVZF;
    }

    public final byte[] zzY(int i, SecureRandom secureRandom) {
        int i2 = C155611.zzWbM[ordinal()];
        byte[] bArr = i2 != 1 ? i2 != 2 ? new byte[i] : new byte[i - 1] : new byte[i - 4];
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
            return bArr;
        }
        zzZ5L.zzXGZ().nextBytes(bArr);
        return bArr;
    }
}
