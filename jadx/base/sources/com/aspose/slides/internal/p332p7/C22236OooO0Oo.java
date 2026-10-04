package com.aspose.slides.internal.p332p7;

import android.os.Bundle;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.aspose.slides.Collections.Generic.List;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import kotlin.jvm.internal.OooOOO0;
import oO00o00o.InterfaceC32331OooO0OO;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C22236OooO0Oo implements InterfaceC32331OooO0OO, OnApplyWindowInsetsListener {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String, long] */
    public static void OooO00o(int i, String str, String str2) {
        Bundle.putLong(str2, str + i);
    }

    public static void OooO0O0(String str, kne kneVar, List list) {
        list.addItem(new C7394ca(str, kneVar));
    }

    @Override // oO00o00o.InterfaceC32331OooO0OO
    public Object apply(Object obj) {
        return InAppMessageStreamManager.lambda$createFirebaseInAppMessageStream$5((Throwable) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.core.graphics.Insets, int, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, org.json.JSONObject] */
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) throws JSONException {
        OooOOO0.OooO0oO(v, "v");
        OooOOO0.OooO0oO(insets, "insets");
        ?? insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        OooOOO0.OooO0o(insets2, "getInsets(...)");
        Insets insets3 = insets.getInsets(JSONObject.put((String) insets2, (int) insets2));
        OooOOO0.OooO0o(insets3, "getInsets(...)");
        ?? Max = Math.max(insets2.bottom, insets3.bottom);
        ?? paddingLeft = v.getPaddingLeft();
        v.getPaddingTop();
        v.key(Max);
        v.value(paddingLeft);
        return insets;
    }
}
