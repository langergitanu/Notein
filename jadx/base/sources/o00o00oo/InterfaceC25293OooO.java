package o00o00oo;

import android.graphics.drawable.Drawable;
import o00o0.InterfaceC25205OooO0O0;
import o00o00Oo.InterfaceC25265OooOO0O;
import o00o00oO.InterfaceC25288OooO0Oo;

/* JADX INFO: renamed from: o00o00oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC25293OooO<R> extends InterfaceC25265OooOO0O {
    InterfaceC25288OooO0Oo getRequest();

    void getSize(InterfaceC25301OooO0oo interfaceC25301OooO0oo);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, InterfaceC25205OooO0O0<? super R> interfaceC25205OooO0O0);

    void removeCallback(InterfaceC25301OooO0oo interfaceC25301OooO0oo);

    void setRequest(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo);
}
