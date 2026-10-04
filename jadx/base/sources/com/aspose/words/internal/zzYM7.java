package com.aspose.words.internal;

import java.security.AlgorithmParameters;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYM7 implements zzYM6 {
    @Override // com.aspose.words.internal.zzYM6
    public final Signature zzwg(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }

    @Override // com.aspose.words.internal.zzYM6
    public final MessageDigest zzwh(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str);
    }

    @Override // com.aspose.words.internal.zzYM6
    public final AlgorithmParameters zzwi(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str);
    }
}
