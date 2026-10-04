package OoooOoo;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: OoooOoo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21242OooO0o0 extends AutofillManager.AutofillCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C21242OooO0o0 f61623OooO00o = new C21242OooO0o0();

    public final void OooO00o(C21237OooO00o autofill) {
        OooOOO0.OooO0oO(autofill, "autofill");
        autofill.f61620OooO0OO.registerCallback(this);
    }

    public final void OooO0O0(C21237OooO00o autofill) {
        OooOOO0.OooO0oO(autofill, "autofill");
        autofill.f61620OooO0OO.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public final void onAutofillEvent(View view, int i, int i2) {
        OooOOO0.OooO0oO(view, "view");
        super.onAutofillEvent(view, i, i2);
        Log.d("Autofill Status", i2 != 1 ? i2 != 2 ? i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
