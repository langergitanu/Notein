package com.orion.notein.p607ui.user;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C21904OooOoo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.aspose.words.StyleIdentifier;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.user.DeleteAccountAgreementFragment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OO0.AbstractC24167OooO0oo;
import o0000OO0.C24183Oooo;
import o0000OO0.C24191Oooo0oO;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0OOOo0.C27174OooO0O0;
import o0Oo0O0.C28050OooO0OO;
import o0OoO000.ViewOnClickListenerC28583o0000OoO;
import o0OoO000.ViewOnClickListenerC28586o0000o0;
import o0OooOoo.ViewOnClickListenerC29578OooO00o;
import o0o000oO.ViewOnClickListenerC29777OooO00o;
import o0oOo0.C30911OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/user/DeleteAccountAgreementFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DeleteAccountAgreementFragment extends Hilt_DeleteAccountAgreementFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f79596OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ImageView f79597OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f79598Oooo000;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f79595OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23861OooO0Oo(), new OooO0OO());

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C32447OooOOo f79594OooOoo = C20519OooO0Oo.OooO0OO(new C30911OooO00o());

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.DeleteAccountAgreementFragment$deleteAccount$1", m80623f = "DeleteAccountAgreementFragment.kt", m80624l = {270, StyleIdentifier.GRID_TABLE_4}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79600OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ FirebaseUser f79601OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(FirebaseUser firebaseUser, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f79601OooOoO0 = firebaseUser;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return DeleteAccountAgreementFragment.this.new OooO00o(this.f79601OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
        
            if (oO0o0OO.C33644OoooO0.OooO00o(1500, r11) == r0) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79600OooOo0o;
            DeleteAccountAgreementFragment deleteAccountAgreementFragment = DeleteAccountAgreementFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) deleteAccountAgreementFragment.f79595OooOoo0.getValue();
                String uid = this.f79601OooOoO0.getUid();
                OooOOO0.OooO0o(uid, "getUid(...)");
                this.f79600OooOo0o = 1;
                NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) c26320o0000OoO.f90227OooOoOO.f121747OooOo0o.getValue();
                obj = (noteinFirebaseUser == null || !OooOOO0.OooO0O0(noteinFirebaseUser.getFirebaseUid(), uid)) ? new C27174OooO0O0(false, null, "199998", null, 10) : c26320o0000OoO.f90204OooO.OooO0o(noteinFirebaseUser.getId(), this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                C21030OooOO0o.OooO0OO(deleteAccountAgreementFragment).OooOOo(R.id.firebaseUserInfoFragment, true);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) obj;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o, "DeleteAccountAgreementFragment", "deleteAccount: ", c27174OooO0O0), new Object[0]);
            if (!c27174OooO0O0.f94862OooO00o || !OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
                Context context = deleteAccountAgreementFragment.getContext();
                if (context != null) {
                    String string = deleteAccountAgreementFragment.getString(R.string.toast_delete_user_failed);
                    OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0oO(context, string);
                }
                return C32460OooOooO.f116667OooO00o;
            }
            Context context2 = deleteAccountAgreementFragment.getContext();
            if (context2 != null) {
                String string2 = deleteAccountAgreementFragment.getString(R.string.toast_delete_user_successful);
                OooOOO0.OooO0o(string2, "getString(...)");
                C25206OooO0Oo.OooO0oO(context2, string2);
            }
            this.f79600OooOo0o = 2;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return DeleteAccountAgreementFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return DeleteAccountAgreementFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.DeleteAccountAgreementFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23861OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23861OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return DeleteAccountAgreementFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final void OooOoOO(final DeleteAccountAgreementFragment deleteAccountAgreementFragment, final FirebaseUser firebaseUser, C24183Oooo c24183Oooo) {
        AbstractC24167OooO0oo abstractC24167OooO0oo = c24183Oooo.f81438OooO00o;
        if (!(abstractC24167OooO0oo instanceof C24191Oooo0oO)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DeleteAccountAgreementFragment");
            c20358OooO00o.OooO0OO("Unexpected type of credential", new Object[0]);
        } else if (OooOOO0.OooO0O0(abstractC24167OooO0oo.getType(), GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL)) {
            try {
                AuthCredential credential = GoogleAuthProvider.getCredential(GoogleIdTokenCredential.INSTANCE.createFrom(abstractC24167OooO0oo.getData()).getZzb(), null);
                OooOOO0.OooO0o(credential, "getCredential(...)");
                firebaseUser.reauthenticate(credential).addOnCompleteListener(new OnCompleteListener() { // from class: o0oOo0.OooO0OO
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        kotlin.jvm.internal.OooOOO0.OooO0oO(task, "task");
                        boolean zIsSuccessful = task.isSuccessful();
                        DeleteAccountAgreementFragment deleteAccountAgreementFragment2 = this.f110481OooO00o;
                        if (zIsSuccessful) {
                            deleteAccountAgreementFragment2.OooOoo0(firebaseUser);
                            return;
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("DeleteAccountAgreementFragment");
                        c20358OooO00o2.OooO0Oo(task.getException(), "re-auth failed", new Object[0]);
                        Context context = deleteAccountAgreementFragment2.getContext();
                        if (context != null) {
                            String string = deleteAccountAgreementFragment2.getString(R.string.login_error_toast_firebase_auth_failed);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            C25206OooO0Oo.OooO0oO(context, string);
                        }
                    }
                });
                return;
            } catch (GoogleIdTokenParsingException e) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("DeleteAccountAgreementFragment");
                c20358OooO00o2.OooO0Oo(e, "Received an invalid google id token response", new Object[0]);
            }
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("DeleteAccountAgreementFragment");
            c20358OooO00o3.OooO0OO("Unexpected type of credential", new Object[0]);
        }
        Context context = deleteAccountAgreementFragment.getContext();
        if (context != null) {
            String string = deleteAccountAgreementFragment.getString(R.string.login_error_toast_provider_credential_auth_failed);
            OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
        }
    }

    public final void OooOoo0(FirebaseUser firebaseUser) {
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(firebaseUser, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C21904OooOoo0.OooO0oO(this, "FRAGMENT_KEY_REAUTH_PASSWORD", new InterfaceC32508OooOOOo() { // from class: o0oOo0.OooO0Oo
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                Bundle bundle2 = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle2, "bundle");
                String string = bundle2.getString("email");
                String string2 = bundle2.getString("password");
                final DeleteAccountAgreementFragment deleteAccountAgreementFragment = this.f110483OooOo0o;
                final FirebaseUser currentUser = ((FirebaseAuth) deleteAccountAgreementFragment.f79594OooOoo.getValue()).getCurrentUser();
                if (currentUser != null && string != null && string2 != null) {
                    AuthCredential credential = EmailAuthProvider.getCredential(string, string2);
                    kotlin.jvm.internal.OooOOO0.OooO0o(credential, "getCredential(...)");
                    currentUser.reauthenticate(credential).addOnCompleteListener(new OnCompleteListener() { // from class: o0oOo0.OooO0o0
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            kotlin.jvm.internal.OooOOO0.OooO0oO(task, "task");
                            boolean zIsSuccessful = task.isSuccessful();
                            DeleteAccountAgreementFragment deleteAccountAgreementFragment2 = deleteAccountAgreementFragment;
                            if (zIsSuccessful) {
                                deleteAccountAgreementFragment2.OooOoo0(currentUser);
                                return;
                            }
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("DeleteAccountAgreementFragment");
                            c20358OooO00o.OooO0Oo(task.getException(), "re-auth failed", new Object[0]);
                            Context context = deleteAccountAgreementFragment2.getContext();
                            if (context != null) {
                                String string3 = deleteAccountAgreementFragment2.getString(R.string.login_error_toast_firebase_auth_failed);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context, string3);
                            }
                        }
                    });
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_delete_account_agreement, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_back_to_parent);
        this.f79596OooOooO = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnBack");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC29578OooO00o(this, 4));
        View viewFindViewById2 = view.findViewById(R.id.btn_start);
        this.f79598Oooo000 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnStart");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById2, 500L, new ViewOnClickListenerC29777OooO00o(this, 2));
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_check_box_agree);
        imageView.setOnClickListener(new ViewOnClickListenerC28583o0000OoO(this, 4));
        this.f79597OooOooo = imageView;
        TextView textView = (TextView) view.findViewById(R.id.agree);
        if (textView != null) {
            C28050OooO0OO.OooO00o(textView, 500L, new ViewOnClickListenerC28586o0000o0(this, 6));
        } else {
            OooOOO0.OooOOOO("userAgreement");
            throw null;
        }
    }
}
