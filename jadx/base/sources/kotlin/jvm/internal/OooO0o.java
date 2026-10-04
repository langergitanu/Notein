package kotlin.jvm.internal;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o0000OOo.C24217OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.InterfaceC32437OooO0o0;
import oO0O000o.InterfaceC32503OooO0Oo;
import oO0O000o.InterfaceC32504OooO0o0;
import oO0O000o.InterfaceC32505OooO0oO;
import oO0O000o.InterfaceC32506OooO0oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32509OooOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0O000o.InterfaceC32511OooOOoo;
import oO0O000o.InterfaceC32512OooOo0;
import oO0O000o.InterfaceC32513OooOo0O;
import oO0O000o.InterfaceC32514OooOo0o;
import oO0o0O0o.C33599OooOo0O;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34444Oooo0O0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements InterfaceC34595OooO0Oo<Object>, InterfaceC24016OooO0o0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final Map<Class<? extends InterfaceC32437OooO0o0<?>>, Integer> f80932OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final LinkedHashMap f80933OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final HashMap<String, String> f80934OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Class<?> f80935OooOo0o;

    static {
        List listOooOO0o = C34429OooOOo0.OooOO0o(oO0O000o.OooO00o.class, InterfaceC32507OooOO0o.class, InterfaceC32508OooOOOo.class, InterfaceC32510OooOOo0.class, InterfaceC32509OooOOo.class, InterfaceC32511OooOOoo.class, oO0O000o.OooOo00.class, InterfaceC32512OooOo0.class, InterfaceC32513OooOo0O.class, InterfaceC32514OooOo0o.class, oO0O000o.OooO0O0.class, oO0O000o.OooO0OO.class, InterfaceC32503OooO0Oo.class, InterfaceC32504OooO0o0.class, oO0O000o.OooO0o.class, InterfaceC32505OooO0oO.class, InterfaceC32506OooO0oo.class, oO0O000o.OooO.class, oO0O000o.OooOO0.class, oO0O000o.OooOO0O.class, oO0O000o.OooOOO0.class, oO0O000o.OooOOO.class, oO0O000o.OooOOOO.class);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooOO0o, 10));
        int i = 0;
        for (Object obj : listOooOO0o) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            arrayList.add(new C32443OooOOO((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f80932OooOo = C34444Oooo0O0.OooOO0o(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        OooOOO0.OooO0o(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            OooOOO0.OooO0Oo(str);
            sb.append(C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends InterfaceC32437OooO0o0<?>>, Integer> entry : f80932OooOo.entrySet()) {
            Class<? extends InterfaceC32437OooO0o0<?>> key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            map3.put(key.getName(), "kotlin.Function" + iIntValue);
        }
        f80934OooOoO0 = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(oOo000Oo.Oooo0.OooO0Oo(map3.size()));
        Iterator<T> it = map3.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key2 = entry2.getKey();
            String str2 = (String) entry2.getValue();
            OooOOO0.OooO0Oo(str2);
            linkedHashMap.put(key2, C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, str2, str2));
        }
        f80933OooOoO = linkedHashMap;
    }

    public OooO0o(Class<?> jClass) {
        OooOOO0.OooO0oO(jClass, "jClass");
        this.f80935OooOo0o = jClass;
    }

    @Override // kotlin.jvm.internal.InterfaceC24016OooO0o0
    public final Class<?> OooO() {
        return this.f80935OooOo0o;
    }

    @Override // oOoo0.InterfaceC34595OooO0Oo
    public final String OooO0Oo() {
        String str;
        Class<?> jClass = this.f80935OooOo0o;
        OooOOO0.OooO0oO(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean zIsArray = jClass.isArray();
        HashMap<String, String> map = f80934OooOoO0;
        if (!zIsArray) {
            String str2 = map.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // oOoo0.InterfaceC34595OooO0Oo
    public final boolean OooO0oo(Object obj) {
        Class<?> jClass = this.f80935OooOo0o;
        OooOOO0.OooO0oO(jClass, "jClass");
        Map<Class<? extends InterfaceC32437OooO0o0<?>>, Integer> map = f80932OooOo;
        OooOOO0.OooO0o0(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(jClass);
        if (num != null) {
            return C24039Oooo0o0.OooO0o(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = C24217OooO0O0.OooO0o0(C24217OooO0O0.OooO0oO(jClass));
        }
        return jClass.isInstance(obj);
    }

    @Override // oOoo0.InterfaceC34595OooO0Oo
    public final String OooOO0() {
        String str;
        Class<?> jClass = this.f80935OooOo0o;
        OooOOO0.OooO0oO(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f80933OooOoO;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return C33599OooOo0O.OoooOoO(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return C33599OooOo0O.OoooOo0('$', simpleName, simpleName);
        }
        return C33599OooOo0O.OoooOoO(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OooO0o) && C24217OooO0O0.OooO0o0(this).equals(C24217OooO0O0.OooO0o0((InterfaceC34595OooO0Oo) obj));
    }

    @Override // oOoo0.InterfaceC34595OooO0Oo
    public final int hashCode() {
        return C24217OooO0O0.OooO0o0(this).hashCode();
    }

    public final String toString() {
        return this.f80935OooOo0o + " (Kotlin reflection is not available)";
    }
}
