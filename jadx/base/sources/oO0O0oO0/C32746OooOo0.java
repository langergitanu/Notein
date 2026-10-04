package oO0O0oO0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import oO0O0ooO.InterfaceC32824OooOO0O;
import oO0O0ooO.InterfaceC32836OooOoO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0O0oO0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32746OooOo0 extends AbstractC32750OooOoO implements InterfaceC32824OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Constructor<?> f117690OooO00o;

    public C32746OooOo0(Constructor<?> member) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(member, "member");
        this.f117690OooO00o = member;
    }

    @Override // oO0O0ooO.InterfaceC32824OooOO0O
    public final List<InterfaceC32836OooOoO> OooO0o() {
        Constructor<?> constructor = this.f117690OooO00o;
        Type[] types = constructor.getGenericParameterTypes();
        kotlin.jvm.internal.OooOOO0.OooO0o(types, "types");
        if (types.length == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        Class<?> declaringClass = constructor.getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            types = (Type[]) Oooo.OooO0OO.OooOOO0(types, 1, types.length);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        if (parameterAnnotations.length >= types.length) {
            if (parameterAnnotations.length > types.length) {
                parameterAnnotations = (Annotation[][]) Oooo.OooO0OO.OooOOO0(parameterAnnotations, parameterAnnotations.length - types.length, parameterAnnotations.length);
            }
            return Oooo00O(types, parameterAnnotations, constructor.isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + constructor);
    }

    @Override // oO0O0oO0.AbstractC32750OooOoO
    public final Member Oooo000() {
        return this.f117690OooO00o;
    }

    @Override // oO0O0ooO.InterfaceC32837OooOoO0
    public final ArrayList getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = this.f117690OooO00o.getTypeParameters();
        kotlin.jvm.internal.OooOOO0.OooO0o(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new C32757Oooo000(typeVariable));
        }
        return arrayList;
    }
}
