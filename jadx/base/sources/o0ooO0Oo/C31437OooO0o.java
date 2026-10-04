package o0ooO0Oo;

import java.io.IOException;
import java.math.BigDecimal;
import o0ooOO0O.C31607OooO0O0;

/* JADX INFO: renamed from: o0ooO0Oo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31437OooO0o extends AbstractC31443OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public BigDecimal f112223OooOo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f112224OooOoO0;

    public C31437OooO0o(float f) {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f));
        this.f112223OooOo = bigDecimal;
        this.f112224OooOoO0 = o0000O0O(bigDecimal.toPlainString());
    }

    public static String o0000O0O(String str) {
        if (str.indexOf(46) > -1 && !str.endsWith(".0")) {
            while (str.endsWith("0") && !str.endsWith(".0")) {
                str = androidx.core.content.OooO0OO.OooO00o(1, 0, str);
            }
        }
        return str;
    }

    @Override // o0ooO0Oo.AbstractC31434OooO0O0
    public final Object OooOOoo(C31607OooO0O0 c31607OooO0O0) throws IOException {
        c31607OooO0O0.f112981OooOoO.write(this.f112224OooOoO0.getBytes("ISO-8859-1"));
        return null;
    }

    @Override // o0ooO0Oo.AbstractC31443OooOO0o
    public final float OooOooo() {
        return this.f112223OooOo.floatValue();
    }

    @Override // o0ooO0Oo.AbstractC31443OooOO0o
    public final int Oooo0() {
        return this.f112223OooOo.intValue();
    }

    @Override // o0ooO0Oo.AbstractC31443OooOO0o
    public final long Oooo0OO() {
        return this.f112223OooOo.longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C31437OooO0o) && Float.floatToIntBits(((C31437OooO0o) obj).f112223OooOo.floatValue()) == Float.floatToIntBits(this.f112223OooOo.floatValue());
    }

    public final int hashCode() {
        return this.f112223OooOo.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0Oo0oo() {
        float fFloatValue = this.f112223OooOo.floatValue();
        double dDoubleValue = this.f112223OooOo.doubleValue();
        boolean z = true;
        if (fFloatValue == Float.NEGATIVE_INFINITY || fFloatValue == Float.POSITIVE_INFINITY) {
            if (Math.abs(dDoubleValue) > 3.4028234663852886E38d) {
                fFloatValue = (fFloatValue == Float.POSITIVE_INFINITY ? 1 : -1) * Float.MAX_VALUE;
            } else {
                z = false;
            }
        } else if (fFloatValue != 0.0f || dDoubleValue == 0.0d || Math.abs(dDoubleValue) >= 1.1754943508222875E-38d) {
        }
        if (z) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(fFloatValue);
            this.f112223OooOo = bigDecimalValueOf;
            this.f112224OooOoO0 = o0000O0O(bigDecimalValueOf.toPlainString());
        }
    }

    public final String toString() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("COSFloat{"), this.f112224OooOoO0, "}");
    }
}
