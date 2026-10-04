package com.yubico.yubikit.android.transport.usb;

import Oooo0.o0OoOo0;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.google.firebase.firestore.remote.RunnableC22704OooOo0;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import o0ooooo.InterfaceC31876OooO0OO;
import o0ooooo.InterfaceC31877OooO0Oo;
import o0ooooo0.C31879OooO0O0;
import o0ooooo0.C31884OooO0oO;
import o0ooooo0.InterfaceC31878OooO00o;
import oO00000.C31906OooO0Oo;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: com.yubico.yubikit.android.transport.usb.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23919OooO0oO implements InterfaceC31877OooO0Oo, Closeable {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f80263OooOooO = C34354OooO0Oo.OooO0O0(C23919OooO0oO.class);

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final C23917OooO0Oo f80264OooOooo = new C23917OooO0Oo();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C31879OooO0O0 f80265OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final UsbDevice f80267OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final UsbManager f80268OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f80269OooOoOO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ExecutorService f80266OooOo0o = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooO00o f80271OooOoo0 = null;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Runnable f80270OooOoo = null;

    /* JADX INFO: renamed from: com.yubico.yubikit.android.transport.usb.OooO0oO$OooO00o */
    public class OooO00o implements Closeable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final LinkedBlockingQueue<oO00000.OooO00o<C31906OooO0Oo<p617o.OooO00o, IOException>>> f80273OooOo0o;

        public OooO00o(C23918OooO0o0 c23918OooO0o0) {
            LinkedBlockingQueue<oO00000.OooO00o<C31906OooO0Oo<p617o.OooO00o, IOException>>> linkedBlockingQueue = new LinkedBlockingQueue<>();
            this.f80273OooOo0o = linkedBlockingQueue;
            C23919OooO0oO.f80263OooOooO.OooOOo("Creating new CachedOtpConnection");
            linkedBlockingQueue.offer(c23918OooO0o0);
            C23919OooO0oO.this.f80266OooOo0o.submit(new RunnableC22704OooOo0(1, this, c23918OooO0o0));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f80273OooOo0o.offer(C23919OooO0oO.f80264OooOooo);
        }
    }

    public C23919OooO0oO(UsbManager usbManager, UsbDevice usbDevice) throws IllegalArgumentException {
        int i;
        if (usbDevice.getVendorId() != 4176) {
            throw new IllegalArgumentException("Invalid vendor id");
        }
        int productId = usbDevice.getProductId();
        for (int i2 : o0OoOo0.OooO0O0(17)) {
            switch (i2) {
                case 1:
                    i = 16;
                    break;
                case 2:
                    i = StyleIdentifier.TABLE_GRID_LIGHT;
                    break;
                case 3:
                    i = StyleIdentifier.GRID_TABLE_1_LIGHT;
                    break;
                case 4:
                    i = StyleIdentifier.GRID_TABLE_2;
                    break;
                case 5:
                    i = StyleIdentifier.GRID_TABLE_3;
                    break;
                case 6:
                    i = StyleIdentifier.GRID_TABLE_4;
                    break;
                case 7:
                    i = StyleIdentifier.GRID_TABLE_5_DARK;
                    break;
                case 8:
                    i = StyleIdentifier.GRID_TABLE_6_COLORFUL;
                    break;
                case 9:
                    i = StyleIdentifier.GRID_TABLE_2_ACCENT_2;
                    break;
                case 10:
                    i = 1025;
                    break;
                case 11:
                    i = EditingLanguage.BULGARIAN;
                    break;
                case 12:
                    i = EditingLanguage.CATALAN;
                    break;
                case 13:
                    i = EditingLanguage.CHINESE_TAIWAN;
                    break;
                case 14:
                    i = EditingLanguage.CZECH;
                    break;
                case 15:
                    i = EditingLanguage.DANISH;
                    break;
                case 16:
                    i = EditingLanguage.GERMAN_GERMANY;
                    break;
                case 17:
                    i = EditingLanguage.ITALIAN_ITALY;
                    break;
                default:
                    throw null;
            }
            if (i == productId) {
                this.f80269OooOoOO = i2;
                this.f80265OooOo = new C31879OooO0O0(usbManager, usbDevice);
                this.f80267OooOoO = usbDevice;
                this.f80268OooOoO0 = usbManager;
                return;
            }
        }
        throw new IllegalArgumentException("invalid pid value");
    }

    public final void OooO00o(final oO00000.OooO00o oooO00o) {
        if (!this.f80268OooOoO0.hasPermission(this.f80267OooOoO)) {
            throw new IllegalStateException("Device access not permitted");
        }
        C31879OooO0O0 c31879OooO0O0 = this.f80265OooOo;
        c31879OooO0O0.getClass();
        InterfaceC31878OooO00o interfaceC31878OooO00oOooO00o = C31879OooO0O0.OooO00o(C31884OooO0oO.class);
        if (interfaceC31878OooO00oOooO00o == null || !interfaceC31878OooO00oOooO00o.OooO0O0(c31879OooO0O0.f113578OooO0O0)) {
            throw new IllegalStateException("Unsupported connection type");
        }
        if (p617o.OooO00o.class.isAssignableFrom(C31884OooO0oO.class)) {
            C23918OooO0o0 c23918OooO0o0 = new C23918OooO0o0(oooO00o);
            OooO00o oooO00o2 = this.f80271OooOoo0;
            if (oooO00o2 == null) {
                this.f80271OooOoo0 = new OooO00o(c23918OooO0o0);
                return;
            } else {
                oooO00o2.f80273OooOo0o.offer(c23918OooO0o0);
                return;
            }
        }
        OooO00o oooO00o3 = this.f80271OooOoo0;
        if (oooO00o3 != null) {
            oooO00o3.close();
            this.f80271OooOoo0 = null;
        }
        this.f80266OooOo0o.submit(new Runnable() { // from class: com.yubico.yubikit.android.transport.usb.OooO0o
            @Override // java.lang.Runnable
            public final void run() {
                oO00000.OooO00o oooO00o4 = oooO00o;
                C23919OooO0oO c23919OooO0oO = this.f80261OooOo0o;
                c23919OooO0oO.getClass();
                try {
                    InterfaceC31876OooO0OO interfaceC31876OooO0OOOooO0O0 = c23919OooO0oO.f80265OooOo.OooO0O0(C31884OooO0oO.class);
                    try {
                        oooO00o4.invoke(new C31906OooO0Oo(interfaceC31876OooO0OOOooO0O0, null));
                        interfaceC31876OooO0OOOooO0O0.close();
                    } finally {
                    }
                } catch (IOException e) {
                    oooO00o4.invoke(C31906OooO0Oo.OooO00o(e));
                }
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f80263OooOooO.OooOOo("Closing YubiKey device");
        OooO00o oooO00o = this.f80271OooOoo0;
        if (oooO00o != null) {
            oooO00o.close();
            this.f80271OooOoo0 = null;
        }
        Runnable runnable = this.f80270OooOoo;
        ExecutorService executorService = this.f80266OooOo0o;
        if (runnable != null) {
            executorService.submit(runnable);
        }
        executorService.shutdown();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("UsbYubiKeyDevice{usbDevice=");
        sb.append(this.f80267OooOoO);
        sb.append(", usbPid=");
        switch (this.f80269OooOoOO) {
            case 1:
                str = "YKS_OTP";
                break;
            case 2:
                str = "NEO_OTP";
                break;
            case 3:
                str = "NEO_OTP_CCID";
                break;
            case 4:
                str = "NEO_CCID";
                break;
            case 5:
                str = "NEO_FIDO";
                break;
            case 6:
                str = "NEO_OTP_FIDO";
                break;
            case 7:
                str = "NEO_FIDO_CCID";
                break;
            case 8:
                str = "NEO_OTP_FIDO_CCID";
                break;
            case 9:
                str = "SKY_FIDO";
                break;
            case 10:
                str = "YK4_OTP";
                break;
            case 11:
                str = "YK4_FIDO";
                break;
            case 12:
                str = "YK4_OTP_FIDO";
                break;
            case 13:
                str = "YK4_CCID";
                break;
            case 14:
                str = "YK4_OTP_CCID";
                break;
            case 15:
                str = "YK4_FIDO_CCID";
                break;
            case 16:
                str = "YK4_OTP_FIDO_CCID";
                break;
            case 17:
                str = "YKP_OTP_FIDO";
                break;
            default:
                str = CloudMetaExtra.DEFINE_NON_PARENT_ID;
                break;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
