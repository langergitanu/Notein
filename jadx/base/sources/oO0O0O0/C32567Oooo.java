package oO0O0O0;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o0OoOo0;
import Oooo0oO.C21053Oooo00o;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import o0000OOo.C24217OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32444OooOOO0;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O0O0.C32580OoooOO0;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32636OoooOoO;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0O0oO0.C32730OooO0Oo;
import oO0OOOO.C32944OooO0Oo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0Ooo.o00Oo0;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOoo0.C34607OooOOo;
import oOoo0.EnumC34609OooOOoo;
import oOoo0.InterfaceC34597OooO0o0;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: oO0O0O0.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32567Oooo implements kotlin.jvm.internal.OooOOO {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f117032OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C32580OoooOO0.OooO00o<Type> f117033OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC33320OooOoo f117034OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C32580OoooOO0.OooO00o f117035OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C32580OoooOO0.OooO00o f117036OooOoO0;

    /* JADX INFO: renamed from: oO0O0O0.Oooo$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<List<? extends C34607OooOOo>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.OooOOOO f117037OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(oO0O000o.OooO00o<? extends Type> oooO00o) {
            super(0);
            this.f117037OooOo = (kotlin.jvm.internal.OooOOOO) oooO00o;
        }

        @Override // oO0O000o.OooO00o
        public final List<? extends C34607OooOOo> invoke() {
            C34607OooOOo c34607OooOOo;
            C32567Oooo c32567Oooo = C32567Oooo.this;
            List<InterfaceC33348OooooOO> listO000000O = c32567Oooo.f117034OooOo0o.o000000O();
            if (listO000000O.isEmpty()) {
                return C34434OooOoO.f123453OooOo0o;
            }
            InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116633OooOo, new C32575Oooo0oo(c32567Oooo));
            List<InterfaceC33348OooooOO> list = listO000000O;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C34429OooOOo0.OooOOo();
                    throw null;
                }
                InterfaceC33348OooooOO interfaceC33348OooooOO = (InterfaceC33348OooooOO) obj;
                if (interfaceC33348OooooOO.OooO00o()) {
                    c34607OooOOo = C34607OooOOo.f123974OooO0OO;
                } else {
                    AbstractC33320OooOoo type = interfaceC33348OooooOO.getType();
                    kotlin.jvm.internal.OooOOO0.OooO0o(type, "typeProjection.type");
                    C32567Oooo c32567Oooo2 = new C32567Oooo(type, this.f117037OooOo != null ? new C32574Oooo0oO(c32567Oooo, i, interfaceC32440OooOO0OooO0O0) : null);
                    int iOooO00o = o0OoOo0.OooO00o(interfaceC33348OooooOO.OooO0OO());
                    if (iOooO00o == 0) {
                        c34607OooOOo = new C34607OooOOo(EnumC34609OooOOoo.f123979OooOo0o, c32567Oooo2);
                    } else if (iOooO00o == 1) {
                        c34607OooOOo = new C34607OooOOo(EnumC34609OooOOoo.f123978OooOo, c32567Oooo2);
                    } else {
                        if (iOooO00o != 2) {
                            throw new C32442OooOO0o();
                        }
                        c34607OooOOo = new C34607OooOOo(EnumC34609OooOOoo.f123981OooOoO0, c32567Oooo2);
                    }
                }
                arrayList.add(c34607OooOOo);
                i = i2;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: oO0O0O0.Oooo$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<InterfaceC34597OooO0o0> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC34597OooO0o0 invoke() {
            C32567Oooo c32567Oooo = C32567Oooo.this;
            return c32567Oooo.OooO(c32567Oooo.f117034OooOo0o);
        }
    }

    static {
        kotlin.jvm.internal.Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f117032OooOoOO = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32567Oooo.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C32567Oooo.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public C32567Oooo(AbstractC33320OooOoo type, oO0O000o.OooO00o<? extends Type> oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        this.f117034OooOo0o = type;
        C32580OoooOO0.OooO00o<Type> oooO00o2 = oooO00o instanceof C32580OoooOO0.OooO00o ? (C32580OoooOO0.OooO00o) oooO00o : null;
        this.f117033OooOo = oooO00o2 == null ? oooO00o != null ? C32580OoooOO0.OooO00o(null, oooO00o) : null : oooO00o2;
        this.f117036OooOoO0 = C32580OoooOO0.OooO00o(null, new OooO0O0());
        this.f117035OooOoO = C32580OoooOO0.OooO00o(null, new OooO00o(oooO00o));
    }

    public final InterfaceC34597OooO0o0 OooO(AbstractC33320OooOoo abstractC33320OooOoo) {
        AbstractC33320OooOoo type;
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0OO = abstractC33320OooOoo.o00000().OooO0OO();
        if (interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32596OooO0o0) {
            Class<?> clsOooOO0 = C32585OoooOoo.OooOO0((InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0OO);
            if (clsOooOO0 != null) {
                if (!clsOooOO0.isArray()) {
                    if (o00Oo0.OooO0o(abstractC33320OooOoo)) {
                        return new OooOOO0(clsOooOO0);
                    }
                    Class<? extends Object> cls = C32730OooO0Oo.f117670OooO0O0.get(clsOooOO0);
                    if (cls != null) {
                        clsOooOO0 = cls;
                    }
                    return new OooOOO0(clsOooOO0);
                }
                InterfaceC33348OooooOO interfaceC33348OooooOO = (InterfaceC33348OooooOO) oOo000Oo.OooOo.o0OoOo0(abstractC33320OooOoo.o000000O());
                if (interfaceC33348OooooOO == null || (type = interfaceC33348OooooOO.getType()) == null) {
                    return new OooOOO0(clsOooOO0);
                }
                InterfaceC34597OooO0o0 interfaceC34597OooO0o0OooO = OooO(type);
                if (interfaceC34597OooO0o0OooO != null) {
                    return new OooOOO0(Array.newInstance((Class<?>) C24217OooO0O0.OooO0Oo(C21053Oooo00o.OooO0Oo(interfaceC34597OooO0o0OooO)), 0).getClass());
                }
                throw new C32579OoooO0O("Cannot determine classifier for array element type: " + this);
            }
        } else {
            if (interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32637OoooOoo) {
                return new C32578OoooO00(null, (InterfaceC32637OoooOoo) interfaceC32598OooO0ooOooO0OO);
            }
            if (interfaceC32598OooO0ooOooO0OO instanceof InterfaceC32636OoooOoO) {
                throw new C32444OooOOO0("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    @Override // oOoo0.InterfaceC34606OooOOOo
    public final InterfaceC34597OooO0o0 OooO0O0() {
        InterfaceC34602OooOO0o<Object> interfaceC34602OooOO0o = f117032OooOoOO[0];
        return (InterfaceC34597OooO0o0) this.f117036OooOoO0.invoke();
    }

    @Override // kotlin.jvm.internal.OooOOO
    public final Type OooO0OO() {
        C32580OoooOO0.OooO00o<Type> oooO00o = this.f117033OooOo;
        if (oooO00o != null) {
            return oooO00o.invoke();
        }
        return null;
    }

    @Override // oOoo0.InterfaceC34606OooOOOo
    public final boolean OooO0oO() {
        return this.f117034OooOo0o.o00000O0();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C32567Oooo)) {
            return false;
        }
        C32567Oooo c32567Oooo = (C32567Oooo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f117034OooOo0o, c32567Oooo.f117034OooOo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(OooO0O0(), c32567Oooo.OooO0O0()) && getArguments().equals(c32567Oooo.getArguments());
    }

    @Override // oOoo0.InterfaceC34606OooOOOo
    public final List<C34607OooOOo> getArguments() {
        InterfaceC34602OooOO0o<Object> interfaceC34602OooOO0o = f117032OooOoOO[1];
        Object objInvoke = this.f117035OooOoO.invoke();
        kotlin.jvm.internal.OooOOO0.OooO0o(objInvoke, "<get-arguments>(...)");
        return (List) objInvoke;
    }

    public final int hashCode() {
        int iHashCode = this.f117034OooOo0o.hashCode() * 31;
        InterfaceC34597OooO0o0 interfaceC34597OooO0o0OooO0O0 = OooO0O0();
        return getArguments().hashCode() + ((iHashCode + (interfaceC34597OooO0o0OooO0O0 != null ? interfaceC34597OooO0o0OooO0O0.hashCode() : 0)) * 31);
    }

    public final String toString() {
        C32944OooO0Oo c32944OooO0Oo = C32581OoooOOO.f117086OooO00o;
        return C32581OoooOOO.OooO0Oo(this.f117034OooOo0o);
    }
}
