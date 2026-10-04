package oO0O00oo;

/* JADX INFO: renamed from: oO0O00oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32517OooO0Oo implements InterfaceC32518OooO0o0<Float> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O00oo.InterfaceC32518OooO0o0
    public final boolean OooO0O0(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C32517OooO0Oo)) {
            return false;
        }
        ((C32517OooO0Oo) obj).getClass();
        return true;
    }

    @Override // oO0O00oo.OooO0o
    public final Comparable getEndInclusive() {
        return Float.valueOf(0.0f);
    }

    @Override // oO0O00oo.OooO0o
    public final Comparable getStart() {
        return Float.valueOf(0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31);
    }

    @Override // oO0O00oo.OooO0o
    public final boolean isEmpty() {
        return false;
    }

    public final String toString() {
        return "0.0..0.0";
    }
}
