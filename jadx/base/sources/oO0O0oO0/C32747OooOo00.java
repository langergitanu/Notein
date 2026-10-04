package oO0O0oO0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import oO0O0ooO.InterfaceC32814OooO;
import oO0O0ooO.InterfaceC32815OooO00o;
import oO0O0ooO.InterfaceC32818OooO0Oo;
import oO0O0ooO.InterfaceC32823OooOO0;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0O0oO0.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32747OooOo00 extends AbstractC32756OooOooo implements InterfaceC32823OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Type f117691OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC32748OooOo0O f117692OooO0O0;

    public C32747OooOo00(Type reflectType) {
        AbstractC32748OooOo0O c32742OooOOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(reflectType, "reflectType");
        this.f117691OooO00o = reflectType;
        if (reflectType instanceof Class) {
            c32742OooOOo = new C32742OooOOo((Class) reflectType);
        } else if (reflectType instanceof TypeVariable) {
            c32742OooOOo = new C32757Oooo000((TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + reflectType.getClass() + "): " + reflectType);
            }
            Type rawType = ((ParameterizedType) reflectType).getRawType();
            kotlin.jvm.internal.OooOOO0.OooO0o0(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            c32742OooOOo = new C32742OooOOo((Class) rawType);
        }
        this.f117692OooO0O0 = c32742OooOOo;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    @Override // oO0O0ooO.InterfaceC32823OooOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList OooO() {
        InterfaceC32818OooO0Oo c32753OooOoo;
        List<Type> listOooO0OO = C32730OooO0Oo.OooO0OO(this.f117691OooO00o);
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooO0OO, 10));
        for (Type type : listOooO0OO) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                c32753OooOoo = cls.isPrimitive() ? new C32753OooOoo(cls) : ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) ? new C32726OooO(type) : type instanceof WildcardType ? new C32759Oooo00o((WildcardType) type) : new C32747OooOo00(type);
            }
            arrayList.add(c32753OooOoo);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oO0O0oO0.OooOo0O, oO0O0ooO.OooO] */
    @Override // oO0O0ooO.InterfaceC32823OooOO0
    public final InterfaceC32814OooO OooO0O0() {
        return this.f117692OooO0O0;
    }

    @Override // oO0O0oO0.AbstractC32756OooOooo, oO0O0ooO.InterfaceC32818OooO0Oo
    public final InterfaceC32815OooO00o OooOOO0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        return null;
    }

    @Override // oO0O0ooO.InterfaceC32823OooOO0
    public final String OooOOOO() {
        return this.f117691OooO00o.toString();
    }

    @Override // oO0O0ooO.InterfaceC32823OooOO0
    public final String OooOOo0() {
        throw new UnsupportedOperationException("Type not found: " + this.f117691OooO00o);
    }

    @Override // oO0O0ooO.InterfaceC32823OooOO0
    public final boolean OooOo0o() {
        Type type = this.f117691OooO00o;
        if (type instanceof Class) {
            TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
            kotlin.jvm.internal.OooOOO0.OooO0o(typeParameters, "getTypeParameters()");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // oO0O0oO0.AbstractC32756OooOooo
    public final Type Oooo000() {
        return this.f117691OooO00o;
    }

    @Override // oO0O0ooO.InterfaceC32818OooO0Oo
    public final Collection<InterfaceC32815OooO00o> getAnnotations() {
        return C34434OooOoO.f123453OooOo0o;
    }
}
