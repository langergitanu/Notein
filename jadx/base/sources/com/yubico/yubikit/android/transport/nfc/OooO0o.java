package com.yubico.yubikit.android.transport.nfc;

import OooOoOO.C20519OooO0Oo;
import android.nfc.tech.IsoDep;
import java.io.IOException;
import o00o00Oo.C25256OooO00o;
import o0ooooo.EnumC31874OooO00o;
import oOO00OOo.C34354OooO0Oo;
import oOO00OOo.InterfaceC34352OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements com.yubico.yubikit.core.smartcard.OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final InterfaceC34352OooO0O0 f80229OooOo = C34354OooO0Oo.OooO0O0(OooO0o.class);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final IsoDep f80230OooOo0o;

    public OooO0o(IsoDep isoDep) {
        this.f80230OooOo0o = isoDep;
        f80229OooOo.OooOOo("nfc connection opened");
    }

    @Override // com.yubico.yubikit.core.smartcard.OooO0o
    public final byte[] Ooooo0o(byte[] bArr) throws IOException {
        String strOooO0Oo = C25256OooO00o.OooO0Oo(0, bArr.length, bArr);
        InterfaceC34352OooO0O0 interfaceC34352OooO0O0 = f80229OooOo;
        C20519OooO0Oo.OooO0Oo(5, interfaceC34352OooO0O0, "sent: {}", strOooO0Oo);
        byte[] bArrTransceive = this.f80230OooOo0o.transceive(bArr);
        C20519OooO0Oo.OooO0Oo(5, interfaceC34352OooO0O0, "received: {}", C25256OooO00o.OooO0Oo(0, bArrTransceive.length, bArrTransceive));
        return bArrTransceive;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f80230OooOo0o.close();
        f80229OooOo.OooOOo("nfc connection closed");
    }

    @Override // com.yubico.yubikit.core.smartcard.OooO0o
    public final boolean o000OO0O() {
        return this.f80230OooOo0o.isExtendedLengthApduSupported();
    }

    @Override // com.yubico.yubikit.core.smartcard.OooO0o
    public final EnumC31874OooO00o o0OO00O() {
        return EnumC31874OooO00o.f113570OooOo;
    }
}
