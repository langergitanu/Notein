package o0ooooo0;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import o0ooooo.InterfaceC31876OooO0OO;

/* JADX INFO: renamed from: o0ooooo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31880OooO0OO<T extends InterfaceC31876OooO0OO> implements InterfaceC31878OooO00o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f113579OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f113580OooO0O0;

    public AbstractC31880OooO0OO(int i, int i2) {
        this.f113579OooO00o = i;
        this.f113580OooO0O0 = i2;
    }

    @Override // o0ooooo0.InterfaceC31878OooO00o
    public final boolean OooO0O0(UsbDevice usbDevice) {
        return OooO0OO(usbDevice) != null;
    }

    public final UsbInterface OooO0OO(UsbDevice usbDevice) {
        for (int i = 0; i < usbDevice.getInterfaceCount(); i++) {
            UsbInterface usbInterface = usbDevice.getInterface(i);
            if (usbInterface.getInterfaceClass() == this.f113579OooO00o && usbInterface.getInterfaceSubclass() == this.f113580OooO0O0) {
                return usbInterface;
            }
        }
        return null;
    }
}
