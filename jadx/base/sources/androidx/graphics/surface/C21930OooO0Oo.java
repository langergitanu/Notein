package androidx.graphics.surface;

import androidx.graphics.surface.SurfaceControlCompat;
import androidx.hardware.SyncFenceV19;
import java.util.ArrayList;
import kotlin.jvm.internal.OooOOOO;

/* JADX INFO: renamed from: androidx.graphics.surface.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21930OooO0Oo implements SurfaceControlCompat.TransactionCompletedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f65128OooO00o;

    public C21930OooO0Oo(ArrayList arrayList) {
        this.f65128OooO00o = arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // androidx.graphics.surface.SurfaceControlCompat.TransactionCompletedListener
    public final void onTransactionCompleted(long j) {
        ?? r3;
        for (OooO0OO oooO0OO : this.f65128OooO00o) {
            OooO0O0 oooO0O0 = oooO0OO.f65126OooO00o;
            OooOOOO oooOOOO = oooO0OO.f65127OooO0O0;
            synchronized (oooO0O0) {
                r3 = oooO0O0.f65118OooO0O0;
                oooO0O0.f65118OooO0O0 = oooOOOO;
            }
            if (r3 != 0) {
                r3.invoke(new o000OO0O.OooO0OO(new SyncFenceV19(JniBindings.f65114OooO00o.nGetPreviousReleaseFenceFd(oooO0O0.f65117OooO00o.f65133OooO00o, j))));
            }
        }
        this.f65128OooO00o.clear();
    }
}
