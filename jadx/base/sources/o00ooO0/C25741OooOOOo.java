package o00ooO0;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: o00ooO0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25741OooOOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final SparseIntArray f87864OooO00o = new SparseIntArray(0);

    public static final Oooo000 OooO00o() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new Oooo000(0, iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2, f87864OooO00o, -1);
    }
}
