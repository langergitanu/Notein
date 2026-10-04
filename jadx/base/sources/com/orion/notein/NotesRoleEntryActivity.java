package com.orion.notein;

import android.app.KeyguardManager;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.navigation.fragment.NavHostFragment;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24587OooOoo;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.AbstractActivityC26284Oooo000;
import o0O0oooO.C26256OooO0o;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.o0000O0O;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;
import oOo0000O.OooO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/NotesRoleEntryActivity;", "Lcom/orion/notein/MainActivity;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NotesRoleEntryActivity extends AbstractActivityC26284Oooo000 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public KeyguardManager f69760OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Boolean f69761OooOoO0;

    public static final class OooO00o extends KeyguardManager.KeyguardDismissCallback {
        public OooO00o() {
        }

        @Override // android.app.KeyguardManager.KeyguardDismissCallback
        public final void onDismissCancelled() {
            super.onDismissCancelled();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o.OooO0o0("onDismissCancelled", new Object[0]);
        }

        @Override // android.app.KeyguardManager.KeyguardDismissCallback
        public final void onDismissError() {
            super.onDismissError();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o.OooO0o0("onDismissError", new Object[0]);
        }

        @Override // android.app.KeyguardManager.KeyguardDismissCallback
        public final void onDismissSucceeded() {
            super.onDismissSucceeded();
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o.OooO0o0("onDismissSucceeded", new Object[0]);
            NotesRoleEntryActivity notesRoleEntryActivity = NotesRoleEntryActivity.this;
            C26320o0000OoO userViewModel = notesRoleEntryActivity.getUserViewModel();
            Boolean bool = Boolean.FALSE;
            C33781o00o0O c33781o00o0O = userViewModel.f90251OoooOoO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, bool);
            notesRoleEntryActivity.f69761OooOoO0 = bool;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.NotesRoleEntryActivity$onCreate$1", m80623f = "NotesRoleEntryActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f69764OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.NotesRoleEntryActivity$onCreate$1$1", m80623f = "NotesRoleEntryActivity.kt", m80624l = {35}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NotesRoleEntryActivity f69765OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69766OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.NotesRoleEntryActivity$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.NotesRoleEntryActivity$onCreate$1$1$1", m80623f = "NotesRoleEntryActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19128OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f69767OooOo0o;

                public C19128OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19128OooO00o c19128OooO00o = new C19128OooO00o(2, continuation);
                    c19128OooO00o.f69767OooOo0o = ((Boolean) obj).booleanValue();
                    return c19128OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C19128OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f69767OooOo0o;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NotesRoleEntryActivity");
                    c20358OooO00o.OooO0o0("lockScreenState: " + z, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NotesRoleEntryActivity notesRoleEntryActivity, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f69765OooOo = notesRoleEntryActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f69765OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69766OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C33781o00o0O c33781o00o0O = this.f69765OooOo.getUserViewModel().f90252OoooOoo;
                    C19128OooO00o c19128OooO00o = new C19128OooO00o(2, null);
                    this.f69766OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33781o00o0O, c19128OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.NotesRoleEntryActivity$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.NotesRoleEntryActivity$onCreate$1$2", m80623f = "NotesRoleEntryActivity.kt", m80624l = {40}, m80625m = "invokeSuspend")
        public static final class C19129OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ NotesRoleEntryActivity f69768OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f69769OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.NotesRoleEntryActivity$OooO0O0$OooO0O0$OooO00o */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.NotesRoleEntryActivity$onCreate$1$2$1", m80623f = "NotesRoleEntryActivity.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f69770OooOo0o;

                public OooO00o() {
                    throw null;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    OooO00o oooO00o = new OooO00o(2, continuation);
                    oooO00o.f69770OooOo0o = obj;
                    return oooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO00o) create(bool, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    Boolean bool = (Boolean) this.f69770OooOo0o;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("NotesRoleEntryActivity");
                    c20358OooO00o.OooO0o0("isAllowedToShowHistoricalNotes: " + bool, new Object[0]);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19129OooO0O0(NotesRoleEntryActivity notesRoleEntryActivity, Continuation<? super C19129OooO0O0> continuation) {
                super(2, continuation);
                this.f69768OooOo = notesRoleEntryActivity;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19129OooO0O0(this.f69768OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19129OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f69769OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    C33769Ooooo0o c33769Ooooo0o = this.f69768OooOo.getUserViewModel().f90253Ooooo00;
                    OooO00o oooO00o = new OooO00o(2, null);
                    this.f69769OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33769Ooooo0o, oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = NotesRoleEntryActivity.this.new OooO0O0(continuation);
            oooO0O0.f69764OooOo0o = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f69764OooOo0o;
            NotesRoleEntryActivity notesRoleEntryActivity = NotesRoleEntryActivity.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(notesRoleEntryActivity, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19129OooO0O0(notesRoleEntryActivity, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public final boolean OoooO() {
        Object systemService = getSystemService("keyguard");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        KeyguardManager keyguardManager = (KeyguardManager) systemService;
        boolean zIsKeyguardLocked = keyguardManager.isKeyguardLocked();
        C26320o0000OoO userViewModel = getUserViewModel();
        Boolean boolValueOf = Boolean.valueOf(zIsKeyguardLocked);
        C33781o00o0O c33781o00o0O = userViewModel.f90251OoooOoO;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, boolValueOf);
        if (!zIsKeyguardLocked) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o.OooO0o0("Keyguard is not locked, allowing access to historical notes", new Object[0]);
            return true;
        }
        if (OoooOO0()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o2.OooO0o0("User is allowed to show historical notes, allowing access", new Object[0]);
            return true;
        }
        OooO00o oooO00o = new OooO00o();
        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o3.OooOOO0("NotesRoleEntryActivity");
        c20358OooO00o3.OooO0o0("Keyguard is locked, requesting to dismiss keyguard", new Object[0]);
        keyguardManager.requestDismissKeyguard(this, oooO00o);
        return false;
    }

    public final void OoooO0O() {
        Fragment fragmentOooOooO = getSupportFragmentManager().OooOooO(R.id.nav_host_fragment);
        OooOOO0.OooO0o0(fragmentOooOooO, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        try {
            ((NavHostFragment) fragmentOooOooO).OooOoO0().OooOOO0(R.id.noteListContainerFragment, BundleKt.bundleOf(new C32443OooOOO("create_blank_note", Boolean.TRUE)), new C24587OooOoo(false, false, R.id.noteListContainerFragment, true, false, -1, -1, -1, -1));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OoooOO0() {
        Boolean bool = (Boolean) getUserViewModel().f90253Ooooo00.f121747OooOo0o.getValue();
        if (bool != null) {
            return bool.booleanValue();
        }
        C26320o0000OoO userViewModel = getUserViewModel();
        userViewModel.getClass();
        return ((Boolean) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new o0000O0O(null, userViewModel))).booleanValue();
    }

    @Override // com.orion.notein.MainActivity, o0O0oooO.AbstractActivityC26280OooOooO, androidx.fragment.app.ActivityC21897OooOo0, OooO0Oo.OooOO0O, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Object systemService = getSystemService((Class<Object>) KeyguardManager.class);
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
        this.f69760OooOo = (KeyguardManager) systemService;
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this), null, null, new OooO0O0(null), 3);
        KeyguardManager keyguardManager = this.f69760OooOo;
        if (keyguardManager == null) {
            OooOOO0.OooOOOO("keyguardManager");
            throw null;
        }
        if (!keyguardManager.isKeyguardLocked()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o.OooO0o0("Keyguard is not locked, creating a blank note", new Object[0]);
            OoooO0O();
            return;
        }
        if (OoooOO0()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o2.OooO0o0("User is allowed to show historical notes, navigating to NoteListContainerFragment", new Object[0]);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o3.OooO0o0("User is not allowed to show historical notes, creating a blank note", new Object[0]);
            OoooO0O();
        }
    }

    @Override // com.orion.notein.MainActivity, androidx.fragment.app.ActivityC21897OooOo0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!C26256OooO0o.OooO00o(this)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o.OooO0OO("User has not agreed to the privacy policy, redirecting to PrivacyPolicyActivity", new Object[0]);
            finish();
        }
        KeyguardManager keyguardManager = this.f69760OooOo;
        if (keyguardManager == null) {
            OooOOO0.OooOOOO("keyguardManager");
            throw null;
        }
        boolean zIsKeyguardLocked = keyguardManager.isKeyguardLocked();
        C26320o0000OoO userViewModel = getUserViewModel();
        Boolean boolValueOf = Boolean.valueOf(zIsKeyguardLocked);
        C33781o00o0O c33781o00o0O = userViewModel.f90251OoooOoO;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, boolValueOf);
        if (!zIsKeyguardLocked) {
            if (OooOOO0.OooO0O0(this.f69761OooOoO0, Boolean.TRUE)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("NotesRoleEntryActivity");
                c20358OooO00o2.OooO0o0("Keyguard is not locked, previously launched from lock screen", new Object[0]);
            } else if (OooOOO0.OooO0O0(this.f69761OooOoO0, Boolean.FALSE)) {
                C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o3.OooOOO0("NotesRoleEntryActivity");
                c20358OooO00o3.OooO0o0("Keyguard is not locked, previously not launched from lock screen", new Object[0]);
            }
            this.f69761OooOoO0 = Boolean.FALSE;
            return;
        }
        Boolean bool = this.f69761OooOoO0;
        Boolean bool2 = Boolean.TRUE;
        if (OooOOO0.OooO0O0(bool, bool2)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o4.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o4.OooO0o0("Keyguard is locked, previously launched from lock screen", new Object[0]);
        } else if (OooOOO0.OooO0O0(this.f69761OooOoO0, Boolean.FALSE)) {
            C34406OooO00o.C20358OooO00o c20358OooO00o5 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o5.OooOOO0("NotesRoleEntryActivity");
            c20358OooO00o5.OooO0o0("Keyguard is locked, previously not launched from lock screen", new Object[0]);
            finish();
        }
        this.f69761OooOoO0 = bool2;
    }
}
