package oOO00OO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f123306OooO00o = 0;

    static {
        OooO0O0(0, 1);
        OooO0O0(0, 2);
        OooO0O0(0, 3);
        OooO0O0(0, 4);
        OooO0O0(1, 1);
        OooO0O0(1, 2);
        OooO0O0(1, 3);
        OooO0O0(1, 4);
        OooO0O0(2, 1);
        OooO0O0(2, 2);
        OooO0O0(2, 3);
        OooO0O0(2, 4);
        OooO0O0(3, 1);
        OooO0O0(3, 2);
        OooO0O0(3, 3);
        OooO0O0(3, 4);
        OooO0O0(4, 1);
        OooO0O0(4, 2);
        OooO0O0(4, 3);
        OooO0O0(4, 4);
        OooO0O0(5, 1);
        OooO0O0(5, 2);
        OooO0O0(5, 3);
        OooO0O0(5, 4);
        OooO0O0(6, 1);
        OooO0O0(6, 2);
        OooO0O0(6, 3);
        OooO0O0(6, 4);
        OooO0O0(7, 1);
        OooO0O0(7, 2);
        OooO0O0(7, 3);
        OooO0O0(7, 4);
    }

    public static final int OooO00o(int i) {
        return (i >> 3) + 1;
    }

    public static final int OooO0O0(int i, int i2) {
        if (i2 <= 0 || i2 >= 512) {
            throw new UnsupportedOperationException("Channels count should be 1..511");
        }
        if (i < 0 || i >= 8) {
            throw new UnsupportedOperationException("Data type depth should be 0..7");
        }
        return (i & 7) + ((i2 - 1) << 3);
    }
}
