package com.yubico.yubikit.android.transport.nfc;

import OooO0Oo.C20398OooO0O0;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.Ndef;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o0ooooo.InterfaceC31876OooO0OO;
import o0ooooo.InterfaceC31877OooO0Oo;
import oO00000.C31906OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements InterfaceC31877OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final ExecutorService f80222OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AtomicBoolean f80223OooOo0o = new AtomicBoolean();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final int f80224OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Tag f80225OooOoO0;

    public OooO(Tag tag, int i, ExecutorService executorService) {
        this.f80222OooOo = executorService;
        this.f80225OooOoO0 = tag;
        this.f80224OooOoO = i;
    }

    public final InterfaceC31876OooO0OO OooO00o() throws IOException {
        if (!OooO0o.class.isAssignableFrom(OooO0o.class)) {
            throw new IllegalStateException("The connection type is not supported by this session");
        }
        IsoDep isoDep = IsoDep.get(this.f80225OooOoO0);
        if (isoDep == null) {
            throw new IOException("the tag does not support ISO-DEP");
        }
        isoDep.setTimeout(this.f80224OooOoO);
        isoDep.connect();
        InterfaceC31876OooO0OO interfaceC31876OooO0OO = (InterfaceC31876OooO0OO) OooO0o.class.cast(new OooO0o(isoDep));
        Objects.requireNonNull(interfaceC31876OooO0OO);
        return interfaceC31876OooO0OO;
    }

    public final byte[] OooO0O0() throws IOException {
        try {
            Ndef ndef = Ndef.get(this.f80225OooOoO0);
            if (ndef != null) {
                try {
                    ndef.connect();
                    NdefMessage ndefMessage = ndef.getNdefMessage();
                    if (ndefMessage != null) {
                        byte[] byteArray = ndefMessage.toByteArray();
                        ndef.close();
                        return byteArray;
                    }
                } finally {
                }
            }
            if (ndef != null) {
                ndef.close();
            }
            throw new IOException("NDEF data missing or invalid");
        } catch (FormatException e) {
            throw new IOException(e);
        }
    }

    public final void OooO0OO(final oO00000.OooO00o oooO00o) {
        if (this.f80223OooOo0o.get()) {
            oooO00o.invoke(C31906OooO0Oo.OooO00o(new IOException("Can't requestConnection after calling remove()")));
        } else {
            this.f80222OooOo.submit(new Runnable() { // from class: com.yubico.yubikit.android.transport.nfc.OooO0oo
                @Override // java.lang.Runnable
                public final void run() {
                    oO00000.OooO00o oooO00o2 = oooO00o;
                    OooO oooO = this.f80235OooOo0o;
                    oooO.getClass();
                    try {
                        InterfaceC31876OooO0OO interfaceC31876OooO0OOOooO00o = oooO.OooO00o();
                        try {
                            oooO00o2.invoke(new C31906OooO0Oo(interfaceC31876OooO0OOOooO00o, null));
                            interfaceC31876OooO0OOOooO00o.close();
                        } catch (Throwable th) {
                            try {
                                interfaceC31876OooO0OOOooO00o.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        oooO00o2.invoke(C31906OooO0Oo.OooO00o(e));
                    } catch (Exception e2) {
                        oooO00o2.invoke(C31906OooO0Oo.OooO00o(new IOException("openConnection(" + OooO0o.class.getSimpleName() + ") exception: " + e2.getMessage())));
                    }
                }
            });
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NfcYubiKeyDevice{tag=");
        sb.append(this.f80225OooOoO0);
        sb.append(", timeout=");
        return C20398OooO0O0.OooO00o('}', sb, this.f80224OooOoO);
    }
}
