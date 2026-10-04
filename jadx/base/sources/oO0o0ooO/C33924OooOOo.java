package oO0o0ooO;

import OooOOO0.AbstractC20449OooO0Oo;
import java.util.ArrayList;
import java.util.List;
import o0000Ooo.C24239OooOOO0;
import oO00ooO.C32445OooOOOO;
import oO0O0O0.C32567Oooo;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.InterfaceC33990o000000o;
import oO0oO00.o00oO0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOoo0.C34607OooOOo;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: oO0o0ooO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33924OooOOo {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC33911OooO0OO<Object> OooO00o(AbstractC20449OooO0Oo abstractC20449OooO0Oo, InterfaceC34606OooOOOo interfaceC34606OooOOOo, boolean z) {
        InterfaceC33911OooO0OO<? extends Object> interfaceC33911OooO0OOOooO00o;
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooOOOO;
        InterfaceC33911OooO0OO c33913OooO0o;
        InterfaceC34595OooO0Oo clazz = o00oO0O.OooO0OO(interfaceC34606OooOOOo);
        boolean zOooO0oO = interfaceC34606OooOOOo.OooO0oO();
        List<C34607OooOOo> arguments = interfaceC34606OooOOOo.getArguments();
        final ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(arguments, 10));
        for (C34607OooOOo c34607OooOOo : arguments) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(c34607OooOOo, "<this>");
            C32567Oooo c32567Oooo = c34607OooOOo.f123976OooO0O0;
            if (c32567Oooo == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + c32567Oooo).toString());
            }
            arrayList.add(c32567Oooo);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List list = C34434OooOoO.f123453OooOo0o;
        if (zIsEmpty) {
            if (!C24239OooOOO0.OooO0oo(clazz) || abstractC20449OooO0Oo.OooOOOO(clazz, list) == null) {
                InterfaceC33990o000000o<? extends Object> interfaceC33990o000000o = C33923OooOOOo.f122128OooO00o;
                if (zOooO0oO) {
                    interfaceC33911OooO0OOOooO00o = C33923OooOOOo.f122129OooO0O0.OooO00o(clazz);
                } else {
                    interfaceC33911OooO0OOOooO00o = C33923OooOOOo.f122128OooO00o.OooO00o(clazz);
                    if (interfaceC33911OooO0OOOooO00o == null) {
                        interfaceC33911OooO0OOOooO00o = null;
                    }
                }
            }
        } else if (!abstractC20449OooO0Oo.OooOOo0()) {
            InterfaceC33990o000000o<? extends Object> interfaceC33990o000000o2 = C33923OooOOOo.f122128OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(clazz, "clazz");
            Object objOooO00o = !zOooO0oO ? C33923OooOOOo.f122130OooO0OO.OooO00o(clazz, arrayList) : C33923OooOOOo.f122131OooO0Oo.OooO00o(clazz, arrayList);
            if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                objOooO00o = null;
            }
            interfaceC33911OooO0OOOooO00o = (InterfaceC33911OooO0OO) objOooO00o;
        }
        if (interfaceC33911OooO0OOOooO00o != null) {
            return interfaceC33911OooO0OOOooO00o;
        }
        if (arrayList.isEmpty()) {
            interfaceC33911OooO0OOOooOOOO = o000ooOO.OooOOO0.OooO0oO(clazz);
            if (interfaceC33911OooO0OOOooOOOO == null && (interfaceC33911OooO0OOOooOOOO = abstractC20449OooO0Oo.OooOOOO(clazz, list)) == null) {
                if (C24239OooOOO0.OooO0oo(clazz)) {
                    c33913OooO0o = new C33913OooO0o(clazz);
                    interfaceC33911OooO0OOOooOOOO = c33913OooO0o;
                }
                interfaceC33911OooO0OOOooOOOO = null;
            }
            if (interfaceC33911OooO0OOOooOOOO != null) {
                return zOooO0oO ? C33928OooO00o.OooO0OO(interfaceC33911OooO0OOOooOOOO) : interfaceC33911OooO0OOOooOOOO;
            }
        } else {
            ArrayList arrayListOooO0oo = o000ooOO.OooOOO0.OooO0oo(abstractC20449OooO0Oo, arrayList, z);
            if (arrayListOooO0oo != null) {
                InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0o = o000ooOO.OooOOO0.OooO0o(clazz, arrayListOooO0oo, new oO0O000o.OooO00o() { // from class: oO0o0ooO.OooOOo0
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        return ((InterfaceC34606OooOOOo) arrayList.get(0)).OooO0O0();
                    }
                });
                if (interfaceC33911OooO0OOOooO0o == null) {
                    interfaceC33911OooO0OOOooOOOO = abstractC20449OooO0Oo.OooOOOO(clazz, arrayListOooO0oo);
                    if (interfaceC33911OooO0OOOooOOOO == null) {
                        if (C24239OooOOO0.OooO0oo(clazz)) {
                            c33913OooO0o = new C33913OooO0o(clazz);
                            interfaceC33911OooO0OOOooOOOO = c33913OooO0o;
                        }
                        interfaceC33911OooO0OOOooOOOO = null;
                    }
                } else {
                    interfaceC33911OooO0OOOooOOOO = interfaceC33911OooO0OOOooO0o;
                }
                if (interfaceC33911OooO0OOOooOOOO != null) {
                }
            }
        }
        return null;
    }
}
