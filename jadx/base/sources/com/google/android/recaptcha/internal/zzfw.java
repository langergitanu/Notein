package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes7.dex */
public final class zzfw {
    private final WebView zza;
    private final InterfaceC33636Oooo00o zzb;

    public zzfw(WebView webView, InterfaceC33636Oooo00o interfaceC33636Oooo00o) {
        this.zza = webView;
        this.zzb = interfaceC33636Oooo00o;
    }

    public final void zzb(String str, String... strArr) {
        C33609OooO0oo.OooO0OO(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
