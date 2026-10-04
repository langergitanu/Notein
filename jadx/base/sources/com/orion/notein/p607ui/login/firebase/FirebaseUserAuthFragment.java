package com.orion.notein.p607ui.login.firebase;

import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import Oooo0oO.C21030OooOO0o;
import OooooOO.C21335Oooo0oO;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import androidx.transition.OooOOOO;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.aspose.words.StyleIdentifier;
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
import o0000OO.C24163OooOOOo;
import o0000OO.OooOO0O;
import o0000OO0.AbstractC24167OooO0oo;
import o0000OO0.C24183Oooo;
import o0000OO0.C24191Oooo0oO;
import o0000OO0.C24192Oooo0oo;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.OooOO0;
import o0Oo.ViewOnClickListenerC28012OooO0O0;
import o0Oo.ViewOnClickListenerC28013OooO0OO;
import o0Oo00o.C28026OooO0OO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0oOo.ViewOnClickListenerC28318OooOOO0;
import o0Oo0oOo.ViewOnClickListenerC28324OooOo;
import o0OoO000.C28556OoooO0;
import o0OoO000.C28560OoooOOO;
import o0OoO000.C28570Oooooo;
import o0OoO000.C28601ooOO;
import o0OoO000.ViewOnClickListenerC28565Ooooo00;
import o0OoO000.ViewOnClickListenerC28566Ooooo0o;
import o0OoO000.ViewOnClickListenerC28568OooooOO;
import o0oo000O.C31183OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/firebase/FirebaseUserAuthFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FirebaseUserAuthFragment extends Hilt_FirebaseUserAuthFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public EditText f72325Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f72326Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f72327Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final FirebaseAuth f72328Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f72329Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public ImageView f72330Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public CircularProgressIndicator f72331Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ImageView f72332Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f72333Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public CircularProgressIndicator f72334Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f72335Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public View f72336OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public View f72337OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public View f72338OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public View f72339OoooO0O;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserAuthFragment$confirmLoginWithGoogle$1", m80623f = "FirebaseUserAuthFragment.kt", m80624l = {380}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72341OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C28601ooOO f72342OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C28601ooOO c28601ooOO, Continuation continuation) {
            super(2, continuation);
            this.f72342OooOoO0 = c28601ooOO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return FirebaseUserAuthFragment.this.new OooO00o(this.f72342OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72341OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f72341OooOo0o = 1;
                if (C33644OoooO0.OooO00o(3000L, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            FirebaseUserAuthFragment firebaseUserAuthFragment = FirebaseUserAuthFragment.this;
            firebaseUserAuthFragment.Oooo0o0(false);
            firebaseUserAuthFragment.Oooo0();
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(firebaseUserAuthFragment), this.f72342OooOoO0);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserAuthFragment$onViewCreated$9", m80623f = "FirebaseUserAuthFragment.kt", m80624l = {141}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72344OooOo0o;

        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ FirebaseUserAuthFragment f72345OooOo0o;

            public OooO00o(FirebaseUserAuthFragment firebaseUserAuthFragment) {
                this.f72345OooOo0o = firebaseUserAuthFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                this.f72345OooOo0o.Oooo0OO(((Number) obj).intValue());
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return FirebaseUserAuthFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72344OooOo0o;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw OooOOOO.OooO0O0(obj);
            }
            C32446OooOOOo.OooO0O0(obj);
            FirebaseUserAuthFragment firebaseUserAuthFragment = FirebaseUserAuthFragment.this;
            C33772OooooOo c33772OooooOo = ((C28560OoooOOO) firebaseUserAuthFragment.f72327Oooo000.getValue()).f101230OooOO0o;
            OooO00o oooO00o = new OooO00o(firebaseUserAuthFragment);
            this.f72344OooOo0o = 1;
            c33772OooooOo.getClass();
            C33772OooooOo.OooOO0O(c33772OooooOo, oooO00o, this);
            return enumC32485OooO00o;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserAuthFragment$signInWithGoogle$1", m80623f = "FirebaseUserAuthFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_5}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72347OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ boolean f72348OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C24192Oooo0oo f72349OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C24192Oooo0oo c24192Oooo0oo, boolean z, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f72349OooOoO0 = c24192Oooo0oo;
            this.f72348OooOoO = z;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return FirebaseUserAuthFragment.this.new OooO0OO(this.f72349OooOoO0, this.f72348OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72347OooOo0o;
            FirebaseUserAuthFragment firebaseUserAuthFragment = FirebaseUserAuthFragment.this;
            try {
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    firebaseUserAuthFragment.Oooo0o0(true);
                    ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = firebaseUserAuthFragment.requireActivity();
                    OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                    o0000OO0.OooOOOO oooOOOO = new o0000OO0.OooOOOO(activityC21897OooOo0RequireActivity);
                    ActivityC21897OooOo0 activityC21897OooOo0RequireActivity2 = firebaseUserAuthFragment.requireActivity();
                    OooOOO0.OooO0o(activityC21897OooOo0RequireActivity2, "requireActivity(...)");
                    C24192Oooo0oo c24192Oooo0oo = this.f72349OooOoO0;
                    this.f72347OooOo0o = 1;
                    obj = oooOOOO.OooO0O0(activityC21897OooOo0RequireActivity2, c24192Oooo0oo, this);
                    if (obj == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                }
                FirebaseUserAuthFragment.Oooo00o(firebaseUserAuthFragment, (C24183Oooo) obj);
            } catch (OooOO0O e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FirebaseLoginFragment");
                c20358OooO00o.OooO0OO(C22237OooO0o0.OooO00o("Error getting credential. type=", e.OooO00o(), ", message=", e.getMessage()), new Object[0]);
                if (this.f72348OooOoO && (e instanceof C24163OooOOOo)) {
                    firebaseUserAuthFragment.Oooo0oO(false);
                } else {
                    firebaseUserAuthFragment.Oooo0OO(1006);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseUserAuthFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23171OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public C23171OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(FirebaseUserAuthFragment.this).OooO0o(R.id.firebaseUserAuthFragment);
        }
    }

    public static final class OooO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72351OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72351OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f72351OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseUserAuthFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23172OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72352OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23172OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72352OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f72352OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.firebase.FirebaseUserAuthFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23173OooO0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f72353OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23173OooO0oO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f72353OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = FirebaseUserAuthFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f72353OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public FirebaseUserAuthFragment() {
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C23171OooO0Oo());
        C23172OooO0o0 c23172OooO0o0 = new C23172OooO0o0(c32447OooOOoOooO0OO);
        this.f72327Oooo000 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28560OoooOOO.class), c23172OooO0o0, new C23173OooO0oO(c32447OooOOoOooO0OO), new OooO0o(c32447OooOOoOooO0OO));
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        OooOOO0.OooO0o(firebaseAuth, "getInstance(...)");
        this.f72328Oooo00O = firebaseAuth;
    }

    public static final void Oooo00o(FirebaseUserAuthFragment firebaseUserAuthFragment, C24183Oooo c24183Oooo) {
        firebaseUserAuthFragment.getClass();
        AbstractC24167OooO0oo abstractC24167OooO0oo = c24183Oooo.f81438OooO00o;
        if (!(abstractC24167OooO0oo instanceof C24191Oooo0oO)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseLoginFragment");
            c20358OooO00o.OooO0OO("Unexpected type of credential", new Object[0]);
        } else if (OooOOO0.OooO0O0(abstractC24167OooO0oo.getType(), GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL)) {
            try {
                firebaseUserAuthFragment.Oooo0O0(GoogleIdTokenCredential.INSTANCE.createFrom(abstractC24167OooO0oo.getData()));
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
        firebaseUserAuthFragment.Oooo0OO(1007);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_firebase_user_auth;
    }

    public final void Oooo0() {
        EditText editText = this.f72325Oooo;
        if (editText == null) {
            OooOOO0.OooOOOO("etEmail");
            throw null;
        }
        editText.getText().clear();
        EditText editText2 = this.f72325Oooo;
        if (editText2 != null) {
            editText2.clearFocus();
        } else {
            OooOOO0.OooOOOO("etEmail");
            throw null;
        }
    }

    public final void Oooo0O0(GoogleIdTokenCredential googleIdTokenCredential) {
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
        OooOOO0.OooO0Oo(uri);
        Bundle extras = BundleKt.bundleOf(new C32443OooOOO("id_token", zzb));
        OooOOO0.OooO0oO(email, "email");
        OooOOO0.OooO0oO(extras, "extras");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooO00o(new C28601ooOO("google", str, email, uri, extras), null), 3);
    }

    public final void Oooo0OO(int i) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "FirebaseLoginFragment", "handleLoginResult: ", i), new Object[0]);
        Oooo0o0(false);
        Oooo0o(false);
        if (i == 1000) {
            return;
        }
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        C21989OooOooO.OooO00o(this).OooO0O0(new C28570Oooooo(this, C21335Oooo0oO.OooO0OO(contextRequireContext, i), null));
    }

    public final void Oooo0o(boolean z) {
        View view = this.f72333Oooo0o0;
        if (view == null) {
            OooOOO0.OooOOOO("btnMicrosoft");
            throw null;
        }
        view.setClickable(!z);
        ImageView imageView = this.f72332Oooo0o;
        if (imageView == null) {
            OooOOO0.OooOOOO("ivMicrosoft");
            throw null;
        }
        imageView.setVisibility(!z ? 0 : 8);
        CircularProgressIndicator circularProgressIndicator = this.f72334Oooo0oO;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setVisibility(z ? 0 : 8);
        } else {
            OooOOO0.OooOOOO("cpiMicrosoft");
            throw null;
        }
    }

    public final void Oooo0o0(boolean z) {
        View view = this.f72326Oooo0;
        if (view == null) {
            OooOOO0.OooOOOO("btnGoogle");
            throw null;
        }
        view.setClickable(!z);
        ImageView imageView = this.f72330Oooo0O0;
        if (imageView == null) {
            OooOOO0.OooOOOO("ivGoogle");
            throw null;
        }
        imageView.setVisibility(!z ? 0 : 8);
        CircularProgressIndicator circularProgressIndicator = this.f72331Oooo0OO;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setVisibility(z ? 0 : 8);
        } else {
            OooOOO0.OooOOOO("cpiGoogle");
            throw null;
        }
    }

    public final void Oooo0oO(boolean z) {
        GetSignInWithGoogleOption getSignInWithGoogleOptionBuild = new GetSignInWithGoogleOption.Builder(C31183OooO00o.f111224OooO0Oo).build();
        new ArrayList();
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooO0OO(new C24192Oooo0oo(OooOo.o0ooOO0(OooOo.o0ooOoO(com.facebook.soloader.OooOo.OooO0oO(getSignInWithGoogleOptionBuild)))), z, null), 3);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        C28560OoooOOO c28560OoooOOO = (C28560OoooOOO) this.f72327Oooo000.getValue();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C28556OoooO0(c28560OoooOOO, null), 3);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        View viewFindViewById = view.findViewById(R.id.iv_back);
        this.f72329Oooo00o = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28318OooOOO0(this, 1));
        this.f72338OoooO00 = view.findViewById(R.id.switch_signup);
        View viewFindViewById2 = view.findViewById(R.id.switch_login);
        this.f72337OoooO0 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnLogin");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC28565Ooooo00(this, 0));
        this.f72330Oooo0O0 = (ImageView) view.findViewById(R.id.iv_google);
        this.f72331Oooo0OO = (CircularProgressIndicator) view.findViewById(R.id.cpi_google);
        View viewFindViewById3 = view.findViewById(R.id.btn_google);
        this.f72326Oooo0 = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnGoogle");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById3, 500L, new ViewOnClickListenerC28566Ooooo0o(this, 0));
        this.f72332Oooo0o = (ImageView) view.findViewById(R.id.iv_microsoft);
        this.f72334Oooo0oO = (CircularProgressIndicator) view.findViewById(R.id.cpi_microsoft);
        View viewFindViewById4 = view.findViewById(R.id.btn_microsoft);
        this.f72333Oooo0o0 = viewFindViewById4;
        if (viewFindViewById4 == null) {
            OooOOO0.OooOOOO("btnMicrosoft");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById4, 500L, new ViewOnClickListenerC28324OooOo(this, 1));
        EditText editText = (EditText) view.findViewById(R.id.et_email);
        this.f72325Oooo = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("etEmail");
            throw null;
        }
        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0OoO000.OooooO0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                view.findViewById(R.id.email_wrapper).setActivated(z);
            }
        });
        View viewFindViewById5 = view.findViewById(R.id.btn_email);
        this.f72335Oooo0oo = viewFindViewById5;
        if (viewFindViewById5 == null) {
            OooOOO0.OooOOOO("btnEmail");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById5, 500L, new ViewOnClickListenerC28012OooO0O0(this, 2));
        View viewFindViewById6 = view.findViewById(R.id.btn_terms);
        this.f72339OoooO0O = viewFindViewById6;
        if (viewFindViewById6 == null) {
            OooOOO0.OooOOOO("btnTerms");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById6, 500L, new ViewOnClickListenerC28013OooO0OO(this, 1));
        View viewFindViewById7 = view.findViewById(R.id.btn_privacy);
        this.f72336OoooO = viewFindViewById7;
        if (viewFindViewById7 == null) {
            OooOOO0.OooOOOO("btnPrivacy");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById7, 500L, new ViewOnClickListenerC28568OooooOO(this, 0));
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooO0O0(null), 3);
        Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
            if (connectivityManager == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("FirebaseLoginFragment");
                c20358OooO00o.OooO0OO("checkNetworkState: connectivityManager is null", new Object[0]);
                return;
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("FirebaseLoginFragment");
                c20358OooO00o2.OooO0OO("checkNetworkState: currentNetwork is null", new Object[0]);
                Oooo0OO(1002);
                return;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("FirebaseLoginFragment");
            c20358OooO00o3.OooO0o0("checkNetworkState: currentNetwork=" + activeNetwork, new Object[0]);
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                c20358OooO00o3.OooOOO0("FirebaseLoginFragment");
                c20358OooO00o3.OooO0OO("checkNetworkState: network is not connected", new Object[0]);
                Oooo0OO(1002);
            }
            c20358OooO00o3.OooOOO0("FirebaseLoginFragment");
            c20358OooO00o3.OooO00o("checkNetworkState: network is connected", new Object[0]);
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("FirebaseLoginFragment");
            c20358OooO00o4.OooO0Oo(e, "checkNetworkState: failed", new Object[0]);
        }
    }
}
