package oO0oOoO;

import java.io.IOException;
import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.Oooo0;
import oO0oO0oo.C34083OooO;
import oO0oO0oo.C34089OooO0o0;
import oO0oO0oo.C34093OooOO0O;
import oO0oO0oo.C34096OooOOO0;
import oO0oOo0.C34142OooO00o;
import oO0oOo0.C34159OooOOoo;
import oO0oOo0.C34162OooOo00;
import oO0oOooo.C34225OooO0o0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oOoO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34186OooOOO0 extends AbstractC34193OooOo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public AbstractC34033OooOo0o f122818OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C34083OooO f122819OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // oO0oOoO.AbstractC34193OooOo00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C34194OooOo0O OooO0O0(C34225OooO0o0 c34225OooO0o0) throws C34179OooO0o0, IOException {
        C34096OooOOO0 c34096OooOOO0OooO0oo;
        InterfaceC34183OooOO0O interfaceC34183OooOO0O = (InterfaceC34183OooOO0O) c34225OooO0o0;
        C34142OooO00o c34142OooO00oOooO0O0 = interfaceC34183OooOO0O.OooO0O0();
        C34093OooOO0O c34093OooOO0O = this.f122819OooO0o0.f122464OooOo;
        oO0oO0Oo.OooOo00 oooOo00 = c34093OooOO0O.f122498OooOo0o;
        C34159OooOOoo c34159OooOOooOooO0oo = null;
        if (oooOo00 instanceof Oooo0) {
            Oooo0 oooo0 = (Oooo0) oooOo00;
            c34096OooOOO0OooO0oo = oooo0.f122380OooOoO0 == 1 ? C34096OooOOO0.OooO0oo(oooo0) : null;
        }
        if (c34096OooOOO0OooO0oo != null) {
            new C34162OooOo00(c34142OooO00oOooO0O0, c34096OooOOO0OooO0oo.f122503OooOo.OooOOo());
            byte[] bArr = this.f122818OooO0o.f122362OooOo0o;
            return interfaceC34183OooOO0O.OooO00o();
        }
        oO0oO0Oo.OooOo00 oooOo002 = c34093OooOO0O.f122498OooOo0o;
        C34089OooO0o0 c34089OooO0o0 = oooOo002 instanceof C34089OooO0o0 ? (C34089OooO0o0) oooOo002 : null;
        if (c34089OooO0o0 == null) {
            if (oooOo002 instanceof Oooo0) {
                Oooo0 oooo02 = (Oooo0) oooOo002;
                if (oooo02.f122380OooOoO0 == 0) {
                    c34159OooOOooOooO0oo = C34159OooOOoo.OooO0oo(oooo02);
                }
            }
            C34332OooO00o.OooO00o(c34159OooOOooOooO0oo.f122739OooOo0o);
        } else {
            c34089OooO0o0.f122486OooOo.OooOOo();
        }
        throw new C34179OooO0o0("No support for 'originator' as IssuerAndSerialNumber or SubjectKeyIdentifier");
    }
}
