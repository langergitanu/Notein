package oo000o;

import com.google.common.net.HttpHeaders;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oo000o.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC34648OooOooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC34648OooOooO f124834OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC34648OooOooO f124835OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ EnumC34648OooOooO[] f124836OooOoO0;

    static {
        EnumC34648OooOooO enumC34648OooOooO = new EnumC34648OooOooO(HttpHeaders.WIDTH, 0);
        f124835OooOo0o = enumC34648OooOooO;
        EnumC34648OooOooO enumC34648OooOooO2 = new EnumC34648OooOooO("Height", 1);
        f124834OooOo = enumC34648OooOooO2;
        f124836OooOoO0 = new EnumC34648OooOooO[]{enumC34648OooOooO, enumC34648OooOooO2};
    }

    public EnumC34648OooOooO() {
        throw null;
    }

    public static EnumC34648OooOooO valueOf(String str) {
        return (EnumC34648OooOooO) Enum.valueOf(EnumC34648OooOooO.class, str);
    }

    public static EnumC34648OooOooO[] values() {
        return (EnumC34648OooOooO[]) f124836OooOoO0.clone();
    }
}
