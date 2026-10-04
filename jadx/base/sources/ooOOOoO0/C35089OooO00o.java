package ooOOOoO0;

import com.aspose.words.ControlChar;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o0000OOo.C24217OooO0O0;
import oO0O0oO0.C32730OooO0Oo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;
import oOoo0.InterfaceC34595OooO0Oo;
import ooOOOoO0.OooO0o;

/* JADX INFO: renamed from: ooOOOoO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35089OooO00o implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f126042OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayList f126043OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final EnumC20377OooO00o f126044OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Method> f126045OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f126046OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList f126047OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList f126048OooO0oO;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ooOOOoO0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class EnumC20377OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC20377OooO00o f126049OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC20377OooO00o f126050OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ EnumC20377OooO00o[] f126051OooOoO0;

        static {
            EnumC20377OooO00o enumC20377OooO00o = new EnumC20377OooO00o("CALL_BY_NAME", 0);
            f126050OooOo0o = enumC20377OooO00o;
            EnumC20377OooO00o enumC20377OooO00o2 = new EnumC20377OooO00o("POSITIONAL_CALL", 1);
            f126049OooOo = enumC20377OooO00o2;
            f126051OooOoO0 = new EnumC20377OooO00o[]{enumC20377OooO00o, enumC20377OooO00o2};
        }

        public EnumC20377OooO00o() {
            throw null;
        }

        public static EnumC20377OooO00o valueOf(String str) {
            return (EnumC20377OooO00o) Enum.valueOf(EnumC20377OooO00o.class, str);
        }

        public static EnumC20377OooO00o[] values() {
            return (EnumC20377OooO00o[]) f126051OooOoO0.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ooOOOoO0.OooO00o$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO0O0 f126052OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f126053OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO0O0[] f126054OooOoO0;

        static {
            OooO0O0 oooO0O0 = new OooO0O0("JAVA", 0);
            f126053OooOo0o = oooO0O0;
            OooO0O0 oooO0O02 = new OooO0O0("KOTLIN", 1);
            f126052OooOo = oooO0O02;
            f126054OooOoO0 = new OooO0O0[]{oooO0O0, oooO0O02};
        }

        public OooO0O0() {
            throw null;
        }

        public static OooO0O0 valueOf(String str) {
            return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
        }

        public static OooO0O0[] values() {
            return (OooO0O0[]) f126054OooOoO0.clone();
        }
    }

    public C35089OooO00o(Class jClass, ArrayList arrayList, EnumC20377OooO00o enumC20377OooO00o, OooO0O0 oooO0O0, List methods) {
        OooOOO0.OooO0oO(jClass, "jClass");
        OooOOO0.OooO0oO(methods, "methods");
        this.f126042OooO00o = jClass;
        this.f126043OooO0O0 = arrayList;
        this.f126044OooO0OO = enumC20377OooO00o;
        this.f126045OooO0Oo = methods;
        List list = methods;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f126047OooO0o0 = arrayList2;
        List<Method> list2 = this.f126045OooO0Oo;
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> it3 = ((Method) it2.next()).getReturnType();
            OooOOO0.OooO0o(it3, "it");
            List<InterfaceC34595OooO0Oo<? extends Object>> list3 = C32730OooO0Oo.f117669OooO00o;
            Class<? extends Object> cls = C32730OooO0Oo.f117671OooO0OO.get(it3);
            if (cls != null) {
                it3 = cls;
            }
            arrayList3.add(it3);
        }
        this.f126046OooO0o = arrayList3;
        List<Method> list4 = this.f126045OooO0Oo;
        ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((Method) it4.next()).getDefaultValue());
        }
        this.f126048OooO0oO = arrayList4;
        if (this.f126044OooO0OO == EnumC20377OooO00o.f126049OooOo && oooO0O0 == OooO0O0.f126053OooOo0o && !OooOo.OoooOoo(this.f126043OooO0O0, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // ooOOOoO0.OooO0o
    public final List<Type> OooO00o() {
        return this.f126047OooO0o0;
    }

    @Override // ooOOOoO0.OooO0o
    public final /* bridge */ /* synthetic */ Member OooO0O0() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    @Override // ooOOOoO0.OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call(Object[] args) {
        String strOooO0Oo;
        OooOOO0.OooO0oO(args, "args");
        OooO0o.OooO00o.OooO00o(this, args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f126043OooO0O0;
            if (i >= length) {
                return OooO0OO.OooO00o(this.f126042OooO00o, C34444Oooo0O0.OooOO0o(OooOo.o000OOo(arrayList2, arrayList)), this.f126045OooO0Oo);
            }
            Object array = args[i];
            int i3 = i2 + 1;
            ArrayList arrayList3 = this.f126046OooO0o;
            if (array == null) {
                if (this.f126044OooO0OO == EnumC20377OooO00o.f126050OooOo0o) {
                    array = this.f126048OooO0oO.get(i2);
                } else {
                    Class cls = (Class) arrayList3.get(i2);
                    if (!(array instanceof Class)) {
                        if (array instanceof InterfaceC34595OooO0Oo) {
                            array = C24217OooO0O0.OooO0Oo((InterfaceC34595OooO0Oo) array);
                        } else if (array instanceof Object[]) {
                            Object[] objArr = (Object[]) array;
                            if (!(objArr instanceof Class[])) {
                                if (objArr instanceof InterfaceC34595OooO0Oo[]) {
                                    OooOOO0.OooO0o0(array, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                                    InterfaceC34595OooO0Oo[] interfaceC34595OooO0OoArr = (InterfaceC34595OooO0Oo[]) array;
                                    ArrayList arrayList4 = new ArrayList(interfaceC34595OooO0OoArr.length);
                                    for (InterfaceC34595OooO0Oo interfaceC34595OooO0Oo : interfaceC34595OooO0OoArr) {
                                        arrayList4.add(C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo));
                                    }
                                    array = arrayList4.toArray(new Class[0]);
                                } else {
                                    array = objArr;
                                }
                            }
                            array = null;
                        }
                        if (!cls.isInstance(array)) {
                            array = null;
                        }
                    }
                }
            }
            if (array == null) {
                String str = (String) arrayList2.get(i2);
                Class cls2 = (Class) arrayList3.get(i2);
                InterfaceC34595OooO0Oo interfaceC34595OooO0OoOooO0O0 = OooOOO0.OooO0O0(cls2, Class.class) ? C24035Oooo00o.f80943OooO00o.OooO0O0(InterfaceC34595OooO0Oo.class) : (cls2.isArray() && OooOOO0.OooO0O0(cls2.getComponentType(), Class.class)) ? C24035Oooo00o.f80943OooO00o.OooO0O0(InterfaceC34595OooO0Oo[].class) : C24217OooO0O0.OooO0oO(cls2);
                if (OooOOO0.OooO0O0(interfaceC34595OooO0OoOooO0O0.OooO0Oo(), C24035Oooo00o.f80943OooO00o.OooO0O0(Object[].class).OooO0Oo())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(interfaceC34595OooO0OoOooO0O0.OooO0Oo());
                    sb.append('<');
                    Class<?> componentType = C24217OooO0O0.OooO0Oo(interfaceC34595OooO0OoOooO0O0).getComponentType();
                    OooOOO0.OooO0o(componentType, "kotlinClass.java.componentType");
                    sb.append(C24217OooO0O0.OooO0oO(componentType).OooO0Oo());
                    sb.append('>');
                    strOooO0Oo = sb.toString();
                } else {
                    strOooO0Oo = interfaceC34595OooO0OoOooO0O0.OooO0Oo();
                }
                throw new IllegalArgumentException("Argument #" + i2 + ControlChar.SPACE_CHAR + str + " is not of the required type " + strOooO0Oo);
            }
            arrayList.add(array);
            i++;
            i2 = i3;
        }
    }

    @Override // ooOOOoO0.OooO0o
    public final Type getReturnType() {
        return this.f126042OooO00o;
    }

    public /* synthetic */ C35089OooO00o(Class cls, ArrayList arrayList, EnumC20377OooO00o enumC20377OooO00o) {
        OooO0O0 oooO0O0 = OooO0O0.f126052OooOo;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
        this(cls, arrayList, enumC20377OooO00o, oooO0O0, arrayList2);
    }
}
