package o000OO;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.OooO00o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o0000O00.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends AbstractC24443OooO0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f82479OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f82481OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f82480OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f82482OooO0oO = Float.NaN;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f82483OooO0oo = 0.0f;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f82478OooO = 0.0f;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f82484OooOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f82485OooOO0O = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f82486OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f82488OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f82487OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f82489OooOOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f82490OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f82492OooOOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f82491OooOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f82493OooOOoo = Float.NaN;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f82495OooOo00 = Float.NaN;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f82494OooOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f82496OooOo0O = Float.NaN;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SparseIntArray f82497OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f82497OooO00o = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    public OooO0o() {
        this.f82477OooO0OO = new HashMap<>();
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO00o(HashMap<String, o0000O0O.OooO0OO> map) {
        throw null;
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    /* JADX INFO: renamed from: OooO0O0 */
    public final AbstractC24443OooO0Oo clone() {
        OooO0o oooO0o = new OooO0o();
        super.OooO0OO(this);
        oooO0o.f82479OooO0Oo = this.f82479OooO0Oo;
        oooO0o.f82481OooO0o0 = this.f82481OooO0o0;
        oooO0o.f82480OooO0o = this.f82480OooO0o;
        oooO0o.f82482OooO0oO = this.f82482OooO0oO;
        oooO0o.f82483OooO0oo = this.f82483OooO0oo;
        oooO0o.f82478OooO = this.f82478OooO;
        oooO0o.f82484OooOO0 = this.f82484OooOO0;
        oooO0o.f82485OooOO0O = this.f82485OooOO0O;
        oooO0o.f82486OooOO0o = this.f82486OooOO0o;
        oooO0o.f82488OooOOO0 = this.f82488OooOOO0;
        oooO0o.f82487OooOOO = this.f82487OooOOO;
        oooO0o.f82489OooOOOO = this.f82489OooOOOO;
        oooO0o.f82490OooOOOo = this.f82490OooOOOo;
        oooO0o.f82492OooOOo0 = this.f82492OooOOo0;
        oooO0o.f82491OooOOo = this.f82491OooOOo;
        oooO0o.f82493OooOOoo = this.f82493OooOOoo;
        oooO0o.f82495OooOo00 = this.f82495OooOo00;
        oooO0o.f82494OooOo0 = this.f82494OooOo0;
        oooO0o.f82496OooOo0O = this.f82496OooOo0O;
        return oooO0o;
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO0Oo(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f82486OooOO0o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f82488OooOOO0)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f82487OooOOO)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f82490OooOOOo)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f82492OooOOo0)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f82491OooOOo)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f82493OooOOoo)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f82489OooOOOO)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f82495OooOo00)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f82494OooOo0)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f82496OooOo0O)) {
            hashSet.add("translationZ");
        }
        if (this.f82477OooO0OO.size() > 0) {
            Iterator<String> it = this.f82477OooO0OO.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO0o.f64137OooO0oo);
        SparseIntArray sparseIntArray = OooO00o.f82497OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = OooO00o.f82497OooO00o;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    int i2 = MotionLayout.f63661ooOO;
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f82476OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f82476OooO0O0);
                    }
                    break;
                case 2:
                    this.f82475OooO00o = typedArrayObtainStyledAttributes.getInt(index, this.f82475OooO00o);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f82479OooO0Oo = typedArrayObtainStyledAttributes.getInteger(index, this.f82479OooO0Oo);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f82480OooO0o = typedArrayObtainStyledAttributes.getString(index);
                        this.f82481OooO0o0 = 7;
                    } else {
                        this.f82481OooO0o0 = typedArrayObtainStyledAttributes.getInt(index, this.f82481OooO0o0);
                    }
                    break;
                case 6:
                    this.f82482OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f82482OooO0oO);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f82483OooO0oo = typedArrayObtainStyledAttributes.getDimension(index, this.f82483OooO0oo);
                    } else {
                        this.f82483OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f82483OooO0oo);
                    }
                    break;
                case 8:
                    this.f82485OooOO0O = typedArrayObtainStyledAttributes.getInt(index, this.f82485OooOO0O);
                    break;
                case 9:
                    this.f82486OooOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f82486OooOO0o);
                    break;
                case 10:
                    this.f82488OooOOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.f82488OooOOO0);
                    break;
                case 11:
                    this.f82487OooOOO = typedArrayObtainStyledAttributes.getFloat(index, this.f82487OooOOO);
                    break;
                case 12:
                    this.f82490OooOOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f82490OooOOOo);
                    break;
                case 13:
                    this.f82492OooOOo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f82492OooOOo0);
                    break;
                case 14:
                    this.f82489OooOOOO = typedArrayObtainStyledAttributes.getFloat(index, this.f82489OooOOOO);
                    break;
                case 15:
                    this.f82491OooOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f82491OooOOo);
                    break;
                case 16:
                    this.f82493OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f82493OooOOoo);
                    break;
                case 17:
                    this.f82495OooOo00 = typedArrayObtainStyledAttributes.getDimension(index, this.f82495OooOo00);
                    break;
                case 18:
                    this.f82494OooOo0 = typedArrayObtainStyledAttributes.getDimension(index, this.f82494OooOo0);
                    break;
                case 19:
                    this.f82496OooOo0O = typedArrayObtainStyledAttributes.getDimension(index, this.f82496OooOo0O);
                    break;
                case 20:
                    this.f82484OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f82484OooOO0);
                    break;
                case 21:
                    this.f82478OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f82478OooO) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    public final void OooO0oO(HashMap<String, o0000O0O.OooO0O0> map) {
        float f;
        o0000O0O.OooO0O0 oooO0O0;
        o0000O0O.OooO0O0 oooO0O02;
        int i = 7;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.OooO00o oooO00o = this.f82477OooO0OO.get(str.substring(i));
                if (oooO00o != null) {
                    if (oooO00o.f63970OooO0OO == OooO00o.EnumC19004OooO00o.f63976OooOo && (oooO0O02 = map.get(str)) != null) {
                        int i2 = this.f82475OooO00o;
                        int i3 = this.f82481OooO0o0;
                        String str2 = this.f82480OooO0o;
                        int i4 = this.f82485OooOO0O;
                        oooO0O02.f81380OooO0o.add(new OooO0o.OooO0O0(this.f82482OooO0oO, this.f82483OooO0oo, this.f82478OooO, oooO00o.OooO00o(), i2));
                        if (i4 != -1) {
                            oooO0O02.f81381OooO0o0 = i4;
                        }
                        oooO0O02.f81378OooO0OO = i3;
                        oooO0O02.OooO0O0(oooO00o);
                        oooO0O02.f81379OooO0Oo = str2;
                    }
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.f82490OooOOOo;
                        break;
                    case "rotationY":
                        f = this.f82492OooOOo0;
                        break;
                    case "translationX":
                        f = this.f82495OooOo00;
                        break;
                    case "translationY":
                        f = this.f82494OooOo0;
                        break;
                    case "translationZ":
                        f = this.f82496OooOo0O;
                        break;
                    case "progress":
                        f = this.f82484OooOO0;
                        break;
                    case "scaleX":
                        f = this.f82491OooOOo;
                        break;
                    case "scaleY":
                        f = this.f82493OooOOoo;
                        break;
                    case "rotation":
                        f = this.f82487OooOOO;
                        break;
                    case "elevation":
                        f = this.f82488OooOOO0;
                        break;
                    case "transitionPathRotate":
                        f = this.f82489OooOOOO;
                        break;
                    case "alpha":
                        f = this.f82486OooOO0o;
                        break;
                    case "waveOffset":
                        f = this.f82483OooO0oo;
                        break;
                    case "wavePhase":
                        f = this.f82478OooO;
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING! KeyCycle", "  UNKNOWN  ".concat(str));
                        }
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (oooO0O0 = map.get(str)) != null) {
                    int i5 = this.f82475OooO00o;
                    int i6 = this.f82481OooO0o0;
                    String str3 = this.f82480OooO0o;
                    int i7 = this.f82485OooOO0O;
                    oooO0O0.f81380OooO0o.add(new OooO0o.OooO0O0(this.f82482OooO0oO, this.f82483OooO0oo, this.f82478OooO, f2, i5));
                    if (i7 != -1) {
                        oooO0O0.f81381OooO0o0 = i7;
                    }
                    oooO0O0.f81378OooO0OO = i6;
                    oooO0O0.f81379OooO0Oo = str3;
                }
            }
            i = 7;
        }
    }
}
