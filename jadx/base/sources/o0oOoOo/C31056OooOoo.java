package o0oOoOo;

import OoooooO.C21445Oooo;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.p609vo.PenVO;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import java.util.List;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: o0oOoOo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31056OooOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PenVO f110874OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<PenVO> f110875OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<PenColorVO> f110876OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final PenWidthVO f110877OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<C31045OooOOo> f110878OooO0o0;

    public C31056OooOoo() {
        this((PenVO) null, (List) null, (List) null, (PenWidthVO) null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31056OooOoo)) {
            return false;
        }
        C31056OooOoo c31056OooOoo = (C31056OooOoo) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110874OooO00o, c31056OooOoo.f110874OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110875OooO0O0, c31056OooOoo.f110875OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110876OooO0OO, c31056OooOoo.f110876OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110877OooO0Oo, c31056OooOoo.f110877OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f110878OooO0o0, c31056OooOoo.f110878OooO0o0);
    }

    public final int hashCode() {
        PenVO penVO = this.f110874OooO00o;
        int iOooO00o = C21445Oooo.OooO00o(this.f110876OooO0OO, C21445Oooo.OooO00o(this.f110875OooO0O0, (penVO == null ? 0 : penVO.hashCode()) * 31, 31), 31);
        PenWidthVO penWidthVO = this.f110877OooO0Oo;
        return this.f110878OooO0o0.hashCode() + ((iOooO00o + (penWidthVO != null ? penWidthVO.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PenSettingsVO(selectedPen=");
        sb.append(this.f110874OooO00o);
        sb.append(", penVOList=");
        sb.append(this.f110875OooO0O0);
        sb.append(", colorList=");
        sb.append(this.f110876OooO0OO);
        sb.append(", penWidth=");
        sb.append(this.f110877OooO0Oo);
        sb.append(", laserDisappearList=");
        return com.google.firebase.firestore.util.OooOOO.OooO0O0(")", sb, this.f110878OooO0o0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C31056OooOoo(PenVO penVO, List list, List list2, PenWidthVO penWidthVO, int i) {
        PenVO penVO2 = (i & 1) != 0 ? null : penVO;
        int i2 = i & 2;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this(penVO2, (List<PenVO>) (i2 != 0 ? c34434OooOoO : list), (List<PenColorVO>) ((i & 4) != 0 ? c34434OooOoO : list2), (i & 8) != 0 ? null : penWidthVO, c34434OooOoO);
    }

    public C31056OooOoo(PenVO penVO, List<PenVO> penVOList, List<PenColorVO> colorList, PenWidthVO penWidthVO, List<C31045OooOOo> laserDisappearList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(penVOList, "penVOList");
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorList, "colorList");
        kotlin.jvm.internal.OooOOO0.OooO0oO(laserDisappearList, "laserDisappearList");
        this.f110874OooO00o = penVO;
        this.f110875OooO0O0 = penVOList;
        this.f110876OooO0OO = colorList;
        this.f110877OooO0Oo = penWidthVO;
        this.f110878OooO0o0 = laserDisappearList;
    }
}
