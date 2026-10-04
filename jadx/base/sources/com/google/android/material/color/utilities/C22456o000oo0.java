package com.google.android.material.color.utilities;

import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.o000oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22456o000oo0 implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f67684OooO00o;

    public /* synthetic */ C22456o000oo0(MaterialDynamicColors materialDynamicColors) {
        this.f67684OooO00o = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f67684OooO00o.highestSurface((DynamicScheme) obj);
    }
}
