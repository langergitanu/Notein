package com.yubico.yubikit.core.smartcard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO0OO f80298OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0OO f80299OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ OooO0OO[] f80300OooOoO0;

    static {
        OooO0OO oooO0OO = new OooO0OO("SHORT", 0);
        f80299OooOo0o = oooO0OO;
        OooO0OO oooO0OO2 = new OooO0OO("EXTENDED", 1);
        f80298OooOo = oooO0OO2;
        f80300OooOoO0 = new OooO0OO[]{oooO0OO, oooO0OO2};
    }

    public OooO0OO() {
        throw null;
    }

    public static OooO0OO valueOf(String str) {
        return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
    }

    public static OooO0OO[] values() {
        return (OooO0OO[]) f80300OooOoO0.clone();
    }
}
