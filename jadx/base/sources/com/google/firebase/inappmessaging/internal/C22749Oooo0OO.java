package com.google.firebase.inappmessaging.internal;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.ui.settings.debug.DebugFragment.OooOOO0;
import o0000oOO.AbstractC24338OooO0o0;
import oO00o00o.InterfaceC32331OooO0OO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22749Oooo0OO implements InterfaceC32331OooO0OO, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68528OooOo0o;

    public /* synthetic */ C22749Oooo0OO(Object obj) {
        this.f68528OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ActivityResult result = (ActivityResult) obj;
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        if (result.f62240OooOo0o != -1) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DebugFragment");
            c20358OooO00o.OooO0o0("User cancelled file browsing", new Object[0]);
            return;
        }
        Intent intent = result.f62239OooOo;
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("DebugFragment");
            c20358OooO00o2.OooO0OO("File uri not found", new Object[0]);
        } else {
            DebugFragment debugFragment = (DebugFragment) this.f68528OooOo0o;
            InterfaceC21987OooOoo viewLifecycleOwner = debugFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, debugFragment.new OooOOO0(data, null), 3);
        }
    }

    @Override // oO00o00o.InterfaceC32331OooO0OO
    public Object apply(Object obj) {
        return ((InAppMessageStreamManager) this.f68528OooOo0o).lambda$createFirebaseInAppMessageStream$11((CampaignProto.ThickContent) obj);
    }
}
