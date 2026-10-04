package oO0O0O0;

import java.lang.reflect.Type;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0Ooo.AbstractC33320OooOoo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Type> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ OooOOO0<Object>.OooO00o f116933OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC33320OooOoo f116934OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ OooOOO0<Object> f116935OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(AbstractC33320OooOoo abstractC33320OooOoo, OooOOO0<Object>.OooO00o oooO00o, OooOOO0<Object> oooOOO0) {
        super(0);
        this.f116934OooOo0o = abstractC33320OooOoo;
        this.f116933OooOo = oooO00o;
        this.f116935OooOoO0 = oooOOO0;
    }

    @Override // oO0O000o.OooO00o
    public final Type invoke() {
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = this.f116934OooOo0o.o00000().OooO0OO();
        if (!(interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32596OooO0o0)) {
            throw new C32579OoooO0O("Supertype not a class: " + interfaceC32598OooO0ooOooO0OO);
        }
        Class<?> clsOooOO0 = C32585OoooOoo.OooOO0((InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO);
        OooOOO0<Object>.OooO00o oooO00o = this.f116933OooOo;
        if (clsOooOO0 == null) {
            throw new C32579OoooO0O("Unsupported superclass of " + oooO00o + ": " + interfaceC32598OooO0ooOooO0OO);
        }
        OooOOO0<Object> oooOOO0 = this.f116935OooOoO0;
        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(oooOOO0.f116937OooOo.getSuperclass(), clsOooOO0);
        Class<Object> cls = oooOOO0.f116937OooOo;
        if (zOooO0O0) {
            Type genericSuperclass = cls.getGenericSuperclass();
            kotlin.jvm.internal.OooOOO0.OooO0o(genericSuperclass, "{\n                      …ass\n                    }");
            return genericSuperclass;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.OooOOO0.OooO0o(interfaces, "jClass.interfaces");
        int iOooo000 = oOo000Oo.OooOOO.Oooo000(interfaces, clsOooOO0);
        if (iOooo000 >= 0) {
            Type type = cls.getGenericInterfaces()[iOooo000];
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "{\n                      …ex]\n                    }");
            return type;
        }
        throw new C32579OoooO0O("No superclass of " + oooO00o + " in Java reflection for " + interfaceC32598OooO0ooOooO0OO);
    }
}
