package com.google.firebase.inappmessaging.internal;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import o0OoOO00.C29009OooOo0O;
import oO00o00o.InterfaceC32331OooO0OO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22743OooOooO implements InterfaceC32331OooO0OO, InterfaceC21912Oooo0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68519OooOo0o;

    public /* synthetic */ C22743OooOooO(Object obj) {
        this.f68519OooOo0o = obj;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        String string = bundle.getString("password");
        if (string == null) {
            string = "";
        }
        AddPageFragment addPageFragment = (AddPageFragment) this.f68519OooOo0o;
        Uri uri = addPageFragment.f73806Oooo00o;
        if (uri != null) {
            InterfaceC21987OooOoo viewLifecycleOwner = addPageFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29009OooOo0O(addPageFragment, uri, string, null), 3);
        }
    }

    @Override // oO00o00o.InterfaceC32331OooO0OO
    public Object apply(Object obj) {
        return InAppMessageStreamManager.lambda$getContentIfNotRateLimited$24((CampaignProto.ThickContent) this.f68519OooOo0o, (Boolean) obj);
    }
}
