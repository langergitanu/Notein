package o0Oo0O;

import com.google.android.gms.tasks.OnFailureListener;
import o000oo0.C24684Oooo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28043OooO0Oo implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(exception, "exception");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "IntegrityViewModel", "Failed to prepare integrity token: ", exception), new Object[0]);
    }
}
