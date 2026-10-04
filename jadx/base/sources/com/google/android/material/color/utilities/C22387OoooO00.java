package com.google.android.material.color.utilities;

import com.orion.notein.domain.mapper.NoteContentMapper;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22387OoooO00 implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67657OooO00o;

    public /* synthetic */ C22387OoooO00(int i) {
        this.f67657OooO00o = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67657OooO00o) {
            case 0:
                return ((DynamicScheme) obj).neutralVariantPalette;
            default:
                return NoteContentMapper.lambda$fillModel$0((String) obj);
        }
    }
}
