package o0ooooo0;

import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbManager;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o0ooooo.InterfaceC31876OooO0OO;

/* JADX INFO: renamed from: o0ooooo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31879OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final HashMap f113576OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final UsbManager f113577OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final UsbDevice f113578OooO0O0;

    public C31879OooO0O0(UsbManager usbManager, UsbDevice usbDevice) {
        this.f113577OooO00o = usbManager;
        this.f113578OooO0O0 = usbDevice;
    }

    public static InterfaceC31878OooO00o OooO00o(Class cls) {
        HashMap map = f113576OooO0OO;
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    if (cls.isAssignableFrom((Class) entry.getKey())) {
                        return (InterfaceC31878OooO00o) entry.getValue();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <T extends InterfaceC31876OooO0OO> T OooO0O0(Class<T> cls) throws IOException {
        InterfaceC31878OooO00o interfaceC31878OooO00oOooO00o = OooO00o(cls);
        if (interfaceC31878OooO00oOooO00o == null) {
            throw new IllegalStateException("The connection type is not available via this transport");
        }
        UsbManager usbManager = this.f113577OooO00o;
        UsbDevice usbDevice = this.f113578OooO0O0;
        if (!usbManager.hasPermission(usbDevice)) {
            throw new com.yubico.yubikit.android.transport.usb.OooO00o("No permission granted to communicate with device " + usbDevice.getProductName());
        }
        UsbDeviceConnection usbDeviceConnectionOpenDevice = usbManager.openDevice(usbDevice);
        try {
            return (T) interfaceC31878OooO00oOooO00o.OooO00o(usbDevice, usbDeviceConnectionOpenDevice);
        } catch (IOException e) {
            usbDeviceConnectionOpenDevice.close();
            throw e;
        }
    }
}
