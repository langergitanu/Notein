package com.aspose.words.internal;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYQK extends AlgorithmParametersSpi {
    @Override // java.security.AlgorithmParametersSpi
    public final byte[] engineGetEncoded() throws IOException {
        return engineGetEncoded("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public final <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> cls) throws InvalidParameterSpecException {
        if (cls != null) {
            return (T) zzk(cls);
        }
        throw new NullPointerException("Argument to getParameterSpec must not be null");
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(byte[] bArr) throws IOException {
        engineInit(bArr, "ASN.1");
    }

    public abstract void zzVV(byte[] bArr) throws IOException;

    public abstract byte[] zzXBF() throws IOException;

    public abstract AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException;

    public boolean zzwy(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    public byte[] engineGetEncoded(String str) throws IOException {
        if (zzwy(str)) {
            return zzXBF();
        }
        throw new IOException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown parameter format: ", str));
    }

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(byte[] bArr, String str) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Encoded parameters cannot be null");
        }
        if (!zzwy(str)) {
            throw new IOException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Unknown parameter format: ", str));
        }
        try {
            zzVV(bArr);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new zzYO6(OooOO0.OooO0OO.OooO0Oo(e2, new StringBuilder("Parameter parsing failed: ")), e2);
        }
    }
}
