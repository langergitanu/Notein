package oO0Ooo;

import java.util.ArrayDeque;
import java.util.Iterator;
import oO0Ooo.C33340OoooOOo;
import oO0OooO.InterfaceC33452OooO0O0;
import oO0o0000.InterfaceC33541OooO0oO;
import oO0o0000.InterfaceC33542OooO0oo;
import oO0o0O0.C33558OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33295OooO0OO {
    public static boolean OooO00o(C33340OoooOOo c33340OoooOOo, InterfaceC33542OooO0oo type, C33340OoooOOo.OooO0O0 supertypesPolicy) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        kotlin.jvm.internal.OooOOO0.OooO0oO(supertypesPolicy, "supertypesPolicy");
        InterfaceC33452OooO0O0 interfaceC33452OooO0O0 = c33340OoooOOo.f120602OooO0OO;
        if ((interfaceC33452OooO0O0.Oooo0oO(type) && !interfaceC33452OooO0O0.OooOOo(type)) || interfaceC33452OooO0O0.Ooooo0o(type)) {
            return true;
        }
        c33340OoooOOo.OooO0O0();
        ArrayDeque<InterfaceC33542OooO0oo> arrayDeque = c33340OoooOOo.f120606OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(arrayDeque);
        C33558OooO0Oo c33558OooO0Oo = c33340OoooOOo.f120607OooO0oo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c33558OooO0Oo);
        arrayDeque.push(type);
        while (!arrayDeque.isEmpty()) {
            if (c33558OooO0Oo.f121177OooOo > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + oOo000Oo.OooOo.o000oOoO(c33558OooO0Oo, null, null, null, null, 63)).toString());
            }
            InterfaceC33542OooO0oo current = arrayDeque.pop();
            kotlin.jvm.internal.OooOOO0.OooO0o(current, "current");
            if (c33558OooO0Oo.add(current)) {
                C33340OoooOOo.OooO0O0 oooO0O0 = interfaceC33452OooO0O0.OooOOo(current) ? C33340OoooOOo.OooO0O0.OooO0OO.f120610OooO00o : supertypesPolicy;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0O0, C33340OoooOOo.OooO0O0.OooO0OO.f120610OooO00o)) {
                    oooO0O0 = null;
                }
                if (oooO0O0 == null) {
                    continue;
                } else {
                    Iterator<InterfaceC33541OooO0oO> it = interfaceC33452OooO0O0.OooO0o(interfaceC33452OooO0O0.OooOo00(current)).iterator();
                    while (it.hasNext()) {
                        InterfaceC33542OooO0oo interfaceC33542OooO0ooOooO00o = oooO0O0.OooO00o(c33340OoooOOo, it.next());
                        if ((interfaceC33452OooO0O0.Oooo0oO(interfaceC33542OooO0ooOooO00o) && !interfaceC33452OooO0O0.OooOOo(interfaceC33542OooO0ooOooO00o)) || interfaceC33452OooO0O0.Ooooo0o(interfaceC33542OooO0ooOooO00o)) {
                            c33340OoooOOo.OooO00o();
                            return true;
                        }
                        arrayDeque.add(interfaceC33542OooO0ooOooO00o);
                    }
                }
            }
        }
        c33340OoooOOo.OooO00o();
        return false;
    }

    public static boolean OooO0O0(C33340OoooOOo c33340OoooOOo, InterfaceC33542OooO0oo interfaceC33542OooO0oo, oO0o0000.OooOO0O oooOO0O) {
        InterfaceC33452OooO0O0 interfaceC33452OooO0O0 = c33340OoooOOo.f120602OooO0OO;
        if (interfaceC33452OooO0O0.Oooo0OO(interfaceC33542OooO0oo)) {
            return true;
        }
        if (interfaceC33452OooO0O0.OooOOo(interfaceC33542OooO0oo)) {
            return false;
        }
        if (c33340OoooOOo.f120601OooO0O0 && interfaceC33452OooO0O0.OooooO0(interfaceC33542OooO0oo)) {
            return true;
        }
        return interfaceC33452OooO0O0.OooO0Oo(interfaceC33452OooO0O0.OooOo00(interfaceC33542OooO0oo), oooOO0O);
    }
}
