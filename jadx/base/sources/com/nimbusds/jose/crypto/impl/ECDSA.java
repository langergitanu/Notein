package com.nimbusds.jose.crypto.impl;

import com.aspose.slides.PatternStyle;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.jwk.Curve;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECKey;

/* JADX INFO: loaded from: classes9.dex */
public class ECDSA {
    private ECDSA() {
    }

    public static int getSignatureByteArrayLength(JWSAlgorithm jWSAlgorithm) throws JOSEException {
        if (jWSAlgorithm.equals(JWSAlgorithm.ES256) || jWSAlgorithm.equals(JWSAlgorithm.ES256K)) {
            return 64;
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.ES384)) {
            return 96;
        }
        if (jWSAlgorithm.equals(JWSAlgorithm.ES512)) {
            return 132;
        }
        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, ECDSAProvider.SUPPORTED_ALGORITHMS));
    }

    public static Signature getSignerAndVerifier(JWSAlgorithm jWSAlgorithm, Provider provider) throws JOSEException {
        String str = "SHA256withECDSA";
        if (!jWSAlgorithm.equals(JWSAlgorithm.ES256) && !jWSAlgorithm.equals(JWSAlgorithm.ES256K)) {
            if (jWSAlgorithm.equals(JWSAlgorithm.ES384)) {
                str = "SHA384withECDSA";
            } else {
                if (!jWSAlgorithm.equals(JWSAlgorithm.ES512)) {
                    throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, ECDSAProvider.SUPPORTED_ALGORITHMS));
                }
                str = "SHA512withECDSA";
            }
        }
        try {
            return provider != null ? Signature.getInstance(str, provider) : Signature.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new JOSEException("Unsupported ECDSA algorithm: " + e.getMessage(), e);
        }
    }

    public static JWSAlgorithm resolveAlgorithm(ECKey eCKey) throws JOSEException {
        return resolveAlgorithm(Curve.forECParameterSpec(eCKey.getParams()));
    }

    public static byte[] transcodeSignatureToConcat(byte[] bArr, int i) throws JOSEException {
        int i2;
        if (bArr.length < 8 || bArr[0] != 48) {
            throw new JOSEException("Invalid ECDSA signature format");
        }
        byte b = bArr[1];
        if (b > 0) {
            i2 = 2;
        } else {
            if (b != -127) {
                throw new JOSEException("Invalid ECDSA signature format");
            }
            i2 = 3;
        }
        int i3 = bArr[i2 + 1];
        int i4 = i3;
        while (i4 > 0 && bArr[((i2 + 2) + i3) - i4] == 0) {
            i4--;
        }
        int i5 = i2 + 2 + i3;
        int i6 = bArr[i5 + 1];
        int i7 = i6;
        while (i7 > 0 && bArr[((i5 + 2) + i6) - i7] == 0) {
            i7--;
        }
        int iMax = Math.max(Math.max(i4, i7), i / 2);
        int i8 = bArr[i2 - 1];
        if ((i8 & 255) != bArr.length - i2 || (i8 & 255) != i3 + 4 + i6 || bArr[i2] != 2 || bArr[i5] != 2) {
            throw new JOSEException("Invalid ECDSA signature format");
        }
        int i9 = iMax * 2;
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i5 - i4, bArr2, iMax - i4, i4);
        System.arraycopy(bArr, ((i5 + 2) + i6) - i7, bArr2, i9 - i7, i7);
        return bArr2;
    }

    public static byte[] transcodeSignatureToDER(byte[] bArr) throws JOSEException {
        byte[] bArr2;
        int length = bArr.length / 2;
        int i = length;
        while (i > 0 && bArr[length - i] == 0) {
            i--;
        }
        int i2 = length - i;
        int i3 = bArr[i2] < 0 ? i + 1 : i;
        int i4 = length;
        while (i4 > 0 && bArr[(length * 2) - i4] == 0) {
            i4--;
        }
        int i5 = (length * 2) - i4;
        int i6 = bArr[i5] < 0 ? i4 + 1 : i4;
        int i7 = i3 + 4 + i6;
        if (i7 > 255) {
            throw new JOSEException("Invalid ECDSA signature format");
        }
        int i8 = 1;
        if (i7 < 128) {
            bArr2 = new byte[i3 + 6 + i6];
        } else {
            bArr2 = new byte[i3 + 7 + i6];
            bArr2[1] = -127;
            i8 = 2;
        }
        bArr2[0] = PatternStyle.Wave;
        bArr2[i8] = (byte) i7;
        bArr2[i8 + 1] = 2;
        bArr2[i8 + 2] = (byte) i3;
        int i9 = i8 + 3 + i3;
        System.arraycopy(bArr, i2, bArr2, i9 - i, i);
        bArr2[i9] = 2;
        bArr2[i9 + 1] = (byte) i6;
        System.arraycopy(bArr, i5, bArr2, ((i9 + 2) + i6) - i4, i4);
        return bArr2;
    }

    public static JWSAlgorithm resolveAlgorithm(Curve curve) throws JOSEException {
        if (curve != null) {
            if (Curve.P_256.equals(curve)) {
                return JWSAlgorithm.ES256;
            }
            if (Curve.SECP256K1.equals(curve)) {
                return JWSAlgorithm.ES256K;
            }
            if (Curve.P_384.equals(curve)) {
                return JWSAlgorithm.ES384;
            }
            if (Curve.P_521.equals(curve)) {
                return JWSAlgorithm.ES512;
            }
            throw new JOSEException("Unexpected curve: " + curve);
        }
        throw new JOSEException("The EC key curve is not supported, must be P-256, P-384 or P-521");
    }
}
