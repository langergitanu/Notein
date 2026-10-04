package com.google.mlkit.vision.text.pipeline;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zbf {
    public static Rect zba(List list, Matrix matrix) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        RectF rectF = new RectF(iMin, iMin2, iMax, iMax2);
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    public static zbpb zbb(zbaaj zbaajVar) {
        return zbaajVar.zbi() ? zbaajVar.zbc().zbd() : zbaajVar.zbH() ? zbaajVar.zbf().zbc() : zbaajVar.zbe();
    }

    public static List zbc(zbpb zbpbVar) {
        double dSin = Math.sin(Math.toRadians(zbpbVar.zba()));
        double dCos = Math.cos(Math.toRadians(zbpbVar.zba()));
        Point point = new Point((int) (((double) zbpbVar.zbd()) + (((double) zbpbVar.zbf()) * dCos)), (int) ((((double) zbpbVar.zbf()) * dSin) + ((double) zbpbVar.zbe())));
        double d = point.x;
        double dZbc = ((double) zbpbVar.zbc()) * dSin;
        double dZbc2 = (((double) zbpbVar.zbc()) * dCos) + ((double) pointArr[1].y);
        Point point2 = pointArr[0];
        int i = point2.x;
        Point point3 = pointArr[2];
        int i2 = point3.x;
        Point point4 = pointArr[1];
        Point[] pointArr = {new Point(zbpbVar.zbd(), zbpbVar.zbe()), point, new Point((int) (d - dZbc), (int) dZbc2), new Point((i2 - point4.x) + i, (point3.y - point4.y) + point2.y)};
        return Arrays.asList(pointArr);
    }
}
