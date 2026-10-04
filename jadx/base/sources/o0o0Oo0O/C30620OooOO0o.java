package o0o0Oo0O;

import kotlin.coroutines.Continuation;
import o0OOo0o.C27501o00Ooo0O;
import o0OOo0o.o0O00o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o000OOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0Oo0O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsViewModel$resetToDefaults$2", m80623f = "GlobalSettingsViewModel.kt", m80624l = {41}, m80625m = "invokeSuspend")
public final class C30620OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C30623OooOOOO f109561OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109562OooOo0o;

    /* JADX INFO: renamed from: o0o0Oo0O.OooOO0o$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsViewModel$resetToDefaults$2$1", m80623f = "GlobalSettingsViewModel.kt", m80624l = {42}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30623OooOOOO f109563OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f109564OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C30623OooOOOO c30623OooOOOO, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f109563OooOo = c30623OooOOOO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f109563OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f109564OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C30623OooOOOO c30623OooOOOO = this.f109563OooOo;
                this.f109564OooOo0o = 1;
                o0O00o0 o0o00o02 = c30623OooOOOO.f109574OooO0o0;
                o0o00o02.getClass();
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27501o00Ooo0O(o0o00o02, null), this);
                if (objOooO0o != obj2) {
                    objOooO0o = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30620OooOO0o(C30623OooOOOO c30623OooOOOO, Continuation<? super C30620OooOO0o> continuation) {
        super(2, continuation);
        this.f109561OooOo = c30623OooOOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30620OooOO0o(this.f109561OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30620OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109562OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o000OOo o000ooo2 = o000OOo.f121371OooOo;
            OooO00o oooO00o = new OooO00o(this.f109561OooOo, null);
            this.f109562OooOo0o = 1;
            if (C33609OooO0oo.OooO0o(o000ooo2, oooO00o, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
