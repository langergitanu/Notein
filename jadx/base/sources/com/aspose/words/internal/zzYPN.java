package com.aspose.words.internal;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
class zzYPN extends zzYQK {

    /* JADX INFO: renamed from: iv */
    private byte[] f51254iv;

    @Override // java.security.AlgorithmParametersSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }
        this.f51254iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
    }

    @Override // java.security.AlgorithmParametersSpi
    public String engineToString() {
        return "IV Parameters";
    }

    @Override // com.aspose.words.internal.zzYQK
    public final void zzVV(byte[] bArr) throws IOException {
        try {
            this.f51254iv = ((zzZD9) zzZD5.zzXo(bArr)).zzXL5();
        } catch (Exception e) {
            throw new IOException("Exception decoding: " + e);
        }
    }

    @Override // com.aspose.words.internal.zzYQK
    public final byte[] zzXBF() throws IOException {
        return new zzZC6(this.f51254iv).getEncoded();
    }

    @Override // com.aspose.words.internal.zzYQK
    public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
            return new IvParameterSpec(this.f51254iv);
        }
        throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
    }
}
