package oO0oO0Oo;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22206OooOOo0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import oOO000oO.C34332OooO00o;
import oOO000oO.C34336OooO0o;
import oOO000oo.C34342OooO0o;
import oOO000oo.C34343OooO0o0;

/* JADX INFO: renamed from: oO0oO0Oo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34033OooOo0o extends AbstractC34036OooOoOO implements OooOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f122360OooOo = new OooO00o(AbstractC34033OooOo0o.class);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final byte[] f122361OooOoO0 = new byte[0];

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122362OooOo0o;

    /* JADX INFO: renamed from: oO0oO0Oo.OooOo0o$OooO00o */
    public static class OooO00o extends AbstractC34046Oooo0o {
        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0OO(AbstractC34039OooOooO abstractC34039OooOooO) {
            return abstractC34039OooOooO.OooOoO0();
        }

        @Override // oO0oO0Oo.AbstractC34046Oooo0o
        public final AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
            return c34075o00o0O;
        }
    }

    public AbstractC34033OooOo0o(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f122362OooOo0o = bArr;
    }

    public static AbstractC34033OooOo0o OooOOo(Oooo0 oooo0, boolean z) {
        return (AbstractC34033OooOo0o) f122360OooOo.OooO0o0(oooo0, z);
    }

    public static AbstractC34033OooOo0o OooOOo0(Object obj) {
        if (obj == null || (obj instanceof AbstractC34033OooOo0o)) {
            return (AbstractC34033OooOo0o) obj;
        }
        if (obj instanceof InterfaceC34019OooO0oO) {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = ((InterfaceC34019OooO0oO) obj).OooO0o();
            if (abstractC34036OooOoOOOooO0o instanceof AbstractC34033OooOo0o) {
                return (AbstractC34033OooOo0o) abstractC34036OooOoOOOooO0o;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC34033OooOo0o) f122360OooOo.OooO0O0((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(C21111o0ooOoO.OooO00o(e, new StringBuilder("failed to construct OCTET STRING from byte[]: ")));
            }
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
    }

    @Override // oO0oO0Oo.InterfaceC34073o00000oo
    public final AbstractC34036OooOoOO OooO0O0() {
        return this;
    }

    @Override // oO0oO0Oo.OooOo
    public final InputStream OooO0Oo() {
        return new ByteArrayInputStream(this.f122362OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof AbstractC34033OooOo0o)) {
            return false;
        }
        return Arrays.equals(this.f122362OooOo0o, ((AbstractC34033OooOo0o) abstractC34036OooOoOO).f122362OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOO() {
        return new C34075o00o0O(this.f122362OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public AbstractC34036OooOoOO OooOOOo() {
        return new C34075o00o0O(this.f122362OooOo0o);
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122362OooOo0o);
    }

    public final String toString() {
        C34342OooO0o c34342OooO0o = C34343OooO0o0.f123274OooO00o;
        byte[] bArr = this.f122362OooOo0o;
        return "#".concat(C34336OooO0o.OooO00o(C34343OooO0o0.OooO0OO(bArr, bArr.length)));
    }
}
