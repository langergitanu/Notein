package com.google.android.material.color.utilities;

import java.util.function.Function;
import o0o0OoOo.C30735OooOOOO;

/* JADX INFO: renamed from: com.google.android.material.color.utilities.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C22378Oooo00o implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67653OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f67654OooO0O0;

    public /* synthetic */ C22378Oooo00o(Object obj, int i) {
        this.f67653OooO00o = i;
        this.f67654OooO0O0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67653OooO00o) {
            case 0:
                return ((MaterialDynamicColors) this.f67654OooO0O0).lambda$onPrimaryFixed$112((DynamicScheme) obj);
            default:
                return (Float) ((C30735OooOOOO) this.f67654OooO0O0).invoke(obj);
        }
    }
}
