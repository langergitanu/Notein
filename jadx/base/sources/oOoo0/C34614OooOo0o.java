package oOoo0;

import com.huawei.hms.network.embedded.C18416x7;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0000OOo.C24217OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO0O0O0.C32567Oooo;
import oO0o0O0O.C33574OooOOO0;
import oO0o0O0O.C33576OooOOOo;
import oO0o0O0O.InterfaceC33569OooO0oo;
import oO0o0O0o.C33595OooOOo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oOoo0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34614OooOo0o {

    /* JADX INFO: renamed from: oOoo0.OooOo0o$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f123993OooO00o;

        static {
            int[] iArr = new int[EnumC34609OooOOoo.values().length];
            try {
                EnumC34609OooOOoo enumC34609OooOOoo = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC34609OooOOoo enumC34609OooOOoo2 = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC34609OooOOoo enumC34609OooOOoo3 = EnumC34609OooOOoo.f123979OooOo0o;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f123993OooO00o = iArr;
        }
    }

    public static final String OooO00o(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        InterfaceC33569OooO0oo interfaceC33569OooO0ooOooO = C33574OooOOO0.OooO(type, C34610OooOo.f123982OooOo0o);
        return ((Class) C33576OooOOOo.OooOOo(interfaceC33569OooO0ooOooO)).getName() + C33595OooOOo.OooOo00(C18416x7.f56644n, C33576OooOOOo.OooOO0O(interfaceC33569OooO0ooOooO));
    }

    public static final Type OooO0O0(InterfaceC34606OooOOOo interfaceC34606OooOOOo, boolean z) {
        InterfaceC34597OooO0o0 interfaceC34597OooO0o0OooO0O0 = interfaceC34606OooOOOo.OooO0O0();
        if (interfaceC34597OooO0o0OooO0O0 instanceof InterfaceC34608OooOOo0) {
            return new C34613OooOo0O((InterfaceC34608OooOOo0) interfaceC34597OooO0o0OooO0O0);
        }
        if (!(interfaceC34597OooO0o0OooO0O0 instanceof InterfaceC34595OooO0Oo)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + interfaceC34606OooOOOo);
        }
        InterfaceC34595OooO0Oo interfaceC34595OooO0Oo = (InterfaceC34595OooO0Oo) interfaceC34597OooO0o0OooO0O0;
        Class clsOooO0o0 = z ? C24217OooO0O0.OooO0o0(interfaceC34595OooO0Oo) : C24217OooO0O0.OooO0Oo(interfaceC34595OooO0Oo);
        List<C34607OooOOo> arguments = interfaceC34606OooOOOo.getArguments();
        if (arguments.isEmpty()) {
            return clsOooO0o0;
        }
        if (!clsOooO0o0.isArray()) {
            return OooO0OO(arguments, clsOooO0o0);
        }
        if (clsOooO0o0.getComponentType().isPrimitive()) {
            return clsOooO0o0;
        }
        C34607OooOOo c34607OooOOo = (C34607OooOOo) oOo000Oo.OooOo.o0OoOo0(arguments);
        if (c34607OooOOo == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + interfaceC34606OooOOOo);
        }
        EnumC34609OooOOoo enumC34609OooOOoo = c34607OooOOo.f123975OooO00o;
        int i = enumC34609OooOOoo == null ? -1 : OooO00o.f123993OooO00o[enumC34609OooOOoo.ordinal()];
        if (i == -1 || i == 1) {
            return clsOooO0o0;
        }
        if (i != 2 && i != 3) {
            throw new C32442OooOO0o();
        }
        C32567Oooo c32567Oooo = c34607OooOOo.f123976OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c32567Oooo);
        Type typeOooO0O0 = OooO0O0(c32567Oooo, false);
        return typeOooO0O0 instanceof Class ? clsOooO0o0 : new C34592OooO00o(typeOooO0O0);
    }

    public static final C34611OooOo0 OooO0OO(List list, Class cls) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(OooO0o0((C34607OooOOo) it.next()));
            }
            return new C34611OooOo0(arrayList, null, cls);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(OooO0o0((C34607OooOOo) it2.next()));
            }
            return new C34611OooOo0(arrayList2, declaringClass, cls);
        }
        int length = cls.getTypeParameters().length;
        C34611OooOo0 c34611OooOo0OooO0OO = OooO0OO(list.subList(length, list.size()), declaringClass);
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(OooO0o0((C34607OooOOo) it3.next()));
        }
        return new C34611OooOo0(arrayList3, c34611OooOo0OooO0OO, cls);
    }

    public static final Type OooO0Oo(InterfaceC34606OooOOOo interfaceC34606OooOOOo) {
        Type typeOooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC34606OooOOOo, "<this>");
        return (!(interfaceC34606OooOOOo instanceof kotlin.jvm.internal.OooOOO) || (typeOooO0OO = ((kotlin.jvm.internal.OooOOO) interfaceC34606OooOOOo).OooO0OO()) == null) ? OooO0O0(interfaceC34606OooOOOo, false) : typeOooO0OO;
    }

    public static final Type OooO0o0(C34607OooOOo c34607OooOOo) {
        EnumC34609OooOOoo enumC34609OooOOoo = c34607OooOOo.f123975OooO00o;
        if (enumC34609OooOOoo == null) {
            return C34615OooOoO0.f123994OooOoO0;
        }
        C32567Oooo c32567Oooo = c34607OooOOo.f123976OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c32567Oooo);
        int iOrdinal = enumC34609OooOOoo.ordinal();
        if (iOrdinal == 0) {
            return OooO0O0(c32567Oooo, true);
        }
        if (iOrdinal == 1) {
            return new C34615OooOoO0(null, OooO0O0(c32567Oooo, true));
        }
        if (iOrdinal == 2) {
            return new C34615OooOoO0(OooO0O0(c32567Oooo, true), null);
        }
        throw new C32442OooOO0o();
    }
}
