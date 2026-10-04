package Oooo0OO;

import OooOoOO.C20518OooO0OO;
import OooOoOO.C20529OooOOOO;
import OooOooO.C20738OooOOOo;
import Oooo0oO.o0000OO0;
import Oooo0oO.o00oO0O;
import OoooOOo.AbstractC21220Oooo00O;
import OoooOOo.C21210OooOo0o;
import OoooOOo.C21219Oooo000;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21293OooOO0;
import OooooOO.C21348Ooooo0o;
import Oooooo0.C21397OooO00o;
import Oooooo0.InterfaceC21402OooO0o0;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import o00000oO.C24121OooO00o;
import o00oO0O.C25508OooOoo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: Oooo0OO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20948OooO0O0 extends AbstractC20960OooOOOO implements o0000OO0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f60453OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final o00oO0O f60454OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f60455OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o00oO0O f60456OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C21210OooOo0o<C20738OooOOOo, C20956OooOO0O> f60457OooOoo0;

    /* JADX INFO: renamed from: Oooo0OO.OooO0O0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2", m80623f = "CommonRipple.kt", m80624l = {87}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C20956OooOO0O f60458OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f60459OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ C20738OooOOOo f60460OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C20948OooO0O0 f60461OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C20956OooOO0O c20956OooOO0O, C20948OooO0O0 c20948OooO0O0, C20738OooOOOo c20738OooOOOo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f60458OooOo = c20956OooOO0O;
            this.f60461OooOoO0 = c20948OooO0O0;
            this.f60460OooOoO = c20738OooOOOo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f60458OooOo, this.f60461OooOoO0, this.f60460OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f60459OooOo0o;
            C20738OooOOOo c20738OooOOOo = this.f60460OooOoO;
            C20948OooO0O0 c20948OooO0O0 = this.f60461OooOoO0;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C20956OooOO0O c20956OooOO0O = this.f60458OooOo;
                    this.f60459OooOo0o = 1;
                    if (c20956OooOO0O.OooO00o(this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                c20948OooO0O0.f60457OooOoo0.remove(c20738OooOOOo);
                return C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                c20948OooO0O0.f60457OooOoo0.remove(c20738OooOOOo);
                throw th;
            }
        }
    }

    public C20948OooO0O0() {
        throw null;
    }

    public C20948OooO0O0(boolean z, float f, o00oO0O o00oo0o, o00oO0O o00oo0o2) {
        super(o00oo0o2, z);
        this.f60453OooOo = z;
        this.f60455OooOoO0 = f;
        this.f60454OooOoO = o00oo0o;
        this.f60456OooOoOO = o00oo0o2;
        this.f60457OooOoo0 = new C21210OooOo0o<>();
    }

    @Override // Oooo0oO.o0000OO0
    public final void OooO0o0() {
    }

    @Override // Oooo0oO.o0000OO0
    public final void Oooo0OO() {
        this.f60457OooOoo0.clear();
    }

    @Override // Oooo0oO.o0000OO0
    public final void Oooo0oO() {
        this.f60457OooOoo0.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OooOoo0.oo000o
    public final void OoooO0(C25508OooOoo c25508OooOoo) {
        C20948OooO0O0 c20948OooO0O0 = this;
        C25508OooOoo c25508OooOoo2 = c25508OooOoo;
        long j = ((C21348Ooooo0o) c20948OooO0O0.f60454OooOoO.getValue()).f61768OooO00o;
        c25508OooOoo2.Ooooo0o();
        c20948OooO0O0.o0O0O00(c25508OooOoo2, c20948OooO0O0.f60455OooOoO0, j);
        Object it = c20948OooO0O0.f60457OooOoo0.f61520OooOo.iterator();
        while (((AbstractC21220Oooo00O) it).hasNext()) {
            C20956OooOO0O c20956OooOO0O = (C20956OooOO0O) ((Map.Entry) ((C21219Oooo000) it).next()).getValue();
            float f = ((C20953OooO0oO) c20948OooO0O0.f60456OooOoOO.getValue()).f60475OooO0Oo;
            if (f != 0.0f) {
                long jOooO0O0 = C21348Ooooo0o.OooO0O0(f, j);
                c20956OooOO0O.getClass();
                Float f2 = c20956OooOO0O.f60488OooO0Oo;
                C21397OooO00o c21397OooO00o = c25508OooOoo2.f86983OooOo0o;
                if (f2 == null) {
                    long jOooOOo0 = c21397OooO00o.OooOOo0();
                    float f3 = C20957OooOO0o.f60496OooO00o;
                    c20956OooOO0O.f60488OooO0Oo = Float.valueOf(Math.max(C21293OooOO0.OooO0Oo(jOooOOo0), C21293OooOO0.OooO0O0(jOooOOo0)) * 0.3f);
                }
                Float f4 = c20956OooOO0O.f60490OooO0o0;
                boolean z = c20956OooOO0O.f60487OooO0OO;
                if (f4 == null) {
                    float f5 = c20956OooOO0O.f60486OooO0O0;
                    c20956OooOO0O.f60490OooO0o0 = Float.isNaN(f5) ? Float.valueOf(C20957OooOO0o.OooO00o(c25508OooOoo2, z, c21397OooO00o.OooOOo0())) : Float.valueOf(c25508OooOoo2.o0OOO0o(f5));
                }
                if (c20956OooOO0O.f60485OooO00o == null) {
                    c20956OooOO0O.f60485OooO00o = new C21290OooO0o0(c21397OooO00o.OoooOoo());
                }
                if (c20956OooOO0O.f60489OooO0o == null) {
                    c20956OooOO0O.f60489OooO0o = new C21290OooO0o0(C21289OooO0o.OooO00o(C21293OooOO0.OooO0Oo(c21397OooO00o.OooOOo0()) / 2.0f, C21293OooOO0.OooO0O0(c21397OooO00o.OooOOo0()) / 2.0f));
                }
                float fFloatValue = (!((Boolean) c20956OooOO0O.f60495OooOO0o.getValue()).booleanValue() || ((Boolean) c20956OooOO0O.f60494OooOO0O.getValue()).booleanValue()) ? c20956OooOO0O.f60491OooO0oO.OooO0OO().floatValue() : 1.0f;
                Float f6 = c20956OooOO0O.f60488OooO0Oo;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(f6);
                float fFloatValue2 = f6.floatValue();
                Float f7 = c20956OooOO0O.f60490OooO0o0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(f7);
                float fOooO00o = C24121OooO00o.OooO00o(fFloatValue2, f7.floatValue(), c20956OooOO0O.f60492OooO0oo.OooO0OO().floatValue());
                C21290OooO0o0 c21290OooO0o0 = c20956OooOO0O.f60485OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c21290OooO0o0);
                float fOooO0OO = C21290OooO0o0.OooO0OO(c21290OooO0o0.f61722OooO00o);
                C21290OooO0o0 c21290OooO0o02 = c20956OooOO0O.f60489OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c21290OooO0o02);
                float fOooO0OO2 = C21290OooO0o0.OooO0OO(c21290OooO0o02.f61722OooO00o);
                C20518OooO0OO<Float, C20529OooOOOO> c20518OooO0OO = c20956OooOO0O.f60484OooO;
                float fOooO00o2 = C24121OooO00o.OooO00o(fOooO0OO, fOooO0OO2, c20518OooO0OO.OooO0OO().floatValue());
                C21290OooO0o0 c21290OooO0o03 = c20956OooOO0O.f60485OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c21290OooO0o03);
                float fOooO0Oo = C21290OooO0o0.OooO0Oo(c21290OooO0o03.f61722OooO00o);
                C21290OooO0o0 c21290OooO0o04 = c20956OooOO0O.f60489OooO0o;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c21290OooO0o04);
                long jOooO00o = C21289OooO0o.OooO00o(fOooO00o2, C24121OooO00o.OooO00o(fOooO0Oo, C21290OooO0o0.OooO0Oo(c21290OooO0o04.f61722OooO00o), c20518OooO0OO.OooO0OO().floatValue()));
                long jOooO0O02 = C21348Ooooo0o.OooO0O0(C21348Ooooo0o.OooO0Oo(jOooO0O0) * fFloatValue, jOooO0O0);
                if (z) {
                    float fOooO0Oo2 = C21293OooOO0.OooO0Oo(c21397OooO00o.OooOOo0());
                    float fOooO0O0 = C21293OooOO0.OooO0O0(c21397OooO00o.OooOOo0());
                    C21397OooO00o.OooO0O0 oooO0O0 = c21397OooO00o.f61911OooOo;
                    long jOooO0O03 = oooO0O0.OooO0O0();
                    oooO0O0.OooO00o().OooOOo0();
                    oooO0O0.f61919OooO00o.OooO00o(0.0f, 0.0f, fOooO0Oo2, fOooO0O0, 1);
                    InterfaceC21402OooO0o0.OoooOoO(c25508OooOoo, jOooO0O02, fOooO00o, jOooO00o, 120);
                    oooO0O0.OooO00o().OooOO0o();
                    oooO0O0.OooO0OO(jOooO0O03);
                } else {
                    InterfaceC21402OooO0o0.OoooOoO(c25508OooOoo, jOooO0O02, fOooO00o, jOooO00o, 120);
                }
            }
            c20948OooO0O0 = this;
            c25508OooOoo2 = c25508OooOoo;
        }
    }

    @Override // Oooo0OO.AbstractC20960OooOOOO
    public final void o000000O(C20738OooOOOo interaction) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interaction, "interaction");
        C20956OooOO0O c20956OooOO0O = this.f60457OooOoo0.get(interaction);
        if (c20956OooOO0O != null) {
            c20956OooOO0O.f60495OooOO0o.setValue(Boolean.TRUE);
            c20956OooOO0O.f60493OooOO0.OoooO00(C32460OooOooO.f116667OooO00o);
        }
    }

    @Override // Oooo0OO.AbstractC20960OooOOOO
    public final void o0Oo0oo(C20738OooOOOo interaction, InterfaceC33636Oooo00o scope) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interaction, "interaction");
        kotlin.jvm.internal.OooOOO0.OooO0oO(scope, "scope");
        C21210OooOo0o<C20738OooOOOo, C20956OooOO0O> c21210OooOo0o = this.f60457OooOoo0;
        Iterator it = c21210OooOo0o.f61520OooOo.iterator();
        while (it.hasNext()) {
            C20956OooOO0O c20956OooOO0O = (C20956OooOO0O) ((Map.Entry) it.next()).getValue();
            c20956OooOO0O.f60495OooOO0o.setValue(Boolean.TRUE);
            c20956OooOO0O.f60493OooOO0.OoooO00(C32460OooOooO.f116667OooO00o);
        }
        boolean z = this.f60453OooOo;
        C20956OooOO0O c20956OooOO0O2 = new C20956OooOO0O(z ? new C21290OooO0o0(interaction.f59580OooO00o) : null, this.f60455OooOoO0, z);
        c21210OooOo0o.put(interaction, c20956OooOO0O2);
        C33609OooO0oo.OooO0OO(scope, null, null, new OooO00o(c20956OooOO0O2, this, interaction, null), 3);
    }
}
