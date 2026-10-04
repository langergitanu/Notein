package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zza {
    public static Rect zza(List list) {
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
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    public static List zzb(com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar) {
        Point[] pointArr = new Point[4];
        double dSin = Math.sin(Math.toRadians(zzfVar.zze));
        double dCos = Math.cos(Math.toRadians(zzfVar.zze));
        pointArr[0] = new Point(zzfVar.zza, zzfVar.zzb);
        double d = zzfVar.zza;
        double d2 = zzfVar.zzc;
        Point point = new Point((int) (d + (d2 * dCos)), (int) ((d2 * dSin) + ((double) zzfVar.zzb)));
        pointArr[1] = point;
        double d3 = point.x;
        int i = zzfVar.zzd;
        pointArr[2] = new Point((int) (d3 - (((double) i) * dSin)), (int) ((((double) i) * dCos) + ((double) pointArr[1].y)));
        Point point2 = pointArr[0];
        int i2 = point2.x;
        Point point3 = pointArr[2];
        int i3 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point((i3 - point4.x) + i2, (point3.y - point4.y) + point2.y);
        return Arrays.asList(pointArr);
    }
}
