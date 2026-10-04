package com.google.android.material.color.utilities;

import com.google.common.collect.ImmutableTable;
import java.util.function.Function;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o00Oo0 implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67688OooO00o;

    public /* synthetic */ o00Oo0(int i) {
        this.f67688OooO00o = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67688OooO00o) {
            case 0:
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$128((DynamicScheme) obj);
            default:
                return ((ImmutableTable.Builder) obj).build();
        }
    }
}
