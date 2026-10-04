package ooo0o;

import java.util.HashMap;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O0O0o.C32593OooOOo;
import oO0O0OO.o000oOoO;
import oO0O0o0O.C32721OooO0o;
import oO0OO0Oo.C32917OooO0O0;
import oO0OOO.C32934OooO0o0;
import oO0OOO.C32936OooO0oo;
import oO0OOo.AbstractC33038OooO0oO;
import oO0OOo.C33035OooO0Oo;
import oO0OOo.C33046OooOo0O;
import oO0OOo.C33048OooOoO;
import oO0OOo.C33049OooOoO0;
import oO0OOo.C33050OooOoOO;
import oO0OOo.C33052OooOoo0;
import oO0OoO0.AbstractC33252OooOooO;
import oO0OoO0.EnumC33234OooO0OO;
import oO0OoO0.InterfaceC33235OooO0Oo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33369OooO0oo;
import ooo0o.AbstractC35189OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO00o<A, C> extends AbstractC35189OooO0Oo<A, C20384OooO00o<? extends A, ? extends C>> implements InterfaceC33235OooO0Oo<A, C> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33369OooO0oo<InterfaceC35196OooOOo0, C20384OooO00o<A, C>> f126316OooO0O0;

    /* JADX INFO: renamed from: ooo0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20384OooO00o<A, C> extends AbstractC35189OooO0Oo.OooO00o<A> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashMap f126317OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HashMap f126318OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashMap f126319OooO0OO;

        public C20384OooO00o(HashMap map, HashMap map2, HashMap map3) {
            this.f126317OooO00o = map;
            this.f126318OooO0O0 = map2;
            this.f126319OooO0OO = map3;
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<C20384OooO00o<? extends A, ? extends C>, C35197OooOOoo, C> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f126320OooOo0o = new OooO0O0(2);

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Object obj, C35197OooOOoo c35197OooOOoo) {
            C20384OooO00o loadConstantFromProperty = (C20384OooO00o) obj;
            C35197OooOOoo it = c35197OooOOoo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(loadConstantFromProperty, "$this$loadConstantFromProperty");
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return loadConstantFromProperty.f126319OooO0OO.get(it);
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<C20384OooO00o<? extends A, ? extends C>, C35197OooOOoo, C> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f126321OooOo0o = new OooO0OO(2);

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Object obj, C35197OooOOoo c35197OooOOoo) {
            C20384OooO00o loadConstantFromProperty = (C20384OooO00o) obj;
            C35197OooOOoo it = c35197OooOOoo;
            kotlin.jvm.internal.OooOOO0.OooO0oO(loadConstantFromProperty, "$this$loadConstantFromProperty");
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return loadConstantFromProperty.f126318OooO0O0.get(it);
        }
    }

    public OooO00o(C33361OooO0Oo c33361OooO0Oo, C32721OooO0o c32721OooO0o) {
        super(c32721OooO0o);
        this.f126316OooO0O0 = c33361OooO0Oo.OooO0Oo(new ooo0o.OooO0OO(this));
    }

    @Override // oO0OoO0.InterfaceC33235OooO0Oo
    public final C OooO(AbstractC33252OooOooO abstractC33252OooOooO, oO0OO00.OooOOO0 proto, AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        return OooOo00(abstractC33252OooOooO, proto, EnumC33234OooO0OO.f120247OooOo, abstractC33320OooOoo, OooO0OO.f126321OooOo0o);
    }

    @Override // oO0OoO0.InterfaceC33235OooO0Oo
    public final C OooO0Oo(AbstractC33252OooOooO abstractC33252OooOooO, oO0OO00.OooOOO0 proto, AbstractC33320OooOoo abstractC33320OooOoo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        return OooOo00(abstractC33252OooOooO, proto, EnumC33234OooO0OO.f120250OooOoO0, abstractC33320OooOoo, OooO0O0.f126320OooOo0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C OooOo00(AbstractC33252OooOooO abstractC33252OooOooO, oO0OO00.OooOOO0 oooOOO0, EnumC33234OooO0OO enumC33234OooO0OO, AbstractC33320OooOoo abstractC33320OooOoo, InterfaceC32508OooOOOo<? super C20384OooO00o<? extends A, ? extends C>, ? super C35197OooOOoo, ? extends C> interfaceC32508OooOOOo) {
        C cInvoke;
        InterfaceC35196OooOOo0 interfaceC35196OooOOo0OooOOOO = OooOOOO(abstractC33252OooOooO, true, true, C32917OooO0O0.f118783OooOoOO.OooO0OO(oooOOO0.f118322OooOoO), C32936OooO0oo.OooO0Oo(oooOOO0));
        if (interfaceC35196OooOOo0OooOOOO == null) {
            if (abstractC33252OooOooO instanceof AbstractC33252OooOooO.OooO00o) {
                o000oOoO o000oooo2 = ((AbstractC33252OooOooO.OooO00o) abstractC33252OooOooO).f120348OooO0OO;
                C35195OooOOo c35195OooOOo = o000oooo2 instanceof C35195OooOOo ? (C35195OooOOo) o000oooo2 : null;
                interfaceC35196OooOOo0OooOOOO = c35195OooOOo != null ? c35195OooOOo.f126382OooO0O0 : null;
            }
        }
        if (interfaceC35196OooOOo0OooOOOO != null) {
            C32934OooO0o0 c32934OooO0o0 = interfaceC35196OooOOo0OooOOOO.OooO0O0().f116741OooO0O0;
            C32934OooO0o0 version = OooOO0.f126364OooO0o0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(version, "version");
            C35197OooOOoo c35197OooOOooOooOOO = AbstractC35189OooO0Oo.OooOOO(oooOOO0, abstractC33252OooOooO.f120346OooO00o, abstractC33252OooOooO.f120347OooO0O0, enumC33234OooO0OO, c32934OooO0o0.OooO00o(version.f118753OooO0O0, version.f118754OooO0OO, version.f118755OooO0Oo));
            if (c35197OooOOooOooOOO != null && (cInvoke = interfaceC32508OooOOOo.invoke((Object) ((C33361OooO0Oo.OooOO0O) this.f126316OooO0O0).invoke(interfaceC35196OooOOo0OooOOOO), c35197OooOOooOooOOO)) != null) {
                if (C32593OooOOo.OooO00o(abstractC33320OooOoo)) {
                    cInvoke = (C) ((AbstractC33038OooO0oO) cInvoke);
                    if (cInvoke instanceof C33035OooO0Oo) {
                        return (C) new C33049OooOoO0(((Number) ((C33035OooO0Oo) cInvoke).f119483OooO00o).byteValue());
                    }
                    if (cInvoke instanceof C33046OooOo0O) {
                        return (C) new C33052OooOoo0(((Number) ((C33046OooOo0O) cInvoke).f119483OooO00o).shortValue());
                    }
                    if (cInvoke instanceof oO0OOo.OooOOO) {
                        return (C) new C33048OooOoO(((Number) ((oO0OOo.OooOOO) cInvoke).f119483OooO00o).intValue());
                    }
                    if (cInvoke instanceof oO0OOo.OooOo00) {
                        return (C) new C33050OooOoOO(((Number) ((oO0OOo.OooOo00) cInvoke).f119483OooO00o).longValue());
                    }
                }
                return (C) cInvoke;
            }
        }
        return null;
    }
}
