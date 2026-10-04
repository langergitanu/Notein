package o0o0OoO;

import com.orion.notein.App;
import com.orion.notein.p607ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment;
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

/* JADX INFO: renamed from: o0o0OoO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$initRows$3$1", m80623f = "ToolAssistLineAndShapesFragment.kt", m80624l = {82}, m80625m = "invokeSuspend")
public final class C30658OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ToolAssistLineAndShapesFragment f109699OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109700OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f109701OooOoO0;

    /* JADX INFO: renamed from: o0o0OoO.OooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.assistlineandshapes.ToolAssistLineAndShapesFragment$initRows$3$1$1", m80623f = "ToolAssistLineAndShapesFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ boolean f109702OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f109703OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f109702OooOo = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f109702OooOo, continuation);
            oooO00o.f109703OooOo0o = obj;
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
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f109703OooOo0o;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = App.f69543OooOoo0;
            c24334OooO0O0.OooO0oO(App.f69575Ooooooo, Boolean.valueOf(this.f109702OooOo));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30658OooO(ToolAssistLineAndShapesFragment toolAssistLineAndShapesFragment, boolean z, Continuation<? super C30658OooO> continuation) {
        super(2, continuation);
        this.f109699OooOo = toolAssistLineAndShapesFragment;
        this.f109701OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30658OooO(this.f109699OooOo, this.f109701OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30658OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109700OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0000o0O.OooOO0 oooOO02 = (o0000o0O.OooOO0) this.f109699OooOo.f78996OooOoo.getValue();
            OooO00o oooO00o = new OooO00o(this.f109701OooOoO0, null);
            this.f109700OooOo0o = 1;
            if (C24332OooO.OooO00o(oooOO02, oooO00o, this) == enumC32485OooO00o) {
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
