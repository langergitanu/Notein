package com.google.firebase.inappmessaging.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.core.os.BundleKt;
import androidx.fragment.app.InterfaceC21912Oooo0o;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.orion.notein.p607ui.backup.BackupFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment;
import com.orion.notein.ui.notelist.favorite.FavoriteListFragment.OooO0O0;
import o0oOoo00.C31114OooO;
import o0oOoo00.C31120OooO0o;
import oO00o00o.InterfaceC32330OooO0O0;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.google.firebase.inappmessaging.internal.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C22730OooOO0o implements InterfaceC32330OooO0O0, InterfaceC21912Oooo0o, OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68491OooOo0o;

    public /* synthetic */ C22730OooOO0o(Object obj) {
        this.f68491OooOo0o = obj;
    }

    @Override // OooO0o.OooO00o
    public void OooO0O0(Object obj) {
        ActivityResult result = (ActivityResult) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        if (result.f62240OooOo0o != -1) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("BackupFragment");
            c20358OooO00o.OooO0o0("User cancelled file browsing", new Object[0]);
            return;
        }
        Intent intent = result.f62239OooOo;
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("BackupFragment");
            c20358OooO00o2.OooO0OO("File uri not found", new Object[0]);
            return;
        }
        C31114OooO c31114OooOOooOoO = ((BackupFragment) this.f68491OooOo0o).OooOoO();
        o00000OO o00000oo2 = c31114OooOOooOoO.f111028OooO0oO;
        if (o00000oo2 == null || !o00000oo2.isActive()) {
            C33781o00o0O c33781o00o0O = c31114OooOOooOoO.f111024OooO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, 0);
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c31114OooOOooOoO);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            c31114OooOOooOoO.f111028OooO0oO = C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31120OooO0o(c31114OooOOooOoO, data, null), 2);
        }
    }

    @Override // androidx.fragment.app.InterfaceC21912Oooo0o
    public void OooO0OO(Bundle bundle, String str) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
        String string = bundle.getString("id");
        if (string == null) {
            string = "";
        }
        String string2 = bundle.getString("password");
        Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO("password", string2 != null ? string2 : ""));
        FavoriteListFragment favoriteListFragment = (FavoriteListFragment) this.f68491OooOo0o;
        InterfaceC21987OooOoo viewLifecycleOwner = favoriteListFragment.getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, favoriteListFragment.new OooO0O0(string, bundleBundleOf, null), 3);
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public void accept(Object obj) {
        ((TaskCompletionSource) this.f68491OooOo0o).setResult(obj);
    }
}
