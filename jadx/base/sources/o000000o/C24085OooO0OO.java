package o000000o;

/* JADX INFO: renamed from: o000000o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24085OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f81171OooO00o = 0;

    public static final int OooO00o(int i, Object obj) {
        return (i * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public static final int OooO0O0(C24093OooOOo0 fontWeight, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontWeight, "fontWeight");
        boolean z = fontWeight.compareTo(C24093OooOOo0.f81189OooOo) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }
}
