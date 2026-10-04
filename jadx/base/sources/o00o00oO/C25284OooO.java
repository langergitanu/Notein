package o00o00oO;

/* JADX INFO: renamed from: o00o00oO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25284OooO implements InterfaceC25290OooO0o0, InterfaceC25288OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f86039OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f86040OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile C25292OooO0oo f86041OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile InterfaceC25288OooO0Oo f86042OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f86045OooO0oO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f86044OooO0o0 = 3;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f86043OooO0o = 3;

    public C25284OooO(Object obj, InterfaceC25290OooO0o0 interfaceC25290OooO0o0) {
        this.f86040OooO0O0 = obj;
        this.f86039OooO00o = interfaceC25290OooO0o0;
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final void OooO() {
        synchronized (this.f86040OooO0O0) {
            try {
                this.f86045OooO0oO = true;
                try {
                    if (this.f86044OooO0o0 != 4 && this.f86043OooO0o != 1) {
                        this.f86043OooO0o = 1;
                        this.f86042OooO0Oo.OooO();
                    }
                    if (this.f86045OooO0oO && this.f86044OooO0o0 != 1) {
                        this.f86044OooO0o0 = 1;
                        this.f86041OooO0OO.OooO();
                    }
                    this.f86045OooO0oO = false;
                } catch (Throwable th) {
                    this.f86045OooO0oO = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o00o00oO.InterfaceC25290OooO0o0, o00o00oO.InterfaceC25288OooO0Oo
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f86040OooO0O0) {
            try {
                z = this.f86042OooO0Oo.OooO00o() || this.f86041OooO0OO.OooO00o();
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final boolean OooO0O0(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        boolean z;
        synchronized (this.f86040OooO0O0) {
            try {
                ?? r1 = this.f86039OooO00o;
                z = (r1 == 0 || r1.OooO0O0(this)) && (interfaceC25288OooO0Oo.equals(this.f86041OooO0OO) || this.f86044OooO0o0 != 4);
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final void OooO0OO(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        synchronized (this.f86040OooO0O0) {
            try {
                if (!interfaceC25288OooO0Oo.equals(this.f86041OooO0OO)) {
                    this.f86043OooO0o = 5;
                    return;
                }
                this.f86044OooO0o0 = 5;
                ?? r3 = this.f86039OooO00o;
                if (r3 != 0) {
                    r3.OooO0OO(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final boolean OooO0Oo() {
        boolean z;
        synchronized (this.f86040OooO0O0) {
            z = this.f86044OooO0o0 == 3;
        }
        return z;
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final boolean OooO0o(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        if (!(interfaceC25288OooO0Oo instanceof C25284OooO)) {
            return false;
        }
        C25284OooO c25284OooO = (C25284OooO) interfaceC25288OooO0Oo;
        if (this.f86041OooO0OO == null) {
            if (c25284OooO.f86041OooO0OO != null) {
                return false;
            }
        } else if (!this.f86041OooO0OO.OooO0o(c25284OooO.f86041OooO0OO)) {
            return false;
        }
        return this.f86042OooO0Oo == null ? c25284OooO.f86042OooO0Oo == null : this.f86042OooO0Oo.OooO0o(c25284OooO.f86042OooO0Oo);
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final boolean OooO0o0() {
        boolean z;
        synchronized (this.f86040OooO0O0) {
            z = this.f86044OooO0o0 == 4;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final void OooO0oO(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        synchronized (this.f86040OooO0O0) {
            try {
                if (interfaceC25288OooO0Oo.equals(this.f86042OooO0Oo)) {
                    this.f86043OooO0o = 4;
                    return;
                }
                this.f86044OooO0o0 = 4;
                ?? r3 = this.f86039OooO00o;
                if (r3 != 0) {
                    r3.OooO0oO(this);
                }
                if (!com.aspose.slides.internal.p332p7.OooO0o.OooO00o(this.f86043OooO0o)) {
                    this.f86042OooO0Oo.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final boolean OooO0oo(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        boolean z;
        synchronized (this.f86040OooO0O0) {
            try {
                ?? r1 = this.f86039OooO00o;
                z = (r1 == 0 || r1.OooO0oo(this)) && interfaceC25288OooO0Oo.equals(this.f86041OooO0OO) && this.f86044OooO0o0 != 2;
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final boolean OooOO0(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        boolean z;
        synchronized (this.f86040OooO0O0) {
            try {
                ?? r1 = this.f86039OooO00o;
                z = (r1 == 0 || r1.OooOO0(this)) && interfaceC25288OooO0Oo.equals(this.f86041OooO0OO) && !OooO00o();
            } finally {
            }
        }
        return z;
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final void clear() {
        synchronized (this.f86040OooO0O0) {
            this.f86045OooO0oO = false;
            this.f86044OooO0o0 = 3;
            this.f86043OooO0o = 3;
            this.f86042OooO0Oo.clear();
            this.f86041OooO0OO.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final InterfaceC25290OooO0o0 getRoot() {
        InterfaceC25290OooO0o0 root;
        synchronized (this.f86040OooO0O0) {
            try {
                ?? r1 = this.f86039OooO00o;
                root = r1 != 0 ? r1.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f86040OooO0O0) {
            z = true;
            if (this.f86044OooO0o0 != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final void pause() {
        synchronized (this.f86040OooO0O0) {
            try {
                if (!com.aspose.slides.internal.p332p7.OooO0o.OooO00o(this.f86043OooO0o)) {
                    this.f86043OooO0o = 2;
                    this.f86042OooO0Oo.pause();
                }
                if (!com.aspose.slides.internal.p332p7.OooO0o.OooO00o(this.f86044OooO0o0)) {
                    this.f86044OooO0o0 = 2;
                    this.f86041OooO0OO.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
