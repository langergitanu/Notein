package com.google.firebase.inappmessaging.internal;

import android.content.Context;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.internal.firebase.inappmessaging.p566v1.sdkserving.FetchEligibleCampaignsResponse;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.image.ImportImagesFragment;
import com.orion.notein.p607ui.login.entry.WelcomeFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00o00.C25206OooO0Oo;
import oO00o00o.InterfaceC32330OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33595OooOOo;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22739OooOoO0 implements InterfaceC32330OooO0O0, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68513OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68514OooOo0o;

    public /* synthetic */ C22739OooOoO0(Object obj, int i) {
        this.f68514OooOo0o = i;
        this.f68513OooOo = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        switch (this.f68514OooOo0o) {
            case 1:
                List uris = (List) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(uris, "uris");
                ArrayList arrayList = new ArrayList();
                Iterator it = uris.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ImportImagesFragment importImagesFragment = (ImportImagesFragment) this.f68513OooOo;
                    if (!zHasNext) {
                        if (!arrayList.isEmpty()) {
                            InterfaceC32507OooOO0o<? super List<? extends Uri>, C32460OooOooO> interfaceC32507OooOO0o = importImagesFragment.f71858OooOoo0;
                            if (interfaceC32507OooOO0o != null) {
                                interfaceC32507OooOO0o.invoke(arrayList);
                            }
                        } else {
                            Context context = importImagesFragment.getContext();
                            if (context != null) {
                                String string = importImagesFragment.getString(R.string.no_file_is_selected);
                                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                                C25206OooO0Oo.OooO0oO(context, string);
                            }
                        }
                        break;
                    } else {
                        Uri uri = (Uri) it.next();
                        String type = importImagesFragment.requireContext().getContentResolver().getType(uri);
                        if (type == null || !C33595OooOOo.OooOoO0(type, "image/", false)) {
                            uri = null;
                        }
                        if (uri != null) {
                            arrayList.add(uri);
                        }
                    }
                }
                break;
            default:
                ActivityResult result = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
                WelcomeFragment welcomeFragment = (WelcomeFragment) this.f68513OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = welcomeFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new WelcomeFragment.C23157OooO0oO(welcomeFragment, null), 3);
                break;
        }
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) {
        ((AnalyticsEventsManager) this.f68513OooOo).updateContextualTriggers((FetchEligibleCampaignsResponse) obj);
    }
}
