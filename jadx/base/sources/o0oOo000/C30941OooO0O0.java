package o0oOo000;

import android.graphics.drawable.PictureDrawable;
import android.widget.ImageView;
import kotlin.jvm.internal.OooOOO0;
import o00Ooo0o.EnumC25112OooO00o;
import o00OooO.C25140OooOOo;
import o00o00oO.InterfaceC25289OooO0o;
import o00o00oo.AbstractC25299OooO0o0;
import o00o00oo.InterfaceC25293OooO;

/* JADX INFO: renamed from: o0oOo000.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C30941OooO0O0 implements InterfaceC25289OooO0o<PictureDrawable> {
    @Override // o00o00oO.InterfaceC25289OooO0o
    public final boolean onLoadFailed(C25140OooOOo c25140OooOOo, Object obj, InterfaceC25293OooO<PictureDrawable> target, boolean z) {
        OooOOO0.OooO0oO(target, "target");
        ImageView imageView = ((AbstractC25299OooO0o0) target).f86112OooOo0o;
        OooOOO0.OooO0o(imageView, "getView(...)");
        imageView.setLayerType(0, null);
        return false;
    }

    @Override // o00o00oO.InterfaceC25289OooO0o
    public final boolean onResourceReady(PictureDrawable pictureDrawable, Object model, InterfaceC25293OooO<PictureDrawable> interfaceC25293OooO, EnumC25112OooO00o dataSource, boolean z) {
        OooOOO0.OooO0oO(model, "model");
        OooOOO0.OooO0oO(dataSource, "dataSource");
        OooOOO0.OooO0o0(interfaceC25293OooO, "null cannot be cast to non-null type com.bumptech.glide.request.target.ImageViewTarget<*>");
        ImageView imageView = ((AbstractC25299OooO0o0) interfaceC25293OooO).f86112OooOo0o;
        OooOOO0.OooO0o(imageView, "getView(...)");
        imageView.setLayerType(1, null);
        return false;
    }
}
