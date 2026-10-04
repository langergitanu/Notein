package o0Oo0oOo;

import com.orion.notein.p607ui.creative_library.OooO00o;
import com.yubico.yubikit.android.p613ui.YubiKeyPromptActivity;

/* JADX INFO: renamed from: o0Oo0oOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC28311OooO0o0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100426OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100427OooOo0o;

    public /* synthetic */ RunnableC28311OooO0o0(Object obj, int i) {
        this.f100427OooOo0o = i;
        this.f100426OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f100427OooOo0o) {
            case 0:
                ((OooO00o.OooO0O0) this.f100426OooOo).OooO00o();
                break;
            default:
                YubiKeyPromptActivity yubiKeyPromptActivity = (YubiKeyPromptActivity) this.f100426OooOo;
                if (yubiKeyPromptActivity.f80287OooOoo0) {
                    yubiKeyPromptActivity.finish();
                }
                break;
        }
    }
}
