package o000OO;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;

/* JADX INFO: renamed from: o000OO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24446OooO0oo extends OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f82516OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f82517OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f82518OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f82519OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f82520OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f82521OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f82522OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f82523OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f82524OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f82525OooOOO0;

    /* JADX INFO: renamed from: o000OO.OooO0oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SparseIntArray f82526OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f82526OooO00o = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    public C24446OooO0oo() {
        this.f82474OooO0Oo = -1;
        this.f82518OooO0o0 = null;
        this.f82517OooO0o = -1;
        this.f82519OooO0oO = 0;
        this.f82520OooO0oo = Float.NaN;
        this.f82516OooO = Float.NaN;
        this.f82521OooOO0 = Float.NaN;
        this.f82522OooOO0O = Float.NaN;
        this.f82523OooOO0o = Float.NaN;
        this.f82525OooOOO0 = Float.NaN;
        this.f82524OooOOO = 0;
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO00o(HashMap<String, o0000O0O.OooO0OO> map) {
        throw null;
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    /* JADX INFO: renamed from: OooO0O0 */
    public final AbstractC24443OooO0Oo clone() {
        C24446OooO0oo c24446OooO0oo = new C24446OooO0oo();
        super.OooO0OO(this);
        c24446OooO0oo.f82518OooO0o0 = this.f82518OooO0o0;
        c24446OooO0oo.f82517OooO0o = this.f82517OooO0o;
        c24446OooO0oo.f82519OooO0oO = this.f82519OooO0oO;
        c24446OooO0oo.f82520OooO0oo = this.f82520OooO0oo;
        c24446OooO0oo.f82516OooO = Float.NaN;
        c24446OooO0oo.f82521OooOO0 = this.f82521OooOO0;
        c24446OooO0oo.f82522OooOO0O = this.f82522OooOO0O;
        c24446OooO0oo.f82523OooOO0o = this.f82523OooOO0o;
        c24446OooO0oo.f82525OooOOO0 = this.f82525OooOOO0;
        return c24446OooO0oo;
    }

    @Override // o000OO.AbstractC24443OooO0Oo
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO0o.f64129OooO);
        SparseIntArray sparseIntArray = OooO00o.f82526OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = OooO00o.f82526OooO00o;
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
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f82518OooO0o0 = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f82518OooO0o0 = o0000O00.OooO0OO.f81369OooO0OO[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f82474OooO0Oo = typedArrayObtainStyledAttributes.getInteger(index, this.f82474OooO0Oo);
                    break;
                case 5:
                    this.f82519OooO0oO = typedArrayObtainStyledAttributes.getInt(index, this.f82519OooO0oO);
                    break;
                case 6:
                    this.f82521OooOO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f82521OooOO0);
                    break;
                case 7:
                    this.f82522OooOO0O = typedArrayObtainStyledAttributes.getFloat(index, this.f82522OooOO0O);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f82516OooO);
                    this.f82520OooO0oo = f;
                    this.f82516OooO = f;
                    break;
                case 9:
                    this.f82524OooOOO = typedArrayObtainStyledAttributes.getInt(index, this.f82524OooOOO);
                    break;
                case 10:
                    this.f82517OooO0o = typedArrayObtainStyledAttributes.getInt(index, this.f82517OooO0o);
                    break;
                case 11:
                    this.f82520OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, this.f82520OooO0oo);
                    break;
                case 12:
                    this.f82516OooO = typedArrayObtainStyledAttributes.getFloat(index, this.f82516OooO);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f82475OooO00o == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
