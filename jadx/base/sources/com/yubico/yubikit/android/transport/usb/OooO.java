package com.yubico.yubikit.android.transport.usb;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import com.yubico.yubikit.android.transport.usb.OooO;
import com.yubico.yubikit.android.transport.usb.OooO0OO;
import java.util.HashMap;
import o0ooooo0.C31879OooO0O0;
import o0ooooo0.C31881OooO0Oo;
import o0ooooo0.C31882OooO0o;
import o0ooooo0.C31883OooO0o0;
import o0ooooo0.C31884OooO0oO;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f80242OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f80243OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final UsbManager f80244OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO00o f80245OooO0OO = null;

    public class OooO00o implements OooO0OO.OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO00000.OooO00o<? super C23919OooO0oO> f80246OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0O0 f80247OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashMap f80248OooO0OO = new HashMap();

        public OooO00o(OooO0O0 oooO0O0, oO00000.OooO00o oooO00o) {
            this.f80247OooO0O0 = oooO0O0;
            this.f80246OooO00o = oooO00o;
        }

        /* JADX WARN: Type inference failed for: r2v8, types: [com.yubico.yubikit.android.transport.usb.OooO0oo] */
        @Override // com.yubico.yubikit.android.transport.usb.OooO0OO.OooO0Oo
        public final void OooO00o(UsbDevice usbDevice) {
            OooO oooO = OooO.this;
            try {
                final C23919OooO0oO c23919OooO0oO = new C23919OooO0oO(oooO.f80244OooO0O0, usbDevice);
                this.f80248OooO0OO.put(usbDevice, c23919OooO0oO);
                if (!this.f80247OooO0O0.f80250OooO00o || c23919OooO0oO.f80268OooOoO0.hasPermission(c23919OooO0oO.f80267OooOoO)) {
                    this.f80246OooO00o.invoke(c23919OooO0oO);
                } else {
                    OooO.f80242OooO0Oo.OooOOo("request permission");
                    OooO0OO.OooO0Oo(oooO.f80243OooO00o, usbDevice, new OooO0OO.InterfaceC19588OooO0OO() { // from class: com.yubico.yubikit.android.transport.usb.OooO0oo
                        @Override // com.yubico.yubikit.android.transport.usb.OooO0OO.InterfaceC19588OooO0OO
                        public final void OooO00o(boolean z) {
                            OooO.OooO00o oooO00o = this.f80274OooO00o;
                            C23919OooO0oO c23919OooO0oO2 = c23919OooO0oO;
                            oooO00o.getClass();
                            C20519OooO0Oo.OooO0Oo(4, OooO.f80242OooO0Oo, "permission result {}", Boolean.valueOf(z));
                            if (z) {
                                synchronized (OooO.this) {
                                    try {
                                        if (OooO.this.f80245OooO0OO == oooO00o) {
                                            oooO00o.f80246OooO00o.invoke(c23919OooO0oO2);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    });
                }
            } catch (IllegalArgumentException unused) {
                C20519OooO0Oo.OooO0o0(4, OooO.f80242OooO0Oo, "Attached usbDevice(vid={},pid={}) is not recognized as a valid YubiKey", Integer.valueOf(usbDevice.getVendorId()), Integer.valueOf(usbDevice.getProductId()));
            }
        }

        @Override // com.yubico.yubikit.android.transport.usb.OooO0OO.OooO0Oo
        public final void OooO0O0(UsbDevice usbDevice) {
            C23919OooO0oO c23919OooO0oO = (C23919OooO0oO) this.f80248OooO0OO.remove(usbDevice);
            if (c23919OooO0oO != null) {
                c23919OooO0oO.close();
            }
        }
    }

    static {
        C31883OooO0o0 c31883OooO0o0 = new C31883OooO0o0(11, 0);
        HashMap map = C31879OooO0O0.f113576OooO0OO;
        synchronized (map) {
            map.put(C31884OooO0oO.class, c31883OooO0o0);
        }
        C31881OooO0Oo c31881OooO0Oo = new C31881OooO0Oo(3, 1);
        synchronized (map) {
            map.put(C31882OooO0o.class, c31881OooO0Oo);
        }
        f80242OooO0Oo = C34354OooO0Oo.OooO0O0(OooO.class);
    }

    public OooO(Context context) {
        this.f80243OooO00o = context;
        this.f80244OooO0O0 = (UsbManager) context.getSystemService("usb");
    }

    public final synchronized void OooO00o() {
        OooO00o oooO00o = this.f80245OooO0OO;
        if (oooO00o != null) {
            OooO0OO.OooO0o0(this.f80243OooO00o, oooO00o);
            this.f80245OooO0OO = null;
        }
    }

    public final synchronized void OooO0O0(OooO0O0 oooO0O0, oO00000.OooO00o<? super C23919OooO0oO> oooO00o) {
        OooO00o();
        OooO00o oooO00o2 = new OooO00o(oooO0O0, oooO00o);
        this.f80245OooO0OO = oooO00o2;
        OooO0OO.OooO0OO(this.f80243OooO00o, oooO00o2);
    }
}
