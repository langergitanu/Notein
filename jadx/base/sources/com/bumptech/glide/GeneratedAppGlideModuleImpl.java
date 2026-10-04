package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.orion.notein.p607ui.widget.glide.AppGlide;
import java.util.Collections;
import java.util.Set;
import o00o00Oo.C25267OooOOO;

/* JADX INFO: loaded from: classes5.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AppGlide f67100OooO00o = new AppGlide();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.orion.notein.ui.widget.glide.AppGlide");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.webp.WebpGlideLibraryModule");
        }
    }

    @Override // o00o00o0.AbstractC25282OooO0OO
    public final void OooO00o(Context context, OooO0OO oooO0OO, OooO oooO) {
        new com.bumptech.glide.integration.webp.OooO0O0().OooO00o(context, oooO0OO, oooO);
        this.f67100OooO00o.OooO00o(context, oooO0OO, oooO);
    }

    @Override // o00o00o0.AbstractC25280OooO00o
    public final void OooO0O0() {
        this.f67100OooO00o.getClass();
    }

    @Override // o00o00o0.AbstractC25280OooO00o
    public final void OooO0OO() {
        this.f67100OooO00o.getClass();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set<Class<?>> OooO0Oo() {
        return Collections.EMPTY_SET;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final C25267OooOOO.OooO0O0 OooO0o0() {
        return new OooO00o();
    }
}
