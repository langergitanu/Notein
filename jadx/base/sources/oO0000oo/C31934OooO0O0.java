package oO0000oo;

import Oooo0.C20855OooooOO;
import Oooo0oO.o0Oo0oo;

/* JADX INFO: renamed from: oO0000oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31934OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f113891OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f113892OooO0O0;

    public C31934OooO0O0(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        this.f113891OooO00o = i;
        this.f113892OooO0O0 = 0;
    }

    public final boolean OooO00o() {
        return this.f113892OooO0O0 >= this.f113891OooO00o;
    }

    public final void OooO0O0(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(o0Oo0oo.OooO0O0(i, "pos: ", " < lowerBound: 0"));
        }
        int i2 = this.f113891OooO00o;
        if (i > i2) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "pos: ", " > upperBound: "));
        }
        this.f113892OooO0O0 = i;
    }

    public final String toString() {
        return "[" + Integer.toString(0) + '>' + Integer.toString(this.f113892OooO0O0) + '>' + Integer.toString(this.f113891OooO00o) + ']';
    }
}
