package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.google.android.gms.internal.mlkit_translate.zzbo;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appcheck.internal.AppCheckTokenResponse;
import com.google.firebase.appcheck.playintegrity.internal.PlayIntegrityAppCheckProvider;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.inappmessaging.internal.Logging;
import oO00o00o.InterfaceC32329OooO00o;

/* JADX INFO: renamed from: com.aspose.slides.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22222Oooo0OO implements SuccessContinuation, InterfaceC32329OooO00o {
    public static C12003du OooO00o(C12025x6 c12025x6, C11896dy c11896dy, C12025x6 c12025x62, C12003du c12003du) {
        c11896dy.m55547k4(c12025x62, c12025x6.Clone());
        return c12003du.Clone();
    }

    public static void OooO0O0(int i, FieldDescriptor.Builder builder) {
        zzbo zzboVar = new zzbo();
        zzboVar.zza(i);
        builder.withProperty(zzboVar.zzb()).build();
    }

    @Override // oO00o00o.InterfaceC32329OooO00o
    public void run() {
        Logging.logd("Rate limiter client write success");
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return PlayIntegrityAppCheckProvider.lambda$getToken$2((AppCheckTokenResponse) obj);
    }
}
