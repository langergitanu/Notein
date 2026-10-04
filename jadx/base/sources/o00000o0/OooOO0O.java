package o00000o0;

import OooooOO.AbstractC21341OoooOO0;
import OooooOO.C21348Ooooo0o;
import kotlin.jvm.internal.OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public interface OooOO0O {

    public static final class OooO00o implements OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f81276OooO00o = new OooO00o();

        @Override // o00000o0.OooOO0O
        public final long OooO00o() {
            int i = C21348Ooooo0o.f61767OooO0oo;
            return C21348Ooooo0o.f61766OooO0oO;
        }

        @Override // o00000o0.OooOO0O
        public final float getAlpha() {
            return Float.NaN;
        }

        @Override // o00000o0.OooOO0O
        public final AbstractC21341OoooOO0 getBrush() {
            return null;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Float> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Float invoke() {
            return Float.valueOf(OooOO0O.this.getAlpha());
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<OooOO0O> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0O invoke() {
            return OooOO0O.this;
        }
    }

    long OooO00o();

    default OooOO0O OooO0O0(OooOO0O other) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        boolean z = other instanceof C24114OooO0O0;
        if (!z || !(this instanceof C24114OooO0O0)) {
            return (!z || (this instanceof C24114OooO0O0)) ? (z || !(this instanceof C24114OooO0O0)) ? other.OooO0OO(new OooO0OO()) : this : other;
        }
        float alpha = other.getAlpha();
        OooO0O0 oooO0O0 = new OooO0O0();
        if (Float.isNaN(alpha)) {
            ((Number) oooO0O0.invoke()).floatValue();
        }
        throw null;
    }

    default OooOO0O OooO0OO(oO0O000o.OooO00o<? extends OooOO0O> other) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        return !equals(OooO00o.f81276OooO00o) ? this : other.invoke();
    }

    float getAlpha();

    AbstractC21341OoooOO0 getBrush();
}
