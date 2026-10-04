package o0O0oooo;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.orion.penkit.models.HyperLinkInfo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0O0oooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26359OooO0OO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90463OooOo0o;

    public /* synthetic */ C26359OooO0OO(int i) {
        this.f90463OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f90463OooOo0o) {
            case 0:
                HyperLinkInfo it = (HyperLinkInfo) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                return true;
            default:
                FirebaseRemoteConfigSettings.Builder remoteConfigSettings = (FirebaseRemoteConfigSettings.Builder) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(remoteConfigSettings, "$this$remoteConfigSettings");
                remoteConfigSettings.setMinimumFetchIntervalInSeconds(3600L);
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
