package o0OOO0oO;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.huawei.hms.network.inner.api.NetworkService;
import com.orion.notein.domain.models.p605ai.AiFeatureConfig;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0O.OooO00o;
import o0OOo0Oo.InterfaceC27322Oooo0o0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOO0oO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27053OooO implements InterfaceC27322Oooo0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C27060OooO0oO f94191OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o0O.OooO00o f94192OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public AiFeatureConfig f94193OooO0OO;

    public C27053OooO(C27061OooO0oo c27061OooO0oo, C27060OooO0oO c27060OooO0oO) {
        this.f94191OooO00o = c27060OooO0oO;
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new C27056OooO0OO(c27060OooO0oO, null), 3);
    }

    @Override // o0OOo0Oo.InterfaceC27322Oooo0o0
    public final double OooO00o() {
        C27060OooO0oO c27060OooO0oO = this.f94191OooO00o;
        if (!((Boolean) c27060OooO0oO.f94198OooO00o.getValue()).booleanValue()) {
            return 0.0d;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = c27060OooO0oO.f94199OooO0O0;
        if (firebaseRemoteConfig != null) {
            return firebaseRemoteConfig.getDouble("rconfig_use_wps_pptx_rate");
        }
        OooOOO0.OooOOOO(NetworkService.Constants.CONFIG_SERVICE);
        throw null;
    }

    @Override // o0OOo0Oo.InterfaceC27322Oooo0o0
    public final void OooO0O0(String key, String value) {
        OooOOO0.OooO0oO(key, "key");
        OooOOO0.OooO0oO(value, "value");
    }

    @Override // o0OOo0Oo.InterfaceC27322Oooo0o0
    public final o0O.OooO00o OooO0OO(boolean z) {
        synchronized (this) {
            o0O.OooO00o oooO00o = this.f94192OooO0O0;
            if (oooO00o != null && z) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("RemoteConfigRepoImpl");
                c20358OooO00o.OooO0o0("Returning cached FeatureConfig: " + oooO00o, new Object[0]);
                return o0O.OooO00o.OooO00o(oooO00o);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("RemoteConfigRepoImpl");
            c20358OooO00o2.OooOO0O("FeatureConfig is null, fetching from remote config.", new Object[0]);
            String strOooO00o = this.f94191OooO00o.OooO00o("rconfig_vip_feature_config");
            o0O.OooO00o.Companion.getClass();
            o0O.OooO00o OooO00o2 = OooO00o.OooO0O0.OooO00o(strOooO00o);
            c20358OooO00o2.OooOOO0("RemoteConfigRepoImpl");
            c20358OooO00o2.OooO0o0("getValueAsFeatureConfig: key=rconfig_vip_feature_config, config=" + OooO00o2, new Object[0]);
            this.f94192OooO0O0 = OooO00o2;
            return OooO00o2;
        }
    }

    @Override // o0OOo0Oo.InterfaceC27322Oooo0o0
    public final AiFeatureConfig OooO0Oo() {
        synchronized (this) {
            AiFeatureConfig aiFeatureConfig = this.f94193OooO0OO;
            if (aiFeatureConfig != null) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("RemoteConfigRepoImpl");
                c20358OooO00o.OooO0o0("Returning cached AiFeatureConfig: " + aiFeatureConfig, new Object[0]);
                return AiFeatureConfig.copy$default(aiFeatureConfig, 0, false, 0, 0L, null, null, 63, null);
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("RemoteConfigRepoImpl");
            c20358OooO00o2.OooOO0O("AiFeatureConfig is null, fetching from remote config.", new Object[0]);
            AiFeatureConfig fromJson = AiFeatureConfig.INSTANCE.parseFromJson(this.f94191OooO00o.OooO00o("rconfig_ai_feature_configuration_v2"));
            c20358OooO00o2.OooOOO0("RemoteConfigRepoImpl");
            c20358OooO00o2.OooO0o0("getValueAsAIFeatureConfig: key=rconfig_ai_feature_configuration_v2, config=" + fromJson, new Object[0]);
            this.f94193OooO0OO = fromJson;
            return fromJson;
        }
    }

    @Override // o0OOo0Oo.InterfaceC27322Oooo0o0
    public final boolean getValueAsBoolean(String str) {
        C27060OooO0oO c27060OooO0oO = this.f94191OooO00o;
        if (!((Boolean) c27060OooO0oO.f94198OooO00o.getValue()).booleanValue()) {
            return false;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = c27060OooO0oO.f94199OooO0O0;
        if (firebaseRemoteConfig != null) {
            return firebaseRemoteConfig.getBoolean(str);
        }
        OooOOO0.OooOOOO(NetworkService.Constants.CONFIG_SERVICE);
        throw null;
    }

    @Override // o0OOo0Oo.InterfaceC27322Oooo0o0
    public final long getValueAsLong(String str) {
        C27060OooO0oO c27060OooO0oO = this.f94191OooO00o;
        if (!((Boolean) c27060OooO0oO.f94198OooO00o.getValue()).booleanValue()) {
            return 0L;
        }
        FirebaseRemoteConfig firebaseRemoteConfig = c27060OooO0oO.f94199OooO0O0;
        if (firebaseRemoteConfig != null) {
            return firebaseRemoteConfig.getLong(str);
        }
        OooOOO0.OooOOOO(NetworkService.Constants.CONFIG_SERVICE);
        throw null;
    }

    @Override // o0OOo0Oo.InterfaceC27322Oooo0o0
    public final String getValueAsString(String str) {
        return this.f94191OooO00o.OooO00o(str);
    }

    @Override // o0OOo0Oo.InterfaceC27322Oooo0o0
    public final C33769Ooooo0o isInitialized() {
        return C25252OooO0Oo.OooO0OO(this.f94191OooO00o.f94198OooO00o);
    }
}
