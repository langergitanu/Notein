package com.google.android.material.color.utilities;

import com.orion.notein.domain.models.page.Page;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22389OoooOO0 implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67659OooO00o;

    public /* synthetic */ C22389OoooOO0(int i) {
        this.f67659OooO00o = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67659OooO00o) {
            case 0:
                return MaterialDynamicColors.lambda$surfaceDim$18((DynamicScheme) obj);
            default:
                return ((Page) obj).getId();
        }
    }
}
