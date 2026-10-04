package o00o0oOo;

import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o00o0oOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC25460OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC25460OooO0OO f86757OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC25460OooO0OO f86758OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ EnumC25460OooO0OO[] f86759OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC25460OooO0OO f86760OooOoO0;

    static {
        EnumC25460OooO0OO enumC25460OooO0OO = new EnumC25460OooO0OO("YES", 0);
        f86758OooOo0o = enumC25460OooO0OO;
        EnumC25460OooO0OO enumC25460OooO0OO2 = new EnumC25460OooO0OO("NO", 1);
        f86757OooOo = enumC25460OooO0OO2;
        EnumC25460OooO0OO enumC25460OooO0OO3 = new EnumC25460OooO0OO(TelemetryEventStrings.Value.UNSET, 2);
        f86760OooOoO0 = enumC25460OooO0OO3;
        f86759OooOoO = new EnumC25460OooO0OO[]{enumC25460OooO0OO, enumC25460OooO0OO2, enumC25460OooO0OO3};
    }

    public EnumC25460OooO0OO() {
        throw null;
    }

    public static EnumC25460OooO0OO valueOf(String str) {
        return (EnumC25460OooO0OO) Enum.valueOf(EnumC25460OooO0OO.class, str);
    }

    public static EnumC25460OooO0OO[] values() {
        return (EnumC25460OooO0OO[]) f86759OooOoO.clone();
    }
}
