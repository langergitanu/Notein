package oO0O0O0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: renamed from: oO0O0O0.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32574Oooo0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Type> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f117071OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32567Oooo f117072OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f117073OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32574Oooo0oO(C32567Oooo c32567Oooo, int i, InterfaceC32440OooOO0<? extends List<? extends Type>> interfaceC32440OooOO0) {
        super(0);
        this.f117072OooOo0o = c32567Oooo;
        this.f117071OooOo = i;
        this.f117073OooOoO0 = interfaceC32440OooOO0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // oO0O000o.OooO00o
    public final Type invoke() {
        C32567Oooo c32567Oooo = this.f117072OooOo0o;
        Type typeOooO0OO = c32567Oooo.OooO0OO();
        if (typeOooO0OO instanceof Class) {
            Class cls = (Class) typeOooO0OO;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            kotlin.jvm.internal.OooOOO0.OooO0o(componentType, "{\n                      …                        }");
            return componentType;
        }
        boolean z = typeOooO0OO instanceof GenericArrayType;
        int i = this.f117071OooOo;
        if (z) {
            if (i == 0) {
                Type genericComponentType = ((GenericArrayType) typeOooO0OO).getGenericComponentType();
                kotlin.jvm.internal.OooOOO0.OooO0o(genericComponentType, "{\n                      …                        }");
                return genericComponentType;
            }
            throw new C32579OoooO0O("Array type has been queried for a non-0th argument: " + c32567Oooo);
        }
        if (!(typeOooO0OO instanceof ParameterizedType)) {
            throw new C32579OoooO0O("Non-generic type has been queried for arguments: " + c32567Oooo);
        }
        Type type = (Type) ((List) this.f117073OooOoO0.getValue()).get(i);
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            kotlin.jvm.internal.OooOOO0.OooO0o(lowerBounds, "argument.lowerBounds");
            Type type2 = (Type) oOo000Oo.OooOOO.OooOoo(lowerBounds);
            if (type2 == null) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                kotlin.jvm.internal.OooOOO0.OooO0o(upperBounds, "argument.upperBounds");
                type = (Type) oOo000Oo.OooOOO.OooOoo0(upperBounds);
            } else {
                type = type2;
            }
        }
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "{\n                      …                        }");
        return type;
    }
}
