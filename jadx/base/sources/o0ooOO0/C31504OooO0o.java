package o0ooOO0;

import java.text.BreakIterator;

/* JADX INFO: renamed from: o0ooOO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31504OooO0o extends AbstractC31500OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static C31504OooO0o f112688OooO0Oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public BreakIterator f112689OooO0OO;

    public final boolean OooO(int i) {
        if (i <= 0 || !OooOO0(i - 1)) {
            return false;
        }
        return i == OooO0o().length() || !OooOO0(i);
    }

    @Override // o0ooOO0.AbstractC31500OooO00o
    public final int[] OooO0Oo(int i) {
        if (OooO0o().length() > 0 && i < OooO0o().length()) {
            if (i < 0) {
                i = 0;
            }
            while (!OooOO0(i) && (!OooOO0(i) || (i != 0 && OooOO0(i - 1)))) {
                BreakIterator breakIterator = this.f112689OooO0OO;
                if (breakIterator == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("impl");
                    throw null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.f112689OooO0OO;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("impl");
                throw null;
            }
            int iFollowing = breakIterator2.following(i);
            if (iFollowing != -1 && OooO(iFollowing)) {
                return OooO0o0(i, iFollowing);
            }
        }
        return null;
    }

    @Override // o0ooOO0.AbstractC31500OooO00o
    public final int[] OooO0oO(int i) {
        int length = OooO0o().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (i > 0 && !OooOO0(i - 1) && !OooO(i)) {
                BreakIterator breakIterator = this.f112689OooO0OO;
                if (breakIterator == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("impl");
                    throw null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.f112689OooO0OO;
            if (breakIterator2 == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("impl");
                throw null;
            }
            int iPreceding = breakIterator2.preceding(i);
            if (iPreceding != -1 && OooOO0(iPreceding) && (iPreceding == 0 || !OooOO0(iPreceding - 1))) {
                return OooO0o0(iPreceding, i);
            }
        }
        return null;
    }

    public final boolean OooOO0(int i) {
        if (i < 0 || i >= OooO0o().length()) {
            return false;
        }
        return Character.isLetterOrDigit(OooO0o().codePointAt(i));
    }
}
