package o0oooOoO;

import android.provider.Settings;
import android.text.TextUtils;
import o0oooOo.AbstractActivityC31852OooO0O0;
import o0oooo0.C31864OooO0O0;
import o0oooo0.InterfaceC31863OooO00o;

/* JADX INFO: renamed from: o0oooOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31861OooO00o implements InterfaceC31863OooO00o {
    @Override // o0oooo0.InterfaceC31863OooO00o
    public final String OooO00o(AbstractActivityC31852OooO0O0 abstractActivityC31852OooO0O0) throws C31864OooO0O0 {
        String string = Settings.Secure.getString(abstractActivityC31852OooO0O0.getContentResolver(), "android_id");
        if (TextUtils.isEmpty(string)) {
            throw new C31864OooO0O0("get empty android-id from settings provider");
        }
        return string;
    }
}
