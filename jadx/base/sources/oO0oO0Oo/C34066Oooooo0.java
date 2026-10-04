package oO0oO0Oo;

import com.aspose.slides.C22206OooOOo0;
import com.aspose.words.internal.C22245OooO0oO;
import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34066Oooooo0 extends AbstractC34015OooO0OO {
    public static C34066Oooooo0 OooOo0(Object obj) {
        if (obj == null || (obj instanceof C34066Oooooo0)) {
            return (C34066Oooooo0) obj;
        }
        if (obj instanceof AbstractC34015OooO0OO) {
            return (C34066Oooooo0) ((AbstractC34015OooO0OO) obj).OooOOOO();
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
        }
        try {
            return (C34066Oooooo0) ((AbstractC34015OooO0OO) AbstractC34036OooOoOO.OooOOO((byte[]) obj)).OooOOOO();
        } catch (Exception e) {
            throw new IllegalArgumentException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static C34066Oooooo0 OooOo0O(Oooo0 oooo0) {
        AbstractC34036OooOoOO abstractC34036OooOoOOOooOo00 = oooo0.OooOo00();
        return abstractC34036OooOoOOOooOo00 instanceof C34066Oooooo0 ? OooOo0(abstractC34036OooOoOOOooOo00) : new C34066Oooooo0(AbstractC34033OooOo0o.OooOOo0(abstractC34036OooOoOOOooOo00).f122362OooOo0o, true);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        byte[] bArr = this.f122319OooOo0o;
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = bArr[i2];
        byte b2 = (byte) ((255 << i) & b);
        if (b == b2) {
            c34035OooOoO0.OooOO0(3, bArr, z);
            return;
        }
        c34035OooOoO0.OooOOO0(3, z);
        c34035OooOoO0.OooO0oo(length);
        c34035OooOoO0.OooO0oO(bArr, 0, i2);
        c34035OooOoO0.OooO0o(b2);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) {
        return C34035OooOoO0.OooO0Oo(this.f122319OooOo0o.length, z);
    }

    @Override // oO0oO0Oo.AbstractC34015OooO0OO, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOO() {
        return this;
    }

    @Override // oO0oO0Oo.AbstractC34015OooO0OO, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOo() {
        return this;
    }
}
