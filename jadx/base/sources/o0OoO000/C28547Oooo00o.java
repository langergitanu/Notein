package o0OoO000;

import OooooOO.C21335Oooo0oO;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21985OooOoO0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseLoginConfirmFragment;
import kotlin.coroutines.Continuation;
import o0O0oooO.C26320o0000OoO;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginConfirmFragment$loginCompleteAndCheckUnboundPurchases$1", m80623f = "FirebaseLoginConfirmFragment.kt", m80624l = {315, 401}, m80625m = "invokeSuspend")
public final class C28547Oooo00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FirebaseLoginConfirmFragment f101185OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101186OooOo0o;

    /* JADX INFO: renamed from: o0OoO000.Oooo00o$OooO00o */
    public static final class OooO00o implements View.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ FirebaseLoginConfirmFragment f101187OooOo0o;

        public OooO00o(FirebaseLoginConfirmFragment firebaseLoginConfirmFragment) {
            this.f101187OooOo0o = firebaseLoginConfirmFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FirebaseLoginConfirmFragment firebaseLoginConfirmFragment = this.f101187OooOo0o;
            FirebaseLoginConfirmFragment.Oooo00o(firebaseLoginConfirmFragment, firebaseLoginConfirmFragment.getString(R.string.login_successfully));
        }
    }

    /* JADX INFO: renamed from: o0OoO000.Oooo00o$OooO0O0 */
    public static final class OooO0O0 implements View.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ FirebaseLoginConfirmFragment f101188OooOo0o;

        public OooO0O0(FirebaseLoginConfirmFragment firebaseLoginConfirmFragment) {
            this.f101188OooOo0o = firebaseLoginConfirmFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FirebaseLoginConfirmFragment firebaseLoginConfirmFragment = this.f101188OooOo0o;
            InterfaceC21987OooOoo viewLifecycleOwner = firebaseLoginConfirmFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28550Oooo0OO(firebaseLoginConfirmFragment, null), 3);
        }
    }

    /* JADX INFO: renamed from: o0OoO000.Oooo00o$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FirebaseLoginConfirmFragment f101189OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27174OooO0O0 f101190OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C27174OooO0O0 c27174OooO0O0, FirebaseLoginConfirmFragment firebaseLoginConfirmFragment) {
            super(0);
            this.f101190OooOo0o = c27174OooO0O0;
            this.f101189OooOo = firebaseLoginConfirmFragment;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            C27174OooO0O0 c27174OooO0O0 = this.f101190OooOo0o;
            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0");
            FirebaseLoginConfirmFragment firebaseLoginConfirmFragment = this.f101189OooOo;
            if (!zOooO0O0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o, "FirebaseLoginConfirmFragment", "loginOkAndCheckUnboundPurchases: ", c27174OooO0O0), new Object[0]);
                Context contextRequireContext = firebaseLoginConfirmFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                FirebaseLoginConfirmFragment.Oooo00o(firebaseLoginConfirmFragment, C21335Oooo0oO.OooO0O0(contextRequireContext, c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg()));
            } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.OooO0O0(), Boolean.TRUE)) {
                FirebaseLoginConfirmFragment.Oooo00o(firebaseLoginConfirmFragment, firebaseLoginConfirmFragment.getString(R.string.login_successfully));
            } else if (firebaseLoginConfirmFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                String string = firebaseLoginConfirmFragment.getString(R.string.restore_purchase);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = firebaseLoginConfirmFragment.getString(R.string.restore_purchase_to_logged_user);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                new TipsDialogFragment(string, string2, new OooO00o(firebaseLoginConfirmFragment), new OooO0O0(firebaseLoginConfirmFragment)).show(firebaseLoginConfirmFragment.getChildFragmentManager(), "TipsDialogFragment");
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoO000.Oooo00o$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginConfirmFragment$loginCompleteAndCheckUnboundPurchases$1$response$1", m80623f = "FirebaseLoginConfirmFragment.kt", m80624l = {315}, m80625m = "invokeSuspend")
    public static final class C28548OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FirebaseLoginConfirmFragment f101191OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101192OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28548OooO0Oo(FirebaseLoginConfirmFragment firebaseLoginConfirmFragment, Continuation<? super C28548OooO0Oo> continuation) {
            super(2, continuation);
            this.f101191OooOo = firebaseLoginConfirmFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C28548OooO0Oo(this.f101191OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>> continuation) {
            return ((C28548OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101192OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) this.f101191OooOo.f72301Oooo00o.getValue();
            this.f101192OooOo0o = 1;
            Object objOooO0o = c26320o0000OoO.OooO0o(this);
            return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28547Oooo00o(FirebaseLoginConfirmFragment firebaseLoginConfirmFragment, Continuation<? super C28547Oooo00o> continuation) {
        super(2, continuation);
        this.f101185OooOo = firebaseLoginConfirmFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28547Oooo00o(this.f101185OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28547Oooo00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fa, code lost:
    
        if (androidx.lifecycle.o0Oo0oo.OooO00o(r1, r6, r5, r4, r9) == r0) goto L33;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101186OooOo0o;
        FirebaseLoginConfirmFragment firebaseLoginConfirmFragment = this.f101185OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C28548OooO0Oo c28548OooO0Oo = new C28548OooO0Oo(firebaseLoginConfirmFragment, null);
            this.f101186OooOo0o = 1;
            obj = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c28548OooO0Oo, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) obj;
        AbstractC21979OooOOo0 lifecycle = firebaseLoginConfirmFragment.getLifecycle();
        AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65541OooOoOO;
        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
        AbstractC33687OooO0oO abstractC33687OooO0oOO000OOoO = C33833OooOOOO.f121946OooO00o.o000OOoO();
        boolean zO000OOO = abstractC33687OooO0oOO000OOoO.o000OOO(getContext());
        if (!zO000OOO) {
            if (lifecycle.OooO0O0() == AbstractC21979OooOOo0.OooO0O0.f65538OooOo0o) {
                throw new C21985OooOoO0();
            }
            if (lifecycle.OooO0O0().compareTo(oooO0O0) >= 0) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO0OO(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o, "FirebaseLoginConfirmFragment", "loginOkAndCheckUnboundPurchases: ", c27174OooO0O0), new Object[0]);
                    Context contextRequireContext = firebaseLoginConfirmFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    FirebaseLoginConfirmFragment.Oooo00o(firebaseLoginConfirmFragment, C21335Oooo0oO.OooO0O0(contextRequireContext, c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg()));
                } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.OooO0O0(), Boolean.TRUE)) {
                    FirebaseLoginConfirmFragment.Oooo00o(firebaseLoginConfirmFragment, firebaseLoginConfirmFragment.getString(R.string.login_successfully));
                } else if (firebaseLoginConfirmFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                    String string = firebaseLoginConfirmFragment.getString(R.string.restore_purchase);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    String string2 = firebaseLoginConfirmFragment.getString(R.string.restore_purchase_to_logged_user);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    new TipsDialogFragment(string, string2, new OooO00o(firebaseLoginConfirmFragment), new OooO0O0(firebaseLoginConfirmFragment)).show(firebaseLoginConfirmFragment.getChildFragmentManager(), "TipsDialogFragment");
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        OooO0OO oooO0OO = new OooO0OO(c27174OooO0O0, firebaseLoginConfirmFragment);
        this.f101186OooOo0o = 2;
    }
}
