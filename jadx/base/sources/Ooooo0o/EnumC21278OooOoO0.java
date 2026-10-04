package Ooooo0o;

import oO00ooO.C32442OooOO0o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Ooooo0o.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC21278OooOoO0 implements InterfaceC21272OooOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC21278OooOoO0 f61683OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final EnumC21278OooOoO0 f61684OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final EnumC21278OooOoO0 f61685OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC21278OooOoO0 f61686OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ EnumC21278OooOoO0[] f61687OooOoOO;

    static {
        EnumC21278OooOoO0 enumC21278OooOoO0 = new EnumC21278OooOoO0("Active", 0);
        f61684OooOo0o = enumC21278OooOoO0;
        EnumC21278OooOoO0 enumC21278OooOoO02 = new EnumC21278OooOoO0("ActiveParent", 1);
        f61683OooOo = enumC21278OooOoO02;
        EnumC21278OooOoO0 enumC21278OooOoO03 = new EnumC21278OooOoO0("Captured", 2);
        f61686OooOoO0 = enumC21278OooOoO03;
        EnumC21278OooOoO0 enumC21278OooOoO04 = new EnumC21278OooOoO0("Inactive", 3);
        f61685OooOoO = enumC21278OooOoO04;
        f61687OooOoOO = new EnumC21278OooOoO0[]{enumC21278OooOoO0, enumC21278OooOoO02, enumC21278OooOoO03, enumC21278OooOoO04};
    }

    public EnumC21278OooOoO0() {
        throw null;
    }

    public static EnumC21278OooOoO0 valueOf(String str) {
        return (EnumC21278OooOoO0) Enum.valueOf(EnumC21278OooOoO0.class, str);
    }

    public static EnumC21278OooOoO0[] values() {
        return (EnumC21278OooOoO0[]) f61687OooOoOO.clone();
    }

    @Override // Ooooo0o.InterfaceC21272OooOo
    public final boolean OooO00o() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new C32442OooOO0o();
            }
        }
        return true;
    }
}
