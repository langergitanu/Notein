package o0ooooo0;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.util.Pair;
import java.io.IOException;
import o0ooooo.InterfaceC31876OooO0OO;

/* JADX INFO: renamed from: o0ooooo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31883OooO0o0 extends AbstractC31880OooO0OO<C31884OooO0oO> {
    @Override // o0ooooo0.InterfaceC31878OooO00o
    public final InterfaceC31876OooO0OO OooO00o(UsbDevice usbDevice, UsbDeviceConnection usbDeviceConnection) throws IOException {
        UsbInterface usbInterfaceOooO0OO = OooO0OO(usbDevice);
        if (usbInterfaceOooO0OO == null) {
            throw new IllegalStateException("The connection type is not available via this transport");
        }
        if (!usbDeviceConnection.claimInterface(usbInterfaceOooO0OO, true)) {
            throw new IOException("Unable to claim interface");
        }
        UsbEndpoint usbEndpoint = null;
        UsbEndpoint usbEndpoint2 = null;
        for (int i = 0; i < usbInterfaceOooO0OO.getEndpointCount(); i++) {
            UsbEndpoint endpoint = usbInterfaceOooO0OO.getEndpoint(i);
            if (endpoint.getType() == 2) {
                if (endpoint.getDirection() == 128) {
                    usbEndpoint = endpoint;
                } else {
                    usbEndpoint2 = endpoint;
                }
            }
        }
        if (usbEndpoint == null || usbEndpoint2 == null) {
            throw new IllegalStateException("Missing CCID bulk endpoints");
        }
        Pair pair = new Pair(usbEndpoint, usbEndpoint2);
        return new C31884OooO0oO(usbDeviceConnection, usbInterfaceOooO0OO, (UsbEndpoint) pair.first, (UsbEndpoint) pair.second);
    }
}
