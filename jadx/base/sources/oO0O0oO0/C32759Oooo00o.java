package oO0O0oO0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32838OooOoOO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0O0oO0.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32759Oooo00o extends AbstractC32756OooOooo implements InterfaceC32838OooOoOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WildcardType f117705OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C34434OooOoO f117706OooO0O0 = C34434OooOoO.f123453OooOo0o;

    public C32759Oooo00o(WildcardType wildcardType) {
        this.f117705OooO00o = wildcardType;
    }

    @Override // oO0O0ooO.InterfaceC32838OooOoOO
    public final AbstractC32756OooOooo OooOo0O() {
        WildcardType wildcardType = this.f117705OooO00o;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objOooo0o0 = oOo000Oo.OooOOO.Oooo0o0(lowerBounds);
            kotlin.jvm.internal.OooOOO0.OooO0o(objOooo0o0, "lowerBounds.single()");
            Type type = (Type) objOooo0o0;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C32753OooOoo(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C32726OooO(type) : type instanceof WildcardType ? new C32759Oooo00o((WildcardType) type) : new C32747OooOo00(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type ub = (Type) oOo000Oo.OooOOO.Oooo0o0(upperBounds);
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(ub, Object.class)) {
            return null;
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(ub, "ub");
        boolean z2 = ub instanceof Class;
        if (z2) {
            Class cls2 = (Class) ub;
            if (cls2.isPrimitive()) {
                return new C32753OooOoo(cls2);
            }
        }
        return ((ub instanceof GenericArrayType) || (z2 && ((Class) ub).isArray())) ? new C32726OooO(ub) : ub instanceof WildcardType ? new C32759Oooo00o((WildcardType) ub) : new C32747OooOo00(ub);
    }

    @Override // oO0O0ooO.InterfaceC32838OooOoOO
    public final boolean OooOooO() {
        kotlin.jvm.internal.OooOOO0.OooO0o(this.f117705OooO00o.getUpperBounds(), "reflectType.upperBounds");
        return !kotlin.jvm.internal.OooOOO0.OooO0O0(oOo000Oo.OooOOO.OooOoo(r0), Object.class);
    }

    @Override // oO0O0oO0.AbstractC32756OooOooo
    public final Type Oooo000() {
        return this.f117705OooO00o;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final Collection<InterfaceC32815OooO00o> getAnnotations() {
        return this.f117706OooO0O0;
    }
}
