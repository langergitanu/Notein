package o0OOO0oO;

import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.huawei.hms.network.inner.api.NetworkService;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOO0oO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27058OooO0o implements ConfigUpdateListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C27060OooO0oO f94197OooO00o;

    public C27058OooO0o(C27060OooO0oO c27060OooO0oO) {
        this.f94197OooO00o = c27060OooO0oO;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public final void onError(FirebaseRemoteConfigException error) {
        OooOOO0.OooO0oO(error, "error");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("FirebaseRemoteConfigDataSource");
        c20358OooO00o.OooOO0O("Config update error with code: " + error.getCode() + ", " + error, new Object[0]);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public final void onUpdate(ConfigUpdate configUpdate) {
        OooOOO0.OooO0oO(configUpdate, "configUpdate");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("FirebaseRemoteConfigDataSource");
        c20358OooO00o.OooO0o0("Updated keys: " + configUpdate.getUpdatedKeys(), new Object[0]);
        FirebaseRemoteConfig firebaseRemoteConfig = this.f94197OooO00o.f94199OooO0O0;
        if (firebaseRemoteConfig != null) {
            firebaseRemoteConfig.activate().addOnCompleteListener(new C27059OooO0o0());
        } else {
            OooOOO0.OooOOOO(NetworkService.Constants.CONFIG_SERVICE);
            throw null;
        }
    }
}
