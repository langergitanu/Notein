package com.orion.notein.p607ui.widget.glide;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.OooO;
import com.bumptech.glide.OooO0OO;
import com.google.firebase.storage.StorageReference;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00O0oo0.C24961OooO00o;
import o00o00o0.AbstractC25280OooO00o;
import o00o0OO0.C25345OooO0o;
import o00ooOoO.C25789OooO00o;
import o0oOo000.C30940OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/widget/glide/AppGlide;", "Lo00o00o0/OooO00o;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AppGlide extends AbstractC25280OooO00o {
    @Override // o00o00o0.AbstractC25282OooO0OO
    public final void OooO00o(Context context, OooO0OO glide, OooO oooO) {
        OooOOO0.OooO0oO(glide, "glide");
        oooO.OooO00o(StorageReference.class, InputStream.class, new C25789OooO00o.C19717OooO00o());
        oooO.OooOO0O(C25345OooO0o.class, PictureDrawable.class, new C24961OooO00o());
        oooO.OooO0Oo("legacy_append", InputStream.class, C25345OooO0o.class, new C30940OooO00o());
    }
}
