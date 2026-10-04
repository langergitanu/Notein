package oO00OooO;

import java.util.Map;
import oO00OooO.AbstractC32312OooO0OO;

/* JADX INFO: renamed from: oO00OooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32310OooO00o extends AbstractC32312OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Object, Integer> f116227OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Object, Integer> f116228OooO0O0;

    public C32310OooO00o(Map<Object, Integer> map, Map<Object, Integer> map2) {
        if (map == null) {
            throw new NullPointerException("Null numbersOfLatencySampledSpans");
        }
        this.f116227OooO00o = map;
        if (map2 == null) {
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        this.f116228OooO0O0 = map2;
    }

    @Override // oO00OooO.AbstractC32312OooO0OO.OooO0O0
    public final Map<Object, Integer> OooO00o() {
        return this.f116228OooO0O0;
    }

    @Override // oO00OooO.AbstractC32312OooO0OO.OooO0O0
    public final Map<Object, Integer> OooO0O0() {
        return this.f116227OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC32312OooO0OO.OooO0O0)) {
            return false;
        }
        AbstractC32312OooO0OO.OooO0O0 oooO0O0 = (AbstractC32312OooO0OO.OooO0O0) obj;
        return this.f116227OooO00o.equals(oooO0O0.OooO0O0()) && this.f116228OooO0O0.equals(oooO0O0.OooO00o());
    }

    public final int hashCode() {
        return ((this.f116227OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f116228OooO0O0.hashCode();
    }

    public final String toString() {
        return "PerSpanNameSummary{numbersOfLatencySampledSpans=" + this.f116227OooO00o + ", numbersOfErrorSampledSpans=" + this.f116228OooO0O0 + "}";
    }
}
