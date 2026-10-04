package OooOoOO;

import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OooOoOO.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20545Oooo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Double, Double> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ double f58676OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ double f58677OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ double f58678OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ double f58679OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20545Oooo(double d, double d2, double d3, double d4) {
        super(1);
        this.f58677OooOo0o = d;
        this.f58676OooOo = d2;
        this.f58679OooOoO0 = d3;
        this.f58678OooOoO = d4;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Double invoke(Double d) {
        double dDoubleValue = d.doubleValue();
        double d2 = this.f58677OooOo0o;
        double d3 = this.f58676OooOo;
        double dExp = Math.exp(d3 * dDoubleValue) * d2 * d3;
        double d4 = this.f58679OooOoO0;
        double d5 = this.f58678OooOoO;
        return Double.valueOf((Math.exp(d5 * dDoubleValue) * d4 * d5) + dExp);
    }
}
