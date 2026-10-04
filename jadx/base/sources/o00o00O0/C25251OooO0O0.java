package o00o00O0;

import android.content.res.Resources;
import o00Ooo0o.C25111OooO;
import o00OooO.InterfaceC25145OooOo0o;
import o00o000.C25225OooOo0O;
import oO0oO0Oo.C34032OooOo0O;
import oO0oO0oo.InterfaceC34084OooO00o;

/* JADX INFO: renamed from: o00o00O0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25251OooO0O0 implements InterfaceC25253OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f85976OooO00o;

    public C25251OooO0O0(byte[] bArr) {
        C34032OooOo0O c34032OooOo0O = InterfaceC34084OooO00o.f122469OooO0Oo;
        this.f85976OooO00o = bArr;
    }

    @Override // o00o00O0.InterfaceC25253OooO0o0
    public InterfaceC25145OooOo0o OooO00o(InterfaceC25145OooOo0o interfaceC25145OooOo0o, C25111OooO c25111OooO) {
        if (interfaceC25145OooOo0o == null) {
            return null;
        }
        return new C25225OooOo0O((Resources) this.f85976OooO00o, interfaceC25145OooOo0o);
    }

    public C25251OooO0O0(Resources resources) {
        this.f85976OooO00o = resources;
    }
}
