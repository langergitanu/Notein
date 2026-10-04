package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYN6 {

    /* JADX INFO: renamed from: e */
    private static final zzZDC f51243e = zzZC8.zzWHS;

    private static String zzC(zzZDA zzzda) {
        String strZzC = zzYM5.zzC(zzzda);
        int iIndexOf = strZzC.indexOf(45);
        if (iIndexOf <= 0 || strZzC.startsWith("SHA3")) {
            return strZzC;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strZzC.substring(0, iIndexOf));
        return androidx.concurrent.futures.OooO0O0.OooO00o(strZzC, iIndexOf + 1, sb);
    }

    public static String zzS(zzZ86 zzz86) {
        zzZDK zzzdkZzXJj = zzz86.zzXJj();
        if (zzzdkZzXJj != null && !f51243e.equals(zzzdkZzXJj)) {
            if (zzz86.zzXJk().equals(zzZ96.zzWys)) {
                return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzC(zzZ8Z.zzXB(zzzdkZzXJj).zzXJ3().zzXJk()), "withRSAandMGF1");
            }
            if (zzz86.zzXJk().equals(zzZ6W.zzWob)) {
                return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzC(zzZDA.zzYA(zzZD4.zzYy(zzzdkZzXJj).zzg6(0))), "withECDSA");
            }
        }
        return zzz86.zzXJk().getId();
    }

    public static void zzZ(Signature signature, zzZDK zzzdk) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (zzzdk == null || f51243e.equals(zzzdk)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(zzzdk.zzXL0().getEncoded());
            if (signature.getAlgorithm().endsWith(IDevicePopManager.MGF_1)) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e) {
                    throw new SignatureException("Exception extracting parameters: " + e.getMessage());
                }
            }
        } catch (IOException e2) {
            throw new SignatureException(C21111o0ooOoO.OooO00o(e2, new StringBuilder("IOException decoding parameters: ")));
        }
    }
}
