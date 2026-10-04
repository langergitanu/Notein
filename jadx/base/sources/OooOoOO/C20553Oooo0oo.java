package OooOoOO;

import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOoOO.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20553Oooo0oo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Double, Double> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ double f58712OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ double f58713OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ double f58714OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ double f58715OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ double f58716OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20553Oooo0oo(double d, double d2, double d3, double d4, double d5) {
        super(1);
        this.f58713OooOo0o = d;
        this.f58712OooOo = d2;
        this.f58715OooOoO0 = d3;
        this.f58714OooOoO = d4;
        this.f58716OooOoOO = d5;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        return Double.valueOf((Math.exp(this.f58714OooOoO * dDoubleValue) * this.f58715OooOoO0) + (Math.exp(this.f58712OooOo * dDoubleValue) * this.f58713OooOo0o) + this.f58716OooOoOO);
    }
}
