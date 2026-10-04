package com.google.android.material.color.utilities;

import com.orion.notein.domain.models.page.PageLayer;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22388OoooO0O implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67658OooO00o;

    public /* synthetic */ C22388OoooO0O(int i) {
        this.f67658OooO00o = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67658OooO00o) {
            case 0:
                return ((DynamicScheme) obj).neutralPalette;
            default:
                return ((PageLayer) obj).getId();
        }
    }
}
