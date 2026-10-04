package oO0O0Oo0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0O0OO.InterfaceC32621Oooo00o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oO0O0Oo0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32689Oooo0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32674OooOOo0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32692Oooo0o0 f117515OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32689Oooo0O0(C32692Oooo0o0 c32692Oooo0o0) {
        super(0);
        this.f117515OooOo0o = c32692Oooo0o0;
    }

    @Override // oO0O000o.OooO00o
    public final C32674OooOOo0 invoke() {
        C32692Oooo0o0 c32692Oooo0o0 = this.f117515OooOo0o;
        Oooo0 oooo0 = c32692Oooo0o0.f117527OooOoo;
        if (oooo0 == null) {
            StringBuilder sb = new StringBuilder("Dependencies of module ");
            String str = c32692Oooo0o0.getName().f120981OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o(str, "name.toString()");
            sb.append(str);
            sb.append(" were not set before querying module content");
            throw new AssertionError(sb.toString());
        }
        List<C32692Oooo0o0> list = oooo0.f117502OooO00o;
        c32692Oooo0o0.o000OOo();
        list.contains(c32692Oooo0o0);
        List<C32692Oooo0o0> list2 = list;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ((C32692Oooo0o0) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            InterfaceC32621Oooo00o interfaceC32621Oooo00o = ((C32692Oooo0o0) it2.next()).f117529OooOooO;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC32621Oooo00o);
            arrayList.add(interfaceC32621Oooo00o);
        }
        return new C32674OooOOo0(arrayList, "CompositeProvider@ModuleDescriptor for " + c32692Oooo0o0.getName());
    }
}
