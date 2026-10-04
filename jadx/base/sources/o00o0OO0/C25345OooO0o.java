package o00o0OO0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.common.java.jwt.AbstractJwtRequest;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import o00o0OO0.C25334OooO0O0;
import o00o0OO0.C25392OooO0oO;

/* JADX INFO: renamed from: o00o0OO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25345OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C25368OooOooo f86343OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25334OooO0O0.C25339OooOOOo f86344OooO0O0 = new C25334OooO0O0.C25339OooOOOo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f86345OooO0OO = new HashMap();

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooO */
    public static abstract class OooO extends AbstractC25373Oooo0OO implements Oooo0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Boolean f86346OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ArrayList f86347OooO0oo = new ArrayList();

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public Matrix f86348OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public OooOO0 f86349OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public String f86350OooOO0o;

        @Override // o00o0OO0.C25345OooO0o.Oooo0
        public final void OooO0OO(Oooo0o oooo0o) throws C25396OooO0oo {
            if (oooo0o instanceof C25361OooOoo) {
                this.f86347OooO0oo.add(oooo0o);
                return;
            }
            throw new C25396OooO0oo("Gradient elements cannot contain " + oooo0o + " elements.");
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0
        public final List<Oooo0o> getChildren() {
            return this.f86347OooO0oo;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooO0O0 */
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooOOOO f86355OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooOOOO f86356OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooOOOO f86357OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooOOOO f86358OooO0Oo;
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooO0OO */
    public static class OooO0OO extends OooOO0O {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public OooOOOO f86359OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public OooOOOO f86360OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public OooOOOO f86361OooOOo0;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "circle";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    public static class C25346OooO0Oo extends C25350OooOO0o implements InterfaceC25354OooOOoo {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Boolean f86362OooOOOO;

        @Override // o00o0OO0.C25345OooO0o.C25350OooOO0o, o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "clipPath";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooO0o, reason: collision with other inner class name */
    public static class C19697OooO0o extends AbstractC25375Oooo0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final C19697OooO0o f86363OooOo0o = new C19697OooO0o();
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooO0o0, reason: case insensitive filesystem */
    public static class C25347OooO0o0 extends AbstractC25375Oooo0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final C25347OooO0o0 f86364OooOo = new C25347OooO0o0(ViewCompat.MEASURED_STATE_MASK);

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final C25347OooO0o0 f86365OooOoO0 = new C25347OooO0o0(0);

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f86366OooOo0o;

        public C25347OooO0o0(int i) {
            this.f86366OooOo0o = i;
        }

        public final String toString() {
            return String.format("#%08x", Integer.valueOf(this.f86366OooOo0o));
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooO0oO, reason: case insensitive filesystem */
    public static class C25348OooO0oO extends C25350OooOO0o implements InterfaceC25354OooOOoo {
        @Override // o00o0OO0.C25345OooO0o.C25350OooOO0o, o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "defs";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooO0oo, reason: case insensitive filesystem */
    public static class C25349OooO0oo extends OooOO0O {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public OooOOOO f86367OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public OooOOOO f86368OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public OooOOOO f86369OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public OooOOOO f86370OooOOo0;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "ellipse";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOO0 */
    public static final class OooOO0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooOO0 f86371OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooOO0 f86372OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooOO0[] f86373OooOoO0;

        /* JADX INFO: Fake field, exist only in values array */
        OooOO0 EF0;

        static {
            OooOO0 oooOO02 = new OooOO0("pad", 0);
            OooOO0 oooOO03 = new OooOO0("reflect", 1);
            f86372OooOo0o = oooOO03;
            OooOO0 oooOO04 = new OooOO0("repeat", 2);
            f86371OooOo = oooOO04;
            f86373OooOoO0 = new OooOO0[]{oooOO02, oooOO03, oooOO04};
        }

        public OooOO0() {
            throw null;
        }

        public static OooOO0 valueOf(String str) {
            return (OooOO0) Enum.valueOf(OooOO0.class, str);
        }

        public static OooOO0[] values() {
            return (OooOO0[]) f86373OooOoO0.clone();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOO0O */
    public static abstract class OooOO0O extends AbstractC25371Oooo00o implements OooOOO0 {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Matrix f86374OooOOO;

        public OooOO0O() {
            this.f86509OooO = null;
            this.f86510OooOO0 = null;
            this.f86511OooOO0O = null;
            this.f86512OooOO0o = null;
            this.f86513OooOOO0 = null;
        }

        @Override // o00o0OO0.C25345OooO0o.OooOOO0
        public final void OooOO0O(Matrix matrix) {
            this.f86374OooOOO = matrix;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOO0o, reason: case insensitive filesystem */
    public static class C25350OooOO0o extends AbstractC25370Oooo00O implements OooOOO0 {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Matrix f86375OooOOO;

        @Override // o00o0OO0.C25345OooO0o.OooOOO0
        public final void OooOO0O(Matrix matrix) {
            this.f86375OooOOO = matrix;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public String OooOOO0() {
            return "group";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOOO */
    public static class OooOOO extends AbstractC25376Oooo0oo implements OooOOO0 {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public String f86376OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public OooOOOO f86377OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public OooOOOO f86378OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public OooOOOO f86379OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public OooOOOO f86380OooOOoo;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public Matrix f86381OooOo00;

        @Override // o00o0OO0.C25345OooO0o.OooOOO0
        public final void OooOO0O(Matrix matrix) {
            this.f86381OooOo00 = matrix;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "image";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOOO0 */
    public interface OooOOO0 {
        void OooOO0O(Matrix matrix);
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOOOo, reason: case insensitive filesystem */
    public static class C25351OooOOOo extends OooOO0O {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public OooOOOO f86384OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public OooOOOO f86385OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public OooOOOO f86386OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public OooOOOO f86387OooOOo0;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "line";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOOo, reason: case insensitive filesystem */
    public static class C25352OooOOo extends AbstractC25370Oooo00O implements InterfaceC25354OooOOoo {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Boolean f86388OooOOO;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Boolean f86389OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public OooOOOO f86390OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public OooOOOO f86391OooOOo0;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "mask";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOOo0, reason: case insensitive filesystem */
    public static class C25353OooOOo0 extends AbstractC25379OoooO00 implements InterfaceC25354OooOOoo {

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public boolean f86392OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public OooOOOO f86393OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public OooOOOO f86394OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public OooOOOO f86395OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public Float f86396OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public OooOOOO f86397OooOo00;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return RequestParameters.MARKER;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOOoo, reason: case insensitive filesystem */
    public interface InterfaceC25354OooOOoo {
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOo */
    public static class OooOo extends AbstractC25379OoooO00 implements InterfaceC25354OooOOoo {

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Boolean f86398OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public Matrix f86399OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public Boolean f86400OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public OooOOOO f86401OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public OooOOOO f86402OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public OooOOOO f86403OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public OooOOOO f86404OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public String f86405OooOo0o;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "pattern";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOo0, reason: case insensitive filesystem */
    public static class C25355OooOo0 extends OooOO0O {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public C25356OooOo0O f86406OooOOOO;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "path";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOo00 */
    public static class OooOo00 extends AbstractC25375Oooo0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final AbstractC25375Oooo0oO f86407OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f86408OooOo0o;

        public OooOo00(String str, AbstractC25375Oooo0oO abstractC25375Oooo0oO) {
            this.f86408OooOo0o = str;
            this.f86407OooOo = abstractC25375Oooo0oO;
        }

        public final String toString() {
            return this.f86408OooOo0o + " " + this.f86407OooOo;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOo0O, reason: case insensitive filesystem */
    public static class C25356OooOo0O implements InterfaceC25357OooOo0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public byte[] f86409OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f86410OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float[] f86411OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f86412OooO0Oo;

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6) {
            OooO0Oo((byte) 2);
            OooO0o0(6);
            float[] fArr = this.f86411OooO0OO;
            int i = this.f86412OooO0Oo;
            int i2 = i + 1;
            this.f86412OooO0Oo = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.f86412OooO0Oo = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.f86412OooO0Oo = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.f86412OooO0Oo = i5;
            fArr[i4] = f4;
            int i6 = i + 5;
            this.f86412OooO0Oo = i6;
            fArr[i5] = f5;
            this.f86412OooO0Oo = i + 6;
            fArr[i6] = f6;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void OooO0O0(float f, float f2, float f3, float f4) {
            OooO0Oo((byte) 3);
            OooO0o0(4);
            float[] fArr = this.f86411OooO0OO;
            int i = this.f86412OooO0Oo;
            int i2 = i + 1;
            this.f86412OooO0Oo = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.f86412OooO0Oo = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.f86412OooO0Oo = i4;
            fArr[i3] = f3;
            this.f86412OooO0Oo = i + 4;
            fArr[i4] = f4;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void OooO0OO(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            OooO0Oo((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            OooO0o0(5);
            float[] fArr = this.f86411OooO0OO;
            int i = this.f86412OooO0Oo;
            int i2 = i + 1;
            this.f86412OooO0Oo = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.f86412OooO0Oo = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.f86412OooO0Oo = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.f86412OooO0Oo = i5;
            fArr[i4] = f4;
            this.f86412OooO0Oo = i + 5;
            fArr[i5] = f5;
        }

        public final void OooO0Oo(byte b) {
            int i = this.f86410OooO0O0;
            byte[] bArr = this.f86409OooO00o;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.f86409OooO00o = bArr2;
            }
            byte[] bArr3 = this.f86409OooO00o;
            int i2 = this.f86410OooO0O0;
            this.f86410OooO0O0 = i2 + 1;
            bArr3[i2] = b;
        }

        public final void OooO0o(InterfaceC25357OooOo0o interfaceC25357OooOo0o) {
            int i = 0;
            for (int i2 = 0; i2 < this.f86410OooO0O0; i2++) {
                byte b = this.f86409OooO00o[i2];
                if (b == 0) {
                    float[] fArr = this.f86411OooO0OO;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    interfaceC25357OooOo0o.moveTo(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.f86411OooO0OO;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    interfaceC25357OooOo0o.lineTo(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.f86411OooO0OO;
                    interfaceC25357OooOo0o.OooO00o(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                    i += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.f86411OooO0OO;
                    float f3 = fArr4[i];
                    float f4 = fArr4[i + 1];
                    int i5 = i + 3;
                    float f5 = fArr4[i + 2];
                    i += 4;
                    interfaceC25357OooOo0o.OooO0O0(f3, f4, f5, fArr4[i5]);
                } else if (b != 8) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr5 = this.f86411OooO0OO;
                    interfaceC25357OooOo0o.OooO0OO(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                    i += 5;
                } else {
                    interfaceC25357OooOo0o.close();
                }
            }
        }

        public final void OooO0o0(int i) {
            float[] fArr = this.f86411OooO0OO;
            if (fArr.length < this.f86412OooO0Oo + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.f86411OooO0OO = fArr2;
            }
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void close() {
            OooO0Oo((byte) 8);
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void lineTo(float f, float f2) {
            OooO0Oo((byte) 1);
            OooO0o0(2);
            float[] fArr = this.f86411OooO0OO;
            int i = this.f86412OooO0Oo;
            int i2 = i + 1;
            this.f86412OooO0Oo = i2;
            fArr[i] = f;
            this.f86412OooO0Oo = i + 2;
            fArr[i2] = f2;
        }

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25357OooOo0o
        public final void moveTo(float f, float f2) {
            OooO0Oo((byte) 0);
            OooO0o0(2);
            float[] fArr = this.f86411OooO0OO;
            int i = this.f86412OooO0Oo;
            int i2 = i + 1;
            this.f86412OooO0Oo = i2;
            fArr[i] = f;
            this.f86412OooO0Oo = i + 2;
            fArr[i2] = f2;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOo0o, reason: case insensitive filesystem */
    public interface InterfaceC25357OooOo0o {
        void OooO00o(float f, float f2, float f3, float f4, float f5, float f6);

        void OooO0O0(float f, float f2, float f3, float f4);

        void OooO0OO(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void close();

        void lineTo(float f, float f2);

        void moveTo(float f, float f2);
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOoO, reason: case insensitive filesystem */
    public static class C25358OooOoO extends C25359OooOoO0 {
        @Override // o00o0OO0.C25345OooO0o.C25359OooOoO0, o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "polygon";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOoO0, reason: case insensitive filesystem */
    public static class C25359OooOoO0 extends OooOO0O {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public float[] f86413OooOOOO;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public String OooOOO0() {
            return "polyline";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOoOO, reason: case insensitive filesystem */
    public static class C25360OooOoOO extends OooOO0O {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public OooOOOO f86414OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public OooOOOO f86415OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public OooOOOO f86416OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public OooOOOO f86417OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public OooOOOO f86418OooOOoo;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public OooOOOO f86419OooOo00;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return DrawToolFactory.LASSO_TYPE_RECT;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOoo, reason: case insensitive filesystem */
    public static class C25361OooOoo extends AbstractC25373Oooo0OO implements Oooo0 {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Float f86420OooO0oo;

        @Override // o00o0OO0.C25345OooO0o.Oooo0
        public final void OooO0OO(Oooo0o oooo0o) {
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "stop";
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0
        public final List<Oooo0o> getChildren() {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOoo0, reason: case insensitive filesystem */
    public static class C25362OooOoo0 extends AbstractC25373Oooo0OO implements Oooo0 {
        @Override // o00o0OO0.C25345OooO0o.Oooo0
        public final void OooO0OO(Oooo0o oooo0o) {
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "solidColor";
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0
        public final List<Oooo0o> getChildren() {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooO, reason: case insensitive filesystem */
    public static class C25363OooOooO implements Cloneable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public AbstractC25375Oooo0oO f86421OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public long f86422OooOo0o = 0;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public Float f86423OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public OooO00o f86424OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public AbstractC25375Oooo0oO f86425OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public OooOOOO f86426OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public Float f86427OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public OooO0OO f86428OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public EnumC25364OooO0Oo f86429OooOooo;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public EnumC25367OooO0oo f86430Oooo;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public Float f86431Oooo0;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public Float f86432Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public OooOOOO[] f86433Oooo00O;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public OooOOOO f86434Oooo00o;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public C25347OooO0o0 f86435Oooo0O0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public ArrayList f86436Oooo0OO;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Integer f86437Oooo0o;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public OooOOOO f86438Oooo0o0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public OooO0O0 f86439Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public EnumC25366OooO0oO f86440Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public String f86441OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Boolean f86442OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public EnumC19698OooO0o f86443OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public OooO0O0 f86444OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public String f86445OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public Boolean f86446OoooOOO;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public Boolean f86447OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public AbstractC25375Oooo0oO f86448OoooOo0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public Float f86449OoooOoO;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public String f86450OoooOoo;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public OooO00o f86451Ooooo00;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public String f86452Ooooo0o;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public AbstractC25375Oooo0oO f86453OooooO0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public Float f86454OooooOO;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public AbstractC25375Oooo0oO f86455OooooOo;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public OooO f86456Oooooo;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public Float f86457Oooooo0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public EnumC25365OooO0o0 f86458OoooooO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public String f86459o000oOoO;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooO$OooO */
        public static final class OooO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final OooO f86460OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final OooO f86461OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final /* synthetic */ OooO[] f86462OooOoO0;

            static {
                OooO oooO = new OooO("None", 0);
                f86461OooOo0o = oooO;
                OooO oooO2 = new OooO("NonScalingStroke", 1);
                f86460OooOo = oooO2;
                f86462OooOoO0 = new OooO[]{oooO, oooO2};
            }

            public OooO() {
                throw null;
            }

            public static OooO valueOf(String str) {
                return (OooO) Enum.valueOf(OooO.class, str);
            }

            public static OooO[] values() {
                return (OooO[]) f86462OooOoO0.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooO$OooO00o */
        public static final class OooO00o {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final OooO00o f86463OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final OooO00o f86464OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final /* synthetic */ OooO00o[] f86465OooOoO0;

            static {
                OooO00o oooO00o = new OooO00o("NonZero", 0);
                f86464OooOo0o = oooO00o;
                OooO00o oooO00o2 = new OooO00o("EvenOdd", 1);
                f86463OooOo = oooO00o2;
                f86465OooOoO0 = new OooO00o[]{oooO00o, oooO00o2};
            }

            public OooO00o() {
                throw null;
            }

            public static OooO00o valueOf(String str) {
                return (OooO00o) Enum.valueOf(OooO00o.class, str);
            }

            public static OooO00o[] values() {
                return (OooO00o[]) f86465OooOoO0.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooO$OooO0O0 */
        public static final class OooO0O0 {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final OooO0O0 f86466OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final OooO0O0 f86467OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public static final /* synthetic */ OooO0O0[] f86468OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final OooO0O0 f86469OooOoO0;

            static {
                OooO0O0 oooO0O0 = new OooO0O0("Normal", 0);
                f86467OooOo0o = oooO0O0;
                OooO0O0 oooO0O02 = new OooO0O0("Italic", 1);
                f86466OooOo = oooO0O02;
                OooO0O0 oooO0O03 = new OooO0O0("Oblique", 2);
                f86469OooOoO0 = oooO0O03;
                f86468OooOoO = new OooO0O0[]{oooO0O0, oooO0O02, oooO0O03};
            }

            public OooO0O0() {
                throw null;
            }

            public static OooO0O0 valueOf(String str) {
                return (OooO0O0) Enum.valueOf(OooO0O0.class, str);
            }

            public static OooO0O0[] values() {
                return (OooO0O0[]) f86468OooOoO.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooO$OooO0OO */
        public static final class OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final OooO0OO f86470OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final OooO0OO f86471OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public static final /* synthetic */ OooO0OO[] f86472OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final OooO0OO f86473OooOoO0;

            static {
                OooO0OO oooO0OO = new OooO0OO("Butt", 0);
                f86471OooOo0o = oooO0OO;
                OooO0OO oooO0OO2 = new OooO0OO("Round", 1);
                f86470OooOo = oooO0OO2;
                OooO0OO oooO0OO3 = new OooO0OO("Square", 2);
                f86473OooOoO0 = oooO0OO3;
                f86472OooOoO = new OooO0OO[]{oooO0OO, oooO0OO2, oooO0OO3};
            }

            public OooO0OO() {
                throw null;
            }

            public static OooO0OO valueOf(String str) {
                return (OooO0OO) Enum.valueOf(OooO0OO.class, str);
            }

            public static OooO0OO[] values() {
                return (OooO0OO[]) f86472OooOoO.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooO$OooO0Oo, reason: case insensitive filesystem */
        public static final class EnumC25364OooO0Oo {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final EnumC25364OooO0Oo f86474OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final EnumC25364OooO0Oo f86475OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public static final /* synthetic */ EnumC25364OooO0Oo[] f86476OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final EnumC25364OooO0Oo f86477OooOoO0;

            static {
                EnumC25364OooO0Oo enumC25364OooO0Oo = new EnumC25364OooO0Oo("Miter", 0);
                f86475OooOo0o = enumC25364OooO0Oo;
                EnumC25364OooO0Oo enumC25364OooO0Oo2 = new EnumC25364OooO0Oo("Round", 1);
                f86474OooOo = enumC25364OooO0Oo2;
                EnumC25364OooO0Oo enumC25364OooO0Oo3 = new EnumC25364OooO0Oo("Bevel", 2);
                f86477OooOoO0 = enumC25364OooO0Oo3;
                f86476OooOoO = new EnumC25364OooO0Oo[]{enumC25364OooO0Oo, enumC25364OooO0Oo2, enumC25364OooO0Oo3};
            }

            public EnumC25364OooO0Oo() {
                throw null;
            }

            public static EnumC25364OooO0Oo valueOf(String str) {
                return (EnumC25364OooO0Oo) Enum.valueOf(EnumC25364OooO0Oo.class, str);
            }

            public static EnumC25364OooO0Oo[] values() {
                return (EnumC25364OooO0Oo[]) f86476OooOoO.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooO$OooO0o, reason: collision with other inner class name */
        public static final class EnumC19698OooO0o {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final EnumC19698OooO0o f86478OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final EnumC19698OooO0o f86479OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public static final /* synthetic */ EnumC19698OooO0o[] f86480OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final EnumC19698OooO0o f86481OooOoO0;

            static {
                EnumC19698OooO0o enumC19698OooO0o = new EnumC19698OooO0o("Start", 0);
                f86479OooOo0o = enumC19698OooO0o;
                EnumC19698OooO0o enumC19698OooO0o2 = new EnumC19698OooO0o("Middle", 1);
                f86478OooOo = enumC19698OooO0o2;
                EnumC19698OooO0o enumC19698OooO0o3 = new EnumC19698OooO0o("End", 2);
                f86481OooOoO0 = enumC19698OooO0o3;
                f86480OooOoO = new EnumC19698OooO0o[]{enumC19698OooO0o, enumC19698OooO0o2, enumC19698OooO0o3};
            }

            public EnumC19698OooO0o() {
                throw null;
            }

            public static EnumC19698OooO0o valueOf(String str) {
                return (EnumC19698OooO0o) Enum.valueOf(EnumC19698OooO0o.class, str);
            }

            public static EnumC19698OooO0o[] values() {
                return (EnumC19698OooO0o[]) f86480OooOoO.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooO$OooO0o0, reason: case insensitive filesystem */
        public static final class EnumC25365OooO0o0 {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final EnumC25365OooO0o0 f86482OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final EnumC25365OooO0o0 f86483OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public static final /* synthetic */ EnumC25365OooO0o0[] f86484OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final EnumC25365OooO0o0 f86485OooOoO0;

            static {
                EnumC25365OooO0o0 enumC25365OooO0o0 = new EnumC25365OooO0o0("auto", 0);
                f86483OooOo0o = enumC25365OooO0o0;
                EnumC25365OooO0o0 enumC25365OooO0o02 = new EnumC25365OooO0o0("optimizeQuality", 1);
                f86482OooOo = enumC25365OooO0o02;
                EnumC25365OooO0o0 enumC25365OooO0o03 = new EnumC25365OooO0o0("optimizeSpeed", 2);
                f86485OooOoO0 = enumC25365OooO0o03;
                f86484OooOoO = new EnumC25365OooO0o0[]{enumC25365OooO0o0, enumC25365OooO0o02, enumC25365OooO0o03};
            }

            public EnumC25365OooO0o0() {
                throw null;
            }

            public static EnumC25365OooO0o0 valueOf(String str) {
                return (EnumC25365OooO0o0) Enum.valueOf(EnumC25365OooO0o0.class, str);
            }

            public static EnumC25365OooO0o0[] values() {
                return (EnumC25365OooO0o0[]) f86484OooOoO.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooO$OooO0oO, reason: case insensitive filesystem */
        public static final class EnumC25366OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final EnumC25366OooO0oO f86486OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final EnumC25366OooO0oO f86487OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public static final EnumC25366OooO0oO f86488OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final EnumC25366OooO0oO f86489OooOoO0;

            /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
            public static final EnumC25366OooO0oO f86490OooOoOO;

            /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
            public static final /* synthetic */ EnumC25366OooO0oO[] f86491OooOoo0;

            static {
                EnumC25366OooO0oO enumC25366OooO0oO = new EnumC25366OooO0oO("None", 0);
                f86487OooOo0o = enumC25366OooO0oO;
                EnumC25366OooO0oO enumC25366OooO0oO2 = new EnumC25366OooO0oO("Underline", 1);
                f86486OooOo = enumC25366OooO0oO2;
                EnumC25366OooO0oO enumC25366OooO0oO3 = new EnumC25366OooO0oO("Overline", 2);
                f86489OooOoO0 = enumC25366OooO0oO3;
                EnumC25366OooO0oO enumC25366OooO0oO4 = new EnumC25366OooO0oO("LineThrough", 3);
                f86488OooOoO = enumC25366OooO0oO4;
                EnumC25366OooO0oO enumC25366OooO0oO5 = new EnumC25366OooO0oO("Blink", 4);
                f86490OooOoOO = enumC25366OooO0oO5;
                f86491OooOoo0 = new EnumC25366OooO0oO[]{enumC25366OooO0oO, enumC25366OooO0oO2, enumC25366OooO0oO3, enumC25366OooO0oO4, enumC25366OooO0oO5};
            }

            public EnumC25366OooO0oO() {
                throw null;
            }

            public static EnumC25366OooO0oO valueOf(String str) {
                return (EnumC25366OooO0oO) Enum.valueOf(EnumC25366OooO0oO.class, str);
            }

            public static EnumC25366OooO0oO[] values() {
                return (EnumC25366OooO0oO[]) f86491OooOoo0.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooO$OooO0oo, reason: case insensitive filesystem */
        public static final class EnumC25367OooO0oo {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public static final EnumC25367OooO0oo f86492OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public static final EnumC25367OooO0oo f86493OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public static final /* synthetic */ EnumC25367OooO0oo[] f86494OooOoO0;

            static {
                EnumC25367OooO0oo enumC25367OooO0oo = new EnumC25367OooO0oo("LTR", 0);
                f86493OooOo0o = enumC25367OooO0oo;
                EnumC25367OooO0oo enumC25367OooO0oo2 = new EnumC25367OooO0oo("RTL", 1);
                f86492OooOo = enumC25367OooO0oo2;
                f86494OooOoO0 = new EnumC25367OooO0oo[]{enumC25367OooO0oo, enumC25367OooO0oo2};
            }

            public EnumC25367OooO0oo() {
                throw null;
            }

            public static EnumC25367OooO0oo valueOf(String str) {
                return (EnumC25367OooO0oo) Enum.valueOf(EnumC25367OooO0oo.class, str);
            }

            public static EnumC25367OooO0oo[] values() {
                return (EnumC25367OooO0oo[]) f86494OooOoO0.clone();
            }
        }

        public static C25363OooOooO OooO00o() {
            C25363OooOooO c25363OooOooO = new C25363OooOooO();
            c25363OooOooO.f86422OooOo0o = -1L;
            C25347OooO0o0 c25347OooO0o0 = C25347OooO0o0.f86364OooOo;
            c25363OooOooO.f86421OooOo = c25347OooO0o0;
            OooO00o oooO00o = OooO00o.f86464OooOo0o;
            c25363OooOooO.f86424OooOoO0 = oooO00o;
            Float fValueOf = Float.valueOf(1.0f);
            c25363OooOooO.f86423OooOoO = fValueOf;
            c25363OooOooO.f86425OooOoOO = null;
            c25363OooOooO.f86427OooOoo0 = fValueOf;
            c25363OooOooO.f86426OooOoo = new OooOOOO(1.0f);
            c25363OooOooO.f86428OooOooO = OooO0OO.f86471OooOo0o;
            c25363OooOooO.f86429OooOooo = EnumC25364OooO0Oo.f86475OooOo0o;
            c25363OooOooO.f86432Oooo000 = Float.valueOf(4.0f);
            c25363OooOooO.f86433Oooo00O = null;
            c25363OooOooO.f86434Oooo00o = new OooOOOO(0.0f);
            c25363OooOooO.f86431Oooo0 = fValueOf;
            c25363OooOooO.f86435Oooo0O0 = c25347OooO0o0;
            c25363OooOooO.f86436Oooo0OO = null;
            c25363OooOooO.f86438Oooo0o0 = new OooOOOO(12.0f, EnumC25388Ooooo0o.f86539OooOo);
            c25363OooOooO.f86437Oooo0o = 400;
            c25363OooOooO.f86439Oooo0oO = OooO0O0.f86467OooOo0o;
            c25363OooOooO.f86440Oooo0oo = EnumC25366OooO0oO.f86487OooOo0o;
            c25363OooOooO.f86430Oooo = EnumC25367OooO0oo.f86493OooOo0o;
            c25363OooOooO.f86443OoooO00 = EnumC19698OooO0o.f86479OooOo0o;
            Boolean bool = Boolean.TRUE;
            c25363OooOooO.f86442OoooO0 = bool;
            c25363OooOooO.f86444OoooO0O = null;
            c25363OooOooO.f86441OoooO = null;
            c25363OooOooO.f86445OoooOO0 = null;
            c25363OooOooO.f86459o000oOoO = null;
            c25363OooOooO.f86446OoooOOO = bool;
            c25363OooOooO.f86447OoooOOo = bool;
            c25363OooOooO.f86448OoooOo0 = c25347OooO0o0;
            c25363OooOooO.f86449OoooOoO = fValueOf;
            c25363OooOooO.f86450OoooOoo = null;
            c25363OooOooO.f86451Ooooo00 = oooO00o;
            c25363OooOooO.f86452Ooooo0o = null;
            c25363OooOooO.f86453OooooO0 = null;
            c25363OooOooO.f86454OooooOO = fValueOf;
            c25363OooOooO.f86455OooooOo = null;
            c25363OooOooO.f86457Oooooo0 = fValueOf;
            c25363OooOooO.f86456Oooooo = OooO.f86461OooOo0o;
            c25363OooOooO.f86458OoooooO = EnumC25365OooO0o0.f86483OooOo0o;
            return c25363OooOooO;
        }

        public final Object clone() throws CloneNotSupportedException {
            C25363OooOooO c25363OooOooO = (C25363OooOooO) super.clone();
            OooOOOO[] oooOOOOArr = this.f86433Oooo00O;
            if (oooOOOOArr != null) {
                c25363OooOooO.f86433Oooo00O = (OooOOOO[]) oooOOOOArr.clone();
            }
            return c25363OooOooO;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOooo, reason: case insensitive filesystem */
    public static class C25368OooOooo extends AbstractC25379OoooO00 {

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public OooOOOO f86495OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public OooOOOO f86496OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public OooOOOO f86497OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public OooOOOO f86498OooOOoo;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "svg";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo, reason: case insensitive filesystem */
    public static class C25369Oooo extends OooO {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public OooOOOO f86499OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public OooOOOO f86500OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public OooOOOO f86501OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public OooOOOO f86502OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public OooOOOO f86503OooOOo0;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "radialGradient";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo0 */
    public interface Oooo0 {
        void OooO0OO(Oooo0o oooo0o) throws C25396OooO0oo;

        List<Oooo0o> getChildren();
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo000 */
    public interface Oooo000 {
        void OooO(HashSet hashSet);

        String OooO00o();

        void OooO0Oo(HashSet hashSet);

        Set<String> OooO0o();

        Set<String> OooO0o0();

        void OooO0oO(HashSet hashSet);

        void OooO0oo(HashSet hashSet);

        void OooOO0(String str);

        Set<String> OooOO0o();

        Set<String> getRequiredFeatures();
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo00O, reason: case insensitive filesystem */
    public static abstract class AbstractC25370Oooo00O extends AbstractC25372Oooo0O0 implements Oooo0, Oooo000 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public ArrayList f86504OooO = new ArrayList();

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public HashSet f86505OooOO0 = null;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public String f86506OooOO0O = null;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public HashSet f86507OooOO0o = null;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public HashSet f86508OooOOO0 = null;

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final void OooO(HashSet hashSet) {
            this.f86508OooOOO0 = hashSet;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final String OooO00o() {
            return this.f86506OooOO0O;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0
        public void OooO0OO(Oooo0o oooo0o) throws C25396OooO0oo {
            this.f86504OooO.add(oooo0o);
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final void OooO0Oo(HashSet hashSet) {
            this.f86507OooOO0o = hashSet;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final Set<String> OooO0o() {
            return null;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final Set<String> OooO0o0() {
            return this.f86507OooOO0o;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final void OooO0oO(HashSet hashSet) {
            this.f86505OooOO0 = hashSet;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final void OooO0oo(HashSet hashSet) {
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final void OooOO0(String str) {
            this.f86506OooOO0O = str;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final Set<String> OooOO0o() {
            return this.f86508OooOOO0;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0
        public final List<Oooo0o> getChildren() {
            return this.f86504OooO;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final Set<String> getRequiredFeatures() {
            return this.f86505OooOO0;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo00o, reason: case insensitive filesystem */
    public static abstract class AbstractC25371Oooo00o extends AbstractC25372Oooo0O0 implements Oooo000 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public HashSet f86509OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public String f86510OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public HashSet f86511OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public HashSet f86512OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public HashSet f86513OooOOO0;

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final void OooO(HashSet hashSet) {
            this.f86513OooOOO0 = hashSet;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final String OooO00o() {
            return this.f86510OooOO0;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final void OooO0Oo(HashSet hashSet) {
            this.f86512OooOO0o = hashSet;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final Set<String> OooO0o() {
            return this.f86511OooOO0O;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final Set<String> OooO0o0() {
            return this.f86512OooOO0o;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final void OooO0oO(HashSet hashSet) {
            this.f86509OooO = hashSet;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final void OooO0oo(HashSet hashSet) {
            this.f86511OooOO0O = hashSet;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final void OooOO0(String str) {
            this.f86510OooOO0 = str;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final Set<String> OooOO0o() {
            return this.f86513OooOOO0;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo000
        public final Set<String> getRequiredFeatures() {
            return this.f86509OooO;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo0O0, reason: case insensitive filesystem */
    public static abstract class AbstractC25372Oooo0O0 extends AbstractC25373Oooo0OO {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public OooO00o f86514OooO0oo = null;
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo0OO, reason: case insensitive filesystem */
    public static abstract class AbstractC25373Oooo0OO extends Oooo0o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f86515OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Boolean f86516OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public C25363OooOooO f86518OooO0o0 = null;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public C25363OooOooO f86517OooO0o = null;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ArrayList f86519OooO0oO = null;

        public final String toString() {
            return OooOOO0();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo0o */
    public static class Oooo0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C25345OooO0o f86520OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Oooo0 f86521OooO0O0;

        public String OooOOO0() {
            return "";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo0o0, reason: case insensitive filesystem */
    public static class C25374Oooo0o0 extends OooO {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public OooOOOO f86522OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public OooOOOO f86523OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public OooOOOO f86524OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public OooOOOO f86525OooOOOo;

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "linearGradient";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo0oO, reason: case insensitive filesystem */
    public static abstract class AbstractC25375Oooo0oO implements Cloneable {
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Oooo0oo, reason: case insensitive filesystem */
    public static abstract class AbstractC25376Oooo0oo extends AbstractC25370Oooo00O {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public C25391OooO0o0 f86526OooOOO = null;
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OoooO, reason: case insensitive filesystem */
    public static class C25377OoooO extends AbstractC25383OoooOOo implements InterfaceC25382OoooOOO {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public String f86527OooOOO;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public InterfaceC25386OoooOoo f86528OooOOOO;

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25382OoooOOO
        public final InterfaceC25386OoooOoo OooO0O0() {
            return this.f86528OooOOOO;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "tref";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OoooO0, reason: case insensitive filesystem */
    public static class C25378OoooO0 extends C25350OooOO0o {
        @Override // o00o0OO0.C25345OooO0o.C25350OooOO0o, o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "switch";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OoooO00, reason: case insensitive filesystem */
    public static abstract class AbstractC25379OoooO00 extends AbstractC25376Oooo0oo {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public OooO00o f86529OooOOOO;
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OoooO0O, reason: case insensitive filesystem */
    public static class C25380OoooO0O extends AbstractC25379OoooO00 implements InterfaceC25354OooOOoo {
        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "symbol";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OoooOO0, reason: case insensitive filesystem */
    public static class C25381OoooOO0 extends AbstractC25385OoooOoO implements InterfaceC25382OoooOOO {

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public InterfaceC25386OoooOoo f86530OooOOo;

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25382OoooOOO
        public final InterfaceC25386OoooOoo OooO0O0() {
            return this.f86530OooOOo;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "tspan";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OoooOOO, reason: case insensitive filesystem */
    public interface InterfaceC25382OoooOOO {
        InterfaceC25386OoooOoo OooO0O0();
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OoooOOo, reason: case insensitive filesystem */
    public static abstract class AbstractC25383OoooOOo extends AbstractC25370Oooo00O {
        @Override // o00o0OO0.C25345OooO0o.AbstractC25370Oooo00O, o00o0OO0.C25345OooO0o.Oooo0
        public final void OooO0OO(Oooo0o oooo0o) throws C25396OooO0oo {
            if (oooo0o instanceof InterfaceC25382OoooOOO) {
                this.f86504OooO.add(oooo0o);
                return;
            }
            throw new C25396OooO0oo("Text content elements cannot contain " + oooo0o + " elements.");
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OoooOo0, reason: case insensitive filesystem */
    public static class C25384OoooOo0 extends AbstractC25383OoooOOo implements InterfaceC25382OoooOOO {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public String f86531OooOOO;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public OooOOOO f86532OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public InterfaceC25386OoooOoo f86533OooOOOo;

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25382OoooOOO
        public final InterfaceC25386OoooOoo OooO0O0() {
            return this.f86533OooOOOo;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "textPath";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OoooOoO, reason: case insensitive filesystem */
    public static abstract class AbstractC25385OoooOoO extends AbstractC25383OoooOOo {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public ArrayList f86534OooOOO;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public ArrayList f86535OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public ArrayList f86536OooOOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public ArrayList f86537OooOOo0;
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OoooOoo, reason: case insensitive filesystem */
    public interface InterfaceC25386OoooOoo {
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Ooooo00, reason: case insensitive filesystem */
    public static class C25387Ooooo00 extends Oooo0o implements InterfaceC25382OoooOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f86538OooO0OO;

        @Override // o00o0OO0.C25345OooO0o.InterfaceC25382OoooOOO
        public final InterfaceC25386OoooOoo OooO0O0() {
            return null;
        }

        public final String toString() {
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("TextChild: '"), this.f86538OooO0OO, "'");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: o00o0OO0.OooO0o$Ooooo0o, reason: case insensitive filesystem */
    public static final class EnumC25388Ooooo0o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final EnumC25388Ooooo0o f86539OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final EnumC25388Ooooo0o f86540OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final /* synthetic */ EnumC25388Ooooo0o[] f86541OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final EnumC25388Ooooo0o f86542OooOoO0;

        static {
            EnumC25388Ooooo0o enumC25388Ooooo0o = new EnumC25388Ooooo0o("px", 0);
            f86540OooOo0o = enumC25388Ooooo0o;
            EnumC25388Ooooo0o enumC25388Ooooo0o2 = new EnumC25388Ooooo0o("em", 1);
            EnumC25388Ooooo0o enumC25388Ooooo0o3 = new EnumC25388Ooooo0o("ex", 2);
            EnumC25388Ooooo0o enumC25388Ooooo0o4 = new EnumC25388Ooooo0o(BackupFile.EXTENSION_NOTEIN_FILE, 3);
            EnumC25388Ooooo0o enumC25388Ooooo0o5 = new EnumC25388Ooooo0o("cm", 4);
            EnumC25388Ooooo0o enumC25388Ooooo0o6 = new EnumC25388Ooooo0o("mm", 5);
            EnumC25388Ooooo0o enumC25388Ooooo0o7 = new EnumC25388Ooooo0o(TranslateLanguage.PORTUGUESE, 6);
            f86539OooOo = enumC25388Ooooo0o7;
            EnumC25388Ooooo0o enumC25388Ooooo0o8 = new EnumC25388Ooooo0o("pc", 7);
            EnumC25388Ooooo0o enumC25388Ooooo0o9 = new EnumC25388Ooooo0o("percent", 8);
            f86542OooOoO0 = enumC25388Ooooo0o9;
            f86541OooOoO = new EnumC25388Ooooo0o[]{enumC25388Ooooo0o, enumC25388Ooooo0o2, enumC25388Ooooo0o3, enumC25388Ooooo0o4, enumC25388Ooooo0o5, enumC25388Ooooo0o6, enumC25388Ooooo0o7, enumC25388Ooooo0o8, enumC25388Ooooo0o9};
        }

        public EnumC25388Ooooo0o() {
            throw null;
        }

        public static EnumC25388Ooooo0o valueOf(String str) {
            return (EnumC25388Ooooo0o) Enum.valueOf(EnumC25388Ooooo0o.class, str);
        }

        public static EnumC25388Ooooo0o[] values() {
            return (EnumC25388Ooooo0o[]) f86541OooOoO.clone();
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooooO0, reason: case insensitive filesystem */
    public static class C25389OooooO0 extends C25350OooOO0o {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public String f86543OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public OooOOOO f86544OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public OooOOOO f86545OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public OooOOOO f86546OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public OooOOOO f86547OooOOoo;

        @Override // o00o0OO0.C25345OooO0o.C25350OooOO0o, o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return AbstractJwtRequest.ClaimNames.USE;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooooOO, reason: case insensitive filesystem */
    public static class C25390OooooOO extends AbstractC25379OoooO00 implements InterfaceC25354OooOOoo {
        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "view";
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$o000oOoO */
    public static class o000oOoO extends AbstractC25385OoooOoO implements InterfaceC25386OoooOoo, OooOOO0 {

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public Matrix f86548OooOOo;

        @Override // o00o0OO0.C25345OooO0o.OooOOO0
        public final void OooOO0O(Matrix matrix) {
            this.f86548OooOOo = matrix;
        }

        @Override // o00o0OO0.C25345OooO0o.Oooo0o
        public final String OooOOO0() {
            return "text";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC25373Oooo0OO OooO00o(Oooo0 oooo0, String str) {
        AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO00o;
        AbstractC25373Oooo0OO abstractC25373Oooo0OO = (AbstractC25373Oooo0OO) oooo0;
        if (str.equals(abstractC25373Oooo0OO.f86515OooO0OO)) {
            return abstractC25373Oooo0OO;
        }
        for (Object obj : oooo0.getChildren()) {
            if (obj instanceof AbstractC25373Oooo0OO) {
                AbstractC25373Oooo0OO abstractC25373Oooo0OO2 = (AbstractC25373Oooo0OO) obj;
                if (str.equals(abstractC25373Oooo0OO2.f86515OooO0OO)) {
                    return abstractC25373Oooo0OO2;
                }
                if ((obj instanceof Oooo0) && (abstractC25373Oooo0OOOooO00o = OooO00o((Oooo0) obj, str)) != null) {
                    return abstractC25373Oooo0OOOooO00o;
                }
            }
        }
        return null;
    }

    public final Picture OooO0O0(int i, int i2) {
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        OooO00o oooO00o = new OooO00o(0.0f, 0.0f, i, i2);
        C25392OooO0oO c25392OooO0oO = new C25392OooO0oO();
        c25392OooO0oO.f86568OooO00o = canvasBeginRecording;
        c25392OooO0oO.f86569OooO0O0 = 96.0f;
        c25392OooO0oO.f86570OooO0OO = this;
        C25368OooOooo c25368OooOooo = this.f86343OooO00o;
        if (c25368OooOooo == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
        } else {
            OooO00o oooO00o2 = c25368OooOooo.f86529OooOOOO;
            C25391OooO0o0 c25391OooO0o0 = c25368OooOooo.f86526OooOOO;
            c25392OooO0oO.f86571OooO0Oo = new C25392OooO0oO.C19699OooO0oO();
            c25392OooO0oO.f86573OooO0o0 = new Stack<>();
            c25392OooO0oO.OoooO0O(c25392OooO0oO.f86571OooO0Oo, C25363OooOooO.OooO00o());
            C25392OooO0oO.C19699OooO0oO c19699OooO0oO = c25392OooO0oO.f86571OooO0Oo;
            c19699OooO0oO.f86604OooO0o = null;
            c19699OooO0oO.f86607OooO0oo = false;
            c25392OooO0oO.f86573OooO0o0.push(new C25392OooO0oO.C19699OooO0oO(c19699OooO0oO));
            c25392OooO0oO.f86574OooO0oO = new Stack<>();
            c25392OooO0oO.f86572OooO0o = new Stack<>();
            Boolean bool = c25368OooOooo.f86516OooO0Oo;
            if (bool != null) {
                c25392OooO0oO.f86571OooO0Oo.f86607OooO0oo = bool.booleanValue();
            }
            c25392OooO0oO.Oooo();
            OooO00o oooO00o3 = new OooO00o(oooO00o);
            OooOOOO oooOOOO = c25368OooOooo.f86496OooOOo;
            if (oooOOOO != null) {
                oooO00o3.f86353OooO0OO = oooOOOO.OooO0OO(c25392OooO0oO, oooO00o3.f86353OooO0OO);
            }
            OooOOOO oooOOOO2 = c25368OooOooo.f86498OooOOoo;
            if (oooOOOO2 != null) {
                oooO00o3.f86354OooO0Oo = oooOOOO2.OooO0OO(c25392OooO0oO, oooO00o3.f86354OooO0Oo);
            }
            c25392OooO0oO.Oooo00O(c25368OooOooo, oooO00o3, oooO00o2, c25391OooO0o0);
            c25392OooO0oO.Oooo0oo();
        }
        picture.endRecording();
        return picture;
    }

    public final Picture OooO0OO() {
        OooOOOO oooOOOO;
        C25368OooOooo c25368OooOooo = this.f86343OooO00o;
        OooO00o oooO00o = c25368OooOooo.f86529OooOOOO;
        OooOOOO oooOOOO2 = c25368OooOooo.f86496OooOOo;
        if (oooOOOO2 != null) {
            EnumC25388Ooooo0o enumC25388Ooooo0o = oooOOOO2.f86382OooOo;
            EnumC25388Ooooo0o enumC25388Ooooo0o2 = EnumC25388Ooooo0o.f86542OooOoO0;
            if (enumC25388Ooooo0o != enumC25388Ooooo0o2 && (oooOOOO = c25368OooOooo.f86498OooOOoo) != null && oooOOOO.f86382OooOo != enumC25388Ooooo0o2) {
                return OooO0O0((int) Math.ceil(oooOOOO2.OooO00o(96.0f)), (int) Math.ceil(this.f86343OooO00o.f86498OooOOoo.OooO00o(96.0f)));
            }
        }
        if (oooOOOO2 != null && oooO00o != null) {
            return OooO0O0((int) Math.ceil(oooOOOO2.OooO00o(96.0f)), (int) Math.ceil((oooO00o.f86354OooO0Oo * r0) / oooO00o.f86353OooO0OO));
        }
        OooOOOO oooOOOO3 = c25368OooOooo.f86498OooOOoo;
        if (oooOOOO3 == null || oooO00o == null) {
            return OooO0O0(512, 512);
        }
        return OooO0O0((int) Math.ceil((oooO00o.f86353OooO0OO * r0) / oooO00o.f86354OooO0Oo), (int) Math.ceil(oooOOOO3.OooO00o(96.0f)));
    }

    public final AbstractC25373Oooo0OO OooO0Oo(String str) {
        String strSubstring;
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String strReplace = str.replace("\\\n", "").replace("\\A", IOUtils.LINE_SEPARATOR_UNIX);
        if (strReplace.length() <= 1 || !strReplace.startsWith("#") || (strSubstring = strReplace.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        if (strSubstring.equals(this.f86343OooO00o.f86515OooO0OO)) {
            return this.f86343OooO00o;
        }
        HashMap map = this.f86345OooO0OO;
        if (map.containsKey(strSubstring)) {
            return (AbstractC25373Oooo0OO) map.get(strSubstring);
        }
        AbstractC25373Oooo0OO abstractC25373Oooo0OOOooO00o = OooO00o(this.f86343OooO00o, strSubstring);
        map.put(strSubstring, abstractC25373Oooo0OOOooO00o);
        return abstractC25373Oooo0OOOooO00o;
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooOOOO */
    public static class OooOOOO implements Cloneable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final EnumC25388Ooooo0o f86382OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final float f86383OooOo0o;

        public OooOOOO(float f, EnumC25388Ooooo0o enumC25388Ooooo0o) {
            this.f86383OooOo0o = f;
            this.f86382OooOo = enumC25388Ooooo0o;
        }

        public final float OooO00o(float f) {
            float f2;
            float f3;
            int iOrdinal = this.f86382OooOo.ordinal();
            float f4 = this.f86383OooOo0o;
            if (iOrdinal == 0) {
                return f4;
            }
            if (iOrdinal == 3) {
                return f4 * f;
            }
            if (iOrdinal == 4) {
                f2 = f4 * f;
                f3 = 2.54f;
            } else if (iOrdinal == 5) {
                f2 = f4 * f;
                f3 = 25.4f;
            } else if (iOrdinal == 6) {
                f2 = f4 * f;
                f3 = 72.0f;
            } else {
                if (iOrdinal != 7) {
                    return f4;
                }
                f2 = f4 * f;
                f3 = 6.0f;
            }
            return f2 / f3;
        }

        public final float OooO0O0(C25392OooO0oO c25392OooO0oO) {
            float fSqrt;
            if (this.f86382OooOo != EnumC25388Ooooo0o.f86542OooOoO0) {
                return OooO0Oo(c25392OooO0oO);
            }
            C25392OooO0oO.C19699OooO0oO c19699OooO0oO = c25392OooO0oO.f86571OooO0Oo;
            OooO00o oooO00o = c19699OooO0oO.f86606OooO0oO;
            if (oooO00o == null) {
                oooO00o = c19699OooO0oO.f86604OooO0o;
            }
            float f = this.f86383OooOo0o;
            if (oooO00o == null) {
                return f;
            }
            float f2 = oooO00o.f86353OooO0OO;
            if (f2 == oooO00o.f86354OooO0Oo) {
                fSqrt = f * f2;
            } else {
                fSqrt = f * ((float) (Math.sqrt((r0 * r0) + (f2 * f2)) / 1.414213562373095d));
            }
            return fSqrt / 100.0f;
        }

        public final float OooO0OO(C25392OooO0oO c25392OooO0oO, float f) {
            return this.f86382OooOo == EnumC25388Ooooo0o.f86542OooOoO0 ? (this.f86383OooOo0o * f) / 100.0f : OooO0Oo(c25392OooO0oO);
        }

        public final float OooO0Oo(C25392OooO0oO c25392OooO0oO) {
            float f;
            float f2;
            int iOrdinal = this.f86382OooOo.ordinal();
            float f3 = this.f86383OooOo0o;
            switch (iOrdinal) {
                case 1:
                    return c25392OooO0oO.f86571OooO0Oo.f86603OooO0Oo.getTextSize() * f3;
                case 2:
                    return (c25392OooO0oO.f86571OooO0Oo.f86603OooO0Oo.getTextSize() / 2.0f) * f3;
                case 3:
                    return f3 * c25392OooO0oO.f86569OooO0O0;
                case 4:
                    f = f3 * c25392OooO0oO.f86569OooO0O0;
                    f2 = 2.54f;
                    break;
                case 5:
                    f = f3 * c25392OooO0oO.f86569OooO0O0;
                    f2 = 25.4f;
                    break;
                case 6:
                    f = f3 * c25392OooO0oO.f86569OooO0O0;
                    f2 = 72.0f;
                    break;
                case 7:
                    f = f3 * c25392OooO0oO.f86569OooO0O0;
                    f2 = 6.0f;
                    break;
                case 8:
                    C25392OooO0oO.C19699OooO0oO c19699OooO0oO = c25392OooO0oO.f86571OooO0Oo;
                    OooO00o oooO00o = c19699OooO0oO.f86606OooO0oO;
                    if (oooO00o == null) {
                        oooO00o = c19699OooO0oO.f86604OooO0o;
                    }
                    if (oooO00o != null) {
                        f = f3 * oooO00o.f86353OooO0OO;
                        f2 = 100.0f;
                        break;
                    }
                default:
                    return f3;
            }
            return f / f2;
        }

        public final boolean OooO0o() {
            return this.f86383OooOo0o < 0.0f;
        }

        public final float OooO0o0(C25392OooO0oO c25392OooO0oO) {
            if (this.f86382OooOo != EnumC25388Ooooo0o.f86542OooOoO0) {
                return OooO0Oo(c25392OooO0oO);
            }
            C25392OooO0oO.C19699OooO0oO c19699OooO0oO = c25392OooO0oO.f86571OooO0Oo;
            OooO00o oooO00o = c19699OooO0oO.f86606OooO0oO;
            if (oooO00o == null) {
                oooO00o = c19699OooO0oO.f86604OooO0o;
            }
            float f = this.f86383OooOo0o;
            return oooO00o == null ? f : (f * oooO00o.f86354OooO0Oo) / 100.0f;
        }

        public final boolean OooO0oO() {
            return this.f86383OooOo0o == 0.0f;
        }

        public final String toString() {
            return String.valueOf(this.f86383OooOo0o) + this.f86382OooOo;
        }

        public OooOOOO(float f) {
            this.f86383OooOo0o = f;
            this.f86382OooOo = EnumC25388Ooooo0o.f86540OooOo0o;
        }
    }

    /* JADX INFO: renamed from: o00o0OO0.OooO0o$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f86351OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f86352OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f86353OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f86354OooO0Oo;

        public OooO00o(float f, float f2, float f3, float f4) {
            this.f86351OooO00o = f;
            this.f86352OooO0O0 = f2;
            this.f86353OooO0OO = f3;
            this.f86354OooO0Oo = f4;
        }

        public final float OooO00o() {
            return this.f86351OooO00o + this.f86353OooO0OO;
        }

        public final float OooO0O0() {
            return this.f86352OooO0O0 + this.f86354OooO0Oo;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[");
            sb.append(this.f86351OooO00o);
            sb.append(" ");
            sb.append(this.f86352OooO0O0);
            sb.append(" ");
            sb.append(this.f86353OooO0OO);
            sb.append(" ");
            return Oooo00o.OooO0OO.OooO0OO(sb, this.f86354OooO0Oo, "]");
        }

        public OooO00o(OooO00o oooO00o) {
            this.f86351OooO00o = oooO00o.f86351OooO00o;
            this.f86352OooO0O0 = oooO00o.f86352OooO0O0;
            this.f86353OooO0OO = oooO00o.f86353OooO0OO;
            this.f86354OooO0Oo = oooO00o.f86354OooO0Oo;
        }
    }
}
