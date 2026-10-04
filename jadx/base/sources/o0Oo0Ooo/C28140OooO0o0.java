package o0Oo0Ooo;

import android.content.Context;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.firebase.firestore.local.C22646OooOoO;
import com.google.firebase.inappmessaging.internal.C22741OooOoo;
import com.orion.notein.global.R;
import o000o0O0.C24572OooOO0o;
import o0Oo00o.C28026OooO0OO;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0Ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28140OooO0o0 {
    public static void OooO00o(Fragment fragment, C24572OooOO0o c24572OooOO0o, String materialId, String materialTitle, int i, oO0O000o.OooO00o oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fragment, "fragment");
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(materialTitle, "materialTitle");
        Context contextRequireContext = fragment.requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        boolean zOooO00o = o0oo000O.OooOO0O.OooO00o(contextRequireContext);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MaterialPurchaseNav");
        c20358OooO00o.OooO00o("navigate: materialId=%s, priceCents=%d, isLargeScreen=%s", materialId, Integer.valueOf(i), Boolean.valueOf(zOooO00o));
        FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        kotlin.jvm.internal.OooOOO0.OooO0o(parentFragmentManager, "getParentFragmentManager(...)");
        InterfaceC21987OooOoo viewLifecycleOwner = fragment.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        parentFragmentManager.Oooooo0("material_purchase_result", viewLifecycleOwner, new C22646OooOoO(oooO00o, 2));
        parentFragmentManager.Oooooo0("material_purchase_result", viewLifecycleOwner, new C22741OooOoo(oooO00o, 1));
        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("materialId", materialId), new C32443OooOOO("materialTitle", materialTitle), new C32443OooOOO("priceCents", Integer.valueOf(i)));
        if (zOooO00o) {
            C28026OooO0OO.OooO00o(c24572OooOO0o, R.id.materialPurchaseDialog, bundleBundleOf);
        } else {
            C28026OooO0OO.OooO00o(c24572OooOO0o, R.id.materialPurchaseBottomSheet, bundleBundleOf);
        }
    }
}
