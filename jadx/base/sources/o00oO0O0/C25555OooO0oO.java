package o00oO0O0;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: renamed from: o00oO0O0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25555OooO0oO extends C25551OooO0O0 {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Drawable[] f87157OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f87158Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f87159Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f87160Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f87161Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f87162Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final int[] f87163Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final int[] f87164Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final boolean[] f87165Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int f87166Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f87167Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f87168Oooo0oo;

    public C25555OooO0oO(Drawable[] drawableArr) {
        super(drawableArr);
        this.f87158Oooo = true;
        if (!(drawableArr.length >= 1)) {
            throw new IllegalStateException("At least one layer required!");
        }
        this.f87157OooOooo = drawableArr;
        int[] iArr = new int[drawableArr.length];
        this.f87163Oooo0O0 = iArr;
        int[] iArr2 = new int[drawableArr.length];
        this.f87164Oooo0OO = iArr2;
        this.f87166Oooo0o0 = 255;
        boolean[] zArr = new boolean[drawableArr.length];
        this.f87165Oooo0o = zArr;
        this.f87167Oooo0oO = 0;
        this.f87160Oooo000 = 2;
        this.f87161Oooo00O = 2;
        Arrays.fill(iArr, 0);
        iArr[0] = 255;
        Arrays.fill(iArr2, 0);
        iArr2[0] = 255;
        Arrays.fill(zArr, false);
        zArr[0] = true;
    }

    public final void OooO0O0() {
        this.f87167Oooo0oO--;
        invalidateSelf();
    }

    public final void OooO0OO() {
        this.f87161Oooo00O = 2;
        for (int i = 0; i < this.f87157OooOooo.length; i++) {
            this.f87164Oooo0OO[i] = this.f87165Oooo0o[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    public final boolean OooO0Oo(float f) {
        boolean z = true;
        for (int i = 0; i < this.f87157OooOooo.length; i++) {
            boolean z2 = this.f87165Oooo0o[i];
            int i2 = (int) (((z2 ? 1 : -1) * 255 * f) + this.f87163Oooo0O0[i]);
            int[] iArr = this.f87164Oooo0OO;
            iArr[i] = i2;
            if (i2 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (z2 && iArr[i] < 255) {
                z = false;
            }
            if (!z2 && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // o00oO0O0.C25551OooO0O0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean zOooO0Oo;
        int i;
        int i2 = this.f87161Oooo00O;
        int[] iArr = this.f87164Oooo0OO;
        Drawable[] drawableArr = this.f87157OooOooo;
        if (i2 == 0) {
            System.arraycopy(iArr, 0, this.f87163Oooo0O0, 0, drawableArr.length);
            this.f87159Oooo0 = SystemClock.uptimeMillis();
            zOooO0Oo = OooO0Oo(this.f87162Oooo00o == 0 ? 1.0f : 0.0f);
            if (!this.f87168Oooo0oo && (i = this.f87160Oooo000) >= 0) {
                boolean[] zArr = this.f87165Oooo0o;
                if (i < zArr.length && zArr[i]) {
                    this.f87168Oooo0oo = true;
                }
            }
            this.f87161Oooo00O = zOooO0Oo ? 2 : 1;
        } else if (i2 != 1) {
            zOooO0Oo = true;
        } else {
            OooOoo0.OooOo00.OooO0o(this.f87162Oooo00o > 0);
            zOooO0Oo = OooO0Oo((SystemClock.uptimeMillis() - this.f87159Oooo0) / this.f87162Oooo00o);
            this.f87161Oooo00O = zOooO0Oo ? 2 : 1;
        }
        for (int i3 = 0; i3 < drawableArr.length; i3++) {
            Drawable drawable = drawableArr[i3];
            int iCeil = (int) Math.ceil(((double) (iArr[i3] * this.f87166Oooo0o0)) / 255.0d);
            if (drawable != null && iCeil > 0) {
                this.f87167Oooo0oO++;
                if (this.f87158Oooo) {
                    drawable.mutate();
                }
                drawable.setAlpha(iCeil);
                this.f87167Oooo0oO--;
                drawable.draw(canvas);
            }
        }
        if (!zOooO0Oo) {
            invalidateSelf();
        } else if (this.f87168Oooo0oo) {
            this.f87168Oooo0oo = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f87166Oooo0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f87167Oooo0oO == 0) {
            super.invalidateSelf();
        }
    }

    @Override // o00oO0O0.C25551OooO0O0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f87166Oooo0o0 != i) {
            this.f87166Oooo0o0 = i;
            invalidateSelf();
        }
    }
}
