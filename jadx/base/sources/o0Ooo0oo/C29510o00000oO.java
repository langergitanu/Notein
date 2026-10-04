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

/* JADX INFO: renamed from: o0Ooo0oo.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveFavoriteToolBoxLocationBias$1", m80623f = "PenBarViewModel.kt", m80624l = {1795, 1590}, m80625m = "invokeSuspend")
public final class C29510o00000oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104659OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC33895OooO00o f104660OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f104661OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f104662OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f104663OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ float f104664OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104665OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ float f104666OooOooO;

    /* JADX INFO: renamed from: o0Ooo0oo.o00000oO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.penbar.PenBarViewModel$saveFavoriteToolBoxLocationBias$1$1$1", m80623f = "PenBarViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f104667OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f104668OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ float f104669OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ float f104670OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, float f, float f2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f104667OooOo = oooO0O0;
            this.f104670OooOoO0 = f;
            this.f104669OooOoO = f2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f104667OooOo, this.f104670OooOoO0, this.f104669OooOoO, continuation);
            oooO00o.f104668OooOo0o = obj;
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
            ((C24334OooO0O0) this.f104668OooOo0o).OooO0oO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0.f75138o0ooOO0, this.f104667OooOo.f75150OooOOO0.toJson(new Float[]{new Float(this.f104670OooOoO0), new Float(this.f104669OooOoO)}));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29510o00000oO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0, float f, float f2, Continuation<? super C29510o00000oO> continuation) {
        super(2, continuation);
        this.f104665OooOoo0 = oooO0O0;
        this.f104664OooOoo = f;
        this.f104666OooOooO = f2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29510o00000oO(this.f104665OooOoo0, this.f104664OooOoo, this.f104666OooOooO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29510o00000oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0;
        InterfaceC33895OooO00o interfaceC33895OooO00o;
        float f;
        float f2;
        InterfaceC33895OooO00o interfaceC33895OooO00o2;
        Throwable th;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f104663OooOoOO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                oooO0O0 = this.f104665OooOoo0;
                interfaceC33895OooO00o = oooO0O0.f75202o00o0O;
                this.f104660OooOo0o = interfaceC33895OooO00o;
                this.f104659OooOo = oooO0O0;
                float f3 = this.f104664OooOoo;
                this.f104662OooOoO0 = f3;
                float f4 = this.f104666OooOooO;
                this.f104661OooOoO = f4;
                this.f104663OooOoOO = 1;
                if (interfaceC33895OooO00o.OooO00o(this) != enumC32485OooO00o) {
                    f = f3;
                    f2 = f4;
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33895OooO00o2 = this.f104660OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    return C32460OooOooO.f116667OooO00o;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC33895OooO00o2.OooOOO0(null);
                    throw th;
                }
            }
            f2 = this.f104661OooOoO;
            f = this.f104662OooOoO0;
            oooO0O0 = this.f104659OooOo;
            InterfaceC33895OooO00o interfaceC33895OooO00o3 = this.f104660OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            interfaceC33895OooO00o = interfaceC33895OooO00o3;
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO02 = oooO0O0.f75146OooOO0;
            OooO00o oooO00o = new OooO00o(oooO0O0, f, f2, null);
            this.f104660OooOo0o = interfaceC33895OooO00o;
            this.f104659OooOo = null;
            this.f104663OooOoOO = 2;
            if (C24332OooO.OooO00o(oooOO02, oooO00o, this) != enumC32485OooO00o) {
                interfaceC33895OooO00o2 = interfaceC33895OooO00o;
                C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                interfaceC33895OooO00o2.OooOOO0(null);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        } catch (Throwable th3) {
            interfaceC33895OooO00o2 = interfaceC33895OooO00o;
            th = th3;
            interfaceC33895OooO00o2.OooOOO0(null);
            throw th;
        }
    }
}
