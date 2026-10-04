package o0o0OoOO;

import android.content.Context;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o0Oo0O00.C28051OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0OoOO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$initFlatNoteListSwitch$2$1", m80623f = "DebugFragment.kt", m80624l = {304}, m80625m = "invokeSuspend")
public final class C30695OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ boolean f109777OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109778OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ DebugFragment f109779OooOoO0;

    /* JADX INFO: renamed from: o0o0OoOO.OooOOOO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.DebugFragment$initFlatNoteListSwitch$2$1$1", m80623f = "DebugFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ boolean f109780OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f109781OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f109780OooOo = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f109780OooOo, continuation);
            oooO00o.f109781OooOo0o = obj;
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
            C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f109781OooOo0o;
            AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
            c24334OooO0O0.OooO0oO(DebugFragment.f79020Oooo0OO, Boolean.valueOf(this.f109780OooOo));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30695OooOOOO(DebugFragment debugFragment, Continuation continuation, boolean z) {
        super(2, continuation);
        this.f109777OooOo = z;
        this.f109779OooOoO0 = debugFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30695OooOOOO(this.f109779OooOoO0, continuation, this.f109777OooOo);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30695OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109778OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "DebugFragment", "DebugFragment flat note list switch isChecked: ");
            boolean z = this.f109777OooOo;
            c20358OooO00o.OooO0o0(androidx.appcompat.app.OooOOO.OooO00o(sbOooO0O0, ".", z), new Object[0]);
            Context contextRequireContext = this.f109779OooOoO0.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            o0000o0O.OooOO0<AbstractC24338OooO0o0> oooOO0OooO00o = C28051OooO00o.OooO00o(contextRequireContext);
            OooO00o oooO00o = new OooO00o(z, null);
            this.f109778OooOo0o = 1;
            if (C24332OooO.OooO00o(oooOO0OooO00o, oooO00o, this) == enumC32485OooO00o) {
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
