package o0oOoOo;

import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: o0oOoOo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31047OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BackupFile.DiskVendor f110851OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f110852OooO0O0;

    public C31047OooOOoo(BackupFile.DiskVendor diskVendor, boolean z) {
        this.f110851OooO00o = diskVendor;
        this.f110852OooO0O0 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31047OooOOoo)) {
            return false;
        }
        C31047OooOOoo c31047OooOOoo = (C31047OooOOoo) obj;
        return this.f110851OooO00o == c31047OooOOoo.f110851OooO00o && this.f110852OooO0O0 == c31047OooOOoo.f110852OooO0O0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f110852OooO0O0) + (this.f110851OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "NetDiskVendorVO(vendor=" + this.f110851OooO00o + ", inUse=" + this.f110852OooO0O0 + ")";
    }
}
