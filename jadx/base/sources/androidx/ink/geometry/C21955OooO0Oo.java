package androidx.ink.geometry;

import com.google.firebase.Firebase;
import com.google.firebase.remoteconfig.RemoteConfigKt;

/* JADX INFO: renamed from: androidx.ink.geometry.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21955OooO0Oo implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f65402OooOo0o;

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f65402OooOo0o) {
            case 0:
                return new MutableVec();
            default:
                return Boolean.valueOf(RemoteConfigKt.getRemoteConfig(Firebase.INSTANCE).getBoolean("rconfig_enable_chat_bot"));
        }
    }
}
