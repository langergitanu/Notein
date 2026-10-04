package oO00oOO;

import oO00o.AbstractC32318OooO0o;

/* JADX INFO: renamed from: oO00oOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32417OooO0Oo extends AbstractC32318OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadFactoryC32418OooO0o f116567OooO0O0 = new ThreadFactoryC32418OooO0o("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ThreadFactoryC32418OooO0o f116568OooO00o = f116567OooO0O0;

    @Override // oO00o.AbstractC32318OooO0o
    public final AbstractC32318OooO0o.OooO0O0 OooO00o() {
        return new C32419OooO0o0(this.f116568OooO00o);
    }
}
