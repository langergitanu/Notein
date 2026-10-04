package o00oo0Oo;

import OooOoOO.C20519OooO0Oo;
import java.util.Map;
import o00o0OOo.C25409OooO0Oo;
import o00o0Ooo.InterfaceC25423OooO;
import o00oo0O0.C25679OooOo0o;
import o00ooO0.C25754OooOooo;
import oO00ooO.EnumC32441OooOO0O;

/* JADX INFO: renamed from: o00oo0Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25695OooOO0o implements InterfaceC25423OooO<InterfaceC25687OooO0OO> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Object f87656OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25697OooOOO0 f87657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25754OooOooo f87658OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25699OooOOOo f87659OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25679OooOo0o f87660OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C25409OooO0Oo f87661OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f87662OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C25409OooO0Oo f87663OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Map<String, C25409OooO0Oo> f87664OooO0oo;

    public C25695OooOO0o(C25697OooOOO0 c25697OooOOO0, C25700OooOOo c25700OooOOo) {
        C25754OooOooo poolFactory = c25700OooOOo.f87685OooOOOO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(poolFactory, "poolFactory");
        C25686OooO0O0 executorSupplier = c25700OooOOo.f87671OooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(executorSupplier, "executorSupplier");
        C25679OooOo0o imageCacheStatsTracker = c25700OooOOo.f87680OooOO0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(imageCacheStatsTracker, "imageCacheStatsTracker");
        C25409OooO0Oo mainDiskCacheConfig = c25700OooOOo.f87682OooOO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(mainDiskCacheConfig, "mainDiskCacheConfig");
        C25409OooO0Oo smallImageDiskCacheConfig = c25700OooOOo.f87691OooOo0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(smallImageDiskCacheConfig, "smallImageDiskCacheConfig");
        this.f87657OooO00o = c25697OooOOO0;
        this.f87658OooO0O0 = poolFactory;
        this.f87659OooO0OO = executorSupplier;
        this.f87660OooO0Oo = imageCacheStatsTracker;
        this.f87662OooO0o0 = 0;
        this.f87661OooO0o = mainDiskCacheConfig;
        this.f87663OooO0oO = smallImageDiskCacheConfig;
        this.f87664OooO0oo = null;
        this.f87656OooO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116634OooOo0o, new oO0O000o.OooO00o() { // from class: o00oo0Oo.OooO0Oo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                C25695OooOO0o this$0 = this.f87640OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                return new C25694OooOO0O(this$0);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    @Override // o00o0Ooo.InterfaceC25423OooO
    public final InterfaceC25687OooO0OO get() {
        return (InterfaceC25687OooO0OO) this.f87656OooO.getValue();
    }
}
