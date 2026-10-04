package o0oOoOo;

import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33625OooOoO;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: o0oOoOo.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31071OoooO implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f110897OooOo0o;

    public /* synthetic */ C31071OoooO(int i) {
        this.f110897OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f110897OooOo0o) {
            case 0:
                C31076OoooOOO f = (C31076OoooOOO) obj;
                C31076OoooOOO s = (C31076OoooOOO) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(f, "f");
                kotlin.jvm.internal.OooOOO0.OooO0oO(s, "s");
                Long l = f.f110900OooO0OO;
                Long l2 = s.f110900OooO0OO;
                return Integer.valueOf((l == null || l2 == null) ? (l != null || l2 == null) ? (l == null || l2 != null) ? kotlin.jvm.internal.OooOOO0.OooOO0(s.f110898OooO00o, f.f110898OooO00o) : -1 : 1 : kotlin.jvm.internal.OooOOO0.OooOO0(l2.longValue(), l.longValue()));
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || (((InterfaceC34415OooO0oo.OooO0O0) obj2) instanceof InterfaceC33625OooOoO));
        }
    }
}
