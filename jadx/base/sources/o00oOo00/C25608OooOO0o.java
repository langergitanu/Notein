package o00oOo00;

import android.graphics.Bitmap;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import o00o0o.AbstractC25434OooO00o;

/* JADX INFO: renamed from: o00oOo00.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25608OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC25434OooO00o<Bitmap> f87377OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f87378OooO0O0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00oOo00.OooOO0o$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f87379OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f87380OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f87381OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final OooO00o f87382OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o(MaterialPurchaseStatusResponse.STATUS_SUCCESS, 0);
            f87380OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("NEAREST", 1);
            f87379OooOo = oooO00o2;
            OooO00o oooO00o3 = new OooO00o("MISSING", 2);
            f87382OooOoO0 = oooO00o3;
            OooO00o[] oooO00oArr = {oooO00o, oooO00o2, oooO00o3};
            f87381OooOoO = oooO00oArr;
            OooO.OooO00o.OooO0O0(oooO00oArr);
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f87381OooOoO.clone();
        }
    }

    public C25608OooOO0o(AbstractC25434OooO00o<Bitmap> abstractC25434OooO00o, OooO00o oooO00o) {
        this.f87377OooO00o = abstractC25434OooO00o;
        this.f87378OooO0O0 = oooO00o;
    }
}
