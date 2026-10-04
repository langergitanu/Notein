package o000OO;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements Comparable<OooOOO> {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final String[] f82581Oooo0O0 = {RequestParameters.POSITION, "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f82582OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o0000O00.OooO0OO f82583OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f82584OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f82585OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f82586OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f82587OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f82588OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f82589OooOooO = Float.NaN;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f82590OooOooo = -1;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f82592Oooo000 = -1;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public LinkedHashMap<String, androidx.constraintlayout.widget.OooO00o> f82593Oooo00O = new LinkedHashMap<>();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public double[] f82594Oooo00o = new double[18];

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public double[] f82591Oooo0 = new double[18];

    public static boolean OooO00o(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(OooOOO oooOOO) {
        return Float.compare(this.f82585OooOoO0, oooOOO.f82585OooOoO0);
    }
}
