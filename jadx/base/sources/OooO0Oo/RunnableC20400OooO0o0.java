package OooO0Oo;

import com.google.firebase.firestore.util.Util;
import com.orion.notein.global.R;
import com.yubico.yubikit.android.p613ui.YubiKeyPromptActivity;

/* JADX INFO: renamed from: OooO0Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC20400OooO0o0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f58185OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f58186OooOo0o;

    public /* synthetic */ RunnableC20400OooO0o0(Object obj, int i) {
        this.f58186OooOo0o = i;
        this.f58185OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f58186OooOo0o) {
            case 0:
                ((OooOO0O) this.f58185OooOo).invalidateMenu();
                break;
            case 1:
                Util.lambda$crashMainThread$1((RuntimeException) this.f58185OooOo);
                break;
            default:
                ((YubiKeyPromptActivity) this.f58185OooOo).f80289OooOooo.setText(R.string.yubikit_prompt_remove);
                break;
        }
    }
}
