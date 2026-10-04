package com.aspose.words.internal;

import com.aspose.words.internal.zzZ5R;
import com.aspose.words.internal.zzZ5S;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ3G<P extends zzZ5R, S extends zzZ5S> {
    private final S zzWlc;
    private final P zzWld;

    public zzZ3G(final P p, final S s) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.aspose.words.internal.zzZ3G.1
            @Override // java.security.PrivilegedAction
            public final Object run() {
                zzZ3G.zzZ(p, s);
                return null;
            }
        });
        this.zzWld = p;
        this.zzWlc = s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void zzZ(P p, S s) {
        if ((p instanceof zzZ3P) && (s instanceof zzZ3P)) {
            zzZ3O zzz3o = (zzZ3O) s;
            zzZ3N zzz3n = (zzZ3N) p;
            if (!zzz3o.zzXGy().equals(zzz3n.zzXGy())) {
                throw new IllegalArgumentException("EC keys do not have the same domain parameters");
            }
            if (!zzz3o.zzXGy().zzXHu().zzK(zzz3o.getS()).zzXze().zzU(zzz3n.zzXGA())) {
                throw new IllegalArgumentException("EC public key not consistent with EC private key");
            }
            return;
        }
        if ((p instanceof zzZ40) && (s instanceof zzZ40)) {
            zzZ3Z zzz3z = (zzZ3Z) s;
            zzZ3Y zzz3y = (zzZ3Y) p;
            zzZ38 zzz38ZzXGD = zzz3z.zzXGD();
            if (!zzz38ZzXGD.equals(zzz3y.zzXGD())) {
                throw new IllegalArgumentException("DH keys do not have the same domain parameters");
            }
            if (!zzz38ZzXGD.getG().modPow(zzz3z.getX(), zzz38ZzXGD.getP()).equals(zzz3y.getY())) {
                throw new IllegalArgumentException("DH public key not consistent with DH private key");
            }
            return;
        }
        if ((p instanceof zzZ3X) && (s instanceof zzZ3X)) {
            zzZ3W zzz3w = (zzZ3W) s;
            zzZ3V zzz3v = (zzZ3V) p;
            zzZ36 zzz36ZzXGC = zzz3w.zzXGC();
            if (!zzz36ZzXGC.equals(zzz3v.zzXGC())) {
                throw new IllegalArgumentException("DSA keys do not have the same domain parameters");
            }
            if (!zzz36ZzXGC.getG().modPow(zzz3w.getX(), zzz36ZzXGC.getP()).equals(zzz3v.getY())) {
                throw new IllegalArgumentException("DSA public key not consistent with DSA private key");
            }
            return;
        }
        if ((p instanceof zzZ3F) && (s instanceof zzZ3F)) {
            zzZ3E zzz3e = (zzZ3E) s;
            zzZ3D zzz3d = (zzZ3D) p;
            if (!zzz3e.getModulus().equals(zzz3d.getModulus())) {
                throw new IllegalArgumentException("RSA keys do not have the same modulus");
            }
            BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
            if (!bigIntegerValueOf.modPow(zzz3e.getPrivateExponent(), zzz3e.getModulus()).modPow(zzz3d.getPublicExponent(), zzz3e.getModulus()).equals(bigIntegerValueOf)) {
                throw new IllegalArgumentException("RSA public key not consistent with RSA private key");
            }
            return;
        }
        if ((p instanceof zzZ3J) && (s instanceof zzZ3J)) {
            if (!((zzZ3J) p).zzXGz().equals(((zzZ3J) s).zzXGz())) {
                throw new IllegalArgumentException("GOST3410 parameters mismatch");
            }
            if ((p instanceof zzZ3H) && (s instanceof zzZ3I)) {
                zzZ3I zzz3i = (zzZ3I) s;
                zzZ2Z zzz2zZzXGk = zzz3i.zzXGz().zzXGk();
                if (!zzz2zZzXGk.getA().modPow(zzz3i.getX(), zzz2zZzXGk.getP()).equals(((zzZ3H) p).getY())) {
                    throw new IllegalArgumentException("GOST3410 public key not consistent with GOST3410 private key");
                }
                return;
            }
            if (!(p instanceof zzZ3Q) || !(s instanceof zzZ3R)) {
                throw new IllegalArgumentException("GOST3410 key pair inconsistent");
            }
            zzZ3R zzz3r = (zzZ3R) s;
            if (!zzz3r.zzXGz().zzXGk().zzXHu().zzK(zzz3r.getS()).zzXze().zzU(((zzZ3Q) p).zzXGA())) {
                throw new IllegalArgumentException("ECGOST3410 public key not consistent with ECGOST3410 private key");
            }
            return;
        }
        if ((p instanceof zzZ3U) && (s instanceof zzZ3U)) {
            zzZ3T zzz3t = (zzZ3T) s;
            zzZ3S zzz3s = (zzZ3S) p;
            if (!zzz3t.zzXGB().equals(zzz3s.zzXGB())) {
                throw new IllegalArgumentException("DSTU4145 keys do not have the same domain parameters");
            }
            if (!zzz3t.zzXGB().zzXGy().zzXHu().zzK(zzz3t.getS()).zzXzc().zzXze().zzU(zzz3s.zzXGA())) {
                throw new IllegalArgumentException("DSTU4145 public key not consistent with DSTU4145 private key");
            }
            return;
        }
        if ((p instanceof zzZ3M) && (s instanceof zzZ3M)) {
            zzZ3L zzz3l = (zzZ3L) s;
            zzZ3K zzz3k = (zzZ3K) p;
            if (!zzz3l.zzXGV().equals(zzz3k.zzXGV())) {
                throw new IllegalArgumentException("EdDSA keys do not have the same domain parameters");
            }
            if (!zzYGU.zzp(zzz3l.zzXGx(), zzz3k.zzXGx())) {
                throw new IllegalArgumentException("DSTU4145 public key not consistent with DSTU4145 private key");
            }
            return;
        }
        if (!(p instanceof zzZ3C) || !(s instanceof zzZ3C)) {
            throw new IllegalArgumentException("Key pair inconsistent");
        }
        zzZ3B zzz3b = (zzZ3B) s;
        zzZ3A zzz3a = (zzZ3A) p;
        if (!zzz3b.zzXGV().equals(zzz3a.zzXGV())) {
            throw new IllegalArgumentException("EdDSA keys do not have the same domain parameters");
        }
        if (!zzYGU.zzp(zzz3b.zzXGx(), zzz3a.zzXGx())) {
            throw new IllegalArgumentException("DSTU4145 public key not consistent with DSTU4145 private key");
        }
    }

    public final S zzXGv() {
        return this.zzWlc;
    }

    public final P zzXGw() {
        return this.zzWld;
    }
}
