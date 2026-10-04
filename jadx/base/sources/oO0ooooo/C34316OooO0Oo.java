package oO0ooooo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0Oo.C34075o00o0O;
import oO0oOO00.InterfaceC34104OooO00o;
import oO0oOOOO.InterfaceC34117OooO0o0;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34162OooOo00;
import oO0oooO.C34280OooO;
import oO0oooO.C34282OooO0O0;
import oO0oooO.C34288OooO0oo;
import oO0oooO.C34289OooOO0;
import oO0oooO.C34291OooOO0o;
import oO0oooO.C34292OooOOO;
import oO0oooO.InterfaceC34286OooO0o0;
import oO0oooOO.C34296OooO;
import oO0oooOO.C34300OooO0Oo;
import oO0oooOo.C34308OooO0O0;
import oOO000oO.C34332OooO00o;
import oOo000OO.C34417OooO0O0;
import oOo00o00.C34551OooO0OO;
import oOo00oo0.C34565OooO0OO;
import p619oO.C31898OooOOo;
import p619oO.C31904OooOoO;
import p619oO.C31905OooOoO0;
import p619oO.OooOo00;

/* JADX INFO: renamed from: oO0ooooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34316OooO0Oo {
    public static C34162OooOo00 OooO00o(oO0000oo.OooO0OO oooO0OO) throws IOException {
        if (oooO0OO instanceof C34417OooO0O0) {
            C34417OooO0O0 c34417OooO0O0 = (C34417OooO0O0) oooO0OO;
            return new C34162OooOo00(C34317OooO0o0.OooO0Oo(c34417OooO0O0.f123430OooOo), C34332OooO00o.OooO00o(c34417OooO0O0.f123431OooOoO0));
        }
        if (oooO0OO instanceof C34551OooO0OO) {
            C34551OooO0OO c34551OooO0OO = (C34551OooO0OO) oooO0OO;
            return new C34162OooOo00(new C34142OooO00o(InterfaceC34286OooO0o0.f123094OooO0Oo, new C34288OooO0oo(C34317OooO0o0.OooO0o0(c34551OooO0OO.f123790OooOo))), C34332OooO00o.OooO00o(c34551OooO0OO.f123792OooOoO0));
        }
        if (oooO0OO instanceof C34308OooO0O0) {
            return new C34162OooOo00(new C34142OooO00o(InterfaceC34286OooO0o0.f123096OooO0o0), C34332OooO00o.OooO00o(((C34308OooO0O0) oooO0OO).f123176OooOo));
        }
        if (oooO0OO instanceof C34296OooO) {
            C34296OooO c34296OooO = (C34296OooO) oooO0OO;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write((byte) 0);
            byteArrayOutputStream.write((byte) 0);
            byteArrayOutputStream.write((byte) 0);
            byteArrayOutputStream.write((byte) 1);
            try {
                byteArrayOutputStream.write(c34296OooO.getEncoded());
                return new C34162OooOo00(new C34142OooO00o(InterfaceC34117OooO0o0.f122611OooOo0O), new C34075o00o0O(byteArrayOutputStream.toByteArray()));
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }
        if (oooO0OO instanceof C34300OooO0Oo) {
            C34300OooO0Oo c34300OooO0Oo = (C34300OooO0Oo) oooO0OO;
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            int i = c34300OooO0Oo.f123144OooOo;
            byteArrayOutputStream2.write((byte) (i >>> 24));
            byteArrayOutputStream2.write((byte) (i >>> 16));
            byteArrayOutputStream2.write((byte) (i >>> 8));
            byteArrayOutputStream2.write((byte) i);
            try {
                byteArrayOutputStream2.write(c34300OooO0Oo.f123145OooOoO0.getEncoded());
                return new C34162OooOo00(new C34142OooO00o(InterfaceC34117OooO0o0.f122611OooOo0O), new C34075o00o0O(byteArrayOutputStream2.toByteArray()));
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage(), e2);
            }
        }
        if (oooO0OO instanceof C31905OooOoO0) {
            C31905OooOoO0 c31905OooOoO0 = (C31905OooOoO0) oooO0OO;
            byte[] bArrOooO0O0 = C31904OooOoO.OooO0O0(c31905OooOoO0.f113723OooOoo0);
            byte[] bArrOooO0O02 = C31904OooOoO.OooO0O0(c31905OooOoO0.f113722OooOoOO);
            byte[] encoded = c31905OooOoO0.getEncoded();
            return encoded.length > bArrOooO0O0.length + bArrOooO0O02.length ? new C34162OooOo00(new C34142OooO00o(InterfaceC34104OooO00o.f122520OooO00o), new C34075o00o0O(encoded)) : new C34162OooOo00(new C34142OooO00o(InterfaceC34286OooO0o0.f123095OooO0o, new C34280OooO(c31905OooOoO0.f113721OooOoO0.f113711OooO0O0, C34317OooO0o0.OooO0oO(c31905OooOoO0.f113663OooOo))), new C34292OooOOO(bArrOooO0O0, bArrOooO0O02));
        }
        if (!(oooO0OO instanceof OooOo00)) {
            if (!(oooO0OO instanceof C34565OooO0OO)) {
                throw new IOException("key parameters not recognized");
            }
            C34565OooO0OO c34565OooO0OO = (C34565OooO0OO) oooO0OO;
            return new C34162OooOo00(new C34142OooO00o(InterfaceC34286OooO0o0.f123093OooO0OO), new C34282OooO0O0(c34565OooO0OO.f123817OooOoO0, c34565OooO0OO.f123816OooOoO, c34565OooO0OO.f123818OooOoOO, C34317OooO0o0.OooO00o(c34565OooO0OO.f123809OooOo)));
        }
        OooOo00 oooOo00 = (OooOo00) oooO0OO;
        byte[] bArrOooO0O03 = C31904OooOoO.OooO0O0(oooOo00.f113704OooOoo0);
        byte[] bArr = oooOo00.f113703OooOoOO;
        byte[] bArrOooO0O04 = C31904OooOoO.OooO0O0(bArr);
        byte[] bArrOooO0Oo = oooOo00.OooO0Oo();
        if (bArrOooO0Oo.length > bArrOooO0O03.length + bArrOooO0O04.length) {
            return new C34162OooOo00(new C34142OooO00o(InterfaceC34104OooO00o.f122521OooO0O0), new C34075o00o0O(bArrOooO0Oo));
        }
        C34032OooOo0O c34032OooOo0O = InterfaceC34286OooO0o0.f123097OooO0oO;
        C31898OooOOo c31898OooOOo = oooOo00.f113702OooOoO0;
        return new C34162OooOo00(new C34142OooO00o(c34032OooOo0O, new C34289OooOO0(c31898OooOOo.f113667OooO0OO, c31898OooOOo.f113668OooO0Oo, C34317OooO0o0.OooO0oO(oooOo00.f113669OooOo))), new C34291OooOO0o(C31904OooOoO.OooO0O0(oooOo00.f113704OooOoo0), C31904OooOoO.OooO0O0(bArr)));
    }
}
