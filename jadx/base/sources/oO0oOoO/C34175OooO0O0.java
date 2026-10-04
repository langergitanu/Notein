package oO0oOoO;

import java.io.IOException;
import o00o00O0.C25251OooO0O0;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.C34027OooOOOo;
import oO0oO0oo.C34085OooO0O0;
import oO0oO0oo.C34086OooO0OO;
import oO0oO0oo.C34087OooO0Oo;
import oO0oO0oo.C34094OooOO0o;
import oO0oOoO.C34177OooO0Oo;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: renamed from: oO0oOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34175OooO0O0 implements InterfaceC34334OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34085OooO0O0 f122806OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34192OooOo0 f122807OooOo0o;

    public C34175OooO0O0(byte[] bArr) throws C34179OooO0o0 {
        int i = C34180OooO0oO.f122814OooO00o;
        try {
            C34085OooO0O0 c34085OooO0O0OooO0oo = C34085OooO0O0.OooO0oo(new C34027OooOOOo(bArr).OooOOoo());
            if (c34085OooO0O0OooO0oo == null) {
                throw new C34179OooO0o0("No content found.");
            }
            this.f122806OooOo = c34085OooO0O0OooO0oo;
            try {
                C34087OooO0Oo c34087OooO0OoOooO0oo = C34087OooO0Oo.OooO0oo(c34085OooO0O0OooO0oo.f122473OooOo);
                C34094OooOO0o c34094OooOO0o = c34087OooO0OoOooO0oo.f122478OooOo;
                AbstractC34040OooOooo abstractC34040OooOooo = c34087OooO0OoOooO0oo.f122481OooOoO0;
                C34086OooO0OO c34086OooO0OO = c34087OooO0OoOooO0oo.f122480OooOoO;
                this.f122807OooOo0o = C34177OooO0Oo.OooO00o(abstractC34040OooOooo, c34086OooO0OO.f122475OooOo, new C34177OooO0Oo.OooO00o(c34086OooO0OO.f122476OooOo0o, new C25251OooO0O0(c34086OooO0OO.f122477OooOoO0.f122362OooOo0o)));
            } catch (ClassCastException e) {
                throw new C34179OooO0o0("Malformed content.", e);
            } catch (IllegalArgumentException e2) {
                throw new C34179OooO0o0("Malformed content.", e2);
            }
        } catch (IOException e3) {
            throw new C34179OooO0o0("IOException reading content.", e3);
        } catch (ClassCastException e4) {
            throw new C34179OooO0o0("Malformed content.", e4);
        } catch (IllegalArgumentException e5) {
            throw new C34179OooO0o0("Malformed content.", e5);
        }
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        return this.f122806OooOo.getEncoded();
    }
}
