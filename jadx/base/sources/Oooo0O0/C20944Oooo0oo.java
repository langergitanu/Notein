package Oooo0O0;

import OooOoo0.C20706o00000oO;
import OooooOO.C21348Ooooo0o;

/* JADX INFO: renamed from: Oooo0O0.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20944Oooo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f60433OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f60434OooO0O0;

    public C20944Oooo0oo(long j, long j2) {
        this.f60433OooO00o = j;
        this.f60434OooO0O0 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20944Oooo0oo)) {
            return false;
        }
        C20944Oooo0oo c20944Oooo0oo = (C20944Oooo0oo) obj;
        return C21348Ooooo0o.OooO0OO(this.f60433OooO00o, c20944Oooo0oo.f60433OooO00o) && C21348Ooooo0o.OooO0OO(this.f60434OooO0O0, c20944Oooo0oo.f60434OooO0O0);
    }

    public final int hashCode() {
        int i = C21348Ooooo0o.f61767OooO0oo;
        return Long.hashCode(this.f60434OooO0O0) + (Long.hashCode(this.f60433OooO00o) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        C20706o00000oO.OooO0O0(this.f60433OooO00o, ", selectionBackgroundColor=", sb);
        sb.append((Object) C21348Ooooo0o.OooO(this.f60434OooO0O0));
        sb.append(')');
        return sb.toString();
    }
}
