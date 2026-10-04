package o0Oo0OOO;

import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.OooOOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0OOO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C28075OooO0OO implements OnFailureListener {
    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception it) {
        OooOOO0.OooO0oO(it, "it");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MlKitTranslateHelper");
        c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("下载模型失败. ", it.getMessage()), new Object[0]);
    }
}
