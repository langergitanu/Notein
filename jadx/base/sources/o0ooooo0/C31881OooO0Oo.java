package o0ooooo0;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbInterface;
import java.io.IOException;
import o0ooooo.InterfaceC31876OooO0OO;

/* JADX INFO: renamed from: o0ooooo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31881OooO0Oo extends AbstractC31880OooO0OO<C31882OooO0o> {
    @Override // o0ooooo0.InterfaceC31878OooO00o
    public final InterfaceC31876OooO0OO OooO00o(UsbDevice usbDevice, UsbDeviceConnection usbDeviceConnection) throws IOException {
        UsbInterface usbInterfaceOooO0OO = OooO0OO(usbDevice);
        if (usbInterfaceOooO0OO == null) {
            throw new IllegalStateException("The connection type is not available via this transport");
        }
        if (usbDeviceConnection.claimInterface(usbInterfaceOooO0OO, true)) {
            return new C31882OooO0o(usbDeviceConnection, usbInterfaceOooO0OO);
        }
        throw new IOException("Unable to claim interface");
    }
}
