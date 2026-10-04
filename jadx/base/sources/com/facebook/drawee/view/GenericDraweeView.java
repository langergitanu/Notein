package com.facebook.drawee.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o00o.C25203OooO00o;
import o00oO0O0.OooOo00;
import o00oO0O0.RunnableC25552OooO0OO;
import o00ooO.C25732OooO0O0;
import o0oOOo.C30838OooO00o;
import o0oOOo.C30839OooO0O0;
import o0oOOo.C30840OooO0OO;
import o0oOOo.C30843OooO0o0;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class GenericDraweeView extends DraweeView<C30838OooO00o> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0353 A[PHI: r0 r2 r3
      0x0353: PHI (r0v23 boolean) = (r0v18 boolean), (r0v25 boolean) binds: [B:196:0x0373, B:179:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r2v19 boolean) = (r2v15 boolean), (r2v21 boolean) binds: [B:196:0x0373, B:179:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0353: PHI (r3v14 boolean) = (r3v10 boolean), (r3v16 boolean) binds: [B:196:0x0373, B:179:0x0351] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0355 A[PHI: r0 r2 r3
      0x0355: PHI (r0v20 boolean) = (r0v18 boolean), (r0v18 boolean), (r0v25 boolean), (r0v25 boolean) binds: [B:195:0x0371, B:196:0x0373, B:178:0x034f, B:179:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r2v17 boolean) = (r2v15 boolean), (r2v15 boolean), (r2v21 boolean), (r2v21 boolean) binds: [B:195:0x0371, B:196:0x0373, B:178:0x034f, B:179:0x0351] A[DONT_GENERATE, DONT_INLINE]
      0x0355: PHI (r3v12 boolean) = (r3v10 boolean), (r3v10 boolean), (r3v16 boolean), (r3v16 boolean) binds: [B:195:0x0371, B:196:0x0373, B:178:0x034f, B:179:0x0351] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.graphics.drawable.StateListDrawable, java.util.List<android.graphics.drawable.Drawable>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GenericDraweeView(Context context, AttributeSet attributeSet) throws Throwable {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        int integer;
        boolean z4;
        float f2;
        int indexCount;
        int i6;
        int dimensionPixelSize;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int index;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f3;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        int i12;
        super(context, attributeSet);
        Context context2 = context;
        C25732OooO0O0.OooO00o();
        C25732OooO0O0.OooO00o();
        Resources resources = context2.getResources();
        C30839OooO0O0 c30839OooO0O0 = new C30839OooO0O0();
        c30839OooO0O0.f110214OooO00o = resources;
        c30839OooO0O0.f110215OooO0O0 = 300;
        float f4 = 0.0f;
        c30839OooO0O0.f110216OooO0OO = 0.0f;
        ?? r5 = 0;
        c30839OooO0O0.f110217OooO0Oo = null;
        OooOo00 oooOo00 = C30839OooO0O0.f110212OooOOo0;
        c30839OooO0O0.f110219OooO0o0 = oooOo00;
        c30839OooO0O0.f110218OooO0o = null;
        c30839OooO0O0.f110220OooO0oO = oooOo00;
        c30839OooO0O0.f110221OooO0oo = null;
        c30839OooO0O0.f110213OooO = oooOo00;
        c30839OooO0O0.f110222OooOO0 = null;
        c30839OooO0O0.f110223OooOO0O = oooOo00;
        c30839OooO0O0.f110224OooOO0o = C30839OooO0O0.f110211OooOOo;
        c30839OooO0O0.f110226OooOOO0 = null;
        c30839OooO0O0.f110225OooOOO = null;
        c30839OooO0O0.f110227OooOOOO = null;
        c30839OooO0O0.f110228OooOOOo = null;
        int i13 = 3;
        int i14 = 7;
        int i15 = 2;
        int i16 = 8;
        int i17 = 6;
        ?? r14 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C25203OooO00o.f85803OooO00o);
            try {
                indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                integer = 0;
                i6 = 0;
                dimensionPixelSize = 0;
                z5 = true;
                z6 = true;
                z7 = true;
                z8 = true;
                z9 = true;
                z10 = true;
                z11 = true;
                z12 = true;
            } catch (Throwable th) {
                th = th;
            }
            while (i6 < indexCount) {
                try {
                    index = typedArrayObtainStyledAttributes.getIndex(i6);
                } catch (Throwable th2) {
                    th = th2;
                    z14 = z12;
                }
                if (index == 0) {
                    try {
                        c30839OooO0O0.f110224OooOO0o = C30840OooO0OO.OooO0OO(typedArrayObtainStyledAttributes, index);
                        i7 = indexCount;
                        i8 = i17;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else if (index == i17) {
                    c30839OooO0O0.f110217OooO0Oo = C30840OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, index);
                    i7 = indexCount;
                    i8 = i17;
                } else {
                    if (index == i16) {
                        Drawable drawableOooO00o = C30840OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, index);
                        if (drawableOooO00o == null) {
                            c30839OooO0O0.f110227OooOOOO = r5;
                            i8 = i17;
                        } else {
                            i8 = i17;
                            StateListDrawable stateListDrawable = new StateListDrawable();
                            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawableOooO00o);
                            c30839OooO0O0.f110227OooOOOO = stateListDrawable;
                        }
                    } else {
                        i8 = i17;
                        if (index == 10) {
                            c30839OooO0O0.f110222OooOO0 = C30840OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, index);
                        } else if (index == i15) {
                            c30839OooO0O0.f110215OooO0O0 = typedArrayObtainStyledAttributes.getInt(index, r14);
                        } else if (index == 28) {
                            c30839OooO0O0.f110216OooO0OO = typedArrayObtainStyledAttributes.getFloat(index, f4);
                        } else if (index == i14) {
                            c30839OooO0O0.f110219OooO0o0 = C30840OooO0OO.OooO0OO(typedArrayObtainStyledAttributes, index);
                        } else if (index == 12) {
                            c30839OooO0O0.f110218OooO0o = C30840OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, index);
                        } else if (index == 13) {
                            c30839OooO0O0.f110220OooO0oO = C30840OooO0OO.OooO0OO(typedArrayObtainStyledAttributes, index);
                        } else if (index == i13) {
                            c30839OooO0O0.f110221OooO0oo = C30840OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, index);
                        } else if (index == 4) {
                            c30839OooO0O0.f110213OooO = C30840OooO0OO.OooO0OO(typedArrayObtainStyledAttributes, index);
                        } else if (index == 11) {
                            c30839OooO0O0.f110223OooOO0O = C30840OooO0OO.OooO0OO(typedArrayObtainStyledAttributes, index);
                        } else {
                            if (index == 9) {
                                integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                            } else if (index == 1) {
                                c30839OooO0O0.f110226OooOOO0 = C30840OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, index);
                            } else if (index == 5) {
                                Drawable drawableOooO00o2 = C30840OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, index);
                                if (drawableOooO00o2 == null) {
                                    c30839OooO0O0.f110225OooOOO = r5;
                                } else {
                                    c30839OooO0O0.f110225OooOOO = Arrays.asList(drawableOooO00o2);
                                }
                            } else if (index == 14) {
                                C30840OooO0OO.OooO0O0(c30839OooO0O0).f110233OooO0O0 = typedArrayObtainStyledAttributes.getBoolean(index, r14);
                            } else {
                                if (index != 24) {
                                    i12 = dimensionPixelSize;
                                    if (index == 20) {
                                        z15 = z5;
                                        try {
                                            z5 = typedArrayObtainStyledAttributes.getBoolean(index, z15);
                                            i7 = indexCount;
                                            dimensionPixelSize = i12;
                                            z15 = z5;
                                            z19 = z7;
                                            i11 = i13;
                                            z18 = z11;
                                            i9 = i14;
                                            z17 = z9;
                                            i10 = i15;
                                            z16 = z6;
                                            f3 = f4;
                                            z20 = z8;
                                            i6++;
                                            context2 = context;
                                            indexCount = i7;
                                            z8 = z20;
                                            z5 = z15;
                                            f4 = f3;
                                            i17 = i8;
                                            i16 = 8;
                                            r14 = 0;
                                            z6 = z16;
                                            i15 = i10;
                                            z9 = z17;
                                            i14 = i9;
                                            z11 = z18;
                                            i13 = i11;
                                            z7 = z19;
                                            r5 = 0;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } else {
                                        z15 = z5;
                                        if (index == 21) {
                                            try {
                                                z7 = typedArrayObtainStyledAttributes.getBoolean(index, z7);
                                                i7 = indexCount;
                                                dimensionPixelSize = i12;
                                                z19 = z7;
                                                i11 = i13;
                                                z18 = z11;
                                                i9 = i14;
                                                z17 = z9;
                                                i10 = i15;
                                                z16 = z6;
                                                f3 = f4;
                                                z20 = z8;
                                                i6++;
                                                context2 = context;
                                                indexCount = i7;
                                                z8 = z20;
                                                z5 = z15;
                                                f4 = f3;
                                                i17 = i8;
                                                i16 = 8;
                                                r14 = 0;
                                                z6 = z16;
                                                i15 = i10;
                                                z9 = z17;
                                                i14 = i9;
                                                z11 = z18;
                                                i13 = i11;
                                                z7 = z19;
                                                r5 = 0;
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                        } else {
                                            z19 = z7;
                                            i11 = i13;
                                            if (index == 16) {
                                                try {
                                                    z11 = typedArrayObtainStyledAttributes.getBoolean(index, z11);
                                                    i7 = indexCount;
                                                    dimensionPixelSize = i12;
                                                    z18 = z11;
                                                    i9 = i14;
                                                    z17 = z9;
                                                    i10 = i15;
                                                    z16 = z6;
                                                    f3 = f4;
                                                    z20 = z8;
                                                    i6++;
                                                    context2 = context;
                                                    indexCount = i7;
                                                    z8 = z20;
                                                    z5 = z15;
                                                    f4 = f3;
                                                    i17 = i8;
                                                    i16 = 8;
                                                    r14 = 0;
                                                    z6 = z16;
                                                    i15 = i10;
                                                    z9 = z17;
                                                    i14 = i9;
                                                    z11 = z18;
                                                    i13 = i11;
                                                    z7 = z19;
                                                    r5 = 0;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                }
                                            } else {
                                                z18 = z11;
                                                i9 = i14;
                                                if (index == 17) {
                                                    try {
                                                        z9 = typedArrayObtainStyledAttributes.getBoolean(index, z9);
                                                        i7 = indexCount;
                                                        dimensionPixelSize = i12;
                                                        z17 = z9;
                                                        i10 = i15;
                                                        z16 = z6;
                                                        f3 = f4;
                                                        z20 = z8;
                                                        i6++;
                                                        context2 = context;
                                                        indexCount = i7;
                                                        z8 = z20;
                                                        z5 = z15;
                                                        f4 = f3;
                                                        i17 = i8;
                                                        i16 = 8;
                                                        r14 = 0;
                                                        z6 = z16;
                                                        i15 = i10;
                                                        z9 = z17;
                                                        i14 = i9;
                                                        z11 = z18;
                                                        i13 = i11;
                                                        z7 = z19;
                                                        r5 = 0;
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                    }
                                                } else {
                                                    z17 = z9;
                                                    i10 = i15;
                                                    if (index == 22) {
                                                        z16 = z6;
                                                        try {
                                                            z6 = typedArrayObtainStyledAttributes.getBoolean(index, z16);
                                                            i7 = indexCount;
                                                            dimensionPixelSize = i12;
                                                            z16 = z6;
                                                            f3 = f4;
                                                            z20 = z8;
                                                            i6++;
                                                            context2 = context;
                                                            indexCount = i7;
                                                            z8 = z20;
                                                            z5 = z15;
                                                            f4 = f3;
                                                            i17 = i8;
                                                            i16 = 8;
                                                            r14 = 0;
                                                            z6 = z16;
                                                            i15 = i10;
                                                            z9 = z17;
                                                            i14 = i9;
                                                            z11 = z18;
                                                            i13 = i11;
                                                            z7 = z19;
                                                            r5 = 0;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                        }
                                                    } else {
                                                        z16 = z6;
                                                        f3 = f4;
                                                        if (index != 19) {
                                                            z20 = z8;
                                                            if (index == 18) {
                                                                z14 = z12;
                                                                try {
                                                                    z12 = typedArrayObtainStyledAttributes.getBoolean(index, z14);
                                                                    i7 = indexCount;
                                                                    dimensionPixelSize = i12;
                                                                    i6++;
                                                                    context2 = context;
                                                                    indexCount = i7;
                                                                    z8 = z20;
                                                                    z5 = z15;
                                                                    f4 = f3;
                                                                    i17 = i8;
                                                                    i16 = 8;
                                                                    r14 = 0;
                                                                    z6 = z16;
                                                                    i15 = i10;
                                                                    z9 = z17;
                                                                    i14 = i9;
                                                                    z11 = z18;
                                                                    i13 = i11;
                                                                    z7 = z19;
                                                                    r5 = 0;
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                }
                                                            } else {
                                                                i7 = indexCount;
                                                                z14 = z12;
                                                                if (index == 15) {
                                                                    try {
                                                                        z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                                                                        dimensionPixelSize = i12;
                                                                        z12 = z14;
                                                                        i6++;
                                                                        context2 = context;
                                                                        indexCount = i7;
                                                                        z8 = z20;
                                                                        z5 = z15;
                                                                        f4 = f3;
                                                                        i17 = i8;
                                                                        i16 = 8;
                                                                        r14 = 0;
                                                                        z6 = z16;
                                                                        i15 = i10;
                                                                        z9 = z17;
                                                                        i14 = i9;
                                                                        z11 = z18;
                                                                        i13 = i11;
                                                                        z7 = z19;
                                                                        r5 = 0;
                                                                    } catch (Throwable th10) {
                                                                        th = th10;
                                                                    }
                                                                } else {
                                                                    boolean z22 = z10;
                                                                    if (index == 23) {
                                                                        C30843OooO0o0 c30843OooO0o0OooO0O0 = C30840OooO0OO.OooO0O0(c30839OooO0O0);
                                                                        z10 = z22;
                                                                        c30843OooO0o0OooO0O0.f110235OooO0Oo = typedArrayObtainStyledAttributes.getColor(index, 0);
                                                                        c30843OooO0o0OooO0O0.f110232OooO00o = C30843OooO0o0.OooO00o.f110240OooOo0o;
                                                                        z21 = z20;
                                                                    } else {
                                                                        z10 = z22;
                                                                        if (index == 27) {
                                                                            try {
                                                                                C30843OooO0o0 c30843OooO0o0OooO0O02 = C30840OooO0OO.OooO0O0(c30839OooO0O0);
                                                                                float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                                                c30843OooO0o0OooO0O02.getClass();
                                                                                z21 = z20;
                                                                                try {
                                                                                    OooOoo0.OooOo00.OooO0OO(dimensionPixelSize2 >= f3, "the border width cannot be < 0");
                                                                                    c30843OooO0o0OooO0O02.f110237OooO0o0 = dimensionPixelSize2;
                                                                                } catch (Throwable th11) {
                                                                                    th = th11;
                                                                                    typedArrayObtainStyledAttributes.recycle();
                                                                                    context.getResources().getConfiguration().getLayoutDirection();
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th12) {
                                                                                th = th12;
                                                                                z21 = z20;
                                                                            }
                                                                        } else {
                                                                            z21 = z20;
                                                                            if (index == 25) {
                                                                                C30840OooO0OO.OooO0O0(c30839OooO0O0).f110236OooO0o = typedArrayObtainStyledAttributes.getColor(index, 0);
                                                                            } else if (index == 26) {
                                                                                C30843OooO0o0 c30843OooO0o0OooO0O03 = C30840OooO0OO.OooO0O0(c30839OooO0O0);
                                                                                float dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                                                c30843OooO0o0OooO0O03.getClass();
                                                                                OooOoo0.OooOo00.OooO0OO(dimensionPixelSize3 >= f3, "the padding cannot be < 0");
                                                                                c30843OooO0o0OooO0O03.f110238OooO0oO = dimensionPixelSize3;
                                                                            }
                                                                        }
                                                                    }
                                                                    dimensionPixelSize = i12;
                                                                    z20 = z21;
                                                                    z12 = z14;
                                                                    i6++;
                                                                    context2 = context;
                                                                    indexCount = i7;
                                                                    z8 = z20;
                                                                    z5 = z15;
                                                                    f4 = f3;
                                                                    i17 = i8;
                                                                    i16 = 8;
                                                                    r14 = 0;
                                                                    z6 = z16;
                                                                    i15 = i10;
                                                                    z9 = z17;
                                                                    i14 = i9;
                                                                    z11 = z18;
                                                                    i13 = i11;
                                                                    z7 = z19;
                                                                    r5 = 0;
                                                                }
                                                            }
                                                            typedArrayObtainStyledAttributes.recycle();
                                                            context.getResources().getConfiguration().getLayoutDirection();
                                                            throw th;
                                                        }
                                                        try {
                                                            z8 = typedArrayObtainStyledAttributes.getBoolean(index, z8);
                                                            i7 = indexCount;
                                                            dimensionPixelSize = i12;
                                                            z20 = z8;
                                                            i6++;
                                                            context2 = context;
                                                            indexCount = i7;
                                                            z8 = z20;
                                                            z5 = z15;
                                                            f4 = f3;
                                                            i17 = i8;
                                                            i16 = 8;
                                                            r14 = 0;
                                                            z6 = z16;
                                                            i15 = i10;
                                                            z9 = z17;
                                                            i14 = i9;
                                                            z11 = z18;
                                                            i13 = i11;
                                                            z7 = z19;
                                                            r5 = 0;
                                                        } catch (Throwable th13) {
                                                            th = th13;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    typedArrayObtainStyledAttributes.recycle();
                                    context.getResources().getConfiguration().getLayoutDirection();
                                    throw th;
                                }
                                dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                            }
                            i7 = indexCount;
                            z15 = z5;
                            z19 = z7;
                            i11 = i13;
                            z18 = z11;
                            i9 = i14;
                            z17 = z9;
                            i10 = i15;
                            z16 = z6;
                            f3 = f4;
                            z20 = z8;
                            i6++;
                            context2 = context;
                            indexCount = i7;
                            z8 = z20;
                            z5 = z15;
                            f4 = f3;
                            i17 = i8;
                            i16 = 8;
                            r14 = 0;
                            z6 = z16;
                            i15 = i10;
                            z9 = z17;
                            i14 = i9;
                            z11 = z18;
                            i13 = i11;
                            z7 = z19;
                            r5 = 0;
                        }
                    }
                    i7 = indexCount;
                }
                z15 = z5;
                z19 = z7;
                z14 = z12;
                i12 = dimensionPixelSize;
                i11 = i13;
                z21 = z8;
                z18 = z11;
                i9 = i14;
                z17 = z9;
                i10 = i15;
                z16 = z6;
                f3 = f4;
                dimensionPixelSize = i12;
                z20 = z21;
                z12 = z14;
                i6++;
                context2 = context;
                indexCount = i7;
                z8 = z20;
                z5 = z15;
                f4 = f3;
                i17 = i8;
                i16 = 8;
                r14 = 0;
                z6 = z16;
                i15 = i10;
                z9 = z17;
                i14 = i9;
                z11 = z18;
                i13 = i11;
                z7 = z19;
                r5 = 0;
            }
            i4 = i17;
            boolean z23 = z5;
            boolean z24 = z7;
            boolean z25 = z12;
            int i18 = dimensionPixelSize;
            i = i13;
            boolean z26 = z8;
            boolean z27 = z11;
            i2 = i14;
            boolean z28 = z9;
            i3 = i15;
            boolean z29 = z6;
            f = f4;
            typedArrayObtainStyledAttributes.recycle();
            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                z13 = z23 && z26;
                z = z24 && z29;
                z2 = z28 && z25;
                z3 = z27 && z10;
            } else {
                z13 = z23 && z29;
                z = z24 && z26;
                z2 = z28 && z10;
                if (!z27 || !z25) {
                }
            }
            z4 = z13;
            i5 = i18;
        } else {
            f = 0.0f;
            i = 3;
            i2 = 7;
            i3 = 2;
            i4 = 6;
            i5 = 0;
            z = true;
            z2 = true;
            z3 = true;
            integer = 0;
            z4 = true;
        }
        if (c30839OooO0O0.f110222OooOO0 == null || integer <= 0) {
            f2 = f;
        } else {
            Drawable drawable = c30839OooO0O0.f110222OooOO0;
            drawable.getClass();
            RunnableC25552OooO0OO runnableC25552OooO0OO = new RunnableC25552OooO0OO(drawable);
            f2 = f;
            runnableC25552OooO0OO.f87151OooOoo0 = f2;
            runnableC25552OooO0OO.f87150OooOoo = false;
            runnableC25552OooO0OO.f87148OooOoO = integer;
            runnableC25552OooO0OO.f87149OooOoOO = true;
            c30839OooO0O0.f110222OooOO0 = runnableC25552OooO0OO;
        }
        if (i5 > 0) {
            C30843OooO0o0 c30843OooO0o0OooO0O04 = C30840OooO0OO.OooO0O0(c30839OooO0O0);
            float f5 = z4 ? i5 : f2;
            float f6 = z ? i5 : f2;
            float f7 = z2 ? i5 : f2;
            float f8 = z3 ? i5 : f2;
            if (c30843OooO0o0OooO0O04.f110234OooO0OO == null) {
                c30843OooO0o0OooO0O04.f110234OooO0OO = new float[8];
            }
            float[] fArr = c30843OooO0o0OooO0O04.f110234OooO0OO;
            fArr[1] = f5;
            fArr[0] = f5;
            fArr[i] = f6;
            fArr[i3] = f6;
            fArr[5] = f7;
            fArr[4] = f7;
            fArr[i2] = f8;
            fArr[i4] = f8;
        }
        C25732OooO0O0.OooO00o();
        setAspectRatio(c30839OooO0O0.f110216OooO0OO);
        List<Drawable> list = c30839OooO0O0.f110225OooOOO;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        setHierarchy(new C30838OooO00o(c30839OooO0O0));
        C25732OooO0O0.OooO00o();
    }
}
