package oO00O;

import oO00Oo0.C32266OooO0Oo;

/* JADX INFO: renamed from: oO00O.OoooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32168OoooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final EnumC32170OoooO0O f115397OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final EnumC32175OoooOoO f115398OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32266OooO0Oo f115399OooO0OO;

    public C32168OoooO0() {
        this((EnumC32170OoooO0O) null, (C32266OooO0Oo) null, 7);
    }

    public C32168OoooO0(EnumC32170OoooO0O type, EnumC32175OoooOoO version, C32266OooO0Oo packet) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        kotlin.jvm.internal.OooOOO0.OooO0oO(version, "version");
        kotlin.jvm.internal.OooOOO0.OooO0oO(packet, "packet");
        this.f115397OooO00o = type;
        this.f115398OooO0O0 = version;
        this.f115399OooO0OO = packet;
    }

    public C32168OoooO0(EnumC32170OoooO0O enumC32170OoooO0O, C32266OooO0Oo c32266OooO0Oo, int i) {
        this((i & 1) != 0 ? EnumC32170OoooO0O.Handshake : enumC32170OoooO0O, EnumC32175OoooOoO.TLS12, (i & 4) != 0 ? C32266OooO0Oo.f115959OooOooO : c32266OooO0Oo);
    }
}
