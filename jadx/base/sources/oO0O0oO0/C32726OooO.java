package oO0O0oO0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32819OooO0o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0O0oO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32726OooO extends AbstractC32756OooOooo implements InterfaceC32819OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Type f117654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC32756OooOooo f117655OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C34434OooOoO f117656OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public C32726OooO(Type type) {
        AbstractC32756OooOooo c32753OooOoo;
        AbstractC32756OooOooo c32753OooOoo2;
        this.f117654OooO00o = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.OooOOO0.OooO0o(componentType, "getComponentType()");
                    c32753OooOoo = componentType.isPrimitive() ? new C32753OooOoo(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C32726OooO(componentType) : componentType instanceof WildcardType ? new C32759Oooo00o((WildcardType) componentType) : new C32747OooOo00(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        kotlin.jvm.internal.OooOOO0.OooO0o(genericComponentType, "genericComponentType");
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                c32753OooOoo2 = new C32753OooOoo(cls2);
                this.f117655OooO0O0 = c32753OooOoo2;
                this.f117656OooO0OO = C34434OooOoO.f123453OooOo0o;
            }
        }
        c32753OooOoo = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new C32726OooO(genericComponentType) : genericComponentType instanceof WildcardType ? new C32759Oooo00o((WildcardType) genericComponentType) : new C32747OooOo00(genericComponentType);
        c32753OooOoo2 = c32753OooOoo;
        this.f117655OooO0O0 = c32753OooOoo2;
        this.f117656OooO0OO = C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0O0ooO.InterfaceC32819OooO0o
    public final AbstractC32756OooOooo OooOoO() {
        return this.f117655OooO0O0;
    }

    @Override // oO0O0oO0.AbstractC32756OooOooo
    public final Type Oooo000() {
        return this.f117654OooO00o;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final Collection<InterfaceC32815OooO00o> getAnnotations() {
        return this.f117656OooO0OO;
    }
}
