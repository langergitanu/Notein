package o0OoO000;

import OooooOO.C21335Oooo0oO;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21985OooOoO0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserSetNameFragment;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseCreateUserSetNameFragment$loginCompleteAndCheckUnboundPurchases$1", m80623f = "FirebaseCreateUserSetNameFragment.kt", m80624l = {204, StyleIdentifier.GRID_TABLE_3}, m80625m = "invokeSuspend")
public final class OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FirebaseCreateUserSetNameFragment f101139OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101140OooOo0o;

    public static final class OooO00o implements View.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ FirebaseCreateUserSetNameFragment f101141OooOo0o;

        public OooO00o(FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment) {
            this.f101141OooOo0o = firebaseCreateUserSetNameFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment = this.f101141OooOo0o;
            FirebaseCreateUserSetNameFragment.Oooo00o(firebaseCreateUserSetNameFragment, firebaseCreateUserSetNameFragment.getString(R.string.login_successfully));
        }
    }

    public static final class OooO0O0 implements View.OnClickListener {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ FirebaseCreateUserSetNameFragment f101142OooOo0o;

        public OooO0O0(FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment) {
            this.f101142OooOo0o = firebaseCreateUserSetNameFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment = this.f101142OooOo0o;
            InterfaceC21987OooOoo viewLifecycleOwner = firebaseCreateUserSetNameFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28531OooOOOo(firebaseCreateUserSetNameFragment, null), 3);
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FirebaseCreateUserSetNameFragment f101143OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27174OooO0O0 f101144OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C27174OooO0O0 c27174OooO0O0, FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment) {
            super(0);
            this.f101144OooOo0o = c27174OooO0O0;
            this.f101143OooOo = firebaseCreateUserSetNameFragment;
        }

        @Override // oO0O000o.OooO00o
        public final C32460OooOooO invoke() {
            C27174OooO0O0 c27174OooO0O0 = this.f101144OooOo0o;
            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0");
            FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment = this.f101143OooOo;
            if (!zOooO0O0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o, "FirebaseSetNameFragment", "loginOkAndCheckUnboundPurchases: ", c27174OooO0O0), new Object[0]);
                Context contextRequireContext = firebaseCreateUserSetNameFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                FirebaseCreateUserSetNameFragment.Oooo00o(firebaseCreateUserSetNameFragment, C21335Oooo0oO.OooO0O0(contextRequireContext, c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg()));
            } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.OooO0O0(), Boolean.TRUE)) {
                FirebaseCreateUserSetNameFragment.Oooo00o(firebaseCreateUserSetNameFragment, firebaseCreateUserSetNameFragment.getString(R.string.login_successfully));
            } else if (firebaseCreateUserSetNameFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                String string = firebaseCreateUserSetNameFragment.getString(R.string.restore_purchase);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                String string2 = firebaseCreateUserSetNameFragment.getString(R.string.restore_purchase_to_logged_user);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                new TipsDialogFragment(string, string2, new OooO00o(firebaseCreateUserSetNameFragment), new OooO0O0(firebaseCreateUserSetNameFragment)).show(firebaseCreateUserSetNameFragment.getChildFragmentManager(), "TipsDialogFragment");
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OoO000.OooOOO$OooO0Oo, reason: case insensitive filesystem */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseCreateUserSetNameFragment$loginCompleteAndCheckUnboundPurchases$1$response$1", m80623f = "FirebaseCreateUserSetNameFragment.kt", m80624l = {204}, m80625m = "invokeSuspend")
    public static final class C28530OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ FirebaseCreateUserSetNameFragment f101145OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f101146OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28530OooO0Oo(FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment, Continuation<? super C28530OooO0Oo> continuation) {
            super(2, continuation);
            this.f101145OooOo = firebaseCreateUserSetNameFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new C28530OooO0Oo(this.f101145OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<Boolean>> continuation) {
            return ((C28530OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f101146OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return obj;
            }
            C32446OooOOOo.OooO0O0(obj);
            C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) this.f101145OooOo.f72267Oooo000.getValue();
            this.f101146OooOo0o = 1;
            Object objOooO0o = c26320o0000OoO.OooO0o(this);
            return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment, Continuation<? super OooOOO> continuation) {
        super(2, continuation);
        this.f101139OooOo = firebaseCreateUserSetNameFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOOO(this.f101139OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
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
        int i = this.f101140OooOo0o;
        FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment = this.f101139OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            ExecutorC33873OooO0O0 executorC33873OooO0O0 = ExecutorC33873OooO0O0.f122045OooOoO0;
            C28530OooO0Oo c28530OooO0Oo = new C28530OooO0Oo(firebaseCreateUserSetNameFragment, null);
            this.f101140OooOo0o = 1;
            obj = C33609OooO0oo.OooO0o(executorC33873OooO0O0, c28530OooO0Oo, this);
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
        AbstractC21979OooOOo0 lifecycle = firebaseCreateUserSetNameFragment.getLifecycle();
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
                    c20358OooO00o.OooO0OO(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o, "FirebaseSetNameFragment", "loginOkAndCheckUnboundPurchases: ", c27174OooO0O0), new Object[0]);
                    Context contextRequireContext = firebaseCreateUserSetNameFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    FirebaseCreateUserSetNameFragment.Oooo00o(firebaseCreateUserSetNameFragment, C21335Oooo0oO.OooO0O0(contextRequireContext, c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg()));
                } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.OooO0O0(), Boolean.TRUE)) {
                    FirebaseCreateUserSetNameFragment.Oooo00o(firebaseCreateUserSetNameFragment, firebaseCreateUserSetNameFragment.getString(R.string.login_successfully));
                } else if (firebaseCreateUserSetNameFragment.getChildFragmentManager().OooOooo("TipsDialogFragment") == null) {
                    String string = firebaseCreateUserSetNameFragment.getString(R.string.restore_purchase);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    String string2 = firebaseCreateUserSetNameFragment.getString(R.string.restore_purchase_to_logged_user);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    new TipsDialogFragment(string, string2, new OooO00o(firebaseCreateUserSetNameFragment), new OooO0O0(firebaseCreateUserSetNameFragment)).show(firebaseCreateUserSetNameFragment.getChildFragmentManager(), "TipsDialogFragment");
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            return C32460OooOooO.f116667OooO00o;
        }
        OooO0OO oooO0OO = new OooO0OO(c27174OooO0O0, firebaseCreateUserSetNameFragment);
        this.f101140OooOo0o = 2;
    }
}
