package oO0Ooo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0O0OO.InterfaceC32637OoooOoo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: oO0Ooo.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33344OoooOoo extends AbstractC33350Oooooo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f120613OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: oO0Ooo.OoooOoo$OooO00o */
    public static final class OooO00o {
        public final AbstractC33350Oooooo OooO00o(InterfaceC33342OoooOo0 typeConstructor, List<? extends InterfaceC33348OooooOO> arguments) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(typeConstructor, "typeConstructor");
            kotlin.jvm.internal.OooOOO0.OooO0oO(arguments, "arguments");
            List<InterfaceC32637OoooOoo> parameters = typeConstructor.getParameters();
            kotlin.jvm.internal.OooOOO0.OooO0o(parameters, "typeConstructor.parameters");
            InterfaceC32637OoooOoo interfaceC32637OoooOoo = (InterfaceC32637OoooOoo) oOo000Oo.OooOo.OoooOo0(parameters);
            if (interfaceC32637OoooOoo == null || !interfaceC32637OoooOoo.OooOoo()) {
                return new C33317OooOoO((InterfaceC32637OoooOoo[]) parameters.toArray(new InterfaceC32637OoooOoo[0]), (InterfaceC33348OooooOO[]) arguments.toArray(new InterfaceC33348OooooOO[0]), false);
            }
            List<InterfaceC32637OoooOoo> parameters2 = typeConstructor.getParameters();
            kotlin.jvm.internal.OooOOO0.OooO0o(parameters2, "typeConstructor.parameters");
            List<InterfaceC32637OoooOoo> list = parameters2;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC32637OoooOoo) it.next()).OooO());
            }
            return new C33343OoooOoO(C34444Oooo0O0.OooOO0o(oOo000Oo.OooOo.o000OOo(arrayList, arguments)));
        }
    }

    @Override // oO0Ooo.AbstractC33350Oooooo
    public final InterfaceC33348OooooOO OooO0Oo(AbstractC33320OooOoo abstractC33320OooOoo) {
        return OooO0oO(abstractC33320OooOoo.o00000());
    }

    public abstract InterfaceC33348OooooOO OooO0oO(InterfaceC33342OoooOo0 interfaceC33342OoooOo0);
}
