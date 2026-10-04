package com.aspose.words.internal;

import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import javax.crypto.spec.DHPublicKeySpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPZ {
    public static DHParameterSpec zzX(zzZ38 zzz38) {
        return new zzYN4(zzz38);
    }

    public static zzZ38 zzZ(DHParameterSpec dHParameterSpec) {
        if (!(dHParameterSpec instanceof zzYN4)) {
            return new zzZ38(dHParameterSpec.getP(), null, dHParameterSpec.getG(), dHParameterSpec.getL());
        }
        zzYN4 zzyn4 = (zzYN4) dHParameterSpec;
        return new zzZ38(zzyn4.getP(), zzyn4.getQ(), zzyn4.getG(), 0, zzyn4.getL(), zzyn4.zzXHB(), zzyn4.zzXGq());
    }

    public static zzZ38 zzZ(DHPublicKeySpec dHPublicKeySpec) {
        if (dHPublicKeySpec instanceof zzYN2) {
            return zzZ(((zzYN2) dHPublicKeySpec).getParams());
        }
        return new zzZ38(dHPublicKeySpec.getP(), dHPublicKeySpec.getG());
    }

    public static zzZ38 zzZ(DHPrivateKeySpec dHPrivateKeySpec) {
        if (dHPrivateKeySpec instanceof zzYN3) {
            return zzZ(((zzYN3) dHPrivateKeySpec).getParams());
        }
        return new zzZ38(dHPrivateKeySpec.getP(), dHPrivateKeySpec.getG());
    }
}
