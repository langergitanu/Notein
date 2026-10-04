package oOo00OoO;

/* JADX INFO: renamed from: oOo00OoO.OooOo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34541OooOo00 implements InterfaceC34548OooOoo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C34524OooO0Oo f123770OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34525OooO0o f123771OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f123772OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public C34543OooOo0o f123773OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f123774OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f123775OooOoo0;

    public C34541OooOo00(InterfaceC34525OooO0o interfaceC34525OooO0o) {
        this.f123771OooOo0o = interfaceC34525OooO0o;
        C34524OooO0Oo c34524OooO0OoOooOO0O = interfaceC34525OooO0o.OooOO0O();
        this.f123770OooOo = c34524OooO0OoOooOO0O;
        C34543OooOo0o c34543OooOo0o = c34524OooO0OoOooOO0O.f123724OooOo0o;
        this.f123773OooOoO0 = c34543OooOo0o;
        this.f123772OooOoO = c34543OooOo0o != null ? c34543OooOo0o.f123781OooO0O0 : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f123774OooOoOO = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f123781OooO0O0) goto L15;
     */
    @Override // oOo00OoO.InterfaceC34548OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(C34524OooO0Oo sink, long j) {
        C34543OooOo0o c34543OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(androidx.concurrent.futures.OooO00o.OooO0O0(j, "byteCount < 0: ").toString());
        }
        if (this.f123774OooOoOO) {
            throw new IllegalStateException("closed");
        }
        C34543OooOo0o c34543OooOo0o2 = this.f123773OooOoO0;
        C34524OooO0Oo c34524OooO0Oo = this.f123770OooOo;
        if (c34543OooOo0o2 != null) {
            C34543OooOo0o c34543OooOo0o3 = c34524OooO0Oo.f123724OooOo0o;
            if (c34543OooOo0o2 == c34543OooOo0o3) {
                int i = this.f123772OooOoO;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c34543OooOo0o3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f123771OooOo0o.request(this.f123775OooOoo0 + 1)) {
            return -1L;
        }
        if (this.f123773OooOoO0 == null && (c34543OooOo0o = c34524OooO0Oo.f123724OooOo0o) != null) {
            this.f123773OooOoO0 = c34543OooOo0o;
            this.f123772OooOoO = c34543OooOo0o.f123781OooO0O0;
        }
        long jMin = Math.min(j, c34524OooO0Oo.f123723OooOo - this.f123775OooOoo0);
        this.f123770OooOo.OooOOoo(sink, this.f123775OooOoo0, jMin);
        this.f123775OooOoo0 += jMin;
        return jMin;
    }

    @Override // oOo00OoO.InterfaceC34548OooOoo0
    public final C34547OooOoo timeout() {
        return this.f123771OooOo0o.timeout();
    }
}
