package OooOo;

/* JADX INFO: renamed from: OooOo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20494Oooo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f58551OooO00o = new Object();

    public static final void OooO00o(Oooo0 oooo0) {
        int i = oooo0.f58539OooOoO;
        int[] iArr = oooo0.f58537OooOo;
        Object[] objArr = oooo0.f58540OooOoO0;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f58551OooO00o) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        oooo0.f58538OooOo0o = false;
        oooo0.f58539OooOoO = i2;
    }
}
