package com.yubico.yubikit.android.transport.usb;

import OooOoOO.C20519OooO0Oo;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Build;
import com.yubico.yubikit.android.transport.usb.OooO;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static OooO0OO f80251OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f80252OooO0oO = C34354OooO0Oo.OooO0O0(OooO0OO.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f80253OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f80254OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashSet f80255OooO0OO = new HashSet();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakHashMap<UsbDevice, Set<InterfaceC19588OooO0OO>> f80256OooO0Oo = new WeakHashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final HashSet f80257OooO0o0 = new HashSet();

    public class OooO00o extends BroadcastReceiver {
        public OooO00o() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
            if (usbDevice == null || usbDevice.getVendorId() != 4176) {
                return;
            }
            if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                OooO0OO.this.OooO0O0(usbDevice);
                return;
            }
            if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action)) {
                OooO0OO oooO0OO = OooO0OO.this;
                C20519OooO0Oo.OooO0Oo(4, OooO0OO.f80252OooO0oO, "UsbDevice detached: {}", usbDevice.getDeviceName());
                if (oooO0OO.f80256OooO0Oo.remove(usbDevice) != null) {
                    Iterator it = oooO0OO.f80255OooO0OO.iterator();
                    while (it.hasNext()) {
                        ((OooO0Oo) it.next()).OooO0O0(usbDevice);
                    }
                }
                synchronized (oooO0OO.f80257OooO0o0) {
                    try {
                        if (oooO0OO.f80257OooO0o0.remove(usbDevice) && oooO0OO.f80257OooO0o0.isEmpty()) {
                            context.unregisterReceiver(oooO0OO.f80254OooO0O0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public class OooO0O0 extends BroadcastReceiver {
        public OooO0O0() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.yubico.yubikey.USB_PERMISSION".equals(intent.getAction())) {
                UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                UsbManager usbManager = (UsbManager) context.getSystemService("usb");
                if (usbDevice != null) {
                    OooO0OO oooO0OO = OooO0OO.this;
                    boolean zHasPermission = usbManager.hasPermission(usbDevice);
                    C20519OooO0Oo.OooO0o0(4, OooO0OO.f80252OooO0oO, "Permission result for {}, permitted: {}", usbDevice.getDeviceName(), Boolean.valueOf(zHasPermission));
                    Set<InterfaceC19588OooO0OO> set = oooO0OO.f80256OooO0Oo.get(usbDevice);
                    if (set != null) {
                        synchronized (set) {
                            try {
                                Iterator<InterfaceC19588OooO0OO> it = set.iterator();
                                while (it.hasNext()) {
                                    it.next().OooO00o(zHasPermission);
                                }
                                set.clear();
                            } finally {
                            }
                        }
                    }
                    synchronized (oooO0OO.f80257OooO0o0) {
                        try {
                            if (oooO0OO.f80257OooO0o0.remove(usbDevice) && oooO0OO.f80257OooO0o0.isEmpty()) {
                                context.unregisterReceiver(oooO0OO.f80254OooO0O0);
                            }
                        } finally {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.yubico.yubikit.android.transport.usb.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public interface InterfaceC19588OooO0OO {
        void OooO00o(boolean z);
    }

    public interface OooO0Oo {
        void OooO00o(UsbDevice usbDevice);

        void OooO0O0(UsbDevice usbDevice);
    }

    public static synchronized OooO0OO OooO00o() {
        try {
            if (f80251OooO0o == null) {
                f80251OooO0o = new OooO0OO();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f80251OooO0o;
    }

    public static void OooO0OO(Context context, OooO.OooO00o oooO00o) {
        OooO0OO oooO0OOOooO00o = OooO00o();
        synchronized (oooO0OOOooO00o) {
            try {
                if (oooO0OOOooO00o.f80255OooO0OO.isEmpty()) {
                    Collection<UsbDevice> collectionValues = ((UsbManager) context.getSystemService("usb")).getDeviceList().values();
                    IntentFilter intentFilter = new IntentFilter("android.hardware.usb.action.USB_DEVICE_ATTACHED");
                    intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
                    context.registerReceiver(oooO0OOOooO00o.f80253OooO00o, intentFilter);
                    for (UsbDevice usbDevice : collectionValues) {
                        if (usbDevice.getVendorId() == 4176) {
                            oooO0OOOooO00o.OooO0O0(usbDevice);
                        }
                    }
                }
                oooO0OOOooO00o.f80255OooO0OO.add(oooO00o);
                Iterator<UsbDevice> it = oooO0OOOooO00o.f80256OooO0Oo.keySet().iterator();
                while (it.hasNext()) {
                    oooO00o.OooO00o(it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void OooO0Oo(Context context, UsbDevice usbDevice, C23920OooO0oo c23920OooO0oo) {
        OooO0OO oooO0OOOooO00o = OooO00o();
        synchronized (oooO0OOOooO00o) {
            Set<InterfaceC19588OooO0OO> set = oooO0OOOooO00o.f80256OooO0Oo.get(usbDevice);
            Objects.requireNonNull(set);
            Set<InterfaceC19588OooO0OO> set2 = set;
            synchronized (set2) {
                set2.add(c23920OooO0oo);
            }
            synchronized (oooO0OOOooO00o.f80257OooO0o0) {
                try {
                    if (!oooO0OOOooO00o.f80257OooO0o0.contains(usbDevice)) {
                        if (oooO0OOOooO00o.f80257OooO0o0.isEmpty()) {
                            OooO0O0 oooO0O0 = oooO0OOOooO00o.f80254OooO0O0;
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(oooO0O0, new IntentFilter("com.yubico.yubikey.USB_PERMISSION"), 4);
                            } else {
                                context.registerReceiver(oooO0O0, new IntentFilter("com.yubico.yubikey.USB_PERMISSION"));
                            }
                        }
                        C20519OooO0Oo.OooO0Oo(4, f80252OooO0oO, "Requesting permission for UsbDevice: {}", usbDevice.getDeviceName());
                        int i = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
                        Intent intent = new Intent("com.yubico.yubikey.USB_PERMISSION");
                        intent.setPackage(context.getPackageName());
                        ((UsbManager) context.getSystemService("usb")).requestPermission(usbDevice, PendingIntent.getBroadcast(context, 0, intent, i));
                        oooO0OOOooO00o.f80257OooO0o0.add(usbDevice);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void OooO0o0(Context context, OooO0Oo oooO0Oo) {
        OooO0OO oooO0OOOooO00o = OooO00o();
        synchronized (oooO0OOOooO00o) {
            try {
                oooO0OOOooO00o.f80255OooO0OO.remove(oooO0Oo);
                Iterator<UsbDevice> it = oooO0OOOooO00o.f80256OooO0Oo.keySet().iterator();
                while (it.hasNext()) {
                    oooO0Oo.OooO0O0(it.next());
                }
                if (oooO0OOOooO00o.f80255OooO0OO.isEmpty()) {
                    context.unregisterReceiver(oooO0OOOooO00o.f80253OooO00o);
                    oooO0OOOooO00o.f80256OooO0Oo.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0(UsbDevice usbDevice) {
        C20519OooO0Oo.OooO0Oo(4, f80252OooO0oO, "UsbDevice attached: {}", usbDevice.getDeviceName());
        this.f80256OooO0Oo.put(usbDevice, new HashSet());
        Iterator it = this.f80255OooO0OO.iterator();
        while (it.hasNext()) {
            ((OooO0Oo) it.next()).OooO00o(usbDevice);
        }
    }
}
