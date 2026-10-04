package o0OoO0oo;

import com.google.firebase.Firebase;
import com.google.firebase.remoteconfig.RemoteConfigKt;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0OoO0oo.oOooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28980oOooo0o implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f102690OooOo0o;

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f102690OooOo0o) {
            case 0:
                return C32460OooOooO.f116667OooO00o;
            default:
                return Integer.valueOf((int) RemoteConfigKt.getRemoteConfig(Firebase.INSTANCE).getLong("rconfig_ai_ocr_request_concurrent_num"));
        }
    }
}
