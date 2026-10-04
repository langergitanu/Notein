package OoooOO0;

import OooO0Oo.C20398OooO0O0;
import Oooo0.C20855OooooOO;

/* JADX INFO: renamed from: OoooOO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21174OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61417OooO00o = 0;

    public static final void OooO00o(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }
    }

    public static final void OooO0O0(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }
    }

    public static final void OooO0OO(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("fromIndex: ", i, ", toIndex: ", ", size: ", i2);
            sbOooO0O0.append(i3);
            throw new IndexOutOfBoundsException(sbOooO0O0.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }
}
