package com.google.android.material.color.utilities;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22366OooOo0 implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67642OooO00o;

    public /* synthetic */ C22366OooOo0(int i) {
        this.f67642OooO00o = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67642OooO00o) {
            case 0:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return ((File) obj).getPath();
        }
    }
}
