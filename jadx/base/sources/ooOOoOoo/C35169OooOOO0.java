package ooOOoOoo;

import java.util.List;
import oO0O0O0o.C32591OooOO0o;
import oO0O0O0o.OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0O0oOo.C32776OooO0o0;
import oO0Oo00.C33194OooO0O0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.C33325Oooo;
import oO0Ooo.C33339OoooOOO;
import oO0Ooo.o00Oo0;
import oO0o000.C33538OooO0OO;
import ooOOoOoo.InterfaceC35161OooO0o;

/* JADX INFO: renamed from: ooOOoOoo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35169OooOOO0 implements InterfaceC35161OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C35169OooOOO0 f126246OooO00o = new C35169OooOOO0();

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final String OooO00o(C32776OooO0o0 c32776OooO0o0) {
        return InterfaceC35161OooO0o.OooO00o.OooO00o(this, c32776OooO0o0);
    }

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final boolean OooO0O0(C32776OooO0o0 c32776OooO0o0) {
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0Oo;
        InterfaceC32641OooooOO secondParameter = c32776OooO0o0.OooO0o().get(1);
        C32591OooOO0o.OooO0O0 oooO0O0 = C32591OooOO0o.f117128OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0o(secondParameter, "secondParameter");
        InterfaceC32615OooOoo interfaceC32615OooOooOooOO0 = C33194OooO0O0.OooOO0(secondParameter);
        oooO0O0.getClass();
        InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO00o = oO0O0OO.OooOo00.OooO00o(interfaceC32615OooOooOooOO0, OooOOO.OooO00o.f117193OoooO00);
        if (interfaceC32596OooO0o0OooO00o == null) {
            abstractC33328Oooo0O0OooO0Oo = null;
        } else {
            C33339OoooOOO.f120598OooOo.getClass();
            C33339OoooOOO c33339OoooOOO = C33339OoooOOO.f120599OooOoO0;
            List<InterfaceC32637OoooOoo> parameters = interfaceC32596OooO0o0OooO00o.OooO().getParameters();
            kotlin.jvm.internal.OooOOO0.OooO0o(parameters, "kPropertyClass.typeConstructor.parameters");
            Object objOoooooO = oOo000Oo.OooOo.OoooooO(parameters);
            kotlin.jvm.internal.OooOOO0.OooO0o(objOoooooO, "kPropertyClass.typeConstructor.parameters.single()");
            abstractC33328Oooo0O0OooO0Oo = C33322OooOooO.OooO0Oo(c33339OoooOOO, interfaceC32596OooO0o0OooO00o, com.facebook.soloader.OooOo.OooO0oO(new C33325Oooo((InterfaceC32637OoooOoo) objOoooooO)));
        }
        if (abstractC33328Oooo0O0OooO0Oo == null) {
            return false;
        }
        AbstractC33320OooOoo type = secondParameter.getType();
        kotlin.jvm.internal.OooOOO0.OooO0o(type, "secondParameter.type");
        return C33538OooO0OO.OooO0oo(abstractC33328Oooo0O0OooO0Oo, o00Oo0.OooO0oo(type, false));
    }

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
