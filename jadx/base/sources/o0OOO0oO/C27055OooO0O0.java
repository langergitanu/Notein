package o0OOO0oO;

import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.huawei.hms.network.inner.api.NetworkService;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOO0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27055OooO0O0 implements androidx.lifecycle.OooO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27060OooO0oO f94194OooOo0o;

    public C27055OooO0O0(C27060OooO0oO c27060OooO0oO) {
        this.f94194OooOo0o = c27060OooO0oO;
    }

    @Override // androidx.lifecycle.OooO0o
    public final void onStart(InterfaceC21987OooOoo interfaceC21987OooOoo) {
        C27060OooO0oO c27060OooO0oO = this.f94194OooOo0o;
        if (((Boolean) c27060OooO0oO.f94198OooO00o.getValue()).booleanValue()) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("FirebaseRemoteConfigDataSource");
            c20358OooO00o.OooO0o0("start to fetchConfig", new Object[0]);
            FirebaseRemoteConfig firebaseRemoteConfig = c27060OooO0oO.f94199OooO0O0;
            if (firebaseRemoteConfig != null) {
                firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new C27054OooO00o());
            } else {
                OooOOO0.OooOOOO(NetworkService.Constants.CONFIG_SERVICE);
                throw null;
            }
        }
    }

    @Override // androidx.lifecycle.OooO0o
    public final void onStop(InterfaceC21987OooOoo interfaceC21987OooOoo) {
    }
}
