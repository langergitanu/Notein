package oOo00OoO;

/* JADX INFO: renamed from: oOo00OoO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34543OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f123780OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f123781OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f123782OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f123783OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C34543OooOo0o f123784OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f123785OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C34543OooOo0o f123786OooO0oO;

    public C34543OooOo0o() {
        this.f123780OooO00o = new byte[8192];
        this.f123785OooO0o0 = true;
        this.f123783OooO0Oo = false;
    }

    public final C34543OooOo0o OooO00o() {
        C34543OooOo0o c34543OooOo0o = this.f123784OooO0o;
        if (c34543OooOo0o == this) {
            c34543OooOo0o = null;
        }
        C34543OooOo0o c34543OooOo0o2 = this.f123786OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o2);
        c34543OooOo0o2.f123784OooO0o = this.f123784OooO0o;
        C34543OooOo0o c34543OooOo0o3 = this.f123784OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o3);
        c34543OooOo0o3.f123786OooO0oO = this.f123786OooO0oO;
        this.f123784OooO0o = null;
        this.f123786OooO0oO = null;
        return c34543OooOo0o;
    }

    public final void OooO0O0(C34543OooOo0o segment) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(segment, "segment");
        segment.f123786OooO0oO = this;
        segment.f123784OooO0o = this.f123784OooO0o;
        C34543OooOo0o c34543OooOo0o = this.f123784OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o);
        c34543OooOo0o.f123786OooO0oO = segment;
        this.f123784OooO0o = segment;
    }

    public final C34543OooOo0o OooO0OO() {
        this.f123783OooO0Oo = true;
        return new C34543OooOo0o(this.f123780OooO00o, this.f123781OooO0O0, this.f123782OooO0OO, true, false);
    }

    public final void OooO0Oo(C34543OooOo0o sink, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        if (!sink.f123785OooO0o0) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = sink.f123782OooO0OO;
        int i3 = i2 + i;
        byte[] bArr = sink.f123780OooO00o;
        if (i3 > 8192) {
            if (sink.f123783OooO0Oo) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.f123781OooO0O0;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            Oooo.OooO0OO.OooO0o0(0, i4, i2, bArr, bArr);
            sink.f123782OooO0OO -= sink.f123781OooO0O0;
            sink.f123781OooO0O0 = 0;
        }
        int i5 = sink.f123782OooO0OO;
        int i6 = this.f123781OooO0O0;
        Oooo.OooO0OO.OooO0o0(i5, i6, i6 + i, this.f123780OooO00o, bArr);
        sink.f123782OooO0OO += i;
        this.f123781OooO0O0 += i;
    }

    public C34543OooOo0o(byte[] data, int i, int i2, boolean z, boolean z2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(data, "data");
        this.f123780OooO00o = data;
        this.f123781OooO0O0 = i;
        this.f123782OooO0OO = i2;
        this.f123783OooO0Oo = z;
        this.f123785OooO0o0 = z2;
    }
}
