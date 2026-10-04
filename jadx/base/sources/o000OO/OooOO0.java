package o000OO;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o0000O0O.AbstractC24153OooO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends AbstractC24443OooO0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f82528OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f82530OooO0o0 = Float.NaN;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f82529OooO0o = Float.NaN;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f82531OooO0oO = Float.NaN;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f82532OooO0oo = Float.NaN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f82527OooO = Float.NaN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f82533OooOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f82534OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f82535OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f82537OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f82536OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f82538OooOOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f82539OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f82541OooOOo0 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f82540OooOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f82542OooOOoo = 0.0f;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SparseIntArray f82543OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f82543OooO00o = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public OooOO0() {
        this.f82477OooO0OO = new HashMap<>();
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO00o(HashMap<String, o0000O0O.OooO0OO> map) {
        throw null;
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    /* JADX INFO: renamed from: OooO0O0 */
    public final AbstractC24443OooO0Oo clone() {
        OooOO0 oooOO02 = new OooOO0();
        super.OooO0OO(this);
        oooOO02.f82528OooO0Oo = this.f82528OooO0Oo;
        oooOO02.f82541OooOOo0 = this.f82541OooOOo0;
        oooOO02.f82540OooOOo = this.f82540OooOOo;
        oooOO02.f82542OooOOoo = this.f82542OooOOoo;
        oooOO02.f82539OooOOOo = this.f82539OooOOOo;
        oooOO02.f82530OooO0o0 = this.f82530OooO0o0;
        oooOO02.f82529OooO0o = this.f82529OooO0o;
        oooOO02.f82531OooO0oO = this.f82531OooO0oO;
        oooOO02.f82533OooOO0 = this.f82533OooOO0;
        oooOO02.f82532OooO0oo = this.f82532OooO0oo;
        oooOO02.f82527OooO = this.f82527OooO;
        oooOO02.f82534OooOO0O = this.f82534OooOO0O;
        oooOO02.f82535OooOO0o = this.f82535OooOO0o;
        oooOO02.f82537OooOOO0 = this.f82537OooOOO0;
        oooOO02.f82536OooOOO = this.f82536OooOOO;
        oooOO02.f82538OooOOOO = this.f82538OooOOOO;
        return oooOO02;
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO0Oo(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f82530OooO0o0)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f82529OooO0o)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f82531OooO0oO)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f82532OooO0oo)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f82527OooO)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f82537OooOOO0)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f82536OooOOO)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f82538OooOOOO)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f82533OooOO0)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f82534OooOO0O)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f82535OooOO0o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f82539OooOOOo)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (this.f82477OooO0OO.size() > 0) {
            Iterator<String> it = this.f82477OooO0OO.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO0o(HashMap<String, Integer> map) {
        if (this.f82528OooO0Oo == -1) {
            return;
        }
        if (!Float.isNaN(this.f82530OooO0o0)) {
            map.put("alpha", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82529OooO0o)) {
            map.put("elevation", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82531OooO0oO)) {
            map.put("rotation", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82532OooO0oo)) {
            map.put("rotationX", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82527OooO)) {
            map.put("rotationY", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82537OooOOO0)) {
            map.put("translationX", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82536OooOOO)) {
            map.put("translationY", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82538OooOOOO)) {
            map.put("translationZ", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82533OooOO0)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82534OooOO0O)) {
            map.put("scaleX", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82534OooOO0O)) {
            map.put("scaleY", Integer.valueOf(this.f82528OooO0Oo));
        }
        if (!Float.isNaN(this.f82539OooOOOo)) {
            map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f82528OooO0Oo));
        }
        if (this.f82477OooO0OO.size() > 0) {
            Iterator<String> it = this.f82477OooO0OO.keySet().iterator();
            while (it.hasNext()) {
                map.put(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("CUSTOM,", it.next()), Integer.valueOf(this.f82528OooO0Oo));
            }
        }
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO0o.f64138OooOO0);
        SparseIntArray sparseIntArray = OooO00o.f82543OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = OooO00o.f82543OooO00o;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f82530OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f82530OooO0o0);
                    break;
                case 2:
                    this.f82529OooO0o = typedArrayObtainStyledAttributes.getDimension(index, this.f82529OooO0o);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f82531OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f82531OooO0oO);
                    break;
                case 5:
                    this.f82532OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f82532OooO0oo);
                    break;
                case 6:
                    this.f82527OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f82527OooO);
                    break;
                case 7:
                    this.f82534OooOO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f82534OooOO0O);
                    break;
                case 8:
                    this.f82533OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f82533OooOO0);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
                    int i2 = MotionLayout.f63661ooOO;
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f82476OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f82476OooO0O0);
                    }
                    break;
                case 12:
                    this.f82475OooO00o = typedArrayObtainStyledAttributes.getInt(index, this.f82475OooO00o);
                    break;
                case 13:
                    this.f82528OooO0Oo = typedArrayObtainStyledAttributes.getInteger(index, this.f82528OooO0Oo);
                    break;
                case 14:
                    this.f82535OooOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f82535OooOO0o);
                    break;
                case 15:
                    this.f82537OooOOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.f82537OooOOO0);
                    break;
                case 16:
                    this.f82536OooOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f82536OooOOO);
                    break;
                case 17:
                    this.f82538OooOOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f82538OooOOOO);
                    break;
                case 18:
                    this.f82539OooOOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f82539OooOOOo);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f82541OooOOo0 = 7;
                    } else {
                        this.f82541OooOOo0 = typedArrayObtainStyledAttributes.getInt(index, this.f82541OooOOo0);
                    }
                    break;
                case 20:
                    this.f82540OooOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f82540OooOOo);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f82542OooOOoo = typedArrayObtainStyledAttributes.getDimension(index, this.f82542OooOOoo);
                    } else {
                        this.f82542OooOOoo = typedArrayObtainStyledAttributes.getFloat(index, this.f82542OooOOoo);
                    }
                    break;
            }
        }
    }

    public final void OooO0oO(HashMap<String, AbstractC24153OooO0Oo> map) {
        for (String str : map.keySet()) {
            AbstractC24153OooO0Oo abstractC24153OooO0Oo = map.get(str);
            if (abstractC24153OooO0Oo != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f82532OooO0oo)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82532OooO0oo, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f82527OooO)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82527OooO, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f82537OooOOO0)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82537OooOOO0, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f82536OooOOO)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82536OooOOO, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f82538OooOOOO)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82538OooOOOO, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f82539OooOOOo)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82539OooOOOo, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f82534OooOO0O)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82534OooOO0O, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f82535OooOO0o)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82535OooOO0o, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f82531OooO0oO)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82531OooO0oO, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f82529OooO0o)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82529OooO0o, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f82533OooOO0)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82533OooOO0, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f82530OooO0o0)) {
                                break;
                            } else {
                                abstractC24153OooO0Oo.OooO0O0(this.f82530OooO0o0, this.f82540OooOOo, this.f82542OooOOoo, this.f82475OooO00o, this.f82541OooOOo0);
                                break;
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.OooO00o oooO00o = this.f82477OooO0OO.get(str.substring(7));
                    if (oooO00o != null) {
                        AbstractC24153OooO0Oo.OooO0O0 oooO0O0 = (AbstractC24153OooO0Oo.OooO0O0) abstractC24153OooO0Oo;
                        int i = this.f82475OooO00o;
                        float f = this.f82540OooOOo;
                        int i2 = this.f82541OooOOo0;
                        float f2 = this.f82542OooOOoo;
                        oooO0O0.f81427OooOO0o.append(i, oooO00o);
                        oooO0O0.f81429OooOOO0.append(i, new float[]{f, f2});
                        oooO0O0.f81412OooO0O0 = Math.max(oooO0O0.f81412OooO0O0, i2);
                    }
                }
            }
        }
    }
}
