package com.google.android.material.color.utilities;

import java.util.function.Function;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class Oooo0 implements Function {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f67650OooO00o;

    public /* synthetic */ Oooo0(int i) {
        this.f67650OooO00o = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f67650OooO00o) {
            case 0:
                return ((DynamicScheme) obj).errorPalette;
            default:
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                return interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId(), interfaceC31284OooO0O0.getLayerId(), System.currentTimeMillis());
        }
    }
}
