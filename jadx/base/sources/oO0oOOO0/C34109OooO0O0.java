package oO0oOOO0;

import OooOooo.C20785Oooo00o;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO0oOOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34109OooO0O0 implements Comparable<C34109OooO0O0> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f122562OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f122563OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final EnumC34111OooO0Oo f122564OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f122565OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f122566OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final EnumC34110OooO0OO f122567OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f122568OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final int f122569OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final long f122570OooOooo;

    static {
        C34108OooO00o.OooO00o(0L);
    }

    public C34109OooO0O0(int i, int i2, int i3, EnumC34111OooO0Oo dayOfWeek, int i4, int i5, EnumC34110OooO0OO month, int i6, long j) {
        OooOOO0.OooO0oO(dayOfWeek, "dayOfWeek");
        OooOOO0.OooO0oO(month, "month");
        this.f122563OooOo0o = i;
        this.f122562OooOo = i2;
        this.f122565OooOoO0 = i3;
        this.f122564OooOoO = dayOfWeek;
        this.f122566OooOoOO = i4;
        this.f122568OooOoo0 = i5;
        this.f122567OooOoo = month;
        this.f122569OooOooO = i6;
        this.f122570OooOooo = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C34109OooO0O0 c34109OooO0O0) {
        C34109OooO0O0 other = c34109OooO0O0;
        OooOOO0.OooO0oO(other, "other");
        return OooOOO0.OooOO0(this.f122570OooOooo, other.f122570OooOooo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34109OooO0O0)) {
            return false;
        }
        C34109OooO0O0 c34109OooO0O0 = (C34109OooO0O0) obj;
        return this.f122563OooOo0o == c34109OooO0O0.f122563OooOo0o && this.f122562OooOo == c34109OooO0O0.f122562OooOo && this.f122565OooOoO0 == c34109OooO0O0.f122565OooOoO0 && this.f122564OooOoO == c34109OooO0O0.f122564OooOoO && this.f122566OooOoOO == c34109OooO0O0.f122566OooOoOO && this.f122568OooOoo0 == c34109OooO0O0.f122568OooOoo0 && this.f122567OooOoo == c34109OooO0O0.f122567OooOoo && this.f122569OooOooO == c34109OooO0O0.f122569OooOooO && this.f122570OooOooo == c34109OooO0O0.f122570OooOooo;
    }

    public final int hashCode() {
        return Long.hashCode(this.f122570OooOooo) + C20785Oooo00o.OooO00o(this.f122569OooOooO, (this.f122567OooOoo.hashCode() + C20785Oooo00o.OooO00o(this.f122568OooOoo0, C20785Oooo00o.OooO00o(this.f122566OooOoOO, (this.f122564OooOoO.hashCode() + C20785Oooo00o.OooO00o(this.f122565OooOoO0, C20785Oooo00o.OooO00o(this.f122562OooOo, Integer.hashCode(this.f122563OooOo0o) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "GMTDate(seconds=" + this.f122563OooOo0o + ", minutes=" + this.f122562OooOo + ", hours=" + this.f122565OooOoO0 + ", dayOfWeek=" + this.f122564OooOoO + ", dayOfMonth=" + this.f122566OooOoOO + ", dayOfYear=" + this.f122568OooOoo0 + ", month=" + this.f122567OooOoo + ", year=" + this.f122569OooOooO + ", timestamp=" + this.f122570OooOooo + ')';
    }
}
