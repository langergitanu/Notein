package com.orion.notein.p607ui.login.firebase;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21030OooOO0o;
import OooooOO.C21335Oooo0oO;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.bumptech.glide.C22253OooOO0o;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.Firebase;
import com.google.firebase.auth.AuthKt;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o000o0O0.OooOO0;
import o00o00.C25206OooO0Oo;
import o0O0oO.ViewOnClickListenerC26091OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0Oo0O0.C28050OooO0OO;
import o0OoO000.C28544OooOooo;
import o0OoO000.C28546Oooo00O;
import o0OoO000.C28547Oooo00o;
import o0OoO000.C28549Oooo0O0;
import o0OoO000.C28552Oooo0o0;
import o0OoO000.C28560OoooOOO;
import o0OoO000.Oooo000;
import o0OoO000.ViewOnClickListenerC28540OooOoOO;
import o0OoO000.ViewOnClickListenerC28541OooOoo;
import o0OoO000.ViewOnClickListenerC28542OooOoo0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/firebase/FirebaseLoginConfirmFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseLoginConfirmFragment extends Hilt_FirebaseLoginConfirmFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public CheckBox f72297Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C22026ooOO f72298Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f72299Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final FirebaseAuth f72300Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C22026ooOO f72301Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f72302Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ImageView f72303Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ImageView f72304Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f72305Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f72306Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f72307Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public View f72308OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f72309OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f72310OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public CircularProgressIndicator f72311OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public View f72312OoooOO0;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            FirebaseLoginConfirmFragment firebaseLoginConfirmFragment = FirebaseLoginConfirmFragment.this;
            Bundle arguments = firebaseLoginConfirmFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + firebaseLoginConfirmFragment + " has null arguments");
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginConfirmFragment$onViewCreated$6", m80623f = "FirebaseLoginConfirmFragment.kt", m80624l = {135}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72315OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseLoginConfirmFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19222OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FirebaseLoginConfirmFragment f72316OooOo0o;

            public C19222OooO00o(FirebaseLoginConfirmFragment firebaseLoginConfirmFragment) {
                this.f72316OooOo0o = firebaseLoginConfirmFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                this.f72316OooOo0o.Oooo0OO(((Number) obj).intValue());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return FirebaseLoginConfirmFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72315OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            FirebaseLoginConfirmFragment firebaseLoginConfirmFragment = FirebaseLoginConfirmFragment.this;
            C33772OooooOo c33772OooooOo = ((C28560OoooOOO) firebaseLoginConfirmFragment.f72298Oooo0.getValue()).f101230OooOO0o;
            C19222OooO00o c19222OooO00o = new C19222OooO00o(firebaseLoginConfirmFragment);
            this.f72315OooOo0o = 1;
            c33772OooooOo.getClass();
            C33772OooooOo.OooOO0O(c33772OooooOo, c19222OooO00o, this);
            return enumC32485OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return FirebaseLoginConfirmFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return FirebaseLoginConfirmFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseLoginConfirmFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23167OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23167OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return FirebaseLoginConfirmFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72320OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72320OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f72320OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseLoginConfirmFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23168OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public C23168OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(FirebaseLoginConfirmFragment.this).OooO0o(R.id.firebaseUserAuthFragment);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseLoginConfirmFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23169OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72322OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23169OooO0oO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72322OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f72322OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseLoginConfirmFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23170OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72323OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23170OooO0oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72323OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = FirebaseLoginConfirmFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f72323OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public FirebaseLoginConfirmFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72299Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(C28552Oooo0o0.class), new OooO());
        this.f72300Oooo00O = AuthKt.getAuth(Firebase.INSTANCE);
        this.f72301Oooo00o = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23167OooO0Oo(), new OooO0OO());
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C23168OooO0o0());
        OooO0o oooO0o = new OooO0o(c32447OooOOoOooO0OO);
        this.f72298Oooo0 = new C22026ooOO(oooo0.OooO0O0(C28560OoooOOO.class), oooO0o, new C23170OooO0oo(c32447OooOOoOooO0OO), new C23169OooO0oO(c32447OooOOoOooO0OO));
    }

    public static final void Oooo00o(FirebaseLoginConfirmFragment firebaseLoginConfirmFragment, String str) {
        InterfaceC21987OooOoo viewLifecycleOwner = firebaseLoginConfirmFragment.getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new o0OoO000.Oooo0(str, firebaseLoginConfirmFragment, null), 3);
    }

    public static void Oooo0o0(TextView textView, String str, oO0O000o.OooO00o oooO00o) {
        SpannableString spannableString = new SpannableString(textView.getText());
        C28549Oooo0O0 c28549Oooo0O0 = new C28549Oooo0O0(oooO00o, textView);
        int iOooo0O0 = C33599OooOo0O.Oooo0O0(spannableString, str, 0, false, 6);
        spannableString.setSpan(c28549Oooo0O0, iOooo0O0, str.length() + iOooo0O0, 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_firebase_login_confirm;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOooO() {
        return R.color.transparent;
    }

    public final void Oooo0() {
        TextView textView = this.f72309OoooO0;
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView.setEnabled(false);
        TextView textView2 = this.f72309OoooO0;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView2.setText("");
        CircularProgressIndicator circularProgressIndicator = this.f72311OoooO0O;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setVisibility(0);
        } else {
            OooOOO0.OooOOOO("cpiBtnContinue");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C28552Oooo0o0 Oooo0O0() {
        return (C28552Oooo0o0) this.f72299Oooo000.getValue();
    }

    public final void Oooo0OO(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "FirebaseLoginConfirmFragment", "handleLoginResult: ", i), new Object[0]);
        if (i == 1000) {
            InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28547Oooo00o(this, null), 3);
            return;
        }
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        String strOooO0OO = C21335Oooo0oO.OooO0OO(contextRequireContext, i);
        Context context = getContext();
        if (context != null) {
            C25206OooO0Oo.OooO0oO(context, strOooO0OO);
        }
        TextView textView = this.f72309OoooO0;
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView.setEnabled(true);
        TextView textView2 = this.f72309OoooO0;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView2.setText(getString(R.string._continue));
        CircularProgressIndicator circularProgressIndicator = this.f72311OoooO0O;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("cpiBtnContinue");
            throw null;
        }
    }

    public final void Oooo0o(FirebaseUser firebaseUser) {
        Uri uri = Oooo0O0().f101200OooO0Oo;
        String str = Oooo0O0().f101198OooO0O0;
        String str2 = Oooo0O0().f101199OooO0OO;
        if (!str.equals(firebaseUser.getDisplayName()) || !uri.equals(firebaseUser.getPhotoUrl())) {
            UserProfileChangeRequest.Builder builder = new UserProfileChangeRequest.Builder();
            builder.setDisplayName(str);
            builder.setPhotoUri(uri);
            UserProfileChangeRequest userProfileChangeRequestBuild = builder.build();
            OooOOO0.OooO0o(userProfileChangeRequestBuild, "build(...)");
            firebaseUser.updateProfile(userProfileChangeRequestBuild).addOnCompleteListener(new C28544OooOooo());
        }
        ((C28560OoooOOO) this.f72298Oooo0.getValue()).OooO0oO(firebaseUser, str2);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        OooOOO0.OooO0o(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = R.style.NoteInDialogWindowAnim;
        }
        return dialogOnCreateDialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.iv_back);
        this.f72302Oooo0O0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC26091OooO00o(this, 1));
        this.f72303Oooo0OO = (ImageView) view.findViewById(R.id.iv_provider_icon);
        this.f72305Oooo0o0 = (TextView) view.findViewById(R.id.tv_provider_name);
        String str = Oooo0O0().f101197OooO00o;
        if (str.equals("google")) {
            ImageView imageView = this.f72303Oooo0OO;
            if (imageView == null) {
                OooOOO0.OooOOOO("providerIcon");
                throw null;
            }
            imageView.setImageResource(R.drawable.ic_google);
            TextView textView = this.f72305Oooo0o0;
            if (textView == null) {
                OooOOO0.OooOOOO("txtProvider");
                throw null;
            }
            textView.setText(getString(R.string.btn_sign_up_with_google));
        } else if (str.equals("microsoft")) {
            ImageView imageView2 = this.f72303Oooo0OO;
            if (imageView2 == null) {
                OooOOO0.OooOOOO("providerIcon");
                throw null;
            }
            imageView2.setImageResource(R.drawable.ic_microsoft);
            TextView textView2 = this.f72305Oooo0o0;
            if (textView2 == null) {
                OooOOO0.OooOOOO("txtProvider");
                throw null;
            }
            textView2.setText(getString(R.string.btn_sign_up_with_microsoft));
        }
        this.f72304Oooo0o = (ImageView) view.findViewById(R.id.iv_user_avatar);
        this.f72306Oooo0oO = (TextView) view.findViewById(R.id.tv_user_name);
        this.f72307Oooo0oo = (TextView) view.findViewById(R.id.tv_user_email);
        C22253OooOO0o c22253OooOO0oOooOo0 = com.bumptech.glide.OooO0OO.OooO0O0(getContext()).OooO0Oo(this).OooO0oO(Oooo0O0().f101200OooO0Oo).OooO0Oo().OooOo0(R.drawable.ic_logo);
        ImageView imageView3 = this.f72304Oooo0o;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("ivPhoto");
            throw null;
        }
        c22253OooOO0oOooOo0.OoooO0(imageView3);
        TextView textView3 = this.f72306Oooo0oO;
        if (textView3 == null) {
            OooOOO0.OooOOOO("txtDisplayName");
            throw null;
        }
        textView3.setText(Oooo0O0().f101198OooO0O0);
        if (Oooo0O0().f101199OooO0OO.length() == 0) {
            TextView textView4 = this.f72307Oooo0oo;
            if (textView4 == null) {
                OooOOO0.OooOOOO("txtEmail");
                throw null;
            }
            textView4.setVisibility(8);
        } else {
            TextView textView5 = this.f72307Oooo0oo;
            if (textView5 == null) {
                OooOOO0.OooOOOO("txtEmail");
                throw null;
            }
            textView5.setText(Oooo0O0().f101199OooO0OO);
        }
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.cb_agree);
        this.f72297Oooo = checkBox;
        if (checkBox == null) {
            OooOOO0.OooOOOO("btnAgree");
            throw null;
        }
        C28050OooO0OO.OooO00o(checkBox, 500L, new o0O0oO.OooO0O0(this, 1));
        TextView textView6 = (TextView) view.findViewById(R.id.tv_agreement);
        this.f72310OoooO00 = textView6;
        if (textView6 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        textView6.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView7 = this.f72310OoooO00;
        if (textView7 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        textView7.setText(getString(R.string.content_request_user_to_agree_policy, getString(R.string.terms_and_conditions), getString(R.string.privacy_policy)));
        TextView textView8 = this.f72310OoooO00;
        if (textView8 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        String string = getString(R.string.terms_and_conditions);
        OooOOO0.OooO0o(string, "getString(...)");
        Oooo0o0(textView8, string, new Oooo000(this, 0));
        TextView textView9 = this.f72310OoooO00;
        if (textView9 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        String string2 = getString(R.string.privacy_policy);
        OooOOO0.OooO0o(string2, "getString(...)");
        Oooo0o0(textView9, string2, new C28546Oooo00O(this, 0));
        this.f72311OoooO0O = (CircularProgressIndicator) view.findViewById(R.id.cpi_btn_continue);
        TextView textView10 = (TextView) view.findViewById(R.id.btn_continue);
        this.f72309OoooO0 = textView10;
        if (textView10 == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView10, 500L, new ViewOnClickListenerC28540OooOoOO(this, 0));
        View viewFindViewById2 = view.findViewById(R.id.btn_terms);
        this.f72308OoooO = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnTerms");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC28542OooOoo0(this, 0));
        View viewFindViewById3 = view.findViewById(R.id.btn_privacy);
        this.f72312OoooOO0 = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnPrivacy");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC28541OooOoo(this, 0));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}
