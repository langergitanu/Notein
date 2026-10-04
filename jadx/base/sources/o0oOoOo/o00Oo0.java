package o0oOoOo;

import OooOoo0.o00000;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f110966OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f110967OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f110968OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f110969OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f110970OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f110971OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f110972OooO0oO;

    public o00Oo0(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f110966OooO00o = str;
        this.f110967OooO0O0 = i;
        this.f110968OooO0OO = i2;
        this.f110969OooO0Oo = i3;
        this.f110971OooO0o0 = i4;
        this.f110970OooO0o = i5;
        this.f110972OooO0oO = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Oo0)) {
            return false;
        }
        o00Oo0 o00oo02 = (o00Oo0) obj;
        return this.f110966OooO00o.equals(o00oo02.f110966OooO00o) && this.f110967OooO0O0 == o00oo02.f110967OooO0O0 && this.f110968OooO0OO == o00oo02.f110968OooO0OO && this.f110969OooO0Oo == o00oo02.f110969OooO0Oo && this.f110971OooO0o0 == o00oo02.f110971OooO0o0 && this.f110970OooO0o == o00oo02.f110970OooO0o && this.f110972OooO0oO == o00oo02.f110972OooO0oO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110972OooO0oO) + C20785Oooo00o.OooO00o(this.f110970OooO0o, C20785Oooo00o.OooO00o(this.f110971OooO0o0, C20785Oooo00o.OooO00o(this.f110969OooO0Oo, o00000.OooO0O0(C20785Oooo00o.OooO00o(this.f110968OooO0OO, C20785Oooo00o.OooO00o(this.f110967OooO0O0, this.f110966OooO00o.hashCode() * 31, 31), 31), 31, false), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAttachmentVO(uid=");
        sb.append(this.f110966OooO00o);
        sb.append(", numOfDays=");
        sb.append(this.f110967OooO0O0);
        sb.append(", numOfNotes=");
        sb.append(this.f110968OooO0OO);
        sb.append(", cloudSyncAvailable=false, numOfCoupons=");
        sb.append(this.f110969OooO0Oo);
        sb.append(", numOfUnreadMsg=");
        sb.append(this.f110971OooO0o0);
        sb.append(", spentAiQuota=");
        sb.append(this.f110970OooO0o);
        sb.append(", totalAiQuota=");
        return C21023OooO0Oo.OooO0OO(")", this.f110972OooO0oO, sb);
    }
}
