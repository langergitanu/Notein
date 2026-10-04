package o0OOo0oo;

import o0OOo0Oo.InterfaceC27322Oooo0o0;

/* JADX INFO: renamed from: o0OOo0oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C27639OooOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC27322Oooo0o0 f97201OooO00o;

    public C27639OooOoo0(InterfaceC27322Oooo0o0 remoteConfigRepo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(remoteConfigRepo, "remoteConfigRepo");
        this.f97201OooO00o = remoteConfigRepo;
    }

    public final boolean OooO00o() {
        return !this.f97201OooO00o.getValueAsBoolean("rconfig_disable_cloud_sync");
    }
}
