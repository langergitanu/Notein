package oO0O00oo;

import com.aspose.words.ControlChar;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO extends C32516OooO00o implements OooO0o<Character> {
    static {
        new OooO0OO((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        if (isEmpty() && ((OooO0OO) obj).isEmpty()) {
            return true;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return this.f116805OooOo0o == oooO0OO.f116805OooOo0o && this.f116804OooOo == oooO0OO.f116804OooOo;
    }

    @Override // oO0O00oo.OooO0o
    public final Comparable getEndInclusive() {
        return Character.valueOf(this.f116804OooOo);
    }

    @Override // oO0O00oo.OooO0o
    public final Comparable getStart() {
        return Character.valueOf(this.f116805OooOo0o);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f116805OooOo0o * ControlChar.OPTIONAL_HYPHEN_CHAR) + this.f116804OooOo;
    }

    @Override // oO0O00oo.OooO0o
    public final boolean isEmpty() {
        return OooOOO0.OooO(this.f116805OooOo0o, this.f116804OooOo) > 0;
    }

    public final String toString() {
        return this.f116805OooOo0o + ".." + this.f116804OooOo;
    }
}
