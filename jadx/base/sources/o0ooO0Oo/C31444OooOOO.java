package o0ooO0Oo;

import Oooo0oO.C21023OooO0Oo;

/* JADX INFO: renamed from: o0ooO0Oo.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31444OooOOO implements Comparable<C31444OooOOO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f112465OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final long f112466OooOo0o;

    public C31444OooOOO(long j, int i) {
        this.f112466OooOo0o = j;
        this.f112465OooOo = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C31444OooOOO c31444OooOOO) {
        C31444OooOOO c31444OooOOO2 = c31444OooOOO;
        long j = c31444OooOOO2.f112466OooOo0o;
        long j2 = this.f112466OooOo0o;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        int i = this.f112465OooOo;
        int i2 = c31444OooOOO2.f112465OooOo;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        C31444OooOOO c31444OooOOO = obj instanceof C31444OooOOO ? (C31444OooOOO) obj : null;
        return c31444OooOOO != null && c31444OooOOO.f112466OooOo0o == this.f112466OooOo0o && c31444OooOOO.f112465OooOo == this.f112465OooOo;
    }

    public final int hashCode() {
        return Long.valueOf((this.f112466OooOo0o << 4) + ((long) this.f112465OooOo)).hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f112466OooOo0o);
        sb.append(" ");
        return C21023OooO0Oo.OooO0OO(" R", this.f112465OooOo, sb);
    }
}
