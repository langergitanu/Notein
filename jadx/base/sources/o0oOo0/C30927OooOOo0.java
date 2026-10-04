package o0oOo0;

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import com.orion.notein.p607ui.user.VipRestrictedFeatureDialogFragment;
import o00Ooo0o.EnumC25112OooO00o;
import o00OooO.C25140OooOOo;
import o00o00oO.InterfaceC25289OooO0o;
import o00o00oo.InterfaceC25293OooO;

/* JADX INFO: renamed from: o0oOo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30927OooOOo0 implements InterfaceC25289OooO0o<Drawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ VipRestrictedFeatureDialogFragment f110502OooO00o;

    public C30927OooOOo0(VipRestrictedFeatureDialogFragment vipRestrictedFeatureDialogFragment) {
        this.f110502OooO00o = vipRestrictedFeatureDialogFragment;
    }

    @Override // o00o00oO.InterfaceC25289OooO0o
    public final boolean onLoadFailed(C25140OooOOo c25140OooOOo, Object obj, InterfaceC25293OooO<Drawable> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        return false;
    }

    @Override // o00o00oO.InterfaceC25289OooO0o
    public final boolean onResourceReady(Drawable drawable, Object model, InterfaceC25293OooO<Drawable> interfaceC25293OooO, EnumC25112OooO00o dataSource, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(model, "model");
        kotlin.jvm.internal.OooOOO0.OooO0oO(dataSource, "dataSource");
        ProgressBar progressBar = this.f110502OooO00o.f79670OooOooO;
        if (progressBar != null) {
            progressBar.setVisibility(8);
            return false;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO(NotificationCompat.CATEGORY_PROGRESS);
        throw null;
    }
}
