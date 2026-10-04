package o0oOoOO0;

import android.graphics.Bitmap;
import android.util.Log;
import com.orion.notein.p607ui.user.settings.profile.UserAvatarModifyFragment;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import kotlin.jvm.internal.OooOOO0;
import o00o0o.AbstractC25434OooO00o;
import o00o0oo.AbstractC25465OooO0Oo;
import o00o0oo.InterfaceC25467OooO0o0;
import o00oo.InterfaceC25636OooO0Oo;

/* JADX INFO: renamed from: o0oOoOO0.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31014OooO extends AbstractC25465OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserAvatarModifyFragment f110732OooO00o;

    public C31014OooO(UserAvatarModifyFragment userAvatarModifyFragment) {
        this.f110732OooO00o = userAvatarModifyFragment;
    }

    @Override // o00o0oo.AbstractC25465OooO0Oo
    public final void OooO0Oo(InterfaceC25467OooO0o0<AbstractC25434OooO00o<InterfaceC25636OooO0Oo>> dataSource) {
        OooOOO0.OooO0oO(dataSource, "dataSource");
        Log.e("ImageCropFragment", "onFailureImpl: ");
    }

    @Override // o00o0oo.AbstractC25465OooO0Oo
    public final void OooO0o0(InterfaceC25467OooO0o0 interfaceC25467OooO0o0) {
        if (interfaceC25467OooO0o0.OooO0OO()) {
            AbstractC25434OooO00o abstractC25434OooO00o = (AbstractC25434OooO00o) interfaceC25467OooO0o0.getResult();
            Bitmap bitmapO000Ooo = (abstractC25434OooO00o == null || !(abstractC25434OooO00o.Oooo000() instanceof o00oo.OooO0OO)) ? null : ((o00oo.OooO0OO) abstractC25434OooO00o.Oooo000()).o000Ooo();
            if (bitmapO000Ooo != null) {
                try {
                    ImageCropView imageCropView = this.f110732OooO00o.f80015OooOooo;
                    if (imageCropView == null) {
                        OooOOO0.OooOOOO("cropImageView");
                        throw null;
                    }
                    imageCropView.setBitmap(bitmapO000Ooo);
                } finally {
                    AbstractC25434OooO00o.OooOooo(abstractC25434OooO00o);
                }
            }
        }
    }
}
