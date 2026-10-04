package oO0Ooo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oO0O0OO.InterfaceC32636OoooOoO;
import oO0O0OO.InterfaceC32637OoooOoo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: oO0Ooo.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33334OoooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33334OoooO f120593OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32636OoooOoO f120594OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<InterfaceC33348OooooOO> f120595OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<InterfaceC32637OoooOoo, InterfaceC33348OooooOO> f120596OooO0Oo;

    /* JADX INFO: renamed from: oO0Ooo.OoooO$OooO00o */
    public static final class OooO00o {
        public static C33334OoooO OooO00o(C33334OoooO c33334OoooO, InterfaceC32636OoooOoO typeAliasDescriptor, List arguments) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(typeAliasDescriptor, "typeAliasDescriptor");
            kotlin.jvm.internal.OooOOO0.OooO0oO(arguments, "arguments");
            List<InterfaceC32637OoooOoo> parameters = typeAliasDescriptor.OooO().getParameters();
            kotlin.jvm.internal.OooOOO0.OooO0o(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            List<InterfaceC32637OoooOoo> list = parameters;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC32637OoooOoo) it.next()).o000OOo());
            }
            return new C33334OoooO(c33334OoooO, typeAliasDescriptor, arguments, C34444Oooo0O0.OooOO0o(oOo000Oo.OooOo.o000OOo(arrayList, arguments)));
        }
    }

    public C33334OoooO(C33334OoooO c33334OoooO, InterfaceC32636OoooOoO interfaceC32636OoooOoO, List list, Map map) {
        this.f120593OooO00o = c33334OoooO;
        this.f120594OooO0O0 = interfaceC32636OoooOoO;
        this.f120595OooO0OO = list;
        this.f120596OooO0Oo = map;
    }

    public final boolean OooO00o(InterfaceC32636OoooOoO descriptor) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f120594OooO0O0, descriptor)) {
            return true;
        }
        C33334OoooO c33334OoooO = this.f120593OooO00o;
        return c33334OoooO != null ? c33334OoooO.OooO00o(descriptor) : false;
    }
}
