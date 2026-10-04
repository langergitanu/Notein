package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfDigitalSignatureHashAlgorithm {
    public static final int RIPE_MD_160 = 3;
    public static final int SHA_256 = 0;
    public static final int SHA_384 = 1;
    public static final int SHA_512 = 2;
    public static final int length = 4;

    private PdfDigitalSignatureHashAlgorithm() {
    }

    public static int fromName(String str) {
        if ("SHA_256".equals(str)) {
            return 0;
        }
        if ("SHA_384".equals(str)) {
            return 1;
        }
        if ("SHA_512".equals(str)) {
            return 2;
        }
        if ("RIPE_MD_160".equals(str)) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown PdfDigitalSignatureHashAlgorithm name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown PdfDigitalSignatureHashAlgorithm value." : "RIPE_MD_160" : "SHA_512" : "SHA_384" : "SHA_256";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Unknown PdfDigitalSignatureHashAlgorithm value." : "RipeMD160" : "Sha512" : "Sha384" : "Sha256";
    }
}
