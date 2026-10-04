package androidx.ink.geometry;

import android.graphics.Path;

/* JADX INFO: renamed from: androidx.ink.geometry.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21956OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000OOo0.OooO00o f65403OooO00o;

    static {
        new o000OOo0.OooO00o(new OooO0O0());
        new o000OOo0.OooO00o(new OooO0OO());
        f65403OooO00o = new o000OOo0.OooO00o(new C21955OooO0Oo(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MutableVec OooO00o() {
        T t = f65403OooO00o.get();
        kotlin.jvm.internal.OooOOO0.OooO0Oo(t);
        return (MutableVec) t;
    }

    public static final void OooO0O0(OooOo00 oooOo00, int i, Path path) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooOo00, "<this>");
        path.rewind();
        int iOooO0OO = oooOo00.OooO0OO(i);
        for (int i2 = 0; i2 < iOooO0OO; i2++) {
            int iOooO0Oo = oooOo00.OooO0Oo(i, i2);
            if (iOooO0Oo != 0) {
                oooOo00.OooO0o(i, i2, 0, OooO00o());
                path.moveTo(OooO00o().x, OooO00o().y);
                for (int i3 = 1; i3 < iOooO0Oo; i3++) {
                    oooOo00.OooO0o(i, i2, i3, OooO00o());
                    path.lineTo(OooO00o().x, OooO00o().y);
                }
                path.close();
            }
        }
    }
}
