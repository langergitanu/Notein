package com.aspose.words.internal;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Region;
import java.io.Closeable;
import java.util.Stack;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJ8 extends zzZ5 implements Closeable {
    public static final Paint zzza = new Paint(5);
    private zzF4 zzv;
    private final zzZ9 zzz9;
    private zzZQ4 zzzb;
    private boolean zzzc;
    private final zzIX zzzd;
    private boolean zzze;
    private final boolean zzzf;
    private final zz6H zzzg;
    private final zzIZ zzzh;
    private final zzEH zzzi;
    private zz0I zzzj;
    private zzA2 zzzk;
    private zzA6 zzzl;
    private final Stack<Matrix> zzzm;
    private Canvas zzzn;

    public zzJ8(zzH6 zzh6) {
        this(zzh6.zzHq(), zzZ(zzh6), null);
    }

    private boolean zzC(zzZQ4 zzzq4) {
        return !this.zzzb.zza(zzAL.zzZ(this.zzzn.getMatrix()).zzO(zzzq4));
    }

    private void zzGY() {
        zzEH zzeh = this.zzzi;
        if (zzeh != null) {
            zzeh.close();
        }
        zzIZ zziz = this.zzzh;
        if (zziz != null) {
            zziz.close();
        }
        zz6H zz6h = this.zzzg;
        if (zz6h != null) {
            zz6h.close();
        }
    }

    private void zzN(String str, String str2) {
        this.zzv.zzZ(3, 6, str, str2);
    }

    private void zzR(zzHU zzhu) {
        zzU(zzZT.zzV(zzhu) && !this.zzzm.isEmpty(), zzZT.zzU(zzhu));
    }

    private void zzT(zzHU zzhu) {
        zzZ(zzhu, zzZT.zzV(zzhu), zzZT.zzU(zzhu));
    }

    private void zzU(zzZU zzzu) {
        zzZ(zzzu, true, zzZT.zzU(zzzu));
    }

    private static zzA6 zzZ(zzH6 zzh6) {
        zzA6 zza6 = new zzA6(zzh6);
        zza6.setRenderingMode(1);
        return zza6;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzGY();
    }

    public final void dispose() {
        zzGY();
    }

    public final void zzGZ() {
        this.zzzc = true;
    }

    public final void zzH0() {
        this.zzze = false;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzY(zzG zzg) {
        zzR(zzg);
    }

    public zzJ8(zzF4 zzf4, zzA6 zza6) {
        this(zzf4, zza6, null);
    }

    private void zzU(boolean z, boolean z2) {
        if (z2) {
            this.zzzn.restore();
        }
        if (z) {
            this.zzzn.setMatrix(this.zzzm.pop());
        }
    }

    public zzJ8(zzF4 zzf4, zzA6 zza6, zzIX zzix) {
        this.zzzm = new Stack<>();
        this.zzze = true;
        this.zzzc = false;
        this.zzzb = zzZQ4.zzX(-1.0737418E9f, -1.0737418E9f, 1.073742E9f, 1.073742E9f);
        zzZ9 zzz9 = new zzZ9();
        this.zzz9 = zzz9;
        this.zzv = zzf4 == null ? zz7M.zznW : zzf4;
        this.zzzl = zza6;
        this.zzzk = new zzA2(zza6);
        this.zzzd = zzix;
        zzZ(zzz9);
        this.zzzf = this.zzzl.zzAs() && this.zzzl.zzMk() != null;
        this.zzzi = new zzEH(this.zzze, zza6.zzMk());
        this.zzzh = new zzIZ(zza6.zzMk(), this.zzv);
        this.zzzg = new zz6H();
    }

    public final void zzZ(zzZL zzzl, zzIY zziy) throws Exception {
        if (zzzl == null) {
            throw new NullPointerException("node");
        }
        if (zziy != null) {
            zzZ(zzzl, zziy.zzGH());
            return;
        }
        throw new NullPointerException("graphics");
    }

    private void zzT(zzZU zzzu) {
        zzU(true, zzZT.zzU(zzzu));
    }

    private void zzZ(zzZL zzzl, Canvas canvas) {
        zz0I zz0i;
        if (zzzl == null) {
            throw new NullPointerException("node");
        }
        if (canvas != null) {
            this.zzzn = canvas;
            zzG zzg = new zzG();
            zzg.zzW(new zzP9(1.3333334f, 0.0f, 0.0f, 1.3333334f, 0.0f, 0.0f));
            zz7 zz7VarZzZ5 = zzzl.zzZ5();
            zzg.zzX(zzzl);
            this.zzzj = new zz0I();
            try {
                try {
                    zzg.zzZ(zzYJ());
                    zz0i = this.zzzj;
                } catch (Exception e) {
                    zzZHV.zzZ(e);
                    zz0i = this.zzzj;
                    if (zz0i != null) {
                    }
                }
                if (zz0i != null) {
                    zz0i.dispose();
                    this.zzzj = null;
                }
                zzzl.zzV(zz7VarZzZ5);
            } finally {
            }
        } else {
            throw new NullPointerException("graphics");
        }
    }

    public final long zzZ(zzZL zzzl, long j, Canvas canvas, float f, float f2, float f3) {
        if (zzzl == null) {
            throw new IllegalArgumentException("ApsNode cannot be null");
        }
        if (canvas == null) {
            throw new IllegalArgumentException("Graphics cannot be null");
        }
        if (f3 > 0.0f) {
            Matrix matrixZzZ = zzZ(canvas, f, f2, f3);
            Matrix matrix = canvas.getMatrix();
            canvas.setMatrix(matrixZzZ);
            zzZ(zzzl, canvas);
            canvas.setMatrix(matrix);
            long jZzG = zzZPY.zzG(Float.intBitsToFloat((int) j), zzZPW.zzYz(j));
            float f4 = f3 * 1.3333334f;
            return zzZPW.zzG(Float.intBitsToFloat((int) jZzG) * f4, zzZPY.zzYC(jZzG) * f4);
        }
        throw new IllegalArgumentException("Scale cannot be less or equal 0");
    }

    private static Matrix zzZ(Canvas canvas, float f, float f2, float f3) {
        Matrix matrix = new Matrix(canvas.getMatrix());
        matrix.preTranslate(f, f2);
        matrix.preScale(f3, f3);
        return matrix;
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) throws Exception {
        if (zzzu.isHidden()) {
            return;
        }
        if (zzPV.zzZ(zzzu.zzZy(), zzPV.zzHZ) && zzPV.zzZ(zzzu.zzZq(), zzPV.zzHZ)) {
            return;
        }
        zzU(zzzu);
        if (zzC(zzzu.zzZj())) {
            zzT(zzzu);
            return;
        }
        this.zzzh.zzZ(this.zzzn, zzzu, this.zzzj);
        zzT(zzzu);
        if (zzzu.zzZr().zzPl().zzHG()) {
            zzN("GDI+ doesn't support OpenType fonts with PostScript outlines. '{0}' font has been substituted.", zzzu.zzZr().zzPl().zzPh());
        }
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) {
        zzT(zzg);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        zzZG zzzg2;
        zzT(zzzg);
        zzZQ8 zzzq8ZzE = zz6K.zzE(zzzg.zzZ0());
        zzZQ4 zzzq4ZzZ = zzZQ4.zzZ(zzZQ8.zzZ(zzzq8ZzE, true));
        if (zzC(zzzq4ZzZ)) {
            zzzg2 = zzzg;
        } else {
            zzzg2 = zzzg;
            this.zzzg.zzZ(this.zzzn, zzzg2, zzzq8ZzE, this.zzzc, zzzq4ZzZ);
        }
        zzR(zzzg2);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZP zzzp) throws Exception {
        if (zzC(zzzp.zzZj())) {
            return;
        }
        if (this.zzzf && zzEF.zzVW(zzzp.getImageType())) {
            this.zzzi.zzZ(this.zzzn, zzzp, zzYJ(), this.zzzk, this.zzz9.zzYP());
        } else {
            this.zzzi.zzZ(this.zzzn, zzzp);
        }
    }

    private void zzZ(zzHU zzhu, boolean z, boolean z2) {
        if (z) {
            try {
                Matrix matrixZzG = zzAL.zzG(zzhu.zzZO() == null ? new zzP9() : zzhu.zzZO());
                this.zzzm.add(this.zzzn.getMatrix());
                this.zzzn.concat(matrixZzG);
            } catch (Throwable unused) {
            }
        }
        if (z2) {
            try {
                this.zzzn.save();
                this.zzzn.clipPath(zz6K.zzE(zzhu.zzZN()), Region.Op.INTERSECT);
            } catch (Throwable unused2) {
            }
        }
    }

    public final float zzZ(zzZL zzzl, long j, Canvas canvas, float f, float f2, float f3, float f4) {
        if (zzzl == null) {
            throw new IllegalArgumentException("Node cannot be null");
        }
        if (canvas == null) {
            throw new IllegalArgumentException("Graphics cannot be null");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("width cannot be less or equal 0");
        }
        if (f4 > 0.0f) {
            Matrix matrixZzZ = zzZ(canvas, f, f2, Math.min(f3 / Float.intBitsToFloat((int) j), f4 / zzZPW.zzYz(j)));
            matrixZzZ.preScale(0.75f, 0.75f);
            Matrix matrix = canvas.getMatrix();
            canvas.setMatrix(matrixZzZ);
            zzZ(zzzl, canvas);
            canvas.setMatrix(matrix);
            float[] fArr = new float[9];
            matrixZzZ.getValues(fArr);
            return Math.min(fArr[0], fArr[4]);
        }
        throw new IllegalArgumentException("height cannot be less or equal 0");
    }
}
