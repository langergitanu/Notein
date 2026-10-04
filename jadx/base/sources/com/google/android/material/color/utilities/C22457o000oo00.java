package com.google.android.material.color.utilities;

import com.orion.editor.PDFView;
import java.util.function.Function;
import o0O0oooo.C26366OooOO0O;
import o0O0oooo.C26395Oooo0o0;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.o000oo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22457o000oo00 implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67685OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f67686OooO0O0;

    public /* synthetic */ C22457o000oo00(Object obj, int i) {
        this.f67685OooO00o = i;
        this.f67686OooO0O0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67685OooO00o) {
            case 0:
                return ((MaterialDynamicColors) this.f67686OooO0O0).lambda$tertiaryContainer$87((DynamicScheme) obj);
            default:
                C26395Oooo0o0 c26395Oooo0o0 = ((PDFView) this.f67686OooO0O0).f69170OooOooO.f69109OooO0O0;
                c26395Oooo0o0.getClass();
                return c26395Oooo0o0.OooOOO(((Integer) obj).intValue(), new C26366OooOO0O(c26395Oooo0o0, 0));
        }
    }
}
