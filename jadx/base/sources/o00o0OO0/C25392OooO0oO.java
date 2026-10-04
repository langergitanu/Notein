package o00o0OO0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import com.aspose.slides.o000oOoO;
import com.huawei.hms.network.embedded.C18163eb;
import com.microsoft.identity.common.java.marker.PerfConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import o00o0OO0.C25334OooO0O0;
import o00o0OO0.C25345OooO0o;
import o00o0OO0.C25391OooO0o0;

/* JADX INFO: renamed from: o00o0OO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25392OooO0oO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static HashSet<String> f86567OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Canvas f86568OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f86569OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C25345OooO0o f86570OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C19699OooO0oO f86571OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Stack<C25345OooO0o.Oooo0> f86572OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Stack<C19699OooO0oO> f86573OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Stack<Matrix> f86574OooO0oO;

    /* JADX INFO: renamed from: o00o0OO0.OooO0oO$OooO */
    public abstract class OooO {
        public boolean OooO00o(C25345OooO0o.AbstractC25383OoooOOo abstractC25383OoooOOo) {
            return true;
        }

        public abstract void OooO0O0(String str);
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0oO$OooO00o */
    public class OooO00o implements C25345OooO0o.InterfaceC25357OooOo0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f86575OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f86576OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f86577OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO0O0 f86578OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f86579OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f86580OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f86581OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f86582OooO0oo;

        public OooO00o(C25392OooO0oO c25392OooO0oO, C25345OooO0o.C25356OooOo0O c25356OooOo0O) {
            ArrayList arrayList = new ArrayList();
            this.f86575OooO00o = arrayList;
            this.f86578OooO0Oo = null;
            this.f86580OooO0o0 = false;
            this.f86579OooO0o = true;
            this.f86581OooO0oO = -1;
            if (c25356OooOo0O == null) {
                return;
            }
            c25356OooOo0O.OooO0o(this);
            if (this.f86582OooO0oo) {
                this.f86578OooO0Oo.OooO0O0((OooO0O0) arrayList.get(this.f86581OooO0oO));
                arrayList.set(this.f86581OooO0oO, this.f86578OooO0Oo);
                this.f86582OooO0oo = false;
            }
            OooO0O0 oooO0O0 = this.f86578OooO0Oo;
            if (oooO0O0 != null) {
                arrayList.add(oooO0O0);
            }
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f86579OooO0o || this.f86580OooO0o0) {
                this.f86578OooO0Oo.OooO00o(f, f2);
                this.f86575OooO00o.add(this.f86578OooO0Oo);
                this.f86580OooO0o0 = false;
            }
            this.f86578OooO0Oo = new OooO0O0(f5, f6, f5 - f3, f6 - f4);
            this.f86582OooO0oo = false;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void OooO0O0(float f, float f2, float f3, float f4) {
            this.f86578OooO0Oo.OooO00o(f, f2);
            this.f86575OooO00o.add(this.f86578OooO0Oo);
            this.f86578OooO0Oo = new OooO0O0(f3, f4, f3 - f, f4 - f2);
            this.f86582OooO0oo = false;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void OooO0OO(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.f86580OooO0o0 = true;
            this.f86579OooO0o = false;
            OooO0O0 oooO0O0 = this.f86578OooO0Oo;
            C25392OooO0oO.OooO00o(oooO0O0.f86583OooO00o, oooO0O0.f86584OooO0O0, f, f2, f3, z, z2, f4, f5, this);
            this.f86579OooO0o = true;
            this.f86582OooO0oo = false;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void close() {
            this.f86575OooO00o.add(this.f86578OooO0Oo);
            lineTo(this.f86576OooO0O0, this.f86577OooO0OO);
            this.f86582OooO0oo = true;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void lineTo(float f, float f2) {
            this.f86578OooO0Oo.OooO00o(f, f2);
            this.f86575OooO00o.add(this.f86578OooO0Oo);
            OooO0O0 oooO0O0 = this.f86578OooO0Oo;
            this.f86578OooO0Oo = new OooO0O0(f, f2, f - oooO0O0.f86583OooO00o, f2 - oooO0O0.f86584OooO0O0);
            this.f86582OooO0oo = false;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void moveTo(float f, float f2) {
            boolean z = this.f86582OooO0oo;
            ArrayList arrayList = this.f86575OooO00o;
            if (z) {
                this.f86578OooO0Oo.OooO0O0((OooO0O0) arrayList.get(this.f86581OooO0oO));
                arrayList.set(this.f86581OooO0oO, this.f86578OooO0Oo);
                this.f86582OooO0oo = false;
            }
            OooO0O0 oooO0O0 = this.f86578OooO0Oo;
            if (oooO0O0 != null) {
                arrayList.add(oooO0O0);
            }
            this.f86576OooO0O0 = f;
            this.f86577OooO0OO = f2;
            this.f86578OooO0Oo = new OooO0O0(f, f2, 0.0f, 0.0f);
            this.f86581OooO0oO = arrayList.size();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0oO$OooO0O0 */
    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f86583OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f86584OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f86585OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f86586OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f86587OooO0o0 = false;

        public OooO0O0(float f, float f2, float f3, float f4) {
            this.f86585OooO0OO = 0.0f;
            this.f86586OooO0Oo = 0.0f;
            this.f86583OooO00o = f;
            this.f86584OooO0O0 = f2;
            double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
            if (dSqrt != 0.0d) {
                this.f86585OooO0OO = (float) (((double) f3) / dSqrt);
                this.f86586OooO0Oo = (float) (((double) f4) / dSqrt);
            }
        }

        public final void OooO00o(float f, float f2) {
            float f3 = f - this.f86583OooO00o;
            float f4 = f2 - this.f86584OooO0O0;
            double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
            if (dSqrt != 0.0d) {
                f3 = (float) (((double) f3) / dSqrt);
                f4 = (float) (((double) f4) / dSqrt);
            }
            float f5 = this.f86585OooO0OO;
            if (f3 != (-f5) || f4 != (-this.f86586OooO0Oo)) {
                this.f86585OooO0OO = f5 + f3;
                this.f86586OooO0Oo += f4;
            } else {
                this.f86587OooO0o0 = true;
                this.f86585OooO0OO = -f4;
                this.f86586OooO0Oo = f3;
            }
        }

        public final void OooO0O0(OooO0O0 oooO0O0) {
            float f = oooO0O0.f86585OooO0OO;
            float f2 = this.f86585OooO0OO;
            if (f == (-f2)) {
                float f3 = oooO0O0.f86586OooO0Oo;
                if (f3 == (-this.f86586OooO0Oo)) {
                    this.f86587OooO0o0 = true;
                    this.f86585OooO0OO = -f3;
                    this.f86586OooO0Oo = oooO0O0.f86585OooO0OO;
                    return;
                }
            }
            this.f86585OooO0OO = f2 + f;
            this.f86586OooO0Oo += oooO0O0.f86586OooO0Oo;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(this.f86583OooO00o);
            sb.append(",");
            sb.append(this.f86584OooO0O0);
            sb.append(" ");
            sb.append(this.f86585OooO0OO);
            sb.append(",");
            return Oooo00o.OooO0OO.OooO0OO(sb, this.f86586OooO0Oo, ")");
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0oO$OooO0OO */
    public class OooO0OO implements C25345OooO0o.InterfaceC25357OooOo0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Path f86588OooO00o = new Path();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f86589OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f86590OooO0OO;

        public OooO0OO(C25345OooO0o.C25356OooOo0O c25356OooOo0O) {
            if (c25356OooOo0O == null) {
                return;
            }
            c25356OooOo0O.OooO0o(this);
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f86588OooO00o.cubicTo(f, f2, f3, f4, f5, f6);
            this.f86589OooO0O0 = f5;
            this.f86590OooO0OO = f6;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void OooO0O0(float f, float f2, float f3, float f4) {
            this.f86588OooO00o.quadTo(f, f2, f3, f4);
            this.f86589OooO0O0 = f3;
            this.f86590OooO0OO = f4;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void OooO0OO(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            C25392OooO0oO.OooO00o(this.f86589OooO0O0, this.f86590OooO0OO, f, f2, f3, z, z2, f4, f5, this);
            this.f86589OooO0O0 = f4;
            this.f86590OooO0OO = f5;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void close() {
            this.f86588OooO00o.close();
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void lineTo(float f, float f2) {
            this.f86588OooO00o.lineTo(f, f2);
            this.f86589OooO0O0 = f;
            this.f86590OooO0OO = f2;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void moveTo(float f, float f2) {
            this.f86588OooO00o.moveTo(f, f2);
            this.f86589OooO0O0 = f;
            this.f86590OooO0OO = f2;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0oO$OooO0Oo, reason: case insensitive filesystem */
    public class C25393OooO0Oo extends C25394OooO0o0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Path f86591OooO0Oo;

        public C25393OooO0Oo(Path path, float f) {
            super(f, 0.0f);
            this.f86591OooO0Oo = path;
        }

        @Override // o00o0OO0.C25392OooO0oO.C25394OooO0o0, o00o0OO0.C25392OooO0oO.OooO
        public final void OooO0O0(String str) {
            C25392OooO0oO c25392OooO0oO = C25392OooO0oO.this;
            if (c25392OooO0oO.o000oOoO()) {
                C19699OooO0oO c19699OooO0oO = c25392OooO0oO.f86571OooO0Oo;
                if (c19699OooO0oO.f86601OooO0O0) {
                    c25392OooO0oO.f86568OooO00o.drawTextOnPath(str, this.f86591OooO0Oo, this.f86597OooO00o, this.f86598OooO0O0, c19699OooO0oO.f86603OooO0Oo);
                }
                C19699OooO0oO c19699OooO0oO2 = c25392OooO0oO.f86571OooO0Oo;
                if (c19699OooO0oO2.f86602OooO0OO) {
                    c25392OooO0oO.f86568OooO00o.drawTextOnPath(str, this.f86591OooO0Oo, this.f86597OooO00o, this.f86598OooO0O0, c19699OooO0oO2.f86605OooO0o0);
                }
            }
            this.f86597OooO00o = c25392OooO0oO.f86571OooO0Oo.f86603OooO0Oo.measureText(str) + this.f86597OooO00o;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0oO$OooO0o */
    public class OooO0o extends OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f86593OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f86594OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Path f86595OooO0OO;

        public OooO0o(float f, float f2, Path path) {
            this.f86593OooO00o = f;
            this.f86594OooO0O0 = f2;
            this.f86595OooO0OO = path;
        }

        @Override // o00o0OO0.C25392OooO0oO.OooO
        public final boolean OooO00o(C25345OooO0o.AbstractC25383OoooOOo abstractC25383OoooOOo) {
            if (!(abstractC25383OoooOOo instanceof C25345OooO0o.C25384OoooOo0)) {
                return true;
            }
            Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
            return false;
        }

        @Override // o00o0OO0.C25392OooO0oO.OooO
        public final void OooO0O0(String str) {
            String str2;
            C25392OooO0oO c25392OooO0oO = C25392OooO0oO.this;
            if (c25392OooO0oO.o000oOoO()) {
                Path path = new Path();
                str2 = str;
                c25392OooO0oO.f86571OooO0Oo.f86603OooO0Oo.getTextPath(str2, 0, str.length(), this.f86593OooO00o, this.f86594OooO0O0, path);
                this.f86595OooO0OO.addPath(path);
            } else {
                str2 = str;
            }
            this.f86593OooO00o = c25392OooO0oO.f86571OooO0Oo.f86603OooO0Oo.measureText(str2) + this.f86593OooO00o;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0oO$OooO0o0, reason: case insensitive filesystem */
    public class C25394OooO0o0 extends OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f86597OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f86598OooO0O0;

        public C25394OooO0o0(float f, float f2) {
            this.f86597OooO00o = f;
            this.f86598OooO0O0 = f2;
        }

        @Override // o00o0OO0.C25392OooO0oO.OooO
        public void OooO0O0(String str) {
            C25392OooO0oO c25392OooO0oO = C25392OooO0oO.this;
            if (c25392OooO0oO.o000oOoO()) {
                C19699OooO0oO c19699OooO0oO = c25392OooO0oO.f86571OooO0Oo;
                if (c19699OooO0oO.f86601OooO0O0) {
                    c25392OooO0oO.f86568OooO00o.drawText(str, this.f86597OooO00o, this.f86598OooO0O0, c19699OooO0oO.f86603OooO0Oo);
                }
                C19699OooO0oO c19699OooO0oO2 = c25392OooO0oO.f86571OooO0Oo;
                if (c19699OooO0oO2.f86602OooO0OO) {
                    c25392OooO0oO.f86568OooO00o.drawText(str, this.f86597OooO00o, this.f86598OooO0O0, c19699OooO0oO2.f86605OooO0o0);
                }
            }
            this.f86597OooO00o = c25392OooO0oO.f86571OooO0Oo.f86603OooO0Oo.measureText(str) + this.f86597OooO00o;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0oO$OooO0oo, reason: case insensitive filesystem */
    public class C25395OooO0oo extends OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f86608OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f86609OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final RectF f86610OooO0OO = new RectF();

        public C25395OooO0oo(float f, float f2) {
            this.f86608OooO00o = f;
            this.f86609OooO0O0 = f2;
        }

        @Override // o00o0OO0.C25392OooO0oO.OooO
        public final boolean OooO00o(C25345OooO0o.AbstractC25383OoooOOo abstractC25383OoooOOo) {
            if (!(abstractC25383OoooOOo instanceof C25345OooO0o.C25384OoooOo0)) {
                return true;
            }
            C25345OooO0o.C25384OoooOo0 c25384OoooOo0 = (C25345OooO0o.C25384OoooOo0) abstractC25383OoooOOo;
            C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo = abstractC25383OoooOOo.f86520OooO00o.OooO0Oo(c25384OoooOo0.f86531OooOOO);
            if (abstractC25373Oooo0OOOooO0Oo == null) {
                C25392OooO0oO.OooOOOO("TextPath path reference '%s' not found", c25384OoooOo0.f86531OooOOO);
                return false;
            }
            C25345OooO0o.C25355OooOo0 c25355OooOo0 = (C25345OooO0o.C25355OooOo0) abstractC25373Oooo0OOOooO0Oo;
            Path path = new OooO0OO(c25355OooOo0.f86406OooOOOO).f86588OooO00o;
            Matrix matrix = c25355OooOo0.f86374OooOOO;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.f86610OooO0OO.union(rectF);
            return false;
        }

        @Override // o00o0OO0.C25392OooO0oO.OooO
        public final void OooO0O0(String str) {
            C25392OooO0oO c25392OooO0oO = C25392OooO0oO.this;
            if (c25392OooO0oO.o000oOoO()) {
                Rect rect = new Rect();
                c25392OooO0oO.f86571OooO0Oo.f86603OooO0Oo.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f86608OooO00o, this.f86609OooO0O0);
                this.f86610OooO0OO.union(rectF);
            }
            this.f86608OooO00o = c25392OooO0oO.f86571OooO0Oo.f86603OooO0Oo.measureText(str) + this.f86608OooO00o;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0oO$OooOO0 */
    public class OooOO0 extends OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f86612OooO00o = 0.0f;

        public OooOO0() {
        }

        @Override // o00o0OO0.C25392OooO0oO.OooO
        public final void OooO0O0(String str) {
            this.f86612OooO00o = C25392OooO0oO.this.f86571OooO0Oo.f86603OooO0Oo.measureText(str) + this.f86612OooO00o;
        }
    }

    public static int OooO(int i, float f) {
        int i2 = 255;
        int iRound = Math.round(((i >> 24) & 255) * f);
        if (iRound < 0) {
            i2 = 0;
        } else if (iRound <= 255) {
            i2 = iRound;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static void OooO00o(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, C25345OooO0o.InterfaceC25357OooOo0o interfaceC25357OooOo0o) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            interfaceC25357OooOo0o.lineTo(f6, f7);
            return;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        double radians = Math.toRadians(((double) f5) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d = ((double) (f - f6)) / 2.0d;
        double d2 = ((double) (f2 - f7)) / 2.0d;
        double d3 = (dSin * d2) + (dCos * d);
        double d4 = (d2 * dCos) + ((-dSin) * d);
        double d5 = fAbs * fAbs;
        double d6 = fAbs2 * fAbs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double dSqrt = Math.sqrt(d9) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d5 = fAbs * fAbs;
            d6 = fAbs2 * fAbs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d14) * d10;
        double d15 = fAbs;
        double d16 = d15 * d4;
        double d17 = fAbs2;
        double d18 = (d16 / d17) * dSqrt2;
        double d19 = dSqrt2 * (-((d17 * d3) / d15));
        double d20 = ((dCos * d18) - (dSin * d19)) + (((double) (f + f6)) / 2.0d);
        double dOooO00o = o000oOoO.OooO00o(dCos, d19, dSin * d18, ((double) (f2 + f7)) / 2.0d);
        double d21 = (d3 - d18) / d15;
        double d22 = (d4 - d19) / d17;
        double d23 = ((-d3) - d18) / d15;
        double d24 = ((-d4) - d19) / d17;
        double d25 = (d22 * d22) + (d21 * d21);
        double dAcos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = ((d22 * d24) + (d21 * d23)) / Math.sqrt(androidx.core.graphics.OooO00o.OooO00o(d24, d24, d23 * d23, d25));
        double dAcos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (dSqrt3 < -1.0d ? 3.141592653589793d : dSqrt3 > 1.0d ? 0.0d : Math.acos(dSqrt3));
        if (!z2 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z2 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d26 = dAcos2 % 6.283185307179586d;
        double d27 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d26) * 2.0d) / 3.141592653589793d);
        double d28 = d26 / ((double) iCeil);
        double d29 = d28 / 2.0d;
        double dSin2 = (Math.sin(d29) * 1.3333333333333333d) / (Math.cos(d29) + 1.0d);
        int i = iCeil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            double d30 = d27;
            double d31 = (((double) i2) * d28) + d30;
            double dCos2 = Math.cos(d31);
            double dSin3 = Math.sin(d31);
            fArr[i3] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i3 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d32 = d31 + d28;
            double dCos3 = Math.cos(d32);
            double d33 = d28;
            double dSin4 = Math.sin(d32);
            double d34 = dSin2;
            fArr[i3 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i3 + 3] = (float) (dSin4 - (d34 * dCos3));
            int i4 = i3 + 5;
            fArr[i3 + 4] = (float) dCos3;
            i3 += 6;
            fArr[i4] = (float) dSin4;
            i2++;
            d27 = d30;
            dSin2 = d34;
            d28 = d33;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d20, (float) dOooO00o);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i5 = 0; i5 < i; i5 += 6) {
            interfaceC25357OooOo0o.OooO00o(fArr[i5], fArr[i5 + 1], fArr[i5 + 2], fArr[i5 + 3], fArr[i5 + 4], fArr[i5 + 5]);
        }
    }

    public static C25345OooO0o.OooO00o OooO0OO(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C25345OooO0o.OooO00o(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r6 != 9) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f A[PHI: r5
      0x007f: PHI (r5v2 float) = (r5v1 float), (r5v3 float) binds: [B:32:0x0071, B:35:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix OooO0o0(C25345OooO0o.OooO00o oooO00o, C25345OooO0o.OooO00o oooO00o2, C25391OooO0o0 c25391OooO0o0) {
        C25391OooO0o0.OooO00o oooO00o3;
        float f;
        float f2;
        Matrix matrix = new Matrix();
        if (c25391OooO0o0 != null && (oooO00o3 = c25391OooO0o0.f86551OooO00o) != null) {
            float f3 = oooO00o.f86353OooO0OO / oooO00o2.f86353OooO0OO;
            float f4 = oooO00o.f86354OooO0Oo / oooO00o2.f86354OooO0Oo;
            float f5 = -oooO00o2.f86351OooO00o;
            float f6 = -oooO00o2.f86352OooO0O0;
            if (c25391OooO0o0.equals(C25391OooO0o0.f86549OooO0OO)) {
                matrix.preTranslate(oooO00o.f86351OooO00o, oooO00o.f86352OooO0O0);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float fMax = c25391OooO0o0.f86552OooO0O0 == C25391OooO0o0.OooO0O0.f86564OooOo ? Math.max(f3, f4) : Math.min(f3, f4);
            float f7 = oooO00o.f86353OooO0OO / fMax;
            float f8 = oooO00o.f86354OooO0Oo / fMax;
            int iOrdinal = oooO00o3.ordinal();
            if (iOrdinal == 2) {
                f = (oooO00o2.f86353OooO0OO - f7) / 2.0f;
                f5 -= f;
                switch (oooO00o3.ordinal()) {
                    case 4:
                    case 5:
                    case 6:
                        f2 = (oooO00o2.f86354OooO0Oo - f8) / 2.0f;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        f2 = oooO00o2.f86354OooO0Oo - f8;
                        break;
                    default:
                        matrix.preTranslate(oooO00o.f86351OooO00o, oooO00o.f86352OooO0O0);
                        matrix.preScale(fMax, fMax);
                        matrix.preTranslate(f5, f6);
                        break;
                }
                f6 -= f2;
                matrix.preTranslate(oooO00o.f86351OooO00o, oooO00o.f86352OooO0O0);
                matrix.preScale(fMax, fMax);
                matrix.preTranslate(f5, f6);
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                            }
                        }
                    }
                    f = (oooO00o2.f86353OooO0OO - f7) / 2.0f;
                    f5 -= f;
                    switch (oooO00o3.ordinal()) {
                    }
                    f6 -= f2;
                    matrix.preTranslate(oooO00o.f86351OooO00o, oooO00o.f86352OooO0O0);
                    matrix.preScale(fMax, fMax);
                    matrix.preTranslate(f5, f6);
                }
                f = oooO00o2.f86353OooO0OO - f7;
                f5 -= f;
                switch (oooO00o3.ordinal()) {
                }
                f6 -= f2;
                matrix.preTranslate(oooO00o.f86351OooO00o, oooO00o.f86352OooO0O0);
                matrix.preScale(fMax, fMax);
                matrix.preTranslate(f5, f6);
            }
        }
        return matrix;
    }

    public static Typeface OooO0oo(String str, Integer num, C25345OooO0o.C25363OooOooO.OooO0O0 oooO0O0) {
        int i;
        boolean z = oooO0O0 == C25345OooO0o.C25363OooOooO.OooO0O0.f86466OooOo;
        i = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i);
            case "serif":
                return Typeface.create(Typeface.SERIF, i);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i);
            default:
                return null;
        }
    }

    public static void OooOOOO(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void OooOOo(C25345OooO0o.C25369Oooo c25369Oooo, C25345OooO0o.C25369Oooo c25369Oooo2) {
        if (c25369Oooo.f86500OooOOO0 == null) {
            c25369Oooo.f86500OooOOO0 = c25369Oooo2.f86500OooOOO0;
        }
        if (c25369Oooo.f86499OooOOO == null) {
            c25369Oooo.f86499OooOOO = c25369Oooo2.f86499OooOOO;
        }
        if (c25369Oooo.f86501OooOOOO == null) {
            c25369Oooo.f86501OooOOOO = c25369Oooo2.f86501OooOOOO;
        }
        if (c25369Oooo.f86502OooOOOo == null) {
            c25369Oooo.f86502OooOOOo = c25369Oooo2.f86502OooOOOo;
        }
        if (c25369Oooo.f86503OooOOo0 == null) {
            c25369Oooo.f86503OooOOo0 = c25369Oooo2.f86503OooOOo0;
        }
    }

    public static void OooOOo0(C25345OooO0o.OooO oooO, String str) {
        C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo = oooO.f86520OooO00o.OooO0Oo(str);
        if (abstractC25373Oooo0OOOooO0Oo == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(abstractC25373Oooo0OOOooO0Oo instanceof C25345OooO0o.OooO)) {
            OooOOOO("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (abstractC25373Oooo0OOOooO0Oo == oooO) {
            OooOOOO("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        C25345OooO0o.OooO oooO2 = (C25345OooO0o.OooO) abstractC25373Oooo0OOOooO0Oo;
        if (oooO.f86346OooO == null) {
            oooO.f86346OooO = oooO2.f86346OooO;
        }
        if (oooO.f86348OooOO0 == null) {
            oooO.f86348OooOO0 = oooO2.f86348OooOO0;
        }
        if (oooO.f86349OooOO0O == null) {
            oooO.f86349OooOO0O = oooO2.f86349OooOO0O;
        }
        if (oooO.f86347OooO0oo.isEmpty()) {
            oooO.f86347OooO0oo = oooO2.f86347OooO0oo;
        }
        try {
            if (oooO instanceof C25345OooO0o.C25374Oooo0o0) {
                C25345OooO0o.C25374Oooo0o0 c25374Oooo0o0 = (C25345OooO0o.C25374Oooo0o0) oooO;
                C25345OooO0o.C25374Oooo0o0 c25374Oooo0o02 = (C25345OooO0o.C25374Oooo0o0) abstractC25373Oooo0OOOooO0Oo;
                if (c25374Oooo0o0.f86523OooOOO0 == null) {
                    c25374Oooo0o0.f86523OooOOO0 = c25374Oooo0o02.f86523OooOOO0;
                }
                if (c25374Oooo0o0.f86522OooOOO == null) {
                    c25374Oooo0o0.f86522OooOOO = c25374Oooo0o02.f86522OooOOO;
                }
                if (c25374Oooo0o0.f86524OooOOOO == null) {
                    c25374Oooo0o0.f86524OooOOOO = c25374Oooo0o02.f86524OooOOOO;
                }
                if (c25374Oooo0o0.f86525OooOOOo == null) {
                    c25374Oooo0o0.f86525OooOOOo = c25374Oooo0o02.f86525OooOOOo;
                }
            } else {
                OooOOo((C25345OooO0o.C25369Oooo) oooO, (C25345OooO0o.C25369Oooo) abstractC25373Oooo0OOOooO0Oo);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = oooO2.f86350OooOO0o;
        if (str2 != null) {
            OooOOo0(oooO, str2);
        }
    }

    public static void OooOOoo(C25345OooO0o.OooOo oooOo, String str) {
        C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo = oooOo.f86520OooO00o.OooO0Oo(str);
        if (abstractC25373Oooo0OOOooO0Oo == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(abstractC25373Oooo0OOOooO0Oo instanceof C25345OooO0o.OooOo)) {
            OooOOOO("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (abstractC25373Oooo0OOOooO0Oo == oooOo) {
            OooOOOO("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C25345OooO0o.OooOo oooOo2 = (C25345OooO0o.OooOo) abstractC25373Oooo0OOOooO0Oo;
        if (oooOo.f86398OooOOOo == null) {
            oooOo.f86398OooOOOo = oooOo2.f86398OooOOOo;
        }
        if (oooOo.f86400OooOOo0 == null) {
            oooOo.f86400OooOOo0 = oooOo2.f86400OooOOo0;
        }
        if (oooOo.f86399OooOOo == null) {
            oooOo.f86399OooOOo = oooOo2.f86399OooOOo;
        }
        if (oooOo.f86401OooOOoo == null) {
            oooOo.f86401OooOOoo = oooOo2.f86401OooOOoo;
        }
        if (oooOo.f86403OooOo00 == null) {
            oooOo.f86403OooOo00 = oooOo2.f86403OooOo00;
        }
        if (oooOo.f86402OooOo0 == null) {
            oooOo.f86402OooOo0 = oooOo2.f86402OooOo0;
        }
        if (oooOo.f86404OooOo0O == null) {
            oooOo.f86404OooOo0O = oooOo2.f86404OooOo0O;
        }
        if (oooOo.f86504OooO.isEmpty()) {
            oooOo.f86504OooO = oooOo2.f86504OooO;
        }
        if (oooOo.f86529OooOOOO == null) {
            oooOo.f86529OooOOOO = oooOo2.f86529OooOOOO;
        }
        if (oooOo.f86526OooOOO == null) {
            oooOo.f86526OooOOO = oooOo2.f86526OooOOO;
        }
        String str2 = oooOo2.f86405OooOo0o;
        if (str2 != null) {
            OooOOoo(oooOo, str2);
        }
    }

    public static boolean OooOo(C25345OooO0o.C25363OooOooO c25363OooOooO, long j) {
        return (c25363OooOooO.f86422OooOo0o & j) != 0;
    }

    public static Path OooOoOO(C25345OooO0o.C25359OooOoO0 c25359OooOoO0) {
        Path path = new Path();
        float[] fArr = c25359OooOoO0.f86413OooOOOO;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c25359OooOoO0.f86413OooOOOO;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c25359OooOoO0 instanceof C25345OooO0o.C25358OooOoO) {
            path.close();
        }
        if (c25359OooOoO0.f86514OooO0oo == null) {
            c25359OooOoO0.f86514OooO0oo = OooO0OO(path);
        }
        return path;
    }

    public static void Oooo0oO(C19699OooO0oO c19699OooO0oO, boolean z, C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO) {
        int i;
        C25345OooO0o.C25363OooOooO c25363OooOooO = c19699OooO0oO.f86600OooO00o;
        float fFloatValue = (z ? c25363OooOooO.f86423OooOoO : c25363OooOooO.f86427OooOoo0).floatValue();
        if (abstractC25375Oooo0oO instanceof C25345OooO0o.C25347OooO0o0) {
            i = ((C25345OooO0o.C25347OooO0o0) abstractC25375Oooo0oO).f86366OooOo0o;
        } else if (!(abstractC25375Oooo0oO instanceof C25345OooO0o.C19697OooO0o)) {
            return;
        } else {
            i = c19699OooO0oO.f86600OooO00o.f86435Oooo0O0.f86366OooOo0o;
        }
        int iOooO = OooO(i, fFloatValue);
        if (z) {
            c19699OooO0oO.f86603OooO0Oo.setColor(iOooO);
        } else {
            c19699OooO0oO.f86605OooO0o0.setColor(iOooO);
        }
    }

    public final Path OooO0O0(C25345OooO0o.AbstractC25372Oooo0O0 abstractC25372Oooo0O0, C25345OooO0o.OooO00o oooO00o) {
        Path pathOooOooO;
        C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo = abstractC25372Oooo0O0.f86520OooO00o.OooO0Oo(this.f86571OooO0Oo.f86600OooO00o.f86450OoooOoo);
        if (abstractC25373Oooo0OOOooO0Oo == null) {
            OooOOOO("ClipPath reference '%s' not found", this.f86571OooO0Oo.f86600OooO00o.f86450OoooOoo);
            return null;
        }
        C25345OooO0o.C25346OooO0Oo c25346OooO0Oo = (C25345OooO0o.C25346OooO0Oo) abstractC25373Oooo0OOOooO0Oo;
        this.f86573OooO0o0.push(this.f86571OooO0Oo);
        this.f86571OooO0Oo = OooOo00(c25346OooO0Oo);
        Boolean bool = c25346OooO0Oo.f86362OooOOOO;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(oooO00o.f86351OooO00o, oooO00o.f86352OooO0O0);
            matrix.preScale(oooO00o.f86353OooO0OO, oooO00o.f86354OooO0Oo);
        }
        Matrix matrix2 = c25346OooO0Oo.f86375OooOOO;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C25345OooO0o.Oooo0o oooo0o : c25346OooO0Oo.f86504OooO) {
            if ((oooo0o instanceof C25345OooO0o.AbstractC25372Oooo0O0) && (pathOooOooO = OooOooO((C25345OooO0o.AbstractC25372Oooo0O0) oooo0o, true)) != null) {
                path.op(pathOooOooO, Path.Op.UNION);
            }
        }
        if (this.f86571OooO0Oo.f86600OooO00o.f86450OoooOoo != null) {
            if (c25346OooO0Oo.f86514OooO0oo == null) {
                c25346OooO0Oo.f86514OooO0oo = OooO0OO(path);
            }
            Path pathOooO0O0 = OooO0O0(c25346OooO0Oo, c25346OooO0Oo.f86514OooO0oo);
            if (pathOooO0O0 != null) {
                path.op(pathOooO0O0, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f86571OooO0Oo = this.f86573OooO0o0.pop();
        return path;
    }

    public final float OooO0Oo(C25345OooO0o.AbstractC25383OoooOOo abstractC25383OoooOOo) {
        OooOO0 oooOO02 = new OooOO0();
        OooOOO(abstractC25383OoooOOo, oooOO02);
        return oooOO02.f86612OooO00o;
    }

    public final void OooO0o(C25345OooO0o.AbstractC25372Oooo0O0 abstractC25372Oooo0O0, C25345OooO0o.OooO00o oooO00o) {
        Path pathOooO0O0;
        if (this.f86571OooO0Oo.f86600OooO00o.f86450OoooOoo == null || (pathOooO0O0 = OooO0O0(abstractC25372Oooo0O0, oooO00o)) == null) {
            return;
        }
        this.f86568OooO00o.clipPath(pathOooO0O0);
    }

    public final void OooO0oO(C25345OooO0o.AbstractC25372Oooo0O0 abstractC25372Oooo0O0) {
        C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO = this.f86571OooO0Oo.f86600OooO00o.f86421OooOo;
        if (abstractC25375Oooo0oO instanceof C25345OooO0o.OooOo00) {
            OooOO0(true, abstractC25372Oooo0O0.f86514OooO0oo, (C25345OooO0o.OooOo00) abstractC25375Oooo0oO);
        }
        C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO2 = this.f86571OooO0Oo.f86600OooO00o.f86425OooOoOO;
        if (abstractC25375Oooo0oO2 instanceof C25345OooO0o.OooOo00) {
            OooOO0(false, abstractC25372Oooo0O0.f86514OooO0oo, (C25345OooO0o.OooOo00) abstractC25375Oooo0oO2);
        }
    }

    public final void OooOO0(boolean z, C25345OooO0o.OooO00o oooO00o, C25345OooO0o.OooOo00 oooOo00) {
        float fOooO0OO;
        float f;
        float fOooO0OO2;
        float f2;
        float f3;
        float fOooO0OO3;
        float fOooO0OO4;
        float f4;
        float f5;
        C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo = this.f86570OooO0OO.OooO0Oo(oooOo00.f86408OooOo0o);
        if (abstractC25373Oooo0OOOooO0Oo == null) {
            OooOOOO("%s reference '%s' not found", z ? "Fill" : "Stroke", oooOo00.f86408OooOo0o);
            C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO = oooOo00.f86407OooOo;
            if (abstractC25375Oooo0oO != null) {
                Oooo0oO(this.f86571OooO0Oo, z, abstractC25375Oooo0oO);
                return;
            } else if (z) {
                this.f86571OooO0Oo.f86601OooO0O0 = false;
                return;
            } else {
                this.f86571OooO0Oo.f86602OooO0OO = false;
                return;
            }
        }
        boolean z2 = abstractC25373Oooo0OOOooO0Oo instanceof C25345OooO0o.C25374Oooo0o0;
        C25345OooO0o.OooOO0 oooOO02 = C25345OooO0o.OooOO0.f86371OooOo;
        C25345OooO0o.OooOO0 oooOO03 = C25345OooO0o.OooOO0.f86372OooOo0o;
        C25345OooO0o.C25347OooO0o0 c25347OooO0o0 = C25345OooO0o.C25347OooO0o0.f86364OooOo;
        if (z2) {
            C25345OooO0o.C25374Oooo0o0 c25374Oooo0o0 = (C25345OooO0o.C25374Oooo0o0) abstractC25373Oooo0OOOooO0Oo;
            String str = c25374Oooo0o0.f86350OooOO0o;
            if (str != null) {
                OooOOo0(c25374Oooo0o0, str);
            }
            Boolean bool = c25374Oooo0o0.f86346OooO;
            boolean z3 = bool != null && bool.booleanValue();
            C19699OooO0oO c19699OooO0oO = this.f86571OooO0Oo;
            Paint paint = z ? c19699OooO0oO.f86603OooO0Oo : c19699OooO0oO.f86605OooO0o0;
            if (z3) {
                C19699OooO0oO c19699OooO0oO2 = this.f86571OooO0Oo;
                f2 = 256.0f;
                C25345OooO0o.OooO00o oooO00o2 = c19699OooO0oO2.f86606OooO0oO;
                if (oooO00o2 == null) {
                    oooO00o2 = c19699OooO0oO2.f86604OooO0o;
                }
                C25345OooO0o.OooOOOO oooOOOO = c25374Oooo0o0.f86523OooOOO0;
                float fOooO0Oo = oooOOOO != null ? oooOOOO.OooO0Oo(this) : 0.0f;
                C25345OooO0o.OooOOOO oooOOOO2 = c25374Oooo0o0.f86522OooOOO;
                fOooO0OO3 = oooOOOO2 != null ? oooOOOO2.OooO0o0(this) : 0.0f;
                f3 = 0.0f;
                C25345OooO0o.OooOOOO oooOOOO3 = c25374Oooo0o0.f86524OooOOOO;
                float fOooO0Oo2 = oooOOOO3 != null ? oooOOOO3.OooO0Oo(this) : oooO00o2.f86353OooO0OO;
                C25345OooO0o.OooOOOO oooOOOO4 = c25374Oooo0o0.f86525OooOOOo;
                f5 = fOooO0Oo2;
                f4 = fOooO0Oo;
                fOooO0OO4 = oooOOOO4 != null ? oooOOOO4.OooO0o0(this) : 0.0f;
            } else {
                f2 = 256.0f;
                f3 = 0.0f;
                C25345OooO0o.OooOOOO oooOOOO5 = c25374Oooo0o0.f86523OooOOO0;
                float fOooO0OO5 = oooOOOO5 != null ? oooOOOO5.OooO0OO(this, 1.0f) : 0.0f;
                C25345OooO0o.OooOOOO oooOOOO6 = c25374Oooo0o0.f86522OooOOO;
                fOooO0OO3 = oooOOOO6 != null ? oooOOOO6.OooO0OO(this, 1.0f) : 0.0f;
                C25345OooO0o.OooOOOO oooOOOO7 = c25374Oooo0o0.f86524OooOOOO;
                float fOooO0OO6 = oooOOOO7 != null ? oooOOOO7.OooO0OO(this, 1.0f) : 1.0f;
                C25345OooO0o.OooOOOO oooOOOO8 = c25374Oooo0o0.f86525OooOOOo;
                fOooO0OO4 = oooOOOO8 != null ? oooOOOO8.OooO0OO(this, 1.0f) : 0.0f;
                f4 = fOooO0OO5;
                f5 = fOooO0OO6;
            }
            float f6 = fOooO0OO3;
            Oooo();
            this.f86571OooO0Oo = OooOo00(c25374Oooo0o0);
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(oooO00o.f86351OooO00o, oooO00o.f86352OooO0O0);
                matrix.preScale(oooO00o.f86353OooO0OO, oooO00o.f86354OooO0Oo);
            }
            Matrix matrix2 = c25374Oooo0o0.f86348OooOO0;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c25374Oooo0o0.f86347OooO0oo.size();
            if (size == 0) {
                Oooo0oo();
                if (z) {
                    this.f86571OooO0Oo.f86601OooO0O0 = false;
                    return;
                } else {
                    this.f86571OooO0Oo.f86602OooO0OO = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = c25374Oooo0o0.f86347OooO0oo.iterator();
            int i = 0;
            float f7 = -1.0f;
            while (it.hasNext()) {
                C25345OooO0o.C25361OooOoo c25361OooOoo = (C25345OooO0o.C25361OooOoo) ((C25345OooO0o.Oooo0o) it.next());
                Float f8 = c25361OooOoo.f86420OooO0oo;
                float fFloatValue = f8 != null ? f8.floatValue() : f3;
                if (i == 0 || fFloatValue >= f7) {
                    fArr[i] = fFloatValue;
                    f7 = fFloatValue;
                } else {
                    fArr[i] = f7;
                }
                Oooo();
                OoooO(c25361OooOoo, this.f86571OooO0Oo);
                C25345OooO0o.C25363OooOooO c25363OooOooO = this.f86571OooO0Oo.f86600OooO00o;
                C25345OooO0o.C25347OooO0o0 c25347OooO0o02 = (C25345OooO0o.C25347OooO0o0) c25363OooOooO.f86448OoooOo0;
                if (c25347OooO0o02 == null) {
                    c25347OooO0o02 = c25347OooO0o0;
                }
                iArr[i] = OooO(c25347OooO0o02.f86366OooOo0o, c25363OooOooO.f86449OoooOoO.floatValue());
                i++;
                Oooo0oo();
            }
            if ((f4 == f5 && f6 == fOooO0OO4) || size == 1) {
                Oooo0oo();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            C25345OooO0o.OooOO0 oooOO04 = c25374Oooo0o0.f86349OooOO0O;
            if (oooOO04 != null) {
                if (oooOO04 == oooOO03) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (oooOO04 == oooOO02) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            Oooo0oo();
            LinearGradient linearGradient = new LinearGradient(f4, f6, f5, fOooO0OO4, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (this.f86571OooO0Oo.f86600OooO00o.f86423OooOoO.floatValue() * f2);
            paint.setAlpha(iFloatValue < 0 ? 0 : iFloatValue > 255 ? 255 : iFloatValue);
            return;
        }
        if (!(abstractC25373Oooo0OOOooO0Oo instanceof C25345OooO0o.C25369Oooo)) {
            if (abstractC25373Oooo0OOOooO0Oo instanceof C25345OooO0o.C25362OooOoo0) {
                C25345OooO0o.C25362OooOoo0 c25362OooOoo0 = (C25345OooO0o.C25362OooOoo0) abstractC25373Oooo0OOOooO0Oo;
                if (z) {
                    if (OooOo(c25362OooOoo0.f86518OooO0o0, 2147483648L)) {
                        C19699OooO0oO c19699OooO0oO3 = this.f86571OooO0Oo;
                        C25345OooO0o.C25363OooOooO c25363OooOooO2 = c19699OooO0oO3.f86600OooO00o;
                        C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO2 = c25362OooOoo0.f86518OooO0o0.f86453OooooO0;
                        c25363OooOooO2.f86421OooOo = abstractC25375Oooo0oO2;
                        c19699OooO0oO3.f86601OooO0O0 = abstractC25375Oooo0oO2 != null;
                    }
                    if (OooOo(c25362OooOoo0.f86518OooO0o0, 4294967296L)) {
                        this.f86571OooO0Oo.f86600OooO00o.f86423OooOoO = c25362OooOoo0.f86518OooO0o0.f86454OooooOO;
                    }
                    if (OooOo(c25362OooOoo0.f86518OooO0o0, 6442450944L)) {
                        C19699OooO0oO c19699OooO0oO4 = this.f86571OooO0Oo;
                        Oooo0oO(c19699OooO0oO4, z, c19699OooO0oO4.f86600OooO00o.f86421OooOo);
                        return;
                    }
                    return;
                }
                if (OooOo(c25362OooOoo0.f86518OooO0o0, 2147483648L)) {
                    C19699OooO0oO c19699OooO0oO5 = this.f86571OooO0Oo;
                    C25345OooO0o.C25363OooOooO c25363OooOooO3 = c19699OooO0oO5.f86600OooO00o;
                    C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO3 = c25362OooOoo0.f86518OooO0o0.f86453OooooO0;
                    c25363OooOooO3.f86425OooOoOO = abstractC25375Oooo0oO3;
                    c19699OooO0oO5.f86602OooO0OO = abstractC25375Oooo0oO3 != null;
                }
                if (OooOo(c25362OooOoo0.f86518OooO0o0, 4294967296L)) {
                    this.f86571OooO0Oo.f86600OooO00o.f86427OooOoo0 = c25362OooOoo0.f86518OooO0o0.f86454OooooOO;
                }
                if (OooOo(c25362OooOoo0.f86518OooO0o0, 6442450944L)) {
                    C19699OooO0oO c19699OooO0oO6 = this.f86571OooO0Oo;
                    Oooo0oO(c19699OooO0oO6, z, c19699OooO0oO6.f86600OooO00o.f86425OooOoOO);
                    return;
                }
                return;
            }
            return;
        }
        C25345OooO0o.C25369Oooo c25369Oooo = (C25345OooO0o.C25369Oooo) abstractC25373Oooo0OOOooO0Oo;
        String str2 = c25369Oooo.f86350OooOO0o;
        if (str2 != null) {
            OooOOo0(c25369Oooo, str2);
        }
        Boolean bool2 = c25369Oooo.f86346OooO;
        boolean z4 = bool2 != null && bool2.booleanValue();
        C19699OooO0oO c19699OooO0oO7 = this.f86571OooO0Oo;
        Paint paint2 = z ? c19699OooO0oO7.f86603OooO0Oo : c19699OooO0oO7.f86605OooO0o0;
        if (z4) {
            C25345OooO0o.OooOOOO oooOOOO9 = new C25345OooO0o.OooOOOO(50.0f, C25345OooO0o.EnumC25388Ooooo0o.f86542OooOoO0);
            C25345OooO0o.OooOOOO oooOOOO10 = c25369Oooo.f86500OooOOO0;
            float fOooO0Oo3 = oooOOOO10 != null ? oooOOOO10.OooO0Oo(this) : oooOOOO9.OooO0Oo(this);
            C25345OooO0o.OooOOOO oooOOOO11 = c25369Oooo.f86499OooOOO;
            fOooO0OO = oooOOOO11 != null ? oooOOOO11.OooO0o0(this) : oooOOOO9.OooO0o0(this);
            C25345OooO0o.OooOOOO oooOOOO12 = c25369Oooo.f86501OooOOOO;
            fOooO0OO2 = oooOOOO12 != null ? oooOOOO12.OooO0O0(this) : oooOOOO9.OooO0O0(this);
            f = fOooO0Oo3;
        } else {
            C25345OooO0o.OooOOOO oooOOOO13 = c25369Oooo.f86500OooOOO0;
            float fOooO0OO7 = oooOOOO13 != null ? oooOOOO13.OooO0OO(this, 1.0f) : 0.5f;
            C25345OooO0o.OooOOOO oooOOOO14 = c25369Oooo.f86499OooOOO;
            fOooO0OO = oooOOOO14 != null ? oooOOOO14.OooO0OO(this, 1.0f) : 0.5f;
            C25345OooO0o.OooOOOO oooOOOO15 = c25369Oooo.f86501OooOOOO;
            f = fOooO0OO7;
            fOooO0OO2 = oooOOOO15 != null ? oooOOOO15.OooO0OO(this, 1.0f) : 0.5f;
        }
        float f9 = fOooO0OO;
        Oooo();
        this.f86571OooO0Oo = OooOo00(c25369Oooo);
        Matrix matrix3 = new Matrix();
        if (!z4) {
            matrix3.preTranslate(oooO00o.f86351OooO00o, oooO00o.f86352OooO0O0);
            matrix3.preScale(oooO00o.f86353OooO0OO, oooO00o.f86354OooO0Oo);
        }
        Matrix matrix4 = c25369Oooo.f86348OooOO0;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = c25369Oooo.f86347OooO0oo.size();
        if (size2 == 0) {
            Oooo0oo();
            if (z) {
                this.f86571OooO0Oo.f86601OooO0O0 = false;
                return;
            } else {
                this.f86571OooO0Oo.f86602OooO0OO = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = c25369Oooo.f86347OooO0oo.iterator();
        int i2 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            C25345OooO0o.C25361OooOoo c25361OooOoo2 = (C25345OooO0o.C25361OooOoo) ((C25345OooO0o.Oooo0o) it2.next());
            Float f11 = c25361OooOoo2.f86420OooO0oo;
            float fFloatValue2 = f11 != null ? f11.floatValue() : 0.0f;
            if (i2 == 0 || fFloatValue2 >= f10) {
                fArr2[i2] = fFloatValue2;
                f10 = fFloatValue2;
            } else {
                fArr2[i2] = f10;
            }
            Oooo();
            OoooO(c25361OooOoo2, this.f86571OooO0Oo);
            C25345OooO0o.C25363OooOooO c25363OooOooO4 = this.f86571OooO0Oo.f86600OooO00o;
            C25345OooO0o.C25347OooO0o0 c25347OooO0o03 = (C25345OooO0o.C25347OooO0o0) c25363OooOooO4.f86448OoooOo0;
            if (c25347OooO0o03 == null) {
                c25347OooO0o03 = c25347OooO0o0;
            }
            iArr2[i2] = OooO(c25347OooO0o03.f86366OooOo0o, c25363OooOooO4.f86449OoooOoO.floatValue());
            i2++;
            Oooo0oo();
        }
        if (fOooO0OO2 == 0.0f || size2 == 1) {
            Oooo0oo();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        C25345OooO0o.OooOO0 oooOO05 = c25369Oooo.f86349OooOO0O;
        if (oooOO05 != null) {
            if (oooOO05 == oooOO03) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (oooOO05 == oooOO02) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        Oooo0oo();
        RadialGradient radialGradient = new RadialGradient(f, f9, fOooO0OO2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (this.f86571OooO0Oo.f86600OooO00o.f86423OooOoO.floatValue() * 256.0f);
        if (iFloatValue2 < 0) {
            iFloatValue2 = 0;
        } else if (iFloatValue2 > 255) {
            iFloatValue2 = 255;
        }
        paint2.setAlpha(iFloatValue2);
    }

    public final boolean OooOO0O() {
        Boolean bool = this.f86571OooO0Oo.f86600OooO00o.f86446OoooOOO;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOO0o(C25345OooO0o.AbstractC25372Oooo0O0 abstractC25372Oooo0O0, Path path) {
        char c;
        float fOooO0Oo;
        float fOooO0o0;
        float fOooO0o02;
        float fOooO0Oo2;
        char c2;
        float f;
        float f2;
        C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO = this.f86571OooO0Oo.f86600OooO00o.f86421OooOo;
        boolean z = abstractC25375Oooo0oO instanceof C25345OooO0o.OooOo00;
        Canvas canvas = this.f86568OooO00o;
        if (z) {
            C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo = this.f86570OooO0OO.OooO0Oo(((C25345OooO0o.OooOo00) abstractC25375Oooo0oO).f86408OooOo0o);
            if (abstractC25373Oooo0OOOooO0Oo instanceof C25345OooO0o.OooOo) {
                C25345OooO0o.OooOo oooOo = (C25345OooO0o.OooOo) abstractC25373Oooo0OOOooO0Oo;
                Boolean bool = oooOo.f86398OooOOOo;
                boolean z2 = bool != null && bool.booleanValue();
                String str = oooOo.f86405OooOo0o;
                if (str != null) {
                    OooOOoo(oooOo, str);
                }
                if (z2) {
                    C25345OooO0o.OooOOOO oooOOOO = oooOo.f86401OooOOoo;
                    fOooO0Oo = oooOOOO != null ? oooOOOO.OooO0Oo(this) : 0.0f;
                    C25345OooO0o.OooOOOO oooOOOO2 = oooOo.f86403OooOo00;
                    fOooO0o02 = oooOOOO2 != null ? oooOOOO2.OooO0o0(this) : 0.0f;
                    C25345OooO0o.OooOOOO oooOOOO3 = oooOo.f86402OooOo0;
                    fOooO0Oo2 = oooOOOO3 != null ? oooOOOO3.OooO0Oo(this) : 0.0f;
                    C25345OooO0o.OooOOOO oooOOOO4 = oooOo.f86404OooOo0O;
                    fOooO0o0 = oooOOOO4 != null ? oooOOOO4.OooO0o0(this) : 0.0f;
                    c = 0;
                } else {
                    C25345OooO0o.OooOOOO oooOOOO5 = oooOo.f86401OooOOoo;
                    float fOooO0OO = oooOOOO5 != null ? oooOOOO5.OooO0OO(this, 1.0f) : 0.0f;
                    C25345OooO0o.OooOOOO oooOOOO6 = oooOo.f86403OooOo00;
                    float fOooO0OO2 = oooOOOO6 != null ? oooOOOO6.OooO0OO(this, 1.0f) : 0.0f;
                    C25345OooO0o.OooOOOO oooOOOO7 = oooOo.f86402OooOo0;
                    float fOooO0OO3 = oooOOOO7 != null ? oooOOOO7.OooO0OO(this, 1.0f) : 0.0f;
                    C25345OooO0o.OooOOOO oooOOOO8 = oooOo.f86404OooOo0O;
                    float fOooO0OO4 = oooOOOO8 != null ? oooOOOO8.OooO0OO(this, 1.0f) : 0.0f;
                    C25345OooO0o.OooO00o oooO00o = abstractC25372Oooo0O0.f86514OooO0oo;
                    float f3 = oooO00o.f86351OooO00o;
                    c = 0;
                    float f4 = oooO00o.f86353OooO0OO;
                    fOooO0Oo = (fOooO0OO * f4) + f3;
                    float f5 = oooO00o.f86352OooO0O0;
                    float f6 = oooO00o.f86354OooO0Oo;
                    float f7 = f4 * fOooO0OO3;
                    fOooO0o0 = fOooO0OO4 * f6;
                    fOooO0o02 = (fOooO0OO2 * f6) + f5;
                    fOooO0Oo2 = f7;
                }
                if (fOooO0Oo2 == 0.0f || fOooO0o0 == 0.0f) {
                    return;
                }
                C25391OooO0o0 c25391OooO0o0 = oooOo.f86526OooOOO;
                if (c25391OooO0o0 == null) {
                    c25391OooO0o0 = C25391OooO0o0.f86550OooO0Oo;
                }
                Oooo();
                canvas.clipPath(path);
                C19699OooO0oO c19699OooO0oO = new C19699OooO0oO();
                OoooO0O(c19699OooO0oO, C25345OooO0o.C25363OooOooO.OooO00o());
                c19699OooO0oO.f86600OooO00o.f86442OoooO0 = Boolean.FALSE;
                OooOo0(oooOo, c19699OooO0oO);
                this.f86571OooO0Oo = c19699OooO0oO;
                C25345OooO0o.OooO00o oooO00o2 = abstractC25372Oooo0O0.f86514OooO0oo;
                Matrix matrix = oooOo.f86399OooOOo;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (oooOo.f86399OooOOo.invert(matrix2)) {
                        C25345OooO0o.OooO00o oooO00o3 = abstractC25372Oooo0O0.f86514OooO0oo;
                        float f8 = oooO00o3.f86351OooO00o;
                        float f9 = oooO00o3.f86352OooO0O0;
                        float fOooO00o = oooO00o3.OooO00o();
                        c2 = 1;
                        C25345OooO0o.OooO00o oooO00o4 = abstractC25372Oooo0O0.f86514OooO0oo;
                        float f10 = oooO00o4.f86352OooO0O0;
                        float fOooO00o2 = oooO00o4.OooO00o();
                        float fOooO0O0 = abstractC25372Oooo0O0.f86514OooO0oo.OooO0O0();
                        C25345OooO0o.OooO00o oooO00o5 = abstractC25372Oooo0O0.f86514OooO0oo;
                        float f11 = oooO00o5.f86351OooO00o;
                        float fOooO0O02 = oooO00o5.OooO0O0();
                        float[] fArr = new float[8];
                        fArr[c] = f8;
                        fArr[1] = f9;
                        fArr[2] = fOooO00o;
                        fArr[3] = f10;
                        fArr[4] = fOooO00o2;
                        fArr[5] = fOooO0O0;
                        fArr[6] = f11;
                        fArr[7] = fOooO0O02;
                        matrix2.mapPoints(fArr);
                        float f12 = fArr[c];
                        float f13 = fArr[1];
                        RectF rectF = new RectF(f12, f13, f12, f13);
                        for (int i = 2; i <= 6; i += 2) {
                            float f14 = fArr[i];
                            if (f14 < rectF.left) {
                                rectF.left = f14;
                            }
                            if (f14 > rectF.right) {
                                rectF.right = f14;
                            }
                            float f15 = fArr[i + 1];
                            if (f15 < rectF.top) {
                                rectF.top = f15;
                            }
                            if (f15 > rectF.bottom) {
                                rectF.bottom = f15;
                            }
                        }
                        float f16 = rectF.left;
                        float f17 = rectF.top;
                        oooO00o2 = new C25345OooO0o.OooO00o(f16, f17, rectF.right - f16, rectF.bottom - f17);
                    } else {
                        c2 = 1;
                    }
                }
                float fFloor = (((float) Math.floor((oooO00o2.f86351OooO00o - fOooO0Oo) / fOooO0Oo2)) * fOooO0Oo2) + fOooO0Oo;
                float fOooO00o3 = oooO00o2.OooO00o();
                float fOooO0O03 = oooO00o2.OooO0O0();
                C25345OooO0o.OooO00o oooO00o6 = new C25345OooO0o.OooO00o(0.0f, 0.0f, fOooO0Oo2, fOooO0o0);
                boolean zOooo000 = Oooo000();
                for (float fFloor2 = (((float) Math.floor((oooO00o2.f86352OooO0O0 - fOooO0o02) / fOooO0o0)) * fOooO0o0) + fOooO0o02; fFloor2 < fOooO0O03; fFloor2 += fOooO0o0) {
                    float f18 = fFloor;
                    while (f18 < fOooO00o3) {
                        oooO00o6.f86351OooO00o = f18;
                        oooO00o6.f86352OooO0O0 = fFloor2;
                        Oooo();
                        if (this.f86571OooO0Oo.f86600OooO00o.f86442OoooO0.booleanValue()) {
                            f = fOooO0O03;
                            f2 = fFloor;
                        } else {
                            f = fOooO0O03;
                            f2 = fFloor;
                            Oooo0o(oooO00o6.f86351OooO00o, oooO00o6.f86352OooO0O0, oooO00o6.f86353OooO0OO, oooO00o6.f86354OooO0Oo);
                        }
                        C25345OooO0o.OooO00o oooO00o7 = oooOo.f86529OooOOOO;
                        if (oooO00o7 != null) {
                            canvas.concat(OooO0o0(oooO00o6, oooO00o7, c25391OooO0o0));
                        } else {
                            Boolean bool2 = oooOo.f86400OooOOo0;
                            char c3 = (bool2 == null || bool2.booleanValue()) ? c2 : c;
                            canvas.translate(f18, fFloor2);
                            if (c3 == 0) {
                                C25345OooO0o.OooO00o oooO00o8 = abstractC25372Oooo0O0.f86514OooO0oo;
                                canvas.scale(oooO00o8.f86353OooO0OO, oooO00o8.f86354OooO0Oo);
                            }
                        }
                        Iterator it = oooOo.f86504OooO.iterator();
                        while (it.hasNext()) {
                            Oooo00o((C25345OooO0o.Oooo0o) it.next());
                        }
                        Oooo0oo();
                        f18 += fOooO0Oo2;
                        fOooO0O03 = f;
                        fFloor = f2;
                    }
                }
                if (zOooo000) {
                    OooOooo(oooOo.f86514OooO0oo);
                }
                Oooo0oo();
                return;
            }
        }
        canvas.drawPath(path, this.f86571OooO0Oo.f86603OooO0Oo);
    }

    public final void OooOOO(C25345OooO0o.AbstractC25383OoooOOo abstractC25383OoooOOo, OooO oooO) {
        float f;
        float fOooO0o0;
        float fOooO0Oo;
        C25345OooO0o.C25363OooOooO.EnumC19698OooO0o enumC19698OooO0oOooOo0O;
        if (OooOO0O()) {
            Iterator it = abstractC25383OoooOOo.f86504OooO.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C25345OooO0o.Oooo0o oooo0o = (C25345OooO0o.Oooo0o) it.next();
                if (oooo0o instanceof C25345OooO0o.C25387Ooooo00) {
                    oooO.OooO0O0(OoooO00(((C25345OooO0o.C25387Ooooo00) oooo0o).f86538OooO0OO, z, !it.hasNext()));
                } else if (oooO.OooO00o((C25345OooO0o.AbstractC25383OoooOOo) oooo0o)) {
                    boolean z2 = oooo0o instanceof C25345OooO0o.C25384OoooOo0;
                    C25345OooO0o.C25363OooOooO.EnumC19698OooO0o enumC19698OooO0o = C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86478OooOo;
                    C25345OooO0o.C25363OooOooO.EnumC19698OooO0o enumC19698OooO0o2 = C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86479OooOo0o;
                    if (z2) {
                        Oooo();
                        C25345OooO0o.C25384OoooOo0 c25384OoooOo0 = (C25345OooO0o.C25384OoooOo0) oooo0o;
                        OoooO(c25384OoooOo0, this.f86571OooO0Oo);
                        if (OooOO0O() && o000oOoO()) {
                            C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo = c25384OoooOo0.f86520OooO00o.OooO0Oo(c25384OoooOo0.f86531OooOOO);
                            if (abstractC25373Oooo0OOOooO0Oo == null) {
                                OooOOOO("TextPath reference '%s' not found", c25384OoooOo0.f86531OooOOO);
                            } else {
                                C25345OooO0o.C25355OooOo0 c25355OooOo0 = (C25345OooO0o.C25355OooOo0) abstractC25373Oooo0OOOooO0Oo;
                                Path path = new OooO0OO(c25355OooOo0.f86406OooOOOO).f86588OooO00o;
                                Matrix matrix = c25355OooOo0.f86374OooOOO;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                C25345OooO0o.OooOOOO oooOOOO = c25384OoooOo0.f86532OooOOOO;
                                fOooO0o0 = oooOOOO != null ? oooOOOO.OooO0OO(this, pathMeasure.getLength()) : 0.0f;
                                C25345OooO0o.C25363OooOooO.EnumC19698OooO0o enumC19698OooO0oOooOo0O2 = OooOo0O();
                                if (enumC19698OooO0oOooOo0O2 != enumC19698OooO0o2) {
                                    float fOooO0Oo2 = OooO0Oo(c25384OoooOo0);
                                    if (enumC19698OooO0oOooOo0O2 == enumC19698OooO0o) {
                                        fOooO0Oo2 /= 2.0f;
                                    }
                                    fOooO0o0 -= fOooO0Oo2;
                                }
                                OooO0oO((C25345OooO0o.AbstractC25372Oooo0O0) c25384OoooOo0.f86533OooOOOo);
                                boolean zOooo000 = Oooo000();
                                OooOOO(c25384OoooOo0, new C25393OooO0Oo(path, fOooO0o0));
                                if (zOooo000) {
                                    OooOooo(c25384OoooOo0.f86514OooO0oo);
                                }
                            }
                        }
                        Oooo0oo();
                    } else if (oooo0o instanceof C25345OooO0o.C25381OoooOO0) {
                        Oooo();
                        C25345OooO0o.C25381OoooOO0 c25381OoooOO0 = (C25345OooO0o.C25381OoooOO0) oooo0o;
                        OoooO(c25381OoooOO0, this.f86571OooO0Oo);
                        if (OooOO0O()) {
                            ArrayList arrayList = c25381OoooOO0.f86534OooOOO;
                            boolean z3 = arrayList != null && arrayList.size() > 0;
                            boolean z4 = oooO instanceof C25394OooO0o0;
                            if (z4) {
                                float fOooO0Oo3 = !z3 ? ((C25394OooO0o0) oooO).f86597OooO00o : ((C25345OooO0o.OooOOOO) c25381OoooOO0.f86534OooOOO.get(0)).OooO0Oo(this);
                                ArrayList arrayList2 = c25381OoooOO0.f86535OooOOOO;
                                fOooO0o0 = (arrayList2 == null || arrayList2.size() == 0) ? ((C25394OooO0o0) oooO).f86598OooO0O0 : ((C25345OooO0o.OooOOOO) c25381OoooOO0.f86535OooOOOO.get(0)).OooO0o0(this);
                                ArrayList arrayList3 = c25381OoooOO0.f86536OooOOOo;
                                fOooO0Oo = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C25345OooO0o.OooOOOO) c25381OoooOO0.f86536OooOOOo.get(0)).OooO0Oo(this);
                                ArrayList arrayList4 = c25381OoooOO0.f86537OooOOo0;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fOooO0o0 = ((C25345OooO0o.OooOOOO) c25381OoooOO0.f86537OooOOo0.get(0)).OooO0o0(this);
                                }
                                float f2 = fOooO0Oo3;
                                f = fOooO0o0;
                                fOooO0o0 = f2;
                            } else {
                                f = 0.0f;
                                fOooO0o0 = 0.0f;
                                fOooO0Oo = 0.0f;
                            }
                            if (z3 && (enumC19698OooO0oOooOo0O = OooOo0O()) != enumC19698OooO0o2) {
                                float fOooO0Oo4 = OooO0Oo(c25381OoooOO0);
                                if (enumC19698OooO0oOooOo0O == enumC19698OooO0o) {
                                    fOooO0Oo4 /= 2.0f;
                                }
                                fOooO0o0 -= fOooO0Oo4;
                            }
                            OooO0oO((C25345OooO0o.AbstractC25372Oooo0O0) c25381OoooOO0.f86530OooOOo);
                            if (z4) {
                                C25394OooO0o0 c25394OooO0o0 = (C25394OooO0o0) oooO;
                                c25394OooO0o0.f86597OooO00o = fOooO0o0 + fOooO0Oo;
                                c25394OooO0o0.f86598OooO0O0 = fOooO0o0 + f;
                            }
                            boolean zOooo0002 = Oooo000();
                            OooOOO(c25381OoooOO0, oooO);
                            if (zOooo0002) {
                                OooOooo(c25381OoooOO0.f86514OooO0oo);
                            }
                        }
                        Oooo0oo();
                    } else if (oooo0o instanceof C25345OooO0o.C25377OoooO) {
                        Oooo();
                        C25345OooO0o.C25377OoooO c25377OoooO = (C25345OooO0o.C25377OoooO) oooo0o;
                        OoooO(c25377OoooO, this.f86571OooO0Oo);
                        if (OooOO0O()) {
                            OooO0oO((C25345OooO0o.AbstractC25372Oooo0O0) c25377OoooO.f86528OooOOOO);
                            C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo2 = oooo0o.f86520OooO00o.OooO0Oo(c25377OoooO.f86527OooOOO);
                            if (abstractC25373Oooo0OOOooO0Oo2 == null || !(abstractC25373Oooo0OOOooO0Oo2 instanceof C25345OooO0o.AbstractC25383OoooOOo)) {
                                OooOOOO("Tref reference '%s' not found", c25377OoooO.f86527OooOOO);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                OooOOOo((C25345OooO0o.AbstractC25383OoooOOo) abstractC25373Oooo0OOOooO0Oo2, sb);
                                if (sb.length() > 0) {
                                    oooO.OooO0O0(sb.toString());
                                }
                            }
                        }
                        Oooo0oo();
                    }
                }
                z = false;
            }
        }
    }

    public final void OooOOO0(Path path) {
        C19699OooO0oO c19699OooO0oO = this.f86571OooO0Oo;
        C25345OooO0o.C25363OooOooO.OooO oooO = c19699OooO0oO.f86600OooO00o.f86456Oooooo;
        C25345OooO0o.C25363OooOooO.OooO oooO2 = C25345OooO0o.C25363OooOooO.OooO.f86460OooOo;
        Canvas canvas = this.f86568OooO00o;
        if (oooO != oooO2) {
            canvas.drawPath(path, c19699OooO0oO.f86605OooO0o0);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.f86571OooO0Oo.f86605OooO0o0.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.f86571OooO0Oo.f86605OooO0o0);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void OooOOOo(C25345OooO0o.AbstractC25383OoooOOo abstractC25383OoooOOo, StringBuilder sb) {
        Iterator it = abstractC25383OoooOOo.f86504OooO.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C25345OooO0o.Oooo0o oooo0o = (C25345OooO0o.Oooo0o) it.next();
            if (oooo0o instanceof C25345OooO0o.AbstractC25383OoooOOo) {
                OooOOOo((C25345OooO0o.AbstractC25383OoooOOo) oooo0o, sb);
            } else if (oooo0o instanceof C25345OooO0o.C25387Ooooo00) {
                sb.append(OoooO00(((C25345OooO0o.C25387Ooooo00) oooo0o).f86538OooO0OO, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public final void OooOo0(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO, C19699OooO0oO c19699OooO0oO) {
        ArrayList arrayList = new ArrayList();
        C25345OooO0o.Oooo0o oooo0o = abstractC25373Oooo0OO;
        while (true) {
            if (oooo0o instanceof C25345OooO0o.AbstractC25373Oooo0OO) {
                arrayList.add(0, (C25345OooO0o.AbstractC25373Oooo0OO) oooo0o);
            }
            Object obj = oooo0o.f86521OooO0O0;
            if (obj == null) {
                break;
            } else {
                oooo0o = (C25345OooO0o.Oooo0o) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OoooO((C25345OooO0o.AbstractC25373Oooo0OO) it.next(), c19699OooO0oO);
        }
        C19699OooO0oO c19699OooO0oO2 = this.f86571OooO0Oo;
        c19699OooO0oO.f86606OooO0oO = c19699OooO0oO2.f86606OooO0oO;
        c19699OooO0oO.f86604OooO0o = c19699OooO0oO2.f86604OooO0o;
    }

    public final C19699OooO0oO OooOo00(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO) {
        C19699OooO0oO c19699OooO0oO = new C19699OooO0oO();
        OoooO0O(c19699OooO0oO, C25345OooO0o.C25363OooOooO.OooO00o());
        OooOo0(abstractC25373Oooo0OO, c19699OooO0oO);
        return c19699OooO0oO;
    }

    public final C25345OooO0o.C25363OooOooO.EnumC19698OooO0o OooOo0O() {
        C25345OooO0o.C25363OooOooO.EnumC19698OooO0o enumC19698OooO0o;
        C25345OooO0o.C25363OooOooO c25363OooOooO = this.f86571OooO0Oo.f86600OooO00o;
        if (c25363OooOooO.f86430Oooo == C25345OooO0o.C25363OooOooO.EnumC25367OooO0oo.f86493OooOo0o || (enumC19698OooO0o = c25363OooOooO.f86443OoooO00) == C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86478OooOo) {
            return c25363OooOooO.f86443OoooO00;
        }
        C25345OooO0o.C25363OooOooO.EnumC19698OooO0o enumC19698OooO0o2 = C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86479OooOo0o;
        return enumC19698OooO0o == enumC19698OooO0o2 ? C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86481OooOoO0 : enumC19698OooO0o2;
    }

    public final Path.FillType OooOo0o() {
        C25345OooO0o.C25363OooOooO.OooO00o oooO00o = this.f86571OooO0Oo.f86600OooO00o.f86451Ooooo00;
        return (oooO00o == null || oooO00o != C25345OooO0o.C25363OooOooO.OooO00o.f86463OooOo) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final Path OooOoO(C25345OooO0o.C25349OooO0oo c25349OooO0oo) {
        C25345OooO0o.OooOOOO oooOOOO = c25349OooO0oo.f86367OooOOOO;
        float fOooO0Oo = oooOOOO != null ? oooOOOO.OooO0Oo(this) : 0.0f;
        C25345OooO0o.OooOOOO oooOOOO2 = c25349OooO0oo.f86368OooOOOo;
        float fOooO0o0 = oooOOOO2 != null ? oooOOOO2.OooO0o0(this) : 0.0f;
        float fOooO0Oo2 = c25349OooO0oo.f86370OooOOo0.OooO0Oo(this);
        float fOooO0o02 = c25349OooO0oo.f86369OooOOo.OooO0o0(this);
        float f = fOooO0Oo - fOooO0Oo2;
        float f2 = fOooO0o0 - fOooO0o02;
        float f3 = fOooO0Oo + fOooO0Oo2;
        float f4 = fOooO0o0 + fOooO0o02;
        if (c25349OooO0oo.f86514OooO0oo == null) {
            c25349OooO0oo.f86514OooO0oo = new C25345OooO0o.OooO00o(f, f2, fOooO0Oo2 * 2.0f, 2.0f * fOooO0o02);
        }
        float f5 = fOooO0Oo2 * 0.5522848f;
        float f6 = fOooO0o02 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fOooO0Oo, f2);
        float f7 = fOooO0Oo + f5;
        float f8 = fOooO0o0 - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fOooO0o0);
        float f9 = fOooO0o0 + f6;
        path.cubicTo(f3, f9, f7, f4, fOooO0Oo, f4);
        float f10 = fOooO0Oo - f5;
        path.cubicTo(f10, f4, f, f9, f, fOooO0o0);
        path.cubicTo(f, f8, f10, f2, fOooO0Oo, f2);
        path.close();
        return path;
    }

    public final Path OooOoO0(C25345OooO0o.OooO0OO oooO0OO) {
        C25345OooO0o.OooOOOO oooOOOO = oooO0OO.f86359OooOOOO;
        float fOooO0Oo = oooOOOO != null ? oooOOOO.OooO0Oo(this) : 0.0f;
        C25345OooO0o.OooOOOO oooOOOO2 = oooO0OO.f86360OooOOOo;
        float fOooO0o0 = oooOOOO2 != null ? oooOOOO2.OooO0o0(this) : 0.0f;
        float fOooO0O0 = oooO0OO.f86361OooOOo0.OooO0O0(this);
        float f = fOooO0Oo - fOooO0O0;
        float f2 = fOooO0o0 - fOooO0O0;
        float f3 = fOooO0Oo + fOooO0O0;
        float f4 = fOooO0o0 + fOooO0O0;
        if (oooO0OO.f86514OooO0oo == null) {
            float f5 = 2.0f * fOooO0O0;
            oooO0OO.f86514OooO0oo = new C25345OooO0o.OooO00o(f, f2, f5, f5);
        }
        float f6 = fOooO0O0 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fOooO0Oo, f2);
        float f7 = fOooO0Oo + f6;
        float f8 = fOooO0o0 - f6;
        path.cubicTo(f7, f2, f3, f8, f3, fOooO0o0);
        float f9 = fOooO0o0 + f6;
        path.cubicTo(f3, f9, f7, f4, fOooO0Oo, f4);
        float f10 = fOooO0Oo - f6;
        path.cubicTo(f10, f4, f, f9, f, fOooO0o0);
        path.cubicTo(f, f8, f10, f2, fOooO0Oo, f2);
        path.close();
        return path;
    }

    public final C25345OooO0o.OooO00o OooOoo(C25345OooO0o.OooOOOO oooOOOO, C25345OooO0o.OooOOOO oooOOOO2, C25345OooO0o.OooOOOO oooOOOO3, C25345OooO0o.OooOOOO oooOOOO4) {
        float fOooO0Oo = oooOOOO != null ? oooOOOO.OooO0Oo(this) : 0.0f;
        float fOooO0o0 = oooOOOO2 != null ? oooOOOO2.OooO0o0(this) : 0.0f;
        C19699OooO0oO c19699OooO0oO = this.f86571OooO0Oo;
        C25345OooO0o.OooO00o oooO00o = c19699OooO0oO.f86606OooO0oO;
        if (oooO00o == null) {
            oooO00o = c19699OooO0oO.f86604OooO0o;
        }
        return new C25345OooO0o.OooO00o(fOooO0Oo, fOooO0o0, oooOOOO3 != null ? oooOOOO3.OooO0Oo(this) : oooO00o.f86353OooO0OO, oooOOOO4 != null ? oooOOOO4.OooO0o0(this) : oooO00o.f86354OooO0Oo);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Path OooOoo0(C25345OooO0o.C25360OooOoOO c25360OooOoOO) {
        float fOooO0Oo;
        float fOooO0o0;
        float fMin;
        float fOooO0Oo2;
        float fOooO0o02;
        float f;
        float f2;
        Path path;
        C25345OooO0o.OooOOOO oooOOOO = c25360OooOoOO.f86418OooOOoo;
        if (oooOOOO == null && c25360OooOoOO.f86419OooOo00 == null) {
            fOooO0Oo = 0.0f;
        } else if (oooOOOO == null) {
            fOooO0Oo = c25360OooOoOO.f86419OooOo00.OooO0o0(this);
        } else {
            if (c25360OooOoOO.f86419OooOo00 != null) {
                fOooO0Oo = oooOOOO.OooO0Oo(this);
                fOooO0o0 = c25360OooOoOO.f86419OooOo00.OooO0o0(this);
                fMin = Math.min(fOooO0Oo, c25360OooOoOO.f86417OooOOo0.OooO0Oo(this) / 2.0f);
                float fMin2 = Math.min(fOooO0o0, c25360OooOoOO.f86416OooOOo.OooO0o0(this) / 2.0f);
                C25345OooO0o.OooOOOO oooOOOO2 = c25360OooOoOO.f86414OooOOOO;
                fOooO0Oo2 = oooOOOO2 == null ? oooOOOO2.OooO0Oo(this) : 0.0f;
                C25345OooO0o.OooOOOO oooOOOO3 = c25360OooOoOO.f86415OooOOOo;
                fOooO0o02 = oooOOOO3 == null ? oooOOOO3.OooO0o0(this) : 0.0f;
                float fOooO0Oo3 = c25360OooOoOO.f86417OooOOo0.OooO0Oo(this);
                float fOooO0o03 = c25360OooOoOO.f86416OooOOo.OooO0o0(this);
                if (c25360OooOoOO.f86514OooO0oo == null) {
                    c25360OooOoOO.f86514OooO0oo = new C25345OooO0o.OooO00o(fOooO0Oo2, fOooO0o02, fOooO0Oo3, fOooO0o03);
                }
                f = fOooO0Oo3 + fOooO0Oo2;
                f2 = fOooO0o02 + fOooO0o03;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fOooO0Oo2, fOooO0o02);
                    path.lineTo(f, fOooO0o02);
                    path.lineTo(f, f2);
                    path.lineTo(fOooO0Oo2, f2);
                    path.lineTo(fOooO0Oo2, fOooO0o02);
                } else {
                    float f3 = fMin * 0.5522848f;
                    float f4 = 0.5522848f * fMin2;
                    float f5 = fOooO0o02 + fMin2;
                    path.moveTo(fOooO0Oo2, f5);
                    float f6 = f5 - f4;
                    float f7 = fOooO0Oo2 + fMin;
                    float f8 = f7 - f3;
                    path.cubicTo(fOooO0Oo2, f6, f8, fOooO0o02, f7, fOooO0o02);
                    float f9 = f - fMin;
                    path.lineTo(f9, fOooO0o02);
                    float f10 = f9 + f3;
                    path.cubicTo(f10, fOooO0o02, f, f6, f, f5);
                    float f11 = f2 - fMin2;
                    path.lineTo(f, f11);
                    float f12 = f11 + f4;
                    path.cubicTo(f, f12, f10, f2, f9, f2);
                    path.lineTo(f7, f2);
                    float f13 = fOooO0Oo2;
                    path.cubicTo(f8, f2, f13, f12, fOooO0Oo2, f11);
                    path.lineTo(f13, f5);
                }
                path.close();
                return path;
            }
            fOooO0Oo = oooOOOO.OooO0Oo(this);
        }
        fOooO0o0 = fOooO0Oo;
        fMin = Math.min(fOooO0Oo, c25360OooOoOO.f86417OooOOo0.OooO0Oo(this) / 2.0f);
        float fMin22 = Math.min(fOooO0o0, c25360OooOoOO.f86416OooOOo.OooO0o0(this) / 2.0f);
        C25345OooO0o.OooOOOO oooOOOO22 = c25360OooOoOO.f86414OooOOOO;
        if (oooOOOO22 == null) {
        }
        C25345OooO0o.OooOOOO oooOOOO32 = c25360OooOoOO.f86415OooOOOo;
        if (oooOOOO32 == null) {
        }
        float fOooO0Oo32 = c25360OooOoOO.f86417OooOOo0.OooO0Oo(this);
        float fOooO0o032 = c25360OooOoOO.f86416OooOOo.OooO0o0(this);
        if (c25360OooOoOO.f86514OooO0oo == null) {
        }
        f = fOooO0Oo32 + fOooO0Oo2;
        f2 = fOooO0o02 + fOooO0o032;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fOooO0Oo2, fOooO0o02);
            path.lineTo(f, fOooO0o02);
            path.lineTo(f, f2);
            path.lineTo(fOooO0Oo2, f2);
            path.lineTo(fOooO0Oo2, fOooO0o02);
        }
        path.close();
        return path;
    }

    public final Path OooOooO(C25345OooO0o.AbstractC25372Oooo0O0 abstractC25372Oooo0O0, boolean z) {
        Path pathOooOoo0;
        Path pathOooO0O0;
        this.f86573OooO0o0.push(this.f86571OooO0Oo);
        C19699OooO0oO c19699OooO0oO = new C19699OooO0oO(this.f86571OooO0Oo);
        this.f86571OooO0Oo = c19699OooO0oO;
        OoooO(abstractC25372Oooo0O0, c19699OooO0oO);
        if (!OooOO0O() || !o000oOoO()) {
            this.f86571OooO0Oo = this.f86573OooO0o0.pop();
            return null;
        }
        if (abstractC25372Oooo0O0 instanceof C25345OooO0o.C25389OooooO0) {
            if (!z) {
                OooOOOO("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C25345OooO0o.C25389OooooO0 c25389OooooO0 = (C25345OooO0o.C25389OooooO0) abstractC25372Oooo0O0;
            C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo = abstractC25372Oooo0O0.f86520OooO00o.OooO0Oo(c25389OooooO0.f86543OooOOOO);
            if (abstractC25373Oooo0OOOooO0Oo == null) {
                OooOOOO("Use reference '%s' not found", c25389OooooO0.f86543OooOOOO);
                this.f86571OooO0Oo = this.f86573OooO0o0.pop();
                return null;
            }
            if (!(abstractC25373Oooo0OOOooO0Oo instanceof C25345OooO0o.AbstractC25372Oooo0O0)) {
                this.f86571OooO0Oo = this.f86573OooO0o0.pop();
                return null;
            }
            pathOooOoo0 = OooOooO((C25345OooO0o.AbstractC25372Oooo0O0) abstractC25373Oooo0OOOooO0Oo, false);
            if (pathOooOoo0 != null) {
                if (c25389OooooO0.f86514OooO0oo == null) {
                    c25389OooooO0.f86514OooO0oo = OooO0OO(pathOooOoo0);
                }
                Matrix matrix = c25389OooooO0.f86375OooOOO;
                if (matrix != null) {
                    pathOooOoo0.transform(matrix);
                }
                if (this.f86571OooO0Oo.f86600OooO00o.f86450OoooOoo != null && (pathOooO0O0 = OooO0O0(abstractC25372Oooo0O0, abstractC25372Oooo0O0.f86514OooO0oo)) != null) {
                    pathOooOoo0.op(pathOooO0O0, Path.Op.INTERSECT);
                }
                this.f86571OooO0Oo = this.f86573OooO0o0.pop();
                return pathOooOoo0;
            }
            return null;
        }
        if (abstractC25372Oooo0O0 instanceof C25345OooO0o.OooOO0O) {
            C25345OooO0o.OooOO0O oooOO0O = (C25345OooO0o.OooOO0O) abstractC25372Oooo0O0;
            if (abstractC25372Oooo0O0 instanceof C25345OooO0o.C25355OooOo0) {
                pathOooOoo0 = new OooO0OO(((C25345OooO0o.C25355OooOo0) abstractC25372Oooo0O0).f86406OooOOOO).f86588OooO00o;
                if (abstractC25372Oooo0O0.f86514OooO0oo == null) {
                    abstractC25372Oooo0O0.f86514OooO0oo = OooO0OO(pathOooOoo0);
                }
            } else {
                pathOooOoo0 = abstractC25372Oooo0O0 instanceof C25345OooO0o.C25360OooOoOO ? OooOoo0((C25345OooO0o.C25360OooOoOO) abstractC25372Oooo0O0) : abstractC25372Oooo0O0 instanceof C25345OooO0o.OooO0OO ? OooOoO0((C25345OooO0o.OooO0OO) abstractC25372Oooo0O0) : abstractC25372Oooo0O0 instanceof C25345OooO0o.C25349OooO0oo ? OooOoO((C25345OooO0o.C25349OooO0oo) abstractC25372Oooo0O0) : abstractC25372Oooo0O0 instanceof C25345OooO0o.C25359OooOoO0 ? OooOoOO((C25345OooO0o.C25359OooOoO0) abstractC25372Oooo0O0) : null;
            }
            if (pathOooOoo0 != null) {
                if (oooOO0O.f86514OooO0oo == null) {
                    oooOO0O.f86514OooO0oo = OooO0OO(pathOooOoo0);
                }
                Matrix matrix2 = oooOO0O.f86374OooOOO;
                if (matrix2 != null) {
                    pathOooOoo0.transform(matrix2);
                }
                pathOooOoo0.setFillType(OooOo0o());
            }
            return null;
        }
        if (!(abstractC25372Oooo0O0 instanceof C25345OooO0o.o000oOoO)) {
            OooOOOO("Invalid %s element found in clipPath definition", abstractC25372Oooo0O0.OooOOO0());
            return null;
        }
        C25345OooO0o.o000oOoO o000oooo2 = (C25345OooO0o.o000oOoO) abstractC25372Oooo0O0;
        ArrayList arrayList = o000oooo2.f86534OooOOO;
        float fOooO0o0 = 0.0f;
        float fOooO0Oo = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C25345OooO0o.OooOOOO) o000oooo2.f86534OooOOO.get(0)).OooO0Oo(this);
        ArrayList arrayList2 = o000oooo2.f86535OooOOOO;
        float fOooO0o02 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C25345OooO0o.OooOOOO) o000oooo2.f86535OooOOOO.get(0)).OooO0o0(this);
        ArrayList arrayList3 = o000oooo2.f86536OooOOOo;
        float fOooO0Oo2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C25345OooO0o.OooOOOO) o000oooo2.f86536OooOOOo.get(0)).OooO0Oo(this);
        ArrayList arrayList4 = o000oooo2.f86537OooOOo0;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fOooO0o0 = ((C25345OooO0o.OooOOOO) o000oooo2.f86537OooOOo0.get(0)).OooO0o0(this);
        }
        if (this.f86571OooO0Oo.f86600OooO00o.f86443OoooO00 != C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86479OooOo0o) {
            float fOooO0Oo3 = OooO0Oo(o000oooo2);
            if (this.f86571OooO0Oo.f86600OooO00o.f86443OoooO00 == C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86478OooOo) {
                fOooO0Oo3 /= 2.0f;
            }
            fOooO0Oo -= fOooO0Oo3;
        }
        if (o000oooo2.f86514OooO0oo == null) {
            C25395OooO0oo c25395OooO0oo = new C25395OooO0oo(fOooO0Oo, fOooO0o02);
            OooOOO(o000oooo2, c25395OooO0oo);
            RectF rectF = c25395OooO0oo.f86610OooO0OO;
            o000oooo2.f86514OooO0oo = new C25345OooO0o.OooO00o(rectF.left, rectF.top, rectF.width(), c25395OooO0oo.f86610OooO0OO.height());
        }
        Path path = new Path();
        OooOOO(o000oooo2, new OooO0o(fOooO0Oo + fOooO0Oo2, fOooO0o02 + fOooO0o0, path));
        Matrix matrix3 = o000oooo2.f86548OooOOo;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        path.setFillType(OooOo0o());
        pathOooOoo0 = path;
        if (this.f86571OooO0Oo.f86600OooO00o.f86450OoooOoo != null) {
            pathOooOoo0.op(pathOooO0O0, Path.Op.INTERSECT);
        }
        this.f86571OooO0Oo = this.f86573OooO0o0.pop();
        return pathOooOoo0;
    }

    public final void OooOooo(C25345OooO0o.OooO00o oooO00o) {
        if (this.f86571OooO0Oo.f86600OooO00o.f86452Ooooo0o != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f86568OooO00o;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            C25345OooO0o.C25352OooOOo c25352OooOOo = (C25345OooO0o.C25352OooOOo) this.f86570OooO0OO.OooO0Oo(this.f86571OooO0Oo.f86600OooO00o.f86452Ooooo0o);
            Oooo0o0(c25352OooOOo, oooO00o);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            Oooo0o0(c25352OooOOo, oooO00o);
            canvas.restore();
            canvas.restore();
        }
        Oooo0oo();
    }

    public final void Oooo() {
        this.f86568OooO00o.save();
        this.f86573OooO0o0.push(this.f86571OooO0Oo);
        this.f86571OooO0Oo = new C19699OooO0oO(this.f86571OooO0Oo);
    }

    public final void Oooo0(C25345OooO0o.AbstractC25370Oooo00O abstractC25370Oooo00O, boolean z) {
        if (z) {
            this.f86572OooO0o.push(abstractC25370Oooo00O);
            this.f86574OooO0oO.push(this.f86568OooO00o.getMatrix());
        }
        Iterator it = abstractC25370Oooo00O.f86504OooO.iterator();
        while (it.hasNext()) {
            Oooo00o((C25345OooO0o.Oooo0o) it.next());
        }
        if (z) {
            this.f86572OooO0o.pop();
            this.f86574OooO0oO.pop();
        }
    }

    public final boolean Oooo000() {
        C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo;
        int i = 0;
        if (this.f86571OooO0Oo.f86600OooO00o.f86431Oooo0.floatValue() >= 1.0f && this.f86571OooO0Oo.f86600OooO00o.f86452Ooooo0o == null) {
            return false;
        }
        int iFloatValue = (int) (this.f86571OooO0Oo.f86600OooO00o.f86431Oooo0.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i = 255;
            if (iFloatValue <= 255) {
                i = iFloatValue;
            }
        }
        this.f86568OooO00o.saveLayerAlpha(null, i, 31);
        this.f86573OooO0o0.push(this.f86571OooO0Oo);
        C19699OooO0oO c19699OooO0oO = new C19699OooO0oO(this.f86571OooO0Oo);
        this.f86571OooO0Oo = c19699OooO0oO;
        String str = c19699OooO0oO.f86600OooO00o.f86452Ooooo0o;
        if (str != null && ((abstractC25373Oooo0OOOooO0Oo = this.f86570OooO0OO.OooO0Oo(str)) == null || !(abstractC25373Oooo0OOOooO0Oo instanceof C25345OooO0o.C25352OooOOo))) {
            OooOOOO("Mask reference '%s' not found", this.f86571OooO0Oo.f86600OooO00o.f86452Ooooo0o);
            this.f86571OooO0Oo.f86600OooO00o.f86452Ooooo0o = null;
        }
        return true;
    }

    public final void Oooo00O(C25345OooO0o.C25368OooOooo c25368OooOooo, C25345OooO0o.OooO00o oooO00o, C25345OooO0o.OooO00o oooO00o2, C25391OooO0o0 c25391OooO0o0) {
        if (oooO00o.f86353OooO0OO == 0.0f || oooO00o.f86354OooO0Oo == 0.0f) {
            return;
        }
        if (c25391OooO0o0 == null && (c25391OooO0o0 = c25368OooOooo.f86526OooOOO) == null) {
            c25391OooO0o0 = C25391OooO0o0.f86550OooO0Oo;
        }
        OoooO(c25368OooOooo, this.f86571OooO0Oo);
        if (OooOO0O()) {
            C19699OooO0oO c19699OooO0oO = this.f86571OooO0Oo;
            c19699OooO0oO.f86604OooO0o = oooO00o;
            if (!c19699OooO0oO.f86600OooO00o.f86442OoooO0.booleanValue()) {
                C25345OooO0o.OooO00o oooO00o3 = this.f86571OooO0Oo.f86604OooO0o;
                Oooo0o(oooO00o3.f86351OooO00o, oooO00o3.f86352OooO0O0, oooO00o3.f86353OooO0OO, oooO00o3.f86354OooO0Oo);
            }
            OooO0o(c25368OooOooo, this.f86571OooO0Oo.f86604OooO0o);
            Canvas canvas = this.f86568OooO00o;
            if (oooO00o2 != null) {
                canvas.concat(OooO0o0(this.f86571OooO0Oo.f86604OooO0o, oooO00o2, c25391OooO0o0));
                this.f86571OooO0Oo.f86606OooO0oO = c25368OooOooo.f86529OooOOOO;
            } else {
                C25345OooO0o.OooO00o oooO00o4 = this.f86571OooO0Oo.f86604OooO0o;
                canvas.translate(oooO00o4.f86351OooO00o, oooO00o4.f86352OooO0O0);
            }
            boolean zOooo000 = Oooo000();
            OoooOO0();
            Oooo0(c25368OooOooo, true);
            if (zOooo000) {
                OooOooo(c25368OooOooo.f86514OooO0oo);
            }
            OoooO0(c25368OooOooo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo00o(C25345OooO0o.Oooo0o oooo0o) {
        C25345OooO0o.OooOOOO oooOOOO;
        String str;
        int iIndexOf;
        Set<String> setOooO0o;
        C25345OooO0o.OooOOOO oooOOOO2;
        Boolean bool;
        if (oooo0o instanceof C25345OooO0o.InterfaceC25354OooOOoo) {
            return;
        }
        Oooo();
        if ((oooo0o instanceof C25345OooO0o.AbstractC25373Oooo0OO) && (bool = ((C25345OooO0o.AbstractC25373Oooo0OO) oooo0o).f86516OooO0Oo) != null) {
            this.f86571OooO0Oo.f86607OooO0oo = bool.booleanValue();
        }
        if (oooo0o instanceof C25345OooO0o.C25368OooOooo) {
            C25345OooO0o.C25368OooOooo c25368OooOooo = (C25345OooO0o.C25368OooOooo) oooo0o;
            Oooo00O(c25368OooOooo, OooOoo(c25368OooOooo.f86495OooOOOo, c25368OooOooo.f86497OooOOo0, c25368OooOooo.f86496OooOOo, c25368OooOooo.f86498OooOOoo), c25368OooOooo.f86529OooOOOO, c25368OooOooo.f86526OooOOO);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            if (oooo0o instanceof C25345OooO0o.C25389OooooO0) {
                C25345OooO0o.C25389OooooO0 c25389OooooO0 = (C25345OooO0o.C25389OooooO0) oooo0o;
                C25345OooO0o.OooOOOO oooOOOO3 = c25389OooooO0.f86545OooOOo;
                if ((oooOOOO3 == null || !oooOOOO3.OooO0oO()) && ((oooOOOO2 = c25389OooooO0.f86547OooOOoo) == null || !oooOOOO2.OooO0oO())) {
                    OoooO(c25389OooooO0, this.f86571OooO0Oo);
                    if (OooOO0O()) {
                        C25345OooO0o.Oooo0o oooo0oOooO0Oo = c25389OooooO0.f86520OooO00o.OooO0Oo(c25389OooooO0.f86543OooOOOO);
                        if (oooo0oOooO0Oo == null) {
                            OooOOOO("Use reference '%s' not found", c25389OooooO0.f86543OooOOOO);
                        } else {
                            Matrix matrix = c25389OooooO0.f86375OooOOO;
                            Canvas canvas = this.f86568OooO00o;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            C25345OooO0o.OooOOOO oooOOOO4 = c25389OooooO0.f86544OooOOOo;
                            float fOooO0Oo = oooOOOO4 != null ? oooOOOO4.OooO0Oo(this) : 0.0f;
                            C25345OooO0o.OooOOOO oooOOOO5 = c25389OooooO0.f86546OooOOo0;
                            canvas.translate(fOooO0Oo, oooOOOO5 != null ? oooOOOO5.OooO0o0(this) : 0.0f);
                            OooO0o(c25389OooooO0, c25389OooooO0.f86514OooO0oo);
                            boolean zOooo000 = Oooo000();
                            this.f86572OooO0o.push(c25389OooooO0);
                            this.f86574OooO0oO.push(this.f86568OooO00o.getMatrix());
                            if (oooo0oOooO0Oo instanceof C25345OooO0o.C25368OooOooo) {
                                C25345OooO0o.C25368OooOooo c25368OooOooo2 = (C25345OooO0o.C25368OooOooo) oooo0oOooO0Oo;
                                C25345OooO0o.OooO00o oooO00oOooOoo = OooOoo(null, null, c25389OooooO0.f86545OooOOo, c25389OooooO0.f86547OooOOoo);
                                Oooo();
                                Oooo00O(c25368OooOooo2, oooO00oOooOoo, c25368OooOooo2.f86529OooOOOO, c25368OooOooo2.f86526OooOOO);
                                Oooo0oo();
                            } else if (oooo0oOooO0Oo instanceof C25345OooO0o.C25380OoooO0O) {
                                C25345OooO0o.OooOOOO oooOOOO6 = c25389OooooO0.f86545OooOOo;
                                C25345OooO0o.EnumC25388Ooooo0o enumC25388Ooooo0o = C25345OooO0o.EnumC25388Ooooo0o.f86542OooOoO0;
                                if (oooOOOO6 == null) {
                                    oooOOOO6 = new C25345OooO0o.OooOOOO(100.0f, enumC25388Ooooo0o);
                                }
                                C25345OooO0o.OooOOOO oooOOOO7 = c25389OooooO0.f86547OooOOoo;
                                if (oooOOOO7 == null) {
                                    oooOOOO7 = new C25345OooO0o.OooOOOO(100.0f, enumC25388Ooooo0o);
                                }
                                C25345OooO0o.OooO00o oooO00oOooOoo2 = OooOoo(null, null, oooOOOO6, oooOOOO7);
                                Oooo();
                                C25345OooO0o.C25380OoooO0O c25380OoooO0O = (C25345OooO0o.C25380OoooO0O) oooo0oOooO0Oo;
                                if (oooO00oOooOoo2.f86353OooO0OO != 0.0f && oooO00oOooOoo2.f86354OooO0Oo != 0.0f) {
                                    C25391OooO0o0 c25391OooO0o0 = c25380OoooO0O.f86526OooOOO;
                                    if (c25391OooO0o0 == null) {
                                        c25391OooO0o0 = C25391OooO0o0.f86550OooO0Oo;
                                    }
                                    OoooO(c25380OoooO0O, this.f86571OooO0Oo);
                                    C19699OooO0oO c19699OooO0oO = this.f86571OooO0Oo;
                                    c19699OooO0oO.f86604OooO0o = oooO00oOooOoo2;
                                    if (!c19699OooO0oO.f86600OooO00o.f86442OoooO0.booleanValue()) {
                                        C25345OooO0o.OooO00o oooO00o = this.f86571OooO0Oo.f86604OooO0o;
                                        Oooo0o(oooO00o.f86351OooO00o, oooO00o.f86352OooO0O0, oooO00o.f86353OooO0OO, oooO00o.f86354OooO0Oo);
                                    }
                                    C25345OooO0o.OooO00o oooO00o2 = c25380OoooO0O.f86529OooOOOO;
                                    if (oooO00o2 != null) {
                                        canvas.concat(OooO0o0(this.f86571OooO0Oo.f86604OooO0o, oooO00o2, c25391OooO0o0));
                                        this.f86571OooO0Oo.f86606OooO0oO = c25380OoooO0O.f86529OooOOOO;
                                    } else {
                                        C25345OooO0o.OooO00o oooO00o3 = this.f86571OooO0Oo.f86604OooO0o;
                                        canvas.translate(oooO00o3.f86351OooO00o, oooO00o3.f86352OooO0O0);
                                    }
                                    boolean zOooo0002 = Oooo000();
                                    Oooo0(c25380OoooO0O, true);
                                    if (zOooo0002) {
                                        OooOooo(c25380OoooO0O.f86514OooO0oo);
                                    }
                                    OoooO0(c25380OoooO0O);
                                }
                                Oooo0oo();
                            } else {
                                Oooo00o(oooo0oOooO0Oo);
                            }
                            this.f86572OooO0o.pop();
                            this.f86574OooO0oO.pop();
                            if (zOooo000) {
                                OooOooo(c25389OooooO0.f86514OooO0oo);
                            }
                            OoooO0(c25389OooooO0);
                        }
                    }
                }
            } else if (oooo0o instanceof C25345OooO0o.C25378OoooO0) {
                C25345OooO0o.C25378OoooO0 c25378OoooO0 = (C25345OooO0o.C25378OoooO0) oooo0o;
                OoooO(c25378OoooO0, this.f86571OooO0Oo);
                if (OooOO0O()) {
                    Matrix matrix2 = c25378OoooO0.f86375OooOOO;
                    if (matrix2 != null) {
                        this.f86568OooO00o.concat(matrix2);
                    }
                    OooO0o(c25378OoooO0, c25378OoooO0.f86514OooO0oo);
                    boolean zOooo0003 = Oooo000();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = c25378OoooO0.f86504OooO.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C25345OooO0o.Oooo0o oooo0o2 = (C25345OooO0o.Oooo0o) it.next();
                        if (oooo0o2 instanceof C25345OooO0o.Oooo000) {
                            C25345OooO0o.Oooo000 oooo000 = (C25345OooO0o.Oooo000) oooo0o2;
                            if (oooo000.OooO00o() == null && ((setOooO0o = oooo000.OooO0o()) == null || (!setOooO0o.isEmpty() && setOooO0o.contains(language)))) {
                                Set<String> requiredFeatures = oooo000.getRequiredFeatures();
                                if (requiredFeatures != null) {
                                    if (f86567OooO0oo == null) {
                                        synchronized (C25392OooO0oO.class) {
                                            HashSet<String> hashSet = new HashSet<>();
                                            f86567OooO0oo = hashSet;
                                            hashSet.add("Structure");
                                            f86567OooO0oo.add("BasicStructure");
                                            f86567OooO0oo.add("ConditionalProcessing");
                                            f86567OooO0oo.add("Image");
                                            f86567OooO0oo.add("Style");
                                            f86567OooO0oo.add("ViewportAttribute");
                                            f86567OooO0oo.add("Shape");
                                            f86567OooO0oo.add("BasicText");
                                            f86567OooO0oo.add("PaintAttribute");
                                            f86567OooO0oo.add("BasicPaintAttribute");
                                            f86567OooO0oo.add("OpacityAttribute");
                                            f86567OooO0oo.add("BasicGraphicsAttribute");
                                            f86567OooO0oo.add(PerfConstants.CodeMarkerParameters.MARKER);
                                            f86567OooO0oo.add("Gradient");
                                            f86567OooO0oo.add("Pattern");
                                            f86567OooO0oo.add("Clip");
                                            f86567OooO0oo.add("BasicClip");
                                            f86567OooO0oo.add("Mask");
                                            f86567OooO0oo.add("View");
                                        }
                                    }
                                    if (requiredFeatures.isEmpty() || !f86567OooO0oo.containsAll(requiredFeatures)) {
                                    }
                                }
                                Set<String> setOooO0o0 = oooo000.OooO0o0();
                                if (setOooO0o0 == null) {
                                    Set<String> setOooOO0o = oooo000.OooOO0o();
                                    if (setOooOO0o == null) {
                                        Oooo00o(oooo0o2);
                                        break;
                                    }
                                    setOooOO0o.isEmpty();
                                } else {
                                    setOooO0o0.isEmpty();
                                }
                            }
                        }
                    }
                    if (zOooo0003) {
                        OooOooo(c25378OoooO0.f86514OooO0oo);
                    }
                    OoooO0(c25378OoooO0);
                }
            } else if (oooo0o instanceof C25345OooO0o.C25350OooOO0o) {
                C25345OooO0o.C25350OooOO0o c25350OooOO0o = (C25345OooO0o.C25350OooOO0o) oooo0o;
                OoooO(c25350OooOO0o, this.f86571OooO0Oo);
                if (OooOO0O()) {
                    Matrix matrix3 = c25350OooOO0o.f86375OooOOO;
                    if (matrix3 != null) {
                        this.f86568OooO00o.concat(matrix3);
                    }
                    OooO0o(c25350OooOO0o, c25350OooOO0o.f86514OooO0oo);
                    boolean zOooo0004 = Oooo000();
                    Oooo0(c25350OooOO0o, true);
                    if (zOooo0004) {
                        OooOooo(c25350OooOO0o.f86514OooO0oo);
                    }
                    OoooO0(c25350OooOO0o);
                }
            } else {
                if (oooo0o instanceof C25345OooO0o.OooOOO) {
                    C25345OooO0o.OooOOO oooOOO = (C25345OooO0o.OooOOO) oooo0o;
                    C25345OooO0o.OooOOOO oooOOOO8 = oooOOO.f86378OooOOo;
                    if (oooOOOO8 != null && !oooOOOO8.OooO0oO() && (oooOOOO = oooOOO.f86380OooOOoo) != null && !oooOOOO.OooO0oO() && (str = oooOOO.f86376OooOOOO) != null) {
                        C25391OooO0o0 c25391OooO0o02 = oooOOO.f86526OooOOO;
                        if (c25391OooO0o02 == null) {
                            c25391OooO0o02 = C25391OooO0o0.f86550OooO0Oo;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                            try {
                                byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                            } catch (Exception e) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e);
                            }
                        }
                        if (bitmapDecodeByteArray != null) {
                            C25345OooO0o.OooO00o oooO00o4 = new C25345OooO0o.OooO00o(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                            OoooO(oooOOO, this.f86571OooO0Oo);
                            if (OooOO0O() && o000oOoO()) {
                                Matrix matrix4 = oooOOO.f86381OooOo00;
                                Canvas canvas2 = this.f86568OooO00o;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                C25345OooO0o.OooOOOO oooOOOO9 = oooOOO.f86377OooOOOo;
                                float fOooO0Oo2 = oooOOOO9 != null ? oooOOOO9.OooO0Oo(this) : 0.0f;
                                C25345OooO0o.OooOOOO oooOOOO10 = oooOOO.f86379OooOOo0;
                                float fOooO0o0 = oooOOOO10 != null ? oooOOOO10.OooO0o0(this) : 0.0f;
                                float fOooO0Oo3 = oooOOO.f86378OooOOo.OooO0Oo(this);
                                float fOooO0Oo4 = oooOOO.f86380OooOOoo.OooO0Oo(this);
                                C19699OooO0oO c19699OooO0oO2 = this.f86571OooO0Oo;
                                c19699OooO0oO2.f86604OooO0o = new C25345OooO0o.OooO00o(fOooO0Oo2, fOooO0o0, fOooO0Oo3, fOooO0Oo4);
                                if (!c19699OooO0oO2.f86600OooO00o.f86442OoooO0.booleanValue()) {
                                    C25345OooO0o.OooO00o oooO00o5 = this.f86571OooO0Oo.f86604OooO0o;
                                    Oooo0o(oooO00o5.f86351OooO00o, oooO00o5.f86352OooO0O0, oooO00o5.f86353OooO0OO, oooO00o5.f86354OooO0Oo);
                                }
                                oooOOO.f86514OooO0oo = this.f86571OooO0Oo.f86604OooO0o;
                                OoooO0(oooOOO);
                                OooO0o(oooOOO, oooOOO.f86514OooO0oo);
                                boolean zOooo0005 = Oooo000();
                                OoooOO0();
                                canvas2.save();
                                canvas2.concat(OooO0o0(this.f86571OooO0Oo.f86604OooO0o, oooO00o4, c25391OooO0o02));
                                canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(this.f86571OooO0Oo.f86600OooO00o.f86458OoooooO != C25345OooO0o.C25363OooOooO.EnumC25365OooO0o0.f86485OooOoO0 ? 2 : 0));
                                canvas2.restore();
                                if (zOooo0005) {
                                    OooOooo(oooOOO.f86514OooO0oo);
                                }
                            }
                        }
                    }
                } else if (oooo0o instanceof C25345OooO0o.C25355OooOo0) {
                    C25345OooO0o.C25355OooOo0 c25355OooOo0 = (C25345OooO0o.C25355OooOo0) oooo0o;
                    if (c25355OooOo0.f86406OooOOOO != null) {
                        OoooO(c25355OooOo0, this.f86571OooO0Oo);
                        if (OooOO0O() && o000oOoO()) {
                            C19699OooO0oO c19699OooO0oO3 = this.f86571OooO0Oo;
                            if (c19699OooO0oO3.f86602OooO0OO || c19699OooO0oO3.f86601OooO0O0) {
                                Matrix matrix5 = c25355OooOo0.f86374OooOOO;
                                if (matrix5 != null) {
                                    this.f86568OooO00o.concat(matrix5);
                                }
                                Path path = new OooO0OO(c25355OooOo0.f86406OooOOOO).f86588OooO00o;
                                if (c25355OooOo0.f86514OooO0oo == null) {
                                    c25355OooOo0.f86514OooO0oo = OooO0OO(path);
                                }
                                OoooO0(c25355OooOo0);
                                OooO0oO(c25355OooOo0);
                                OooO0o(c25355OooOo0, c25355OooOo0.f86514OooO0oo);
                                boolean zOooo0006 = Oooo000();
                                C19699OooO0oO c19699OooO0oO4 = this.f86571OooO0Oo;
                                if (c19699OooO0oO4.f86601OooO0O0) {
                                    C25345OooO0o.C25363OooOooO.OooO00o oooO00o6 = c19699OooO0oO4.f86600OooO00o.f86424OooOoO0;
                                    path.setFillType((oooO00o6 == null || oooO00o6 != C25345OooO0o.C25363OooOooO.OooO00o.f86463OooOo) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    OooOO0o(c25355OooOo0, path);
                                }
                                if (this.f86571OooO0Oo.f86602OooO0OO) {
                                    OooOOO0(path);
                                }
                                Oooo0OO(c25355OooOo0);
                                if (zOooo0006) {
                                    OooOooo(c25355OooOo0.f86514OooO0oo);
                                }
                            }
                        }
                    }
                } else if (oooo0o instanceof C25345OooO0o.C25360OooOoOO) {
                    C25345OooO0o.C25360OooOoOO c25360OooOoOO = (C25345OooO0o.C25360OooOoOO) oooo0o;
                    C25345OooO0o.OooOOOO oooOOOO11 = c25360OooOoOO.f86417OooOOo0;
                    if (oooOOOO11 != null && c25360OooOoOO.f86416OooOOo != null && !oooOOOO11.OooO0oO() && !c25360OooOoOO.f86416OooOOo.OooO0oO()) {
                        OoooO(c25360OooOoOO, this.f86571OooO0Oo);
                        if (OooOO0O() && o000oOoO()) {
                            Matrix matrix6 = c25360OooOoOO.f86374OooOOO;
                            if (matrix6 != null) {
                                this.f86568OooO00o.concat(matrix6);
                            }
                            Path pathOooOoo0 = OooOoo0(c25360OooOoOO);
                            OoooO0(c25360OooOoOO);
                            OooO0oO(c25360OooOoOO);
                            OooO0o(c25360OooOoOO, c25360OooOoOO.f86514OooO0oo);
                            boolean zOooo0007 = Oooo000();
                            if (this.f86571OooO0Oo.f86601OooO0O0) {
                                OooOO0o(c25360OooOoOO, pathOooOoo0);
                            }
                            if (this.f86571OooO0Oo.f86602OooO0OO) {
                                OooOOO0(pathOooOoo0);
                            }
                            if (zOooo0007) {
                                OooOooo(c25360OooOoOO.f86514OooO0oo);
                            }
                        }
                    }
                } else if (oooo0o instanceof C25345OooO0o.OooO0OO) {
                    C25345OooO0o.OooO0OO oooO0OO = (C25345OooO0o.OooO0OO) oooo0o;
                    C25345OooO0o.OooOOOO oooOOOO12 = oooO0OO.f86361OooOOo0;
                    if (oooOOOO12 != null && !oooOOOO12.OooO0oO()) {
                        OoooO(oooO0OO, this.f86571OooO0Oo);
                        if (OooOO0O() && o000oOoO()) {
                            Matrix matrix7 = oooO0OO.f86374OooOOO;
                            if (matrix7 != null) {
                                this.f86568OooO00o.concat(matrix7);
                            }
                            Path pathOooOoO0 = OooOoO0(oooO0OO);
                            OoooO0(oooO0OO);
                            OooO0oO(oooO0OO);
                            OooO0o(oooO0OO, oooO0OO.f86514OooO0oo);
                            boolean zOooo0008 = Oooo000();
                            if (this.f86571OooO0Oo.f86601OooO0O0) {
                                OooOO0o(oooO0OO, pathOooOoO0);
                            }
                            if (this.f86571OooO0Oo.f86602OooO0OO) {
                                OooOOO0(pathOooOoO0);
                            }
                            if (zOooo0008) {
                                OooOooo(oooO0OO.f86514OooO0oo);
                            }
                        }
                    }
                } else if (oooo0o instanceof C25345OooO0o.C25349OooO0oo) {
                    C25345OooO0o.C25349OooO0oo c25349OooO0oo = (C25345OooO0o.C25349OooO0oo) oooo0o;
                    C25345OooO0o.OooOOOO oooOOOO13 = c25349OooO0oo.f86370OooOOo0;
                    if (oooOOOO13 != null && c25349OooO0oo.f86369OooOOo != null && !oooOOOO13.OooO0oO() && !c25349OooO0oo.f86369OooOOo.OooO0oO()) {
                        OoooO(c25349OooO0oo, this.f86571OooO0Oo);
                        if (OooOO0O() && o000oOoO()) {
                            Matrix matrix8 = c25349OooO0oo.f86374OooOOO;
                            if (matrix8 != null) {
                                this.f86568OooO00o.concat(matrix8);
                            }
                            Path pathOooOoO = OooOoO(c25349OooO0oo);
                            OoooO0(c25349OooO0oo);
                            OooO0oO(c25349OooO0oo);
                            OooO0o(c25349OooO0oo, c25349OooO0oo.f86514OooO0oo);
                            boolean zOooo0009 = Oooo000();
                            if (this.f86571OooO0Oo.f86601OooO0O0) {
                                OooOO0o(c25349OooO0oo, pathOooOoO);
                            }
                            if (this.f86571OooO0Oo.f86602OooO0OO) {
                                OooOOO0(pathOooOoO);
                            }
                            if (zOooo0009) {
                                OooOooo(c25349OooO0oo.f86514OooO0oo);
                            }
                        }
                    }
                } else if (oooo0o instanceof C25345OooO0o.C25351OooOOOo) {
                    C25345OooO0o.C25351OooOOOo c25351OooOOOo = (C25345OooO0o.C25351OooOOOo) oooo0o;
                    OoooO(c25351OooOOOo, this.f86571OooO0Oo);
                    if (OooOO0O() && o000oOoO() && this.f86571OooO0Oo.f86602OooO0OO) {
                        Matrix matrix9 = c25351OooOOOo.f86374OooOOO;
                        if (matrix9 != null) {
                            this.f86568OooO00o.concat(matrix9);
                        }
                        C25345OooO0o.OooOOOO oooOOOO14 = c25351OooOOOo.f86384OooOOOO;
                        float fOooO0Oo5 = oooOOOO14 == null ? 0.0f : oooOOOO14.OooO0Oo(this);
                        C25345OooO0o.OooOOOO oooOOOO15 = c25351OooOOOo.f86385OooOOOo;
                        float fOooO0o02 = oooOOOO15 == null ? 0.0f : oooOOOO15.OooO0o0(this);
                        C25345OooO0o.OooOOOO oooOOOO16 = c25351OooOOOo.f86387OooOOo0;
                        float fOooO0Oo6 = oooOOOO16 == null ? 0.0f : oooOOOO16.OooO0Oo(this);
                        C25345OooO0o.OooOOOO oooOOOO17 = c25351OooOOOo.f86386OooOOo;
                        fOooO0o0 = oooOOOO17 != null ? oooOOOO17.OooO0o0(this) : 0.0f;
                        if (c25351OooOOOo.f86514OooO0oo == null) {
                            c25351OooOOOo.f86514OooO0oo = new C25345OooO0o.OooO00o(Math.min(fOooO0Oo5, fOooO0Oo6), Math.min(fOooO0o02, fOooO0o0), Math.abs(fOooO0Oo6 - fOooO0Oo5), Math.abs(fOooO0o0 - fOooO0o02));
                        }
                        Path path2 = new Path();
                        path2.moveTo(fOooO0Oo5, fOooO0o02);
                        path2.lineTo(fOooO0Oo6, fOooO0o0);
                        OoooO0(c25351OooOOOo);
                        OooO0oO(c25351OooOOOo);
                        OooO0o(c25351OooOOOo, c25351OooOOOo.f86514OooO0oo);
                        boolean zOooo00010 = Oooo000();
                        OooOOO0(path2);
                        Oooo0OO(c25351OooOOOo);
                        if (zOooo00010) {
                            OooOooo(c25351OooOOOo.f86514OooO0oo);
                        }
                    }
                } else if (oooo0o instanceof C25345OooO0o.C25358OooOoO) {
                    C25345OooO0o.C25358OooOoO c25358OooOoO = (C25345OooO0o.C25358OooOoO) oooo0o;
                    OoooO(c25358OooOoO, this.f86571OooO0Oo);
                    if (OooOO0O() && o000oOoO()) {
                        C19699OooO0oO c19699OooO0oO5 = this.f86571OooO0Oo;
                        if (c19699OooO0oO5.f86602OooO0OO || c19699OooO0oO5.f86601OooO0O0) {
                            Matrix matrix10 = c25358OooOoO.f86374OooOOO;
                            if (matrix10 != null) {
                                this.f86568OooO00o.concat(matrix10);
                            }
                            if (c25358OooOoO.f86413OooOOOO.length >= 2) {
                                Path pathOooOoOO = OooOoOO(c25358OooOoO);
                                OoooO0(c25358OooOoO);
                                OooO0oO(c25358OooOoO);
                                OooO0o(c25358OooOoO, c25358OooOoO.f86514OooO0oo);
                                boolean zOooo00011 = Oooo000();
                                if (this.f86571OooO0Oo.f86601OooO0O0) {
                                    OooOO0o(c25358OooOoO, pathOooOoOO);
                                }
                                if (this.f86571OooO0Oo.f86602OooO0OO) {
                                    OooOOO0(pathOooOoOO);
                                }
                                Oooo0OO(c25358OooOoO);
                                if (zOooo00011) {
                                    OooOooo(c25358OooOoO.f86514OooO0oo);
                                }
                            }
                        }
                    }
                } else if (oooo0o instanceof C25345OooO0o.C25359OooOoO0) {
                    C25345OooO0o.C25359OooOoO0 c25359OooOoO0 = (C25345OooO0o.C25359OooOoO0) oooo0o;
                    OoooO(c25359OooOoO0, this.f86571OooO0Oo);
                    if (OooOO0O() && o000oOoO()) {
                        C19699OooO0oO c19699OooO0oO6 = this.f86571OooO0Oo;
                        if (c19699OooO0oO6.f86602OooO0OO || c19699OooO0oO6.f86601OooO0O0) {
                            Matrix matrix11 = c25359OooOoO0.f86374OooOOO;
                            if (matrix11 != null) {
                                this.f86568OooO00o.concat(matrix11);
                            }
                            if (c25359OooOoO0.f86413OooOOOO.length >= 2) {
                                Path pathOooOoOO2 = OooOoOO(c25359OooOoO0);
                                OoooO0(c25359OooOoO0);
                                C25345OooO0o.C25363OooOooO.OooO00o oooO00o7 = this.f86571OooO0Oo.f86600OooO00o.f86424OooOoO0;
                                pathOooOoOO2.setFillType((oooO00o7 == null || oooO00o7 != C25345OooO0o.C25363OooOooO.OooO00o.f86463OooOo) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                OooO0oO(c25359OooOoO0);
                                OooO0o(c25359OooOoO0, c25359OooOoO0.f86514OooO0oo);
                                boolean zOooo00012 = Oooo000();
                                if (this.f86571OooO0Oo.f86601OooO0O0) {
                                    OooOO0o(c25359OooOoO0, pathOooOoOO2);
                                }
                                if (this.f86571OooO0Oo.f86602OooO0OO) {
                                    OooOOO0(pathOooOoOO2);
                                }
                                Oooo0OO(c25359OooOoO0);
                                if (zOooo00012) {
                                    OooOooo(c25359OooOoO0.f86514OooO0oo);
                                }
                            }
                        }
                    }
                } else if (oooo0o instanceof C25345OooO0o.o000oOoO) {
                    C25345OooO0o.o000oOoO o000oooo2 = (C25345OooO0o.o000oOoO) oooo0o;
                    OoooO(o000oooo2, this.f86571OooO0Oo);
                    if (OooOO0O()) {
                        Matrix matrix12 = o000oooo2.f86548OooOOo;
                        if (matrix12 != null) {
                            this.f86568OooO00o.concat(matrix12);
                        }
                        ArrayList arrayList = o000oooo2.f86534OooOOO;
                        float fOooO0Oo7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C25345OooO0o.OooOOOO) o000oooo2.f86534OooOOO.get(0)).OooO0Oo(this);
                        ArrayList arrayList2 = o000oooo2.f86535OooOOOO;
                        float fOooO0o03 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C25345OooO0o.OooOOOO) o000oooo2.f86535OooOOOO.get(0)).OooO0o0(this);
                        ArrayList arrayList3 = o000oooo2.f86536OooOOOo;
                        float fOooO0Oo8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C25345OooO0o.OooOOOO) o000oooo2.f86536OooOOOo.get(0)).OooO0Oo(this);
                        ArrayList arrayList4 = o000oooo2.f86537OooOOo0;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            fOooO0o0 = ((C25345OooO0o.OooOOOO) o000oooo2.f86537OooOOo0.get(0)).OooO0o0(this);
                        }
                        C25345OooO0o.C25363OooOooO.EnumC19698OooO0o enumC19698OooO0oOooOo0O = OooOo0O();
                        if (enumC19698OooO0oOooOo0O != C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86479OooOo0o) {
                            float fOooO0Oo9 = OooO0Oo(o000oooo2);
                            if (enumC19698OooO0oOooOo0O == C25345OooO0o.C25363OooOooO.EnumC19698OooO0o.f86478OooOo) {
                                fOooO0Oo9 /= 2.0f;
                            }
                            fOooO0Oo7 -= fOooO0Oo9;
                        }
                        if (o000oooo2.f86514OooO0oo == null) {
                            C25395OooO0oo c25395OooO0oo = new C25395OooO0oo(fOooO0Oo7, fOooO0o03);
                            OooOOO(o000oooo2, c25395OooO0oo);
                            RectF rectF = c25395OooO0oo.f86610OooO0OO;
                            o000oooo2.f86514OooO0oo = new C25345OooO0o.OooO00o(rectF.left, rectF.top, rectF.width(), c25395OooO0oo.f86610OooO0OO.height());
                        }
                        OoooO0(o000oooo2);
                        OooO0oO(o000oooo2);
                        OooO0o(o000oooo2, o000oooo2.f86514OooO0oo);
                        boolean zOooo00013 = Oooo000();
                        OooOOO(o000oooo2, new C25394OooO0o0(fOooO0Oo7 + fOooO0Oo8, fOooO0o03 + fOooO0o0));
                        if (zOooo00013) {
                            OooOooo(o000oooo2.f86514OooO0oo);
                        }
                    }
                }
            }
        }
        Oooo0oo();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff A[PHI: r1
      0x00ff: PHI (r1v1 float) = (r1v0 float), (r1v2 float) binds: [B:63:0x00f3, B:66:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Oooo0O0(C25345OooO0o.C25353OooOOo0 c25353OooOOo0, OooO0O0 oooO0O0) {
        float fFloatValue;
        float f;
        float f2;
        float f3;
        Oooo();
        Float f4 = c25353OooOOo0.f86396OooOo0;
        float f5 = 0.0f;
        if (f4 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f4.floatValue())) {
            float f6 = oooO0O0.f86585OooO0OO;
            if (f6 != 0.0f || oooO0O0.f86586OooO0Oo != 0.0f) {
                fFloatValue = (float) Math.toDegrees(Math.atan2(oooO0O0.f86586OooO0Oo, f6));
            }
        } else {
            fFloatValue = c25353OooOOo0.f86396OooOo0.floatValue();
        }
        float fOooO00o = c25353OooOOo0.f86392OooOOOo ? 1.0f : this.f86571OooO0Oo.f86600OooO00o.f86426OooOoo.OooO00o(this.f86569OooO0O0);
        this.f86571OooO0Oo = OooOo00(c25353OooOOo0);
        Matrix matrix = new Matrix();
        matrix.preTranslate(oooO0O0.f86583OooO00o, oooO0O0.f86584OooO0O0);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fOooO00o, fOooO00o);
        C25345OooO0o.OooOOOO oooOOOO = c25353OooOOo0.f86394OooOOo0;
        float fOooO0Oo = oooOOOO != null ? oooOOOO.OooO0Oo(this) : 0.0f;
        C25345OooO0o.OooOOOO oooOOOO2 = c25353OooOOo0.f86393OooOOo;
        float fOooO0o0 = oooOOOO2 != null ? oooOOOO2.OooO0o0(this) : 0.0f;
        C25345OooO0o.OooOOOO oooOOOO3 = c25353OooOOo0.f86395OooOOoo;
        float fOooO0Oo2 = oooOOOO3 != null ? oooOOOO3.OooO0Oo(this) : 3.0f;
        C25345OooO0o.OooOOOO oooOOOO4 = c25353OooOOo0.f86397OooOo00;
        float fOooO0o02 = oooOOOO4 != null ? oooOOOO4.OooO0o0(this) : 3.0f;
        C25345OooO0o.OooO00o oooO00o = c25353OooOOo0.f86529OooOOOO;
        Canvas canvas = this.f86568OooO00o;
        if (oooO00o != null) {
            float fMax = fOooO0Oo2 / oooO00o.f86353OooO0OO;
            float f7 = fOooO0o02 / oooO00o.f86354OooO0Oo;
            C25391OooO0o0 c25391OooO0o0 = c25353OooOOo0.f86526OooOOO;
            if (c25391OooO0o0 == null) {
                c25391OooO0o0 = C25391OooO0o0.f86550OooO0Oo;
            }
            if (!c25391OooO0o0.equals(C25391OooO0o0.f86549OooO0OO)) {
                fMax = c25391OooO0o0.f86552OooO0O0 == C25391OooO0o0.OooO0O0.f86564OooOo ? Math.max(fMax, f7) : Math.min(fMax, f7);
                f7 = fMax;
            }
            matrix.preTranslate((-fOooO0Oo) * fMax, (-fOooO0o0) * f7);
            canvas.concat(matrix);
            C25345OooO0o.OooO00o oooO00o2 = c25353OooOOo0.f86529OooOOOO;
            float f8 = oooO00o2.f86353OooO0OO * fMax;
            float f9 = oooO00o2.f86354OooO0Oo * f7;
            C25391OooO0o0.OooO00o oooO00o3 = c25391OooO0o0.f86551OooO00o;
            int iOrdinal = oooO00o3.ordinal();
            if (iOrdinal == 2) {
                f = (fOooO0Oo2 - f8) / 2.0f;
                f2 = 0.0f - f;
                switch (oooO00o3.ordinal()) {
                    case 4:
                    case 5:
                    case 6:
                        f3 = (fOooO0o02 - f9) / 2.0f;
                        f5 = 0.0f - f3;
                        if (!this.f86571OooO0Oo.f86600OooO00o.f86442OoooO0.booleanValue()) {
                            Oooo0o(f2, f5, fOooO0Oo2, fOooO0o02);
                        }
                        matrix.reset();
                        matrix.preScale(fMax, f7);
                        canvas.concat(matrix);
                        break;
                    case 7:
                    case 8:
                    case 9:
                        f3 = fOooO0o02 - f9;
                        f5 = 0.0f - f3;
                        if (!this.f86571OooO0Oo.f86600OooO00o.f86442OoooO0.booleanValue()) {
                        }
                        matrix.reset();
                        matrix.preScale(fMax, f7);
                        canvas.concat(matrix);
                        break;
                    default:
                        if (!this.f86571OooO0Oo.f86600OooO00o.f86442OoooO0.booleanValue()) {
                        }
                        matrix.reset();
                        matrix.preScale(fMax, f7);
                        canvas.concat(matrix);
                        break;
                }
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f2 = 0.0f;
                                    switch (oooO00o3.ordinal()) {
                                    }
                                }
                            }
                        }
                    }
                    f = (fOooO0Oo2 - f8) / 2.0f;
                    f2 = 0.0f - f;
                    switch (oooO00o3.ordinal()) {
                    }
                }
                f = fOooO0Oo2 - f8;
                f2 = 0.0f - f;
                switch (oooO00o3.ordinal()) {
                }
            }
        } else {
            matrix.preTranslate(-fOooO0Oo, -fOooO0o0);
            canvas.concat(matrix);
            if (!this.f86571OooO0Oo.f86600OooO00o.f86442OoooO0.booleanValue()) {
                Oooo0o(0.0f, 0.0f, fOooO0Oo2, fOooO0o02);
            }
        }
        boolean zOooo000 = Oooo000();
        Oooo0(c25353OooOOo0, false);
        if (zOooo000) {
            OooOooo(c25353OooOOo0.f86514OooO0oo);
        }
        Oooo0oo();
    }

    public final void Oooo0OO(C25345OooO0o.OooOO0O oooOO0O) {
        C25345OooO0o.C25353OooOOo0 c25353OooOOo0;
        C25345OooO0o.C25353OooOOo0 c25353OooOOo02;
        C25345OooO0o.C25353OooOOo0 c25353OooOOo03;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        C25345OooO0o.C25363OooOooO c25363OooOooO = this.f86571OooO0Oo.f86600OooO00o;
        String str = c25363OooOooO.f86441OoooO;
        if (str == null && c25363OooOooO.f86445OoooOO0 == null && c25363OooOooO.f86459o000oOoO == null) {
            return;
        }
        if (str == null) {
            c25353OooOOo0 = null;
        } else {
            C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo = oooOO0O.f86520OooO00o.OooO0Oo(str);
            if (abstractC25373Oooo0OOOooO0Oo != null) {
                c25353OooOOo0 = (C25345OooO0o.C25353OooOOo0) abstractC25373Oooo0OOOooO0Oo;
            } else {
                OooOOOO("Marker reference '%s' not found", this.f86571OooO0Oo.f86600OooO00o.f86441OoooO);
                c25353OooOOo0 = null;
            }
        }
        String str2 = this.f86571OooO0Oo.f86600OooO00o.f86445OoooOO0;
        if (str2 == null) {
            c25353OooOOo02 = null;
        } else {
            C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo2 = oooOO0O.f86520OooO00o.OooO0Oo(str2);
            if (abstractC25373Oooo0OOOooO0Oo2 != null) {
                c25353OooOOo02 = (C25345OooO0o.C25353OooOOo0) abstractC25373Oooo0OOOooO0Oo2;
            } else {
                OooOOOO("Marker reference '%s' not found", this.f86571OooO0Oo.f86600OooO00o.f86445OoooOO0);
                c25353OooOOo02 = null;
            }
        }
        String str3 = this.f86571OooO0Oo.f86600OooO00o.f86459o000oOoO;
        if (str3 == null) {
            c25353OooOOo03 = null;
        } else {
            C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO0Oo3 = oooOO0O.f86520OooO00o.OooO0Oo(str3);
            if (abstractC25373Oooo0OOOooO0Oo3 != null) {
                c25353OooOOo03 = (C25345OooO0o.C25353OooOOo0) abstractC25373Oooo0OOOooO0Oo3;
            } else {
                OooOOOO("Marker reference '%s' not found", this.f86571OooO0Oo.f86600OooO00o.f86459o000oOoO);
                c25353OooOOo03 = null;
            }
        }
        float f4 = 0.0f;
        if (oooOO0O instanceof C25345OooO0o.C25355OooOo0) {
            arrayList = new OooO00o(this, ((C25345OooO0o.C25355OooOo0) oooOO0O).f86406OooOOOO).f86575OooO00o;
            f2 = 0.0f;
            i = 1;
        } else if (oooOO0O instanceof C25345OooO0o.C25351OooOOOo) {
            C25345OooO0o.C25351OooOOOo c25351OooOOOo = (C25345OooO0o.C25351OooOOOo) oooOO0O;
            C25345OooO0o.OooOOOO oooOOOO = c25351OooOOOo.f86384OooOOOO;
            float fOooO0Oo = oooOOOO != null ? oooOOOO.OooO0Oo(this) : 0.0f;
            C25345OooO0o.OooOOOO oooOOOO2 = c25351OooOOOo.f86385OooOOOo;
            float fOooO0o0 = oooOOOO2 != null ? oooOOOO2.OooO0o0(this) : 0.0f;
            C25345OooO0o.OooOOOO oooOOOO3 = c25351OooOOOo.f86387OooOOo0;
            float fOooO0Oo2 = oooOOOO3 != null ? oooOOOO3.OooO0Oo(this) : 0.0f;
            C25345OooO0o.OooOOOO oooOOOO4 = c25351OooOOOo.f86386OooOOo;
            float fOooO0o02 = oooOOOO4 != null ? oooOOOO4.OooO0o0(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f5 = fOooO0Oo2 - fOooO0Oo;
            i = 1;
            float f6 = fOooO0o02 - fOooO0o0;
            arrayList2.add(new OooO0O0(fOooO0Oo, fOooO0o0, f5, f6));
            arrayList2.add(new OooO0O0(fOooO0Oo2, fOooO0o02, f5, f6));
            f2 = 0.0f;
            arrayList = arrayList2;
        } else {
            i = 1;
            C25345OooO0o.C25359OooOoO0 c25359OooOoO0 = (C25345OooO0o.C25359OooOoO0) oooOO0O;
            int length = c25359OooOoO0.f86413OooOOOO.length;
            if (length < 2) {
                arrayList = null;
                f2 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = c25359OooOoO0.f86413OooOOOO;
                OooO0O0 oooO0O0 = new OooO0O0(fArr[0], fArr[1], 0.0f, 0.0f);
                int i2 = 2;
                float f7 = 0.0f;
                float f8 = 0.0f;
                while (true) {
                    f = oooO0O0.f86584OooO0O0;
                    f2 = f4;
                    f3 = oooO0O0.f86583OooO00o;
                    if (i2 >= length) {
                        break;
                    }
                    float[] fArr2 = c25359OooOoO0.f86413OooOOOO;
                    float f9 = fArr2[i2];
                    float f10 = fArr2[i2 + 1];
                    oooO0O0.OooO00o(f9, f10);
                    arrayList3.add(oooO0O0);
                    oooO0O0 = new OooO0O0(f9, f10, f9 - f3, f10 - f);
                    i2 += 2;
                    f8 = f10;
                    f7 = f9;
                    f4 = f2;
                }
                if (c25359OooOoO0 instanceof C25345OooO0o.C25358OooOoO) {
                    float[] fArr3 = c25359OooOoO0.f86413OooOOOO;
                    float f11 = fArr3[0];
                    if (f7 != f11) {
                        float f12 = fArr3[1];
                        if (f8 != f12) {
                            oooO0O0.OooO00o(f11, f12);
                            arrayList3.add(oooO0O0);
                            OooO0O0 oooO0O02 = new OooO0O0(f11, f12, f11 - f3, f12 - f);
                            oooO0O02.OooO0O0((OooO0O0) arrayList3.get(0));
                            arrayList3.add(oooO0O02);
                            arrayList3.set(0, oooO0O02);
                        }
                    }
                } else {
                    arrayList3.add(oooO0O0);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        C25345OooO0o.C25363OooOooO c25363OooOooO2 = this.f86571OooO0Oo.f86600OooO00o;
        c25363OooOooO2.f86459o000oOoO = null;
        c25363OooOooO2.f86445OoooOO0 = null;
        c25363OooOooO2.f86441OoooO = null;
        if (c25353OooOOo0 != null) {
            Oooo0O0(c25353OooOOo0, (OooO0O0) arrayList.get(0));
        }
        if (c25353OooOOo02 != null && arrayList.size() > 2) {
            OooO0O0 oooO0O03 = (OooO0O0) arrayList.get(0);
            OooO0O0 oooO0O04 = (OooO0O0) arrayList.get(i);
            int i3 = 1;
            while (i3 < size - 1) {
                i3++;
                OooO0O0 oooO0O05 = (OooO0O0) arrayList.get(i3);
                if (oooO0O04.f86587OooO0o0) {
                    float f13 = oooO0O04.f86585OooO0OO;
                    float f14 = oooO0O04.f86586OooO0Oo;
                    float f15 = oooO0O03.f86583OooO00o;
                    float f16 = oooO0O04.f86583OooO00o;
                    float f17 = oooO0O04.f86584OooO0O0;
                    float f18 = ((f17 - oooO0O03.f86584OooO0O0) * f14) + ((f16 - f15) * f13);
                    if (f18 == f2) {
                        f18 = ((oooO0O05.f86583OooO00o - f16) * f13) + ((oooO0O05.f86584OooO0O0 - f17) * f14);
                    }
                    if (f18 <= f2 && (f18 != f2 || (f13 <= f2 && f14 < f2))) {
                        oooO0O04.f86585OooO0OO = -f13;
                        oooO0O04.f86586OooO0Oo = -f14;
                    }
                }
                Oooo0O0(c25353OooOOo02, oooO0O04);
                oooO0O03 = oooO0O04;
                oooO0O04 = oooO0O05;
            }
        }
        if (c25353OooOOo03 != null) {
            Oooo0O0(c25353OooOOo03, (OooO0O0) arrayList.get(size - 1));
        }
    }

    public final void Oooo0o(float f, float f2, float f3, float f4) {
        float fOooO0Oo = f3 + f;
        float fOooO0o0 = f4 + f2;
        C25345OooO0o.OooO0O0 oooO0O0 = this.f86571OooO0Oo.f86600OooO00o.f86444OoooO0O;
        if (oooO0O0 != null) {
            f += oooO0O0.f86358OooO0Oo.OooO0Oo(this);
            f2 += this.f86571OooO0Oo.f86600OooO00o.f86444OoooO0O.f86355OooO00o.OooO0o0(this);
            fOooO0Oo -= this.f86571OooO0Oo.f86600OooO00o.f86444OoooO0O.f86356OooO0O0.OooO0Oo(this);
            fOooO0o0 -= this.f86571OooO0Oo.f86600OooO00o.f86444OoooO0O.f86357OooO0OO.OooO0o0(this);
        }
        this.f86568OooO00o.clipRect(f, f2, fOooO0Oo, fOooO0o0);
    }

    public final void Oooo0o0(C25345OooO0o.C25352OooOOo c25352OooOOo, C25345OooO0o.OooO00o oooO00o) {
        float fOooO0Oo;
        float fOooO0o0;
        Boolean bool = c25352OooOOo.f86388OooOOO;
        if (bool == null || !bool.booleanValue()) {
            C25345OooO0o.OooOOOO oooOOOO = c25352OooOOo.f86390OooOOOo;
            float fOooO0OO = oooOOOO != null ? oooOOOO.OooO0OO(this, 1.0f) : 1.2f;
            C25345OooO0o.OooOOOO oooOOOO2 = c25352OooOOo.f86391OooOOo0;
            float fOooO0OO2 = oooOOOO2 != null ? oooOOOO2.OooO0OO(this, 1.0f) : 1.2f;
            fOooO0Oo = fOooO0OO * oooO00o.f86353OooO0OO;
            fOooO0o0 = fOooO0OO2 * oooO00o.f86354OooO0Oo;
        } else {
            C25345OooO0o.OooOOOO oooOOOO3 = c25352OooOOo.f86390OooOOOo;
            fOooO0Oo = oooOOOO3 != null ? oooOOOO3.OooO0Oo(this) : oooO00o.f86353OooO0OO;
            C25345OooO0o.OooOOOO oooOOOO4 = c25352OooOOo.f86391OooOOo0;
            fOooO0o0 = oooOOOO4 != null ? oooOOOO4.OooO0o0(this) : oooO00o.f86354OooO0Oo;
        }
        if (fOooO0Oo == 0.0f || fOooO0o0 == 0.0f) {
            return;
        }
        Oooo();
        C19699OooO0oO c19699OooO0oOOooOo00 = OooOo00(c25352OooOOo);
        this.f86571OooO0Oo = c19699OooO0oOOooOo00;
        c19699OooO0oOOooOo00.f86600OooO00o.f86431Oooo0 = Float.valueOf(1.0f);
        boolean zOooo000 = Oooo000();
        Canvas canvas = this.f86568OooO00o;
        canvas.save();
        Boolean bool2 = c25352OooOOo.f86389OooOOOO;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(oooO00o.f86351OooO00o, oooO00o.f86352OooO0O0);
            canvas.scale(oooO00o.f86353OooO0OO, oooO00o.f86354OooO0Oo);
        }
        Oooo0(c25352OooOOo, false);
        canvas.restore();
        if (zOooo000) {
            OooOooo(oooO00o);
        }
        Oooo0oo();
    }

    public final void Oooo0oo() {
        this.f86568OooO00o.restore();
        this.f86571OooO0Oo = this.f86573OooO0o0.pop();
    }

    public final void OoooO(C25345OooO0o.AbstractC25373Oooo0OO abstractC25373Oooo0OO, C19699OooO0oO c19699OooO0oO) {
        boolean z = abstractC25373Oooo0OO.f86521OooO0O0 == null;
        C25345OooO0o.C25363OooOooO c25363OooOooO = c19699OooO0oO.f86600OooO00o;
        Boolean bool = Boolean.TRUE;
        c25363OooOooO.f86446OoooOOO = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c25363OooOooO.f86442OoooO0 = bool;
        c25363OooOooO.f86444OoooO0O = null;
        c25363OooOooO.f86450OoooOoo = null;
        c25363OooOooO.f86431Oooo0 = Float.valueOf(1.0f);
        c25363OooOooO.f86448OoooOo0 = C25345OooO0o.C25347OooO0o0.f86364OooOo;
        c25363OooOooO.f86449OoooOoO = Float.valueOf(1.0f);
        c25363OooOooO.f86452Ooooo0o = null;
        c25363OooOooO.f86453OooooO0 = null;
        c25363OooOooO.f86454OooooOO = Float.valueOf(1.0f);
        c25363OooOooO.f86455OooooOo = null;
        c25363OooOooO.f86457Oooooo0 = Float.valueOf(1.0f);
        c25363OooOooO.f86456Oooooo = C25345OooO0o.C25363OooOooO.OooO.f86461OooOo0o;
        C25345OooO0o.C25363OooOooO c25363OooOooO2 = abstractC25373Oooo0OO.f86518OooO0o0;
        if (c25363OooOooO2 != null) {
            OoooO0O(c19699OooO0oO, c25363OooOooO2);
        }
        ArrayList arrayList = this.f86570OooO0OO.f86344OooO0O0.f86329OooO00o;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (C25334OooO0O0.OooOOOO oooOOOO : this.f86570OooO0OO.f86344OooO0O0.f86329OooO00o) {
                if (C25334OooO0O0.OooO0oO(oooOOOO.f86326OooO00o, abstractC25373Oooo0OO)) {
                    OoooO0O(c19699OooO0oO, oooOOOO.f86327OooO0O0);
                }
            }
        }
        C25345OooO0o.C25363OooOooO c25363OooOooO3 = abstractC25373Oooo0OO.f86517OooO0o;
        if (c25363OooOooO3 != null) {
            OoooO0O(c19699OooO0oO, c25363OooOooO3);
        }
    }

    public final void OoooO0(C25345OooO0o.AbstractC25372Oooo0O0 abstractC25372Oooo0O0) {
        if (abstractC25372Oooo0O0.f86521OooO0O0 == null || abstractC25372Oooo0O0.f86514OooO0oo == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f86574OooO0oO.peek().invert(matrix)) {
            C25345OooO0o.OooO00o oooO00o = abstractC25372Oooo0O0.f86514OooO0oo;
            float f = oooO00o.f86351OooO00o;
            float f2 = oooO00o.f86352OooO0O0;
            float fOooO00o = oooO00o.OooO00o();
            C25345OooO0o.OooO00o oooO00o2 = abstractC25372Oooo0O0.f86514OooO0oo;
            float f3 = oooO00o2.f86352OooO0O0;
            float fOooO00o2 = oooO00o2.OooO00o();
            float fOooO0O0 = abstractC25372Oooo0O0.f86514OooO0oo.OooO0O0();
            C25345OooO0o.OooO00o oooO00o3 = abstractC25372Oooo0O0.f86514OooO0oo;
            float[] fArr = {f, f2, fOooO00o, f3, fOooO00o2, fOooO0O0, oooO00o3.f86351OooO00o, oooO00o3.OooO0O0()};
            matrix.preConcat(this.f86568OooO00o.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            C25345OooO0o.AbstractC25372Oooo0O0 abstractC25372Oooo0O02 = (C25345OooO0o.AbstractC25372Oooo0O0) this.f86572OooO0o.peek();
            C25345OooO0o.OooO00o oooO00o4 = abstractC25372Oooo0O02.f86514OooO0oo;
            if (oooO00o4 == null) {
                float f8 = rectF.left;
                float f9 = rectF.top;
                abstractC25372Oooo0O02.f86514OooO0oo = new C25345OooO0o.OooO00o(f8, f9, rectF.right - f8, rectF.bottom - f9);
                return;
            }
            float f10 = rectF.left;
            float f11 = rectF.top;
            float f12 = rectF.right - f10;
            float f13 = rectF.bottom - f11;
            if (f10 < oooO00o4.f86351OooO00o) {
                oooO00o4.f86351OooO00o = f10;
            }
            if (f11 < oooO00o4.f86352OooO0O0) {
                oooO00o4.f86352OooO0O0 = f11;
            }
            if (f10 + f12 > oooO00o4.OooO00o()) {
                oooO00o4.f86353OooO0OO = (f10 + f12) - oooO00o4.f86351OooO00o;
            }
            if (f11 + f13 > oooO00o4.OooO0O0()) {
                oooO00o4.f86354OooO0Oo = (f11 + f13) - oooO00o4.f86352OooO0O0;
            }
        }
    }

    public final String OoooO00(String str, boolean z, boolean z2) {
        if (this.f86571OooO0Oo.f86607OooO0oo) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void OoooO0O(C19699OooO0oO c19699OooO0oO, C25345OooO0o.C25363OooOooO c25363OooOooO) {
        C25345OooO0o.C25363OooOooO c25363OooOooO2;
        if (OooOo(c25363OooOooO, 4096L)) {
            c19699OooO0oO.f86600OooO00o.f86435Oooo0O0 = c25363OooOooO.f86435Oooo0O0;
        }
        if (OooOo(c25363OooOooO, 2048L)) {
            c19699OooO0oO.f86600OooO00o.f86431Oooo0 = c25363OooOooO.f86431Oooo0;
        }
        boolean zOooOo = OooOo(c25363OooOooO, 1L);
        C25345OooO0o.C25347OooO0o0 c25347OooO0o0 = C25345OooO0o.C25347OooO0o0.f86365OooOoO0;
        if (zOooOo) {
            c19699OooO0oO.f86600OooO00o.f86421OooOo = c25363OooOooO.f86421OooOo;
            C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO = c25363OooOooO.f86421OooOo;
            c19699OooO0oO.f86601OooO0O0 = (abstractC25375Oooo0oO == null || abstractC25375Oooo0oO == c25347OooO0o0) ? false : true;
        }
        if (OooOo(c25363OooOooO, 4L)) {
            c19699OooO0oO.f86600OooO00o.f86423OooOoO = c25363OooOooO.f86423OooOoO;
        }
        if (OooOo(c25363OooOooO, 6149L)) {
            Oooo0oO(c19699OooO0oO, true, c19699OooO0oO.f86600OooO00o.f86421OooOo);
        }
        if (OooOo(c25363OooOooO, 2L)) {
            c19699OooO0oO.f86600OooO00o.f86424OooOoO0 = c25363OooOooO.f86424OooOoO0;
        }
        if (OooOo(c25363OooOooO, 8L)) {
            c19699OooO0oO.f86600OooO00o.f86425OooOoOO = c25363OooOooO.f86425OooOoOO;
            C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO2 = c25363OooOooO.f86425OooOoOO;
            c19699OooO0oO.f86602OooO0OO = (abstractC25375Oooo0oO2 == null || abstractC25375Oooo0oO2 == c25347OooO0o0) ? false : true;
        }
        if (OooOo(c25363OooOooO, 16L)) {
            c19699OooO0oO.f86600OooO00o.f86427OooOoo0 = c25363OooOooO.f86427OooOoo0;
        }
        if (OooOo(c25363OooOooO, 6168L)) {
            Oooo0oO(c19699OooO0oO, false, c19699OooO0oO.f86600OooO00o.f86425OooOoOO);
        }
        if (OooOo(c25363OooOooO, 34359738368L)) {
            c19699OooO0oO.f86600OooO00o.f86456Oooooo = c25363OooOooO.f86456Oooooo;
        }
        if (OooOo(c25363OooOooO, 32L)) {
            C25345OooO0o.C25363OooOooO c25363OooOooO3 = c19699OooO0oO.f86600OooO00o;
            C25345OooO0o.OooOOOO oooOOOO = c25363OooOooO.f86426OooOoo;
            c25363OooOooO3.f86426OooOoo = oooOOOO;
            c19699OooO0oO.f86605OooO0o0.setStrokeWidth(oooOOOO.OooO0O0(this));
        }
        if (OooOo(c25363OooOooO, 64L)) {
            c19699OooO0oO.f86600OooO00o.f86428OooOooO = c25363OooOooO.f86428OooOooO;
            int iOrdinal = c25363OooOooO.f86428OooOooO.ordinal();
            Paint paint = c19699OooO0oO.f86605OooO0o0;
            if (iOrdinal == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iOrdinal == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iOrdinal == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (OooOo(c25363OooOooO, 128L)) {
            c19699OooO0oO.f86600OooO00o.f86429OooOooo = c25363OooOooO.f86429OooOooo;
            int iOrdinal2 = c25363OooOooO.f86429OooOooo.ordinal();
            Paint paint2 = c19699OooO0oO.f86605OooO0o0;
            if (iOrdinal2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iOrdinal2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iOrdinal2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (OooOo(c25363OooOooO, 256L)) {
            c19699OooO0oO.f86600OooO00o.f86432Oooo000 = c25363OooOooO.f86432Oooo000;
            c19699OooO0oO.f86605OooO0o0.setStrokeMiter(c25363OooOooO.f86432Oooo000.floatValue());
        }
        if (OooOo(c25363OooOooO, 512L)) {
            c19699OooO0oO.f86600OooO00o.f86433Oooo00O = c25363OooOooO.f86433Oooo00O;
        }
        if (OooOo(c25363OooOooO, 1024L)) {
            c19699OooO0oO.f86600OooO00o.f86434Oooo00o = c25363OooOooO.f86434Oooo00o;
        }
        Typeface typefaceOooO0oo = null;
        if (OooOo(c25363OooOooO, 1536L)) {
            C25345OooO0o.OooOOOO[] oooOOOOArr = c19699OooO0oO.f86600OooO00o.f86433Oooo00O;
            Paint paint3 = c19699OooO0oO.f86605OooO0o0;
            if (oooOOOOArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = oooOOOOArr.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                int i2 = 0;
                float f = 0.0f;
                while (true) {
                    c25363OooOooO2 = c19699OooO0oO.f86600OooO00o;
                    if (i2 >= i) {
                        break;
                    }
                    float fOooO0O0 = c25363OooOooO2.f86433Oooo00O[i2 % length].OooO0O0(this);
                    fArr[i2] = fOooO0O0;
                    f += fOooO0O0;
                    i2++;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fOooO0O02 = c25363OooOooO2.f86434Oooo00o.OooO0O0(this);
                    if (fOooO0O02 < 0.0f) {
                        fOooO0O02 = (fOooO0O02 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fOooO0O02));
                }
            }
        }
        if (OooOo(c25363OooOooO, 16384L)) {
            float textSize = this.f86571OooO0Oo.f86603OooO0Oo.getTextSize();
            c19699OooO0oO.f86600OooO00o.f86438Oooo0o0 = c25363OooOooO.f86438Oooo0o0;
            c19699OooO0oO.f86603OooO0Oo.setTextSize(c25363OooOooO.f86438Oooo0o0.OooO0OO(this, textSize));
            c19699OooO0oO.f86605OooO0o0.setTextSize(c25363OooOooO.f86438Oooo0o0.OooO0OO(this, textSize));
        }
        if (OooOo(c25363OooOooO, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            c19699OooO0oO.f86600OooO00o.f86436Oooo0OO = c25363OooOooO.f86436Oooo0OO;
        }
        if (OooOo(c25363OooOooO, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (c25363OooOooO.f86437Oooo0o.intValue() == -1 && c19699OooO0oO.f86600OooO00o.f86437Oooo0o.intValue() > 100) {
                C25345OooO0o.C25363OooOooO c25363OooOooO4 = c19699OooO0oO.f86600OooO00o;
                c25363OooOooO4.f86437Oooo0o = Integer.valueOf(c25363OooOooO4.f86437Oooo0o.intValue() - 100);
            } else if (c25363OooOooO.f86437Oooo0o.intValue() != 1 || c19699OooO0oO.f86600OooO00o.f86437Oooo0o.intValue() >= 900) {
                c19699OooO0oO.f86600OooO00o.f86437Oooo0o = c25363OooOooO.f86437Oooo0o;
            } else {
                C25345OooO0o.C25363OooOooO c25363OooOooO5 = c19699OooO0oO.f86600OooO00o;
                c25363OooOooO5.f86437Oooo0o = Integer.valueOf(c25363OooOooO5.f86437Oooo0o.intValue() + 100);
            }
        }
        if (OooOo(c25363OooOooO, 65536L)) {
            c19699OooO0oO.f86600OooO00o.f86439Oooo0oO = c25363OooOooO.f86439Oooo0oO;
        }
        if (OooOo(c25363OooOooO, 106496L)) {
            C25345OooO0o.C25363OooOooO c25363OooOooO6 = c19699OooO0oO.f86600OooO00o;
            ArrayList arrayList = c25363OooOooO6.f86436Oooo0OO;
            if (arrayList != null && this.f86570OooO0OO != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceOooO0oo = OooO0oo((String) it.next(), c25363OooOooO6.f86437Oooo0o, c25363OooOooO6.f86439Oooo0oO)) == null) {
                }
            }
            if (typefaceOooO0oo == null) {
                typefaceOooO0oo = OooO0oo("serif", c25363OooOooO6.f86437Oooo0o, c25363OooOooO6.f86439Oooo0oO);
            }
            c19699OooO0oO.f86603OooO0Oo.setTypeface(typefaceOooO0oo);
            c19699OooO0oO.f86605OooO0o0.setTypeface(typefaceOooO0oo);
        }
        if (OooOo(c25363OooOooO, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            c19699OooO0oO.f86600OooO00o.f86440Oooo0oo = c25363OooOooO.f86440Oooo0oo;
            Paint paint4 = c19699OooO0oO.f86603OooO0Oo;
            C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO enumC25366OooO0oO = c25363OooOooO.f86440Oooo0oo;
            C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO enumC25366OooO0oO2 = C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO.f86488OooOoO;
            paint4.setStrikeThruText(enumC25366OooO0oO == enumC25366OooO0oO2);
            C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO enumC25366OooO0oO3 = c25363OooOooO.f86440Oooo0oo;
            C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO enumC25366OooO0oO4 = C25345OooO0o.C25363OooOooO.EnumC25366OooO0oO.f86486OooOo;
            paint4.setUnderlineText(enumC25366OooO0oO3 == enumC25366OooO0oO4);
            Paint paint5 = c19699OooO0oO.f86605OooO0o0;
            paint5.setStrikeThruText(c25363OooOooO.f86440Oooo0oo == enumC25366OooO0oO2);
            paint5.setUnderlineText(c25363OooOooO.f86440Oooo0oo == enumC25366OooO0oO4);
        }
        if (OooOo(c25363OooOooO, 68719476736L)) {
            c19699OooO0oO.f86600OooO00o.f86430Oooo = c25363OooOooO.f86430Oooo;
        }
        if (OooOo(c25363OooOooO, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            c19699OooO0oO.f86600OooO00o.f86443OoooO00 = c25363OooOooO.f86443OoooO00;
        }
        if (OooOo(c25363OooOooO, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            c19699OooO0oO.f86600OooO00o.f86442OoooO0 = c25363OooOooO.f86442OoooO0;
        }
        if (OooOo(c25363OooOooO, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
            c19699OooO0oO.f86600OooO00o.f86441OoooO = c25363OooOooO.f86441OoooO;
        }
        if (OooOo(c25363OooOooO, 4194304L)) {
            c19699OooO0oO.f86600OooO00o.f86445OoooOO0 = c25363OooOooO.f86445OoooOO0;
        }
        if (OooOo(c25363OooOooO, 8388608L)) {
            c19699OooO0oO.f86600OooO00o.f86459o000oOoO = c25363OooOooO.f86459o000oOoO;
        }
        if (OooOo(c25363OooOooO, C18163eb.f54662y)) {
            c19699OooO0oO.f86600OooO00o.f86446OoooOOO = c25363OooOooO.f86446OoooOOO;
        }
        if (OooOo(c25363OooOooO, 33554432L)) {
            c19699OooO0oO.f86600OooO00o.f86447OoooOOo = c25363OooOooO.f86447OoooOOo;
        }
        if (OooOo(c25363OooOooO, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            c19699OooO0oO.f86600OooO00o.f86444OoooO0O = c25363OooOooO.f86444OoooO0O;
        }
        if (OooOo(c25363OooOooO, 268435456L)) {
            c19699OooO0oO.f86600OooO00o.f86450OoooOoo = c25363OooOooO.f86450OoooOoo;
        }
        if (OooOo(c25363OooOooO, 536870912L)) {
            c19699OooO0oO.f86600OooO00o.f86451Ooooo00 = c25363OooOooO.f86451Ooooo00;
        }
        if (OooOo(c25363OooOooO, 1073741824L)) {
            c19699OooO0oO.f86600OooO00o.f86452Ooooo0o = c25363OooOooO.f86452Ooooo0o;
        }
        if (OooOo(c25363OooOooO, 67108864L)) {
            c19699OooO0oO.f86600OooO00o.f86448OoooOo0 = c25363OooOooO.f86448OoooOo0;
        }
        if (OooOo(c25363OooOooO, 134217728L)) {
            c19699OooO0oO.f86600OooO00o.f86449OoooOoO = c25363OooOooO.f86449OoooOoO;
        }
        if (OooOo(c25363OooOooO, 8589934592L)) {
            c19699OooO0oO.f86600OooO00o.f86455OooooOo = c25363OooOooO.f86455OooooOo;
        }
        if (OooOo(c25363OooOooO, 17179869184L)) {
            c19699OooO0oO.f86600OooO00o.f86457Oooooo0 = c25363OooOooO.f86457Oooooo0;
        }
        if (OooOo(c25363OooOooO, 137438953472L)) {
            c19699OooO0oO.f86600OooO00o.f86458OoooooO = c25363OooOooO.f86458OoooooO;
        }
    }

    public final void OoooOO0() {
        int iOooO;
        C25345OooO0o.C25363OooOooO c25363OooOooO = this.f86571OooO0Oo.f86600OooO00o;
        C25345OooO0o.AbstractC25375Oooo0oO abstractC25375Oooo0oO = c25363OooOooO.f86455OooooOo;
        if (abstractC25375Oooo0oO instanceof C25345OooO0o.C25347OooO0o0) {
            iOooO = ((C25345OooO0o.C25347OooO0o0) abstractC25375Oooo0oO).f86366OooOo0o;
        } else if (!(abstractC25375Oooo0oO instanceof C25345OooO0o.C19697OooO0o)) {
            return;
        } else {
            iOooO = c25363OooOooO.f86435Oooo0O0.f86366OooOo0o;
        }
        Float f = c25363OooOooO.f86457Oooooo0;
        if (f != null) {
            iOooO = OooO(iOooO, f.floatValue());
        }
        this.f86568OooO00o.drawColor(iOooO);
    }

    public final boolean o000oOoO() {
        Boolean bool = this.f86571OooO0Oo.f86600OooO00o.f86447OoooOOo;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0oO$OooO0oO, reason: collision with other inner class name */
    public class C19699OooO0oO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25345OooO0o.C25363OooOooO f86600OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f86601OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f86602OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Paint f86603OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public C25345OooO0o.OooO00o f86604OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Paint f86605OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public C25345OooO0o.OooO00o f86606OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f86607OooO0oo;

        public C19699OooO0oO() {
            Paint paint = new Paint();
            this.f86603OooO0Oo = paint;
            paint.setFlags(193);
            paint.setHinting(0);
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.f86605OooO0o0 = paint2;
            paint2.setFlags(193);
            paint2.setHinting(0);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.f86600OooO00o = C25345OooO0o.C25363OooOooO.OooO00o();
        }

        public C19699OooO0oO(C19699OooO0oO c19699OooO0oO) {
            this.f86601OooO0O0 = c19699OooO0oO.f86601OooO0O0;
            this.f86602OooO0OO = c19699OooO0oO.f86602OooO0OO;
            this.f86603OooO0Oo = new Paint(c19699OooO0oO.f86603OooO0Oo);
            this.f86605OooO0o0 = new Paint(c19699OooO0oO.f86605OooO0o0);
            C25345OooO0o.OooO00o oooO00o = c19699OooO0oO.f86604OooO0o;
            if (oooO00o != null) {
                this.f86604OooO0o = new C25345OooO0o.OooO00o(oooO00o);
            }
            C25345OooO0o.OooO00o oooO00o2 = c19699OooO0oO.f86606OooO0oO;
            if (oooO00o2 != null) {
                this.f86606OooO0oO = new C25345OooO0o.OooO00o(oooO00o2);
            }
            this.f86607OooO0oo = c19699OooO0oO.f86607OooO0oo;
            try {
                this.f86600OooO00o = (C25345OooO0o.C25363OooOooO) c19699OooO0oO.f86600OooO00o.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.f86600OooO00o = C25345OooO0o.C25363OooOooO.OooO00o();
            }
        }
    }
}
