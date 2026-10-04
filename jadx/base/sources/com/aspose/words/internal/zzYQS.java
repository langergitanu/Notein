package com.aspose.words.internal;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQS extends zzYQK {
    private final String zzVWA;
    private zzZD5 zzVWz;

    public zzYQS(String str) {
        this.zzVWA = str;
    }

    @Override // java.security.AlgorithmParametersSpi
    public final void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
            if (!zzYPQ.zzZ(algorithmParameterSpec)) {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
            }
            this.zzVWz = zzYPQ.zzY(algorithmParameterSpec).zzXL0();
        } else if (!(algorithmParameterSpec instanceof zzYN5)) {
            this.zzVWz = new zzZC6(((IvParameterSpec) algorithmParameterSpec).getIV());
        } else {
            zzYN5 zzyn5 = (zzYN5) algorithmParameterSpec;
            this.zzVWz = new zzZAN(zzyn5.getIV(), (zzyn5.zzXAa() + 7) / 8).zzXL0();
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    public final String engineToString() {
        return "ASN.1 Parameters";
    }

    @Override // com.aspose.words.internal.zzYQK
    public final void zzVV(byte[] bArr) throws IOException {
        this.zzVWz = zzZD5.zzXo(bArr);
    }

    @Override // com.aspose.words.internal.zzYQK
    public final byte[] zzXBF() throws IOException {
        return this.zzVWz.getEncoded();
    }

    @Override // com.aspose.words.internal.zzYQK
    public final AlgorithmParameterSpec zzk(Class cls) throws InvalidParameterSpecException {
        if (cls == IvParameterSpec.class) {
            zzZD5 zzzd5 = this.zzVWz;
            if (zzzd5 instanceof zzZD9) {
                return new IvParameterSpec(zzZD9.zzYz(this.zzVWz).zzXL5());
            }
            if (zzzd5 instanceof zzZD4) {
                return new IvParameterSpec(zzZAN.zzYc(this.zzVWz).zzXJY());
            }
            throw new InvalidParameterSpecException("Cannot convert AlgorithmParameters to IvParameterSpec");
        }
        if (cls == AlgorithmParameterSpec.class) {
            zzZD5 zzzd52 = this.zzVWz;
            if (zzzd52 instanceof zzZD9) {
                return new IvParameterSpec(zzZD9.zzYz(this.zzVWz).zzXL5());
            }
            if (!(zzzd52 instanceof zzZD4)) {
                throw new InvalidParameterSpecException("Cannot convert AlgorithmParameters to IvParameterSpec");
            }
            if (zzYPQ.zzXBc()) {
                return zzYPQ.zzX(this.zzVWz);
            }
            zzZAN zzzanZzYc = zzZAN.zzYc(this.zzVWz);
            return new zzYN5(zzzanZzYc.zzXJY(), zzzanZzYc.zzXJX() * 8);
        }
        if (zzYPQ.zzh(cls)) {
            return zzYPQ.zzX(this.zzVWz);
        }
        if (cls == zzYN5.class) {
            zzZD5 zzzd53 = this.zzVWz;
            if (zzzd53 instanceof zzZD4) {
                try {
                    zzZAN zzzanZzYc2 = zzZAN.zzYc(zzzd53);
                    return new zzYN5(zzzanZzYc2.zzXJY(), zzzanZzYc2.zzXJX() * 8);
                } catch (Exception e) {
                    throw new InvalidParameterSpecException(OooOO0.OooO0OO.OooO0Oo(e, new StringBuilder("ASN.1 encoding not recognized: ")));
                }
            }
        }
        throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
    }
}
