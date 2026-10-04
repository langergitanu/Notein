package com.orion.notein.p607ui.login.firebase;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import Oooo0.o000000O;
import Oooo0oO.C21030OooOO0o;
import OooooOO.C21335Oooo0oO;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.orion.notein.global.R;
import io.ktor.utils.p616io.Oooo000;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000OO00.OooOOO;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00.C25206OooO0Oo;
import o0O0o0oO.o0OOO0o;
import o0O0o0oO.o0Oo0oo;
import o0O0oooO.C26320o0000OoO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.oo000o;
import o0OoO000.C28524OooO0O0;
import o0OoO000.C28560OoooOOO;
import o0OoO000.ViewOnClickListenerC28523OooO00o;
import o0OoO000.ViewOnClickListenerC28526OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/firebase/FirebaseCreateUserPasswordFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseCreateUserPasswordFragment extends Hilt_FirebaseCreateUserPasswordFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public CheckBox f72230Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f72231Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f72232Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f72233Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C22026ooOO f72234Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f72235Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ViewGroup f72236Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ImageView f72237Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public EditText f72238Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f72239Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public CircularProgressIndicator f72240Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f72241OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ViewGroup f72242OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f72243OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public TextView f72244OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f72245OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public View f72246OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public Drawable f72247OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public Drawable f72248OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public View f72249o000oOoO;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72250OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72250OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((o000o0O0.OooOO0) this.f72250OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO00o extends ClickableSpan {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ TextView f72251OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ oO0O000o.OooO00o<C32460OooOooO> f72252OooOo0o;

        public OooO00o(oO0O000o.OooO00o<C32460OooOooO> oooO00o, TextView textView) {
            this.f72252OooOo0o = oooO00o;
            this.f72251OooOo = textView;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            OooOOO0.OooO0oO(widget, "widget");
            this.f72252OooOo0o.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds) {
            OooOOO0.OooO0oO(ds, "ds");
            super.updateDrawState(ds);
            ds.setUnderlineText(false);
            TextView textView = this.f72251OooOo;
            ds.setColor(textView.getCurrentTextColor());
            ds.setTypeface(Typeface.create(textView.getTypeface(), 1));
        }
    }

    public static final class OooO0O0 implements TextWatcher {
        public OooO0O0() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (editable == null) {
                return;
            }
            FirebaseCreateUserPasswordFragment.this.Oooo0(C33599OooOo0O.Oooooo0(editable.toString()).toString());
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseCreateUserPasswordFragment$showToast$1", m80623f = "FirebaseCreateUserPasswordFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_2}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ long f72254OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72255OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f72256OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ FirebaseCreateUserPasswordFragment f72257OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, FirebaseCreateUserPasswordFragment firebaseCreateUserPasswordFragment, String str, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f72254OooOo = j;
            this.f72257OooOoO0 = firebaseCreateUserPasswordFragment;
            this.f72256OooOoO = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0OO(this.f72254OooOo, this.f72257OooOoO0, this.f72256OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72255OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f72255OooOo0o = 1;
                if (C33644OoooO0.OooO00o(this.f72254OooOo, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            Context context = this.f72257OooOoO0.getContext();
            if (context != null) {
                C25206OooO0Oo.OooO0OO((ContextWrapper) context, this.f72256OooOoO);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseCreateUserPasswordFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23158OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23158OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return FirebaseCreateUserPasswordFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return FirebaseCreateUserPasswordFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseCreateUserPasswordFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23159OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23159OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return FirebaseCreateUserPasswordFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseCreateUserPasswordFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23160OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o000o0O0.OooOO0> {
        public C23160OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o000o0O0.OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(FirebaseCreateUserPasswordFragment.this).OooO0o(R.id.firebaseUserAuthFragment);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseCreateUserPasswordFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23161OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72262OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23161OooO0oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72262OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((o000o0O0.OooOO0) this.f72262OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72263OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72263OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = FirebaseCreateUserPasswordFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((o000o0O0.OooOO0) this.f72263OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooOO0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            FirebaseCreateUserPasswordFragment firebaseCreateUserPasswordFragment = FirebaseCreateUserPasswordFragment.this;
            Bundle arguments = firebaseCreateUserPasswordFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + firebaseCreateUserPasswordFragment + " has null arguments");
        }
    }

    public FirebaseCreateUserPasswordFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72232Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(o0OoO000.OooO.class), new OooOO0O());
        this.f72233Oooo00O = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new C23158OooO0Oo(), new OooO0o(), new C23159OooO0o0());
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C23160OooO0oO());
        C23161OooO0oo c23161OooO0oo = new C23161OooO0oo(c32447OooOOoOooO0OO);
        this.f72234Oooo00o = new C22026ooOO(oooo0.OooO0O0(C28560OoooOOO.class), c23161OooO0oo, new OooOO0(c32447OooOOoOooO0OO), new OooO(c32447OooOOoOooO0OO));
    }

    public static void Oooo0OO(TextView textView, String str, oO0O000o.OooO00o oooO00o) {
        SpannableString spannableString = new SpannableString(textView.getText());
        OooO00o oooO00o2 = new OooO00o(oooO00o, textView);
        int iOooo0O0 = C33599OooOo0O.Oooo0O0(spannableString, str, 0, false, 6);
        spannableString.setSpan(oooO00o2, iOooo0O0, str.length() + iOooo0O0, 33);
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_firebase_create_user_password;
    }

    public final boolean Oooo0(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = str.length() >= 8;
        if (z5) {
            TextView textView = this.f72244OoooO0O;
            if (textView == null) {
                OooOOO0.OooOOOO("passwordRequirement1");
                throw null;
            }
            textView.setCompoundDrawables(this.f72247OoooOOo, null, null, null);
        } else {
            TextView textView2 = this.f72244OoooO0O;
            if (textView2 == null) {
                OooOOO0.OooOOOO("passwordRequirement1");
                throw null;
            }
            textView2.setCompoundDrawables(this.f72248OoooOo0, null, null, null);
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z = false;
                break;
            }
            if (Character.isLetter(str.charAt(i))) {
                z = true;
                break;
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= str.length()) {
                z2 = false;
                break;
            }
            if (Character.isDigit(str.charAt(i2))) {
                z2 = true;
                break;
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= str.length()) {
                z3 = false;
                break;
            }
            if (!Character.isLetterOrDigit(str.charAt(i3))) {
                z3 = true;
                break;
            }
            i3++;
        }
        boolean z6 = z && (z2 || z3);
        if (z6) {
            TextView textView3 = this.f72241OoooO;
            if (textView3 == null) {
                OooOOO0.OooOOOO("passwordRequirement2");
                throw null;
            }
            textView3.setCompoundDrawables(this.f72247OoooOOo, null, null, null);
        } else {
            TextView textView4 = this.f72241OoooO;
            if (textView4 == null) {
                OooOOO0.OooOOOO("passwordRequirement2");
                throw null;
            }
            textView4.setCompoundDrawables(this.f72248OoooOo0, null, null, null);
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (Oooo000.OooO0o0(cCharAt) || (19968 <= cCharAt && cCharAt < 40960)) {
                z4 = true;
                break;
            }
        }
        z4 = false;
        if (z4) {
            TextView textView5 = this.f72245OoooOO0;
            if (textView5 == null) {
                OooOOO0.OooOOOO("passwordRequirement3");
                throw null;
            }
            textView5.setCompoundDrawables(this.f72248OoooOo0, null, null, null);
        } else {
            TextView textView6 = this.f72245OoooOO0;
            if (textView6 == null) {
                OooOOO0.OooOOOO("passwordRequirement3");
                throw null;
            }
            textView6.setCompoundDrawables(this.f72247OoooOOo, null, null, null);
        }
        return z5 && z6 && !z4;
    }

    public final void Oooo00o(boolean z) {
        if (z) {
            TextView textView = this.f72239Oooo0oO;
            if (textView != null) {
                textView.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.bg_large_round_btn_blue));
                return;
            } else {
                OooOOO0.OooOOOO("btnContinue");
                throw null;
            }
        }
        TextView textView2 = this.f72239Oooo0oO;
        if (textView2 != null) {
            textView2.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.bg_large_round_btn_blue_disable));
        } else {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
    }

    public final void Oooo0O0(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "FirebasePasswordFragment", "handleLoginResult: ", i), new Object[0]);
        if (i == 1000) {
            return;
        }
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        Oooo0o0(1000L, C21335Oooo0oO.OooO0OO(contextRequireContext, i));
    }

    public final void Oooo0o0(long j, String str) {
        if (j > 0) {
            C21989OooOooO.OooO00o(this).OooO0O0(new OooO0OO(j, this, str, null));
            return;
        }
        Context context = getContext();
        if (context != null) {
            C25206OooO0Oo.OooO0OO((ContextWrapper) context, str);
        }
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
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.ic_ni_checkbox_radio_large_selected);
        this.f72247OoooOOo = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, o000000O.OooO0o(24), o000000O.OooO0o(24));
        }
        Drawable drawable2 = ContextCompat.getDrawable(requireContext(), R.drawable.ic_error_round);
        this.f72248OoooOo0 = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, o000000O.OooO0o(24), o000000O.OooO0o(24));
        }
        View viewFindViewById = view.findViewById(R.id.btn_close);
        this.f72231Oooo0 = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28523OooO00o(this, 0));
        View viewFindViewById2 = view.findViewById(R.id.btn_back);
        this.f72235Oooo0O0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnBack");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new o0OoO000.OooO0OO(this, 0));
        this.f72236Oooo0OO = (ViewGroup) view.findViewById(R.id.cl_password_wrapper);
        EditText editText = (EditText) view.findViewById(R.id.et_password);
        this.f72238Oooo0o0 = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
        editText.setInputType(129);
        EditText editText2 = this.f72238Oooo0o0;
        if (editText2 == null) {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
        editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoO000.OooO0Oo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                ViewGroup viewGroup = this.f101129OooO00o.f72236Oooo0OO;
                if (viewGroup != null) {
                    viewGroup.setActivated(z);
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("passwordWrapper");
                    throw null;
                }
            }
        });
        EditText editText3 = this.f72238Oooo0o0;
        if (editText3 == null) {
            OooOOO0.OooOOOO("etPassword");
            throw null;
        }
        editText3.addTextChangedListener(new OooO0O0());
        ImageView imageView = (ImageView) view.findViewById(R.id.btn_visibility);
        this.f72237Oooo0o = imageView;
        if (imageView == null) {
            OooOOO0.OooOOOO("btnPasswordVisibility");
            throw null;
        }
        imageView.setOnClickListener(new ViewOnClickListenerC28526OooO0o0(this, 0));
        TextView textView = (TextView) view.findViewById(R.id.btn_continue);
        this.f72239Oooo0oO = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView, 500L, new o0OoO000.OooO0o(this, 0));
        this.f72240Oooo0oo = (CircularProgressIndicator) view.findViewById(R.id.cpi_btn_continue);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.cb_agree);
        this.f72230Oooo = checkBox;
        if (checkBox == null) {
            OooOOO0.OooOOOO("btnAgree");
            throw null;
        }
        C28050OooO0OO.OooO00o(checkBox, 500L, new oo000o(this, 1));
        CheckBox checkBox2 = this.f72230Oooo;
        if (checkBox2 == null) {
            OooOOO0.OooOOOO("btnAgree");
            throw null;
        }
        Oooo00o(checkBox2.isChecked());
        TextView textView2 = (TextView) view.findViewById(R.id.tv_agreement);
        this.f72243OoooO00 = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = this.f72243OoooO00;
        if (textView3 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        textView3.setText(getString(R.string.content_request_user_to_agree_policy, getString(R.string.terms_and_conditions), getString(R.string.privacy_policy)));
        TextView textView4 = this.f72243OoooO00;
        if (textView4 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        String string = getString(R.string.terms_and_conditions);
        OooOOO0.OooO0o(string, "getString(...)");
        Oooo0OO(textView4, string, new OooOOO(this, 2));
        TextView textView5 = this.f72243OoooO00;
        if (textView5 == null) {
            OooOOO0.OooOOOO("agreeContent");
            throw null;
        }
        String string2 = getString(R.string.privacy_policy);
        OooOOO0.OooO0o(string2, "getString(...)");
        Oooo0OO(textView5, string2, new C28524OooO0O0(this, 0));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.cl_password_requirements);
        this.f72242OoooO0 = viewGroup;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("passwordRequirements");
            throw null;
        }
        viewGroup.setVisibility(8);
        this.f72244OoooO0O = (TextView) view.findViewById(R.id.tv_password_requirement_1);
        this.f72241OoooO = (TextView) view.findViewById(R.id.tv_password_requirement_2);
        this.f72245OoooOO0 = (TextView) view.findViewById(R.id.tv_password_requirement_3);
        View viewFindViewById3 = view.findViewById(R.id.btn_terms);
        this.f72249o000oOoO = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnTerms");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new o0OOO0o(this, 1));
        View viewFindViewById4 = view.findViewById(R.id.btn_privacy);
        this.f72246OoooOOO = viewFindViewById4;
        if (viewFindViewById4 != null) {
            C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new o0Oo0oo(this, 1));
        } else {
            OooOOO0.OooOOOO("btnPrivacy");
            throw null;
        }
    }
}
