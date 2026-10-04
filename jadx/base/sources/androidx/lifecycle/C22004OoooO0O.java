package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.OooO0OO;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.lifecycle.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C22004OoooO0O implements InterfaceC21986OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0OO.OooO00o f65641OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC21988OooOoo0 f65642OooOo0o;

    public C22004OoooO0O(InterfaceC21988OooOoo0 interfaceC21988OooOoo0) {
        this.f65642OooOo0o = interfaceC21988OooOoo0;
        OooO0OO oooO0OO = OooO0OO.f65506OooO0OO;
        Class<?> cls = interfaceC21988OooOoo0.getClass();
        OooO0OO.OooO00o oooO00o = (OooO0OO.OooO00o) oooO0OO.f65507OooO00o.get(cls);
        this.f65641OooOo = oooO00o == null ? oooO0OO.OooO00o(cls, null) : oooO00o;
    }

    @Override // androidx.lifecycle.InterfaceC21986OooOoOO
    public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        HashMap map = this.f65641OooOo.f65509OooO00o;
        List list = (List) map.get(oooO00o);
        InterfaceC21988OooOoo0 interfaceC21988OooOoo0 = this.f65642OooOo0o;
        OooO0OO.OooO00o.OooO00o(list, interfaceC21987OooOoo, oooO00o, interfaceC21988OooOoo0);
        OooO0OO.OooO00o.OooO00o((List) map.get(AbstractC21979OooOOo0.OooO00o.ON_ANY), interfaceC21987OooOoo, oooO00o, interfaceC21988OooOoo0);
    }
}
