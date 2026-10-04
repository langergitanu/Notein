package com.google.android.material.color.utilities;

import com.orion.notein.domain.mapper.NoteMapper;
import java.util.function.Function;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22454o000oOoO implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67683OooO00o;

    public /* synthetic */ C22454o000oOoO(int i) {
        this.f67683OooO00o = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67683OooO00o) {
            case 0:
                return ((DynamicScheme) obj).errorPalette;
            default:
                return NoteMapper.lambda$fillModel$0((String) obj);
        }
    }
}
