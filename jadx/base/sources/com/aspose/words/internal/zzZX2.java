package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZX2 {
    private zzZX6 zz9m;
    private zzZX4 zz9n;

    private zzZX2(zzZX6 zzzx6) {
        this.zz9m = zzzx6;
    }

    public static zzP9 zzR(float f, int i) {
        zzP9 zzp9 = new zzP9();
        zzp9.zzY(f / i, 0);
        return zzp9;
    }

    private zzP8 zzUu() {
        char c;
        char c2 = 0;
        if (this.zz9m.zzoU().getCount() == 0) {
            return new zzP8();
        }
        zzP8 zzp8 = new zzP8();
        zzP5 zzp5 = new zzP5();
        zzZX4 zzzx4ZzSs = this.zz9m.zzoU().zzSs(0);
        this.zz9n = zzzx4ZzSs;
        zzzx4ZzSs.zzoL();
        zzZX4 zzzx4ZzSs2 = this.zz9n;
        zzZQG.zzZ((ArrayList<zzOS>) zzp5.zzNY(), new zzOS(new float[]{this.zz9n.getX(), this.zz9n.getY() * (-1)}));
        int i = 1;
        while (i <= this.zz9m.zzoU().getCount()) {
            zzZX4 zzzx4ZzZ = (i >= this.zz9m.zzoU().getCount() || zzzx4ZzSs2.zzoN()) ? zzZ(this.zz9m.zzoU().zzSs(i)) : this.zz9m.zzoU().zzSs(i);
            if (zzzx4ZzZ.zzoO() || zzzx4ZzZ.zzoM()) {
                c = c2;
                ArrayList<zzOW> arrayListZzNY = zzp5.zzNY();
                float x = zzzx4ZzZ.getX();
                float y = zzzx4ZzZ.getY() * (-1);
                float[] fArr = new float[2];
                fArr[c] = x;
                fArr[1] = y;
                zzZQG.zzZ((ArrayList<zzOS>) arrayListZzNY, new zzOS(fArr));
            } else {
                int i2 = i + 1;
                zzZX4 zzzx4ZzZ2 = (i2 >= this.zz9m.zzoU().getCount() || zzzx4ZzZ.zzoN()) ? zzZ(this.zz9m.zzoU().zzSs(i2)) : this.zz9m.zzoU().zzSs(i2);
                if (zzzx4ZzZ2.zzoO()) {
                    c = c2;
                    zzZQG.zzZ((ArrayList<zzPZ>) zzp5.zzNY(), new zzPZ(zzZPY.zzG(zzzx4ZzSs2.getX(), zzzx4ZzSs2.getY() * (-1)), zzZPY.zzG(zzzx4ZzZ.getX(), zzzx4ZzZ.getY() * (-1)), zzZPY.zzG(zzzx4ZzZ2.getX(), zzzx4ZzZ2.getY() * (-1))));
                    zzzx4ZzSs2 = zzzx4ZzZ;
                    i = i2;
                    zzzx4ZzZ = zzzx4ZzZ2;
                } else {
                    c = c2;
                    int iZzZG = zzAN.zzZG((zzzx4ZzZ2.getX() - zzzx4ZzZ.getX()) / 2.0f);
                    int iZzZG2 = zzAN.zzZG((zzzx4ZzZ2.getY() - zzzx4ZzZ.getY()) / 2.0f);
                    zzZX4 zzzx4 = new zzZX4(iZzZG, iZzZG2, zzzx4ZzZ.getX() + iZzZG, zzzx4ZzZ.getY() + iZzZG2, true, false);
                    zzZQG.zzZ((ArrayList<zzPZ>) zzp5.zzNY(), new zzPZ(zzZPY.zzG(zzzx4ZzSs2.getX(), zzzx4ZzSs2.getY() * (-1)), zzZPY.zzG(zzzx4ZzZ.getX(), zzzx4ZzZ.getY() * (-1)), zzZPY.zzG(zzzx4.getX(), zzzx4.getY() * (-1))));
                    zzzx4ZzSs2 = zzzx4ZzZ;
                    zzzx4ZzZ = zzzx4;
                }
            }
            if (zzzx4ZzSs2.zzoN()) {
                zzZ(zzp5, zzp8);
                zzP5 zzp52 = new zzP5();
                if (i < this.zz9m.zzoU().getCount()) {
                    zzzx4ZzSs2 = this.zz9m.zzoU().zzSs(i);
                    zzp5 = zzp52;
                } else {
                    zzp5 = zzp52;
                    zzzx4ZzSs2 = zzzx4ZzZ;
                }
            } else {
                zzzx4ZzSs2 = zzzx4ZzZ;
            }
            i++;
            c2 = c;
        }
        char c3 = c2;
        if (this.zz9n != null && zzp5.zzNY().size() > 0) {
            ArrayList<zzOW> arrayListZzNY2 = zzp5.zzNY();
            float x2 = this.zz9n.getX();
            float y2 = this.zz9n.getY() * (-1);
            float[] fArr2 = new float[2];
            fArr2[c3] = x2;
            fArr2[1] = y2;
            zzZQG.zzZ((ArrayList<zzOS>) arrayListZzNY2, new zzOS(fArr2));
        }
        if (zzp5.zzNY().size() > 0) {
            zzZ(zzp5, zzp8);
        }
        return zzp8;
    }

    public static zzP8 zzZ(zzZX6 zzzx6) {
        return new zzZX2(zzzx6).zzUu();
    }

    private zzZX4 zzZ(zzZX4 zzzx4) {
        zzZX4 zzzx42 = this.zz9n;
        if (zzzx4 != null) {
            this.zz9n = zzzx4;
            zzzx4.zzoL();
        }
        return zzzx42;
    }

    private static void zzZ(zzP5 zzp5, zzP8 zzp8) {
        zzp5.zze(true);
        zzZQG.zzZ(zzp8.zzO7(), zzp5);
    }
}
