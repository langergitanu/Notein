package o0OOoO0;

import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO f97726OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO f97727OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO f97728OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO f97729OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooO f97730OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ OooO[] f97731OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO f97732OooOoo0;

    static {
        OooO oooO = new OooO("IDLE", 0);
        f97727OooOo0o = oooO;
        OooO oooO2 = new OooO("STARTED", 1);
        f97726OooOo = oooO2;
        OooO oooO3 = new OooO("REMOTE_RECONCILE", 2);
        f97729OooOoO0 = oooO3;
        OooO oooO4 = new OooO("LOCAL_RESTORE", 3);
        f97728OooOoO = oooO4;
        OooO oooO5 = new OooO("DONE", 4);
        f97730OooOoOO = oooO5;
        OooO oooO6 = new OooO(MaterialPurchaseStatusResponse.STATUS_FAILED, 5);
        f97732OooOoo0 = oooO6;
        OooO[] oooOArr = {oooO, oooO2, oooO3, oooO4, oooO5, oooO6};
        f97731OooOoo = oooOArr;
        OooO.OooO00o.OooO0O0(oooOArr);
    }

    public OooO() {
        throw null;
    }

    public static OooO valueOf(String str) {
        return (OooO) Enum.valueOf(OooO.class, str);
    }

    public static OooO[] values() {
        return (OooO[]) f97731OooOoo.clone();
    }
}
