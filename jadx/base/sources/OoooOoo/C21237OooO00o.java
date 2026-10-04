package OoooOoo;

import android.view.autofill.AutofillManager;
import androidx.compose.p002ui.platform.AndroidComposeView;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: OoooOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21237OooO00o implements InterfaceC21238OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AndroidComposeView f61618OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C21243OooO0oO f61619OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AutofillManager f61620OooO0OO;

    public C21237OooO00o(AndroidComposeView androidComposeView, C21243OooO0oO autofillTree) {
        OooOOO0.OooO0oO(autofillTree, "autofillTree");
        this.f61618OooO00o = androidComposeView;
        this.f61619OooO0O0 = autofillTree;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f61620OooO0OO = autofillManager;
        androidComposeView.setImportantForAutofill(1);
    }
}
