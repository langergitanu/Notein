package com.yubico.yubikit.core.smartcard;

import java.util.Arrays;

/* JADX INFO: renamed from: com.yubico.yubikit.core.smartcard.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C23921OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f80301OooO00o;

    public C23921OooO0Oo(byte[] bArr) {
        if (bArr.length < 2) {
            throw new IllegalArgumentException("Invalid APDU response data");
        }
        this.f80301OooO00o = Arrays.copyOf(bArr, bArr.length);
    }

    public final short OooO00o() {
        byte[] bArr = this.f80301OooO00o;
        return (short) ((bArr[bArr.length - 1] & 255) | ((bArr[bArr.length - 2] & 255) << 8));
    }
}
