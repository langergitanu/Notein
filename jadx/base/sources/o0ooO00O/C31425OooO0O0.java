package o0ooO00O;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o0ooO00O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31425OooO0O0 extends AbstractC31424OooO00o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public InputStream f112194OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C31427OooO0Oo f112195OooOooO;

    @Override // o0ooO00O.AbstractC31424OooO00o
    public final void close() throws IOException {
        OooO00o();
        this.f112192OooOoOO = true;
        C31427OooO0Oo c31427OooO0Oo = this.f112195OooOooO;
        c31427OooO0Oo.f112201OooO0OO.clear();
        c31427OooO0Oo.f112199OooO00o = 0L;
    }

    @Override // o0ooO00O.AbstractC31424OooO00o
    public final int read() throws IOException {
        this.f112190OooOoO = 0;
        long j = this.f112188OooOo;
        C31427OooO0Oo c31427OooO0Oo = this.f112195OooOooO;
        long j2 = c31427OooO0Oo.f112199OooO00o;
        if (j >= j2) {
            int i = (int) ((j - j2) + 1);
            if (c31427OooO0Oo.OooO00o(this.f112194OooOoo, i) < i) {
                return -1;
            }
        }
        int iOooO0O0 = c31427OooO0Oo.OooO0O0(this.f112188OooOo);
        if (iOooO0O0 >= 0) {
            this.f112188OooOo++;
        }
        return iOooO0O0;
    }

    @Override // o0ooO00O.AbstractC31424OooO00o
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.f112190OooOoO = 0;
        long j = this.f112188OooOo;
        C31427OooO0Oo c31427OooO0Oo = this.f112195OooOooO;
        long j2 = c31427OooO0Oo.f112199OooO00o;
        if (j >= j2) {
            c31427OooO0Oo.OooO00o(this.f112194OooOoo, (int) ((j - j2) + ((long) i2)));
        }
        int iOooO0OO = this.f112195OooOooO.OooO0OO(this.f112188OooOo, bArr, i, i2);
        if (iOooO0OO > 0) {
            this.f112188OooOo += (long) iOooO0OO;
        }
        return iOooO0OO;
    }
}
