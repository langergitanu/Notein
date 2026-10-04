package o0ooo000;

import Oooo0oo.AbstractC21138OooO0oo;
import com.microsoft.identity.common.java.crypto.key.AES256KeyLoader;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import javax.crypto.KeyGenerator;
import o0000Ooo.C24239OooOOO0;
import o0ooO0Oo.AbstractC31434OooO0O0;
import o0ooO0Oo.C31433OooO00o;
import o0ooO0Oo.C31435OooO0OO;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31450OooOOoo;
import o0ooOO0o.C31611OooO00o;
import oO0oOOoo.C34135OooO0OO;
import oO0oOo.C34140OooO0o0;
import oO0oOoO.C34179OooO0o0;
import oO0oOoO.C34185OooOOO;

/* JADX INFO: renamed from: o0ooo000.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31743OooO0oo extends AbstractC31745OooOO0O {
    public C31743OooO0oo() {
    }

    public static void OooOO0(StringBuilder sb, C34185OooOOO c34185OooOOO, X509Certificate x509Certificate, C34140OooO0o0 c34140OooO0o0) {
        BigInteger bigInteger = c34185OooOOO.f122817OooOo0o.f122848OooOoO0;
        if (bigInteger != null) {
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            String string = serialNumber != null ? serialNumber.toString(16) : "unknown";
            sb.append("serial-#: rid ");
            sb.append(bigInteger.toString(16));
            sb.append(" vs. cert ");
            sb.append(string);
            sb.append(" issuer: rid '");
            sb.append(c34185OooOOO.f122817OooOo0o.f122846OooOo);
            sb.append("' vs. cert '");
            sb.append(c34140OooO0o0 == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : C34135OooO0OO.OooO0oo(c34140OooO0o0.f122681OooOo0o.f122692OooOo.f122756OooOoOO));
            sb.append("' ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    @Override // o0ooo000.AbstractC31745OooOO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO(C31739OooO0Oo c31739OooO0Oo, C31433OooO00o c31433OooO00o, AbstractC21138OooO0oo abstractC21138OooO0oo) throws IOException {
        if (!(abstractC21138OooO0oo instanceof C31741OooO0o0)) {
            throw new IOException("Provided decryption material is not compatible with the document - did you pass a null keyStore?");
        }
        c31739OooO0Oo.getClass();
        C31738OooO0OO c31738OooO0OOOooO00o = c31739OooO0Oo.OooO00o(C31441OooOO0.f112327o000OOo);
        C31436OooO0Oo c31436OooO0Oo = c31739OooO0Oo.f113368OooOo0o;
        if (c31738OooO0OOOooO00o != null) {
            C31441OooOO0 c31441OooOO0 = C31441OooOO0.f112340o000OooO;
            if (c31738OooO0OOOooO00o.f113366OooOo0o.o000O00O(c31441OooOO0, null, 40) != 0) {
                this.f113372OooO00o = (short) c31738OooO0OOOooO00o.f113366OooOo0o.o000O00O(c31441OooOO0, null, 40);
                AbstractC31434OooO0O0 abstractC31434OooO0O0O0000O0O = c31738OooO0OOOooO00o.f113366OooOo0o.o0000O0O(C31441OooOO0.f112289o0000O);
                this.f113375OooO0Oo = abstractC31434OooO0O0O0000O0O instanceof C31435OooO0OO ? ((C31435OooO0OO) abstractC31434OooO0O0O0000O0O).f112220OooOo : true;
            } else {
                C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112340o000OooO;
                if (c31436OooO0Oo.o000O00O(c31441OooOO02, null, 40) != 0) {
                    this.f113372OooO00o = (short) c31436OooO0Oo.o000O00O(c31441OooOO02, null, 40);
                    this.f113375OooO0Oo = c31739OooO0Oo.OooO0Oo();
                }
            }
        }
        try {
            ((C31741OooO0o0) abstractC21138OooO0oo).getClass();
            throw null;
        } catch (KeyStoreException e) {
            throw new IOException(e);
        } catch (CertificateEncodingException e2) {
            throw new IOException(e2);
        } catch (C34179OooO0o0 e3) {
            throw new IOException(e3);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o0ooo000.AbstractC31745OooOO0O
    public final void OooO0oo(C31611OooO00o c31611OooO00o) throws IOException {
        int i;
        byte[] bArrDigest;
        try {
            C31739OooO0Oo c31739OooO0OoOooOOO0 = c31611OooO00o.OooOOO0();
            if (c31739OooO0OoOooOOO0 == null) {
                c31739OooO0OoOooOOO0 = new C31739OooO0Oo();
            }
            C31436OooO0Oo c31436OooO0Oo = c31739OooO0OoOooOOO0.f113368OooOo0o;
            c31436OooO0Oo.o000OoOO(C31441OooOO0.f112295o0000OOo, C31441OooOO0.OooOooo("Adobe.PubSec"));
            c31436OooO0Oo.o000Oo(C31441OooOO0.f112340o000OooO, this.f113372OooO00o);
            short s = this.f113372OooO00o;
            if (s == 40) {
                i = 1;
            } else {
                if (s == 128) {
                    this.f113378OooO0oO.getClass();
                }
                i = this.f113372OooO00o == 256 ? 5 : 2;
            }
            c31436OooO0Oo.o000Oo(C31441OooOO0.f112420o00OOOO0, i);
            c31436OooO0Oo.o000OoOO(C31441OooOO0.f112270OooooOo, null);
            c31436OooO0Oo.o000OoOO(C31441OooOO0.f112399o00O0oOo, null);
            c31436OooO0Oo.o000OoOO(C31441OooOO0.f112401o00O0oo0, null);
            int length = 20;
            byte[] bArr = new byte[20];
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance(AES256KeyLoader.AES_ALGORITHM);
                keyGenerator.init(192, new SecureRandom());
                System.arraycopy(keyGenerator.generateKey().getEncoded(), 0, bArr, 0, 20);
                C31740OooO0o c31740OooO0o = (C31740OooO0o) this.f113378OooO0oO;
                int size = c31740OooO0o.f113369OooOo0o.size();
                byte[][] bArr2 = new byte[size][];
                Iterator it = c31740OooO0o.f113369OooOo0o.iterator();
                if (it.hasNext()) {
                    ((C31742OooO0oO) it.next()).getClass();
                    throw null;
                }
                int length2 = 20;
                for (int i2 = 0; i2 < size; i2++) {
                    length2 += bArr2[i2].length;
                }
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArr, 0, bArr3, 0, 20);
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr4 = bArr2[i3];
                    System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                    length += bArr4.length;
                }
                if (i == 4) {
                    c31436OooO0Oo.o000OooO(C31441OooOO0.f112406o00OO00O, "adbe.pkcs7.s5");
                    bArrDigest = C24239OooOOO0.OooO0o0().digest(bArr3);
                    OooOO0O(c31739OooO0OoOooOOO0, C31441OooOO0.f112244OooOooo, bArr2);
                } else if (i != 5) {
                    c31436OooO0Oo.o000OooO(C31441OooOO0.f112406o00OO00O, "adbe.pkcs7.s4");
                    bArrDigest = C24239OooOOO0.OooO0o0().digest(bArr3);
                    C31433OooO00o c31433OooO00o = new C31433OooO00o();
                    for (int i4 = 0; i4 < size; i4++) {
                        c31433OooO00o.OooOooo(new C31450OooOOoo(bArr2[i4]));
                    }
                    c31436OooO0Oo.o000OoOO(C31441OooOO0.f112384o00O0OO, c31433OooO00o);
                    c31433OooO00o.f112215OooOo0o = true;
                } else {
                    c31436OooO0Oo.o000OooO(C31441OooOO0.f112406o00OO00O, "adbe.pkcs7.s5");
                    bArrDigest = C24239OooOOO0.OooO0o().digest(bArr3);
                    OooOO0O(c31739OooO0OoOooOOO0, C31441OooOO0.f112247Oooo000, bArr2);
                }
                short s2 = this.f113372OooO00o;
                byte[] bArr5 = new byte[s2 / 8];
                this.f113373OooO0O0 = bArr5;
                System.arraycopy(bArrDigest, 0, bArr5, 0, s2 / 8);
                c31611OooO00o.f113009OooOoO = c31739OooO0OoOooOOO0;
                c31611OooO00o.f113008OooOo0o.f112230OooOoo0.o000OoOO(C31441OooOO0.f112322o000OO, c31436OooO0Oo);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        } catch (GeneralSecurityException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void OooOO0O(C31739OooO0Oo c31739OooO0Oo, C31441OooOO0 c31441OooOO0, byte[][] bArr) {
        C31436OooO0Oo c31436OooO0Oo = new C31436OooO0Oo();
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112272Oooooo0, c31441OooOO0);
        c31436OooO0Oo.o000Oo(C31441OooOO0.f112340o000OooO, this.f113372OooO00o);
        C31433OooO00o c31433OooO00o = new C31433OooO00o();
        for (byte[] bArr2 : bArr) {
            c31433OooO00o.OooOooo(new C31450OooOOoo(bArr2));
        }
        c31436OooO0Oo.o000OoOO(C31441OooOO0.f112384o00O0OO, c31433OooO00o);
        c31433OooO00o.f112215OooOo0o = true;
        c31436OooO0Oo.f112215OooOo0o = true;
        C31441OooOO0 c31441OooOO02 = C31441OooOO0.f112327o000OOo;
        C31441OooOO0 c31441OooOO03 = C31441OooOO0.f112270OooooOo;
        C31436OooO0Oo c31436OooO0Oo2 = c31739OooO0Oo.f113368OooOo0o;
        C31436OooO0Oo c31436OooO0OoOooo0OO = c31436OooO0Oo2.Oooo0OO(c31441OooOO03);
        if (c31436OooO0OoOooo0OO == null) {
            c31436OooO0OoOooo0OO = new C31436OooO0Oo();
            c31436OooO0Oo2.o000OoOO(c31441OooOO03, c31436OooO0OoOooo0OO);
        }
        c31436OooO0OoOooo0OO.f112215OooOo0o = true;
        c31436OooO0OoOooo0OO.o000OoOO(c31441OooOO02, c31436OooO0Oo);
        c31436OooO0Oo2.o000OoOO(C31441OooOO0.f112399o00O0oOo, c31441OooOO02);
        c31436OooO0Oo2.o000OoOO(C31441OooOO0.f112401o00O0oo0, c31441OooOO02);
        c31436OooO0Oo.f112215OooOo0o = true;
        this.f113376OooO0o = true;
    }

    public C31743OooO0oo(C31740OooO0o c31740OooO0o) {
        this.f113378OooO0oO = c31740OooO0o;
        c31740OooO0o.getClass();
        this.f113372OooO00o = (short) 40;
    }
}
