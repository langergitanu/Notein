package o0ooooo0;

import OooOoOO.C20519OooO0Oo;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbInterface;
import o0ooooo.InterfaceC31876OooO0OO;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: o0ooooo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31885OooO0oo implements InterfaceC31876OooO0OO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f113593OooOoO0 = C34354OooO0Oo.OooO0O0(AbstractC31885OooO0oo.class);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final UsbInterface f113594OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final UsbDeviceConnection f113595OooOo0o;

    public AbstractC31885OooO0oo(UsbDeviceConnection usbDeviceConnection, UsbInterface usbInterface) {
        this.f113595OooOo0o = usbDeviceConnection;
        this.f113594OooOo = usbInterface;
        C20519OooO0Oo.OooO0Oo(4, f113593OooOoO0, "USB connection opened: {}", this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        UsbInterface usbInterface = this.f113594OooOo;
        UsbDeviceConnection usbDeviceConnection = this.f113595OooOo0o;
        usbDeviceConnection.releaseInterface(usbInterface);
        usbDeviceConnection.close();
        C20519OooO0Oo.OooO0Oo(4, f113593OooOoO0, "USB connection closed: {}", this);
    }
}
