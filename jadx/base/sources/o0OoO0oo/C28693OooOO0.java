package o0OoO0oo;

import android.graphics.RectF;
import com.aspose.slides.C22227OoooO;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.page.DualLinkRef;
import com.orion.notein.domain.models.page.DualLinkSource;
import com.orion.notein.domain.models.page.Image;
import com.orion.penkit.models.LayerInfo;
import o000oooo.C24761OooO;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28693OooOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f101653OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f101654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f101655OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f101656OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f101657OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f101658OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Integer f101659OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public RectF f101660OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public RectF f101661OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f101662OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public String f101663OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public String f101664OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public RectF f101665OooOOO0;

    public final C32443OooOOO<DualLinkSource, DualLinkRef> OooO00o() {
        String str = this.f101656OooO0OO;
        String str2 = this.f101657OooO0Oo;
        String str3 = this.f101658OooO0o;
        RectF rectF = this.f101660OooO0oO;
        RectF rectF2 = this.f101665OooOOO0;
        String str4 = this.f101663OooOO0O;
        String str5 = this.f101664OooOO0o;
        if (str != null && str2 != null && str3 != null && rectF != null && rectF2 != null && str4 != null && str5 != null) {
            String strOooO00o = C24761OooO.OooO00o("toString(...)");
            Integer num = this.f101659OooO0o0;
            DualLinkSource dualLinkSource = new DualLinkSource(strOooO00o, str, str2, num != null ? num.intValue() : 0, rectF, null, null, false, System.currentTimeMillis(), 0L, 736, null);
            DualLinkRef dualLinkRef = new DualLinkRef(C24761OooO.OooO00o("toString(...)"), str4, str5, rectF2, new Image(null, "link_ref", str3, LayerInfo.UNSPECIFIED_LAYER_ID, rectF2, 0.0f, System.currentTimeMillis(), System.currentTimeMillis(), false, 257, null), null, false, System.currentTimeMillis(), 0L, StyleIdentifier.LIST_TABLE_3_ACCENT_4, null);
            dualLinkSource.setRef(dualLinkRef);
            dualLinkRef.setSource(dualLinkSource);
            return new C32443OooOOO<>(dualLinkSource, dualLinkRef);
        }
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = C22227OoooO.OooO00o(c20358OooO00o, "DualLinkBuilder", "build error: sourceNoteId = ", str, ", sourcePageId = ");
        OooOO0.OooO0OO.OooO0o0(sbOooO00o, str2, ", sourceImagePath = ", str3, ", sourceBounds = ");
        sbOooO00o.append(rectF);
        sbOooO00o.append(", refBounds = ");
        sbOooO00o.append(rectF2);
        c20358OooO00o.OooO0OO(sbOooO00o.toString(), new Object[0]);
        StringBuilder sbOooO0O0 = com.aspose.slides.internal.p332p7.OooO0o.OooO0O0("build error: sourceNoteId = ", str, ", sourcePageId = ", str2, ", sourceImagePath = ");
        sbOooO0O0.append(str3);
        sbOooO0O0.append(", sourceBounds = ");
        sbOooO0O0.append(rectF);
        sbOooO0O0.append(", refBounds = ");
        sbOooO0O0.append(rectF2);
        throw new IllegalArgumentException(sbOooO0O0.toString());
    }

    public final void OooO0O0(int i) {
        this.f101654OooO00o = i;
        if (i == 0) {
            this.f101655OooO0O0 = 0;
            this.f101656OooO0OO = null;
            this.f101657OooO0Oo = null;
            this.f101659OooO0o0 = null;
            this.f101658OooO0o = null;
            this.f101660OooO0oO = null;
            this.f101661OooO0oo = null;
            this.f101653OooO = null;
            this.f101662OooOO0 = 0;
            this.f101663OooOO0O = null;
            this.f101664OooOO0o = null;
            this.f101665OooOOO0 = null;
        }
    }
}
