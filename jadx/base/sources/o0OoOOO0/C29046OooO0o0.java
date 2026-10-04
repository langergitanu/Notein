package o0OoOOO0;

import o0oOoOo.C31039OooOO0O;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33665o00000o0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0OoOOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29046OooO0o0 implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102882OooOo0o;

    public /* synthetic */ C29046OooO0o0(int i) {
        this.f102882OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f102882OooOo0o) {
            case 0:
                C31039OooOO0O c31039OooOO0O = (C31039OooOO0O) obj;
                C31039OooOO0O c31039OooOO0O2 = (C31039OooOO0O) obj2;
                long j = c31039OooOO0O.f110819OooO0Oo;
                long j2 = c31039OooOO0O2.f110819OooO0Oo;
                return Integer.valueOf(j != j2 ? kotlin.jvm.internal.OooOOO0.OooOO0(j2, j) : c31039OooOO0O.f110817OooO0O0.compareTo(c31039OooOO0O2.f110817OooO0O0));
            default:
                InterfaceC33665o00000o0 interfaceC33665o00000o0 = (InterfaceC33665o00000o0) obj;
                InterfaceC34415OooO0oo.OooO0O0 oooO0O0 = (InterfaceC34415OooO0oo.OooO0O0) obj2;
                if (interfaceC33665o00000o0 != null) {
                    return interfaceC33665o00000o0;
                }
                if (oooO0O0 instanceof InterfaceC33665o00000o0) {
                    return (InterfaceC33665o00000o0) oooO0O0;
                }
                return null;
        }
    }
}
