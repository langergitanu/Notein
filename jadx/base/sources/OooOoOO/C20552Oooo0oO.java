package OooOoOO;

import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOoOO.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20552Oooo0oO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Double, Double> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ double f58709OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ double f58710OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ double f58711OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20552Oooo0oO(double d, double d2, double d3) {
        super(1);
        this.f58710OooOo0o = d;
        this.f58709OooOo = d2;
        this.f58711OooOoO0 = d3;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        double d2 = this.f58709OooOo;
        double d3 = dDoubleValue * d2;
        return Double.valueOf(Math.exp(d3) * ((this.f58711OooOoO0 * d2) + ((((double) 1) + d3) * this.f58710OooOo0o)));
    }
}
