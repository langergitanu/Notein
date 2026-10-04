package com.google.firebase.crashlytics;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.orion.notein.p607ui.noteeditor.addpage.AddPageFragment;
import com.orion.notein.ui.noteeditor.addpage.AddPageFragment.OooO0O0;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o0o0O00.C30191OooO0oO;
import o0o0O00.C30191OooO0oO.OooO00o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO00o implements BreadcrumbSource, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67974OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67975OooOo0o;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f67975OooOo0o = i;
        this.f67974OooOo = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        switch (this.f67975OooOo0o) {
            case 1:
                List uris = (List) obj;
                OooOOO0.OooO0oO(uris, "uris");
                boolean zIsEmpty = uris.isEmpty();
                AddPageFragment addPageFragment = (AddPageFragment) this.f67974OooOo;
                if (!zIsEmpty) {
                    InterfaceC21987OooOoo viewLifecycleOwner = addPageFragment.getViewLifecycleOwner();
                    OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, addPageFragment.new OooO0O0(uris, null), 3);
                } else {
                    Context context = addPageFragment.getContext();
                    if (context != null) {
                        String string = addPageFragment.getString(com.orion.notein.global.R.string.no_file_is_selected);
                        OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(context, string);
                    }
                }
                break;
            default:
                Boolean success = (Boolean) obj;
                OooOOO0.OooO0oO(success, "success");
                C30191OooO0oO c30191OooO0oO = (C30191OooO0oO) this.f67974OooOo;
                Uri uri = c30191OooO0oO.f107504OooO0o0;
                c30191OooO0oO.f107504OooO0o0 = null;
                if (uri != null && success.booleanValue()) {
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(c30191OooO0oO.OooOOO()), null, null, c30191OooO0oO.new OooO00o(uri, null), 3);
                    break;
                }
                break;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        ((AnalyticsDeferredProxy) this.f67974OooOo).lambda$getDeferredBreadcrumbSource$0(breadcrumbHandler);
    }
}
