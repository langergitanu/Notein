package com.orion.notein.p607ui.noteeditor;

import OooO0oO.C20439OooO0oo;
import OooOoOO.C20519OooO0Oo;
import Oooo0.C20860Ooooooo;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.activity.result.ActivityResult;
import androidx.biometric.C21589OooO0Oo;
import androidx.biometric.C21590OooO0o0;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0Oo00oo.C28039OooO00o;
import o0OoO0.C28513OooO0oO;
import o0OoO0oo.C28706OooOo0O;
import o0OoO0oo.C28709OooOoO0;
import o0OoO0oo.C28711OooOoo;
import o0OoO0oo.C28719Oooo00o;
import o0OoO0oo.C28729OoooO0O;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/LockNoteFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LockNoteFragment extends Hilt_LockNoteFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f72796OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f72797OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f72798OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final OooO0o.OooO0O0<Intent> f72799OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C28709OooOoO0 f72800Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public oO0O000o.OooO00o<C32460OooOooO> f72801Oooo00O;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C28706OooOo0O f72802OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C28706OooOo0O c28706OooOo0O) {
            super(0);
            this.f72802OooOo0o = c28706OooOo0O;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72802OooOo0o.invoke();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72803OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72803OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72803OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72804OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72804OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72804OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.LockNoteFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23211OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72805OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23211OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72805OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72805OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? LockNoteFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public LockNoteFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO00o(new C28706OooOo0O(this, 0)));
        this.f72797OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28729OoooO0O.class), new OooO0O0(interfaceC32440OooOO0OooO0O0), new C23211OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0OO(interfaceC32440OooOO0OooO0O0));
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult = registerForActivityResult(new C20439OooO0oo(), new com.google.firebase.crashlytics.internal.concurrency.OooO0O0(this));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult, "registerForActivityResult(...)");
        this.f72796OooOoo = oooO0O0RegisterForActivityResult;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult2 = registerForActivityResult(new C20439OooO0oo(), new com.google.firebase.crashlytics.internal.concurrency.OooO0OO(this));
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult2, "registerForActivityResult(...)");
        this.f72798OooOooO = oooO0O0RegisterForActivityResult2;
        OooO0o.OooO0O0<Intent> oooO0O0RegisterForActivityResult3 = registerForActivityResult(new C20439OooO0oo(), new OooO0o.OooO00o() { // from class: o0OoO0oo.OooOo0o
            @Override // OooO0o.OooO00o
            public final void OooO0O0(Object obj) {
                ActivityResult result = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                if (result.f62240OooOo0o != -1) {
                    this.f101708OooOo0o.OooOoo0(R.string.must_set_device_screen_password);
                }
            }
        });
        OooOOO0.OooO0o(oooO0O0RegisterForActivityResult3, "registerForActivityResult(...)");
        this.f72799OooOooo = oooO0O0RegisterForActivityResult3;
    }

    public static final void OooOoO(LockNoteFragment lockNoteFragment, OooOo oooOo, String str, oO0O000o.OooO00o oooO00o, oO0O000o.OooO00o oooO00o2) {
        int i;
        C21590OooO0o0.C21591OooO0Oo c21591OooO0OoOooO00o;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 29) {
            i = 15;
        } else {
            i = 32783;
            if (new C21589OooO0Oo(new C21589OooO0Oo.OooO0OO(lockNoteFragment.requireContext())).OooO00o(32783) == 12) {
                i = 32768;
            }
        }
        String string = lockNoteFragment.getString(R.string.biometric_prompt_description);
        OooOOO0.OooO0o(string, "getString(...)");
        if (i2 <= 29) {
            C21590OooO0o0.C21591OooO0Oo.OooO00o oooO00o3 = new C21590OooO0o0.C21591OooO0Oo.OooO00o();
            oooO00o3.f63242OooO00o = str;
            oooO00o3.f63245OooO0Oo = i;
            oooO00o3.f63244OooO0OO = lockNoteFragment.getString(R.string.cancel);
            if (C28039OooO00o.OooO0Oo()) {
                oooO00o3.f63243OooO0O0 = string;
            }
            c21591OooO0OoOooO00o = oooO00o3.OooO00o();
        } else {
            C21590OooO0o0.C21591OooO0Oo.OooO00o oooO00o4 = new C21590OooO0o0.C21591OooO0Oo.OooO00o();
            oooO00o4.f63242OooO00o = str;
            oooO00o4.f63245OooO0Oo = i;
            if (C28039OooO00o.OooO0Oo()) {
                oooO00o4.f63243OooO0O0 = string;
            }
            c21591OooO0OoOooO00o = oooO00o4.OooO00o();
        }
        int iOooO00o = new C21589OooO0Oo(new C21589OooO0Oo.OooO0OO(lockNoteFragment.requireContext())).OooO00o(i);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "LockNoteFragment", "LockNoteFragment, canAuthenticate result: ", iOooO00o), new Object[0]);
        lockNoteFragment.f72800Oooo000 = new C28709OooOoO0(oooOo, lockNoteFragment, oooO00o);
        lockNoteFragment.f72801Oooo00O = oooO00o2;
        try {
            if (iOooO00o == 11) {
                Intent intent = new Intent("android.settings.BIOMETRIC_ENROLL");
                intent.putExtra("android.provider.extra.BIOMETRIC_AUTHENTICATORS_ALLOWED", i);
                lockNoteFragment.f72796OooOoo.OooO00o(intent);
            } else {
                C28711OooOoo c28711OooOoo = new C28711OooOoo(lockNoteFragment);
                Fragment parentFragment = lockNoteFragment.getParentFragment();
                OooOOO0.OooO0o0(parentFragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
                new C21590OooO0o0(parentFragment, ContextCompat.getMainExecutor(lockNoteFragment.requireContext()), c28711OooOoo).OooO00o(c21591OooO0OoOooO00o);
            }
        } catch (ActivityNotFoundException unused) {
            Context context = lockNoteFragment.getContext();
            Object systemService = context != null ? context.getSystemService("keyguard") : null;
            KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
            if (keyguardManager == null) {
                lockNoteFragment.OooOoo0(R.string.current_device_not_supported_add_lock);
                return;
            }
            if (!keyguardManager.isDeviceSecure()) {
                lockNoteFragment.f72799OooOooo.OooO00o(new Intent("android.app.action.SET_NEW_PASSWORD"));
                return;
            }
            Intent intentCreateConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(str, "");
            if (intentCreateConfirmDeviceCredentialIntent != null) {
                lockNoteFragment.f72798OooOooO.OooO00o(intentCreateConfirmDeviceCredentialIntent);
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("LockNoteFragment");
            c20358OooO00o2.OooO0Oo(e, "authenticate error.", new Object[0]);
            lockNoteFragment.OooOoo0(R.string.current_device_not_supported_add_lock);
        }
    }

    public static void OooOoo(final LockNoteFragment lockNoteFragment, OooOo viewLifeCycleScope, List list, oO0O000o.OooO00o oooO00o) {
        oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o() { // from class: o0OoO0oo.OooOo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                this.f101704OooOo0o.OooOoo0(R.string.unlock_failed);
                return C32460OooOooO.f116667OooO00o;
            }
        };
        lockNoteFragment.getClass();
        OooOOO0.OooO0oO(viewLifeCycleScope, "viewLifeCycleScope");
        C33609OooO0oo.OooO0OO(viewLifeCycleScope, null, null, new C28719Oooo00o(lockNoteFragment, list, oooO00o, viewLifeCycleScope, oooO00o2, null), 3);
    }

    public final C28729OoooO0O OooOoOO() {
        return (C28729OoooO0O) this.f72797OooOoo0.getValue();
    }

    public final void OooOoo0(int i) {
        Context context = getContext();
        if (context != null) {
            C28513OooO0oO.OooO00o(context, i, "getString(...)", context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f72796OooOoo.OooO0O0();
        this.f72798OooOooO.OooO0O0();
        this.f72799OooOooo.OooO0O0();
    }
}
