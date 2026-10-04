package o00o00oo;

import Oooo0.C20855OooooOO;
import android.graphics.drawable.Drawable;
import o00o00oO.InterfaceC25288OooO0Oo;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o00oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25296OooO0OO<T> implements InterfaceC25293OooO<T> {
    private final int height;
    private InterfaceC25288OooO0Oo request;
    private final int width;

    public AbstractC25296OooO0OO() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final InterfaceC25288OooO0Oo getRequest() {
        return this.request;
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void getSize(InterfaceC25301OooO0oo interfaceC25301OooO0oo) {
        interfaceC25301OooO0oo.OooO0O0(this.width, this.height);
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public void onDestroy() {
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public void onStart() {
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public void onStop() {
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void removeCallback(InterfaceC25301OooO0oo interfaceC25301OooO0oo) {
    }

    @Override // o00o00oo.InterfaceC25293OooO
    public final void setRequest(InterfaceC25288OooO0Oo interfaceC25288OooO0Oo) {
        this.request = interfaceC25288OooO0Oo;
    }

    public AbstractC25296OooO0OO(int i, int i2) {
        if (!C25316OooOO0o.OooO(i, i2)) {
            throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i2, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.width = i;
        this.height = i2;
    }
}
