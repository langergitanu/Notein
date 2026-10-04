package com.google.firebase.inappmessaging.internal;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import o0OoOO00.C29010OooOo0o;
import oO00o00o.InterfaceC32332OooO0Oo;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class Oooo000 implements InterfaceC32332OooO0Oo, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68525OooOo0o;

    public /* synthetic */ Oooo000(Object obj) {
        this.f68525OooOo0o = obj;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        int i = bundle.getInt("page_num");
        Uri uri = (Uri) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("pdf_uri", Uri.class) : bundle.getParcelable("pdf_uri"));
        if (uri == null) {
            return;
        }
        String string = bundle.getString("pdf_password");
        AddPageFragment addPageFragment = (AddPageFragment) this.f68525OooOo0o;
        InterfaceC21987OooOoo viewLifecycleOwner = addPageFragment.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29010OooOo0o(addPageFragment, uri, string, i, null), 3);
    }

    @Override // oO00o00o.InterfaceC32332OooO0Oo
    public boolean test(Object obj) {
        return ((InAppMessageStreamManager) this.f68525OooOo0o).lambda$getTriggeredInAppMessageMaybe$25((CampaignProto.ThickContent) obj);
    }
}
