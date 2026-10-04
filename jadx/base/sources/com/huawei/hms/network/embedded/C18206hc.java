package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.hc */
/* JADX INFO: loaded from: classes9.dex */
public final class C18206hc extends C18303ob {

    /* JADX INFO: renamed from: g */
    public final transient byte[][] f55075g;

    /* JADX INFO: renamed from: h */
    public final transient int[] f55076h;

    public C18206hc(C18261lb c18261lb, int i) {
        super(null);
        C18276mc.m79202a(c18261lb.f55631b, 0L, i);
        C18178fc c18178fc = c18261lb.f55630a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c18178fc.f54867c;
            int i6 = c18178fc.f54866b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c18178fc = c18178fc.f54870f;
        }
        this.f55075g = new byte[i4][];
        this.f55076h = new int[i4 * 2];
        C18178fc c18178fc2 = c18261lb.f55630a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f55075g;
            bArr[i7] = c18178fc2.f54865a;
            int i8 = c18178fc2.f54867c;
            int i9 = c18178fc2.f54866b;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.f55076h;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c18178fc2.f54868d = true;
            i7++;
            c18178fc2 = c18178fc2.f54870f;
        }
    }

    /* JADX INFO: renamed from: c */
    private int m78713c(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f55076h, 0, this.f55075g.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    /* JADX INFO: renamed from: o */
    private C18303ob m78714o() {
        return new C18303ob(mo78739m());
    }

    /* JADX INFO: renamed from: p */
    private Object m78715p() {
        return m78714o();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: a */
    public byte mo78716a(int i) {
        C18276mc.m79202a(this.f55076h[this.f55075g.length - 1], i, 1L);
        int iM78713c = m78713c(i);
        int i2 = iM78713c == 0 ? 0 : this.f55076h[iM78713c - 1];
        int[] iArr = this.f55076h;
        byte[][] bArr = this.f55075g;
        return bArr[iM78713c][(i - i2) + iArr[bArr.length + iM78713c]];
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: b */
    public int mo78725b(byte[] bArr, int i) {
        return m78714o().mo78725b(bArr, i);
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: d */
    public C18303ob mo78730d(C18303ob c18303ob) {
        return m78714o().mo78730d(c18303ob);
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: e */
    public byte[] mo78732e() {
        return mo78739m();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C18303ob) {
            C18303ob c18303ob = (C18303ob) obj;
            if (c18303ob.mo78736j() == mo78736j() && mo78723a(0, c18303ob, 0, mo78736j())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: f */
    public C18303ob mo78733f() {
        return m78714o().mo78733f();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: g */
    public C18303ob mo78734g() {
        return m78714o().mo78734g();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: h */
    public C18303ob mo78735h() {
        return m78714o().mo78735h();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    public int hashCode() {
        int i = this.f55845b;
        if (i != 0) {
            return i;
        }
        int length = this.f55075g.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f55075g[i2];
            int[] iArr = this.f55076h;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f55845b = i3;
        return i3;
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: j */
    public int mo78736j() {
        return this.f55076h[this.f55075g.length - 1];
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: k */
    public C18303ob mo78737k() {
        return m78714o().mo78737k();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: l */
    public C18303ob mo78738l() {
        return m78714o().mo78738l();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: m */
    public byte[] mo78739m() {
        int[] iArr = this.f55076h;
        byte[][] bArr = this.f55075g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f55076h;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f55075g[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: n */
    public String mo78740n() {
        return m78714o().mo78740n();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    public String toString() {
        return m78714o().toString();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: a */
    public int mo78717a(byte[] bArr, int i) {
        return m78714o().mo78717a(bArr, i);
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: b */
    public C18303ob mo78726b(int i) {
        return m78714o().mo78726b(i);
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: c */
    public C18303ob mo78728c(C18303ob c18303ob) {
        return m78714o().mo78728c(c18303ob);
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: d */
    public String mo78731d() {
        return m78714o().mo78731d();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: a */
    public C18303ob mo78718a(int i, int i2) {
        return m78714o().mo78718a(i, i2);
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: b */
    public String mo78727b() {
        return m78714o().mo78727b();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: c */
    public String mo78729c() {
        return m78714o().mo78729c();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: a */
    public String mo78719a(Charset charset) {
        return m78714o().mo78719a(charset);
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo78720a() {
        return ByteBuffer.wrap(mo78739m()).asReadOnlyBuffer();
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: a */
    public void mo78721a(C18261lb c18261lb) {
        int length = this.f55075g.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f55076h;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C18178fc c18178fc = new C18178fc(this.f55075g[i], i3, (i3 + i4) - i2, true, false);
            C18178fc c18178fc2 = c18261lb.f55630a;
            if (c18178fc2 == null) {
                c18178fc.f54871g = c18178fc;
                c18178fc.f54870f = c18178fc;
                c18261lb.f55630a = c18178fc;
            } else {
                c18178fc2.f54871g.m78509a(c18178fc);
            }
            i++;
            i2 = i4;
        }
        c18261lb.f55631b += (long) i2;
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: a */
    public void mo78722a(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        int length = this.f55075g.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f55076h;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            outputStream.write(this.f55075g[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: a */
    public boolean mo78723a(int i, C18303ob c18303ob, int i2, int i3) {
        if (i < 0 || i > mo78736j() - i3) {
            return false;
        }
        int iM78713c = m78713c(i);
        while (i3 > 0) {
            int i4 = iM78713c == 0 ? 0 : this.f55076h[iM78713c - 1];
            int iMin = Math.min(i3, ((this.f55076h[iM78713c] - i4) + i4) - i);
            int[] iArr = this.f55076h;
            byte[][] bArr = this.f55075g;
            if (!c18303ob.mo78724a(i2, bArr[iM78713c], (i - i4) + iArr[bArr.length + iM78713c], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM78713c++;
        }
        return true;
    }

    @Override // com.huawei.hms.network.embedded.C18303ob
    /* JADX INFO: renamed from: a */
    public boolean mo78724a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo78736j() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iM78713c = m78713c(i);
        while (i3 > 0) {
            int i4 = iM78713c == 0 ? 0 : this.f55076h[iM78713c - 1];
            int iMin = Math.min(i3, ((this.f55076h[iM78713c] - i4) + i4) - i);
            int[] iArr = this.f55076h;
            byte[][] bArr2 = this.f55075g;
            if (!C18276mc.m79204a(bArr2[iM78713c], (i - i4) + iArr[bArr2.length + iM78713c], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM78713c++;
        }
        return true;
    }
}
