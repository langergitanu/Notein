package com.aspose.words.internal;

import java.security.interfaces.DSAParams;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.security.spec.DSAPublicKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPY {
    public static DSAParams zzV(zzZ36 zzz36) {
        return new DSAParameterSpec(zzz36.getP(), zzz36.getQ(), zzz36.getG());
    }

    public static zzZ36 zzZ(DSAParams dSAParams) {
        return new zzZ36(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
    }

    public static zzZ36 zzZ(DSAPublicKeySpec dSAPublicKeySpec) {
        return new zzZ36(dSAPublicKeySpec.getP(), dSAPublicKeySpec.getQ(), dSAPublicKeySpec.getG());
    }

    public static zzZ36 zzZ(DSAPrivateKeySpec dSAPrivateKeySpec) {
        return new zzZ36(dSAPrivateKeySpec.getP(), dSAPrivateKeySpec.getQ(), dSAPrivateKeySpec.getG());
    }
}
