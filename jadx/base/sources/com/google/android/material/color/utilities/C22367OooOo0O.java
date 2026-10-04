package com.google.android.material.color.utilities;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22367OooOo0O implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67644OooO00o;

    public /* synthetic */ C22367OooOo0O(int i) {
        this.f67644OooO00o = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67644OooO00o) {
            case 0:
                return MaterialDynamicColors.lambda$inverseOnSurface$40((DynamicScheme) obj);
            default:
                return ((File) obj).getName();
        }
    }
}
