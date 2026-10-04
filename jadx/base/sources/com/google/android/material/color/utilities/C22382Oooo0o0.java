package com.google.android.material.color.utilities;

import java.util.function.Function;
import o0o0OoOo.C30743OooOo0O;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22382Oooo0o0 implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f67656OooO0O0;

    public /* synthetic */ C22382Oooo0o0(Object obj, int i) {
        this.f67655OooO00o = i;
        this.f67656OooO0O0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67655OooO00o) {
            case 0:
                return ((MaterialDynamicColors) this.f67656OooO0O0).lambda$error$93((DynamicScheme) obj);
            default:
                return (Float) ((C30743OooOo0O) this.f67656OooO0O0).invoke(obj);
        }
    }
}
