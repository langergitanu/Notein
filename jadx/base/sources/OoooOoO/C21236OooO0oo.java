package OoooOoO;

import OooOOO0.AbstractC20449OooO0Oo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo0;
import oO0o0ooO.C33924OooOOo;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0o0ooo.C33928OooO00o;
import oO0oO00.C33979OoooOoO;
import oO0oO00.o00000OO;
import oO0oO00.o00oO0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOOO;
import oOo000Oo.OooOo;
import oOoo0.InterfaceC34595OooO0Oo;
import oOoo0.InterfaceC34606OooOOOo;

/* JADX INFO: renamed from: OoooOoO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21236OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61616OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f61617OooO0O0 = 0;

    public static final InterfaceC33911OooO0OO OooO00o(Collection collection, AbstractC20449OooO0Oo abstractC20449OooO0Oo) {
        Collection collection2 = collection;
        List listOooo0o0 = OooOo.Oooo0o0(collection2);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooo0o0, 10));
        Iterator it = listOooo0o0.iterator();
        while (it.hasNext()) {
            arrayList.add(OooO0OO(it.next(), abstractC20449OooO0Oo));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((InterfaceC33911OooO0OO) obj).getDescriptor().OooO0oo())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((InterfaceC33911OooO0OO) it2.next()).getDescriptor().OooO0oo());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        InterfaceC33911OooO0OO interfaceC33911OooO0OO = (InterfaceC33911OooO0OO) OooOo.o0OoOo0(arrayList2);
        if (interfaceC33911OooO0OO == null) {
            interfaceC33911OooO0OO = o00000OO.f122230OooO00o;
        }
        if (!interfaceC33911OooO0OO.getDescriptor().OooO0O0() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator it3 = collection2.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                    return C33928OooO00o.OooO0OO(interfaceC33911OooO0OO);
                }
            }
        }
        return interfaceC33911OooO0OO;
    }

    public static String OooO0O0(List list) {
        OooOOO0.OooO0oO(list, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ",");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        String string = sb.toString();
        OooOOO0.OooO0o(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    public static final InterfaceC33911OooO0OO OooO0OO(Object obj, AbstractC20449OooO0Oo module) throws IllegalAccessException, InvocationTargetException {
        OooOOO0.OooO0oO(module, "module");
        if (obj == null) {
            return C33928OooO00o.OooO0OO(o00000OO.f122230OooO00o);
        }
        if (obj instanceof List) {
            return C33928OooO00o.OooO00o(OooO00o((Collection) obj, module));
        }
        if (obj instanceof Object[]) {
            Object objOooOoo = OooOOO.OooOoo((Object[]) obj);
            return objOooOoo != null ? OooO0OO(objOooOoo, module) : C33928OooO00o.OooO00o(o00000OO.f122230OooO00o);
        }
        if (obj instanceof Set) {
            return new C33979OoooOoO(OooO00o((Collection) obj, module));
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return C33928OooO00o.OooO0O0(OooO00o(map.keySet(), module), OooO00o(map.values(), module));
        }
        Class<?> cls = obj.getClass();
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooOOOO = module.OooOOOO(oooo0.OooO0O0(cls), C34434OooOoO.f123453OooOo0o);
        if (interfaceC33911OooO0OOOooOOOO != null) {
            return interfaceC33911OooO0OOOooOOOO;
        }
        InterfaceC34595OooO0Oo interfaceC34595OooO0OoOooO0O0 = oooo0.OooO0O0(obj.getClass());
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0oO = o000ooOO.OooOOO0.OooO0oO(interfaceC34595OooO0OoOooO0O0);
        if (interfaceC33911OooO0OOOooO0oO != null) {
            return interfaceC33911OooO0OOOooO0oO;
        }
        o00oO0O.OooO0Oo(interfaceC34595OooO0OoOooO0O0);
        throw null;
    }

    public static final InterfaceC33911OooO0OO OooO0Oo(AbstractC20449OooO0Oo abstractC20449OooO0Oo, oOOoOoOO.OooO00o typeInfo) throws IllegalAccessException, InvocationTargetException {
        OooOOO0.OooO0oO(abstractC20449OooO0Oo, "<this>");
        OooOOO0.OooO0oO(typeInfo, "typeInfo");
        InterfaceC34606OooOOOo interfaceC34606OooOOOo = typeInfo.f123415OooO0OO;
        if (interfaceC34606OooOOOo != null) {
            InterfaceC33911OooO0OO<Object> interfaceC33911OooO0OOOooO00o = interfaceC34606OooOOOo.getArguments().isEmpty() ? null : C33924OooOOo.OooO00o(abstractC20449OooO0Oo, interfaceC34606OooOOOo, false);
            if (interfaceC33911OooO0OOOooO00o != null) {
                return interfaceC33911OooO0OOOooO00o;
            }
        }
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        InterfaceC34595OooO0Oo<?> interfaceC34595OooO0Oo = typeInfo.f123413OooO00o;
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooOOOO = abstractC20449OooO0Oo.OooOOOO(interfaceC34595OooO0Oo, c34434OooOoO);
        if (interfaceC33911OooO0OOOooOOOO != null) {
            return (interfaceC34606OooOOOo == null || !interfaceC34606OooOOOo.OooO0oO()) ? interfaceC33911OooO0OOOooOOOO : C33928OooO00o.OooO0OO(interfaceC33911OooO0OOOooOOOO);
        }
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooO0oO = o000ooOO.OooOOO0.OooO0oO(interfaceC34595OooO0Oo);
        if (interfaceC33911OooO0OOOooO0oO != null) {
            return (interfaceC34606OooOOOo == null || !interfaceC34606OooOOOo.OooO0oO()) ? interfaceC33911OooO0OOOooO0oO : C33928OooO00o.OooO0OO(interfaceC33911OooO0OOOooO0oO);
        }
        o00oO0O.OooO0Oo(interfaceC34595OooO0Oo);
        throw null;
    }
}
