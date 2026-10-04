package oO00O0o;

import o00OooO0.C25150OooO00o;
import oO00O0o0.C32192OooOo0;
import oO00Oo0.C32269OooO0oo;
import oO0o0O0o.C33580OooO00o;

/* JADX INFO: renamed from: oO00O0o.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32181OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00Oo0.OooO0OO f115503OooO00o = new oO00Oo0.OooO0OO(null);

    public final void OooO00o(String name, String value) throws C32269OooO0oo {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        oO00Oo0.OooO0OO oooO0OO = this.f115503OooO00o;
        oooO0OO.OooOOoo(name);
        oooO0OO.OooOOoo(": ");
        oooO0OO.OooOOoo(value);
        oooO0OO.o00000oO((byte) 13);
        oooO0OO.o00000oO((byte) 10);
    }

    public final void OooO0O0(C32192OooOo0 method, String uri, String version) throws C32269OooO0oo {
        kotlin.jvm.internal.OooOOO0.OooO0oO(method, "method");
        kotlin.jvm.internal.OooOOO0.OooO0oO(uri, "uri");
        kotlin.jvm.internal.OooOOO0.OooO0oO(version, "version");
        String str = method.f115542OooO00o;
        oO00Oo0.OooO0OO oooO0OO = this.f115503OooO00o;
        C25150OooO00o.OooO(oooO0OO, str, 0, str.length(), C33580OooO00o.f121231OooO0O0);
        oooO0OO.o00000oO((byte) 32);
        C25150OooO00o.OooO(oooO0OO, uri, 0, uri.length(), C33580OooO00o.f121231OooO0O0);
        oooO0OO.o00000oO((byte) 32);
        C25150OooO00o.OooO(oooO0OO, version, 0, version.length(), C33580OooO00o.f121231OooO0O0);
        oooO0OO.o00000oO((byte) 13);
        oooO0OO.o00000oO((byte) 10);
    }
}
