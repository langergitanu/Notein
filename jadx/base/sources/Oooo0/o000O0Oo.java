package Oooo0;

import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import oo000o.InterfaceC34635OooOOOO;
import oo0o0Oo.C34695OooOOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34695OooOOo0 f60144OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public InterfaceC34635OooOOOO f60145OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public InterfaceC34635OooOOOO f60146OooO0OO;

    public o000O0Oo(C34695OooOOo0 c34695OooOOo0) {
        this.f60144OooO00o = c34695OooOOo0;
    }

    public final long OooO00o(long j) {
        C21291OooO0oO c21291OooO0oOOooO0o;
        InterfaceC34635OooOOOO interfaceC34635OooOOOO = this.f60145OooO0O0;
        C21291OooO0oO c21291OooO0oO = C21291OooO0oO.f61723OooO0o0;
        if (interfaceC34635OooOOOO != null) {
            if (interfaceC34635OooOOOO.OooOo()) {
                InterfaceC34635OooOOOO interfaceC34635OooOOOO2 = this.f60146OooO0OO;
                c21291OooO0oOOooO0o = interfaceC34635OooOOOO2 != null ? interfaceC34635OooOOOO2.OooO0o(interfaceC34635OooOOOO, true) : null;
            } else {
                c21291OooO0oOOooO0o = c21291OooO0oO;
            }
            if (c21291OooO0oOOooO0o != null) {
                c21291OooO0oO = c21291OooO0oOOooO0o;
            }
        }
        float fOooO0OO = C21290OooO0o0.OooO0OO(j);
        float fOooO0OO2 = c21291OooO0oO.f61724OooO00o;
        if (fOooO0OO >= fOooO0OO2) {
            float fOooO0OO3 = C21290OooO0o0.OooO0OO(j);
            fOooO0OO2 = c21291OooO0oO.f61726OooO0OO;
            if (fOooO0OO3 <= fOooO0OO2) {
                fOooO0OO2 = C21290OooO0o0.OooO0OO(j);
            }
        }
        float fOooO0Oo = C21290OooO0o0.OooO0Oo(j);
        float fOooO0Oo2 = c21291OooO0oO.f61725OooO0O0;
        if (fOooO0Oo >= fOooO0Oo2) {
            float fOooO0Oo3 = C21290OooO0o0.OooO0Oo(j);
            fOooO0Oo2 = c21291OooO0oO.f61727OooO0Oo;
            if (fOooO0Oo3 <= fOooO0Oo2) {
                fOooO0Oo2 = C21290OooO0o0.OooO0Oo(j);
            }
        }
        return C21289OooO0o.OooO00o(fOooO0OO2, fOooO0Oo2);
    }

    public final int OooO0O0(long j, boolean z) {
        if (z) {
            j = OooO00o(j);
        }
        return this.f60144OooO00o.OooOO0(OooO0OO(j));
    }

    public final long OooO0OO(long j) {
        C21290OooO0o0 c21290OooO0o0;
        InterfaceC34635OooOOOO interfaceC34635OooOOOO = this.f60145OooO0O0;
        if (interfaceC34635OooOOOO == null) {
            return j;
        }
        InterfaceC34635OooOOOO interfaceC34635OooOOOO2 = this.f60146OooO0OO;
        if (interfaceC34635OooOOOO2 != null) {
            c21290OooO0o0 = new C21290OooO0o0((interfaceC34635OooOOOO.OooOo() && interfaceC34635OooOOOO2.OooOo()) ? interfaceC34635OooOOOO.OooOOO0(interfaceC34635OooOOOO2, j) : j);
        } else {
            c21290OooO0o0 = null;
        }
        return c21290OooO0o0 != null ? c21290OooO0o0.f61722OooO00o : j;
    }
}
