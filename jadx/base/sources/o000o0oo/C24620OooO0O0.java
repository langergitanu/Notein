package o000o0oo;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o000o0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24620OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Context, C24624OooO0o0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Context f83413OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24620OooO0O0(Context context) {
        super(1);
        this.f83413OooOo0o = context;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C24624OooO0o0 invoke(Context context) {
        Context it = context;
        kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
        MeasurementManager measurementManager = MeasurementManager.get(this.f83413OooOo0o);
        kotlin.jvm.internal.OooOOO0.OooO0o(measurementManager, "get(context)");
        return new C24624OooO0o0(measurementManager);
    }
}
