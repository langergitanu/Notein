package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.n2 */
/* JADX INFO: loaded from: classes3.dex */
class C14164n2 {
    /* JADX INFO: renamed from: k4 */
    public static boolean m67853k4(int i) {
        return i == 27 || i == 30;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m67855kk(int i) {
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: to */
    public static boolean m67857to(int i) {
        return i == 6 || i == 10 || i == 14 || i == 18;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67858x1(int i) {
        if (i == 33) {
            return true;
        }
        switch (i) {
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                return true;
            default:
                return false;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: k4 */
    public static boolean m67854k4(com.aspose.slides.Chart r4) {
        /*
            int r0 = r4.getType()
            boolean r1 = com.aspose.slides.ChartTypeCharacterizer.is3DChart(r0)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            com.aspose.slides.IRotation3D r4 = r4.getRotation3D()
            int r1 = r4.getRotationY()
            r3 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            if (r1 != 0) goto L21
            byte r4 = r4.getRotationX()
            if (r4 != 0) goto L21
            return r2
        L21:
            r4 = 25
            if (r0 == r4) goto L34
            r4 = 33
            if (r0 == r4) goto L34
            r4 = 62
            if (r0 == r4) goto L34
            switch(r0) {
                case 3: goto L34;
                case 4: goto L34;
                case 5: goto L34;
                case 6: goto L34;
                case 7: goto L34;
                case 8: goto L34;
                case 9: goto L34;
                case 10: goto L34;
                case 11: goto L34;
                case 12: goto L34;
                case 13: goto L34;
                case 14: goto L34;
                case 15: goto L34;
                case 16: goto L34;
                case 17: goto L34;
                case 18: goto L34;
                default: goto L30;
            }
        L30:
            switch(r0) {
                case 36: goto L34;
                case 37: goto L34;
                case 38: goto L34;
                case 39: goto L34;
                case 40: goto L34;
                case 41: goto L34;
                case 42: goto L34;
                case 43: goto L34;
                case 44: goto L34;
                case 45: goto L34;
                case 46: goto L34;
                default: goto L33;
            }
        L33:
            return r2
        L34:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aspose.slides.C14164n2.m67854k4(com.aspose.slides.Chart):boolean");
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m67856kk(Chart chart) {
        int type = chart.getType();
        if (type != 6 && type != 10 && type != 14 && type != 18 && type != 25) {
            if (type == 33) {
                return chart.getAxes().getSeriesAxis() != null && chart.getAxes().getSeriesAxis().isVisible();
            }
            if (type != 50 && type != 62) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m67859x1(Chart chart) {
        if (chart != null) {
            return chart.getType() == 62;
        }
        throw new ArgumentNullException("chart is null");
    }
}
