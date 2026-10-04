package o0OoO0oo;

import OooOoO.C20509OooO0oo;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import android.graphics.PointF;
import com.orion.notein.domain.models.note.PdfInfo;
import java.util.List;

/* JADX INFO: renamed from: o0OoO0oo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28694OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f101666OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f101667OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<String> f101668OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<String> f101669OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PdfInfo f101670OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f101671OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f101672OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f101673OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f101674OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public PointF f101675OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f101676OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f101677OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f101678OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f101679OooOOO0;

    public C28694OooOO0O() {
        throw null;
    }

    public C28694OooOO0O(String id, List pages, List pageLayers, PdfInfo pdfInfo, float f, int i, String defaultPageLayerId, String str, boolean z, PointF defaultPageOffset, int i2, boolean z2, boolean z3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pages, "pages");
        kotlin.jvm.internal.OooOOO0.OooO0oO(pageLayers, "pageLayers");
        kotlin.jvm.internal.OooOOO0.OooO0oO(defaultPageLayerId, "defaultPageLayerId");
        kotlin.jvm.internal.OooOOO0.OooO0oO(defaultPageOffset, "defaultPageOffset");
        this.f101667OooO00o = id;
        this.f101668OooO0O0 = pages;
        this.f101669OooO0OO = pageLayers;
        this.f101670OooO0Oo = pdfInfo;
        this.f101672OooO0o0 = f;
        this.f101671OooO0o = i;
        this.f101673OooO0oO = defaultPageLayerId;
        this.f101674OooO0oo = str;
        this.f101666OooO = z;
        this.f101675OooOO0 = defaultPageOffset;
        this.f101676OooOO0O = i2;
        this.f101677OooOO0o = z2;
        this.f101679OooOOO0 = false;
        this.f101678OooOOO = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28694OooOO0O)) {
            return false;
        }
        C28694OooOO0O c28694OooOO0O = (C28694OooOO0O) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101667OooO00o, c28694OooOO0O.f101667OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101668OooO0O0, c28694OooOO0O.f101668OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101669OooO0OO, c28694OooOO0O.f101669OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101670OooO0Oo, c28694OooOO0O.f101670OooO0Oo) && Float.compare(this.f101672OooO0o0, c28694OooOO0O.f101672OooO0o0) == 0 && this.f101671OooO0o == c28694OooOO0O.f101671OooO0o && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101673OooO0oO, c28694OooOO0O.f101673OooO0oO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101674OooO0oo, c28694OooOO0O.f101674OooO0oo) && this.f101666OooO == c28694OooOO0O.f101666OooO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f101675OooOO0, c28694OooOO0O.f101675OooOO0) && this.f101676OooOO0O == c28694OooOO0O.f101676OooOO0O && this.f101677OooOO0o == c28694OooOO0O.f101677OooOO0o && this.f101679OooOOO0 == c28694OooOO0O.f101679OooOOO0 && this.f101678OooOOO == c28694OooOO0O.f101678OooOOO;
    }

    public final int hashCode() {
        int iOooO00o = C21445Oooo.OooO00o(this.f101669OooO0OO, C21445Oooo.OooO00o(this.f101668OooO0O0, this.f101667OooO00o.hashCode() * 31, 31), 31);
        PdfInfo pdfInfo = this.f101670OooO0Oo;
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.f101671OooO0o, C20509OooO0oo.OooO0OO(this.f101672OooO0o0, (iOooO00o + (pdfInfo == null ? 0 : pdfInfo.hashCode())) * 31, 31), 31), 31, this.f101673OooO0oO);
        String str = this.f101674OooO0oo;
        return Boolean.hashCode(this.f101678OooOOO) + OooOoo0.o00000.OooO0O0(OooOoo0.o00000.OooO0O0(C20785Oooo00o.OooO00o(this.f101676OooOO0O, (this.f101675OooOO0.hashCode() + OooOoo0.o00000.OooO0O0((iOooO0O0 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f101666OooO)) * 31, 31), 31, this.f101677OooOO0o), 31, this.f101679OooOOO0);
    }

    public final String toString() {
        float f = this.f101672OooO0o0;
        PointF pointF = this.f101675OooOO0;
        boolean z = this.f101679OooOOO0;
        StringBuilder sb = new StringBuilder("EditorVO(id=");
        sb.append(this.f101667OooO00o);
        sb.append(", pages=");
        sb.append(this.f101668OooO0O0);
        sb.append(", pageLayers=");
        sb.append(this.f101669OooO0OO);
        sb.append(", pdfInfo=");
        sb.append(this.f101670OooO0Oo);
        sb.append(", zoom=");
        sb.append(f);
        sb.append(", defaultPageIndex=");
        sb.append(this.f101671OooO0o);
        sb.append(", defaultPageLayerId=");
        sb.append(this.f101673OooO0oO);
        sb.append(", hlItemId=");
        sb.append(this.f101674OooO0oo);
        sb.append(", unbounded=");
        sb.append(this.f101666OooO);
        sb.append(", defaultPageOffset=");
        sb.append(pointF);
        sb.append(", swipeDirection=");
        sb.append(this.f101676OooOO0O);
        sb.append(", reverseScrollHandlePos=");
        sb.append(this.f101677OooOO0o);
        sb.append(", isFromDual=");
        sb.append(z);
        sb.append(", useNewDisplayItemRenderOrder=");
        return androidx.appcompat.app.OooOOO.OooO00o(sb, ")", this.f101678OooOOO);
    }
}
