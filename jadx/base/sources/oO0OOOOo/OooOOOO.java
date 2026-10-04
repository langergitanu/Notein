package oO0OOOOo;

import androidx.core.location.LocationRequestCompat;
import oO00o00o.InterfaceC32330OooO0O0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO implements InterfaceC32330OooO0O0<oOO00OOO.OooO0OO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ OooOOOO[] f119290OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooOOOO f119291OooOo0o;

    static {
        OooOOOO oooOOOO = new OooOOOO("INSTANCE", 0);
        f119291OooOo0o = oooOOOO;
        f119290OooOo = new OooOOOO[]{oooOOOO};
    }

    public OooOOOO() {
        throw null;
    }

    public static OooOOOO valueOf(String str) {
        return (OooOOOO) Enum.valueOf(OooOOOO.class, str);
    }

    public static OooOOOO[] values() {
        return (OooOOOO[]) f119290OooOo.clone();
    }

    @Override // oO00o00o.InterfaceC32330OooO0O0
    public final void accept(oOO00OOO.OooO0OO oooO0OO) throws Exception {
        oooO0OO.request(LocationRequestCompat.PASSIVE_INTERVAL);
    }
}
