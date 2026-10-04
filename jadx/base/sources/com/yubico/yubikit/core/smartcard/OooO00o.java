package com.yubico.yubikit.core.smartcard;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte f80292OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final byte f80293OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final byte f80294OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final byte f80295OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final byte[] f80296OooO0o0;

    public OooO00o(int i, int i2, int i3, byte[] bArr) {
        byte bOooO00o = OooO00o(0, "CLA");
        byte bOooO00o2 = OooO00o(i, "INS");
        byte bOooO00o3 = OooO00o(i2, "P1");
        byte bOooO00o4 = OooO00o(i3, "P2");
        this.f80292OooO00o = bOooO00o;
        this.f80293OooO0O0 = bOooO00o2;
        this.f80294OooO0OO = bOooO00o3;
        this.f80295OooO0Oo = bOooO00o4;
        this.f80296OooO0o0 = bArr == null ? new byte[0] : bArr;
    }

    public static byte OooO00o(int i, String str) {
        if (i > 255 || i < -128) {
            throw new IllegalArgumentException(C20593OooO0Oo.OooO0O0("Invalid value for ", str, ", must fit in a byte"));
        }
        return (byte) i;
    }
}
