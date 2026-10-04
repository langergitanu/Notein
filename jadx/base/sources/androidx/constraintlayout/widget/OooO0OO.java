package androidx.constraintlayout.widget;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final SparseIntArray f64000OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final int[] f64001OooO0oO = {0, 4, 8};

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final SparseIntArray f64002OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f64003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f64004OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String[] f64005OooO0OO = new String[0];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap<String, androidx.constraintlayout.widget.OooO00o> f64006OooO0Oo = new HashMap<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f64008OooO0o0 = true;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HashMap<Integer, OooO00o> f64007OooO0o = new HashMap<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f64009OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f64010OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0Oo f64011OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C19007OooO0OO f64012OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C21624OooO0o0 f64013OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0O0 f64014OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.OooO00o> f64015OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public C19006OooO00o f64016OooO0oo;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C19006OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public int[] f64018OooO00o = new int[10];

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public int[] f64019OooO0O0 = new int[10];

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public int f64020OooO0OO = 0;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int[] f64021OooO0Oo = new int[10];

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public float[] f64023OooO0o0 = new float[10];

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int f64022OooO0o = 0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int[] f64024OooO0oO = new int[5];

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public String[] f64025OooO0oo = new String[5];

            /* JADX INFO: renamed from: OooO, reason: collision with root package name */
            public int f64017OooO = 0;

            /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
            public int[] f64026OooOO0 = new int[4];

            /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
            public boolean[] f64027OooOO0O = new boolean[4];

            /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
            public int f64028OooOO0o = 0;

            public final void OooO00o(int i, float f) {
                int i2 = this.f64022OooO0o;
                int[] iArr = this.f64021OooO0Oo;
                if (i2 >= iArr.length) {
                    this.f64021OooO0Oo = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f64023OooO0o0;
                    this.f64023OooO0o0 = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f64021OooO0Oo;
                int i3 = this.f64022OooO0o;
                iArr2[i3] = i;
                float[] fArr2 = this.f64023OooO0o0;
                this.f64022OooO0o = i3 + 1;
                fArr2[i3] = f;
            }

            public final void OooO0O0(int i, int i2) {
                int i3 = this.f64020OooO0OO;
                int[] iArr = this.f64018OooO00o;
                if (i3 >= iArr.length) {
                    this.f64018OooO00o = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f64019OooO0O0;
                    this.f64019OooO0O0 = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f64018OooO00o;
                int i4 = this.f64020OooO0OO;
                iArr3[i4] = i;
                int[] iArr4 = this.f64019OooO0O0;
                this.f64020OooO0OO = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void OooO0OO(int i, String str) {
                int i2 = this.f64017OooO;
                int[] iArr = this.f64024OooO0oO;
                if (i2 >= iArr.length) {
                    this.f64024OooO0oO = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f64025OooO0oo;
                    this.f64025OooO0oo = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f64024OooO0oO;
                int i3 = this.f64017OooO;
                iArr2[i3] = i;
                String[] strArr2 = this.f64025OooO0oo;
                this.f64017OooO = i3 + 1;
                strArr2[i3] = str;
            }

            public final void OooO0Oo(int i, boolean z) {
                int i2 = this.f64028OooOO0o;
                int[] iArr = this.f64026OooOO0;
                if (i2 >= iArr.length) {
                    this.f64026OooOO0 = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f64027OooOO0O;
                    this.f64027OooOO0O = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f64026OooOO0;
                int i3 = this.f64028OooOO0o;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f64027OooOO0O;
                this.f64028OooOO0o = i3 + 1;
                zArr2[i3] = z;
            }

            public final void OooO0o0(OooO00o oooO00o) {
                for (int i = 0; i < this.f64020OooO0OO; i++) {
                    int i2 = this.f64018OooO00o[i];
                    int i3 = this.f64019OooO0O0[i];
                    int[] iArr = OooO0OO.f64001OooO0oO;
                    if (i2 == 6) {
                        oooO00o.f64014OooO0o0.f64059OooOooO = i3;
                    } else if (i2 == 7) {
                        oooO00o.f64014OooO0o0.f64060OooOooo = i3;
                    } else if (i2 == 8) {
                        oooO00o.f64014OooO0o0.f64067Oooo0OO = i3;
                    } else if (i2 == 27) {
                        oooO00o.f64014OooO0o0.f64063Oooo000 = i3;
                    } else if (i2 == 28) {
                        oooO00o.f64014OooO0o0.f64065Oooo00o = i3;
                    } else if (i2 == 41) {
                        oooO00o.f64014OooO0o0.f64077OoooOOO = i3;
                    } else if (i2 == 42) {
                        oooO00o.f64014OooO0o0.f64078OoooOOo = i3;
                    } else if (i2 == 61) {
                        oooO00o.f64014OooO0o0.f64056OooOoOO = i3;
                    } else if (i2 == 62) {
                        oooO00o.f64014OooO0o0.f64058OooOoo0 = i3;
                    } else if (i2 == 72) {
                        oooO00o.f64014OooO0o0.f64088Oooooo0 = i3;
                    } else if (i2 == 73) {
                        oooO00o.f64014OooO0o0.f64087Oooooo = i3;
                    } else if (i2 == 2) {
                        oooO00o.f64014OooO0o0.f64066Oooo0O0 = i3;
                    } else if (i2 == 31) {
                        oooO00o.f64014OooO0o0.f64069Oooo0o0 = i3;
                    } else if (i2 == 34) {
                        oooO00o.f64014OooO0o0.f64062Oooo0 = i3;
                    } else if (i2 == 38) {
                        oooO00o.f64009OooO00o = i3;
                    } else if (i2 == 64) {
                        oooO00o.f64012OooO0Oo.f64101OooO0O0 = i3;
                    } else if (i2 == 66) {
                        oooO00o.f64012OooO0Oo.getClass();
                    } else if (i2 == 76) {
                        oooO00o.f64012OooO0Oo.f64103OooO0Oo = i3;
                    } else if (i2 == 78) {
                        oooO00o.f64011OooO0OO.f64111OooO0OO = i3;
                    } else if (i2 == 97) {
                        oooO00o.f64014OooO0o0.f64095o00o0O = i3;
                    } else if (i2 == 93) {
                        oooO00o.f64014OooO0o0.f64068Oooo0o = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                oooO00o.f64014OooO0o0.f64074OoooO00 = i3;
                                break;
                            case 12:
                                oooO00o.f64014OooO0o0.f64073OoooO0 = i3;
                                break;
                            case 13:
                                oooO00o.f64014OooO0o0.f64070Oooo0oO = i3;
                                break;
                            case 14:
                                oooO00o.f64014OooO0o0.f64061Oooo = i3;
                                break;
                            case 15:
                                oooO00o.f64014OooO0o0.f64075OoooO0O = i3;
                                break;
                            case 16:
                                oooO00o.f64014OooO0o0.f64071Oooo0oo = i3;
                                break;
                            case 17:
                                oooO00o.f64014OooO0o0.f64036OooO0o0 = i3;
                                break;
                            case 18:
                                oooO00o.f64014OooO0o0.f64035OooO0o = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 21:
                                        oooO00o.f64014OooO0o0.f64034OooO0Oo = i3;
                                        break;
                                    case 22:
                                        oooO00o.f64011OooO0OO.f64110OooO0O0 = i3;
                                        break;
                                    case 23:
                                        oooO00o.f64014OooO0o0.f64033OooO0OO = i3;
                                        break;
                                    case 24:
                                        oooO00o.f64014OooO0o0.f64064Oooo00O = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                oooO00o.f64014OooO0o0.f64079OoooOo0 = i3;
                                                break;
                                            case 55:
                                                oooO00o.f64014OooO0o0.f64080OoooOoO = i3;
                                                break;
                                            case 56:
                                                oooO00o.f64014OooO0o0.f64081OoooOoo = i3;
                                                break;
                                            case 57:
                                                oooO00o.f64014OooO0o0.f64082Ooooo00 = i3;
                                                break;
                                            case 58:
                                                oooO00o.f64014OooO0o0.f64083Ooooo0o = i3;
                                                break;
                                            case 59:
                                                oooO00o.f64014OooO0o0.f64084OooooO0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        oooO00o.f64012OooO0Oo.f64102OooO0OO = i3;
                                                        break;
                                                    case 83:
                                                        oooO00o.f64013OooO0o.f64115OooO = i3;
                                                        break;
                                                    case 84:
                                                        oooO00o.f64012OooO0Oo.f64107OooO0oo = i3;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                oooO00o.f64012OooO0Oo.getClass();
                                                                break;
                                                            case 89:
                                                                oooO00o.f64012OooO0Oo.f64108OooOO0 = i3;
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        oooO00o.f64014OooO0o0.f64072OoooO = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f64022OooO0o; i4++) {
                    int i5 = this.f64021OooO0Oo[i4];
                    float f = this.f64023OooO0o0[i4];
                    int[] iArr2 = OooO0OO.f64001OooO0oO;
                    if (i5 == 19) {
                        oooO00o.f64014OooO0o0.f64037OooO0oO = f;
                    } else if (i5 == 20) {
                        oooO00o.f64014OooO0o0.f64049OooOo = f;
                    } else if (i5 == 37) {
                        oooO00o.f64014OooO0o0.f64055OooOoO0 = f;
                    } else if (i5 == 60) {
                        oooO00o.f64013OooO0o.f64117OooO0O0 = f;
                    } else if (i5 == 63) {
                        oooO00o.f64014OooO0o0.f64057OooOoo = f;
                    } else if (i5 == 79) {
                        oooO00o.f64012OooO0Oo.f64105OooO0o0 = f;
                    } else if (i5 == 85) {
                        oooO00o.f64012OooO0Oo.f64106OooO0oO = f;
                    } else if (i5 != 87) {
                        if (i5 == 39) {
                            oooO00o.f64014OooO0o0.f64091o000oOoO = f;
                        } else if (i5 != 40) {
                            switch (i5) {
                                case 43:
                                    oooO00o.f64011OooO0OO.f64112OooO0Oo = f;
                                    break;
                                case 44:
                                    C21624OooO0o0 c21624OooO0o0 = oooO00o.f64013OooO0o;
                                    c21624OooO0o0.f64127OooOOO = f;
                                    c21624OooO0o0.f64128OooOOO0 = true;
                                    break;
                                case 45:
                                    oooO00o.f64013OooO0o.f64118OooO0OO = f;
                                    break;
                                case 46:
                                    oooO00o.f64013OooO0o.f64119OooO0Oo = f;
                                    break;
                                case 47:
                                    oooO00o.f64013OooO0o.f64121OooO0o0 = f;
                                    break;
                                case 48:
                                    oooO00o.f64013OooO0o.f64120OooO0o = f;
                                    break;
                                case 49:
                                    oooO00o.f64013OooO0o.f64122OooO0oO = f;
                                    break;
                                case 50:
                                    oooO00o.f64013OooO0o.f64123OooO0oo = f;
                                    break;
                                case 51:
                                    oooO00o.f64013OooO0o.f64124OooOO0 = f;
                                    break;
                                case 52:
                                    oooO00o.f64013OooO0o.f64125OooOO0O = f;
                                    break;
                                case 53:
                                    oooO00o.f64013OooO0o.f64126OooOO0o = f;
                                    break;
                                default:
                                    switch (i5) {
                                        case 67:
                                            oooO00o.f64012OooO0Oo.f64104OooO0o = f;
                                            break;
                                        case 68:
                                            oooO00o.f64011OooO0OO.f64113OooO0o0 = f;
                                            break;
                                        case 69:
                                            oooO00o.f64014OooO0o0.f64085OooooOO = f;
                                            break;
                                        case 70:
                                            oooO00o.f64014OooO0o0.f64086OooooOo = f;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            oooO00o.f64014OooO0o0.f64076OoooOO0 = f;
                        }
                    }
                }
                for (int i6 = 0; i6 < this.f64017OooO; i6++) {
                    int i7 = this.f64024OooO0oO[i6];
                    String str = this.f64025OooO0oo[i6];
                    int[] iArr3 = OooO0OO.f64001OooO0oO;
                    if (i7 == 5) {
                        oooO00o.f64014OooO0o0.f64054OooOoO = str;
                    } else if (i7 == 65) {
                        oooO00o.f64012OooO0Oo.getClass();
                    } else if (i7 == 74) {
                        OooO0O0 oooO0O0 = oooO00o.f64014OooO0o0;
                        oooO0O0.f64096o0OoOo0 = str;
                        oooO0O0.f64090Ooooooo = null;
                    } else if (i7 == 77) {
                        oooO00o.f64014OooO0o0.f64097ooOO = str;
                    } else if (i7 != 87) {
                        if (i7 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            oooO00o.f64012OooO0Oo.f64099OooO = str;
                        }
                    }
                }
                for (int i8 = 0; i8 < this.f64028OooOO0o; i8++) {
                    int i9 = this.f64026OooOO0[i8];
                    boolean z = this.f64027OooOO0O[i8];
                    int[] iArr4 = OooO0OO.f64001OooO0oO;
                    if (i9 == 44) {
                        oooO00o.f64013OooO0o.f64128OooOOO0 = z;
                    } else if (i9 == 75) {
                        oooO00o.f64014OooO0o0.f64094o00Ooo = z;
                    } else if (i9 != 87) {
                        if (i9 == 80) {
                            oooO00o.f64014OooO0o0.f64092o00O0O = z;
                        } else if (i9 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            oooO00o.f64014OooO0o0.f64093o00Oo0 = z;
                        }
                    }
                }
            }
        }

        public OooO00o() {
            OooO0Oo oooO0Oo = new OooO0Oo();
            oooO0Oo.f64109OooO00o = false;
            oooO0Oo.f64110OooO0O0 = 0;
            oooO0Oo.f64111OooO0OO = 0;
            oooO0Oo.f64112OooO0Oo = 1.0f;
            oooO0Oo.f64113OooO0o0 = Float.NaN;
            this.f64011OooO0OO = oooO0Oo;
            C19007OooO0OO c19007OooO0OO = new C19007OooO0OO();
            c19007OooO0OO.f64100OooO00o = false;
            c19007OooO0OO.f64101OooO0O0 = -1;
            c19007OooO0OO.f64102OooO0OO = 0;
            c19007OooO0OO.f64103OooO0Oo = -1;
            c19007OooO0OO.f64105OooO0o0 = Float.NaN;
            c19007OooO0OO.f64104OooO0o = Float.NaN;
            c19007OooO0OO.f64106OooO0oO = Float.NaN;
            c19007OooO0OO.f64107OooO0oo = -1;
            c19007OooO0OO.f64099OooO = null;
            c19007OooO0OO.f64108OooOO0 = -1;
            this.f64012OooO0Oo = c19007OooO0OO;
            this.f64014OooO0o0 = new OooO0O0();
            C21624OooO0o0 c21624OooO0o0 = new C21624OooO0o0();
            c21624OooO0o0.f64116OooO00o = false;
            c21624OooO0o0.f64117OooO0O0 = 0.0f;
            c21624OooO0o0.f64118OooO0OO = 0.0f;
            c21624OooO0o0.f64119OooO0Oo = 0.0f;
            c21624OooO0o0.f64121OooO0o0 = 1.0f;
            c21624OooO0o0.f64120OooO0o = 1.0f;
            c21624OooO0o0.f64122OooO0oO = Float.NaN;
            c21624OooO0o0.f64123OooO0oo = Float.NaN;
            c21624OooO0o0.f64115OooO = -1;
            c21624OooO0o0.f64124OooOO0 = 0.0f;
            c21624OooO0o0.f64125OooOO0O = 0.0f;
            c21624OooO0o0.f64126OooOO0o = 0.0f;
            c21624OooO0o0.f64128OooOOO0 = false;
            c21624OooO0o0.f64127OooOOO = 0.0f;
            this.f64013OooO0o = c21624OooO0o0;
            this.f64015OooO0oO = new HashMap<>();
        }

        public final void OooO00o(ConstraintLayout.OooO00o oooO00o) {
            OooO0O0 oooO0O0 = this.f64014OooO0o0;
            oooO00o.f63882OooO0o0 = oooO0O0.f64030OooO;
            oooO00o.f63881OooO0o = oooO0O0.f64039OooOO0;
            oooO00o.f63883OooO0oO = oooO0O0.f64040OooOO0O;
            oooO00o.f63884OooO0oo = oooO0O0.f64041OooOO0o;
            oooO00o.f63876OooO = oooO0O0.f64043OooOOO0;
            oooO00o.f63885OooOO0 = oooO0O0.f64042OooOOO;
            oooO00o.f63886OooOO0O = oooO0O0.f64044OooOOOO;
            oooO00o.f63887OooOO0o = oooO0O0.f64045OooOOOo;
            oooO00o.f63889OooOOO0 = oooO0O0.f64047OooOOo0;
            oooO00o.f63888OooOOO = oooO0O0.f64046OooOOo;
            oooO00o.f63890OooOOOO = oooO0O0.f64048OooOOoo;
            oooO00o.f63894OooOOoo = oooO0O0.f64051OooOo00;
            oooO00o.f63897OooOo00 = oooO0O0.f64050OooOo0;
            oooO00o.f63896OooOo0 = oooO0O0.f64052OooOo0O;
            oooO00o.f63898OooOo0O = oooO0O0.f64053OooOo0o;
            ((ViewGroup.MarginLayoutParams) oooO00o).leftMargin = oooO0O0.f64064Oooo00O;
            ((ViewGroup.MarginLayoutParams) oooO00o).rightMargin = oooO0O0.f64065Oooo00o;
            ((ViewGroup.MarginLayoutParams) oooO00o).topMargin = oooO0O0.f64062Oooo0;
            ((ViewGroup.MarginLayoutParams) oooO00o).bottomMargin = oooO0O0.f64066Oooo0O0;
            oooO00o.f63902OooOoOO = oooO0O0.f64075OoooO0O;
            oooO00o.f63904OooOoo0 = oooO0O0.f64073OoooO0;
            oooO00o.f63895OooOo = oooO0O0.f64071Oooo0oo;
            oooO00o.f63900OooOoO = oooO0O0.f64074OoooO00;
            oooO00o.f63906OooOooo = oooO0O0.f64049OooOo;
            oooO00o.f63909Oooo000 = oooO0O0.f64055OooOoO0;
            oooO00o.f63891OooOOOo = oooO0O0.f64056OooOoOO;
            oooO00o.f63893OooOOo0 = oooO0O0.f64058OooOoo0;
            oooO00o.f63892OooOOo = oooO0O0.f64057OooOoo;
            oooO00o.f63910Oooo00O = oooO0O0.f64054OooOoO;
            oooO00o.f63918OoooO = oooO0O0.f64059OooOooO;
            oooO00o.f63922OoooOO0 = oooO0O0.f64060OooOooo;
            oooO00o.f63908Oooo0 = oooO0O0.f64076OoooOO0;
            oooO00o.f63911Oooo00o = oooO0O0.f64091o000oOoO;
            oooO00o.f63913Oooo0OO = oooO0O0.f64078OoooOOo;
            oooO00o.f63912Oooo0O0 = oooO0O0.f64077OoooOOO;
            oooO00o.f63923OoooOOO = oooO0O0.f64092o00O0O;
            oooO00o.f63924OoooOOo = oooO0O0.f64093o00Oo0;
            oooO00o.f63915Oooo0o0 = oooO0O0.f64079OoooOo0;
            oooO00o.f63914Oooo0o = oooO0O0.f64080OoooOoO;
            oooO00o.f63907Oooo = oooO0O0.f64081OoooOoo;
            oooO00o.f63920OoooO00 = oooO0O0.f64082Ooooo00;
            oooO00o.f63916Oooo0oO = oooO0O0.f64083Ooooo0o;
            oooO00o.f63917Oooo0oo = oooO0O0.f64084OooooO0;
            oooO00o.f63919OoooO0 = oooO0O0.f64085OooooOO;
            oooO00o.f63921OoooO0O = oooO0O0.f64086OooooOo;
            oooO00o.f63937o000oOoO = oooO0O0.f64063Oooo000;
            oooO00o.f63879OooO0OO = oooO0O0.f64037OooO0oO;
            oooO00o.f63877OooO00o = oooO0O0.f64036OooO0o0;
            oooO00o.f63878OooO0O0 = oooO0O0.f64035OooO0o;
            ((ViewGroup.MarginLayoutParams) oooO00o).width = oooO0O0.f64033OooO0OO;
            ((ViewGroup.MarginLayoutParams) oooO00o).height = oooO0O0.f64034OooO0Oo;
            String str = oooO0O0.f64097ooOO;
            if (str != null) {
                oooO00o.f63925OoooOo0 = str;
            }
            oooO00o.f63926OoooOoO = oooO0O0.f64095o00o0O;
            oooO00o.setMarginStart(oooO0O0.f64069Oooo0o0);
            oooO00o.setMarginEnd(oooO0O0.f64067Oooo0OO);
            oooO00o.OooO00o();
        }

        /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
        public final OooO00o clone() {
            OooO00o oooO00o = new OooO00o();
            oooO00o.f64014OooO0o0.OooO00o(this.f64014OooO0o0);
            oooO00o.f64012OooO0Oo.OooO00o(this.f64012OooO0Oo);
            OooO0Oo oooO0Oo = oooO00o.f64011OooO0OO;
            OooO0Oo oooO0Oo2 = this.f64011OooO0OO;
            oooO0Oo.f64109OooO00o = oooO0Oo2.f64109OooO00o;
            oooO0Oo.f64110OooO0O0 = oooO0Oo2.f64110OooO0O0;
            oooO0Oo.f64112OooO0Oo = oooO0Oo2.f64112OooO0Oo;
            oooO0Oo.f64113OooO0o0 = oooO0Oo2.f64113OooO0o0;
            oooO0Oo.f64111OooO0OO = oooO0Oo2.f64111OooO0OO;
            oooO00o.f64013OooO0o.OooO00o(this.f64013OooO0o);
            oooO00o.f64009OooO00o = this.f64009OooO00o;
            oooO00o.f64016OooO0oo = this.f64016OooO0oo;
            return oooO00o;
        }

        public final void OooO0OO(int i, ConstraintLayout.OooO00o oooO00o) {
            this.f64009OooO00o = i;
            int i2 = oooO00o.f63882OooO0o0;
            OooO0O0 oooO0O0 = this.f64014OooO0o0;
            oooO0O0.f64030OooO = i2;
            oooO0O0.f64039OooOO0 = oooO00o.f63881OooO0o;
            oooO0O0.f64040OooOO0O = oooO00o.f63883OooO0oO;
            oooO0O0.f64041OooOO0o = oooO00o.f63884OooO0oo;
            oooO0O0.f64043OooOOO0 = oooO00o.f63876OooO;
            oooO0O0.f64042OooOOO = oooO00o.f63885OooOO0;
            oooO0O0.f64044OooOOOO = oooO00o.f63886OooOO0O;
            oooO0O0.f64045OooOOOo = oooO00o.f63887OooOO0o;
            oooO0O0.f64047OooOOo0 = oooO00o.f63889OooOOO0;
            oooO0O0.f64046OooOOo = oooO00o.f63888OooOOO;
            oooO0O0.f64048OooOOoo = oooO00o.f63890OooOOOO;
            oooO0O0.f64051OooOo00 = oooO00o.f63894OooOOoo;
            oooO0O0.f64050OooOo0 = oooO00o.f63897OooOo00;
            oooO0O0.f64052OooOo0O = oooO00o.f63896OooOo0;
            oooO0O0.f64053OooOo0o = oooO00o.f63898OooOo0O;
            oooO0O0.f64049OooOo = oooO00o.f63906OooOooo;
            oooO0O0.f64055OooOoO0 = oooO00o.f63909Oooo000;
            oooO0O0.f64054OooOoO = oooO00o.f63910Oooo00O;
            oooO0O0.f64056OooOoOO = oooO00o.f63891OooOOOo;
            oooO0O0.f64058OooOoo0 = oooO00o.f63893OooOOo0;
            oooO0O0.f64057OooOoo = oooO00o.f63892OooOOo;
            oooO0O0.f64059OooOooO = oooO00o.f63918OoooO;
            oooO0O0.f64060OooOooo = oooO00o.f63922OoooOO0;
            oooO0O0.f64063Oooo000 = oooO00o.f63937o000oOoO;
            oooO0O0.f64037OooO0oO = oooO00o.f63879OooO0OO;
            oooO0O0.f64036OooO0o0 = oooO00o.f63877OooO00o;
            oooO0O0.f64035OooO0o = oooO00o.f63878OooO0O0;
            oooO0O0.f64033OooO0OO = ((ViewGroup.MarginLayoutParams) oooO00o).width;
            oooO0O0.f64034OooO0Oo = ((ViewGroup.MarginLayoutParams) oooO00o).height;
            oooO0O0.f64064Oooo00O = ((ViewGroup.MarginLayoutParams) oooO00o).leftMargin;
            oooO0O0.f64065Oooo00o = ((ViewGroup.MarginLayoutParams) oooO00o).rightMargin;
            oooO0O0.f64062Oooo0 = ((ViewGroup.MarginLayoutParams) oooO00o).topMargin;
            oooO0O0.f64066Oooo0O0 = ((ViewGroup.MarginLayoutParams) oooO00o).bottomMargin;
            oooO0O0.f64068Oooo0o = oooO00o.f63905OooOooO;
            oooO0O0.f64076OoooOO0 = oooO00o.f63908Oooo0;
            oooO0O0.f64091o000oOoO = oooO00o.f63911Oooo00o;
            oooO0O0.f64078OoooOOo = oooO00o.f63913Oooo0OO;
            oooO0O0.f64077OoooOOO = oooO00o.f63912Oooo0O0;
            oooO0O0.f64092o00O0O = oooO00o.f63923OoooOOO;
            oooO0O0.f64093o00Oo0 = oooO00o.f63924OoooOOo;
            oooO0O0.f64079OoooOo0 = oooO00o.f63915Oooo0o0;
            oooO0O0.f64080OoooOoO = oooO00o.f63914Oooo0o;
            oooO0O0.f64081OoooOoo = oooO00o.f63907Oooo;
            oooO0O0.f64082Ooooo00 = oooO00o.f63920OoooO00;
            oooO0O0.f64083Ooooo0o = oooO00o.f63916Oooo0oO;
            oooO0O0.f64084OooooO0 = oooO00o.f63917Oooo0oo;
            oooO0O0.f64085OooooOO = oooO00o.f63919OoooO0;
            oooO0O0.f64086OooooOo = oooO00o.f63921OoooO0O;
            oooO0O0.f64097ooOO = oooO00o.f63925OoooOo0;
            oooO0O0.f64071Oooo0oo = oooO00o.f63895OooOo;
            oooO0O0.f64074OoooO00 = oooO00o.f63900OooOoO;
            oooO0O0.f64070Oooo0oO = oooO00o.f63899OooOo0o;
            oooO0O0.f64061Oooo = oooO00o.f63901OooOoO0;
            oooO0O0.f64075OoooO0O = oooO00o.f63902OooOoOO;
            oooO0O0.f64073OoooO0 = oooO00o.f63904OooOoo0;
            oooO0O0.f64072OoooO = oooO00o.f63903OooOoo;
            oooO0O0.f64095o00o0O = oooO00o.f63926OoooOoO;
            oooO0O0.f64067Oooo0OO = oooO00o.getMarginEnd();
            oooO0O0.f64069Oooo0o0 = oooO00o.getMarginStart();
        }

        public final void OooO0Oo(int i, Constraints.OooO00o oooO00o) {
            OooO0OO(i, oooO00o);
            this.f64011OooO0OO.f64112OooO0Oo = oooO00o.f63965oo000o;
            float f = oooO00o.f63962o0ooOO0;
            C21624OooO0o0 c21624OooO0o0 = this.f64013OooO0o;
            c21624OooO0o0.f64117OooO0O0 = f;
            c21624OooO0o0.f64118OooO0OO = oooO00o.f63963o0ooOOo;
            c21624OooO0o0.f64119OooO0Oo = oooO00o.f63964o0ooOoO;
            c21624OooO0o0.f64121OooO0o0 = oooO00o.f63960o0OOO0o;
            c21624OooO0o0.f64120OooO0o = oooO00o.f63961o0Oo0oo;
            c21624OooO0o0.f64122OooO0oO = oooO00o.f63959o0OO00O;
            c21624OooO0o0.f64123OooO0oo = oooO00o.f63966oo0o0Oo;
            c21624OooO0o0.f64124OooOO0 = oooO00o.f63958o0O0O00;
            c21624OooO0o0.f64125OooOO0O = oooO00o.f63955o000OOo;
            c21624OooO0o0.f64126OooOO0o = oooO00o.f63954o000000;
            c21624OooO0o0.f64127OooOOO = oooO00o.f63956o00oO0O;
            c21624OooO0o0.f64128OooOOO0 = oooO00o.f63957o00oO0o;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
        public static final SparseIntArray f64029o00ooo;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f64033OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f64034OooO0Oo;

        /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
        public int[] f64090Ooooooo;

        /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
        public String f64096o0OoOo0;

        /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
        public String f64097ooOO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f64031OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f64032OooO0O0 = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f64036OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f64035OooO0o = -1;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f64037OooO0oO = -1.0f;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f64038OooO0oo = true;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f64030OooO = -1;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f64039OooOO0 = -1;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f64040OooOO0O = -1;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f64041OooOO0o = -1;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f64043OooOOO0 = -1;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f64042OooOOO = -1;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f64044OooOOOO = -1;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f64045OooOOOo = -1;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f64047OooOOo0 = -1;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f64046OooOOo = -1;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f64048OooOOoo = -1;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f64051OooOo00 = -1;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f64050OooOo0 = -1;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f64052OooOo0O = -1;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f64053OooOo0o = -1;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f64049OooOo = 0.5f;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public float f64055OooOoO0 = 0.5f;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public String f64054OooOoO = null;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f64056OooOoOO = -1;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f64058OooOoo0 = 0;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public float f64057OooOoo = 0.0f;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f64059OooOooO = -1;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public int f64060OooOooo = -1;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public int f64063Oooo000 = -1;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public int f64064Oooo00O = 0;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public int f64065Oooo00o = 0;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public int f64062Oooo0 = 0;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public int f64066Oooo0O0 = 0;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public int f64067Oooo0OO = 0;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public int f64069Oooo0o0 = 0;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f64068Oooo0o = 0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f64070Oooo0oO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f64071Oooo0oo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f64061Oooo = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f64074OoooO00 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f64073OoooO0 = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f64075OoooO0O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f64072OoooO = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public float f64076OoooOO0 = -1.0f;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public float f64091o000oOoO = -1.0f;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public int f64077OoooOOO = 0;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public int f64078OoooOOo = 0;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public int f64079OoooOo0 = 0;

        /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
        public int f64080OoooOoO = 0;

        /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
        public int f64081OoooOoo = 0;

        /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
        public int f64082Ooooo00 = 0;

        /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
        public int f64083Ooooo0o = 0;

        /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
        public int f64084OooooO0 = 0;

        /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
        public float f64085OooooOO = 1.0f;

        /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
        public float f64086OooooOo = 1.0f;

        /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
        public int f64088Oooooo0 = -1;

        /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
        public int f64087Oooooo = 0;

        /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
        public int f64089OoooooO = -1;

        /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
        public boolean f64092o00O0O = false;

        /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
        public boolean f64093o00Oo0 = false;

        /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
        public boolean f64094o00Ooo = true;

        /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
        public int f64095o00o0O = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f64029o00ooo = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 87);
            sparseIntArray.append(16, 88);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
            sparseIntArray.append(58, 84);
            sparseIntArray.append(59, 86);
            sparseIntArray.append(58, 83);
            sparseIntArray.append(37, 85);
            sparseIntArray.append(56, 87);
            sparseIntArray.append(34, 88);
            sparseIntArray.append(91, 89);
            sparseIntArray.append(15, 90);
        }

        public final void OooO00o(OooO0O0 oooO0O0) {
            this.f64031OooO00o = oooO0O0.f64031OooO00o;
            this.f64033OooO0OO = oooO0O0.f64033OooO0OO;
            this.f64032OooO0O0 = oooO0O0.f64032OooO0O0;
            this.f64034OooO0Oo = oooO0O0.f64034OooO0Oo;
            this.f64036OooO0o0 = oooO0O0.f64036OooO0o0;
            this.f64035OooO0o = oooO0O0.f64035OooO0o;
            this.f64037OooO0oO = oooO0O0.f64037OooO0oO;
            this.f64038OooO0oo = oooO0O0.f64038OooO0oo;
            this.f64030OooO = oooO0O0.f64030OooO;
            this.f64039OooOO0 = oooO0O0.f64039OooOO0;
            this.f64040OooOO0O = oooO0O0.f64040OooOO0O;
            this.f64041OooOO0o = oooO0O0.f64041OooOO0o;
            this.f64043OooOOO0 = oooO0O0.f64043OooOOO0;
            this.f64042OooOOO = oooO0O0.f64042OooOOO;
            this.f64044OooOOOO = oooO0O0.f64044OooOOOO;
            this.f64045OooOOOo = oooO0O0.f64045OooOOOo;
            this.f64047OooOOo0 = oooO0O0.f64047OooOOo0;
            this.f64046OooOOo = oooO0O0.f64046OooOOo;
            this.f64048OooOOoo = oooO0O0.f64048OooOOoo;
            this.f64051OooOo00 = oooO0O0.f64051OooOo00;
            this.f64050OooOo0 = oooO0O0.f64050OooOo0;
            this.f64052OooOo0O = oooO0O0.f64052OooOo0O;
            this.f64053OooOo0o = oooO0O0.f64053OooOo0o;
            this.f64049OooOo = oooO0O0.f64049OooOo;
            this.f64055OooOoO0 = oooO0O0.f64055OooOoO0;
            this.f64054OooOoO = oooO0O0.f64054OooOoO;
            this.f64056OooOoOO = oooO0O0.f64056OooOoOO;
            this.f64058OooOoo0 = oooO0O0.f64058OooOoo0;
            this.f64057OooOoo = oooO0O0.f64057OooOoo;
            this.f64059OooOooO = oooO0O0.f64059OooOooO;
            this.f64060OooOooo = oooO0O0.f64060OooOooo;
            this.f64063Oooo000 = oooO0O0.f64063Oooo000;
            this.f64064Oooo00O = oooO0O0.f64064Oooo00O;
            this.f64065Oooo00o = oooO0O0.f64065Oooo00o;
            this.f64062Oooo0 = oooO0O0.f64062Oooo0;
            this.f64066Oooo0O0 = oooO0O0.f64066Oooo0O0;
            this.f64067Oooo0OO = oooO0O0.f64067Oooo0OO;
            this.f64069Oooo0o0 = oooO0O0.f64069Oooo0o0;
            this.f64068Oooo0o = oooO0O0.f64068Oooo0o;
            this.f64070Oooo0oO = oooO0O0.f64070Oooo0oO;
            this.f64071Oooo0oo = oooO0O0.f64071Oooo0oo;
            this.f64061Oooo = oooO0O0.f64061Oooo;
            this.f64074OoooO00 = oooO0O0.f64074OoooO00;
            this.f64073OoooO0 = oooO0O0.f64073OoooO0;
            this.f64075OoooO0O = oooO0O0.f64075OoooO0O;
            this.f64072OoooO = oooO0O0.f64072OoooO;
            this.f64076OoooOO0 = oooO0O0.f64076OoooOO0;
            this.f64091o000oOoO = oooO0O0.f64091o000oOoO;
            this.f64077OoooOOO = oooO0O0.f64077OoooOOO;
            this.f64078OoooOOo = oooO0O0.f64078OoooOOo;
            this.f64079OoooOo0 = oooO0O0.f64079OoooOo0;
            this.f64080OoooOoO = oooO0O0.f64080OoooOoO;
            this.f64081OoooOoo = oooO0O0.f64081OoooOoo;
            this.f64082Ooooo00 = oooO0O0.f64082Ooooo00;
            this.f64083Ooooo0o = oooO0O0.f64083Ooooo0o;
            this.f64084OooooO0 = oooO0O0.f64084OooooO0;
            this.f64085OooooOO = oooO0O0.f64085OooooOO;
            this.f64086OooooOo = oooO0O0.f64086OooooOo;
            this.f64088Oooooo0 = oooO0O0.f64088Oooooo0;
            this.f64087Oooooo = oooO0O0.f64087Oooooo;
            this.f64089OoooooO = oooO0O0.f64089OoooooO;
            this.f64097ooOO = oooO0O0.f64097ooOO;
            int[] iArr = oooO0O0.f64090Ooooooo;
            if (iArr == null || oooO0O0.f64096o0OoOo0 != null) {
                this.f64090Ooooooo = null;
            } else {
                this.f64090Ooooooo = Arrays.copyOf(iArr, iArr.length);
            }
            this.f64096o0OoOo0 = oooO0O0.f64096o0OoOo0;
            this.f64092o00O0O = oooO0O0.f64092o00O0O;
            this.f64093o00Oo0 = oooO0O0.f64093o00Oo0;
            this.f64094o00Ooo = oooO0O0.f64094o00Ooo;
            this.f64095o00o0O = oooO0O0.f64095o00o0O;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.f64140OooOO0o);
            this.f64032OooO0O0 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = f64029o00ooo;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.f64047OooOOo0 = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64047OooOOo0);
                        break;
                    case 2:
                        this.f64066Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64066Oooo0O0);
                        break;
                    case 3:
                        this.f64045OooOOOo = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64045OooOOOo);
                        break;
                    case 4:
                        this.f64044OooOOOO = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64044OooOOOO);
                        break;
                    case 5:
                        this.f64054OooOoO = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f64059OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f64059OooOooO);
                        break;
                    case 7:
                        this.f64060OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f64060OooOooo);
                        break;
                    case 8:
                        this.f64067Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64067Oooo0OO);
                        break;
                    case 9:
                        this.f64053OooOo0o = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64053OooOo0o);
                        break;
                    case 10:
                        this.f64052OooOo0O = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64052OooOo0O);
                        break;
                    case 11:
                        this.f64074OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64074OoooO00);
                        break;
                    case 12:
                        this.f64073OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64073OoooO0);
                        break;
                    case 13:
                        this.f64070Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64070Oooo0oO);
                        break;
                    case 14:
                        this.f64061Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64061Oooo);
                        break;
                    case 15:
                        this.f64075OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64075OoooO0O);
                        break;
                    case 16:
                        this.f64071Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64071Oooo0oo);
                        break;
                    case 17:
                        this.f64036OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f64036OooO0o0);
                        break;
                    case 18:
                        this.f64035OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f64035OooO0o);
                        break;
                    case 19:
                        this.f64037OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f64037OooO0oO);
                        break;
                    case 20:
                        this.f64049OooOo = typedArrayObtainStyledAttributes.getFloat(index, this.f64049OooOo);
                        break;
                    case 21:
                        this.f64034OooO0Oo = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f64034OooO0Oo);
                        break;
                    case 22:
                        this.f64033OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f64033OooO0OO);
                        break;
                    case 23:
                        this.f64064Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64064Oooo00O);
                        break;
                    case 24:
                        this.f64030OooO = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64030OooO);
                        break;
                    case 25:
                        this.f64039OooOO0 = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64039OooOO0);
                        break;
                    case 26:
                        this.f64063Oooo000 = typedArrayObtainStyledAttributes.getInt(index, this.f64063Oooo000);
                        break;
                    case 27:
                        this.f64065Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64065Oooo00o);
                        break;
                    case 28:
                        this.f64040OooOO0O = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64040OooOO0O);
                        break;
                    case 29:
                        this.f64041OooOO0o = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64041OooOO0o);
                        break;
                    case 30:
                        this.f64069Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64069Oooo0o0);
                        break;
                    case 31:
                        this.f64051OooOo00 = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64051OooOo00);
                        break;
                    case 32:
                        this.f64050OooOo0 = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64050OooOo0);
                        break;
                    case 33:
                        this.f64062Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64062Oooo0);
                        break;
                    case 34:
                        this.f64042OooOOO = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64042OooOOO);
                        break;
                    case 35:
                        this.f64043OooOOO0 = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64043OooOOO0);
                        break;
                    case 36:
                        this.f64055OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f64055OooOoO0);
                        break;
                    case 37:
                        this.f64091o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f64091o000oOoO);
                        break;
                    case 38:
                        this.f64076OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f64076OoooOO0);
                        break;
                    case 39:
                        this.f64077OoooOOO = typedArrayObtainStyledAttributes.getInt(index, this.f64077OoooOOO);
                        break;
                    case 40:
                        this.f64078OoooOOo = typedArrayObtainStyledAttributes.getInt(index, this.f64078OoooOOo);
                        break;
                    case 41:
                        OooO0OO.OooOOOO(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        OooO0OO.OooOOOO(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f64056OooOoOO = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64056OooOoOO);
                                break;
                            case 62:
                                this.f64058OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64058OooOoo0);
                                break;
                            case 63:
                                this.f64057OooOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f64057OooOoo);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f64085OooooOO = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f64086OooooOo = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f64088Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, this.f64088Oooooo0);
                                        break;
                                    case 73:
                                        this.f64087Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64087Oooooo);
                                        break;
                                    case 74:
                                        this.f64096o0OoOo0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f64094o00Ooo = typedArrayObtainStyledAttributes.getBoolean(index, this.f64094o00Ooo);
                                        break;
                                    case 76:
                                        this.f64095o00o0O = typedArrayObtainStyledAttributes.getInt(index, this.f64095o00o0O);
                                        break;
                                    case 77:
                                        this.f64046OooOOo = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64046OooOOo);
                                        break;
                                    case 78:
                                        this.f64048OooOOoo = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64048OooOOoo);
                                        break;
                                    case 79:
                                        this.f64072OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64072OoooO);
                                        break;
                                    case 80:
                                        this.f64068Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64068Oooo0o);
                                        break;
                                    case 81:
                                        this.f64079OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, this.f64079OoooOo0);
                                        break;
                                    case 82:
                                        this.f64080OoooOoO = typedArrayObtainStyledAttributes.getInt(index, this.f64080OoooOoO);
                                        break;
                                    case 83:
                                        this.f64082Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64082Ooooo00);
                                        break;
                                    case 84:
                                        this.f64081OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64081OoooOoo);
                                        break;
                                    case 85:
                                        this.f64084OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64084OooooO0);
                                        break;
                                    case 86:
                                        this.f64083Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f64083Ooooo0o);
                                        break;
                                    case 87:
                                        this.f64092o00O0O = typedArrayObtainStyledAttributes.getBoolean(index, this.f64092o00O0O);
                                        break;
                                    case 88:
                                        this.f64093o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f64093o00Oo0);
                                        break;
                                    case 89:
                                        this.f64097ooOO = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f64038OooO0oo = typedArrayObtainStyledAttributes.getBoolean(index, this.f64038OooO0oo);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static class C19007OooO0OO {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final SparseIntArray f64098OooOO0O;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public String f64099OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f64100OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f64101OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f64102OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f64103OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f64104OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f64105OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f64106OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f64107OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f64108OooOO0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f64098OooOO0O = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void OooO00o(C19007OooO0OO c19007OooO0OO) {
            this.f64100OooO00o = c19007OooO0OO.f64100OooO00o;
            this.f64101OooO0O0 = c19007OooO0OO.f64101OooO0O0;
            this.f64103OooO0Oo = c19007OooO0OO.f64103OooO0Oo;
            this.f64104OooO0o = c19007OooO0OO.f64104OooO0o;
            this.f64105OooO0o0 = c19007OooO0OO.f64105OooO0o0;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.f64142OooOOO0);
            this.f64100OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f64098OooOO0O.get(index)) {
                    case 1:
                        this.f64104OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f64104OooO0o);
                        break;
                    case 2:
                        this.f64103OooO0Oo = typedArrayObtainStyledAttributes.getInt(index, this.f64103OooO0Oo);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            String str = o0000O00.OooO0OO.f81369OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f64101OooO0O0 = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64101OooO0O0);
                        break;
                    case 6:
                        this.f64102OooO0OO = typedArrayObtainStyledAttributes.getInteger(index, this.f64102OooO0OO);
                        break;
                    case 7:
                        this.f64105OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f64105OooO0o0);
                        break;
                    case 8:
                        this.f64107OooO0oo = typedArrayObtainStyledAttributes.getInteger(index, this.f64107OooO0oo);
                        break;
                    case 9:
                        this.f64106OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f64106OooO0oO);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            this.f64108OooOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f64099OooO = string;
                            if (string.indexOf("/") > 0) {
                                this.f64108OooOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index, this.f64108OooOO0);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f64109OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f64110OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f64111OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f64112OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f64113OooO0o0;

        public final void OooO00o(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.f64145OooOOo);
            this.f64109OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f64112OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f64112OooO0Oo);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f64110OooO0O0);
                    this.f64110OooO0O0 = i2;
                    this.f64110OooO0O0 = OooO0OO.f64001OooO0oO[i2];
                } else if (index == 4) {
                    this.f64111OooO0OO = typedArrayObtainStyledAttributes.getInt(index, this.f64111OooO0OO);
                } else if (index == 3) {
                    this.f64113OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f64113OooO0o0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.OooO0OO$OooO0o0, reason: case insensitive filesystem */
    public static class C21624OooO0o0 {

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final SparseIntArray f64114OooOOOO;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f64115OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f64116OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f64117OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f64118OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f64119OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f64120OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f64121OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f64122OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f64123OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f64124OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f64125OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f64126OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float f64127OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f64128OooOOO0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f64114OooOOOO = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void OooO00o(C21624OooO0o0 c21624OooO0o0) {
            this.f64116OooO00o = c21624OooO0o0.f64116OooO00o;
            this.f64117OooO0O0 = c21624OooO0o0.f64117OooO0O0;
            this.f64118OooO0OO = c21624OooO0o0.f64118OooO0OO;
            this.f64119OooO0Oo = c21624OooO0o0.f64119OooO0Oo;
            this.f64121OooO0o0 = c21624OooO0o0.f64121OooO0o0;
            this.f64120OooO0o = c21624OooO0o0.f64120OooO0o;
            this.f64122OooO0oO = c21624OooO0o0.f64122OooO0oO;
            this.f64123OooO0oo = c21624OooO0o0.f64123OooO0oo;
            this.f64115OooO = c21624OooO0o0.f64115OooO;
            this.f64124OooOO0 = c21624OooO0o0.f64124OooOO0;
            this.f64125OooOO0O = c21624OooO0o0.f64125OooOO0O;
            this.f64126OooOO0o = c21624OooO0o0.f64126OooOO0o;
            this.f64128OooOOO0 = c21624OooO0o0.f64128OooOOO0;
            this.f64127OooOOO = c21624OooO0o0.f64127OooOOO;
        }

        public final void OooO0O0(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0o.f64149OooOo0);
            this.f64116OooO00o = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f64114OooOOOO.get(index)) {
                    case 1:
                        this.f64117OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, this.f64117OooO0O0);
                        break;
                    case 2:
                        this.f64118OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, this.f64118OooO0OO);
                        break;
                    case 3:
                        this.f64119OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, this.f64119OooO0Oo);
                        break;
                    case 4:
                        this.f64121OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f64121OooO0o0);
                        break;
                    case 5:
                        this.f64120OooO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f64120OooO0o);
                        break;
                    case 6:
                        this.f64122OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, this.f64122OooO0oO);
                        break;
                    case 7:
                        this.f64123OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, this.f64123OooO0oo);
                        break;
                    case 8:
                        this.f64124OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.f64124OooOO0);
                        break;
                    case 9:
                        this.f64125OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, this.f64125OooOO0O);
                        break;
                    case 10:
                        this.f64126OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, this.f64126OooOO0o);
                        break;
                    case 11:
                        this.f64128OooOOO0 = true;
                        this.f64127OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f64127OooOOO);
                        break;
                    case 12:
                        this.f64115OooO = OooO0OO.OooOOO(typedArrayObtainStyledAttributes, index, this.f64115OooO);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f64002OooO0oo = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f64000OooO = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static OooO00o OooO(Context context, AttributeSet attributeSet, boolean z) {
        OooO00o oooO00o = new OooO00o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? OooO0o.f64132OooO0OO : OooO0o.f64130OooO00o);
        if (z) {
            OooOOo0(oooO00o, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i = 0;
            while (true) {
                OooO0O0 oooO0O0 = oooO00o.f64014OooO0o0;
                if (i < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    OooO0Oo oooO0Oo = oooO00o.f64011OooO0OO;
                    C21624OooO0o0 c21624OooO0o0 = oooO00o.f64013OooO0o;
                    C19007OooO0OO c19007OooO0OO = oooO00o.f64012OooO0Oo;
                    if (index != 1 && 23 != index && 24 != index) {
                        c19007OooO0OO.f64100OooO00o = true;
                        oooO0O0.f64032OooO0O0 = true;
                        oooO0Oo.f64109OooO00o = true;
                        c21624OooO0o0.f64116OooO00o = true;
                    }
                    SparseIntArray sparseIntArray = f64002OooO0oo;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            oooO0O0.f64047OooOOo0 = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64047OooOOo0);
                            break;
                        case 2:
                            oooO0O0.f64066Oooo0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64066Oooo0O0);
                            break;
                        case 3:
                            oooO0O0.f64045OooOOOo = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64045OooOOOo);
                            break;
                        case 4:
                            oooO0O0.f64044OooOOOO = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64044OooOOOO);
                            break;
                        case 5:
                            oooO0O0.f64054OooOoO = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            oooO0O0.f64059OooOooO = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O0.f64059OooOooO);
                            break;
                        case 7:
                            oooO0O0.f64060OooOooo = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O0.f64060OooOooo);
                            break;
                        case 8:
                            oooO0O0.f64067Oooo0OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64067Oooo0OO);
                            break;
                        case 9:
                            oooO0O0.f64053OooOo0o = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64053OooOo0o);
                            break;
                        case 10:
                            oooO0O0.f64052OooOo0O = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64052OooOo0O);
                            break;
                        case 11:
                            oooO0O0.f64074OoooO00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64074OoooO00);
                            break;
                        case 12:
                            oooO0O0.f64073OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64073OoooO0);
                            break;
                        case 13:
                            oooO0O0.f64070Oooo0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64070Oooo0oO);
                            break;
                        case 14:
                            oooO0O0.f64061Oooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64061Oooo);
                            break;
                        case 15:
                            oooO0O0.f64075OoooO0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64075OoooO0O);
                            break;
                        case 16:
                            oooO0O0.f64071Oooo0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64071Oooo0oo);
                            break;
                        case 17:
                            oooO0O0.f64036OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O0.f64036OooO0o0);
                            break;
                        case 18:
                            oooO0O0.f64035OooO0o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oooO0O0.f64035OooO0o);
                            break;
                        case 19:
                            oooO0O0.f64037OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, oooO0O0.f64037OooO0oO);
                            break;
                        case 20:
                            oooO0O0.f64049OooOo = typedArrayObtainStyledAttributes.getFloat(index, oooO0O0.f64049OooOo);
                            break;
                        case 21:
                            oooO0O0.f64034OooO0Oo = typedArrayObtainStyledAttributes.getLayoutDimension(index, oooO0O0.f64034OooO0Oo);
                            break;
                        case 22:
                            int i2 = typedArrayObtainStyledAttributes.getInt(index, oooO0Oo.f64110OooO0O0);
                            oooO0Oo.f64110OooO0O0 = i2;
                            oooO0Oo.f64110OooO0O0 = f64001OooO0oO[i2];
                            break;
                        case 23:
                            oooO0O0.f64033OooO0OO = typedArrayObtainStyledAttributes.getLayoutDimension(index, oooO0O0.f64033OooO0OO);
                            break;
                        case 24:
                            oooO0O0.f64064Oooo00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64064Oooo00O);
                            break;
                        case 25:
                            oooO0O0.f64030OooO = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64030OooO);
                            break;
                        case 26:
                            oooO0O0.f64039OooOO0 = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64039OooOO0);
                            break;
                        case 27:
                            oooO0O0.f64063Oooo000 = typedArrayObtainStyledAttributes.getInt(index, oooO0O0.f64063Oooo000);
                            break;
                        case 28:
                            oooO0O0.f64065Oooo00o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64065Oooo00o);
                            break;
                        case 29:
                            oooO0O0.f64040OooOO0O = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64040OooOO0O);
                            break;
                        case 30:
                            oooO0O0.f64041OooOO0o = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64041OooOO0o);
                            break;
                        case 31:
                            oooO0O0.f64069Oooo0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64069Oooo0o0);
                            break;
                        case 32:
                            oooO0O0.f64051OooOo00 = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64051OooOo00);
                            break;
                        case 33:
                            oooO0O0.f64050OooOo0 = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64050OooOo0);
                            break;
                        case 34:
                            oooO0O0.f64062Oooo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64062Oooo0);
                            break;
                        case 35:
                            oooO0O0.f64042OooOOO = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64042OooOOO);
                            break;
                        case 36:
                            oooO0O0.f64043OooOOO0 = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64043OooOOO0);
                            break;
                        case 37:
                            oooO0O0.f64055OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0O0.f64055OooOoO0);
                            break;
                        case 38:
                            oooO00o.f64009OooO00o = typedArrayObtainStyledAttributes.getResourceId(index, oooO00o.f64009OooO00o);
                            break;
                        case 39:
                            oooO0O0.f64091o000oOoO = typedArrayObtainStyledAttributes.getFloat(index, oooO0O0.f64091o000oOoO);
                            break;
                        case 40:
                            oooO0O0.f64076OoooOO0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0O0.f64076OoooOO0);
                            break;
                        case 41:
                            oooO0O0.f64077OoooOOO = typedArrayObtainStyledAttributes.getInt(index, oooO0O0.f64077OoooOOO);
                            break;
                        case 42:
                            oooO0O0.f64078OoooOOo = typedArrayObtainStyledAttributes.getInt(index, oooO0O0.f64078OoooOOo);
                            break;
                        case 43:
                            oooO0Oo.f64112OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, oooO0Oo.f64112OooO0Oo);
                            break;
                        case 44:
                            c21624OooO0o0.f64128OooOOO0 = true;
                            c21624OooO0o0.f64127OooOOO = typedArrayObtainStyledAttributes.getDimension(index, c21624OooO0o0.f64127OooOOO);
                            break;
                        case 45:
                            c21624OooO0o0.f64118OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, c21624OooO0o0.f64118OooO0OO);
                            break;
                        case 46:
                            c21624OooO0o0.f64119OooO0Oo = typedArrayObtainStyledAttributes.getFloat(index, c21624OooO0o0.f64119OooO0Oo);
                            break;
                        case 47:
                            c21624OooO0o0.f64121OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, c21624OooO0o0.f64121OooO0o0);
                            break;
                        case 48:
                            c21624OooO0o0.f64120OooO0o = typedArrayObtainStyledAttributes.getFloat(index, c21624OooO0o0.f64120OooO0o);
                            break;
                        case 49:
                            c21624OooO0o0.f64122OooO0oO = typedArrayObtainStyledAttributes.getDimension(index, c21624OooO0o0.f64122OooO0oO);
                            break;
                        case 50:
                            c21624OooO0o0.f64123OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, c21624OooO0o0.f64123OooO0oo);
                            break;
                        case 51:
                            c21624OooO0o0.f64124OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, c21624OooO0o0.f64124OooOO0);
                            break;
                        case 52:
                            c21624OooO0o0.f64125OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, c21624OooO0o0.f64125OooOO0O);
                            break;
                        case 53:
                            c21624OooO0o0.f64126OooOO0o = typedArrayObtainStyledAttributes.getDimension(index, c21624OooO0o0.f64126OooOO0o);
                            break;
                        case 54:
                            oooO0O0.f64079OoooOo0 = typedArrayObtainStyledAttributes.getInt(index, oooO0O0.f64079OoooOo0);
                            break;
                        case 55:
                            oooO0O0.f64080OoooOoO = typedArrayObtainStyledAttributes.getInt(index, oooO0O0.f64080OoooOoO);
                            break;
                        case 56:
                            oooO0O0.f64081OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64081OoooOoo);
                            break;
                        case 57:
                            oooO0O0.f64082Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64082Ooooo00);
                            break;
                        case 58:
                            oooO0O0.f64083Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64083Ooooo0o);
                            break;
                        case 59:
                            oooO0O0.f64084OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64084OooooO0);
                            break;
                        case 60:
                            c21624OooO0o0.f64117OooO0O0 = typedArrayObtainStyledAttributes.getFloat(index, c21624OooO0o0.f64117OooO0O0);
                            break;
                        case 61:
                            oooO0O0.f64056OooOoOO = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64056OooOoOO);
                            break;
                        case 62:
                            oooO0O0.f64058OooOoo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64058OooOoo0);
                            break;
                        case 63:
                            oooO0O0.f64057OooOoo = typedArrayObtainStyledAttributes.getFloat(index, oooO0O0.f64057OooOoo);
                            break;
                        case 64:
                            c19007OooO0OO.f64101OooO0O0 = OooOOO(typedArrayObtainStyledAttributes, index, c19007OooO0OO.f64101OooO0O0);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                String str = o0000O00.OooO0OO.f81369OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                                c19007OooO0OO.getClass();
                            } else {
                                typedArrayObtainStyledAttributes.getString(index);
                                c19007OooO0OO.getClass();
                            }
                            break;
                        case 66:
                            typedArrayObtainStyledAttributes.getInt(index, 0);
                            c19007OooO0OO.getClass();
                            break;
                        case 67:
                            c19007OooO0OO.f64104OooO0o = typedArrayObtainStyledAttributes.getFloat(index, c19007OooO0OO.f64104OooO0o);
                            break;
                        case 68:
                            oooO0Oo.f64113OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, oooO0Oo.f64113OooO0o0);
                            break;
                        case 69:
                            oooO0O0.f64085OooooOO = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            oooO0O0.f64086OooooOo = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            oooO0O0.f64088Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, oooO0O0.f64088Oooooo0);
                            break;
                        case 73:
                            oooO0O0.f64087Oooooo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64087Oooooo);
                            break;
                        case 74:
                            oooO0O0.f64096o0OoOo0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            oooO0O0.f64094o00Ooo = typedArrayObtainStyledAttributes.getBoolean(index, oooO0O0.f64094o00Ooo);
                            break;
                        case 76:
                            c19007OooO0OO.f64103OooO0Oo = typedArrayObtainStyledAttributes.getInt(index, c19007OooO0OO.f64103OooO0Oo);
                            break;
                        case 77:
                            oooO0O0.f64097ooOO = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            oooO0Oo.f64111OooO0OO = typedArrayObtainStyledAttributes.getInt(index, oooO0Oo.f64111OooO0OO);
                            break;
                        case 79:
                            c19007OooO0OO.f64105OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, c19007OooO0OO.f64105OooO0o0);
                            break;
                        case 80:
                            oooO0O0.f64092o00O0O = typedArrayObtainStyledAttributes.getBoolean(index, oooO0O0.f64092o00O0O);
                            break;
                        case 81:
                            oooO0O0.f64093o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(index, oooO0O0.f64093o00Oo0);
                            break;
                        case 82:
                            c19007OooO0OO.f64102OooO0OO = typedArrayObtainStyledAttributes.getInteger(index, c19007OooO0OO.f64102OooO0OO);
                            break;
                        case 83:
                            c21624OooO0o0.f64115OooO = OooOOO(typedArrayObtainStyledAttributes, index, c21624OooO0o0.f64115OooO);
                            break;
                        case 84:
                            c19007OooO0OO.f64107OooO0oo = typedArrayObtainStyledAttributes.getInteger(index, c19007OooO0OO.f64107OooO0oo);
                            break;
                        case 85:
                            c19007OooO0OO.f64106OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, c19007OooO0OO.f64106OooO0oO);
                            break;
                        case 86:
                            int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i3 == 1) {
                                c19007OooO0OO.f64108OooOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            } else if (i3 != 3) {
                                typedArrayObtainStyledAttributes.getInteger(index, c19007OooO0OO.f64108OooOO0);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                c19007OooO0OO.f64099OooO = string;
                                if (string.indexOf("/") > 0) {
                                    c19007OooO0OO.f64108OooOO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                }
                            }
                            break;
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            oooO0O0.f64046OooOOo = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64046OooOOo);
                            break;
                        case 92:
                            oooO0O0.f64048OooOOoo = OooOOO(typedArrayObtainStyledAttributes, index, oooO0O0.f64048OooOOoo);
                            break;
                        case 93:
                            oooO0O0.f64068Oooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64068Oooo0o);
                            break;
                        case 94:
                            oooO0O0.f64072OoooO = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oooO0O0.f64072OoooO);
                            break;
                        case 95:
                            OooOOOO(oooO0O0, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            OooOOOO(oooO0O0, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            oooO0O0.f64095o00o0O = typedArrayObtainStyledAttributes.getInt(index, oooO0O0.f64095o00o0O);
                            break;
                    }
                    i++;
                } else if (oooO0O0.f64096o0OoOo0 != null) {
                    oooO0O0.f64090Ooooooo = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return oooO00o;
    }

    public static OooO00o OooO0Oo(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        OooO00o oooO00o = new OooO00o();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, OooO0o.f64132OooO0OO);
        OooOOo0(oooO00o, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return oooO00o;
    }

    public static int[] OooO0oo(Barrier barrier, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = C21626OooO0o0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static int OooOOO(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooOOOO(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int iIndexOf = string.indexOf(61);
            int length = string.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                return;
            }
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if ("ratio".equalsIgnoreCase(strTrim)) {
                    if (obj instanceof ConstraintLayout.OooO00o) {
                        ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) oooO00o).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) oooO00o).height = 0;
                        }
                        OooOOOo(oooO00o, strTrim2);
                        return;
                    }
                    if (obj instanceof OooO0O0) {
                        ((OooO0O0) obj).f64054OooOoO = strTrim2;
                        return;
                    } else {
                        if (obj instanceof OooO00o.C19006OooO00o) {
                            ((OooO00o.C19006OooO00o) obj).OooO0OO(5, strTrim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f = Float.parseFloat(strTrim2);
                        if (obj instanceof ConstraintLayout.OooO00o) {
                            ConstraintLayout.OooO00o oooO00o2 = (ConstraintLayout.OooO00o) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) oooO00o2).width = 0;
                                oooO00o2.f63911Oooo00o = f;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) oooO00o2).height = 0;
                                oooO00o2.f63908Oooo0 = f;
                                return;
                            }
                        }
                        if (obj instanceof OooO0O0) {
                            OooO0O0 oooO0O0 = (OooO0O0) obj;
                            if (i2 == 0) {
                                oooO0O0.f64033OooO0OO = 0;
                                oooO0O0.f64091o000oOoO = f;
                                return;
                            } else {
                                oooO0O0.f64034OooO0Oo = 0;
                                oooO0O0.f64076OoooOO0 = f;
                                return;
                            }
                        }
                        if (obj instanceof OooO00o.C19006OooO00o) {
                            OooO00o.C19006OooO00o c19006OooO00o = (OooO00o.C19006OooO00o) obj;
                            if (i2 == 0) {
                                c19006OooO00o.OooO0O0(23, 0);
                                c19006OooO00o.OooO00o(39, f);
                                return;
                            } else {
                                c19006OooO00o.OooO0O0(21, 0);
                                c19006OooO00o.OooO00o(40, f);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof ConstraintLayout.OooO00o) {
                            ConstraintLayout.OooO00o oooO00o3 = (ConstraintLayout.OooO00o) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) oooO00o3).width = 0;
                                oooO00o3.f63919OoooO0 = fMax;
                                oooO00o3.f63915Oooo0o0 = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) oooO00o3).height = 0;
                                oooO00o3.f63921OoooO0O = fMax;
                                oooO00o3.f63914Oooo0o = 2;
                                return;
                            }
                        }
                        if (obj instanceof OooO0O0) {
                            OooO0O0 oooO0O02 = (OooO0O0) obj;
                            if (i2 == 0) {
                                oooO0O02.f64033OooO0OO = 0;
                                oooO0O02.f64085OooooOO = fMax;
                                oooO0O02.f64079OoooOo0 = 2;
                                return;
                            } else {
                                oooO0O02.f64034OooO0Oo = 0;
                                oooO0O02.f64086OooooOo = fMax;
                                oooO0O02.f64080OoooOoO = 2;
                                return;
                            }
                        }
                        if (obj instanceof OooO00o.C19006OooO00o) {
                            OooO00o.C19006OooO00o c19006OooO00o2 = (OooO00o.C19006OooO00o) obj;
                            if (i2 == 0) {
                                c19006OooO00o2.OooO0O0(23, 0);
                                c19006OooO00o2.OooO0O0(54, 2);
                                return;
                            } else {
                                c19006OooO00o2.OooO0O0(21, 0);
                                c19006OooO00o2.OooO0O0(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (!(obj instanceof ConstraintLayout.OooO00o)) {
                ConstraintLayout.OooO00o oooO00o4 = (ConstraintLayout.OooO00o) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) oooO00o4).width = i4;
                    oooO00o4.f63923OoooOOO = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) oooO00o4).height = i4;
                    oooO00o4.f63924OoooOOo = z;
                    return;
                }
            }
            if (obj instanceof OooO0O0) {
                OooO0O0 oooO0O03 = (OooO0O0) obj;
                if (i2 == 0) {
                    oooO0O03.f64033OooO0OO = i4;
                    oooO0O03.f64092o00O0O = z;
                    return;
                } else {
                    oooO0O03.f64034OooO0Oo = i4;
                    oooO0O03.f64093o00Oo0 = z;
                    return;
                }
            }
            if (obj instanceof OooO00o.C19006OooO00o) {
                OooO00o.C19006OooO00o c19006OooO00o3 = (OooO00o.C19006OooO00o) obj;
                if (i2 == 0) {
                    c19006OooO00o3.OooO0O0(23, i4);
                    c19006OooO00o3.OooO0Oo(80, z);
                    return;
                } else {
                    c19006OooO00o3.OooO0O0(21, i4);
                    c19006OooO00o3.OooO0Oo(81, z);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof ConstraintLayout.OooO00o)) {
        }
    }

    public static void OooOOOo(ConstraintLayout.OooO00o oooO00o, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            byte b = -1;
            int i = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    b = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    b = 1;
                }
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (b == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        oooO00o.f63910Oooo00O = str;
    }

    public static void OooOOo0(OooO00o oooO00o, TypedArray typedArray) {
        int i;
        int i2 = 1;
        int indexCount = typedArray.getIndexCount();
        OooO00o.C19006OooO00o c19006OooO00o = new OooO00o.C19006OooO00o();
        oooO00o.f64016OooO0oo = c19006OooO00o;
        C19007OooO0OO c19007OooO0OO = oooO00o.f64012OooO0Oo;
        c19007OooO0OO.f64100OooO00o = false;
        OooO0O0 oooO0O0 = oooO00o.f64014OooO0o0;
        oooO0O0.f64032OooO0O0 = false;
        OooO0Oo oooO0Oo = oooO00o.f64011OooO0OO;
        oooO0Oo.f64109OooO00o = false;
        C21624OooO0o0 c21624OooO0o0 = oooO00o.f64013OooO0o;
        c21624OooO0o0.f64116OooO00o = false;
        int i3 = 0;
        while (i3 < indexCount) {
            int index = typedArray.getIndex(i3);
            int i4 = f64000OooO.get(index);
            SparseIntArray sparseIntArray = f64002OooO0oo;
            switch (i4) {
                case 2:
                    c19006OooO00o.OooO0O0(2, typedArray.getDimensionPixelSize(index, oooO0O0.f64066Oooo0O0));
                    i = 1;
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    i = i2;
                    break;
                case 5:
                    c19006OooO00o.OooO0OO(5, typedArray.getString(index));
                    i = 1;
                    break;
                case 6:
                    c19006OooO00o.OooO0O0(6, typedArray.getDimensionPixelOffset(index, oooO0O0.f64059OooOooO));
                    i = 1;
                    break;
                case 7:
                    c19006OooO00o.OooO0O0(7, typedArray.getDimensionPixelOffset(index, oooO0O0.f64060OooOooo));
                    i = 1;
                    break;
                case 8:
                    c19006OooO00o.OooO0O0(8, typedArray.getDimensionPixelSize(index, oooO0O0.f64067Oooo0OO));
                    i = 1;
                    break;
                case 11:
                    c19006OooO00o.OooO0O0(11, typedArray.getDimensionPixelSize(index, oooO0O0.f64074OoooO00));
                    i = 1;
                    break;
                case 12:
                    c19006OooO00o.OooO0O0(12, typedArray.getDimensionPixelSize(index, oooO0O0.f64073OoooO0));
                    i = 1;
                    break;
                case 13:
                    c19006OooO00o.OooO0O0(13, typedArray.getDimensionPixelSize(index, oooO0O0.f64070Oooo0oO));
                    i = 1;
                    break;
                case 14:
                    c19006OooO00o.OooO0O0(14, typedArray.getDimensionPixelSize(index, oooO0O0.f64061Oooo));
                    i = 1;
                    break;
                case 15:
                    c19006OooO00o.OooO0O0(15, typedArray.getDimensionPixelSize(index, oooO0O0.f64075OoooO0O));
                    i = 1;
                    break;
                case 16:
                    c19006OooO00o.OooO0O0(16, typedArray.getDimensionPixelSize(index, oooO0O0.f64071Oooo0oo));
                    i = 1;
                    break;
                case 17:
                    c19006OooO00o.OooO0O0(17, typedArray.getDimensionPixelOffset(index, oooO0O0.f64036OooO0o0));
                    i = 1;
                    break;
                case 18:
                    c19006OooO00o.OooO0O0(18, typedArray.getDimensionPixelOffset(index, oooO0O0.f64035OooO0o));
                    i = 1;
                    break;
                case 19:
                    c19006OooO00o.OooO00o(19, typedArray.getFloat(index, oooO0O0.f64037OooO0oO));
                    i = 1;
                    break;
                case 20:
                    c19006OooO00o.OooO00o(20, typedArray.getFloat(index, oooO0O0.f64049OooOo));
                    i = 1;
                    break;
                case 21:
                    c19006OooO00o.OooO0O0(21, typedArray.getLayoutDimension(index, oooO0O0.f64034OooO0Oo));
                    i = 1;
                    break;
                case 22:
                    c19006OooO00o.OooO0O0(22, f64001OooO0oO[typedArray.getInt(index, oooO0Oo.f64110OooO0O0)]);
                    i = 1;
                    break;
                case 23:
                    c19006OooO00o.OooO0O0(23, typedArray.getLayoutDimension(index, oooO0O0.f64033OooO0OO));
                    i = 1;
                    break;
                case 24:
                    c19006OooO00o.OooO0O0(24, typedArray.getDimensionPixelSize(index, oooO0O0.f64064Oooo00O));
                    i = 1;
                    break;
                case 27:
                    c19006OooO00o.OooO0O0(27, typedArray.getInt(index, oooO0O0.f64063Oooo000));
                    i = 1;
                    break;
                case 28:
                    c19006OooO00o.OooO0O0(28, typedArray.getDimensionPixelSize(index, oooO0O0.f64065Oooo00o));
                    i = 1;
                    break;
                case 31:
                    c19006OooO00o.OooO0O0(31, typedArray.getDimensionPixelSize(index, oooO0O0.f64069Oooo0o0));
                    i = 1;
                    break;
                case 34:
                    c19006OooO00o.OooO0O0(34, typedArray.getDimensionPixelSize(index, oooO0O0.f64062Oooo0));
                    i = 1;
                    break;
                case 37:
                    c19006OooO00o.OooO00o(37, typedArray.getFloat(index, oooO0O0.f64055OooOoO0));
                    i = 1;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, oooO00o.f64009OooO00o);
                    oooO00o.f64009OooO00o = resourceId;
                    c19006OooO00o.OooO0O0(38, resourceId);
                    i = 1;
                    break;
                case 39:
                    c19006OooO00o.OooO00o(39, typedArray.getFloat(index, oooO0O0.f64091o000oOoO));
                    i = 1;
                    break;
                case 40:
                    c19006OooO00o.OooO00o(40, typedArray.getFloat(index, oooO0O0.f64076OoooOO0));
                    i = 1;
                    break;
                case 41:
                    c19006OooO00o.OooO0O0(41, typedArray.getInt(index, oooO0O0.f64077OoooOOO));
                    i = 1;
                    break;
                case 42:
                    c19006OooO00o.OooO0O0(42, typedArray.getInt(index, oooO0O0.f64078OoooOOo));
                    i = 1;
                    break;
                case 43:
                    c19006OooO00o.OooO00o(43, typedArray.getFloat(index, oooO0Oo.f64112OooO0Oo));
                    i = 1;
                    break;
                case 44:
                    c19006OooO00o.OooO0Oo(44, true);
                    c19006OooO00o.OooO00o(44, typedArray.getDimension(index, c21624OooO0o0.f64127OooOOO));
                    i = 1;
                    break;
                case 45:
                    c19006OooO00o.OooO00o(45, typedArray.getFloat(index, c21624OooO0o0.f64118OooO0OO));
                    i = 1;
                    break;
                case 46:
                    c19006OooO00o.OooO00o(46, typedArray.getFloat(index, c21624OooO0o0.f64119OooO0Oo));
                    i = 1;
                    break;
                case 47:
                    c19006OooO00o.OooO00o(47, typedArray.getFloat(index, c21624OooO0o0.f64121OooO0o0));
                    i = 1;
                    break;
                case 48:
                    c19006OooO00o.OooO00o(48, typedArray.getFloat(index, c21624OooO0o0.f64120OooO0o));
                    i = 1;
                    break;
                case 49:
                    c19006OooO00o.OooO00o(49, typedArray.getDimension(index, c21624OooO0o0.f64122OooO0oO));
                    i = 1;
                    break;
                case 50:
                    c19006OooO00o.OooO00o(50, typedArray.getDimension(index, c21624OooO0o0.f64123OooO0oo));
                    i = 1;
                    break;
                case 51:
                    c19006OooO00o.OooO00o(51, typedArray.getDimension(index, c21624OooO0o0.f64124OooOO0));
                    i = 1;
                    break;
                case 52:
                    c19006OooO00o.OooO00o(52, typedArray.getDimension(index, c21624OooO0o0.f64125OooOO0O));
                    i = 1;
                    break;
                case 53:
                    c19006OooO00o.OooO00o(53, typedArray.getDimension(index, c21624OooO0o0.f64126OooOO0o));
                    i = 1;
                    break;
                case 54:
                    c19006OooO00o.OooO0O0(54, typedArray.getInt(index, oooO0O0.f64079OoooOo0));
                    i = 1;
                    break;
                case 55:
                    c19006OooO00o.OooO0O0(55, typedArray.getInt(index, oooO0O0.f64080OoooOoO));
                    i = 1;
                    break;
                case 56:
                    c19006OooO00o.OooO0O0(56, typedArray.getDimensionPixelSize(index, oooO0O0.f64081OoooOoo));
                    i = 1;
                    break;
                case 57:
                    c19006OooO00o.OooO0O0(57, typedArray.getDimensionPixelSize(index, oooO0O0.f64082Ooooo00));
                    i = 1;
                    break;
                case 58:
                    c19006OooO00o.OooO0O0(58, typedArray.getDimensionPixelSize(index, oooO0O0.f64083Ooooo0o));
                    i = 1;
                    break;
                case 59:
                    c19006OooO00o.OooO0O0(59, typedArray.getDimensionPixelSize(index, oooO0O0.f64084OooooO0));
                    i = 1;
                    break;
                case 60:
                    c19006OooO00o.OooO00o(60, typedArray.getFloat(index, c21624OooO0o0.f64117OooO0O0));
                    i = 1;
                    break;
                case 62:
                    c19006OooO00o.OooO0O0(62, typedArray.getDimensionPixelSize(index, oooO0O0.f64058OooOoo0));
                    i = 1;
                    break;
                case 63:
                    c19006OooO00o.OooO00o(63, typedArray.getFloat(index, oooO0O0.f64057OooOoo));
                    i = 1;
                    break;
                case 64:
                    c19006OooO00o.OooO0O0(64, OooOOO(typedArray, index, c19007OooO0OO.f64101OooO0O0));
                    i = 1;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c19006OooO00o.OooO0OO(65, typedArray.getString(index));
                    } else {
                        c19006OooO00o.OooO0OO(65, o0000O00.OooO0OO.f81369OooO0OO[typedArray.getInteger(index, 0)]);
                    }
                    i = 1;
                    break;
                case 66:
                    c19006OooO00o.OooO0O0(66, typedArray.getInt(index, 0));
                    i = 1;
                    break;
                case 67:
                    c19006OooO00o.OooO00o(67, typedArray.getFloat(index, c19007OooO0OO.f64104OooO0o));
                    i = 1;
                    break;
                case 68:
                    c19006OooO00o.OooO00o(68, typedArray.getFloat(index, oooO0Oo.f64113OooO0o0));
                    i = 1;
                    break;
                case 69:
                    c19006OooO00o.OooO00o(69, typedArray.getFloat(index, 1.0f));
                    i = 1;
                    break;
                case 70:
                    c19006OooO00o.OooO00o(70, typedArray.getFloat(index, 1.0f));
                    i = 1;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    i = 1;
                    break;
                case 72:
                    c19006OooO00o.OooO0O0(72, typedArray.getInt(index, oooO0O0.f64088Oooooo0));
                    i = 1;
                    break;
                case 73:
                    c19006OooO00o.OooO0O0(73, typedArray.getDimensionPixelSize(index, oooO0O0.f64087Oooooo));
                    i = 1;
                    break;
                case 74:
                    c19006OooO00o.OooO0OO(74, typedArray.getString(index));
                    i = 1;
                    break;
                case 75:
                    c19006OooO00o.OooO0Oo(75, typedArray.getBoolean(index, oooO0O0.f64094o00Ooo));
                    i = 1;
                    break;
                case 76:
                    c19006OooO00o.OooO0O0(76, typedArray.getInt(index, c19007OooO0OO.f64103OooO0Oo));
                    i = 1;
                    break;
                case 77:
                    c19006OooO00o.OooO0OO(77, typedArray.getString(index));
                    i = 1;
                    break;
                case 78:
                    c19006OooO00o.OooO0O0(78, typedArray.getInt(index, oooO0Oo.f64111OooO0OO));
                    i = 1;
                    break;
                case 79:
                    c19006OooO00o.OooO00o(79, typedArray.getFloat(index, c19007OooO0OO.f64105OooO0o0));
                    i = 1;
                    break;
                case 80:
                    c19006OooO00o.OooO0Oo(80, typedArray.getBoolean(index, oooO0O0.f64092o00O0O));
                    i = 1;
                    break;
                case 81:
                    c19006OooO00o.OooO0Oo(81, typedArray.getBoolean(index, oooO0O0.f64093o00Oo0));
                    i = 1;
                    break;
                case 82:
                    c19006OooO00o.OooO0O0(82, typedArray.getInteger(index, c19007OooO0OO.f64102OooO0OO));
                    i = 1;
                    break;
                case 83:
                    c19006OooO00o.OooO0O0(83, OooOOO(typedArray, index, c21624OooO0o0.f64115OooO));
                    i = 1;
                    break;
                case 84:
                    c19006OooO00o.OooO0O0(84, typedArray.getInteger(index, c19007OooO0OO.f64107OooO0oo));
                    i = 1;
                    break;
                case 85:
                    c19006OooO00o.OooO00o(85, typedArray.getFloat(index, c19007OooO0OO.f64106OooO0oO));
                    i = 1;
                    break;
                case 86:
                    int i5 = typedArray.peekValue(index).type;
                    if (i5 != i2) {
                        if (i5 == 3) {
                            String string = typedArray.getString(index);
                            c19007OooO0OO.f64099OooO = string;
                            c19006OooO00o.OooO0OO(90, string);
                            if (c19007OooO0OO.f64099OooO.indexOf("/") > 0) {
                                int resourceId2 = typedArray.getResourceId(index, -1);
                                c19007OooO0OO.f64108OooOO0 = resourceId2;
                                c19006OooO00o.OooO0O0(89, resourceId2);
                                c19006OooO00o.OooO0O0(88, -2);
                            } else {
                                c19006OooO00o.OooO0O0(88, -1);
                            }
                        } else {
                            c19006OooO00o.OooO0O0(88, typedArray.getInteger(index, c19007OooO0OO.f64108OooOO0));
                        }
                        i = 1;
                    } else {
                        int resourceId3 = typedArray.getResourceId(index, -1);
                        c19007OooO0OO.f64108OooOO0 = resourceId3;
                        c19006OooO00o.OooO0O0(89, resourceId3);
                        if (c19007OooO0OO.f64108OooOO0 != -1) {
                            c19006OooO00o.OooO0O0(88, -2);
                        }
                        i = i2;
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    i = i2;
                    break;
                case 93:
                    c19006OooO00o.OooO0O0(93, typedArray.getDimensionPixelSize(index, oooO0O0.f64068Oooo0o));
                    i = i2;
                    break;
                case 94:
                    c19006OooO00o.OooO0O0(94, typedArray.getDimensionPixelSize(index, oooO0O0.f64072OoooO));
                    i = i2;
                    break;
                case 95:
                    OooOOOO(c19006OooO00o, typedArray, index, 0);
                    i = i2;
                    break;
                case 96:
                    OooOOOO(c19006OooO00o, typedArray, index, i2);
                    i = i2;
                    break;
                case 97:
                    c19006OooO00o.OooO0O0(97, typedArray.getInt(index, oooO0O0.f64095o00o0O));
                    i = i2;
                    break;
                case 98:
                    int i6 = MotionLayout.f63661ooOO;
                    if (typedArray.peekValue(index).type == 3) {
                        oooO00o.f64010OooO0O0 = typedArray.getString(index);
                    } else {
                        oooO00o.f64009OooO00o = typedArray.getResourceId(index, oooO00o.f64009OooO00o);
                    }
                    i = i2;
                    break;
                case 99:
                    c19006OooO00o.OooO0Oo(99, typedArray.getBoolean(index, oooO0O0.f64038OooO0oo));
                    i = i2;
                    break;
            }
            i3++;
            i2 = i;
        }
    }

    public static String OooOo00(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public final void OooO00o(MotionLayout motionLayout) {
        OooO00o oooO00o;
        int childCount = motionLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = motionLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap<Integer, OooO00o> map = this.f64007OooO0o;
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + o000OO.OooO00o.OooO0OO(childAt));
            } else {
                if (this.f64008OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id)) && (oooO00o = map.get(Integer.valueOf(id))) != null) {
                    androidx.constraintlayout.widget.OooO00o.OooO0o0(childAt, oooO00o.f64015OooO0oO);
                }
            }
        }
    }

    public final void OooO0O0(ConstraintLayout constraintLayout) {
        OooO0OO(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void OooO0OO(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, OooO00o> map = this.f64007OooO0o;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + o000OO.OooO00o.OooO0OO(childAt));
            } else {
                if (this.f64008OooO0o0 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        OooO00o oooO00o = map.get(Integer.valueOf(id));
                        if (oooO00o != null) {
                            if (childAt instanceof Barrier) {
                                OooO0O0 oooO0O0 = oooO00o.f64014OooO0o0;
                                oooO0O0.f64089OoooooO = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(oooO0O0.f64088Oooooo0);
                                barrier.setMargin(oooO0O0.f64087Oooooo);
                                barrier.setAllowsGoneWidget(oooO0O0.f64094o00Ooo);
                                int[] iArr = oooO0O0.f64090Ooooooo;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = oooO0O0.f64096o0OoOo0;
                                    if (str != null) {
                                        int[] iArrOooO0oo = OooO0oo(barrier, str);
                                        oooO0O0.f64090Ooooooo = iArrOooO0oo;
                                        barrier.setReferencedIds(iArrOooO0oo);
                                    }
                                }
                            }
                            ConstraintLayout.OooO00o oooO00o2 = (ConstraintLayout.OooO00o) childAt.getLayoutParams();
                            oooO00o2.OooO00o();
                            oooO00o.OooO00o(oooO00o2);
                            androidx.constraintlayout.widget.OooO00o.OooO0o0(childAt, oooO00o.f64015OooO0oO);
                            childAt.setLayoutParams(oooO00o2);
                            OooO0Oo oooO0Oo = oooO00o.f64011OooO0OO;
                            if (oooO0Oo.f64111OooO0OO == 0) {
                                childAt.setVisibility(oooO0Oo.f64110OooO0O0);
                            }
                            childAt.setAlpha(oooO0Oo.f64112OooO0Oo);
                            C21624OooO0o0 c21624OooO0o0 = oooO00o.f64013OooO0o;
                            childAt.setRotation(c21624OooO0o0.f64117OooO0O0);
                            childAt.setRotationX(c21624OooO0o0.f64118OooO0OO);
                            childAt.setRotationY(c21624OooO0o0.f64119OooO0Oo);
                            childAt.setScaleX(c21624OooO0o0.f64121OooO0o0);
                            childAt.setScaleY(c21624OooO0o0.f64120OooO0o);
                            if (c21624OooO0o0.f64115OooO != -1) {
                                if (((View) childAt.getParent()).findViewById(c21624OooO0o0.f64115OooO) != null) {
                                    float bottom = (r7.getBottom() + r7.getTop()) / 2.0f;
                                    float right = (r7.getRight() + r7.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c21624OooO0o0.f64122OooO0oO)) {
                                    childAt.setPivotX(c21624OooO0o0.f64122OooO0oO);
                                }
                                if (!Float.isNaN(c21624OooO0o0.f64123OooO0oo)) {
                                    childAt.setPivotY(c21624OooO0o0.f64123OooO0oo);
                                }
                            }
                            childAt.setTranslationX(c21624OooO0o0.f64124OooOO0);
                            childAt.setTranslationY(c21624OooO0o0.f64125OooOO0O);
                            childAt.setTranslationZ(c21624OooO0o0.f64126OooOO0o);
                            if (c21624OooO0o0.f64128OooOOO0) {
                                childAt.setElevation(c21624OooO0o0.f64127OooOOO);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            OooO00o oooO00o3 = map.get(num);
            if (oooO00o3 != null) {
                OooO0O0 oooO0O02 = oooO00o3.f64014OooO0o0;
                if (oooO0O02.f64089OoooooO == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = oooO0O02.f64090Ooooooo;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = oooO0O02.f64096o0OoOo0;
                        if (str2 != null) {
                            int[] iArrOooO0oo2 = OooO0oo(barrier2, str2);
                            oooO0O02.f64090Ooooooo = iArrOooO0oo2;
                            barrier2.setReferencedIds(iArrOooO0oo2);
                        }
                    }
                    barrier2.setType(oooO0O02.f64088Oooooo0);
                    barrier2.setMargin(oooO0O02.f64087Oooooo);
                    ConstraintLayout.OooO00o oooO00oGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.OooOOO0();
                    oooO00o3.OooO00o(oooO00oGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, oooO00oGenerateDefaultLayoutParams);
                }
                if (oooO0O02.f64031OooO00o) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.OooO00o oooO00oGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    oooO00o3.OooO00o(oooO00oGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, oooO00oGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).OooO0o(constraintLayout);
            }
        }
    }

    public final void OooO0o(int i, int i2, int i3, int i4) {
        HashMap<Integer, OooO00o> map = this.f64007OooO0o;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), new OooO00o());
        }
        OooO00o oooO00o = map.get(Integer.valueOf(i));
        if (oooO00o == null) {
            return;
        }
        OooO0O0 oooO0O0 = oooO00o.f64014OooO0o0;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    oooO0O0.f64030OooO = i3;
                    oooO0O0.f64039OooOO0 = -1;
                    return;
                } else if (i4 == 2) {
                    oooO0O0.f64039OooOO0 = i3;
                    oooO0O0.f64030OooO = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + OooOo00(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    oooO0O0.f64040OooOO0O = i3;
                    oooO0O0.f64041OooOO0o = -1;
                    return;
                } else if (i4 == 2) {
                    oooO0O0.f64041OooOO0o = i3;
                    oooO0O0.f64040OooOO0O = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    oooO0O0.f64043OooOOO0 = i3;
                    oooO0O0.f64042OooOOO = -1;
                    oooO0O0.f64047OooOOo0 = -1;
                    oooO0O0.f64046OooOOo = -1;
                    oooO0O0.f64048OooOOoo = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                }
                oooO0O0.f64042OooOOO = i3;
                oooO0O0.f64043OooOOO0 = -1;
                oooO0O0.f64047OooOOo0 = -1;
                oooO0O0.f64046OooOOo = -1;
                oooO0O0.f64048OooOOoo = -1;
                return;
            case 4:
                if (i4 == 4) {
                    oooO0O0.f64045OooOOOo = i3;
                    oooO0O0.f64044OooOOOO = -1;
                    oooO0O0.f64047OooOOo0 = -1;
                    oooO0O0.f64046OooOOo = -1;
                    oooO0O0.f64048OooOOoo = -1;
                    return;
                }
                if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                }
                oooO0O0.f64044OooOOOO = i3;
                oooO0O0.f64045OooOOOo = -1;
                oooO0O0.f64047OooOOo0 = -1;
                oooO0O0.f64046OooOOo = -1;
                oooO0O0.f64048OooOOoo = -1;
                return;
            case 5:
                if (i4 == 5) {
                    oooO0O0.f64047OooOOo0 = i3;
                    oooO0O0.f64045OooOOOo = -1;
                    oooO0O0.f64044OooOOOO = -1;
                    oooO0O0.f64043OooOOO0 = -1;
                    oooO0O0.f64042OooOOO = -1;
                    return;
                }
                if (i4 == 3) {
                    oooO0O0.f64046OooOOo = i3;
                    oooO0O0.f64045OooOOOo = -1;
                    oooO0O0.f64044OooOOOO = -1;
                    oooO0O0.f64043OooOOO0 = -1;
                    oooO0O0.f64042OooOOO = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                }
                oooO0O0.f64048OooOOoo = i3;
                oooO0O0.f64045OooOOOo = -1;
                oooO0O0.f64044OooOOOO = -1;
                oooO0O0.f64043OooOOO0 = -1;
                oooO0O0.f64042OooOOO = -1;
                return;
            case 6:
                if (i4 == 6) {
                    oooO0O0.f64050OooOo0 = i3;
                    oooO0O0.f64051OooOo00 = -1;
                    return;
                } else if (i4 == 7) {
                    oooO0O0.f64051OooOo00 = i3;
                    oooO0O0.f64050OooOo0 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    oooO0O0.f64053OooOo0o = i3;
                    oooO0O0.f64052OooOo0O = -1;
                    return;
                } else if (i4 == 6) {
                    oooO0O0.f64052OooOo0O = i3;
                    oooO0O0.f64053OooOo0o = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(OooOo00(i2) + " to " + OooOo00(i4) + " unknown");
        }
    }

    public final void OooO0o0(ConstraintLayout constraintLayout) {
        int i;
        HashMap<Integer, OooO00o> map;
        int i2;
        HashMap<Integer, OooO00o> map2;
        int i3;
        OooO0OO oooO0OO = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, OooO00o> map3 = oooO0OO.f64007OooO0o;
        map3.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.OooO00o oooO00o = (ConstraintLayout.OooO00o) childAt.getLayoutParams();
            int id = childAt.getId();
            if (oooO0OO.f64008OooO0o0 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new OooO00o());
            }
            OooO00o oooO00o2 = map3.get(Integer.valueOf(id));
            if (oooO00o2 == null) {
                i = childCount;
                map = map3;
                i2 = i4;
            } else {
                HashMap<String, androidx.constraintlayout.widget.OooO00o> map4 = oooO0OO.f64006OooO0Oo;
                HashMap<String, androidx.constraintlayout.widget.OooO00o> map5 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    androidx.constraintlayout.widget.OooO00o oooO00o3 = map4.get(str);
                    int i5 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new androidx.constraintlayout.widget.OooO00o(oooO00o3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                i3 = i4;
                            } catch (IllegalAccessException e) {
                                e = e;
                                i3 = i4;
                                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0(" Custom Attribute \"", str, "\" not found on ");
                                sbOooO0o0.append(cls.getName());
                                Log.e("TransitionLayout", sbOooO0o0.toString(), e);
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                i3 = i4;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                i3 = i4;
                                StringBuilder sbOooO0o02 = C20424OooO0Oo.OooO0o0(" Custom Attribute \"", str, "\" not found on ");
                                sbOooO0o02.append(cls.getName());
                                Log.e("TransitionLayout", sbOooO0o02.toString(), e);
                            }
                        } else {
                            map2 = map3;
                            i3 = i4;
                            try {
                                map5.put(str, new androidx.constraintlayout.widget.OooO00o(oooO00o3, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                StringBuilder sbOooO0o03 = C20424OooO0Oo.OooO0o0(" Custom Attribute \"", str, "\" not found on ");
                                sbOooO0o03.append(cls.getName());
                                Log.e("TransitionLayout", sbOooO0o03.toString(), e);
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                StringBuilder sbOooO0o022 = C20424OooO0Oo.OooO0o0(" Custom Attribute \"", str, "\" not found on ");
                                sbOooO0o022.append(cls.getName());
                                Log.e("TransitionLayout", sbOooO0o022.toString(), e);
                            }
                        }
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        map2 = map3;
                    } catch (NoSuchMethodException e8) {
                        e = e8;
                        map2 = map3;
                    } catch (InvocationTargetException e9) {
                        e = e9;
                        map2 = map3;
                    }
                    i4 = i3;
                    childCount = i5;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                i2 = i4;
                oooO00o2.f64015OooO0oO = map5;
                oooO00o2.OooO0OO(id, oooO00o);
                int visibility = childAt.getVisibility();
                OooO0Oo oooO0Oo = oooO00o2.f64011OooO0OO;
                oooO0Oo.f64110OooO0O0 = visibility;
                oooO0Oo.f64112OooO0Oo = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C21624OooO0o0 c21624OooO0o0 = oooO00o2.f64013OooO0o;
                c21624OooO0o0.f64117OooO0O0 = rotation;
                c21624OooO0o0.f64118OooO0OO = childAt.getRotationX();
                c21624OooO0o0.f64119OooO0Oo = childAt.getRotationY();
                c21624OooO0o0.f64121OooO0o0 = childAt.getScaleX();
                c21624OooO0o0.f64120OooO0o = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c21624OooO0o0.f64122OooO0oO = pivotX;
                    c21624OooO0o0.f64123OooO0oo = pivotY;
                }
                c21624OooO0o0.f64124OooOO0 = childAt.getTranslationX();
                c21624OooO0o0.f64125OooOO0O = childAt.getTranslationY();
                c21624OooO0o0.f64126OooOO0o = childAt.getTranslationZ();
                if (c21624OooO0o0.f64128OooOOO0) {
                    c21624OooO0o0.f64127OooOOO = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    OooO0O0 oooO0O0 = oooO00o2.f64014OooO0o0;
                    oooO0O0.f64094o00Ooo = allowsGoneWidget;
                    oooO0O0.f64090Ooooooo = barrier.getReferencedIds();
                    oooO0O0.f64088Oooooo0 = barrier.getType();
                    oooO0O0.f64087Oooooo = barrier.getMargin();
                }
            }
            i4 = i2 + 1;
            oooO0OO = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void OooO0oO(int i, int i2, int i3, int i4, int i5) {
        HashMap<Integer, OooO00o> map = this.f64007OooO0o;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), new OooO00o());
        }
        OooO00o oooO00o = map.get(Integer.valueOf(i));
        if (oooO00o == null) {
            return;
        }
        OooO0O0 oooO0O0 = oooO00o.f64014OooO0o0;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    oooO0O0.f64030OooO = i3;
                    oooO0O0.f64039OooOO0 = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("Left to " + OooOo00(i4) + " undefined");
                    }
                    oooO0O0.f64039OooOO0 = i3;
                    oooO0O0.f64030OooO = -1;
                }
                oooO0O0.f64064Oooo00O = i5;
                return;
            case 2:
                if (i4 == 1) {
                    oooO0O0.f64040OooOO0O = i3;
                    oooO0O0.f64041OooOO0o = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                    }
                    oooO0O0.f64041OooOO0o = i3;
                    oooO0O0.f64040OooOO0O = -1;
                }
                oooO0O0.f64065Oooo00o = i5;
                return;
            case 3:
                if (i4 == 3) {
                    oooO0O0.f64043OooOOO0 = i3;
                    oooO0O0.f64042OooOOO = -1;
                    oooO0O0.f64047OooOOo0 = -1;
                    oooO0O0.f64046OooOOo = -1;
                    oooO0O0.f64048OooOOoo = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                    }
                    oooO0O0.f64042OooOOO = i3;
                    oooO0O0.f64043OooOOO0 = -1;
                    oooO0O0.f64047OooOOo0 = -1;
                    oooO0O0.f64046OooOOo = -1;
                    oooO0O0.f64048OooOOoo = -1;
                }
                oooO0O0.f64062Oooo0 = i5;
                return;
            case 4:
                if (i4 == 4) {
                    oooO0O0.f64045OooOOOo = i3;
                    oooO0O0.f64044OooOOOO = -1;
                    oooO0O0.f64047OooOOo0 = -1;
                    oooO0O0.f64046OooOOo = -1;
                    oooO0O0.f64048OooOOoo = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                    }
                    oooO0O0.f64044OooOOOO = i3;
                    oooO0O0.f64045OooOOOo = -1;
                    oooO0O0.f64047OooOOo0 = -1;
                    oooO0O0.f64046OooOOo = -1;
                    oooO0O0.f64048OooOOoo = -1;
                }
                oooO0O0.f64066Oooo0O0 = i5;
                return;
            case 5:
                if (i4 == 5) {
                    oooO0O0.f64047OooOOo0 = i3;
                    oooO0O0.f64045OooOOOo = -1;
                    oooO0O0.f64044OooOOOO = -1;
                    oooO0O0.f64043OooOOO0 = -1;
                    oooO0O0.f64042OooOOO = -1;
                    return;
                }
                if (i4 == 3) {
                    oooO0O0.f64046OooOOo = i3;
                    oooO0O0.f64045OooOOOo = -1;
                    oooO0O0.f64044OooOOOO = -1;
                    oooO0O0.f64043OooOOO0 = -1;
                    oooO0O0.f64042OooOOO = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                }
                oooO0O0.f64048OooOOoo = i3;
                oooO0O0.f64045OooOOOo = -1;
                oooO0O0.f64044OooOOOO = -1;
                oooO0O0.f64043OooOOO0 = -1;
                oooO0O0.f64042OooOOO = -1;
                return;
            case 6:
                if (i4 == 6) {
                    oooO0O0.f64050OooOo0 = i3;
                    oooO0O0.f64051OooOo00 = -1;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                    }
                    oooO0O0.f64051OooOo00 = i3;
                    oooO0O0.f64050OooOo0 = -1;
                }
                oooO0O0.f64069Oooo0o0 = i5;
                return;
            case 7:
                if (i4 == 7) {
                    oooO0O0.f64053OooOo0o = i3;
                    oooO0O0.f64052OooOo0O = -1;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException("right to " + OooOo00(i4) + " undefined");
                    }
                    oooO0O0.f64052OooOo0O = i3;
                    oooO0O0.f64053OooOo0o = -1;
                }
                oooO0O0.f64067Oooo0OO = i5;
                return;
            default:
                throw new IllegalArgumentException(OooOo00(i2) + " to " + OooOo00(i4) + " unknown");
        }
    }

    public final OooO00o OooOO0(int i) {
        HashMap<Integer, OooO00o> map = this.f64007OooO0o;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), new OooO00o());
        }
        return map.get(Integer.valueOf(i));
    }

    public final OooO00o OooOO0O(int i) {
        HashMap<Integer, OooO00o> map = this.f64007OooO0o;
        if (map.containsKey(Integer.valueOf(i))) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void OooOO0o(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    OooO00o oooO00oOooO = OooO(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        oooO00oOooO.f64014OooO0o0.f64031OooO00o = true;
                    }
                    this.f64007OooO0o.put(Integer.valueOf(oooO00oOooO.f64009OooO00o), oooO00oOooO);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d2, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooOOO0(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            OooO00o oooO00oOooO = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    switch (xmlResourceParser.getName()) {
                        case "Constraint":
                            oooO00oOooO = OooO(context, Xml.asAttributeSet(xmlResourceParser), false);
                            break;
                        case "ConstraintOverride":
                            oooO00oOooO = OooO(context, Xml.asAttributeSet(xmlResourceParser), true);
                            break;
                        case "Guideline":
                            oooO00oOooO = OooO(context, Xml.asAttributeSet(xmlResourceParser), false);
                            OooO0O0 oooO0O0 = oooO00oOooO.f64014OooO0o0;
                            oooO0O0.f64031OooO00o = true;
                            oooO0O0.f64032OooO0O0 = true;
                            break;
                        case "Barrier":
                            oooO00oOooO = OooO(context, Xml.asAttributeSet(xmlResourceParser), false);
                            oooO00oOooO.f64014OooO0o0.f64089OoooooO = 1;
                            break;
                        case "PropertySet":
                            if (oooO00oOooO == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00oOooO.f64011OooO0OO.OooO00o(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Transform":
                            if (oooO00oOooO == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00oOooO.f64013OooO0o.OooO0O0(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Layout":
                            if (oooO00oOooO == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00oOooO.f64014OooO0o0.OooO0O0(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Motion":
                            if (oooO00oOooO == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            oooO00oOooO.f64012OooO0Oo.OooO0O0(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (oooO00oOooO == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            androidx.constraintlayout.widget.OooO00o.OooO0Oo(context, xmlResourceParser, oooO00oOooO.f64015OooO0oO);
                            break;
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r6 == 0) {
                        return;
                    }
                    if (r6 == 1 || r6 == 2 || r6 == 3) {
                        this.f64007OooO0o.put(Integer.valueOf(oooO00oOooO.f64009OooO00o), oooO00oOooO);
                        oooO00oOooO = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }

    public final void OooOOo(int i, float f) {
        OooOO0(i).f64011OooO0OO.f64112OooO0Oo = f;
    }

    public final void OooOOoo(int i, float f) {
        OooOO0(i).f64014OooO0o0.f64037OooO0oO = f;
        OooOO0(i).f64014OooO0o0.f64035OooO0o = -1;
        OooOO0(i).f64014OooO0o0.f64036OooO0o0 = -1;
    }
}
