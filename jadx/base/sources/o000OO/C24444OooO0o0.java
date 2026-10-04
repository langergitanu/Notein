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
import o0000O0O.OooO0OO;

/* JADX INFO: renamed from: o000OO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24444OooO0o0 extends AbstractC24443OooO0Oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f82499OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f82501OooO0o0 = Float.NaN;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f82500OooO0o = Float.NaN;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f82502OooO0oO = Float.NaN;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f82503OooO0oo = Float.NaN;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f82498OooO = Float.NaN;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f82504OooOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f82505OooOO0O = Float.NaN;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f82506OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f82508OooOOO0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f82507OooOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f82509OooOOOO = Float.NaN;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f82510OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f82512OooOOo0 = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f82511OooOOo = Float.NaN;

    /* JADX INFO: renamed from: o000OO.OooO0o0$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SparseIntArray f82513OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f82513OooO00o = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    public C24444OooO0o0() {
        this.f82477OooO0OO = new HashMap<>();
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO00o(HashMap<String, o0000O0O.OooO0OO> map) {
        for (String str : map.keySet()) {
            o0000O0O.OooO0OO oooO0OO = map.get(str);
            if (oooO0OO != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f82503OooO0oo)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82503OooO0oo);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f82498OooO)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82498OooO);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f82509OooOOOO)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82509OooOOOO);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f82510OooOOOo)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82510OooOOOo);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f82512OooOOo0)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82512OooOOo0);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f82511OooOOo)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82511OooOOo);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f82508OooOOO0)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82508OooOOO0);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f82507OooOOO)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82507OooOOO);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f82503OooO0oo)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82504OooOO0);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f82498OooO)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82505OooOO0O);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f82502OooO0oO)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82502OooO0oO);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f82500OooO0o)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82500OooO0o);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f82506OooOO0o)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82506OooOO0o);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f82501OooO0o0)) {
                                break;
                            } else {
                                oooO0OO.OooO0O0(this.f82475OooO00o, this.f82501OooO0o0);
                                break;
                            }
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.OooO00o oooO00o = this.f82477OooO0OO.get(str.substring(7));
                    if (oooO00o != null) {
                        ((OooO0OO.OooO0O0) oooO0OO).f81423OooO0o.append(this.f82475OooO00o, oooO00o);
                    }
                }
            }
        }
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    /* JADX INFO: renamed from: OooO0O0 */
    public final AbstractC24443OooO0Oo clone() {
        C24444OooO0o0 c24444OooO0o0 = new C24444OooO0o0();
        super.OooO0OO(this);
        c24444OooO0o0.f82499OooO0Oo = this.f82499OooO0Oo;
        c24444OooO0o0.f82501OooO0o0 = this.f82501OooO0o0;
        c24444OooO0o0.f82500OooO0o = this.f82500OooO0o;
        c24444OooO0o0.f82502OooO0oO = this.f82502OooO0oO;
        c24444OooO0o0.f82503OooO0oo = this.f82503OooO0oo;
        c24444OooO0o0.f82498OooO = this.f82498OooO;
        c24444OooO0o0.f82504OooOO0 = this.f82504OooOO0;
        c24444OooO0o0.f82505OooOO0O = this.f82505OooOO0O;
        c24444OooO0o0.f82506OooOO0o = this.f82506OooOO0o;
        c24444OooO0o0.f82508OooOOO0 = this.f82508OooOOO0;
        c24444OooO0o0.f82507OooOOO = this.f82507OooOOO;
        c24444OooO0o0.f82509OooOOOO = this.f82509OooOOOO;
        c24444OooO0o0.f82510OooOOOo = this.f82510OooOOOo;
        c24444OooO0o0.f82512OooOOo0 = this.f82512OooOOo0;
        c24444OooO0o0.f82511OooOOo = this.f82511OooOOo;
        return c24444OooO0o0;
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO0Oo(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f82501OooO0o0)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f82500OooO0o)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f82502OooO0oO)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f82503OooO0oo)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f82498OooO)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f82504OooOO0)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f82505OooOO0O)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f82509OooOOOO)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f82510OooOOOo)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f82512OooOOo0)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f82506OooOO0o)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f82508OooOOO0)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f82507OooOOO)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f82511OooOOo)) {
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
        if (this.f82499OooO0Oo == -1) {
            return;
        }
        if (!Float.isNaN(this.f82501OooO0o0)) {
            map.put("alpha", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82500OooO0o)) {
            map.put("elevation", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82502OooO0oO)) {
            map.put("rotation", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82503OooO0oo)) {
            map.put("rotationX", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82498OooO)) {
            map.put("rotationY", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82504OooOO0)) {
            map.put("transformPivotX", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82505OooOO0O)) {
            map.put("transformPivotY", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82509OooOOOO)) {
            map.put("translationX", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82510OooOOOo)) {
            map.put("translationY", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82512OooOOo0)) {
            map.put("translationZ", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82506OooOO0o)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82508OooOOO0)) {
            map.put("scaleX", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82507OooOOO)) {
            map.put("scaleY", Integer.valueOf(this.f82499OooO0Oo));
        }
        if (!Float.isNaN(this.f82511OooOOo)) {
            map.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f82499OooO0Oo));
        }
        if (this.f82477OooO0OO.size() > 0) {
            Iterator<String> it = this.f82477OooO0OO.keySet().iterator();
            while (it.hasNext()) {
                map.put(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("CUSTOM,", it.next()), Integer.valueOf(this.f82499OooO0Oo));
            }
        }
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO0o.f64136OooO0oO);
        SparseIntArray sparseIntArray = OooO00o.f82513OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = OooO00o.f82513OooO00o;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f82501OooO0o0 = typedArrayObtainStyledAttributes.getFloat(index, this.f82501OooO0o0);
                    break;
                case 2:
                    this.f82500OooO0o = typedArrayObtainStyledAttributes.getDimension(index, this.f82500OooO0o);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f82502OooO0oO = typedArrayObtainStyledAttributes.getFloat(index, this.f82502OooO0oO);
                    break;
                case 5:
                    this.f82503OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f82503OooO0oo);
                    break;
                case 6:
                    this.f82498OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f82498OooO);
                    break;
                case 7:
                    this.f82508OooOOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f82508OooOOO0);
                    break;
                case 8:
                    this.f82506OooOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f82506OooOO0o);
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
                    this.f82499OooO0Oo = typedArrayObtainStyledAttributes.getInteger(index, this.f82499OooO0Oo);
                    break;
                case 14:
                    this.f82507OooOOO = typedArrayObtainStyledAttributes.getFloat(index, this.f82507OooOOO);
                    break;
                case 15:
                    this.f82509OooOOOO = typedArrayObtainStyledAttributes.getDimension(index, this.f82509OooOOOO);
                    break;
                case 16:
                    this.f82510OooOOOo = typedArrayObtainStyledAttributes.getDimension(index, this.f82510OooOOOo);
                    break;
                case 17:
                    this.f82512OooOOo0 = typedArrayObtainStyledAttributes.getDimension(index, this.f82512OooOOo0);
                    break;
                case 18:
                    this.f82511OooOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f82511OooOOo);
                    break;
                case 19:
                    this.f82504OooOO0 = typedArrayObtainStyledAttributes.getDimension(index, this.f82504OooOO0);
                    break;
                case 20:
                    this.f82505OooOO0O = typedArrayObtainStyledAttributes.getDimension(index, this.f82505OooOO0O);
                    break;
            }
        }
    }
}
