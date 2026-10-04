package com.nimbusds.jose.crypto.impl;

import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.IntegerUtils;
import com.nimbusds.jose.util.StandardCharset;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class PBKDF2 {
    public static final byte[] ZERO_BYTE = {0};

    private PBKDF2() {
    }

    public static SecretKey deriveKey(byte[] bArr, byte[] bArr2, int i, PRFParams pRFParams) throws JOSEException {
        Mac initMac = HMAC.getInitMac(new SecretKeySpec(bArr, pRFParams.getMACAlgorithm()), pRFParams.getMacProvider());
        int macLength = initMac.getMacLength();
        if (pRFParams.getDerivedKeyByteLength() > 4294967295L) {
            throw new JOSEException("derived key too long " + pRFParams.getDerivedKeyByteLength());
        }
        int iCeil = (int) Math.ceil(((double) pRFParams.getDerivedKeyByteLength()) / ((double) macLength));
        int i2 = iCeil - 1;
        int derivedKeyByteLength = pRFParams.getDerivedKeyByteLength() - (macLength * i2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        while (i3 < iCeil) {
            int i4 = i3 + 1;
            byte[] bArrExtractBlock = extractBlock(bArr2, i, i4, initMac);
            if (i3 == i2) {
                bArrExtractBlock = ByteUtils.subArray(bArrExtractBlock, 0, derivedKeyByteLength);
            }
            byteArrayOutputStream.write(bArrExtractBlock, 0, bArrExtractBlock.length);
            i3 = i4;
        }
        return new SecretKeySpec(byteArrayOutputStream.toByteArray(), AES256KeyLoader.AES_ALGORITHM);
    }

    private static byte[] extractBlock(byte[] bArr, int i, int i2, Mac mac) {
        byte[] bArrDoFinal = null;
        byte[] bArrDoFinal2 = null;
        for (int i3 = 1; i3 <= i; i3++) {
            if (i3 == 1) {
                bArrDoFinal = mac.doFinal(ByteUtils.concat(bArr, IntegerUtils.toBytes(i2)));
                bArrDoFinal2 = bArrDoFinal;
            } else {
                bArrDoFinal2 = mac.doFinal(bArrDoFinal2);
                for (int i4 = 0; i4 < bArrDoFinal2.length; i4++) {
                    bArrDoFinal[i4] = (byte) (bArrDoFinal2[i4] ^ bArrDoFinal[i4]);
                }
            }
        }
        return bArrDoFinal;
    }

    public static byte[] formatSalt(JWEAlgorithm jWEAlgorithm, byte[] bArr) throws JOSEException {
        byte[] bytes = jWEAlgorithm.toString().getBytes(StandardCharset.UTF_8);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(ZERO_BYTE);
            byteArrayOutputStream.write(bArr);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new JOSEException(e.getMessage(), e);
        }
    }
}
