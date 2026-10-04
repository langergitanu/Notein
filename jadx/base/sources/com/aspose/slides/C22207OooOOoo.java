package com.aspose.slides;

import android.content.Context;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.HashMap;

/* JADX INFO: renamed from: com.aspose.slides.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22207OooOOoo implements LibraryVersionComponent.VersionExtractor {
    public static Integer OooO00o(int i, HashMap map, Integer num, int i2) {
        map.put(num, Integer.valueOf(i));
        return Integer.valueOf(i2);
    }

    public static void OooO0O0(C12025x6 c12025x6, float f, float f2, float f3) {
        c12025x6.m56898x1(f3 - (f / f2));
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        return FirebaseCommonRegistrar.lambda$getComponents$3((Context) obj);
    }
}
