package o0ooooo0;

import OooOoOO.C20519OooO0Oo;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o00o00Oo.C25256OooO00o;
import o0ooooo.EnumC31874OooO00o;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: renamed from: o0ooooo0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31884OooO0oO extends AbstractC31885OooO0oo implements com.yubico.yubikit.core.smartcard.OooO0o {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f113581OooOooO = C34354OooO0Oo.OooO0O0(C31884OooO0oO.class);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final UsbDeviceConnection f113582OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final UsbEndpoint f113583OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public byte f113584OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final UsbEndpoint f113585OooOoo0;

    /* JADX INFO: renamed from: o0ooooo0.OooO0oO$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final byte[] f113586OooO0oO = {0, 0, 0};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public byte f113587OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f113588OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public byte f113589OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public byte f113590OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public byte f113591OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public byte f113592OooO0o0;
    }

    public C31884OooO0oO(UsbDeviceConnection usbDeviceConnection, UsbInterface usbInterface, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) throws IOException {
        super(usbDeviceConnection, usbInterface);
        this.f113584OooOoo = (byte) 0;
        this.f113582OooOoO = usbDeviceConnection;
        this.f113585OooOoo0 = usbEndpoint;
        this.f113583OooOoOO = usbEndpoint2;
        OooO00o((byte) 98, new byte[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007b, code lost:
    
        r1 = new java.io.ByteArrayOutputStream();
        r2 = r16.f113585OooOoo0;
        r7 = r2.getMaxPacketSize();
        r8 = new byte[r7];
        r9 = null;
        r10 = false;
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x008b, code lost:
    
        r12 = r16.f113582OooOoO.bulkTransfer(r2, r8, r7, 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        if (r12 <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        OooOoOO.C20519OooO0Oo.OooO0o0(r3, r4, "{} bytes received: {}", java.lang.Integer.valueOf(r12), o00o00Oo.C25256OooO00o.OooO0Oo(0, r12, r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a2, code lost:
    
        if (r10 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a4, code lost:
    
        r1.write(r8, 0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        r9 = new o0ooooo0.C31884OooO0oO.OooO00o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ae, code lost:
    
        if (r7 <= 10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
    
        r11 = java.nio.ByteBuffer.wrap(r8, 0, 10).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r9.f113587OooO00o = r11.get();
        r9.f113588OooO0O0 = r11.getInt();
        r9.f113589OooO0OO = r11.get();
        r9.f113590OooO0Oo = r11.get();
        r9.f113592OooO0o0 = r11.get();
        r9.f113591OooO0o = r11.get();
        r11.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        r11 = r9.f113592OooO0o0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e8, code lost:
    
        if ((r11 & com.google.common.primitives.UnsignedBytes.MAX_POWER_OF_TWO) != (-128)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ea, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ec, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        r3 = (byte) (r16.f113584OooOoo - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f3, code lost:
    
        if (r9.f113587OooO00o == (-128)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f8, code lost:
    
        if (r9.f113589OooO0OO == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fd, code lost:
    
        if (r9.f113590OooO0Oo == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0100, code lost:
    
        if (r11 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0104, code lost:
    
        if (r9.f113591OooO0o == 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0106, code lost:
    
        if (r13 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0109, code lost:
    
        r1 = java.util.Locale.ROOT;
        OooOoOO.C20519OooO0Oo.OooO0o0(4, r4, "Invalid response from card reader bStatus={} and bError={}", java.lang.String.format(r1, "0x%02X", java.lang.Byte.valueOf(r11)), java.lang.String.format(r1, "0x%02X", java.lang.Byte.valueOf(r9.f113591OooO0o)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
    
        throw new java.io.IOException("Invalid response from card reader");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0135, code lost:
    
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0137, code lost:
    
        r1.write(r8, 0, r12);
        r11 = r13;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013d, code lost:
    
        if (r12 < 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013f, code lost:
    
        if (r12 <= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0141, code lost:
    
        if (r12 == r7) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0143, code lost:
    
        if (r11 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0145, code lost:
    
        r1 = r1.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0149, code lost:
    
        if (r9 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014c, code lost:
    
        if (r1.length < 10) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
    
        return java.util.Arrays.copyOfRange(r1, 10, java.lang.Math.min(r1.length - 10, r9.f113588OooO0O0) + 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0163, code lost:
    
        throw new java.io.IOException("Response is invalid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0164, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016e, code lost:
    
        throw new java.io.IOException("Failed to read response");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] OooO00o(byte b, byte[] bArr) throws IOException {
        int length = bArr.length;
        byte b2 = this.f113584OooOoo;
        this.f113584OooOoo = (byte) (b2 + 1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 10);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byte[] bArrArray = byteBufferAllocate.order(byteOrder).put(ByteBuffer.allocate(10).order(byteOrder).put(b).putInt(length).put((byte) 0).put(b2).put(OooO00o.f113586OooO0oO).array()).put(bArr).array();
        int iBulkTransfer = 0;
        int i = 0;
        while (true) {
            int length2 = bArrArray.length;
            int i2 = 5;
            InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = f113581OooOooO;
            if (i >= length2 && iBulkTransfer != this.f113583OooOoOO.getMaxPacketSize()) {
                break;
            }
            iBulkTransfer = this.f113582OooOoO.bulkTransfer(this.f113583OooOoOO, bArrArray, i, bArrArray.length - i, 1000);
            if (iBulkTransfer > 0) {
                C20519OooO0Oo.OooO0o0(5, interfaceC34352OooO0O0, "{} bytes sent over ccid: {}", Integer.valueOf(iBulkTransfer), C25256OooO00o.OooO0Oo(i, iBulkTransfer, bArrArray));
                i += iBulkTransfer;
            } else if (iBulkTransfer < 0) {
                throw new IOException("Failed to send " + (bArrArray.length - i) + " bytes");
            }
        }
    }

    @Override // com.yubico.yubikit.core.smartcard.OooO0o
    public final byte[] Ooooo0o(byte[] bArr) throws IOException {
        return OooO00o((byte) 111, bArr);
    }

    @Override // com.yubico.yubikit.core.smartcard.OooO0o
    public final boolean o000OO0O() {
        return true;
    }

    @Override // com.yubico.yubikit.core.smartcard.OooO0o
    public final EnumC31874OooO00o o0OO00O() {
        return EnumC31874OooO00o.f113571OooOo0o;
    }
}
