package com.nimbusds.jose.crypto.impl;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: loaded from: classes9.dex */
public class RSASSA {
    private RSASSA() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:4)(2:6|(1:8)(2:9|(1:11)(7:12|(1:14)(2:16|(1:18)(2:19|(1:21)(2:40|41)))|15|44|22|(2:46|29)|34)))|5|44|22|(0)|34|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        r9 = getSignerAndVerifier(r1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        throw new com.nimbusds.jose.JOSEException("Unsupported RSASSA algorithm (after retry with alternative): " + r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d2, code lost:
    
        throw new com.nimbusds.jose.JOSEException("Unsupported RSASSA algorithm: " + r0.getMessage(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Signature getSignerAndVerifier(JWSAlgorithm jWSAlgorithm, Provider provider) throws JOSEException {
        PSSParameterSpec pSSParameterSpec;
        String str;
        String str2;
        String str3 = null;
        if (jWSAlgorithm.equals(JWSAlgorithm.RS256)) {
            str2 = "SHA256withRSA";
        } else if (jWSAlgorithm.equals(JWSAlgorithm.RS384)) {
            str2 = "SHA384withRSA";
        } else {
            if (!jWSAlgorithm.equals(JWSAlgorithm.RS512)) {
                if (jWSAlgorithm.equals(JWSAlgorithm.PS256)) {
                    pSSParameterSpec = new PSSParameterSpec(KeyUtil.HMAC_KEY_HASH_ALGORITHM, IDevicePopManager.MGF_1, MGF1ParameterSpec.SHA256, 32, 1);
                    str = "SHA256withRSAandMGF1";
                } else if (jWSAlgorithm.equals(JWSAlgorithm.PS384)) {
                    pSSParameterSpec = new PSSParameterSpec("SHA-384", IDevicePopManager.MGF_1, MGF1ParameterSpec.SHA384, 48, 1);
                    str = "SHA384withRSAandMGF1";
                } else {
                    if (!jWSAlgorithm.equals(JWSAlgorithm.PS512)) {
                        throw new JOSEException(AlgorithmSupportMessage.unsupportedJWSAlgorithm(jWSAlgorithm, RSASSAProvider.SUPPORTED_ALGORITHMS));
                    }
                    pSSParameterSpec = new PSSParameterSpec("SHA-512", IDevicePopManager.MGF_1, MGF1ParameterSpec.SHA512, 64, 1);
                    str = "SHA512withRSAandMGF1";
                }
                str3 = str;
                str2 = "RSASSA-PSS";
                Signature signerAndVerifier = getSignerAndVerifier(str2, provider);
                if (pSSParameterSpec != null) {
                    try {
                        signerAndVerifier.setParameter(pSSParameterSpec);
                    } catch (InvalidAlgorithmParameterException e) {
                        throw new JOSEException("Invalid RSASSA-PSS salt length parameter: " + e.getMessage(), e);
                    }
                }
                return signerAndVerifier;
            }
            str2 = "SHA512withRSA";
        }
        pSSParameterSpec = null;
        Signature signerAndVerifier2 = getSignerAndVerifier(str2, provider);
        if (pSSParameterSpec != null) {
        }
        return signerAndVerifier2;
    }

    private static Signature getSignerAndVerifier(String str, Provider provider) throws NoSuchAlgorithmException {
        if (provider != null) {
            return Signature.getInstance(str, provider);
        }
        return Signature.getInstance(str);
    }
}
