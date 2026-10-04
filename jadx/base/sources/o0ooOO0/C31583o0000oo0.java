package o0ooOO0;

import java.util.ArrayList;
import java.util.Iterator;
import oO0o0O0O.InterfaceC33569OooO0oo;

/* JADX INFO: renamed from: o0ooOO0.o0000oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31583o0000oo0 implements InterfaceC33569OooO0oo<C31581o0000oOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f112842OooO00o = new ArrayList();

    public final void OooO0O0(String str, Object obj) {
        this.f112842OooO00o.add(new C31581o0000oOo(str, obj));
    }

    @Override // oO0o0O0O.InterfaceC33569OooO0oo
    public final Iterator<C31581o0000oOo> iterator() {
        return this.f112842OooO00o.iterator();
    }
}
