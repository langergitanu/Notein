package o0Oo0oO0;

import com.google.android.gms.tasks.OnFailureListener;
import o000oo0.C24684Oooo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0oO0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28301OooOOo implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception e) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(e, "e");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "FeedbackWorker", "Error adding document，", e), new Object[0]);
    }
}
