package o0OOOooO;

import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0OOOooO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC27267OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC27267OooO00o f95063OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC27267OooO00o f95064OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final EnumC27267OooO00o f95065OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC27267OooO00o f95066OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ EnumC27267OooO00o[] f95067OooOoOO;

    static {
        EnumC27267OooO00o enumC27267OooO00o = new EnumC27267OooO00o("NONE", 0);
        f95064OooOo0o = enumC27267OooO00o;
        EnumC27267OooO00o enumC27267OooO00o2 = new EnumC27267OooO00o("LOADING", 1);
        f95063OooOo = enumC27267OooO00o2;
        EnumC27267OooO00o enumC27267OooO00o3 = new EnumC27267OooO00o("SUCCEED", 2);
        f95066OooOoO0 = enumC27267OooO00o3;
        EnumC27267OooO00o enumC27267OooO00o4 = new EnumC27267OooO00o(MaterialPurchaseStatusResponse.STATUS_FAILED, 3);
        f95065OooOoO = enumC27267OooO00o4;
        EnumC27267OooO00o[] enumC27267OooO00oArr = {enumC27267OooO00o, enumC27267OooO00o2, enumC27267OooO00o3, enumC27267OooO00o4};
        f95067OooOoOO = enumC27267OooO00oArr;
        OooO.OooO00o.OooO0O0(enumC27267OooO00oArr);
    }

    public EnumC27267OooO00o() {
        throw null;
    }

    public static EnumC27267OooO00o valueOf(String str) {
        return (EnumC27267OooO00o) Enum.valueOf(EnumC27267OooO00o.class, str);
    }

    public static EnumC27267OooO00o[] values() {
        return (EnumC27267OooO00o[]) f95067OooOoOO.clone();
    }
}
