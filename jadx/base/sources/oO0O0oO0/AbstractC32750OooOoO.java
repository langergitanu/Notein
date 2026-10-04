package oO0O0oO0;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import o000ooOO.C24734OooO0O0;
import oO0O0OO.AbstractC32649OoooooO;
import oO0O0OO.C32643Oooooo;
import oO0O0Oo.C32664OooO00o;
import oO0O0Oo.C32665OooO0O0;
import oO0O0Oo.C32666OooO0OO;
import oO0O0oO0.C32729OooO0OO;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32818OooO0Oo;
import oO0O0ooO.InterfaceC32829OooOOOo;
import oO0O0ooO.InterfaceC32830OooOOo;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0OooO0.C33482OooO0oo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0O0oO0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32750OooOoO extends AbstractC32748OooOo0O implements InterfaceC32818OooO0Oo, InterfaceC32830OooOOo, InterfaceC32829OooOOOo {
    @Override // oO0O0ooO.InterfaceC32830OooOOo
    public final boolean OooO0o0() {
        return Modifier.isStatic(Oooo000().getModifiers());
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final InterfaceC32815OooO00o OooOOO0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        Member memberOooo000 = Oooo000();
        kotlin.jvm.internal.OooOOO0.OooO0o0(memberOooo000, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberOooo000).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return C24734OooO0O0.OooO0OO(declaredAnnotations, fqName);
        }
        return null;
    }

    @Override // oO0O0ooO.InterfaceC32829OooOOOo
    public final C32742OooOOo OooOOoo() {
        Class<?> declaringClass = Oooo000().getDeclaringClass();
        kotlin.jvm.internal.OooOOO0.OooO0o(declaringClass, "member.declaringClass");
        return new C32742OooOOo(declaringClass);
    }

    public abstract Member Oooo000();

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList Oooo00O(Type[] typeArr, Annotation[][] annotationArr, boolean z) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        AbstractC32756OooOooo c32753OooOoo;
        String str;
        boolean z2;
        C32729OooO0OO.OooO00o oooO00o;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        C32729OooO0OO c32729OooO0OO = C32729OooO0OO.f117665OooO00o;
        Member member = Oooo000();
        kotlin.jvm.internal.OooOOO0.OooO0oO(member, "member");
        C32729OooO0OO.OooO00o oooO00o2 = C32729OooO0OO.f117666OooO0O0;
        if (oooO00o2 == null) {
            synchronized (c32729OooO0OO) {
                oooO00o2 = C32729OooO0OO.f117666OooO0O0;
                if (oooO00o2 == null) {
                    Class<?> cls = member.getClass();
                    try {
                        oooO00o = new C32729OooO0OO.OooO00o(cls.getMethod("getParameters", new Class[0]), C32730OooO0Oo.OooO0Oo(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
                    } catch (NoSuchMethodException unused) {
                        oooO00o = new C32729OooO0OO.OooO00o(null, null);
                    }
                    C32729OooO0OO.f117666OooO0O0 = oooO00o;
                    oooO00o2 = oooO00o;
                }
            }
        }
        Method method2 = oooO00o2.f117667OooO00o;
        if (method2 == null || (method = oooO00o2.f117668OooO0O0) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(member, new Object[0]);
            kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object objInvoke2 = method.invoke(obj, new Object[0]);
                kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i = 0; i < length; i++) {
            Type type = typeArr[i];
            kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
            boolean z3 = type instanceof Class;
            if (z3) {
                Class cls2 = (Class) type;
                c32753OooOoo = cls2.isPrimitive() ? new C32753OooOoo(cls2) : ((type instanceof GenericArrayType) || (z3 && ((Class) type).isArray())) ? new C32726OooO(type) : type instanceof WildcardType ? new C32759Oooo00o((WildcardType) type) : new C32747OooOo00(type);
            }
            if (arrayList != null) {
                str = (String) oOo000Oo.OooOo.OoooO00(i + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + getName() + " type=" + c32753OooOoo + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z) {
                z2 = true;
                if (i != typeArr.length - 1) {
                    z2 = false;
                }
            }
            arrayList2.add(new C32758Oooo00O(c32753OooOoo, annotationArr[i], str, z2));
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC32750OooOoO) && kotlin.jvm.internal.OooOOO0.OooO0O0(Oooo000(), ((AbstractC32750OooOoO) obj).Oooo000());
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final Collection getAnnotations() {
        Member memberOooo000 = Oooo000();
        kotlin.jvm.internal.OooOOO0.OooO0o0(memberOooo000, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberOooo000).getDeclaredAnnotations();
        return declaredAnnotations != null ? C24734OooO0O0.OooO0Oo(declaredAnnotations) : C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0O0ooO.InterfaceC32832OooOOoo
    public final C33479OooO0o getName() {
        String name = Oooo000().getName();
        C33479OooO0o c33479OooO0oOooO0o0 = name != null ? C33479OooO0o.OooO0o0(name) : null;
        return c33479OooO0oOooO0o0 == null ? C33482OooO0oo.f120983OooO00o : c33479OooO0oOooO0o0;
    }

    @Override // oO0O0ooO.InterfaceC32830OooOOo
    public final AbstractC32649OoooooO getVisibility() {
        int modifiers = Oooo000().getModifiers();
        return Modifier.isPublic(modifiers) ? C32643Oooooo.C32647OooO0oo.f117305OooO0OO : Modifier.isPrivate(modifiers) ? C32643Oooooo.C32645OooO0o0.f117303OooO0OO : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C32666OooO0OO.f117384OooO0OO : C32665OooO0O0.f117383OooO0OO : C32664OooO00o.f117382OooO0OO;
    }

    public final int hashCode() {
        return Oooo000().hashCode();
    }

    @Override // oO0O0ooO.InterfaceC32830OooOOo
    public final boolean isAbstract() {
        return Modifier.isAbstract(Oooo000().getModifiers());
    }

    @Override // oO0O0ooO.InterfaceC32830OooOOo
    public final boolean isFinal() {
        return Modifier.isFinal(Oooo000().getModifiers());
    }

    public final String toString() {
        return getClass().getName() + ": " + Oooo000();
    }
}
