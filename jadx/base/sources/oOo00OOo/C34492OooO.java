package oOo00OOo;

import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o00oO0O.C25515Oooo0O0;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.o000oOoO;
import oO0O0oo0.C32795OooOOO0;
import oO0O0ooO.InterfaceC32821OooO0oO;

/* JADX INFO: renamed from: oOo00OOo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34492OooO implements o000oOoO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f123599OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Object f123600OooO0OO;

    public /* synthetic */ C34492OooO() {
    }

    public InterfaceC32596OooO0o0 OooO0O0(InterfaceC32821OooO0oO interfaceC32821OooO0oO) {
        oO0Oo0.OooO0O0 oooO0O0 = (oO0Oo0.OooO0O0) this.f123600OooO0OO;
        if (oooO0O0 != null) {
            return oooO0O0.OooO00o(interfaceC32821OooO0oO);
        }
        OooOOO0.OooOOOO("resolver");
        throw null;
    }

    public String toString() {
        switch (this.f123599OooO0O0) {
            case 1:
                StringBuilder sb = new StringBuilder();
                C32795OooOOO0 c32795OooOOO0 = (C32795OooOOO0) this.f123600OooO0OO;
                sb.append(c32795OooOOO0);
                sb.append(": ");
                c32795OooOOO0.getClass();
                sb.append(((Map) C25515Oooo0O0.OooO00o(c32795OooOOO0.f117838Oooo000, C32795OooOOO0.f117833Oooo0O0[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C34492OooO(C32795OooOOO0 packageFragment) {
        OooOOO0.OooO0oO(packageFragment, "packageFragment");
        this.f123600OooO0OO = packageFragment;
    }
}
