package o0o00oO;

import kotlin.coroutines.Continuation;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o0OOOoo.C27205OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o00oO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateViewModel$swapLanguage$1", m80623f = "TranslateViewModel.kt", m80624l = {180}, m80625m = "invokeSuspend")
public final class C29980OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C29970OooOOo f106501OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f106502OooOo0o;

    /* JADX INFO: renamed from: o0o00oO.OooOoo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateViewModel$swapLanguage$1$1", m80623f = "TranslateViewModel.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C29970OooOOo f106503OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f106504OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C29970OooOOo c29970OooOOo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f106503OooOo = c29970OooOOo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f106503OooOo, continuation);
            oooO00o.f106504OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f106504OooOo0o;
            C29970OooOOo c29970OooOOo = this.f106503OooOo;
            int iIntValue = ((Number) c29970OooOOo.f106433OooO.f121747OooOo0o.getValue()).intValue();
            c24334OooO0O0.OooO0oO(C27205OooO0OO.f95014OooOOO0, new Integer(((Number) c29970OooOOo.f106440OooOO0O.f121747OooOo0o.getValue()).intValue() + 1));
            c24334OooO0O0.OooO0oO(C27205OooO0OO.f95013OooOOO, new Integer(iIntValue - 1));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29980OooOoo(C29970OooOOo c29970OooOOo, Continuation<? super C29980OooOoo> continuation) {
        super(2, continuation);
        this.f106501OooOo = c29970OooOOo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C29980OooOoo(this.f106501OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C29980OooOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106502OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C29970OooOOo c29970OooOOo = this.f106501OooOo;
            OooO00o oooO00o = new OooO00o(c29970OooOOo, null);
            this.f106502OooOo0o = 1;
            if (C24332OooO.OooO00o(c29970OooOOo.f106437OooO0oO, oooO00o, this) == enumC32485OooO00o) {
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
