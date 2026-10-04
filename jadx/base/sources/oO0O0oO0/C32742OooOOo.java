package oO0O0oO0;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24037Oooo0OO;
import o000ooOO.C24734OooO0O0;
import oO0O0OO.AbstractC32649OoooooO;
import oO0O0OO.C32643Oooooo;
import oO0O0Oo.C32664OooO00o;
import oO0O0Oo.C32665OooO0O0;
import oO0O0Oo.C32666OooO0OO;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32818OooO0Oo;
import oO0O0ooO.InterfaceC32821OooO0oO;
import oO0O0ooO.InterfaceC32823OooOO0;
import oO0O0ooO.InterfaceC32830OooOOo;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0O.C33576OooOOOo;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0O0oO0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32742OooOOo extends AbstractC32748OooOo0O implements InterfaceC32818OooO0Oo, InterfaceC32830OooOOo, InterfaceC32821OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class<?> f117686OooO00o;

    public C32742OooOOo(Class<?> klass) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(klass, "klass");
        this.f117686OooO00o = klass;
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final C33477OooO0OO OooO0OO() {
        return C32730OooO0Oo.OooO00o(this.f117686OooO00o).OooO0O0();
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final Collection<InterfaceC32823OooOO0> OooO0Oo() {
        Class cls;
        Class<?> cls2 = this.f117686OooO00o;
        cls = Object.class;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(cls2, cls)) {
            return C34434OooOoO.f123453OooOo0o;
        }
        C24037Oooo0OO c24037Oooo0OO = new C24037Oooo0OO(2);
        Type genericSuperclass = cls2.getGenericSuperclass();
        c24037Oooo0OO.OooO0OO(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = cls2.getGenericInterfaces();
        kotlin.jvm.internal.OooOOO0.OooO0o(genericInterfaces, "klass.genericInterfaces");
        c24037Oooo0OO.OooO0Oo(genericInterfaces);
        ArrayList arrayList = (ArrayList) c24037Oooo0OO.f80945OooO00o;
        List listOooOO0o = C34429OooOOo0.OooOO0o(arrayList.toArray(new Type[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(listOooOO0o, 10));
        Iterator it = listOooOO0o.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C32747OooOo00((Type) it.next()));
        }
        return arrayList2;
    }

    @Override // oO0O0ooO.InterfaceC32830OooOOo
    public final boolean OooO0o0() {
        return Modifier.isStatic(this.f117686OooO00o.getModifiers());
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final boolean OooO0oO() {
        return this.f117686OooO00o.isAnnotation();
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final Collection OooOO0() {
        Constructor<?>[] declaredConstructors = this.f117686OooO00o.getDeclaredConstructors();
        kotlin.jvm.internal.OooOOO0.OooO0o(declaredConstructors, "klass.declaredConstructors");
        return C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOoo(C33576OooOOOo.OooOOO(oOo000Oo.OooOOO.OooOo(declaredConstructors), C32735OooOO0.f117679OooOo0o), C32736OooOO0O.f117680OooOo0o));
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final Collection OooOO0O() {
        Class<?>[] declaredClasses = this.f117686OooO00o.getDeclaredClasses();
        kotlin.jvm.internal.OooOOO0.OooO0o(declaredClasses, "klass.declaredClasses");
        return C33576OooOOOo.OooOo0(C33576OooOOOo.OooOo00(C33576OooOOOo.OooOOO(oOo000Oo.OooOOO.OooOo(declaredClasses), C32738OooOOO.f117682OooOo0o), C32740OooOOOO.f117684OooOo0o));
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final Collection OooOO0o() {
        Method[] declaredMethods = this.f117686OooO00o.getDeclaredMethods();
        kotlin.jvm.internal.OooOOO0.OooO0o(declaredMethods, "klass.declaredMethods");
        return C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOoo(C33576OooOOOo.OooOOO0(oOo000Oo.OooOOO.OooOo(declaredMethods), new C32741OooOOOo(this)), C32743OooOOo0.f117687OooOo0o));
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final Collection<InterfaceC32823OooOO0> OooOOO() throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        Class<?> clazz = this.f117686OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(clazz, "clazz");
        Method method = C32728OooO0O0.OooO00o().f117662OooO0O0;
        if (method == null) {
            clsArr = null;
        } else {
            Object objInvoke = method.invoke(clazz, new Object[0]);
            kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr == null) {
            return C34434OooOoO.f123453OooOo0o;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(new C32747OooOo00(cls));
        }
        return arrayList;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final InterfaceC32815OooO00o OooOOO0(C33477OooO0OO fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        Class<?> cls = this.f117686OooO00o;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C24734OooO0O0.OooO0OO(declaredAnnotations, fqName);
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final ArrayList OooOOo() {
        Class<?> clazz = this.f117686OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(clazz, "clazz");
        Method method = C32728OooO0O0.OooO00o().f117664OooO0Oo;
        Object[] objArr = method == null ? null : (Object[]) method.invoke(clazz, new Object[0]);
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C32755OooOooO(obj));
        }
        return arrayList;
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final boolean OooOo() {
        return this.f117686OooO00o.isEnum();
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final boolean OooOo0() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        Class<?> clazz = this.f117686OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(clazz, "clazz");
        Method method = C32728OooO0O0.OooO00o().f117663OooO0OO;
        if (method == null) {
            bool = null;
        } else {
            Object objInvoke = method.invoke(clazz, new Object[0]);
            kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final C32742OooOOo OooOo00() {
        Class<?> declaringClass = this.f117686OooO00o.getDeclaringClass();
        if (declaringClass != null) {
            return new C32742OooOOo(declaringClass);
        }
        return null;
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final boolean OooOoO0() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        Class<?> clazz = this.f117686OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(clazz, "clazz");
        Method method = C32728OooO0O0.OooO00o().f117661OooO00o;
        if (method == null) {
            bool = null;
        } else {
            Object objInvoke = method.invoke(clazz, new Object[0]);
            kotlin.jvm.internal.OooOOO0.OooO0o0(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final boolean OooOoo() {
        return this.f117686OooO00o.isInterface();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C32742OooOOo) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f117686OooO00o, ((C32742OooOOo) obj).f117686OooO00o);
        }
        return false;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class<?> cls = this.f117686OooO00o;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? C34434OooOoO.f123453OooOo0o : C24734OooO0O0.OooO0Oo(declaredAnnotations);
    }

    @Override // oO0O0ooO.InterfaceC32821OooO0oO
    public final Collection getFields() {
        Field[] declaredFields = this.f117686OooO00o.getDeclaredFields();
        kotlin.jvm.internal.OooOOO0.OooO0o(declaredFields, "klass.declaredFields");
        return C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOoo(C33576OooOOOo.OooOOO(oOo000Oo.OooOOO.OooOo(declaredFields), C32737OooOO0o.f117681OooOo0o), C32739OooOOO0.f117683OooOo0o));
    }

    @Override // oO0O0ooO.InterfaceC32832OooOOoo
    public final C33479OooO0o getName() {
        return C33479OooO0o.OooO0o0(this.f117686OooO00o.getSimpleName());
    }

    @Override // oO0O0ooO.InterfaceC32837OooOoO0
    public final ArrayList getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f117686OooO00o.getTypeParameters();
        kotlin.jvm.internal.OooOOO0.OooO0o(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new C32757Oooo000(typeVariable));
        }
        return arrayList;
    }

    @Override // oO0O0ooO.InterfaceC32830OooOOo
    public final AbstractC32649OoooooO getVisibility() {
        int modifiers = this.f117686OooO00o.getModifiers();
        return Modifier.isPublic(modifiers) ? C32643Oooooo.C32647OooO0oo.f117305OooO0OO : Modifier.isPrivate(modifiers) ? C32643Oooooo.C32645OooO0o0.f117303OooO0OO : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C32666OooO0OO.f117384OooO0OO : C32665OooO0O0.f117383OooO0OO : C32664OooO00o.f117382OooO0OO;
    }

    public final int hashCode() {
        return this.f117686OooO00o.hashCode();
    }

    @Override // oO0O0ooO.InterfaceC32830OooOOo
    public final boolean isAbstract() {
        return Modifier.isAbstract(this.f117686OooO00o.getModifiers());
    }

    @Override // oO0O0ooO.InterfaceC32830OooOOo
    public final boolean isFinal() {
        return Modifier.isFinal(this.f117686OooO00o.getModifiers());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C21825OoooOO0.OooO0OO(C32742OooOOo.class, sb, ": ");
        sb.append(this.f117686OooO00o);
        return sb.toString();
    }
}
