package OooO0Oo;

import OooO0Oo.OooOO0O;
import com.orion.notein.global.R;
import com.yubico.yubikit.android.p613ui.YubiKeyPromptActivity;

/* JADX INFO: renamed from: OooO0Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC20407OooOO0o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f58202OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f58203OooOo0o;

    public /* synthetic */ RunnableC20407OooOO0o(Object obj, int i) {
        this.f58203OooOo0o = i;
        this.f58202OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f58203OooOo0o) {
            case 0:
                OooOO0O.OooO0o oooO0o = (OooOO0O.OooO0o) this.f58202OooOo;
                Runnable runnable = oooO0o.f58195OooOo;
                if (runnable != null) {
                    runnable.run();
                    oooO0o.f58195OooOo = null;
                }
                break;
            default:
                ((YubiKeyPromptActivity) this.f58202OooOo).f80289OooOooo.setText(R.string.yubikit_prompt_wait);
                break;
        }
    }
}
