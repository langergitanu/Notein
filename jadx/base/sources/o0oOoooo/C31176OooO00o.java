package o0oOoooo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.wizard.WizardFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0000o0O.OooOO0;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24332OooO;
import o0000oOO.C24334OooO0O0;
import o000o0O0.C24564OooO00o;
import o000o0O0.C24587OooOoo;
import o0O0oooO.C26256OooO0o;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26322o0000o;
import o0OOOoo.C27205OooO0OO;
import o0Oo00o.C28026OooO0OO;
import o0Oo0O00.C28051OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOoooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.wizard.WizardFragment$onBtnNextClicked$1", m80623f = "WizardFragment.kt", m80624l = {86, 96}, m80625m = "invokeSuspend")
public final class C31176OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ WizardFragment f111200OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f111201OooOo0o;

    /* JADX INFO: renamed from: o0oOoooo.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.wizard.WizardFragment$onBtnNextClicked$1$1", m80623f = "WizardFragment.kt", m80624l = {91}, m80625m = "invokeSuspend")
    public static final class C20159OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ WizardFragment f111202OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f111203OooOo0o;

        /* JADX INFO: renamed from: o0oOoooo.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.wizard.WizardFragment$onBtnNextClicked$1$1$1", m80623f = "WizardFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C20160OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f111204OooOo0o;

            public C20160OooO00o() {
                throw null;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C20160OooO00o c20160OooO00o = new C20160OooO00o(2, continuation);
                c20160OooO00o.f111204OooOo0o = obj;
                return c20160OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
                return ((C20160OooO00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f111204OooOo0o;
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = C27205OooO0OO.f95002OooO00o;
                c24334OooO0O0.OooO0oO(C27205OooO0OO.f95018OooOOo0, Boolean.FALSE);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20159OooO00o(WizardFragment wizardFragment, Continuation<? super C20159OooO00o> continuation) {
            super(2, continuation);
            this.f111202OooOo = wizardFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C20159OooO00o(this.f111202OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super AbstractC24338OooO0o0> continuation) {
            return ((C20159OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f111203OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                WizardFragment wizardFragment = this.f111202OooOo;
                Context contextRequireContext = wizardFragment.requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                if (!C26256OooO0o.OooO00o(contextRequireContext)) {
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) wizardFragment.f80183OooOo0o.getValue();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c26320o0000OoO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C26322o0000o(null, c26320o0000OoO), 2);
                }
                Context context = wizardFragment.getContext();
                if (context == null) {
                    return null;
                }
                OooOO0<AbstractC24338OooO0o0> oooOO0OooO0O0 = C28051OooO00o.OooO0O0(context);
                C20160OooO00o c20160OooO00o = new C20160OooO00o(2, null);
                this.f111203OooOo0o = 1;
                obj = C24332OooO.OooO00o(oooOO0OooO0O0, c20160OooO00o, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return (AbstractC24338OooO0o0) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31176OooO00o(WizardFragment wizardFragment, Continuation<? super C31176OooO00o> continuation) {
        super(2, continuation);
        this.f111200OooOo = wizardFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31176OooO00o(this.f111200OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31176OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r14 == r0) goto L15;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f111201OooOo0o;
        WizardFragment wizardFragment = this.f111200OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C20159OooO00o c20159OooO00o = new C20159OooO00o(wizardFragment, null);
            this.f111201OooOo0o = 1;
            if (C33609OooO0oo.OooO0o(executorC33873OooO0O0, c20159OooO00o, this) != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            if (((Boolean) obj).booleanValue()) {
                C21030OooOO0o.OooO0OO(wizardFragment).OooOOo(R.id.noteListContainerFragment, false);
            } else {
                C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(wizardFragment), new C24564OooO00o(R.id.action_wizardFragment_to_firebaseUserAuthFragment), new C24587OooOoo(false, false, R.id.noteListContainerFragment, false, false, -1, -1, -1, -1));
            }
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) wizardFragment.f80183OooOo0o.getValue();
        this.f111201OooOo0o = 2;
        obj = c26320o0000OoO.OooO0oo(this);
    }
}
