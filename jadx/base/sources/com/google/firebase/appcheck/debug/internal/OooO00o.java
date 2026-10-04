package com.google.firebase.appcheck.debug.internal;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import kotlin.jvm.internal.OooOOO0;
import o0O0o00.o00000O;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO00o implements SuccessContinuation, o00000O, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f67880OooOo0o;

    public /* synthetic */ OooO00o(Object obj) {
        this.f67880OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        Uri data;
        ActivityResult result = (ActivityResult) obj;
        OooOOO0.OooO0oO(result, "result");
        Intent intent = result.f62239OooOo;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        FavoriteContainerFragment favoriteContainerFragment = (FavoriteContainerFragment) this.f67880OooOo0o;
        InterfaceC21987OooOoo viewLifecycleOwner = favoriteContainerFragment.getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.notelist.favorite.OooO00o(favoriteContainerFragment, data, null), 3);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ((DebugAppCheckProvider) this.f67880OooOo0o).lambda$getToken$2((String) obj);
    }
}
