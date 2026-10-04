package oO00O0o0;

import java.util.List;
import java.util.Map;
import java.util.Set;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34438OooOoo0;
import oOo00Oo0.InterfaceC34516OooOo0O;

/* JADX INFO: renamed from: oO00O0o0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32185OooO0oO implements InterfaceC32195OooOoO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C32185OooO0oO f115528OooO0OO = new C32185OooO0oO();

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final void OooO00o(InterfaceC32508OooOOOo<? super String, ? super List<String>, C32460OooOooO> interfaceC32508OooOOOo) {
        InterfaceC34516OooOo0O.OooO00o.OooO00o(this, interfaceC32508OooOOOo);
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final boolean OooO0O0() {
        return true;
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final Set<Map.Entry<String, List<String>>> entries() {
        return C34438OooOoo0.f123458OooOo0o;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof InterfaceC32195OooOoO) && ((InterfaceC32195OooOoO) obj).isEmpty();
    }

    @Override // oOo00Oo0.InterfaceC34516OooOo0O
    public final boolean isEmpty() {
        return true;
    }

    public final String toString() {
        return "Parameters " + C34438OooOoo0.f123458OooOo0o;
    }
}
