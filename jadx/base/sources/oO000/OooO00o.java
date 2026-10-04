package oO000;

import OooO0O0.OooO0o;
import Oooo0.C20855OooooOO;
import androidx.appcompat.widget.C21532OooOOo;
import java.io.Serializable;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o implements CharSequence, Serializable {
    private static final long serialVersionUID = -6208952725094867135L;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f113729OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public char[] f113730OooOo0o;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f113730OooOo0o[i];
    }

    public final boolean isEmpty() {
        return this.f113729OooOo == 0;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f113729OooOo;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(C21532OooOOo.OooO0OO(i, "Negative beginIndex: "));
        }
        if (i2 <= this.f113729OooOo) {
            if (i <= i2) {
                return CharBuffer.wrap(this.f113730OooOo0o, i, i2);
            }
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "beginIndex: ", " > endIndex: "));
        }
        StringBuilder sbOooO0OO = OooO0o.OooO0OO(i2, "endIndex: ", " > length: ");
        sbOooO0OO.append(this.f113729OooOo);
        throw new IndexOutOfBoundsException(sbOooO0OO.toString());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f113730OooOo0o, 0, this.f113729OooOo);
    }
}
