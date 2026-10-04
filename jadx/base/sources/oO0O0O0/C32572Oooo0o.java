package oO0O0O0;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import o00OOooo.C25022OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO0O0O0.AbstractC32536OooO0o0;
import oO0O0O0.AbstractC32570Oooo0O0;
import oO0O0O0.OooO0o;
import oO0O0OO.C32602OooOOo0;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0OOO.AbstractC32933OooO0Oo;
import oO0OOO.C32936OooO0oo;
import oO0OOO0.OooO00o;
import oO0OOOo.C32982OooO;
import oO0OOOo.C32992OooOO0O;
import oO0OoOO.C33276OooOOO;
import oO0Ooo.o00Oo0;
import oO0OooO0.C33476OooO0O0;
import ooOOOoO0.AbstractC35092OooO0oO;
import ooOOOoO0.OooO;

/* JADX INFO: renamed from: oO0O0O0.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32572Oooo0o {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, oO00ooO.OooOO0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ooOOOoO0.OooO0o OooO00o(AbstractC32570Oooo0O0.OooO00o oooO00o, boolean z) throws ClassNotFoundException {
        AbstractC32536OooO0o0.C20241OooO0o0 c20241OooO0o0;
        Method method;
        ooOOOoO0.OooO0o oooO00o2;
        OooO00o.OooO0O0 oooO0O0;
        if (AbstractC32552OooOOo.f116975OooOo0o.OooO0O0(oooO00o.OooOOo().f117055OooOooO)) {
            return ooOOOoO0.OooOO0.f126082OooO00o;
        }
        C33476OooO0O0 c33476OooO0O0 = C32583OoooOo0.f117089OooO00o;
        OooO0o oooO0oOooO0O0 = C32583OoooOo0.OooO0O0(oooO00o.OooOOo().OooOOO());
        if (oooO0oOooO0O0 instanceof OooO0o.OooO0OO) {
            OooO0o.OooO0OO oooO0OO = (OooO0o.OooO0OO) oooO0oOooO0O0;
            Method methodOooOO0o = null;
            OooO00o.OooO0OO oooO0OO2 = oooO0OO.f116904OooO0OO;
            if (z) {
                oooO0O0 = (oooO0OO2.f118866OooOo & 4) == 4 ? oooO0OO2.f118870OooOoOO : null;
                if (oooO0O0 != null) {
                    AbstractC32552OooOOo abstractC32552OooOOo = oooO00o.OooOOo().f117054OooOoo0;
                    int i = oooO0O0.f118858OooOoO0;
                    InterfaceC32918OooO0OO interfaceC32918OooO0OO = oooO0OO.f116905OooO0Oo;
                    methodOooOO0o = abstractC32552OooOOo.OooOO0o(interfaceC32918OooO0OO.getString(i), interfaceC32918OooO0OO.getString(oooO0O0.f118857OooOoO));
                }
                if (methodOooOO0o == null) {
                    oooO00o2 = !Modifier.isStatic(methodOooOO0o.getModifiers()) ? oooO00o.OooOOOo() ? new AbstractC35092OooO0oO.AbstractC20379OooO0oO.OooO00o(methodOooOO0o, OooO0Oo(oooO00o)) : new AbstractC35092OooO0oO.AbstractC20379OooO0oO.C35098OooO0Oo(methodOooOO0o) : oooO00o.OooOOo().OooOOO().getAnnotations().Oooo000(C32585OoooOoo.f117091OooO00o) ? oooO00o.OooOOOo() ? new AbstractC35092OooO0oO.AbstractC20379OooO0oO.OooO0O0(methodOooOO0o) : new AbstractC35092OooO0oO.AbstractC20379OooO0oO.C35099OooO0o0(methodOooOO0o) : oooO00o.OooOOOo() ? new AbstractC35092OooO0oO.AbstractC20379OooO0oO.OooO0OO(methodOooOO0o, OooO0Oo(oooO00o)) : new AbstractC35092OooO0oO.AbstractC20379OooO0oO.OooO0o(methodOooOO0o);
                } else if (C32992OooOO0O.OooO0Oo(oooO00o.OooOOo().OooOOO()) && kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o.OooOOo().OooOOO().getVisibility(), C32602OooOOo0.f117241OooO0Oo)) {
                    Class clsOooO = C25022OooO0O0.OooO(oooO00o.OooOOo().OooOOO().OooO0Oo());
                    if (clsOooO == null) {
                        throw new C32579OoooO0O("Underlying property of inline class " + oooO00o.OooOOo() + " should have a field");
                    }
                    Method methodOooO0oO = C25022OooO0O0.OooO0oO(clsOooO, oooO00o.OooOOo().OooOOO());
                    oooO00o2 = oooO00o.OooOOOo() ? new OooO.OooO00o(methodOooO0oO, OooO0Oo(oooO00o)) : new OooO.OooO0O0(methodOooO0oO, com.facebook.soloader.OooOo.OooO0oO(methodOooO0oO.getDeclaringClass()));
                } else {
                    Field field = (Field) oooO00o.OooOOo().f117057Oooo000.getValue();
                    if (field == null) {
                        throw new C32579OoooO0O("No accessors or field is found for property " + oooO00o.OooOOo());
                    }
                    oooO00o2 = OooO0O0(oooO00o, z, field);
                }
            } else {
                if ((oooO0OO2.f118866OooOo & 8) == 8) {
                    oooO0O0 = oooO0OO2.f118872OooOoo0;
                }
                if (oooO0O0 != null) {
                }
                if (methodOooOO0o == null) {
                }
            }
        } else if (oooO0oOooO0O0 instanceof OooO0o.OooO00o) {
            oooO00o2 = OooO0O0(oooO00o, z, ((OooO0o.OooO00o) oooO0oOooO0O0).f116899OooO00o);
        } else {
            if (!(oooO0oOooO0O0 instanceof OooO0o.OooO0O0)) {
                if (!(oooO0oOooO0O0 instanceof OooO0o.C32535OooO0Oo)) {
                    throw new C32442OooOO0o();
                }
                if (z) {
                    c20241OooO0o0 = ((OooO0o.C32535OooO0Oo) oooO0oOooO0O0).f116908OooO00o;
                } else {
                    c20241OooO0o0 = ((OooO0o.C32535OooO0Oo) oooO0oOooO0O0).f116909OooO0O0;
                    if (c20241OooO0o0 == null) {
                        throw new C32579OoooO0O("No setter found for property " + oooO00o.OooOOo());
                    }
                }
                AbstractC32552OooOOo abstractC32552OooOOo2 = oooO00o.OooOOo().f117054OooOoo0;
                AbstractC32933OooO0Oo.OooO0O0 oooO0O02 = c20241OooO0o0.f116917OooO00o;
                Method methodOooOO0o2 = abstractC32552OooOOo2.OooOO0o(oooO0O02.f118818OooO00o, oooO0O02.f118819OooO0O0);
                if (methodOooOO0o2 != null) {
                    Modifier.isStatic(methodOooOO0o2.getModifiers());
                    return oooO00o.OooOOOo() ? new AbstractC35092OooO0oO.AbstractC20379OooO0oO.OooO00o(methodOooOO0o2, OooO0Oo(oooO00o)) : new AbstractC35092OooO0oO.AbstractC20379OooO0oO.C35098OooO0Oo(methodOooOO0o2);
                }
                throw new C32579OoooO0O("No accessor found for property " + oooO00o.OooOOo());
            }
            if (z) {
                method = ((OooO0o.OooO0O0) oooO0oOooO0O0).f116900OooO00o;
            } else {
                OooO0o.OooO0O0 oooO0O03 = (OooO0o.OooO0O0) oooO0oOooO0O0;
                method = oooO0O03.f116901OooO0O0;
                if (method == null) {
                    throw new C32579OoooO0O("No source found for setter of Java method property: " + oooO0O03.f116900OooO00o);
                }
            }
            oooO00o2 = oooO00o.OooOOOo() ? new AbstractC35092OooO0oO.AbstractC20379OooO0oO.OooO00o(method, OooO0Oo(oooO00o)) : new AbstractC35092OooO0oO.AbstractC20379OooO0oO.C35098OooO0Oo(method);
        }
        return C25022OooO0O0.OooO0o0(oooO00o.OooOOo0(), oooO00o2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC35092OooO0oO<Field> OooO0O0(AbstractC32570Oooo0O0.OooO00o<?, ?> oooO00o, boolean z, Field field) {
        InterfaceC32627Oooo0oo interfaceC32627Oooo0ooOooOOO = oooO00o.OooOOo().OooOOO();
        oO0O0OO.OooOO0O containingDeclaration = interfaceC32627Oooo0ooOooOOO.OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0o(containingDeclaration, "containingDeclaration");
        if (C32982OooO.OooOO0o(containingDeclaration)) {
            oO0O0OO.OooOO0O oooOO0OOooO0Oo = containingDeclaration.OooO0Oo();
            if ((C32982OooO.OooOOO(oooOO0OOooO0Oo, oO0O0OO.OooO0o.f117229OooOo) || C32982OooO.OooOOO(oooOO0OOooO0Oo, oO0O0OO.OooO0o.f117233OooOoOO)) && (!(interfaceC32627Oooo0ooOooOOO instanceof C33276OooOOO) || !C32936OooO0oo.OooO0Oo(((C33276OooOOO) interfaceC32627Oooo0ooOooOOO).f120471OoooOOO))) {
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            return oooO00o.OooOOo().OooOOO().getAnnotations().Oooo000(C32585OoooOoo.f117091OooO00o) ? z ? oooO00o.OooOOOo() ? new AbstractC35092OooO0oO.AbstractC35096OooO0o0.OooO0O0(field, false) : new AbstractC35092OooO0oO.AbstractC35096OooO0o0.C35097OooO0Oo(field, true) : oooO00o.OooOOOo() ? new AbstractC35092OooO0oO.OooO0o.OooO0O0(field, OooO0OO(oooO00o), false) : new AbstractC35092OooO0oO.OooO0o.C35094OooO0Oo(field, OooO0OO(oooO00o), true) : z ? new AbstractC35092OooO0oO.AbstractC35096OooO0o0.C20378OooO0o0(field, false) : new AbstractC35092OooO0oO.OooO0o.C35095OooO0o0(field, OooO0OO(oooO00o), false);
        }
        if (z) {
            if (oooO00o.OooOOOo()) {
                return new AbstractC35092OooO0oO.AbstractC35096OooO0o0.OooO00o(field, OooO0Oo(oooO00o));
            }
            kotlin.jvm.internal.OooOOO0.OooO0oO(field, "field");
            return new AbstractC35092OooO0oO.AbstractC35096OooO0o0.OooO0OO(field, true);
        }
        if (oooO00o.OooOOOo()) {
            return new AbstractC35092OooO0oO.OooO0o.OooO00o(field, OooO0OO(oooO00o), OooO0Oo(oooO00o));
        }
        boolean zOooO0OO = OooO0OO(oooO00o);
        kotlin.jvm.internal.OooOOO0.OooO0oO(field, "field");
        return new AbstractC35092OooO0oO.OooO0o.OooO0OO(field, zOooO0OO, true);
    }

    public static final boolean OooO0OO(AbstractC32570Oooo0O0.OooO00o<?, ?> oooO00o) {
        return !o00Oo0.OooO0o(oooO00o.OooOOo().OooOOO().getType());
    }

    public static final Object OooO0Oo(AbstractC32570Oooo0O0.OooO00o<?, ?> oooO00o) {
        AbstractC32570Oooo0O0<?> abstractC32570Oooo0O0OooOOo = oooO00o.OooOOo();
        return C25022OooO0O0.OooO0Oo(abstractC32570Oooo0O0OooOOo.f117056OooOooo, abstractC32570Oooo0O0OooOOo.OooOOO());
    }
}
