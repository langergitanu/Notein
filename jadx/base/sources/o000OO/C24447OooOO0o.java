package o000OO;

import android.util.Log;
import android.view.View;
import java.util.HashMap;
import java.util.LinkedHashMap;
import o0000O0O.OooO0OO;

/* JADX INFO: renamed from: o000OO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24447OooOO0o implements Comparable<C24447OooOO0o> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f82565OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f82566OooOo0o = 0.0f;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final LinkedHashMap<String, androidx.constraintlayout.widget.OooO00o> f82568OooOoO0 = new LinkedHashMap<>();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f82567OooOoO = 1.0f;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f82569OooOoOO = 0.0f;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f82571OooOoo0 = 0.0f;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f82570OooOoo = 0.0f;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f82572OooOooO = 1.0f;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public float f82573OooOooo = 1.0f;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f82575Oooo000 = Float.NaN;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f82576Oooo00O = Float.NaN;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f82577Oooo00o = 0.0f;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f82574Oooo0 = 0.0f;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public float f82578Oooo0O0 = 0.0f;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final float f82579Oooo0OO = Float.NaN;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final float f82580Oooo0o0 = Float.NaN;

    public static boolean OooO0O0(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    public final void OooO00o(HashMap<String, o0000O0O.OooO0OO> map, int i) {
        for (String str : map.keySet()) {
            o0000O0O.OooO0OO oooO0OO = map.get(str);
            if (oooO0OO != null) {
                str.getClass();
                switch (str) {
                    case "rotationX":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82570OooOoo) ? 0.0f : this.f82570OooOoo);
                        break;
                    case "rotationY":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82566OooOo0o) ? 0.0f : this.f82566OooOo0o);
                        break;
                    case "translationX":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82577Oooo00o) ? 0.0f : this.f82577Oooo00o);
                        break;
                    case "translationY":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82574Oooo0) ? 0.0f : this.f82574Oooo0);
                        break;
                    case "translationZ":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82578Oooo0O0) ? 0.0f : this.f82578Oooo0O0);
                        break;
                    case "progress":
                        float f = this.f82580Oooo0o0;
                        oooO0OO.OooO0O0(i, Float.isNaN(f) ? 0.0f : f);
                        break;
                    case "scaleX":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82572OooOooO) ? 1.0f : this.f82572OooOooO);
                        break;
                    case "scaleY":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82573OooOooo) ? 1.0f : this.f82573OooOooo);
                        break;
                    case "transformPivotX":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82575Oooo000) ? 0.0f : this.f82575Oooo000);
                        break;
                    case "transformPivotY":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82576Oooo00O) ? 0.0f : this.f82576Oooo00O);
                        break;
                    case "rotation":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82571OooOoo0) ? 0.0f : this.f82571OooOoo0);
                        break;
                    case "elevation":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82569OooOoOO) ? 0.0f : this.f82569OooOoOO);
                        break;
                    case "transitionPathRotate":
                        float f2 = this.f82579Oooo0OO;
                        oooO0OO.OooO0O0(i, Float.isNaN(f2) ? 0.0f : f2);
                        break;
                    case "alpha":
                        oooO0OO.OooO0O0(i, Float.isNaN(this.f82567OooOoO) ? 1.0f : this.f82567OooOoO);
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                            break;
                        } else {
                            String str2 = str.split(",")[1];
                            LinkedHashMap<String, androidx.constraintlayout.widget.OooO00o> linkedHashMap = this.f82568OooOoO0;
                            if (linkedHashMap.containsKey(str2)) {
                                androidx.constraintlayout.widget.OooO00o oooO00o = linkedHashMap.get(str2);
                                if (oooO0OO instanceof OooO0OO.OooO0O0) {
                                    ((OooO0OO.OooO0O0) oooO0OO).f81423OooO0o.append(i, oooO00o);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + oooO00o.OooO00o() + oooO0OO);
                                }
                            }
                            break;
                        }
                        break;
                }
            }
        }
    }

    public final void OooO0OO(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        this.f82565OooOo = view.getVisibility();
        this.f82567OooOoO = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f82569OooOoOO = view.getElevation();
        this.f82571OooOoo0 = view.getRotation();
        this.f82570OooOoo = view.getRotationX();
        this.f82566OooOo0o = view.getRotationY();
        this.f82572OooOooO = view.getScaleX();
        this.f82573OooOooo = view.getScaleY();
        this.f82575Oooo000 = view.getPivotX();
        this.f82576Oooo00O = view.getPivotY();
        this.f82577Oooo00o = view.getTranslationX();
        this.f82574Oooo0 = view.getTranslationY();
        this.f82578Oooo0O0 = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(C24447OooOO0o c24447OooOO0o) {
        c24447OooOO0o.getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
