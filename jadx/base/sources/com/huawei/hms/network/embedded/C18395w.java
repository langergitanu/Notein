package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w */
/* JADX INFO: loaded from: classes9.dex */
public class C18395w implements InterfaceC18408x {

    /* JADX INFO: renamed from: a */
    public boolean f56493a;

    /* JADX INFO: renamed from: b */
    public boolean f56494b;

    /* JADX INFO: renamed from: c */
    public boolean f56495c;

    /* JADX INFO: renamed from: d */
    public int f56496d;

    /* JADX INFO: renamed from: e */
    public int f56497e;

    /* JADX INFO: renamed from: f */
    public long f56498f;

    /* JADX INFO: renamed from: g */
    public int f56499g = 0;

    /* JADX INFO: renamed from: h */
    public int f56500h = 0;

    /* JADX INFO: renamed from: i */
    public int f56501i = 0;

    /* JADX INFO: renamed from: j */
    public boolean f56502j;

    @Override // com.huawei.hms.network.embedded.InterfaceC18408x
    /* JADX INFO: renamed from: a */
    public int mo79801a() {
        if (this.f56502j) {
            this.f56501i = 1;
        }
        return this.f56501i;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18408x
    /* JADX INFO: renamed from: b */
    public int mo79805b() {
        int i;
        int i2 = this.f56496d;
        if (i2 == 1) {
            int i3 = this.f56497e;
            if (i3 == 1) {
                this.f56500h = 1;
            } else if (i3 == 2) {
                this.f56500h = 2;
            } else if (i3 == 3) {
                this.f56500h = 3;
            } else if (i3 == 0) {
                i = 10;
                this.f56500h = i;
            }
        } else if (i2 == 4) {
            int i4 = this.f56497e;
            if (i4 == 1) {
                this.f56500h = 4;
            } else if (i4 == 2) {
                this.f56500h = 5;
            } else {
                if (i4 == 3) {
                    i = 6;
                } else if (i4 == 0) {
                    i = 11;
                }
                this.f56500h = i;
            }
        } else if (i2 == 5) {
            int i5 = this.f56497e;
            if (i5 == 1) {
                i = 7;
            } else if (i5 == 2) {
                i = 8;
            } else if (i5 == 3) {
                i = 9;
            } else if (i5 == 0) {
                i = 12;
            }
            this.f56500h = i;
        } else if (i2 == 0) {
            int i6 = this.f56497e;
            if (i6 == 1) {
                i = 13;
            } else if (i6 == 2) {
                i = 14;
            } else if (i6 == 3) {
                i = 15;
            } else if (i6 == 0) {
                i = 16;
            }
            this.f56500h = i;
        }
        return this.f56500h;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18408x
    /* JADX INFO: renamed from: c */
    public int mo79808c() {
        int i;
        if (this.f56495c) {
            boolean z = this.f56493a;
            if (z && this.f56494b) {
                this.f56499g = 1;
            }
            if (z && !this.f56494b) {
                this.f56499g = 2;
            }
            if (!z && this.f56494b) {
                this.f56499g = 3;
            }
            if (!z && !this.f56494b) {
                i = 4;
                this.f56499g = i;
            }
        } else {
            boolean z2 = this.f56493a;
            if (z2 && this.f56494b) {
                this.f56499g = 5;
            }
            if (z2 && !this.f56494b) {
                this.f56499g = 6;
            }
            if (!z2 && this.f56494b) {
                this.f56499g = 7;
            }
            if (!z2 && !this.f56494b) {
                i = 8;
                this.f56499g = i;
            }
        }
        return this.f56499g;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18408x
    /* JADX INFO: renamed from: d */
    public long mo79810d() {
        return this.f56498f;
    }

    public String toString() {
        return "SystemControlImpl{isDozeIdleMode=" + this.f56493a + ", isAppIdleMode=" + this.f56494b + ", isAllowList=" + this.f56495c + ", isPowerSaverMode=" + this.f56496d + ", isDataSaverMode=" + this.f56497e + ", sysControlTimeStamp=" + this.f56498f + ", sysControlMode=" + this.f56499g + ", controlPolicyMode=" + this.f56500h + ", hwControlMode=" + this.f56501i + ", isFreeze=" + this.f56502j + '}';
    }

    /* JADX INFO: renamed from: a */
    public void m79802a(int i) {
        this.f56497e = i;
    }

    /* JADX INFO: renamed from: b */
    public void m79806b(int i) {
        this.f56496d = i;
    }

    /* JADX INFO: renamed from: c */
    public void m79809c(boolean z) {
        this.f56493a = z;
    }

    /* JADX INFO: renamed from: d */
    public void m79811d(boolean z) {
        this.f56502j = z;
    }

    /* JADX INFO: renamed from: a */
    public void m79803a(long j) {
        this.f56498f = j;
    }

    /* JADX INFO: renamed from: b */
    public void m79807b(boolean z) {
        this.f56494b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m79804a(boolean z) {
        this.f56495c = z;
    }
}
