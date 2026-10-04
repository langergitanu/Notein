package com.yubico.yubikit.core.smartcard;

import java.util.Locale;
import o0oooooO.C31889OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 extends C31889OooO0Oo {
    static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final short f80297OooOo0o;

    public OooO0O0(short s, String str) {
        super(str);
        this.f80297OooOo0o = s;
    }

    public OooO0O0(short s) {
        this(s, String.format(Locale.ROOT, "APDU error: 0x%04x", Short.valueOf(s)));
    }
}
