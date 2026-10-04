package oO00Oo;

import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: oO00Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32259OooO0oo extends oO0O00o0.OooO00o<Long> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f115877OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32259OooO0oo(Long l, OooOO0 oooOO02) {
        super(l);
        this.f115877OooO00o = oooOO02;
    }

    @Override // oO0O00o0.OooO00o
    public final void afterChange(InterfaceC34602OooOO0o<?> property, Long l, Long l2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(property, "property");
        long jLongValue = l2.longValue();
        l.longValue();
        this.f115877OooO00o.f115881OooOoO.f115898OooOoO0 = jLongValue;
    }
}
