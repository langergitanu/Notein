package o0ooooOo;

import com.yubico.yubikit.android.p613ui.YubiKeyPromptActivity;
import com.yubico.yubikit.android.transport.nfc.OooO0OO;
import com.yubico.yubikit.android.transport.nfc.OooOO0O;
import com.yubico.yubikit.android.transport.usb.OooO;

/* JADX INFO: renamed from: o0ooooOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31873OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO f113568OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O f113569OooO0O0;

    public C31873OooO00o(YubiKeyPromptActivity yubiKeyPromptActivity) {
        OooOO0O oooOO0O;
        OooO oooO = new OooO(yubiKeyPromptActivity.getApplicationContext());
        try {
            oooOO0O = new OooOO0O(yubiKeyPromptActivity.getApplicationContext());
        } catch (OooO0OO unused) {
            oooOO0O = null;
        }
        this.f113568OooO00o = oooO;
        this.f113569OooO0O0 = oooOO0O;
    }
}
