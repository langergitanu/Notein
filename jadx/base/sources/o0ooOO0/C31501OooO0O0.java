package o0ooOO0;

import java.text.BreakIterator;

/* JADX INFO: renamed from: o0ooOO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31501OooO0O0 extends AbstractC31500OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static C31501OooO0O0 f112681OooO0Oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public BreakIterator f112682OooO0OO;

    @Override // o0ooOO0.AbstractC31500OooO00o
    public final int[] OooO0Oo(int i) {
        int length = OooO0o().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.f112682OooO0OO;
            if (breakIterator == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f112682OooO0OO;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("impl");
                    throw null;
                }
                int iFollowing = breakIterator2.following(i);
                if (iFollowing == -1) {
                    return null;
                }
                return OooO0o0(i, iFollowing);
            }
            BreakIterator breakIterator3 = this.f112682OooO0OO;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("impl");
                throw null;
            }
            i = breakIterator3.following(i);
        } while (i != -1);
        return null;
    }

    @Override // o0ooOO0.AbstractC31500OooO00o
    public final int[] OooO0oO(int i) {
        int length = OooO0o().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        do {
            BreakIterator breakIterator = this.f112682OooO0OO;
            if (breakIterator == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f112682OooO0OO;
                if (breakIterator2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("impl");
                    throw null;
                }
                int iPreceding = breakIterator2.preceding(i);
                if (iPreceding == -1) {
                    return null;
                }
                return OooO0o0(iPreceding, i);
            }
            BreakIterator breakIterator3 = this.f112682OooO0OO;
            if (breakIterator3 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("impl");
                throw null;
            }
            i = breakIterator3.preceding(i);
        } while (i != -1);
        return null;
    }
}
