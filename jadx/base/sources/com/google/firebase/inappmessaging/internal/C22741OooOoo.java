package com.google.firebase.inappmessaging.internal;

import Oooo0oO.C21030OooOO0o;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.internal.firebase.inappmessaging.p566v1.CampaignProto;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import java.util.ArrayList;
import o0000oOO.AbstractC24338OooO0o0;
import o0Oo00o.C28026OooO0OO;
import o0OoOO00.C29009OooOo0O;
import o0o0OoOO.C30708OooOoo;
import o0oOoo0.C31113OooO0O0;
import oO00o00o.InterfaceC32330OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22741OooOoo implements InterfaceC32330OooO0O0, InterfaceC21912Oooo0o, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68516OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68517OooOo0o;

    public /* synthetic */ C22741OooOoo(Object obj, int i) {
        this.f68517OooOo0o = i;
        this.f68516OooOo = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
        DebugFragment debugFragment = (DebugFragment) this.f68516OooOo;
        C31113OooO0O0 c31113OooO0O0 = debugFragment.f79025OooOooo;
        if (c31113OooO0O0 != null) {
            c31113OooO0O0.dismiss();
        }
        if (zBooleanValue) {
            androidx.appcompat.app.OooOO0 oooOO02 = debugFragment.f79027Oooo000;
            if (oooOO02 != null) {
                oooOO02.run();
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
        } else {
            String string = debugFragment.getString(R.string.debug_need_storage_permission);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            String string2 = debugFragment.getString(R.string.debug_storage_permission_desc);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(debugFragment), new C30708OooOoo(string, string2));
            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
        }
        debugFragment.f79027Oooo000 = null;
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle result, String str) {
        Uri uri;
        switch (this.f68517OooOo0o) {
            case 1:
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                if (result.getBoolean(FirebaseAnalytics.Param.SUCCESS, false)) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("MaterialPurchaseNav");
                    c20358OooO00o.OooO00o("Purchase success (dialog)", new Object[0]);
                    ((oO0O000o.OooO00o) this.f68516OooOo).invoke();
                }
                break;
            default:
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "bundle");
                ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? result.getParcelableArrayList("pdf_uri_list", Uri.class) : result.getParcelableArrayList("pdf_uri_list");
                if (parcelableArrayList != null && (uri = (Uri) oOo000Oo.OooOo.Oooo(parcelableArrayList)) != null) {
                    AddPageFragment addPageFragment = (AddPageFragment) this.f68516OooOo;
                    InterfaceC21987OooOoo viewLifecycleOwner = addPageFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C29009OooOo0O(addPageFragment, uri, null, null), 3);
                    break;
                }
                break;
        }
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) {
        InAppMessageStreamManager.logImpressionStatus((CampaignProto.ThickContent) this.f68516OooOo, (Boolean) obj);
    }
}
