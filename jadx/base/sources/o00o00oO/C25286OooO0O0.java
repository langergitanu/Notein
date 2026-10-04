package o00o00oO;

/* JADX INFO: renamed from: o00o00oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25286OooO0O0 implements InterfaceC25290OooO0o0, InterfaceC25288OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f86065OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f86066OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile InterfaceC25288OooO0Oo f86067OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile InterfaceC25288OooO0Oo f86068OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f86070OooO0o0 = 3;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f86069OooO0o = 3;

    public C25286OooO0O0(Object obj, InterfaceC25290OooO0o0 interfaceC25290OooO0o0) {
        this.f86065OooO00o = obj;
        this.f86066OooO0O0 = interfaceC25290OooO0o0;
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final void OooO() {
        synchronized (this.f86065OooO00o) {
            try {
                if (this.f86070OooO0o0 != 1) {
                    this.f86070OooO0o0 = 1;
                    this.f86067OooO0OO.OooO();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o00o00oO.InterfaceC25290OooO0o0, o00o00oO.InterfaceC25288OooO0Oo
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.f86065OooO00o) {
            try {
                z = this.f86067OooO0OO.OooO00o() || this.f86068OooO0Oo.OooO00o();
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final boolean OooO0O0(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        boolean z;
        synchronized (this.f86065OooO00o) {
            ?? r0 = this.f86066OooO0O0;
            z = r0 == 0 || r0.OooO0O0(this);
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final void OooO0OO(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        synchronized (this.f86065OooO00o) {
            try {
                if (interfaceC25288OooO0Oo.equals(this.f86068OooO0Oo)) {
                    this.f86069OooO0o = 5;
                    ?? r3 = this.f86066OooO0O0;
                    if (r3 != 0) {
                        r3.OooO0OO(this);
                    }
                    return;
                }
                this.f86070OooO0o0 = 5;
                if (this.f86069OooO0o != 1) {
                    this.f86069OooO0o = 1;
                    this.f86068OooO0Oo.OooO();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final boolean OooO0Oo() {
        boolean z;
        synchronized (this.f86065OooO00o) {
            try {
                z = this.f86070OooO0o0 == 3 && this.f86069OooO0o == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final boolean OooO0o(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        if (interfaceC25288OooO0Oo instanceof C25286OooO0O0) {
            C25286OooO0O0 c25286OooO0O0 = (C25286OooO0O0) interfaceC25288OooO0Oo;
            if (this.f86067OooO0OO.OooO0o(c25286OooO0O0.f86067OooO0OO) && this.f86068OooO0Oo.OooO0o(c25286OooO0O0.f86068OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final boolean OooO0o0() {
        boolean z;
        synchronized (this.f86065OooO00o) {
            try {
                z = this.f86070OooO0o0 == 4 || this.f86069OooO0o == 4;
            } finally {
            }
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final void OooO0oO(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        synchronized (this.f86065OooO00o) {
            try {
                if (interfaceC25288OooO0Oo.equals(this.f86067OooO0OO)) {
                    this.f86070OooO0o0 = 4;
                } else if (interfaceC25288OooO0Oo.equals(this.f86068OooO0Oo)) {
                    this.f86069OooO0o = 4;
                }
                ?? r4 = this.f86066OooO0O0;
                if (r4 != 0) {
                    r4.OooO0oO(this);
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
        synchronized (this.f86065OooO00o) {
            ?? r1 = this.f86066OooO0O0;
            z = (r1 == 0 || r1.OooO0oo(this)) && interfaceC25288OooO0Oo.equals(this.f86067OooO0OO);
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final boolean OooOO0(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        boolean z;
        int i;
        synchronized (this.f86065OooO00o) {
            ?? r1 = this.f86066OooO0O0;
            z = false;
            if (r1 == 0 || r1.OooOO0(this)) {
                if (this.f86070OooO0o0 != 5 ? interfaceC25288OooO0Oo.equals(this.f86067OooO0OO) : interfaceC25288OooO0Oo.equals(this.f86068OooO0Oo) && ((i = this.f86069OooO0o) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final void clear() {
        synchronized (this.f86065OooO00o) {
            try {
                this.f86070OooO0o0 = 3;
                this.f86067OooO0OO.clear();
                if (this.f86069OooO0o != 3) {
                    this.f86069OooO0o = 3;
                    this.f86068OooO0Oo.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o00o00oO.OooO0o0] */
    @Override // o00o00oO.InterfaceC25290OooO0o0
    public final InterfaceC25290OooO0o0 getRoot() {
        InterfaceC25290OooO0o0 root;
        synchronized (this.f86065OooO00o) {
            try {
                ?? r1 = this.f86066OooO0O0;
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
        synchronized (this.f86065OooO00o) {
            try {
                z = true;
                if (this.f86070OooO0o0 != 1 && this.f86069OooO0o != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // o00o00oO.InterfaceC25288OooO0Oo
    public final void pause() {
        synchronized (this.f86065OooO00o) {
            try {
                if (this.f86070OooO0o0 == 1) {
                    this.f86070OooO0o0 = 2;
                    this.f86067OooO0OO.pause();
                }
                if (this.f86069OooO0o == 1) {
                    this.f86069OooO0o = 2;
                    this.f86068OooO0Oo.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
