package oO0O0O;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0oo0.C32784OooO0o0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0o0O0.C33552OooO00o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO0 implements C33552OooO00o.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f116870OooO00o;

    public OooOOO0(OooOOO oooOOO) {
        this.f116870OooO00o = oooOOO;
    }

    @Override // oO0o0O0.C33552OooO00o.OooO0OO
    public final Iterable OooO0O0(Object obj) {
        OooOOO this$0 = this.f116870OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
        Collection<AbstractC33320OooOoo> collectionOooO0Oo = ((InterfaceC32596OooO0o0) obj).OooO().OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0o(collectionOooO0Oo, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionOooO0Oo.iterator();
        while (it.hasNext()) {
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = ((AbstractC33320OooOoo) it.next()).o00000().OooO0OO();
            InterfaceC32598OooO0oo interfaceC32598OooO0ooO000OOo = interfaceC32598OooO0ooOooO0OO != null ? interfaceC32598OooO0ooOooO0OO.o000OOo() : null;
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = interfaceC32598OooO0ooO000OOo instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooO000OOo : null;
            C32784OooO0o0 c32784OooO0o0OooO0o = interfaceC32596OooO0o0 != null ? this$0.OooO0o(interfaceC32596OooO0o0) : null;
            if (c32784OooO0o0OooO0o != null) {
                arrayList.add(c32784OooO0o0OooO0o);
            }
        }
        return arrayList;
    }
}
