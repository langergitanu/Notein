package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22360OooO0oo implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67640OooO00o;

    public /* synthetic */ C22360OooO0oo(int i) {
        this.f67640OooO00o = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67640OooO00o) {
            case 0:
                return MaterialDynamicColors.lambda$secondary$68((DynamicScheme) obj);
            default:
                return new ArrayList();
        }
    }
}
