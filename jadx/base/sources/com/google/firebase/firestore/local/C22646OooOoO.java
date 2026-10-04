package com.google.firebase.firestore.local;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.util.Supplier;
import com.microsoft.identity.common.internal.providers.oauth2.WebViewAuthorizationFragment;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import java.util.ArrayList;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22646OooOoO implements Supplier, OooO0o.OooO00o, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68233OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68234OooOo0o;

    public /* synthetic */ C22646OooOoO(Object obj, int i) {
        this.f68234OooOo0o = i;
        this.f68233OooOo = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ((WebViewAuthorizationFragment) this.f68233OooOo).lambda$new$0((Boolean) obj);
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle result, String str) {
        Uri uri;
        switch (this.f68234OooOo0o) {
            case 2:
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                if (result.getBoolean(FirebaseAnalytics.Param.SUCCESS, false)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MaterialPurchaseNav");
                    c20358OooO00o.OooO00o("Purchase success (bottom sheet)", new Object[0]);
                    ((oO0O000o.OooO00o) this.f68233OooOo).invoke();
                }
                break;
            default:
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "bundle");
                ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? result.getParcelableArrayList("pdf_uri_list", Uri.class) : result.getParcelableArrayList("pdf_uri_list");
                if (parcelableArrayList != null && (uri = (Uri) oOo000Oo.OooOo.Oooo(parcelableArrayList)) != null) {
                    ((AddPageFragment) this.f68233OooOo).f73807Oooo0O0.obtainMessage(1, uri).sendToTarget();
                    break;
                }
                break;
        }
    }

    @Override // com.google.firebase.firestore.util.Supplier
    public Object get() {
        return ((LocalStore) this.f68233OooOo).lambda$getFieldIndexes$14();
    }
}
