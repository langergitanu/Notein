package oO0O0ooo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24035Oooo00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0ooo.AbstractC32840OooO00o;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0Ooo.Oooo0;
import oO0OooO.InterfaceC33452OooO0O0;
import oO0o0000.InterfaceC33540OooO0o0;
import oO0o0000.InterfaceC33541OooO0oO;
import oO0o0000.InterfaceC33543OooOO0o;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oO0O0ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32843OooO0Oo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<AbstractC32840OooO00o.C20258OooO00o, Iterable<? extends AbstractC32840OooO00o.C20258OooO00o>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32840OooO00o<Object> f117896OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32843OooO0Oo(AbstractC32840OooO00o abstractC32840OooO00o) {
        super(1);
        this.f117896OooOo0o = abstractC32840OooO00o;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // oO0O000o.InterfaceC32507OooOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Iterable<? extends AbstractC32840OooO00o.C20258OooO00o> invoke(AbstractC32840OooO00o.C20258OooO00o c20258OooO00o) {
        AbstractC32840OooO00o.C20258OooO00o c20258OooO00o2;
        AbstractC33316OooOo0o abstractC33316OooOo0oOooO0oO;
        InterfaceC33540OooO0o0 interfaceC33540OooO0o0OooO0oO;
        AbstractC32840OooO00o.C20258OooO00o it = c20258OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        AbstractC32840OooO00o<Object> abstractC32840OooO00o = this.f117896OooOo0o;
        boolean z = ((C32876OooOo0O) abstractC32840OooO00o).f117971OooO0o0;
        InterfaceC33541OooO0oO interfaceC33541OooO0oO = it.f117889OooO00o;
        if (z) {
            if (((interfaceC33541OooO0oO == null || (interfaceC33540OooO0o0OooO0oO = InterfaceC33452OooO0O0.OooO00o.OooO0oO(interfaceC33541OooO0oO)) == null || !(interfaceC33540OooO0o0OooO0oO instanceof Oooo0)) ? null : (Oooo0) interfaceC33540OooO0o0OooO0oO) == null) {
            }
        } else if (interfaceC33541OooO0oO != null) {
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.OooO0oo(interfaceC33541OooO0oO);
            if (abstractC33328Oooo0O0OooO0oo == null && ((abstractC33316OooOo0oOooO0oO = InterfaceC33452OooO0O0.OooO00o.OooO0oO(interfaceC33541OooO0oO)) == null || (abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.Oooo0o(abstractC33316OooOo0oOooO0oO)) == null)) {
                abstractC33328Oooo0O0OooO0oo = InterfaceC33452OooO0O0.OooO00o.OooO0oo(interfaceC33541OooO0oO);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC33328Oooo0O0OooO0oo);
            }
            InterfaceC33342OoooOo0 interfaceC33342OoooOo0O000oOoO = InterfaceC33452OooO0O0.OooO00o.o000oOoO(abstractC33328Oooo0O0OooO0oo);
            if (interfaceC33342OoooOo0O000oOoO != null) {
                List<InterfaceC32637OoooOoo> parameters = interfaceC33342OoooOo0O000oOoO.getParameters();
                kotlin.jvm.internal.OooOOO0.OooO0o(parameters, "this.parameters");
                List<InterfaceC32637OoooOoo> list = parameters;
                if (!(interfaceC33541OooO0oO instanceof AbstractC33320OooOoo)) {
                    StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb.append(interfaceC33541OooO0oO);
                    sb.append(", ");
                    throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0Oo(C24035Oooo00o.f80943OooO00o, interfaceC33541OooO0oO.getClass(), sb).toString());
                }
                List<InterfaceC33348OooooOO> listO000000O = ((AbstractC33320OooOoo) interfaceC33541OooO0oO).o000000O();
                Iterator<T> it2 = list.iterator();
                Iterator<T> it3 = listO000000O.iterator();
                ArrayList arrayList = new ArrayList(Math.min(C34428OooOOo.OooOOoo(list, 10), C34428OooOOo.OooOOoo(listO000000O, 10)));
                while (it2.hasNext() && it3.hasNext()) {
                    Object next = it2.next();
                    oO0o0000.OooOO0 oooOO02 = (oO0o0000.OooOO0) it3.next();
                    InterfaceC33543OooOO0o interfaceC33543OooOO0o = (InterfaceC33543OooOO0o) next;
                    boolean zOooo0O0 = InterfaceC33452OooO0O0.OooO00o.Oooo0O0(oooOO02);
                    ooOOO0Oo.OooOo oooOo = it.f117890OooO0O0;
                    if (zOooo0O0) {
                        c20258OooO00o2 = new AbstractC32840OooO00o.C20258OooO00o(null, oooOo, interfaceC33543OooOO0o);
                    } else {
                        AbstractC33354o00o0O abstractC33354o00o0OOooOOOO = InterfaceC33452OooO0O0.OooO00o.OooOOOO(oooOO02);
                        abstractC32840OooO00o.getClass();
                        c20258OooO00o2 = new AbstractC32840OooO00o.C20258OooO00o(abstractC33354o00o0OOooOOOO, ((C32876OooOo0O) abstractC32840OooO00o).OooO0o0().OooO0O0(oooOo, abstractC33354o00o0OOooOOOO.getAnnotations()), interfaceC33543OooOO0o);
                    }
                    arrayList.add(c20258OooO00o2);
                }
                return arrayList;
            }
        }
        return null;
    }
}
