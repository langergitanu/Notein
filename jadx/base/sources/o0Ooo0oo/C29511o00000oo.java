package o0Ooo0oo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: renamed from: o0Ooo0oo.o00000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveFavoriteToolBoxOrientation$1", m80623f = "PenBarViewModel.kt", m80624l = {1795, 1602}, m80625m = "invokeSuspend")
public final class C29511o00000oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104671OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f104672OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f104673OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f104674OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104675OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f104676OooOoo0;

    /* JADX INFO: renamed from: o0Ooo0oo.o00000oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveFavoriteToolBoxOrientation$1$1$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f104677OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104678OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104677OooOo = i;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f104677OooOo, continuation);
            oooO00o.f104678OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            ((C24334OooO0O0) this.f104678OooOo0o).OooO0oO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75136o00oO0O, new Integer(this.f104677OooOo));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29511o00000oo(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, int i, Continuation<? super C29511o00000oo> continuation) {
        super(2, continuation);
        this.f104675OooOoOO = oooO0O0;
        this.f104676OooOoo0 = i;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29511o00000oo(this.f104675OooOoOO, this.f104676OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29511o00000oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        int i;
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f104673OooOoO;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O02 = this.f104675OooOoOO;
                interfaceC33895OooO00o = oooO0O02.f75202o00o0O;
                this.f104672OooOo0o = interfaceC33895OooO00o;
                this.f104671OooOo = oooO0O02;
                i = this.f104676OooOoo0;
                this.f104674OooOoO0 = i;
                this.f104673OooOoO = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                    oooO0O0 = oooO0O02;
                }
                return enumC32485OooO00o;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = this.f104672OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th) {
                    th = th;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            int i3 = this.f104674OooOoO0;
            oooO0O0 = this.f104671OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f104672OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            i = i3;
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = oooO0O0.f75146OooOO0;
            OooO00o oooO00o = new OooO00o(i, null);
            this.f104672OooOo0o = interfaceC33895OooO00o;
            this.f104671OooOo = null;
            this.f104673OooOoO = 2;
            if (C24332OooO.OooO00o(oooOO02, oooO00o, this) != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } catch (Throwable th2) {
            th = th2;
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
