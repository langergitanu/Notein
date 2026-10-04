package o00ooO0;

import android.util.SparseIntArray;
import o00o0o0o.C25446OooO0Oo;
import o00ooO.C25732OooO0O0;

/* JADX INFO: renamed from: o00ooO0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25753OooOooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f87881OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo000 f87882OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25751OooOoo f87883OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo000 f87884OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25446OooO0Oo f87885OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C25751OooOoo f87886OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Oooo000 f87887OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Oooo000 f87888OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C25751OooOoo f87889OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f87890OooOO0;

    /* JADX INFO: renamed from: o00ooO0.OooOooO$OooO00o */
    public static final class OooO00o {
    }

    public C25753OooOooO(OooO00o oooO00o) {
        C25732OooO0O0.OooO00o();
        this.f87882OooO00o = C25741OooOOOo.OooO00o();
        this.f87883OooO0O0 = C25751OooOoo.OooO0O0();
        int i = C25743OooOOo0.f87865OooO00o;
        int i2 = i * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i3 = 131072; i3 <= 4194304; i3 *= 2) {
            sparseIntArray.put(i3, i);
        }
        this.f87884OooO0OO = new Oooo000(4194304, i2, sparseIntArray, C25743OooOOo0.f87865OooO00o);
        this.f87885OooO0Oo = C25446OooO0Oo.OooO0o0();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i4 = iMin < 16777216 ? 3145728 : iMin < 33554432 ? 6291456 : 12582912;
        int iMin2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.f87887OooO0o0 = new Oooo000(i4, iMin2 < 16777216 ? iMin2 / 2 : (iMin2 / 4) * 3, sparseIntArray2, -1);
        this.f87886OooO0o = C25751OooOoo.OooO0O0();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.f87888OooO0oO = new Oooo000(81920, 1048576, sparseIntArray3, -1);
        this.f87889OooO0oo = C25751OooOoo.OooO0O0();
        this.f87881OooO = "legacy";
        this.f87890OooOO0 = 4194304;
        C25732OooO0O0.OooO00o();
    }
}
