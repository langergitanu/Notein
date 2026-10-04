package oO0Oo00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0o0O0.C33552OooO00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oO0Oo00.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33193OooO00o implements C33552OooO00o.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33193OooO00o f120129OooO00o = new C33193OooO00o();

    @Override // oO0o0O0.C33552OooO00o.OooO0OO
    public final Iterable OooO0O0(Object obj) {
        int i = C33194OooO0O0.f120130OooO00o;
        Collection<? extends oO0O0OO.OooO00o> collectionOooOO0o = ((InterfaceC32641OooooOO) obj).OooOO0o();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(collectionOooOO0o, 10));
        Iterator<T> it = collectionOooOO0o.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC32641OooooOO) it.next()).o000OOo());
        }
        return arrayList;
    }
}
