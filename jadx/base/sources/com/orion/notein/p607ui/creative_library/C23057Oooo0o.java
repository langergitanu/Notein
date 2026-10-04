package com.orion.notein.p607ui.creative_library;

import android.graphics.drawable.Drawable;
import com.orion.notein.p607ui.creative_library.ImagePreviewDialogFragment;
import kotlin.jvm.internal.OooOOO0;
import o00Ooo0o.EnumC25112OooO00o;
import o00OooO.C25140OooOOo;
import o00o00oO.InterfaceC25289OooO0o;
import o00o00oo.InterfaceC25293OooO;

/* JADX INFO: renamed from: com.orion.notein.ui.creative_library.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23057Oooo0o implements InterfaceC25289OooO0o<Drawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ImagePreviewDialogFragment.OooO00o.C19170OooO00o f71278OooO00o;

    public C23057Oooo0o(ImagePreviewDialogFragment.OooO00o.C19170OooO00o c19170OooO00o) {
        this.f71278OooO00o = c19170OooO00o;
    }

    @Override // o00o00oO.InterfaceC25289OooO0o
    public final boolean onLoadFailed(C25140OooOOo c25140OooOOo, Object obj, InterfaceC25293OooO<Drawable> target, boolean z) {
        OooOOO0.OooO0oO(target, "target");
        this.f71278OooO00o.f70973OooO0O0.setVisibility(8);
        return false;
    }

    @Override // o00o00oO.InterfaceC25289OooO0o
    public final boolean onResourceReady(Drawable drawable, Object model, InterfaceC25293OooO<Drawable> interfaceC25293OooO, EnumC25112OooO00o dataSource, boolean z) {
        OooOOO0.OooO0oO(model, "model");
        OooOOO0.OooO0oO(dataSource, "dataSource");
        this.f71278OooO00o.f70973OooO0O0.setVisibility(8);
        return false;
    }
}
