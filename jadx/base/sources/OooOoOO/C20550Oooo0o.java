package OooOoOO;

import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOoOO.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20550Oooo0o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Double, Double> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ double f58703OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ double f58704OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ double f58705OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ double f58706OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20550Oooo0o(double d, double d2, double d3, double d4) {
        super(1);
        this.f58704OooOo0o = d;
        this.f58703OooOo = d2;
        this.f58706OooOoO0 = d3;
        this.f58705OooOoO = d4;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        return Double.valueOf((Math.exp(this.f58706OooOoO0 * dDoubleValue) * ((this.f58703OooOo * dDoubleValue) + this.f58704OooOo0o)) + this.f58705OooOoO);
    }
}
