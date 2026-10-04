package oO0O0oO0;

import Oooo0oO.C21111o0ooOoO;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
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
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oO0o0O0o.C33595OooOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34444Oooo0O0;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0O0oO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32730OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final List<InterfaceC34595OooO0Oo<? extends Object>> f117669OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f117670OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Map<Class<? extends Object>, Class<? extends Object>> f117671OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Map<Class<? extends InterfaceC32437OooO0o0<?>>, Integer> f117672OooO0Oo;

    /* JADX INFO: renamed from: oO0O0oO0.OooO0Oo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<ParameterizedType, ParameterizedType> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f117673OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final ParameterizedType invoke(ParameterizedType parameterizedType) {
            ParameterizedType it = parameterizedType;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            Type ownerType = it.getOwnerType();
            if (ownerType instanceof ParameterizedType) {
                return (ParameterizedType) ownerType;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: oO0O0oO0.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<ParameterizedType, InterfaceC33569OooO0oo<? extends Type>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f117674OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final InterfaceC33569OooO0oo<? extends Type> invoke(ParameterizedType parameterizedType) {
            ParameterizedType it = parameterizedType;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            Type[] actualTypeArguments = it.getActualTypeArguments();
            kotlin.jvm.internal.OooOOO0.OooO0o(actualTypeArguments, "it.actualTypeArguments");
            return oOo000Oo.OooOOO.OooOo(actualTypeArguments);
        }
    }

    static {
        int i = 0;
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        List<InterfaceC34595OooO0Oo<? extends Object>> listOooOO0o = C34429OooOOo0.OooOO0o(oooo0.OooO0O0(Boolean.TYPE), oooo0.OooO0O0(Byte.TYPE), oooo0.OooO0O0(Character.TYPE), oooo0.OooO0O0(Double.TYPE), oooo0.OooO0O0(Float.TYPE), oooo0.OooO0O0(Integer.TYPE), oooo0.OooO0O0(Long.TYPE), oooo0.OooO0O0(Short.TYPE));
        f117669OooO00o = listOooOO0o;
        List<InterfaceC34595OooO0Oo<? extends Object>> list = listOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC34595OooO0Oo interfaceC34595OooO0Oo = (InterfaceC34595OooO0Oo) it.next();
            arrayList.add(new C32443OooOOO(C24217OooO0O0.OooO0o0(interfaceC34595OooO0Oo), C24217OooO0O0.OooO0o(interfaceC34595OooO0Oo)));
        }
        f117670OooO0O0 = C34444Oooo0O0.OooOO0o(arrayList);
        List<InterfaceC34595OooO0Oo<? extends Object>> list2 = f117669OooO00o;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            InterfaceC34595OooO0Oo interfaceC34595OooO0Oo2 = (InterfaceC34595OooO0Oo) it2.next();
            arrayList2.add(new C32443OooOOO(C24217OooO0O0.OooO0o(interfaceC34595OooO0Oo2), C24217OooO0O0.OooO0o0(interfaceC34595OooO0Oo2)));
        }
        f117671OooO0OO = C34444Oooo0O0.OooOO0o(arrayList2);
        List listOooOO0o2 = C34429OooOOo0.OooOO0o(oO0O000o.OooO00o.class, InterfaceC32507OooOO0o.class, InterfaceC32508OooOOOo.class, InterfaceC32510OooOOo0.class, InterfaceC32509OooOOo.class, InterfaceC32511OooOOoo.class, oO0O000o.OooOo00.class, InterfaceC32512OooOo0.class, InterfaceC32513OooOo0O.class, InterfaceC32514OooOo0o.class, oO0O000o.OooO0O0.class, oO0O000o.OooO0OO.class, InterfaceC32503OooO0Oo.class, InterfaceC32504OooO0o0.class, oO0O000o.OooO0o.class, InterfaceC32505OooO0oO.class, InterfaceC32506OooO0oo.class, oO0O000o.OooO.class, oO0O000o.OooOO0.class, oO0O000o.OooOO0O.class, oO0O000o.OooOOO0.class, oO0O000o.OooOOO.class, oO0O000o.OooOOOO.class);
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(listOooOO0o2, 10));
        for (Object obj : listOooOO0o2) {
            int i2 = i + 1;
            if (i < 0) {
                C34429OooOOo0.OooOOo();
                throw null;
            }
            arrayList3.add(new C32443OooOOO((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f117672OooO0Oo = C34444Oooo0O0.OooOO0o(arrayList3);
    }

    public static final C33476OooO0O0 OooO00o(Class<?> cls) {
        C33476OooO0O0 c33476OooO0O0OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO0O0(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(C21111o0ooOoO.OooO0O0(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return (declaringClass == null || (c33476OooO0O0OooO00o = OooO00o(declaringClass)) == null) ? C33476OooO0O0.OooOO0(new C33477OooO0OO(cls.getName())) : c33476OooO0O0OooO00o.OooO0Oo(C33479OooO0o.OooO0o0(cls.getSimpleName()));
        }
        C33477OooO0OO c33477OooO0OO = new C33477OooO0OO(cls.getName());
        return new C33476OooO0O0(c33477OooO0OO.OooO0o0(), C33477OooO0OO.OooOO0(c33477OooO0OO.OooO0o()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String OooO0O0(Class<?> cls) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return C33595OooOOo.OooOo0(cls.getName(), FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX);
            }
            return "L" + C33595OooOOo.OooOo0(cls.getName(), FilenameUtils.EXTENSION_SEPARATOR, IOUtils.DIR_SEPARATOR_UNIX) + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(C21111o0ooOoO.OooO0O0(cls, "Unsupported primitive type: "));
    }

    public static final List<Type> OooO0OO(Type type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C34434OooOoO.f123453OooOo0o;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOOo(C33574OooOOO0.OooO(type, OooO00o.f117673OooOo0o), OooO0O0.f117674OooOo0o));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.OooOOO0.OooO0o(actualTypeArguments, "actualTypeArguments");
        return oOo000Oo.OooOOO.OoooOO0(actualTypeArguments);
    }

    public static final ClassLoader OooO0Oo(Class<?> cls) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.OooOOO0.OooO0o(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }
}
