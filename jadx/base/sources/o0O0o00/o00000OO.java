package o0O0o00;

import android.graphics.RectF;
import com.orion.editor.model.PagePart;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PagePart f88668OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RectF f88669OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f88670OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f88671OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f88672OooO0o0;

    public o00000OO(PagePart pagePart, RectF rectF, boolean z, boolean z2) {
        Objects.requireNonNull(pagePart);
        this.f88668OooO00o = pagePart;
        this.f88669OooO0O0 = new RectF(rectF);
        this.f88670OooO0OO = z;
        this.f88671OooO0Oo = System.nanoTime();
        this.f88672OooO0o0 = z2;
    }

    public final RectF OooO00o() {
        return new RectF(this.f88669OooO0O0);
    }

    public final void OooO0O0(o00000OO o00000oo2) {
        if (this.f88668OooO00o.f69346OooO00o.equals(o00000oo2.f88668OooO00o.f69346OooO00o)) {
            RectF rectF = this.f88669OooO0O0;
            boolean zIsEmpty = rectF.isEmpty();
            RectF rectF2 = o00000oo2.f88669OooO0O0;
            if (zIsEmpty) {
                rectF.set(rectF2);
            } else if (!rectF2.isEmpty()) {
                rectF.union(rectF2);
            }
            this.f88670OooO0OO = this.f88670OooO0OO && o00000oo2.f88670OooO0OO;
            this.f88671OooO0Oo = Math.max(this.f88671OooO0Oo, o00000oo2.f88671OooO0Oo);
            this.f88672OooO0o0 = this.f88672OooO0o0 || o00000oo2.f88672OooO0o0;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00000OO) {
            o00000OO o00000oo2 = (o00000OO) obj;
            PagePart pagePart = this.f88668OooO00o;
            if (pagePart.f69347OooO0O0 == o00000oo2.f88668OooO00o.f69347OooO0O0 && pagePart.OooO0OO().equals(o00000oo2.f88668OooO00o.OooO0OO()) && this.f88669OooO0O0.equals(o00000oo2.f88669OooO0O0) && this.f88670OooO0OO == o00000oo2.f88670OooO0OO && this.f88672OooO0o0 == o00000oo2.f88672OooO0o0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        PagePart pagePart = this.f88668OooO00o;
        return Objects.hash(Integer.valueOf(pagePart.f69347OooO0O0), pagePart.OooO0OO().toShortString(), this.f88669OooO0O0.toShortString(), Boolean.valueOf(this.f88670OooO0OO), Boolean.valueOf(this.f88672OooO0o0));
    }
}
