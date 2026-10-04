package oOO000O0;

import Oooo0oO.o0Oo0oo;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import o000o0Oo.C24610OooO0O0;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34032OooOo0O;
import oO0oOOOO.C34116OooO0o;
import oO0oOo0.C34162OooOo00;
import oO0oo0o.InterfaceC34248OooO0O0;
import oO0oooO.C34285OooO0o;
import oO0oooO.C34287OooO0oO;
import oO0oooo0.C34309OooO00o;
import oOO000o0.C34330OooO00o;
import oOO000o0.C34331OooO0O0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends KeyFactorySpi implements InterfaceC34248OooO0O0 {
    public final PrivateKey OooO00o(C34116OooO0o c34116OooO0o) throws IOException {
        C34285OooO0o c34285OooO0o;
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO = c34116OooO0o.OooO();
        int i = 0;
        if (abstractC34036OooOoOOOooO != null) {
            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooO);
            c34285OooO0o = new C34285OooO0o();
            if (abstractC34039OooOooOOooOOoo.OooOo0(0) instanceof C34029OooOOo0) {
                c34285OooO0o.f123083OooOo0o = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(0));
            } else {
                c34285OooO0o.f123082OooOo = C34032OooOo0O.OooOo0(abstractC34039OooOooOOooOOoo.OooOo0(0));
            }
            AbstractC34039OooOooO abstractC34039OooOooO = (AbstractC34039OooOooO) abstractC34039OooOooOOooOOoo.OooOo0(1);
            c34285OooO0o.f123085OooOoO0 = new byte[abstractC34039OooOooO.size()][];
            for (int i2 = 0; i2 < abstractC34039OooOooO.size(); i2++) {
                c34285OooO0o.f123085OooOoO0[i2] = ((AbstractC34033OooOo0o) abstractC34039OooOooO.OooOo0(i2)).f122362OooOo0o;
            }
            c34285OooO0o.f123084OooOoO = ((AbstractC34033OooOo0o) ((AbstractC34039OooOooO) abstractC34039OooOooOOooOOoo.OooOo0(2)).OooOo0(0)).f122362OooOo0o;
            AbstractC34039OooOooO abstractC34039OooOooO2 = (AbstractC34039OooOooO) abstractC34039OooOooOOooOOoo.OooOo0(3);
            c34285OooO0o.f123086OooOoOO = new byte[abstractC34039OooOooO2.size()][];
            for (int i3 = 0; i3 < abstractC34039OooOooO2.size(); i3++) {
                c34285OooO0o.f123086OooOoOO[i3] = ((AbstractC34033OooOo0o) abstractC34039OooOooO2.OooOo0(i3)).f122362OooOo0o;
            }
            c34285OooO0o.f123088OooOoo0 = ((AbstractC34033OooOo0o) ((AbstractC34039OooOooO) abstractC34039OooOooOOooOOoo.OooOo0(4)).OooOo0(0)).f122362OooOo0o;
            c34285OooO0o.f123087OooOoo = ((AbstractC34033OooOo0o) ((AbstractC34039OooOooO) abstractC34039OooOooOOooOOoo.OooOo0(5)).OooOo0(0)).f122362OooOo0o;
            AbstractC34039OooOooO abstractC34039OooOooO3 = (AbstractC34039OooOooO) abstractC34039OooOooOOooOOoo.OooOo0(6);
            byte[][][][] bArr = new byte[abstractC34039OooOooO3.size()][][][];
            byte[][][][] bArr2 = new byte[abstractC34039OooOooO3.size()][][][];
            byte[][][] bArr3 = new byte[abstractC34039OooOooO3.size()][][];
            byte[][] bArr4 = new byte[abstractC34039OooOooO3.size()][];
            int i4 = 0;
            while (i4 < abstractC34039OooOooO3.size()) {
                AbstractC34039OooOooO abstractC34039OooOooO4 = (AbstractC34039OooOooO) abstractC34039OooOooO3.OooOo0(i4);
                AbstractC34039OooOooO abstractC34039OooOooO5 = (AbstractC34039OooOooO) abstractC34039OooOooO4.OooOo0(i);
                bArr[i4] = new byte[abstractC34039OooOooO5.size()][][];
                for (int i5 = i; i5 < abstractC34039OooOooO5.size(); i5++) {
                    AbstractC34039OooOooO abstractC34039OooOooO6 = (AbstractC34039OooOooO) abstractC34039OooOooO5.OooOo0(i5);
                    bArr[i4][i5] = new byte[abstractC34039OooOooO6.size()][];
                    for (int i6 = 0; i6 < abstractC34039OooOooO6.size(); i6++) {
                        bArr[i4][i5][i6] = ((AbstractC34033OooOo0o) abstractC34039OooOooO6.OooOo0(i6)).f122362OooOo0o;
                    }
                }
                AbstractC34039OooOooO abstractC34039OooOooO7 = (AbstractC34039OooOooO) abstractC34039OooOooO4.OooOo0(1);
                bArr2[i4] = new byte[abstractC34039OooOooO7.size()][][];
                for (int i7 = 0; i7 < abstractC34039OooOooO7.size(); i7++) {
                    AbstractC34039OooOooO abstractC34039OooOooO8 = (AbstractC34039OooOooO) abstractC34039OooOooO7.OooOo0(i7);
                    bArr2[i4][i7] = new byte[abstractC34039OooOooO8.size()][];
                    for (int i8 = 0; i8 < abstractC34039OooOooO8.size(); i8++) {
                        bArr2[i4][i7][i8] = ((AbstractC34033OooOo0o) abstractC34039OooOooO8.OooOo0(i8)).f122362OooOo0o;
                    }
                }
                AbstractC34039OooOooO abstractC34039OooOooO9 = (AbstractC34039OooOooO) abstractC34039OooOooO4.OooOo0(2);
                bArr3[i4] = new byte[abstractC34039OooOooO9.size()][];
                for (int i9 = 0; i9 < abstractC34039OooOooO9.size(); i9++) {
                    bArr3[i4][i9] = ((AbstractC34033OooOo0o) abstractC34039OooOooO9.OooOo0(i9)).f122362OooOo0o;
                }
                bArr4[i4] = ((AbstractC34033OooOo0o) abstractC34039OooOooO4.OooOo0(3)).f122362OooOo0o;
                i4++;
                i = 0;
            }
            int length = c34285OooO0o.f123087OooOoo.length - 1;
            c34285OooO0o.f123089OooOooO = new C34309OooO00o[length];
            int i10 = 0;
            while (i10 < length) {
                byte[] bArr5 = c34285OooO0o.f123087OooOoo;
                byte b = bArr5[i10];
                int i11 = i10 + 1;
                byte b2 = bArr5[i11];
                short[][][] sArrOooO0o = C24610OooO0O0.OooO0o(bArr[i10]);
                short[][][] sArrOooO0o2 = C24610OooO0O0.OooO0o(bArr2[i10]);
                short[][] sArrOooO0Oo = C24610OooO0O0.OooO0Oo(bArr3[i10]);
                short[] sArrOooO0O0 = C24610OooO0O0.OooO0O0(bArr4[i10]);
                C34309OooO00o c34309OooO00o = new C34309OooO00o();
                int i12 = b & 255;
                c34309OooO00o.f123177OooO00o = i12;
                int i13 = b2 & 255;
                c34309OooO00o.f123178OooO0O0 = i13;
                c34309OooO00o.f123179OooO0OO = i13 - i12;
                c34309OooO00o.f123180OooO0Oo = sArrOooO0o;
                c34309OooO00o.f123182OooO0o0 = sArrOooO0o2;
                c34309OooO00o.f123181OooO0o = sArrOooO0Oo;
                c34309OooO00o.f123183OooO0oO = sArrOooO0O0;
                c34285OooO0o.f123089OooOooO[i10] = c34309OooO00o;
                i10 = i11;
            }
        } else {
            c34285OooO0o = null;
        }
        short[][] sArrOooO0Oo2 = C24610OooO0O0.OooO0Oo(c34285OooO0o.f123085OooOoO0);
        short[] sArrOooO0O02 = C24610OooO0O0.OooO0O0(c34285OooO0o.f123084OooOoO);
        short[][] sArrOooO0Oo3 = C24610OooO0O0.OooO0Oo(c34285OooO0o.f123086OooOoOO);
        short[] sArrOooO0O03 = C24610OooO0O0.OooO0O0(c34285OooO0o.f123088OooOoo0);
        byte[] bArr6 = c34285OooO0o.f123087OooOoo;
        int[] iArr = new int[bArr6.length];
        for (int i14 = 0; i14 < bArr6.length; i14++) {
            iArr[i14] = bArr6[i14] & 255;
        }
        return new OooO00o(sArrOooO0Oo2, sArrOooO0O02, sArrOooO0Oo3, sArrOooO0O03, iArr, c34285OooO0o.f123089OooOooO);
    }

    public final PublicKey OooO0O0(C34162OooOo00 c34162OooOo00) throws IOException {
        C34287OooO0oO c34287OooO0oO;
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO = c34162OooOo00.OooO();
        if (abstractC34036OooOoOOOooO != null) {
            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34036OooOoOOOooO);
            c34287OooO0oO = new C34287OooO0oO();
            if (abstractC34039OooOooOOooOOoo.OooOo0(0) instanceof C34029OooOOo0) {
                c34287OooO0oO.f123100OooOo0o = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(0));
            } else {
                c34287OooO0oO.f123099OooOo = C34032OooOo0O.OooOo0(abstractC34039OooOooOOooOOoo.OooOo0(0));
            }
            c34287OooO0oO.f123102OooOoO0 = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(1));
            AbstractC34039OooOooO abstractC34039OooOooOOooOOoo2 = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooOOooOOoo.OooOo0(2));
            c34287OooO0oO.f123101OooOoO = new byte[abstractC34039OooOooOOooOOoo2.size()][];
            for (int i = 0; i < abstractC34039OooOooOOooOOoo2.size(); i++) {
                c34287OooO0oO.f123101OooOoO[i] = AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo2.OooOo0(i)).f122362OooOo0o;
            }
            AbstractC34039OooOooO abstractC34039OooOooO = (AbstractC34039OooOooO) abstractC34039OooOooOOooOOoo.OooOo0(3);
            c34287OooO0oO.f123103OooOoOO = new byte[abstractC34039OooOooO.size()][];
            for (int i2 = 0; i2 < abstractC34039OooOooO.size(); i2++) {
                c34287OooO0oO.f123103OooOoOO[i2] = AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooO.OooOo0(i2)).f122362OooOo0o;
            }
            c34287OooO0oO.f123104OooOoo0 = AbstractC34033OooOo0o.OooOOo0(((AbstractC34039OooOooO) abstractC34039OooOooOOooOOoo.OooOo0(4)).OooOo0(0)).f122362OooOo0o;
        } else {
            c34287OooO0oO = null;
        }
        return new OooO0O0(c34287OooO0oO.f123102OooOoO0.OooOo0(), C24610OooO0O0.OooO0Oo(c34287OooO0oO.f123101OooOoO), C24610OooO0O0.OooO0Oo(c34287OooO0oO.f123103OooOoOO), C24610OooO0O0.OooO0O0(c34287OooO0oO.f123104OooOoo0));
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C34330OooO00o) {
            C34330OooO00o c34330OooO00o = (C34330OooO00o) keySpec;
            return new OooO00o(c34330OooO00o.f123250OooOo0o, c34330OooO00o.f123249OooOo, c34330OooO00o.f123252OooOoO0, c34330OooO00o.f123251OooOoO, c34330OooO00o.f123253OooOoOO, c34330OooO00o.f123254OooOoo0);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return OooO00o(C34116OooO0o.OooO0oo(AbstractC34036OooOoOO.OooOOO(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof C34331OooO0O0) {
            C34331OooO0O0 c34331OooO0O0 = (C34331OooO0O0) keySpec;
            return new OooO0O0(c34331OooO0O0.f123257OooOoO, c34331OooO0O0.f123256OooOo0o, c34331OooO0O0.f123255OooOo, c34331OooO0O0.f123258OooOoO0);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return OooO0O0(C34162OooOo00.OooO0oo(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof OooO00o) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(((OooO00o) key).getEncoded());
            }
            if (C34330OooO00o.class.isAssignableFrom(cls)) {
                OooO00o oooO00o = (OooO00o) key;
                short[][] sArr = oooO00o.f123210OooOo0o;
                C34330OooO00o c34330OooO00o = new C34330OooO00o();
                c34330OooO00o.f123250OooOo0o = sArr;
                c34330OooO00o.f123249OooOo = oooO00o.f123209OooOo;
                c34330OooO00o.f123252OooOoO0 = oooO00o.f123212OooOoO0;
                c34330OooO00o.f123251OooOoO = oooO00o.f123211OooOoO;
                c34330OooO00o.f123253OooOoOO = oooO00o.f123214OooOoo0;
                c34330OooO00o.f123254OooOoo0 = oooO00o.f123213OooOoOO;
                return c34330OooO00o;
            }
        } else {
            if (!(key instanceof OooO0O0)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(((OooO0O0) key).getEncoded());
            }
            if (C34331OooO0O0.class.isAssignableFrom(cls)) {
                OooO0O0 oooO0O0 = (OooO0O0) key;
                int i = oooO0O0.f123217OooOoO;
                short[][] sArr2 = oooO0O0.f123215OooOo;
                short[][] sArr3 = new short[sArr2.length][];
                for (int i2 = 0; i2 != sArr2.length; i2++) {
                    sArr3[i2] = C34332OooO00o.OooO0O0(sArr2[i2]);
                }
                short[] sArrOooO0O0 = C34332OooO00o.OooO0O0(oooO0O0.f123218OooOoO0);
                C34331OooO0O0 c34331OooO0O0 = new C34331OooO0O0();
                c34331OooO0O0.f123257OooOoO = i;
                c34331OooO0O0.f123256OooOo0o = oooO0O0.f123216OooOo0o;
                c34331OooO0O0.f123255OooOo = sArr3;
                c34331OooO0O0.f123258OooOoO0 = sArrOooO0O0;
                return c34331OooO0O0;
            }
        }
        throw new InvalidKeySpecException(o0Oo0oo.OooO0OO("Unknown key specification: ", cls, "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof OooO00o) || (key instanceof OooO0O0)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
