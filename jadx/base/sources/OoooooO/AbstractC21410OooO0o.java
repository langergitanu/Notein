package OoooooO;

import OooOoO.C20505OooO0OO;
import OooOoO.C20509OooO0oo;

/* JADX INFO: renamed from: OoooooO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21410OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f61969OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f61970OooO0O0;

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooO */
    public static final class OooO extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f61971OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f61972OooO0Oo;

        public OooO(float f, float f2) {
            super(1);
            this.f61971OooO0OO = f;
            this.f61972OooO0Oo = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO)) {
                return false;
            }
            OooO oooO = (OooO) obj;
            return Float.compare(this.f61971OooO0OO, oooO.f61971OooO0OO) == 0 && Float.compare(this.f61972OooO0Oo, oooO.f61972OooO0Oo) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61972OooO0Oo) + (Float.hashCode(this.f61971OooO0OO) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
            sb.append(this.f61971OooO0OO);
            sb.append(", y=");
            return C20505OooO0OO.OooO0O0(sb, this.f61972OooO0Oo, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooO00o */
    public static final class OooO00o extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float f61973OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f61974OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f61975OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f61976OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f61977OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f61978OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f61979OooO0oo;

        public OooO00o(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(3);
            this.f61974OooO0OO = f;
            this.f61975OooO0Oo = f2;
            this.f61977OooO0o0 = f3;
            this.f61976OooO0o = z;
            this.f61978OooO0oO = z2;
            this.f61979OooO0oo = f4;
            this.f61973OooO = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Float.compare(this.f61974OooO0OO, oooO00o.f61974OooO0OO) == 0 && Float.compare(this.f61975OooO0Oo, oooO00o.f61975OooO0Oo) == 0 && Float.compare(this.f61977OooO0o0, oooO00o.f61977OooO0o0) == 0 && this.f61976OooO0o == oooO00o.f61976OooO0o && this.f61978OooO0oO == oooO00o.f61978OooO0oO && Float.compare(this.f61979OooO0oo, oooO00o.f61979OooO0oo) == 0 && Float.compare(this.f61973OooO, oooO00o.f61973OooO) == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        public final int hashCode() {
            int iOooO0OO = C20509OooO0oo.OooO0OO(this.f61977OooO0o0, C20509OooO0oo.OooO0OO(this.f61975OooO0Oo, Float.hashCode(this.f61974OooO0OO) * 31, 31), 31);
            boolean z = this.f61976OooO0o;
            ?? r3 = z;
            if (z) {
                r3 = 1;
            }
            int i = (iOooO0OO + r3) * 31;
            boolean z2 = this.f61978OooO0oO;
            return Float.hashCode(this.f61973OooO) + C20509OooO0oo.OooO0OO(this.f61979OooO0oo, (i + (z2 ? 1 : z2)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb.append(this.f61974OooO0OO);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.f61975OooO0Oo);
            sb.append(", theta=");
            sb.append(this.f61977OooO0o0);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f61976OooO0o);
            sb.append(", isPositiveArc=");
            sb.append(this.f61978OooO0oO);
            sb.append(", arcStartX=");
            sb.append(this.f61979OooO0oo);
            sb.append(", arcStartY=");
            return C20505OooO0OO.OooO0O0(sb, this.f61973OooO, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooO0O0 */
    public static final class OooO0O0 extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f61980OooO0OO = new OooO0O0(3);
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooO0OO */
    public static final class OooO0OO extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f61981OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f61982OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f61983OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f61984OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f61985OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f61986OooO0oo;

        public OooO0OO(float f, float f2, float f3, float f4, float f5, float f6) {
            super(2);
            this.f61981OooO0OO = f;
            this.f61982OooO0Oo = f2;
            this.f61984OooO0o0 = f3;
            this.f61983OooO0o = f4;
            this.f61985OooO0oO = f5;
            this.f61986OooO0oo = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return Float.compare(this.f61981OooO0OO, oooO0OO.f61981OooO0OO) == 0 && Float.compare(this.f61982OooO0Oo, oooO0OO.f61982OooO0Oo) == 0 && Float.compare(this.f61984OooO0o0, oooO0OO.f61984OooO0o0) == 0 && Float.compare(this.f61983OooO0o, oooO0OO.f61983OooO0o) == 0 && Float.compare(this.f61985OooO0oO, oooO0OO.f61985OooO0oO) == 0 && Float.compare(this.f61986OooO0oo, oooO0OO.f61986OooO0oo) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61986OooO0oo) + C20509OooO0oo.OooO0OO(this.f61985OooO0oO, C20509OooO0oo.OooO0OO(this.f61983OooO0o, C20509OooO0oo.OooO0OO(this.f61984OooO0o0, C20509OooO0oo.OooO0OO(this.f61982OooO0Oo, Float.hashCode(this.f61981OooO0OO) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CurveTo(x1=");
            sb.append(this.f61981OooO0OO);
            sb.append(", y1=");
            sb.append(this.f61982OooO0Oo);
            sb.append(", x2=");
            sb.append(this.f61984OooO0o0);
            sb.append(", y2=");
            sb.append(this.f61983OooO0o);
            sb.append(", x3=");
            sb.append(this.f61985OooO0oO);
            sb.append(", y3=");
            return C20505OooO0OO.OooO0O0(sb, this.f61986OooO0oo, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    public static final class C21411OooO0Oo extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f61987OooO0OO;

        public C21411OooO0Oo(float f) {
            super(3);
            this.f61987OooO0OO = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C21411OooO0Oo) && Float.compare(this.f61987OooO0OO, ((C21411OooO0Oo) obj).f61987OooO0OO) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61987OooO0OO);
        }

        public final String toString() {
            return C20505OooO0OO.OooO0O0(new StringBuilder("HorizontalTo(x="), this.f61987OooO0OO, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooO0o, reason: collision with other inner class name */
    public static final class C18988OooO0o extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f61988OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f61989OooO0Oo;

        public C18988OooO0o(float f, float f2) {
            super(3);
            this.f61988OooO0OO = f;
            this.f61989OooO0Oo = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18988OooO0o)) {
                return false;
            }
            C18988OooO0o c18988OooO0o = (C18988OooO0o) obj;
            return Float.compare(this.f61988OooO0OO, c18988OooO0o.f61988OooO0OO) == 0 && Float.compare(this.f61989OooO0Oo, c18988OooO0o.f61989OooO0Oo) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61989OooO0Oo) + (Float.hashCode(this.f61988OooO0OO) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MoveTo(x=");
            sb.append(this.f61988OooO0OO);
            sb.append(", y=");
            return C20505OooO0OO.OooO0O0(sb, this.f61989OooO0Oo, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooO0o0, reason: case insensitive filesystem */
    public static final class C21412OooO0o0 extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f61990OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f61991OooO0Oo;

        public C21412OooO0o0(float f, float f2) {
            super(3);
            this.f61990OooO0OO = f;
            this.f61991OooO0Oo = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21412OooO0o0)) {
                return false;
            }
            C21412OooO0o0 c21412OooO0o0 = (C21412OooO0o0) obj;
            return Float.compare(this.f61990OooO0OO, c21412OooO0o0.f61990OooO0OO) == 0 && Float.compare(this.f61991OooO0Oo, c21412OooO0o0.f61991OooO0Oo) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61991OooO0Oo) + (Float.hashCode(this.f61990OooO0OO) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LineTo(x=");
            sb.append(this.f61990OooO0OO);
            sb.append(", y=");
            return C20505OooO0OO.OooO0O0(sb, this.f61991OooO0Oo, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooO0oO, reason: case insensitive filesystem */
    public static final class C21413OooO0oO extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f61992OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f61993OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f61994OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f61995OooO0o0;

        public C21413OooO0oO(float f, float f2, float f3, float f4) {
            super(1);
            this.f61992OooO0OO = f;
            this.f61993OooO0Oo = f2;
            this.f61995OooO0o0 = f3;
            this.f61994OooO0o = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21413OooO0oO)) {
                return false;
            }
            C21413OooO0oO c21413OooO0oO = (C21413OooO0oO) obj;
            return Float.compare(this.f61992OooO0OO, c21413OooO0oO.f61992OooO0OO) == 0 && Float.compare(this.f61993OooO0Oo, c21413OooO0oO.f61993OooO0Oo) == 0 && Float.compare(this.f61995OooO0o0, c21413OooO0oO.f61995OooO0o0) == 0 && Float.compare(this.f61994OooO0o, c21413OooO0oO.f61994OooO0o) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61994OooO0o) + C20509OooO0oo.OooO0OO(this.f61995OooO0o0, C20509OooO0oo.OooO0OO(this.f61993OooO0Oo, Float.hashCode(this.f61992OooO0OO) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("QuadTo(x1=");
            sb.append(this.f61992OooO0OO);
            sb.append(", y1=");
            sb.append(this.f61993OooO0Oo);
            sb.append(", x2=");
            sb.append(this.f61995OooO0o0);
            sb.append(", y2=");
            return C20505OooO0OO.OooO0O0(sb, this.f61994OooO0o, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooO0oo, reason: case insensitive filesystem */
    public static final class C21414OooO0oo extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f61996OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f61997OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f61998OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f61999OooO0o0;

        public C21414OooO0oo(float f, float f2, float f3, float f4) {
            super(2);
            this.f61996OooO0OO = f;
            this.f61997OooO0Oo = f2;
            this.f61999OooO0o0 = f3;
            this.f61998OooO0o = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21414OooO0oo)) {
                return false;
            }
            C21414OooO0oo c21414OooO0oo = (C21414OooO0oo) obj;
            return Float.compare(this.f61996OooO0OO, c21414OooO0oo.f61996OooO0OO) == 0 && Float.compare(this.f61997OooO0Oo, c21414OooO0oo.f61997OooO0Oo) == 0 && Float.compare(this.f61999OooO0o0, c21414OooO0oo.f61999OooO0o0) == 0 && Float.compare(this.f61998OooO0o, c21414OooO0oo.f61998OooO0o) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61998OooO0o) + C20509OooO0oo.OooO0OO(this.f61999OooO0o0, C20509OooO0oo.OooO0OO(this.f61997OooO0Oo, Float.hashCode(this.f61996OooO0OO) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
            sb.append(this.f61996OooO0OO);
            sb.append(", y1=");
            sb.append(this.f61997OooO0Oo);
            sb.append(", x2=");
            sb.append(this.f61999OooO0o0);
            sb.append(", y2=");
            return C20505OooO0OO.OooO0O0(sb, this.f61998OooO0o, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooOO0 */
    public static final class OooOO0 extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float f62000OooO;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f62001OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f62002OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f62003OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f62004OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f62005OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f62006OooO0oo;

        public OooOO0(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            super(3);
            this.f62001OooO0OO = f;
            this.f62002OooO0Oo = f2;
            this.f62004OooO0o0 = f3;
            this.f62003OooO0o = z;
            this.f62005OooO0oO = z2;
            this.f62006OooO0oo = f4;
            this.f62000OooO = f5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOO0)) {
                return false;
            }
            OooOO0 oooOO02 = (OooOO0) obj;
            return Float.compare(this.f62001OooO0OO, oooOO02.f62001OooO0OO) == 0 && Float.compare(this.f62002OooO0Oo, oooOO02.f62002OooO0Oo) == 0 && Float.compare(this.f62004OooO0o0, oooOO02.f62004OooO0o0) == 0 && this.f62003OooO0o == oooOO02.f62003OooO0o && this.f62005OooO0oO == oooOO02.f62005OooO0oO && Float.compare(this.f62006OooO0oo, oooOO02.f62006OooO0oo) == 0 && Float.compare(this.f62000OooO, oooOO02.f62000OooO) == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        public final int hashCode() {
            int iOooO0OO = C20509OooO0oo.OooO0OO(this.f62004OooO0o0, C20509OooO0oo.OooO0OO(this.f62002OooO0Oo, Float.hashCode(this.f62001OooO0OO) * 31, 31), 31);
            boolean z = this.f62003OooO0o;
            ?? r3 = z;
            if (z) {
                r3 = 1;
            }
            int i = (iOooO0OO + r3) * 31;
            boolean z2 = this.f62005OooO0oO;
            return Float.hashCode(this.f62000OooO) + C20509OooO0oo.OooO0OO(this.f62006OooO0oo, (i + (z2 ? 1 : z2)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb.append(this.f62001OooO0OO);
            sb.append(", verticalEllipseRadius=");
            sb.append(this.f62002OooO0Oo);
            sb.append(", theta=");
            sb.append(this.f62004OooO0o0);
            sb.append(", isMoreThanHalf=");
            sb.append(this.f62003OooO0o);
            sb.append(", isPositiveArc=");
            sb.append(this.f62005OooO0oO);
            sb.append(", arcStartDx=");
            sb.append(this.f62006OooO0oo);
            sb.append(", arcStartDy=");
            return C20505OooO0OO.OooO0O0(sb, this.f62000OooO, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooOO0O */
    public static final class OooOO0O extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f62007OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f62008OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f62009OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f62010OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f62011OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f62012OooO0oo;

        public OooOO0O(float f, float f2, float f3, float f4, float f5, float f6) {
            super(2);
            this.f62007OooO0OO = f;
            this.f62008OooO0Oo = f2;
            this.f62010OooO0o0 = f3;
            this.f62009OooO0o = f4;
            this.f62011OooO0oO = f5;
            this.f62012OooO0oo = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOO0O)) {
                return false;
            }
            OooOO0O oooOO0O = (OooOO0O) obj;
            return Float.compare(this.f62007OooO0OO, oooOO0O.f62007OooO0OO) == 0 && Float.compare(this.f62008OooO0Oo, oooOO0O.f62008OooO0Oo) == 0 && Float.compare(this.f62010OooO0o0, oooOO0O.f62010OooO0o0) == 0 && Float.compare(this.f62009OooO0o, oooOO0O.f62009OooO0o) == 0 && Float.compare(this.f62011OooO0oO, oooOO0O.f62011OooO0oO) == 0 && Float.compare(this.f62012OooO0oo, oooOO0O.f62012OooO0oo) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62012OooO0oo) + C20509OooO0oo.OooO0OO(this.f62011OooO0oO, C20509OooO0oo.OooO0OO(this.f62009OooO0o, C20509OooO0oo.OooO0OO(this.f62010OooO0o0, C20509OooO0oo.OooO0OO(this.f62008OooO0Oo, Float.hashCode(this.f62007OooO0OO) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
            sb.append(this.f62007OooO0OO);
            sb.append(", dy1=");
            sb.append(this.f62008OooO0Oo);
            sb.append(", dx2=");
            sb.append(this.f62010OooO0o0);
            sb.append(", dy2=");
            sb.append(this.f62009OooO0o);
            sb.append(", dx3=");
            sb.append(this.f62011OooO0oO);
            sb.append(", dy3=");
            return C20505OooO0OO.OooO0O0(sb, this.f62012OooO0oo, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooOO0o, reason: case insensitive filesystem */
    public static final class C21415OooOO0o extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f62013OooO0OO;

        public C21415OooOO0o(float f) {
            super(3);
            this.f62013OooO0OO = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C21415OooOO0o) && Float.compare(this.f62013OooO0OO, ((C21415OooOO0o) obj).f62013OooO0OO) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62013OooO0OO);
        }

        public final String toString() {
            return C20505OooO0OO.OooO0O0(new StringBuilder("RelativeHorizontalTo(dx="), this.f62013OooO0OO, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooOOO */
    public static final class OooOOO extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f62014OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f62015OooO0Oo;

        public OooOOO(float f, float f2) {
            super(3);
            this.f62014OooO0OO = f;
            this.f62015OooO0Oo = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOO)) {
                return false;
            }
            OooOOO oooOOO = (OooOOO) obj;
            return Float.compare(this.f62014OooO0OO, oooOOO.f62014OooO0OO) == 0 && Float.compare(this.f62015OooO0Oo, oooOOO.f62015OooO0Oo) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62015OooO0Oo) + (Float.hashCode(this.f62014OooO0OO) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
            sb.append(this.f62014OooO0OO);
            sb.append(", dy=");
            return C20505OooO0OO.OooO0O0(sb, this.f62015OooO0Oo, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooOOO0 */
    public static final class OooOOO0 extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f62016OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f62017OooO0Oo;

        public OooOOO0(float f, float f2) {
            super(3);
            this.f62016OooO0OO = f;
            this.f62017OooO0Oo = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOO0)) {
                return false;
            }
            OooOOO0 oooOOO0 = (OooOOO0) obj;
            return Float.compare(this.f62016OooO0OO, oooOOO0.f62016OooO0OO) == 0 && Float.compare(this.f62017OooO0Oo, oooOOO0.f62017OooO0Oo) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62017OooO0Oo) + (Float.hashCode(this.f62016OooO0OO) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
            sb.append(this.f62016OooO0OO);
            sb.append(", dy=");
            return C20505OooO0OO.OooO0O0(sb, this.f62017OooO0Oo, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooOOOO */
    public static final class OooOOOO extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f62018OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f62019OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f62020OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f62021OooO0o0;

        public OooOOOO(float f, float f2, float f3, float f4) {
            super(1);
            this.f62018OooO0OO = f;
            this.f62019OooO0Oo = f2;
            this.f62021OooO0o0 = f3;
            this.f62020OooO0o = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOOO)) {
                return false;
            }
            OooOOOO oooOOOO = (OooOOOO) obj;
            return Float.compare(this.f62018OooO0OO, oooOOOO.f62018OooO0OO) == 0 && Float.compare(this.f62019OooO0Oo, oooOOOO.f62019OooO0Oo) == 0 && Float.compare(this.f62021OooO0o0, oooOOOO.f62021OooO0o0) == 0 && Float.compare(this.f62020OooO0o, oooOOOO.f62020OooO0o) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62020OooO0o) + C20509OooO0oo.OooO0OO(this.f62021OooO0o0, C20509OooO0oo.OooO0OO(this.f62019OooO0Oo, Float.hashCode(this.f62018OooO0OO) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
            sb.append(this.f62018OooO0OO);
            sb.append(", dy1=");
            sb.append(this.f62019OooO0Oo);
            sb.append(", dx2=");
            sb.append(this.f62021OooO0o0);
            sb.append(", dy2=");
            return C20505OooO0OO.OooO0O0(sb, this.f62020OooO0o, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooOOOo, reason: case insensitive filesystem */
    public static final class C21416OooOOOo extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f62022OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f62023OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final float f62024OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f62025OooO0o0;

        public C21416OooOOOo(float f, float f2, float f3, float f4) {
            super(2);
            this.f62022OooO0OO = f;
            this.f62023OooO0Oo = f2;
            this.f62025OooO0o0 = f3;
            this.f62024OooO0o = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21416OooOOOo)) {
                return false;
            }
            C21416OooOOOo c21416OooOOOo = (C21416OooOOOo) obj;
            return Float.compare(this.f62022OooO0OO, c21416OooOOOo.f62022OooO0OO) == 0 && Float.compare(this.f62023OooO0Oo, c21416OooOOOo.f62023OooO0Oo) == 0 && Float.compare(this.f62025OooO0o0, c21416OooOOOo.f62025OooO0o0) == 0 && Float.compare(this.f62024OooO0o, c21416OooOOOo.f62024OooO0o) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62024OooO0o) + C20509OooO0oo.OooO0OO(this.f62025OooO0o0, C20509OooO0oo.OooO0OO(this.f62023OooO0Oo, Float.hashCode(this.f62022OooO0OO) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb.append(this.f62022OooO0OO);
            sb.append(", dy1=");
            sb.append(this.f62023OooO0Oo);
            sb.append(", dx2=");
            sb.append(this.f62025OooO0o0);
            sb.append(", dy2=");
            return C20505OooO0OO.OooO0O0(sb, this.f62024OooO0o, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooOOo, reason: case insensitive filesystem */
    public static final class C21417OooOOo extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f62026OooO0OO;

        public C21417OooOOo(float f) {
            super(3);
            this.f62026OooO0OO = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C21417OooOOo) && Float.compare(this.f62026OooO0OO, ((C21417OooOOo) obj).f62026OooO0OO) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62026OooO0OO);
        }

        public final String toString() {
            return C20505OooO0OO.OooO0O0(new StringBuilder("RelativeVerticalTo(dy="), this.f62026OooO0OO, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooOOo0, reason: case insensitive filesystem */
    public static final class C21418OooOOo0 extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f62027OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f62028OooO0Oo;

        public C21418OooOOo0(float f, float f2) {
            super(1);
            this.f62027OooO0OO = f;
            this.f62028OooO0Oo = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21418OooOOo0)) {
                return false;
            }
            C21418OooOOo0 c21418OooOOo0 = (C21418OooOOo0) obj;
            return Float.compare(this.f62027OooO0OO, c21418OooOOo0.f62027OooO0OO) == 0 && Float.compare(this.f62028OooO0Oo, c21418OooOOo0.f62028OooO0Oo) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62028OooO0Oo) + (Float.hashCode(this.f62027OooO0OO) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb.append(this.f62027OooO0OO);
            sb.append(", dy=");
            return C20505OooO0OO.OooO0O0(sb, this.f62028OooO0Oo, ')');
        }
    }

    /* JADX INFO: renamed from: OoooooO.OooO0o$OooOOoo, reason: case insensitive filesystem */
    public static final class C21419OooOOoo extends AbstractC21410OooO0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f62029OooO0OO;

        public C21419OooOOoo(float f) {
            super(3);
            this.f62029OooO0OO = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C21419OooOOoo) && Float.compare(this.f62029OooO0OO, ((C21419OooOOoo) obj).f62029OooO0OO) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f62029OooO0OO);
        }

        public final String toString() {
            return C20505OooO0OO.OooO0O0(new StringBuilder("VerticalTo(y="), this.f62029OooO0OO, ')');
        }
    }

    public AbstractC21410OooO0o(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        this.f61969OooO00o = z;
        this.f61970OooO0O0 = z2;
    }
}
