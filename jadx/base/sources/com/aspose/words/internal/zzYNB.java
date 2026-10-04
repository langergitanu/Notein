package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYNB extends zzYQK {
    @Override // com.aspose.words.internal.zzYQK, java.security.AlgorithmParametersSpi
    public final byte[] engineGetEncoded(String str) throws IOException {
        if (zzwy(str) || str.equalsIgnoreCase("X.509")) {
            return zzXBF();
        }
        throw new IOException("Unknown parameter format: ".concat(str));
    }

    @Override // com.aspose.words.internal.zzYQK, java.security.AlgorithmParametersSpi
    public final void engineInit(byte[] bArr, String str) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("Encoded parameters cannot be null");
        }
        if (!zzwy(str) && !str.equals("X.509")) {
            throw new IOException("Unknown parameter format: ".concat(str));
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
