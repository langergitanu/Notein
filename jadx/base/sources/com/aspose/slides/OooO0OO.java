package com.aspose.slides;

import com.alipay.share.sdk.openapi.APApiImlV1;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.ArrayList;
import java.util.List;
import o0O0oOO0.C26113OooO00o;
import o0O0oOO0.C26114OooO0O0;
import oO00oO00.InterfaceC32403OooO0OO;
import oO0oO00.C33938OooO0o0;
import oOo00O0O.C34467OooOo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements InterfaceC32403OooO0OO {
    public static String OooO00o(int i, int i2, String str, String str2) {
        return C14113y2.m67443x1(str2, i2, str.length() - i);
    }

    @Override // oO00oO00.InterfaceC32403OooO0OO
    public Object apply(Object obj) {
        String jsonStr = (String) obj;
        if (APApiImlV1.checkSumConsistent(jsonStr)) {
            return new ArrayList();
        }
        C26113OooO00o.OooO0O0 oooO0O0 = C26113OooO00o.Companion;
        oooO0O0.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(jsonStr, "jsonStr");
        return (List) C34467OooOo0.OooO00o(new C26114OooO0O0(0)).OooO0O0(jsonStr, new C33938OooO0o0(oooO0O0.serializer()));
    }
}
