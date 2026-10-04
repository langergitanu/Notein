package oO00o0o0;

import oO0OooOO.AbstractC33500OooOOOo;

/* JADX INFO: renamed from: oO00o0o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32379OooO0Oo extends AbstractC33500OooOOOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadFactoryC32380OooO0o f116443OooO0O0 = new ThreadFactoryC32380OooO0o("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ThreadFactoryC32380OooO0o f116444OooO00o = f116443OooO0O0;

    @Override // oO0OooOO.AbstractC33500OooOOOo
    public final AbstractC33500OooOOOo.OooO0O0 OooO00o() {
        return new C32381OooO0o0(this.f116444OooO00o);
    }
}
