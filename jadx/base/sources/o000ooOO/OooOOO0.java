package o000ooOO;

import OooOOO0.AbstractC20449OooO0Oo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o0000OOo.C24217OooO0O0;
import o0000Ooo.C24239OooOOO0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32449OooOOoo;
import oO0o0ooO.C33924OooOOo;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO00.C33938OooO0o0;
import oO0oO00.C33967Oooo0o;
import oO0oO00.C33970Oooo0oo;
import oO0oO00.C33977OoooOOo;
import oO0oO00.C33979OoooOoO;
import oO0oO00.C33985OooooOo;
import oO0oO00.C33991o00000Oo;
import oO0oO00.C34000o00ooo;
import oO0oO00.o000OOo;
import oO0oO00.o00oO0O;
import oO0oO00.o0O0O00;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {
    public static final oOOoOoOO.OooO00o OooO(Type type, InterfaceC34595OooO0Oo kClass, InterfaceC34606OooOOOo interfaceC34606OooOOOo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kClass, "kClass");
        return new oOOoOoOO.OooO00o(type, kClass, interfaceC34606OooOOOo);
    }

    public static final int OooO00o(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC24749OooO0Oo, "<this>");
        int iOooO0O0 = OooO0O0(interfaceC24749OooO0Oo, str);
        if (iOooO0O0 >= 0) {
            return iOooO0O0;
        }
        int iOooO0O02 = OooO0O0(interfaceC24749OooO0Oo, "`" + str + '`');
        if (iOooO0O02 >= 0) {
            return iOooO0O02;
        }
        return -1;
    }

    public static final int OooO0O0(InterfaceC24749OooO0Oo interfaceC24749OooO0Oo, String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC24749OooO0Oo, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        if (interfaceC24749OooO0Oo instanceof OooOO0) {
            throw null;
        }
        int columnCount = interfaceC24749OooO0Oo.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (name.equals(interfaceC24749OooO0Oo.getColumnName(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int OooO0OO(ooOOOoO0.OooO0o oooO0o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0o, "<this>");
        return oooO0o.OooO00o().size();
    }

    public static final int OooO0Oo(InterfaceC24749OooO0Oo stmt, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stmt, "stmt");
        int iOooO00o = OooO00o(stmt, str);
        if (iOooO00o >= 0) {
            return iOooO00o;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(stmt.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + OooOo.o000oOoO(arrayList, null, null, null, null, 63) + ']');
    }

    public static final InterfaceC33911OooO0OO OooO0o(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo, ArrayList arrayList, oO0O000o.OooO00o oooO00o) {
        InterfaceC33911OooO0OO c33938OooO0o0;
        InterfaceC33911OooO0OO o000ooo2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        if (interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(Collection.class)) || interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(List.class)) || interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(List.class)) || interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(ArrayList.class))) {
            c33938OooO0o0 = new C33938OooO0o0((InterfaceC33911OooO0OO) arrayList.get(0));
        } else if (interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(HashSet.class))) {
            c33938OooO0o0 = new C33970Oooo0oo((InterfaceC33911OooO0OO) arrayList.get(0));
        } else if (interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(Set.class)) || interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(Set.class)) || interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(LinkedHashSet.class))) {
            c33938OooO0o0 = new C33979OoooOoO((InterfaceC33911OooO0OO) arrayList.get(0));
        } else if (interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(HashMap.class))) {
            c33938OooO0o0 = new C33967Oooo0o((InterfaceC33911OooO0OO) arrayList.get(0), (InterfaceC33911OooO0OO) arrayList.get(1));
        } else if (interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(Map.class)) || interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(Map.class)) || interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(LinkedHashMap.class))) {
            c33938OooO0o0 = new C33977OoooOOo((InterfaceC33911OooO0OO) arrayList.get(0), (InterfaceC33911OooO0OO) arrayList.get(1));
        } else {
            if (interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(Map.Entry.class))) {
                InterfaceC33911OooO0OO keySerializer = (InterfaceC33911OooO0OO) arrayList.get(0);
                InterfaceC33911OooO0OO valueSerializer = (InterfaceC33911OooO0OO) arrayList.get(1);
                kotlin.jvm.internal.OooOOO0.OooO0oO(keySerializer, "keySerializer");
                kotlin.jvm.internal.OooOOO0.OooO0oO(valueSerializer, "valueSerializer");
                o000ooo2 = new C33985OooooOo(keySerializer, valueSerializer);
            } else if (interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(C32443OooOOO.class))) {
                InterfaceC33911OooO0OO keySerializer2 = (InterfaceC33911OooO0OO) arrayList.get(0);
                InterfaceC33911OooO0OO valueSerializer2 = (InterfaceC33911OooO0OO) arrayList.get(1);
                kotlin.jvm.internal.OooOOO0.OooO0oO(keySerializer2, "keySerializer");
                kotlin.jvm.internal.OooOOO0.OooO0oO(valueSerializer2, "valueSerializer");
                o000ooo2 = new C34000o00ooo(keySerializer2, valueSerializer2);
            } else if (interfaceC34595OooO0Oo.equals(oooo0.OooO0O0(C32449OooOOoo.class))) {
                InterfaceC33911OooO0OO aSerializer = (InterfaceC33911OooO0OO) arrayList.get(0);
                InterfaceC33911OooO0OO bSerializer = (InterfaceC33911OooO0OO) arrayList.get(1);
                InterfaceC33911OooO0OO cSerializer = (InterfaceC33911OooO0OO) arrayList.get(2);
                kotlin.jvm.internal.OooOOO0.OooO0oO(aSerializer, "aSerializer");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bSerializer, "bSerializer");
                kotlin.jvm.internal.OooOOO0.OooO0oO(cSerializer, "cSerializer");
                c33938OooO0o0 = new C33991o00000Oo(aSerializer, bSerializer, cSerializer);
            } else if (C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo).isArray()) {
                Object objInvoke = oooO00o.invoke();
                kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                InterfaceC33911OooO0OO elementSerializer = (InterfaceC33911OooO0OO) arrayList.get(0);
                kotlin.jvm.internal.OooOOO0.OooO0oO(elementSerializer, "elementSerializer");
                o000ooo2 = new o000OOo((InterfaceC34595OooO0Oo) objInvoke, elementSerializer);
            } else {
                c33938OooO0o0 = null;
            }
            c33938OooO0o0 = o000ooo2;
        }
        if (c33938OooO0o0 != null) {
            return c33938OooO0o0;
        }
        InterfaceC33911OooO0OO[] interfaceC33911OooO0OOArr = (InterfaceC33911OooO0OO[]) arrayList.toArray(new InterfaceC33911OooO0OO[0]);
        return C24239OooOOO0.OooO0O0(interfaceC34595OooO0Oo, (InterfaceC33911OooO0OO[]) Arrays.copyOf(interfaceC33911OooO0OOArr, interfaceC33911OooO0OOArr.length));
    }

    public static final int OooO0o0(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final InterfaceC33911OooO0OO OooO0oO(InterfaceC34595OooO0Oo interfaceC34595OooO0Oo) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34595OooO0Oo, "<this>");
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0O0 = C24239OooOOO0.OooO0O0(interfaceC34595OooO0Oo, new InterfaceC33911OooO0OO[0]);
        return interfaceC33911OooO0OOOooO0O0 == null ? (InterfaceC33911OooO0OO) o0O0O00.f122274OooO00o.get(interfaceC34595OooO0Oo) : interfaceC33911OooO0OOOooO0O0;
    }

    public static final ArrayList OooO0oo(AbstractC20449OooO0Oo abstractC20449OooO0Oo, List typeArguments, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC20449OooO0Oo, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeArguments, "typeArguments");
        if (!z) {
            List<InterfaceC34606OooOOOo> list = typeArguments;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            for (InterfaceC34606OooOOOo type : list) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
                InterfaceC33911OooO0OO<Object> interfaceC33911OooO0OOOooO00o = C33924OooOOo.OooO00o(abstractC20449OooO0Oo, type, false);
                if (interfaceC33911OooO0OOOooO00o == null) {
                    return null;
                }
                arrayList.add(interfaceC33911OooO0OOOooO00o);
            }
            return arrayList;
        }
        List<InterfaceC34606OooOOOo> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (InterfaceC34606OooOOOo type2 : list2) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(type2, "type");
            InterfaceC33911OooO0OO<Object> interfaceC33911OooO0OOOooO00o2 = C33924OooOOo.OooO00o(abstractC20449OooO0Oo, type2, true);
            if (interfaceC33911OooO0OOOooO00o2 == null) {
                InterfaceC34595OooO0Oo<Object> interfaceC34595OooO0OoOooO0OO = o00oO0O.OooO0OO(type2);
                kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34595OooO0OoOooO0OO, "<this>");
                o00oO0O.OooO0Oo(interfaceC34595OooO0OoOooO0OO);
                throw null;
            }
            arrayList2.add(interfaceC33911OooO0OOOooO00o2);
        }
        return arrayList2;
    }
}
