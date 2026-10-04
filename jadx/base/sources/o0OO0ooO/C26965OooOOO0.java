package o0OO0ooO;

import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import java.util.ArrayList;

/* JADX INFO: renamed from: o0OO0ooO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26965OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f93670OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f93671OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f93672OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f93673OooO0Oo;

    public C26965OooOOO0(ArrayList arrayList, int i, int i2, int i3) {
        this.f93670OooO00o = arrayList;
        this.f93671OooO0O0 = i;
        this.f93672OooO0OO = i2;
        this.f93673OooO0Oo = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26965OooOOO0)) {
            return false;
        }
        C26965OooOOO0 c26965OooOOO0 = (C26965OooOOO0) obj;
        return this.f93670OooO00o.equals(c26965OooOOO0.f93670OooO00o) && this.f93671OooO0O0 == c26965OooOOO0.f93671OooO0O0 && this.f93672OooO0OO == c26965OooOOO0.f93672OooO0OO && this.f93673OooO0Oo == c26965OooOOO0.f93673OooO0Oo;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93673OooO0Oo) + C20785Oooo00o.OooO00o(this.f93672OooO0OO, C20785Oooo00o.OooO00o(this.f93671OooO0O0, this.f93670OooO00o.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialListResult(items=");
        sb.append(this.f93670OooO00o);
        sb.append(", page=");
        sb.append(this.f93671OooO0O0);
        sb.append(", pageSize=");
        sb.append(this.f93672OooO0OO);
        sb.append(", total=");
        return C21023OooO0Oo.OooO0OO(")", this.f93673OooO0Oo, sb);
    }
}
