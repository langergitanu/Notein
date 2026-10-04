package com.google.firebase.inappmessaging.internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22734OooOOoo implements InterfaceC32330OooO0O0, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68501OooOo0o;

    public /* synthetic */ C22734OooOOoo(Object obj) {
        this.f68501OooOo0o = obj;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        String string;
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        String string2 = bundle.getString("id");
        if (string2 == null || (string = bundle.getString("password")) == null) {
            return;
        }
        TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) this.f68501OooOo0o;
        Uri uri = Uri.parse(string2);
        kotlin.jvm.internal.OooOOO0.OooO0o(uri, "parse(...)");
        textRecognizeFragment.f78200o00Ooo.OooO00o(uri, string);
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) throws Exception {
        ((ImpressionStorageClient) this.f68501OooOo0o).lambda$getAllImpressions$2((Throwable) obj);
    }
}
