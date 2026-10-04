package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12025x6;
import com.google.android.datatransport.Transformer;
import com.google.firebase.inappmessaging.internal.injection.modules.TransportClientModule;

/* JADX INFO: renamed from: com.aspose.slides.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22231OoooOO0 implements Transformer {
    public static void OooO00o(C12025x6 c12025x6, C12025x6 c12025x62, float f) {
        c12025x62.m56898x1(c12025x6.m56895kk() + f);
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return TransportClientModule.lambda$providesMetricsLoggerClient$0((byte[]) obj);
    }
}
