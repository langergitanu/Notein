package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.fc */
/* JADX INFO: loaded from: classes9.dex */
public final class C18178fc {

    /* JADX INFO: renamed from: h */
    public static final int f54863h = 8192;

    /* JADX INFO: renamed from: i */
    public static final int f54864i = 1024;

    /* JADX INFO: renamed from: a */
    public final byte[] f54865a;

    /* JADX INFO: renamed from: b */
    public int f54866b;

    /* JADX INFO: renamed from: c */
    public int f54867c;

    /* JADX INFO: renamed from: d */
    public boolean f54868d;

    /* JADX INFO: renamed from: e */
    public boolean f54869e;

    /* JADX INFO: renamed from: f */
    public C18178fc f54870f;

    /* JADX INFO: renamed from: g */
    public C18178fc f54871g;

    public C18178fc() {
        this.f54865a = new byte[8192];
        this.f54869e = true;
        this.f54868d = false;
    }

    /* JADX INFO: renamed from: a */
    public final C18178fc m78508a(int i) {
        C18178fc c18178fcM78639a;
        if (i <= 0 || i > this.f54867c - this.f54866b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            c18178fcM78639a = m78513c();
        } else {
            c18178fcM78639a = C18192gc.m78639a();
            System.arraycopy(this.f54865a, this.f54866b, c18178fcM78639a.f54865a, 0, i);
        }
        c18178fcM78639a.f54867c = c18178fcM78639a.f54866b + i;
        this.f54866b += i;
        this.f54871g.m78509a(c18178fcM78639a);
        return c18178fcM78639a;
    }

    /* JADX INFO: renamed from: b */
    public final C18178fc m78512b() {
        C18178fc c18178fc = this.f54870f;
        C18178fc c18178fc2 = c18178fc != this ? c18178fc : null;
        C18178fc c18178fc3 = this.f54871g;
        c18178fc3.f54870f = c18178fc;
        this.f54870f.f54871g = c18178fc3;
        this.f54870f = null;
        this.f54871g = null;
        return c18178fc2;
    }

    /* JADX INFO: renamed from: c */
    public final C18178fc m78513c() {
        this.f54868d = true;
        return new C18178fc(this.f54865a, this.f54866b, this.f54867c, true, false);
    }

    /* JADX INFO: renamed from: d */
    public final C18178fc m78514d() {
        return new C18178fc((byte[]) this.f54865a.clone(), this.f54866b, this.f54867c, false, true);
    }

    public C18178fc(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f54865a = bArr;
        this.f54866b = i;
        this.f54867c = i2;
        this.f54868d = z;
        this.f54869e = z2;
    }

    /* JADX INFO: renamed from: a */
    public final C18178fc m78509a(C18178fc c18178fc) {
        c18178fc.f54871g = this;
        c18178fc.f54870f = this.f54870f;
        this.f54870f.f54871g = c18178fc;
        this.f54870f = c18178fc;
        return c18178fc;
    }

    /* JADX INFO: renamed from: a */
    public final void m78510a() {
        C18178fc c18178fc = this.f54871g;
        if (c18178fc == this) {
            throw new IllegalStateException();
        }
        if (c18178fc.f54869e) {
            int i = this.f54867c - this.f54866b;
            if (i > (8192 - c18178fc.f54867c) + (c18178fc.f54868d ? 0 : c18178fc.f54866b)) {
                return;
            }
            m78511a(c18178fc, i);
            m78512b();
            C18192gc.m78640a(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m78511a(C18178fc c18178fc, int i) {
        if (!c18178fc.f54869e) {
            throw new IllegalArgumentException();
        }
        int i2 = c18178fc.f54867c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c18178fc.f54868d) {
                throw new IllegalArgumentException();
            }
            int i4 = c18178fc.f54866b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c18178fc.f54865a;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            c18178fc.f54867c -= c18178fc.f54866b;
            c18178fc.f54866b = 0;
        }
        System.arraycopy(this.f54865a, this.f54866b, c18178fc.f54865a, c18178fc.f54867c, i);
        c18178fc.f54867c += i;
        this.f54866b += i;
    }
}
