package oO0oooO;

import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34039OooOooO;
import oO0oO0Oo.C34020OooO0oo;
import oO0oO0Oo.C34029OooOOo0;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.C34079o0ooOoO;
import oO0oO0Oo.OooOo00;
import oO0oO0Oo.Oooo0;
import oO0oO0Oo.o00oO0O;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oooO.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34290OooOO0O extends OooOo00 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final long f123111OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f123112OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final byte[] f123113OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final long f123114OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final byte[] f123115OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final byte[] f123116OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final byte[] f123117OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final byte[] f123118OooOooO;

    public C34290OooOO0O(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f123112OooOo0o = 0;
        this.f123111OooOo = j;
        this.f123113OooOoO = C34332OooO00o.OooO00o(bArr);
        this.f123115OooOoOO = C34332OooO00o.OooO00o(bArr2);
        this.f123117OooOoo0 = C34332OooO00o.OooO00o(bArr3);
        this.f123116OooOoo = C34332OooO00o.OooO00o(bArr4);
        this.f123118OooOooO = C34332OooO00o.OooO00o(bArr5);
        this.f123114OooOoO0 = -1L;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        C34020OooO0oo c34020OooO0oo = new C34020OooO0oo();
        long j = this.f123114OooOoO0;
        c34020OooO0oo.OooO00o(j >= 0 ? new C34029OooOOo0(1L) : new C34029OooOOo0(0L));
        C34020OooO0oo c34020OooO0oo2 = new C34020OooO0oo();
        c34020OooO0oo2.OooO00o(new C34029OooOOo0(this.f123111OooOo));
        c34020OooO0oo2.OooO00o(new C34075o00o0O(this.f123113OooOoO));
        c34020OooO0oo2.OooO00o(new C34075o00o0O(this.f123115OooOoOO));
        c34020OooO0oo2.OooO00o(new C34075o00o0O(this.f123117OooOoo0));
        c34020OooO0oo2.OooO00o(new C34075o00o0O(this.f123116OooOoo));
        if (j >= 0) {
            c34020OooO0oo2.OooO00o(new C34079o0ooOoO(false, 0, new C34029OooOOo0(j)));
        }
        c34020OooO0oo.OooO00o(new o00oO0O(c34020OooO0oo2));
        c34020OooO0oo.OooO00o(new C34079o0ooOoO(true, 0, new C34075o00o0O(this.f123118OooOooO)));
        return new o00oO0O(c34020OooO0oo);
    }

    public C34290OooOO0O(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j2) {
        this.f123112OooOo0o = 1;
        this.f123111OooOo = j;
        this.f123113OooOoO = C34332OooO00o.OooO00o(bArr);
        this.f123115OooOoOO = C34332OooO00o.OooO00o(bArr2);
        this.f123117OooOoo0 = C34332OooO00o.OooO00o(bArr3);
        this.f123116OooOoo = C34332OooO00o.OooO00o(bArr4);
        this.f123118OooOooO = C34332OooO00o.OooO00o(bArr5);
        this.f123114OooOoO0 = j2;
    }

    public C34290OooOO0O(AbstractC34039OooOooO abstractC34039OooOooO) {
        long jOooOo0o;
        C34029OooOOo0 c34029OooOOo0OooOOo0 = C34029OooOOo0.OooOOo0(abstractC34039OooOooO.OooOo0(0));
        if (!c34029OooOOo0OooOOo0.OooOOoo(0) && !c34029OooOOo0OooOOo0.OooOOoo(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f123112OooOo0o = c34029OooOOo0OooOOo0.OooOo0();
        if (abstractC34039OooOooO.size() != 2 && abstractC34039OooOooO.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC34039OooOooO abstractC34039OooOooOOooOOoo = AbstractC34039OooOooO.OooOOoo(abstractC34039OooOooO.OooOo0(1));
        this.f123111OooOo = C34029OooOOo0.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(0)).OooOo0o();
        this.f123113OooOoO = C34332OooO00o.OooO00o(AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(1)).f122362OooOo0o);
        this.f123115OooOoOO = C34332OooO00o.OooO00o(AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(2)).f122362OooOo0o);
        this.f123117OooOoo0 = C34332OooO00o.OooO00o(AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(3)).f122362OooOo0o);
        this.f123116OooOoo = C34332OooO00o.OooO00o(AbstractC34033OooOo0o.OooOOo0(abstractC34039OooOooOOooOOoo.OooOo0(4)).f122362OooOo0o);
        if (abstractC34039OooOooOOooOOoo.size() == 6) {
            Oooo0 oooo0OooOOoo = Oooo0.OooOOoo(abstractC34039OooOooOOooOOoo.OooOo0(5));
            if (oooo0OooOOoo.f122380OooOoO0 != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            jOooOo0o = ((C34029OooOOo0) C34029OooOOo0.f122347OooOoO0.OooO0o0(oooo0OooOOoo, false)).OooOo0o();
        } else {
            if (abstractC34039OooOooOOooOOoo.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            jOooOo0o = -1;
        }
        this.f123114OooOoO0 = jOooOo0o;
        if (abstractC34039OooOooO.size() == 3) {
            this.f123118OooOooO = C34332OooO00o.OooO00o(AbstractC34033OooOo0o.OooOOo(Oooo0.OooOOoo(abstractC34039OooOooO.OooOo0(2)), true).f122362OooOo0o);
        } else {
            this.f123118OooOooO = null;
        }
    }
}
