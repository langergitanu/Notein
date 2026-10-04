package oO00O0o0;

import java.util.Iterator;
import java.util.List;
import oO0o0O0o.C33596OooOOo0;

/* JADX INFO: renamed from: oO00O0o0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32186OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f115529OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<OooO> f115530OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f115531OooO0OO;

    public C32186OooO0oo(String value, List<OooO> params) {
        Double d;
        Object next;
        String str;
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        kotlin.jvm.internal.OooOOO0.OooO0oO(params, "params");
        this.f115529OooO00o = value;
        this.f115530OooO0O0 = params;
        Iterator<T> it = params.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooO) next).f115509OooO00o, "q")) {
                    break;
                }
            }
        }
        OooO oooO = (OooO) next;
        double dDoubleValue = 1.0d;
        if (oooO != null && (str = oooO.f115510OooO0O0) != null) {
            Double dValueOf = C33596OooOOo0.OooOO0(str) ? Double.valueOf(Double.parseDouble(str)) : null;
            if (dValueOf != null) {
                double dDoubleValue2 = dValueOf.doubleValue();
                if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                    d = dValueOf;
                }
                if (d != null) {
                    dDoubleValue = d.doubleValue();
                }
            }
        }
        this.f115531OooO0OO = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32186OooO0oo)) {
            return false;
        }
        C32186OooO0oo c32186OooO0oo = (C32186OooO0oo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115529OooO00o, c32186OooO0oo.f115529OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115530OooO0O0, c32186OooO0oo.f115530OooO0O0);
    }

    public final int hashCode() {
        return this.f115530OooO0O0.hashCode() + (this.f115529OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.f115529OooO00o + ", params=" + this.f115530OooO0O0 + ')';
    }
}
