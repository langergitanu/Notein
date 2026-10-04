package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final float[][] f63756OooOoo = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final float[][] f63757OooOooO = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f63758OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f63759OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f63760OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f63761OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f63762OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f63763OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f63764OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f63765OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f63766OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f63767OooOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f63770OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f63772OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final MotionLayout f63773OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final float f63774OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f63775OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final boolean f63776OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f63777OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final int f63778OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final float f63779OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final float f63780OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float f63781OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f63782OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final float f63783OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f63784OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f63785OooOoo0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f63768OooOO0O = false;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final float[] f63769OooOO0o = new float[2];

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int[] f63771OooOOO0 = new int[2];

    public OooO0O0(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f63759OooO00o = 0;
        this.f63760OooO0O0 = 0;
        this.f63761OooO0OO = 0;
        this.f63762OooO0Oo = -1;
        this.f63764OooO0o0 = -1;
        this.f63763OooO0o = -1;
        this.f63765OooO0oO = -1;
        this.f63766OooO0oo = false;
        this.f63758OooO = 0.0f;
        this.f63767OooOO0 = 1.0f;
        this.f63775OooOOo0 = 4.0f;
        this.f63774OooOOo = 1.2f;
        this.f63776OooOOoo = true;
        this.f63779OooOo00 = 1.0f;
        this.f63778OooOo0 = 0;
        this.f63780OooOo0O = 10.0f;
        this.f63781OooOo0o = 10.0f;
        this.f63777OooOo = 1.0f;
        this.f63783OooOoO0 = Float.NaN;
        this.f63782OooOoO = Float.NaN;
        this.f63784OooOoOO = 0;
        this.f63785OooOoo0 = 0;
        this.f63773OooOOOo = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), OooO0o.f64146OooOOo0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 16) {
                this.f63762OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(index, this.f63762OooO0Oo);
            } else if (index == 17) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f63759OooO00o);
                this.f63759OooO00o = i2;
                float[] fArr = f63756OooOoo[i2];
                float f = fArr[0];
                float f2 = fArr[1];
            } else if (index == 1) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f63760OooO0O0);
                this.f63760OooO0O0 = i3;
                if (i3 < 6) {
                    float[] fArr2 = f63757OooOooO[i3];
                    this.f63758OooO = fArr2[0];
                    this.f63767OooOO0 = fArr2[1];
                } else {
                    this.f63767OooOO0 = Float.NaN;
                    this.f63758OooO = Float.NaN;
                    this.f63766OooO0oo = true;
                }
            } else if (index == 6) {
                this.f63775OooOOo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f63775OooOOo0);
            } else if (index == 5) {
                this.f63774OooOOo = typedArrayObtainStyledAttributes.getFloat(index, this.f63774OooOOo);
            } else if (index == 7) {
                this.f63776OooOOoo = typedArrayObtainStyledAttributes.getBoolean(index, this.f63776OooOOoo);
            } else if (index == 2) {
                this.f63779OooOo00 = typedArrayObtainStyledAttributes.getFloat(index, this.f63779OooOo00);
            } else if (index == 3) {
                this.f63780OooOo0O = typedArrayObtainStyledAttributes.getFloat(index, this.f63780OooOo0O);
            } else if (index == 18) {
                this.f63764OooO0o0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f63764OooO0o0);
            } else if (index == 9) {
                this.f63761OooO0OO = typedArrayObtainStyledAttributes.getInt(index, this.f63761OooO0OO);
            } else if (index == 8) {
                this.f63778OooOo0 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f63763OooO0o = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f63765OooO0oO = typedArrayObtainStyledAttributes.getResourceId(index, this.f63765OooO0oO);
            } else if (index == 12) {
                this.f63781OooOo0o = typedArrayObtainStyledAttributes.getFloat(index, this.f63781OooOo0o);
            } else if (index == 13) {
                this.f63777OooOo = typedArrayObtainStyledAttributes.getFloat(index, this.f63777OooOo);
            } else if (index == 14) {
                this.f63783OooOoO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f63783OooOoO0);
            } else if (index == 15) {
                this.f63782OooOoO = typedArrayObtainStyledAttributes.getFloat(index, this.f63782OooOoO);
            } else if (index == 11) {
                this.f63784OooOoOO = typedArrayObtainStyledAttributes.getInt(index, this.f63784OooOoOO);
            } else if (index == 0) {
                this.f63785OooOoo0 = typedArrayObtainStyledAttributes.getInt(index, this.f63785OooOoo0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF OooO00o(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f63763OooO0o;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final RectF OooO0O0(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f63764OooO0o0;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void OooO0OO(boolean z) {
        float[][] fArr = f63756OooOoo;
        float[][] fArr2 = f63757OooOooO;
        if (z) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f63759OooO00o];
        float f = fArr3[0];
        float f2 = fArr3[1];
        int i = this.f63760OooO0O0;
        if (i >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i];
        this.f63758OooO = fArr4[0];
        this.f63767OooOO0 = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f63758OooO)) {
            return "rotation";
        }
        return this.f63758OooO + " , " + this.f63767OooOO0;
    }
}
