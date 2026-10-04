package Oooo0oO;

import java.util.ArrayList;

/* JADX INFO: renamed from: Oooo0oO.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21068OoooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ArrayList<Object> f61023OooO00o;

    public final boolean OooO00o(C21025OooO0o0 c21025OooO0o0) {
        ArrayList<Object> arrayList = this.f61023OooO00o;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, c21025OooO0o0)) {
                    return true;
                }
                if ((obj instanceof C21068OoooOoO) && ((C21068OoooOoO) obj).OooO00o(c21025OooO0o0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C21068OoooOoO OooO0O0() {
        Object obj;
        ArrayList<Object> arrayList = this.f61023OooO00o;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if (obj instanceof C21068OoooOoO) {
                    ((C21068OoooOoO) obj).getClass();
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        C21068OoooOoO c21068OoooOoO = obj instanceof C21068OoooOoO ? (C21068OoooOoO) obj : null;
        return c21068OoooOoO != null ? c21068OoooOoO.OooO0O0() : this;
    }

    public final boolean OooO0OO(C21025OooO0o0 c21025OooO0o0) {
        ArrayList<Object> arrayList = this.f61023OooO00o;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof C21025OooO0o0) {
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(obj, c21025OooO0o0)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof C21068OoooOoO) && !((C21068OoooOoO) obj).OooO0OO(c21025OooO0o0)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f61023OooO00o = null;
                return false;
            }
        }
        return true;
    }
}
