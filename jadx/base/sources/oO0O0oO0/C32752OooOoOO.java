package oO0O0oO0;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import oO0O0ooO.InterfaceC32831OooOOo0;
import oO0O0ooO.InterfaceC32836OooOoO;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: renamed from: oO0O0oO0.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32752OooOoOO extends AbstractC32750OooOoO implements InterfaceC32831OooOOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f117695OooO00o;

    public C32752OooOoOO(Method member) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(member, "member");
        this.f117695OooO00o = member;
    }

    @Override // oO0O0ooO.InterfaceC32831OooOOo0
    public final List<InterfaceC32836OooOoO> OooO0o() {
        Method method = this.f117695OooO00o;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.OooOOO0.OooO0o(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        kotlin.jvm.internal.OooOOO0.OooO0o(parameterAnnotations, "member.parameterAnnotations");
        return Oooo00O(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // oO0O0ooO.InterfaceC32831OooOOo0
    public final AbstractC32756OooOooo OooOoOO() {
        Type genericReturnType = this.f117695OooO00o.getGenericReturnType();
        kotlin.jvm.internal.OooOOO0.OooO0o(genericReturnType, "member.genericReturnType");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new C32753OooOoo(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) ? new C32726OooO(genericReturnType) : genericReturnType instanceof WildcardType ? new C32759Oooo00o((WildcardType) genericReturnType) : new C32747OooOo00(genericReturnType);
    }

    @Override // oO0O0ooO.InterfaceC32831OooOOo0
    public final boolean OooOooo() {
        Object defaultValue = this.f117695OooO00o.getDefaultValue();
        Object c32749OooOo0o = null;
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List<InterfaceC34595OooO0Oo<? extends Object>> list = C32730OooO0Oo.f117669OooO00o;
            c32749OooOo0o = Enum.class.isAssignableFrom(cls) ? new C32749OooOo0o(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new C32733OooO0oO(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new C32734OooO0oo(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new C32744OooOOoo(null, (Class) defaultValue) : new C32751OooOoO0(null, defaultValue);
        }
        return c32749OooOo0o != null;
    }

    @Override // oO0O0oO0.AbstractC32750OooOoO
    public final Member Oooo000() {
        return this.f117695OooO00o;
    }

    @Override // oO0O0ooO.InterfaceC32837OooOoO0
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.f117695OooO00o.getTypeParameters();
        kotlin.jvm.internal.OooOOO0.OooO0o(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new C32757Oooo000(typeVariable));
        }
        return arrayList;
    }
}
