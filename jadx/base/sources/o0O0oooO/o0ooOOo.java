package o0O0oooO;

import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;
import o00o0.InterfaceC25205OooO0O0;
import o00o00oo.AbstractC25296OooO0OO;

/* JADX INFO: loaded from: classes9.dex */
public final class o0ooOOo extends AbstractC25296OooO0OO<Bitmap> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ NotificationManager f90452OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ NotificationCompat.Builder f90453OooOo0o;

    public o0ooOOo(NotificationCompat.Builder builder, NotificationManager notificationManager) {
        this.f90453OooOo0o = builder;
        this.f90452OooOo = notificationManager;
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void onLoadCleared(Drawable drawable) {
    }

    @Override // o00o00oo.AbstractC25296OooO0OO, o00o00oo.InterfaceC25293OooO
    public final void onLoadFailed(Drawable drawable) {
        this.f90452OooOo.notify(0, this.f90453OooOo0o.build());
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void onResourceReady(Object obj, InterfaceC25205OooO0O0 interfaceC25205OooO0O0) {
        NotificationCompat.Builder builder = this.f90453OooOo0o;
        builder.setLargeIcon((Bitmap) obj);
        this.f90452OooOo.notify(0, builder.build());
    }
}
