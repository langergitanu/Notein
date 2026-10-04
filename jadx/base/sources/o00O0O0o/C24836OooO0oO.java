package o00O0O0o;

import android.app.Notification;

/* JADX INFO: renamed from: o00O0O0o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24836OooO0oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f84250OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f84251OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Notification f84252OooO0OO;

    public C24836OooO0oO(int i, Notification notification, int i2) {
        this.f84250OooO00o = i;
        this.f84252OooO0OO = notification;
        this.f84251OooO0O0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24836OooO0oO.class != obj.getClass()) {
            return false;
        }
        C24836OooO0oO c24836OooO0oO = (C24836OooO0oO) obj;
        if (this.f84250OooO00o == c24836OooO0oO.f84250OooO00o && this.f84251OooO0O0 == c24836OooO0oO.f84251OooO0O0) {
            return this.f84252OooO0OO.equals(c24836OooO0oO.f84252OooO0OO);
        }
        return false;
    }

    public final int hashCode() {
        return this.f84252OooO0OO.hashCode() + (((this.f84250OooO00o * 31) + this.f84251OooO0O0) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f84250OooO00o + ", mForegroundServiceType=" + this.f84251OooO0O0 + ", mNotification=" + this.f84252OooO0OO + '}';
    }
}
