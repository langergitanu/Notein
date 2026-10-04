package o0OOO0oO;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.huawei.hms.network.inner.api.NetworkService;
import kotlin.jvm.internal.OooOOO0;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;

/* JADX INFO: renamed from: o0OOO0oO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27060OooO0oO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public FirebaseRemoteConfig f94199OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33781o00o0O f94198OooO00o = C33784o00ooo.OooO00o(Boolean.FALSE);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C27055OooO0O0 f94200OooO0OO = new C27055OooO0O0(this);

    public C27060OooO0oO(AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO) {
    }

    public final String OooO00o(String str) {
        if (!((Boolean) this.f94198OooO00o.getValue()).booleanValue()) {
            return "";
        }
        FirebaseRemoteConfig firebaseRemoteConfig = this.f94199OooO0O0;
        if (firebaseRemoteConfig == null) {
            OooOOO0.OooOOOO(NetworkService.Constants.CONFIG_SERVICE);
            throw null;
        }
        String string = firebaseRemoteConfig.getString(str);
        OooOOO0.OooO0o(string, "getString(...)");
        return string;
    }
}
