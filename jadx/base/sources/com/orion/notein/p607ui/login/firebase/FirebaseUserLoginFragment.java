package com.orion.notein.p607ui.login.firebase;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import OooooOO.C21335Oooo0oO;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.auth.FirebaseAuth;
import com.orion.notein.global.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o0000OO0.AbstractC24167OooO0oo;
import o0000OO0.C24183Oooo;
import o0000OO0.C24191Oooo0oO;
import o0000OO0.C24192Oooo0oo;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24587OooOoo;
import o0O0oooO.C26320o0000OoO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oOo.ViewOnClickListenerC28343Oooo0o;
import o0Oo0oOo.ViewOnClickListenerC28359OooooO0;
import o0Oo0oOo.o00Ooo;
import o0OoO000.C28560OoooOOO;
import o0OoO000.C28574o000000o;
import o0OoO000.C28577o00000o0;
import o0OoO000.C28584o0000Ooo;
import o0OoO000.C28597o00oO0o;
import o0OoO000.ViewOnClickListenerC28596o00o0O;
import o0OoO000.o0000;
import o0OoO000.o00000O;
import o0OoO000.o00000O0;
import o0OoO000.o00000OO;
import o0OoO000.o000OOo;
import o0OoO000.o0O0O00;
import o0OoO000.o0OO00O;
import o0OoO000.o0Oo0oo;
import o0OoO000.oo000o;
import o0OoO000.oo0o0Oo;
import o0oo000O.C31183OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
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
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/firebase/FirebaseUserLoginFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseUserLoginFragment extends Hilt_FirebaseUserLoginFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f72355Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f72356Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f72357Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f72358Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final FirebaseAuth f72359Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f72360Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f72361Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f72362Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public CircularProgressIndicator f72363Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f72364Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public CheckBox f72365Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public EditText f72366OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public EditText f72367OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ViewGroup f72368OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ViewGroup f72369OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ImageView f72370OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public View f72371OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public View f72372OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public View f72373OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public View f72374o000oOoO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72375OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72375OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72375OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? FirebaseUserLoginFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$onViewCreated$14", m80623f = "FirebaseUserLoginFragment.kt", m80624l = {196}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72378OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19223OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FirebaseUserLoginFragment f72379OooOo0o;

            public C19223OooO00o(FirebaseUserLoginFragment firebaseUserLoginFragment) {
                this.f72379OooOo0o = firebaseUserLoginFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                this.f72379OooOo0o.Oooo0o(((Number) obj).intValue());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return FirebaseUserLoginFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72378OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw androidx.transition.OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            FirebaseUserLoginFragment firebaseUserLoginFragment = FirebaseUserLoginFragment.this;
            C33772OooooOo c33772OooooOo = ((C28560OoooOOO) firebaseUserLoginFragment.f72358Oooo00O.getValue()).f101230OooOO0o;
            C19223OooO00o c19223OooO00o = new C19223OooO00o(firebaseUserLoginFragment);
            this.f72378OooOo0o = 1;
            c33772OooooOo.getClass();
            C33772OooooOo.OooOO0O(c33772OooooOo, c19223OooO00o, this);
            return enumC32485OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return FirebaseUserLoginFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return FirebaseUserLoginFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23174OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23174OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return FirebaseUserLoginFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23175OooO0o0 f72383OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23175OooO0o0 c23175OooO0o0) {
            super(0);
            this.f72383OooOo0o = c23175OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72383OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23175OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23175OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return FirebaseUserLoginFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23176OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72385OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23176OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72385OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72385OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23177OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72386OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23177OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72386OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72386OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public FirebaseUserLoginFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72357Oooo000 = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23174OooO0Oo(), new OooO0OO());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0o(new C23175OooO0o0()));
        this.f72358Oooo00O = new C22026ooOO(oooo0.OooO0O0(C28560OoooOOO.class), new C23176OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23177OooO0oo(interfaceC32440OooOO0OooO0O0));
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        OooOOO0.OooO0o(firebaseAuth, "getInstance(...)");
        this.f72359Oooo00o = firebaseAuth;
    }

    public static final void Oooo0(FirebaseUserLoginFragment firebaseUserLoginFragment, String str) {
        InterfaceC21987OooOoo viewLifecycleOwner = firebaseUserLoginFragment.getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new o00000O(firebaseUserLoginFragment, str, null), 3);
    }

    public static final void Oooo00o(FirebaseUserLoginFragment firebaseUserLoginFragment, C24183Oooo c24183Oooo) {
        firebaseUserLoginFragment.getClass();
        AbstractC24167OooO0oo abstractC24167OooO0oo = c24183Oooo.f81438OooO00o;
        if (!(abstractC24167OooO0oo instanceof C24191Oooo0oO)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseLoginFragment");
            c20358OooO00o.OooO0OO("Unexpected type of credential", new Object[0]);
        } else if (OooOOO0.OooO0O0(abstractC24167OooO0oo.getType(), GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL)) {
            try {
                firebaseUserLoginFragment.Oooo0OO(GoogleIdTokenCredential.INSTANCE.createFrom(abstractC24167OooO0oo.getData()));
                return;
            } catch (GoogleIdTokenParsingException e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("FirebaseLoginFragment");
                c20358OooO00o2.OooO0Oo(e, "Received an invalid google id token response", new Object[0]);
            }
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("FirebaseLoginFragment");
            c20358OooO00o3.OooO0OO("Unexpected type of credential", new Object[0]);
        }
        firebaseUserLoginFragment.Oooo0o(1007);
    }

    public static void Oooo0oO(TextView textView, String str, oO0O000o.OooO00o oooO00o) {
        SpannableString spannableString = new SpannableString(textView.getText());
        o00000OO o00000oo2 = new o00000OO(oooO00o, textView);
        int iOooo0O0 = C33599OooOo0O.Oooo0O0(spannableString, str, 0, false, 6);
        spannableString.setSpan(o00000oo2, iOooo0O0, str.length() + iOooo0O0, 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_firebase_user_login;
    }

    public final void Oooo(boolean z) {
        View view = this.f72364Oooo0oO;
        if (view != null) {
            view.setClickable(!z);
        } else {
            OooOOO0.OooOOOO("btnMicrosoft");
            throw null;
        }
    }

    public final void Oooo0O0() {
        Oooo0o0();
        EditText editText = this.f72367OoooO0;
        if (editText == null) {
            OooOOO0.OooOOOO("etEmail");
            throw null;
        }
        editText.getText().clear();
        EditText editText2 = this.f72367OoooO0;
        if (editText2 == null) {
            OooOOO0.OooOOOO("etEmail");
            throw null;
        }
        editText2.clearFocus();
        EditText editText3 = this.f72366OoooO;
        if (editText3 == null) {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
        editText3.getText().clear();
        EditText editText4 = this.f72366OoooO;
        if (editText4 != null) {
            editText4.clearFocus();
        } else {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
    }

    public final void Oooo0OO(GoogleIdTokenCredential googleIdTokenCredential) {
        String zzc = googleIdTokenCredential.getZzc();
        if (zzc == null) {
            zzc = "";
        }
        String str = zzc;
        String email = googleIdTokenCredential.getZza();
        Uri zzf = googleIdTokenCredential.getZzf();
        if (zzf == null) {
            zzf = Uri.EMPTY;
        }
        Uri uri = zzf;
        String zzb = googleIdTokenCredential.getZzb();
        ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = requireActivity();
        com.bumptech.glide.OooO0OO.OooO0O0(activityC21897OooOo0RequireActivity).OooO0o0(activityC21897OooOo0RequireActivity).OooO0oO(uri).Ooooo00();
        C24587OooOoo c24587OooOoo = new C24587OooOoo(false, false, R.id.firebaseUserLoginFragment, true, false, -1, -1, -1, -1);
        OooOOO0.OooO0Oo(uri);
        Bundle extras = BundleKt.bundleOf(new C32443OooOOO("id_token", zzb));
        OooOOO0.OooO0oO(email, "email");
        OooOOO0.OooO0oO(extras, "extras");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C28574o000000o(this, new o0000("google", str, email, uri, extras), c24587OooOoo, null), 3);
    }

    public final void Oooo0o(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "FirebaseLoginFragment", "handleLoginResult: ", i), new Object[0]);
        Oooo0oo(false);
        Oooo(false);
        if (i == 1000) {
            InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new o00000O0(this, null), 3);
        } else {
            Context contextRequireContext = requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            String strOooO0OO = C21335Oooo0oO.OooO0OO(contextRequireContext, i);
            Oooo0o0();
            C21989OooOooO.OooO00o(this).OooO0O0(new C28577o00000o0(this, strOooO0OO, null));
        }
    }

    public final void Oooo0o0() {
        TextView textView = this.f72361Oooo0OO;
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView.setEnabled(true);
        TextView textView2 = this.f72361Oooo0OO;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView2.setText(getString(R.string._continue));
        CircularProgressIndicator circularProgressIndicator = this.f72363Oooo0o0;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("cpiBtnContinue");
            throw null;
        }
    }

    public final void Oooo0oo(boolean z) {
        View view = this.f72362Oooo0o;
        if (view != null) {
            view.setClickable(!z);
        } else {
            OooOOO0.OooOOOO("btnGoogle");
            throw null;
        }
    }

    public final void OoooO00(boolean z) {
        GetSignInWithGoogleOption getSignInWithGoogleOptionBuild = new GetSignInWithGoogleOption.Builder(C31183OooO00o.f111224OooO0Oo).build();
        new ArrayList();
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new C28584o0000Ooo(this, new C24192Oooo0oo(OooOo.o0ooOO0(OooOo.o0ooOoO(com.facebook.soloader.OooOo.OooO0oO(getSignInWithGoogleOptionBuild)))), z, null), 3);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        View viewFindViewById = view.findViewById(R.id.btn_close);
        this.f72356Oooo0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new o0OoO000.o00Oo0(this, 0));
        View viewFindViewById2 = view.findViewById(R.id.btn_back);
        this.f72360Oooo0O0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnBack");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new oo0o0Oo(this, 0));
        View viewFindViewById3 = view.findViewById(R.id.switch_signup);
        this.f72374o000oOoO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnSignup");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new o0O0O00(this, 0));
        this.f72371OoooOOO = view.findViewById(R.id.switch_login);
        View viewFindViewById4 = view.findViewById(R.id.btn_google);
        this.f72362Oooo0o = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnGoogle");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new o00Ooo(this, 1));
        View viewFindViewById5 = view.findViewById(R.id.btn_microsoft);
        this.f72364Oooo0oO = viewFindViewById5;
        if (viewFindViewById5 == null) {
            OooOOO0.OooOOOO("btnMicrosoft");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById5, 500L, new o000OOo(this, 0));
        this.f72368OoooO00 = (ViewGroup) view.findViewById(R.id.cl_email_wrapper);
        EditText editText = (EditText) view.findViewById(R.id.et_email);
        this.f72367OoooO0 = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("etEmail");
            throw null;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoO000.o000000
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ViewGroup viewGroup = this.f101276OooO00o.f72368OoooO00;
                if (viewGroup != null) {
                    viewGroup.setActivated(z);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("emailWrapper");
                    throw null;
                }
            }
        });
        this.f72369OoooO0O = (ViewGroup) view.findViewById(R.id.cl_password_wrapper);
        EditText editText2 = (EditText) view.findViewById(R.id.et_password);
        this.f72366OoooO = editText2;
        if (editText2 == null) {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
        editText2.setInputType(129);
        EditText editText3 = this.f72366OoooO;
        if (editText3 == null) {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
        editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoO000.o000000O
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ViewGroup viewGroup = this.f101277OooO00o.f72369OoooO0O;
                if (viewGroup != null) {
                    viewGroup.setActivated(z);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("passwordWrapper");
                    throw null;
                }
            }
        });
        ImageView imageView = (ImageView) view.findViewById(R.id.btn_visibility);
        this.f72370OoooOO0 = imageView;
        if (imageView == null) {
            OooOOO0.OooOOOO("btnPasswordVisibility");
            throw null;
        }
        imageView.setOnClickListener(new o0OoO000.o00Ooo(this, 0));
        TextView textView = (TextView) view.findViewById(R.id.btn_continue);
        this.f72361Oooo0OO = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC28596o00o0O(this, 0));
        this.f72363Oooo0o0 = (CircularProgressIndicator) view.findViewById(R.id.cpi_btn_continue);
        TextView textView2 = (TextView) view.findViewById(R.id.btn_forgot_password);
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnForgotPassword");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView2, 500L, new ViewOnClickListenerC28343Oooo0o(this, 1));
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.cb_agree);
        this.f72365Oooo0oo = checkBox;
        if (checkBox == null) {
            OooOOO0.OooOOOO("btnAgree");
            throw null;
        }
        C28050OooO0OO.OooO00o(checkBox, 500L, new ViewOnClickListenerC28359OooooO0(this, 1));
        TextView textView3 = (TextView) view.findViewById(R.id.tv_agreement);
        this.f72355Oooo = textView3;
        if (textView3 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView4 = this.f72355Oooo;
        if (textView4 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        textView4.setText(getString(R.string.content_request_user_to_agree_policy, getString(R.string.terms_and_conditions), getString(R.string.privacy_policy)));
        TextView textView5 = this.f72355Oooo;
        if (textView5 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        String string = getString(R.string.terms_and_conditions);
        OooOOO0.OooO0o(string, "getString(...)");
        Oooo0oO(textView5, string, new oo000o(this, 0));
        TextView textView6 = this.f72355Oooo;
        if (textView6 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        String string2 = getString(R.string.privacy_policy);
        OooOOO0.OooO0o(string2, "getString(...)");
        Oooo0oO(textView6, string2, new C28597o00oO0o(this, 0));
        View viewFindViewById6 = view.findViewById(R.id.btn_terms);
        this.f72372OoooOOo = viewFindViewById6;
        if (viewFindViewById6 == null) {
            OooOOO0.OooOOOO("btnTerms");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById6, 500L, new o0Oo0oo(this, 0));
        View viewFindViewById7 = view.findViewById(R.id.btn_privacy);
        this.f72373OoooOo0 = viewFindViewById7;
        if (viewFindViewById7 == null) {
            OooOOO0.OooOOOO("btnPrivacy");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById7, 500L, new o0OO00O(this, 0));
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooO00o(null), 3);
    }
}
