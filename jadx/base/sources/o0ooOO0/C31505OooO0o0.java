package o0ooOO0;

/* JADX INFO: renamed from: o0ooOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31505OooO0o0 extends AbstractC31500OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static C31505OooO0o0 f112690OooO0OO;

    public final boolean OooO(int i) {
        if (i <= 0 || OooO0o().charAt(i - 1) == '\n') {
            return false;
        }
        return i == OooO0o().length() || OooO0o().charAt(i) == '\n';
    }

    @Override // o0ooOO0.AbstractC31500OooO00o
    public final int[] OooO0Oo(int i) {
        int length = OooO0o().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && OooO0o().charAt(i) == '\n' && (OooO0o().charAt(i) == '\n' || (i != 0 && OooO0o().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !OooO(i2)) {
            i2++;
        }
        return OooO0o0(i, i2);
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
        while (i > 0 && OooO0o().charAt(i - 1) == '\n' && !OooO(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (OooO0o().charAt(i2) == '\n' || (i2 != 0 && OooO0o().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return OooO0o0(i2, i);
    }
}
