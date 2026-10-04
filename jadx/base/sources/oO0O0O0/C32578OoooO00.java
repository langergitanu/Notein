package oO0O0O0;

import Oooo0.o0OoOo0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import o0000OOo.C24217OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O0O0.C32580OoooOO0;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0o0O.C32722OooO0o0;
import oO0OoOO.InterfaceC33271OooOO0;
import oO0OoOO.InterfaceC33272OooOO0O;
import oO0Ooo.AbstractC33320OooOoo;
import oOo000Oo.C34428OooOOo;
import oOoo0.EnumC34609OooOOoo;
import oOoo0.InterfaceC34602OooOO0o;
import oOoo0.InterfaceC34606OooOOOo;
import oOoo0.InterfaceC34608OooOOo0;
import ooo0o.C35193OooOO0o;
import ooo0o.InterfaceC35196OooOOo0;

/* JADX INFO: renamed from: oO0O0O0.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32578OoooO00 implements InterfaceC34608OooOOo0, InterfaceC32551OooOOOo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f117076OooOoO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C32580OoooOO0.OooO00o f117077OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC32637OoooOoo f117078OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final InterfaceC32577OoooO0 f117079OooOoO0;

    /* JADX INFO: renamed from: oO0O0O0.OoooO00$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<? extends C32567Oooo>> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final List<? extends C32567Oooo> invoke() {
            List<AbstractC33320OooOoo> upperBounds = C32578OoooO00.this.f117078OooOo0o.getUpperBounds();
            kotlin.jvm.internal.OooOOO0.OooO0o(upperBounds, "descriptor.upperBounds");
            List<AbstractC33320OooOoo> list = upperBounds;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C32567Oooo((AbstractC33320OooOoo) it.next(), null));
            }
            return arrayList;
        }
    }

    static {
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f117076OooOoO = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32578OoooO00.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public C32578OoooO00(InterfaceC32577OoooO0 interfaceC32577OoooO0, InterfaceC32637OoooOoo descriptor) {
        Class<?> cls;
        OooOOO0 oooOOO0OooO00o;
        Object objO0O0O00;
        kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        this.f117078OooOo0o = descriptor;
        this.f117077OooOo = C32580OoooOO0.OooO00o(null, new OooO00o());
        if (interfaceC32577OoooO0 == null) {
            oO0O0OO.OooOO0O oooOO0OOooO0Oo = descriptor.OooO0Oo();
            kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OOooO0Oo, "descriptor.containingDeclaration");
            if (oooOO0OOooO0Oo instanceof InterfaceC32596OooO0o0) {
                objO0O0O00 = OooO00o((InterfaceC32596OooO0o0) oooOO0OOooO0Oo);
            } else {
                if (!(oooOO0OOooO0Oo instanceof oO0O0OO.OooO0O0)) {
                    throw new C32579OoooO0O("Unknown type parameter container: " + oooOO0OOooO0Oo);
                }
                oO0O0OO.OooOO0O oooOO0OOooO0Oo2 = ((oO0O0OO.OooO0O0) oooOO0OOooO0Oo).OooO0Oo();
                kotlin.jvm.internal.OooOOO0.OooO0o(oooOO0OOooO0Oo2, "declaration.containingDeclaration");
                if (oooOO0OOooO0Oo2 instanceof InterfaceC32596OooO0o0) {
                    oooOOO0OooO00o = OooO00o((InterfaceC32596OooO0o0) oooOO0OOooO0Oo2);
                } else {
                    InterfaceC33272OooOO0O interfaceC33272OooOO0O = oooOO0OOooO0Oo instanceof InterfaceC33272OooOO0O ? (InterfaceC33272OooOO0O) oooOO0OOooO0Oo : null;
                    if (interfaceC33272OooOO0O == null) {
                        throw new C32579OoooO0O("Non-class callable descriptor must be deserialized: " + oooOO0OOooO0Oo);
                    }
                    InterfaceC33271OooOO0 interfaceC33271OooOO0OoooOOo = interfaceC33272OooOO0O.OoooOOo();
                    C35193OooOO0o c35193OooOO0o = interfaceC33271OooOO0OoooOOo instanceof C35193OooOO0o ? (C35193OooOO0o) interfaceC33271OooOO0OoooOOo : null;
                    InterfaceC35196OooOOo0 interfaceC35196OooOOo0 = c35193OooOO0o != null ? c35193OooOO0o.f126369OooO0Oo : null;
                    C32722OooO0o0 c32722OooO0o0 = interfaceC35196OooOOo0 instanceof C32722OooO0o0 ? (C32722OooO0o0) interfaceC35196OooOOo0 : null;
                    if (c32722OooO0o0 == null || (cls = c32722OooO0o0.f117648OooO00o) == null) {
                        throw new C32579OoooO0O("Container of deserialized member is not resolved: " + interfaceC33272OooOO0O);
                    }
                    oooOOO0OooO00o = (OooOOO0) C24217OooO0O0.OooO0oO(cls);
                }
                objO0O0O00 = oooOO0OOooO0Oo.o0O0O00(new o0OO0O0O.OooO00o(oooOOO0OooO00o), C32460OooOooO.f116667OooO00o);
            }
            kotlin.jvm.internal.OooOOO0.OooO0o(objO0O0O00, "when (val declaration = … $declaration\")\n        }");
            interfaceC32577OoooO0 = (InterfaceC32577OoooO0) objO0O0O00;
        }
        this.f117079OooOoO0 = interfaceC32577OoooO0;
    }

    public static OooOOO0 OooO00o(InterfaceC32596OooO0o0 interfaceC32596OooO0o0) {
        Class<?> clsOooOO0 = C32585OoooOoo.OooOO0(interfaceC32596OooO0o0);
        OooOOO0 oooOOO0 = (OooOOO0) (clsOooOO0 != null ? C24217OooO0O0.OooO0oO(clsOooOO0) : null);
        if (oooOOO0 != null) {
            return oooOOO0;
        }
        throw new C32579OoooO0O("Type parameter container is not resolved: " + interfaceC32596OooO0o0.OooO0Oo());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C32578OoooO00)) {
            return false;
        }
        C32578OoooO00 c32578OoooO00 = (C32578OoooO00) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f117079OooOoO0, c32578OoooO00.f117079OooOoO0) && getName().equals(c32578OoooO00.getName());
    }

    @Override // oO0O0O0.InterfaceC32551OooOOOo
    public final InterfaceC32598OooO0oo getDescriptor() {
        return this.f117078OooOo0o;
    }

    @Override // oOoo0.InterfaceC34608OooOOo0
    public final String getName() {
        String strOooO0O0 = this.f117078OooOo0o.getName().OooO0O0();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0O0, "descriptor.name.asString()");
        return strOooO0O0;
    }

    @Override // oOoo0.InterfaceC34608OooOOo0
    public final List<InterfaceC34606OooOOOo> getUpperBounds() {
        InterfaceC34602OooOO0o<Object> interfaceC34602OooOO0o = f117076OooOoO[0];
        Object objInvoke = this.f117077OooOo.invoke();
        kotlin.jvm.internal.OooOOO0.OooO0o(objInvoke, "<get-upperBounds>(...)");
        return (List) objInvoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (this.f117079OooOoO0.hashCode() * 31);
    }

    public final String toString() {
        EnumC34609OooOOoo enumC34609OooOOoo;
        StringBuilder sb = new StringBuilder();
        int iOooO00o = o0OoOo0.OooO00o(this.f117078OooOo0o.OooOo0());
        if (iOooO00o == 0) {
            enumC34609OooOOoo = EnumC34609OooOOoo.f123979OooOo0o;
        } else if (iOooO00o == 1) {
            enumC34609OooOOoo = EnumC34609OooOOoo.f123978OooOo;
        } else {
            if (iOooO00o != 2) {
                throw new C32442OooOO0o();
            }
            enumC34609OooOOoo = EnumC34609OooOOoo.f123981OooOoO0;
        }
        int iOrdinal = enumC34609OooOOoo.ordinal();
        if (iOrdinal == 0) {
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        } else if (iOrdinal == 1) {
            sb.append("in ");
        } else {
            if (iOrdinal != 2) {
                throw new C32442OooOO0o();
            }
            sb.append("out ");
        }
        sb.append(getName());
        return sb.toString();
    }
}
