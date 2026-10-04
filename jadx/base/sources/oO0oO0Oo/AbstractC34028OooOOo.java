package oO0oO0Oo;

/* JADX INFO: renamed from: oO0oO0Oo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34028OooOOo extends AbstractC34036OooOoOO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO00o f122346OooOo0o = new OooO00o(AbstractC34028OooOOo.class);

    /* JADX INFO: renamed from: oO0oO0Oo.OooOOo$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            if (c34075o00o0O.f122362OooOo0o.length == 0) {
                return o00Oo0.f122442OooOo;
            }
            throw new IllegalStateException("malformed NULL encoding encountered");
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        return abstractC34036OooOoOO instanceof AbstractC34028OooOOo;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return -1;
    }

    public final String toString() {
        return "NULL";
    }
}
