package o0oo000O;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LruCache;
import android.util.Size;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.page.INoteinDisplayItem;
import com.orion.notein.domain.models.page.Page;
import com.orion.penkit.models.DrawResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOO0 f111232OooO00o = new OooOO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final LruCache<String, Matrix> f111233OooO0O0 = new LruCache<>(20);

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f111234OooO00o;

        static {
            int[] iArr = new int[Page.RotationDirection.values().length];
            try {
                iArr[Page.RotationDirection.CLOCKWISE_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Page.RotationDirection.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Page.RotationDirection.CLOCKWISE_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Page.RotationDirection.ROTATION_0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f111234OooO00o = iArr;
        }
    }

    public static ArrayList OooO(Page page, List items) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        kotlin.jvm.internal.OooOOO0.OooO0oO(items, "items");
        List<InterfaceC31284OooO0O0> list = items;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list) {
            arrayList.add(interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId()));
        }
        OooOO0(page, arrayList);
        return arrayList;
    }

    public static ArrayList OooO00o(Page page, List rects) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        kotlin.jvm.internal.OooOOO0.OooO0oO(rects, "rects");
        List list = rects;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RectF((RectF) it.next()));
        }
        Rect rotatedPaperPadding = page.getRotatedPaperPadding();
        if (rotatedPaperPadding.left != 0 || rotatedPaperPadding.top != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((RectF) it2.next()).offset(-rotatedPaperPadding.left, -rotatedPaperPadding.top);
            }
        }
        if (page.getRotationDirection() != Page.RotationDirection.ROTATION_0) {
            Size sizeOooOO0o = OooOO0o(page);
            Matrix matrixOooOO0O = OooOO0O(page.inversePageRotationDirection(), sizeOooOO0o.getWidth(), sizeOooOO0o.getHeight());
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                matrixOooOO0O.mapRect((RectF) it3.next());
            }
        }
        return arrayList;
    }

    public static PointF OooO0O0(Page page, PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        Rect rotatedPaperPadding = page.getRotatedPaperPadding();
        pointF2.offset(-rotatedPaperPadding.left, -rotatedPaperPadding.top);
        if (page.getRotationDirection() != Page.RotationDirection.ROTATION_0) {
            Size sizeOooOO0o = OooOO0o(page);
            Matrix matrixOooOO0O = OooOO0O(page.inversePageRotationDirection(), sizeOooOO0o.getWidth(), sizeOooOO0o.getHeight());
            float[] fArr = {pointF2.x, pointF2.y};
            matrixOooOO0O.mapPoints(fArr);
            pointF2.set(fArr[0], fArr[1]);
        }
        return pointF2;
    }

    public static DrawResult OooO0OO(Page page, DrawResult drawResult) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        DrawResult drawResultDeepCopy = drawResult.deepCopy();
        OooO0Oo(page, OooOo.OooooOO(drawResultDeepCopy.getNewItemList(), drawResultDeepCopy.getRemoveItemList()));
        return drawResultDeepCopy;
    }

    public static void OooO0Oo(Page page, ArrayList arrayList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        Rect rotatedPaperPadding = page.getRotatedPaperPadding();
        if (rotatedPaperPadding.left != 0 || rotatedPaperPadding.top != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC31284OooO0O0) it.next()).offset(-rotatedPaperPadding.left, -rotatedPaperPadding.top);
            }
        }
        if (page.getRotationDirection() != Page.RotationDirection.ROTATION_0) {
            Size sizeOooOO0o = OooOO0o(page);
            Page.RotationDirection rotationDirectionInversePageRotationDirection = page.inversePageRotationDirection();
            Matrix matrixOooOO0O = OooOO0O(rotationDirectionInversePageRotationDirection, sizeOooOO0o.getWidth(), sizeOooOO0o.getHeight());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) it2.next();
                f111232OooO00o.getClass();
                OooOOOo(interfaceC31284OooO0O0, rotationDirectionInversePageRotationDirection, matrixOooOO0O);
            }
        }
    }

    public static ArrayList OooO0o(Page page, List rects) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        kotlin.jvm.internal.OooOOO0.OooO0oO(rects, "rects");
        List list = rects;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RectF((RectF) it.next()));
        }
        if (page.getRotationDirection() != Page.RotationDirection.ROTATION_0) {
            Size sizeOooOOO = OooOOO(page);
            Matrix matrixOooOO0O = OooOO0O(page.getRotationDirection(), sizeOooOOO.getWidth(), sizeOooOOO.getHeight());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                matrixOooOO0O.mapRect((RectF) it2.next());
            }
        }
        Rect rotatedPaperPadding = page.getRotatedPaperPadding();
        if (rotatedPaperPadding.left != 0 || rotatedPaperPadding.top != 0) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((RectF) it3.next()).offset(rotatedPaperPadding.left, rotatedPaperPadding.top);
            }
        }
        return arrayList;
    }

    public static ArrayList OooO0o0(Page page, List list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        List<INoteinDisplayItem> list2 = list;
        ArrayList<INoteinDisplayItem> arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
        for (INoteinDisplayItem iNoteinDisplayItem : list2) {
            arrayList.add(iNoteinDisplayItem.deepCopy(iNoteinDisplayItem.getId(), iNoteinDisplayItem.getLayerId(), iNoteinDisplayItem.getCreationTime()));
        }
        if (page.getRotationDirection() != Page.RotationDirection.ROTATION_0) {
            Size sizeOooOOO = OooOOO(page);
            Matrix matrixOooOO0O = OooOO0O(page.getRotationDirection(), sizeOooOOO.getWidth(), sizeOooOOO.getHeight());
            for (INoteinDisplayItem iNoteinDisplayItem2 : arrayList) {
                Page.RotationDirection rotationDirection = page.getRotationDirection();
                f111232OooO00o.getClass();
                OooOOOO(iNoteinDisplayItem2, rotationDirection, matrixOooOO0O);
            }
        }
        Rect rotatedPaperPadding = page.getRotatedPaperPadding();
        if (rotatedPaperPadding.left != 0 || rotatedPaperPadding.top != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((INoteinDisplayItem) it.next()).offset(rotatedPaperPadding.left, rotatedPaperPadding.top);
            }
        }
        return arrayList;
    }

    public static RectF OooO0oO(Page page, RectF rectF) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rectF, "rectF");
        RectF rectF2 = new RectF(rectF);
        if (page.getRotationDirection() != Page.RotationDirection.ROTATION_0) {
            Size sizeOooOOO = OooOOO(page);
            OooOO0O(page.getRotationDirection(), sizeOooOOO.getWidth(), sizeOooOOO.getHeight()).mapRect(rectF2);
        }
        Rect rotatedPaperPadding = page.getRotatedPaperPadding();
        int i = rotatedPaperPadding.left;
        if (i == 0 && rotatedPaperPadding.top == 0) {
            return rectF2;
        }
        rectF2.offset(i, rotatedPaperPadding.top);
        return rectF2;
    }

    public static DrawResult OooO0oo(Page page, DrawResult drawResult) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        kotlin.jvm.internal.OooOOO0.OooO0oO(drawResult, "drawResult");
        DrawResult drawResultDeepCopy = drawResult.deepCopy();
        OooOO0(page, OooOo.OooooOO(drawResultDeepCopy.getNewItemList(), drawResultDeepCopy.getRemoveItemList()));
        return drawResultDeepCopy;
    }

    public static void OooOO0(Page page, ArrayList arrayList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        if (page.getRotationDirection() != Page.RotationDirection.ROTATION_0) {
            Size sizeOooOOO = OooOOO(page);
            Matrix matrixOooOO0O = OooOO0O(page.getRotationDirection(), sizeOooOOO.getWidth(), sizeOooOOO.getHeight());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) it.next();
                Page.RotationDirection rotationDirection = page.getRotationDirection();
                f111232OooO00o.getClass();
                OooOOOo(interfaceC31284OooO0O0, rotationDirection, matrixOooOO0O);
            }
        }
        Rect rotatedPaperPadding = page.getRotatedPaperPadding();
        if (rotatedPaperPadding.left == 0 && rotatedPaperPadding.top == 0) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC31284OooO0O0) it2.next()).offset(rotatedPaperPadding.left, rotatedPaperPadding.top);
        }
    }

    public static Matrix OooOO0O(Page.RotationDirection rotation, float f, float f2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rotation, "rotation");
        if (rotation == Page.RotationDirection.ROTATION_0) {
            return new Matrix();
        }
        String str = rotation.name() + C18115b5.CONNECTOR + f + C18115b5.CONNECTOR + f2;
        LruCache<String, Matrix> lruCache = f111233OooO0O0;
        Matrix matrix = lruCache.get(str);
        if (matrix == null) {
            matrix = new Matrix();
            float f3 = f / 2.0f;
            float f4 = f2 / 2.0f;
            int i = OooO00o.f111234OooO00o[rotation.ordinal()];
            if (i == 1) {
                matrix.postRotate(90.0f, f3, f4);
                matrix.postTranslate((f2 - f) / 2.0f, (f - f2) / 2.0f);
            } else if (i == 2) {
                matrix.postRotate(180.0f, f3, f4);
            } else if (i == 3) {
                matrix.postRotate(270.0f, f3, f4);
                matrix.postTranslate((f2 - f) / 2.0f, (f - f2) / 2.0f);
            } else if (i != 4) {
                throw new C32442OooOO0o();
            }
            lruCache.put(str, matrix);
        }
        return matrix;
    }

    public static Size OooOO0o(Page page) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        C32443OooOOO<Integer, Integer> rotatedPageSize = page.getRotatedPageSize();
        Rect rotatedPaperPadding = page.getRotatedPaperPadding();
        return new Size((rotatedPageSize.f116638OooOo0o.intValue() - rotatedPaperPadding.left) - rotatedPaperPadding.right, (rotatedPageSize.f116637OooOo.intValue() - rotatedPaperPadding.top) - rotatedPaperPadding.bottom);
    }

    public static Size OooOOO(Page page) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(page, "page");
        C32443OooOOO<Integer, Integer> unrotatedPageSize = page.getUnrotatedPageSize();
        Rect unrotatedPaperPadding = page.getUnrotatedPaperPadding();
        return new Size((unrotatedPageSize.f116638OooOo0o.intValue() - unrotatedPaperPadding.left) - unrotatedPaperPadding.right, (unrotatedPageSize.f116637OooOo.intValue() - unrotatedPaperPadding.top) - unrotatedPaperPadding.bottom);
    }

    public static float OooOOO0(Page.RotationDirection rotation) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(rotation, "rotation");
        int i = OooO00o.f111234OooO00o[rotation.ordinal()];
        if (i == 1) {
            return 90.0f;
        }
        if (i == 2) {
            return 180.0f;
        }
        if (i == 3) {
            return 270.0f;
        }
        if (i == 4) {
            return 0.0f;
        }
        throw new C32442OooOO0o();
    }

    public static void OooOOOO(INoteinDisplayItem iNoteinDisplayItem, Page.RotationDirection rotationDirection, Matrix matrix) {
        if (rotationDirection == Page.RotationDirection.ROTATION_0) {
            return;
        }
        RectF boundingBox = iNoteinDisplayItem.getBoundingBox(1.0f);
        float[] fArr = {0.0f, 0.0f};
        matrix.mapPoints(fArr, new float[]{boundingBox.centerX(), boundingBox.centerY()});
        iNoteinDisplayItem.offset(fArr[0] - boundingBox.centerX(), fArr[1] - boundingBox.centerY());
        float fOooOOO0 = OooOOO0(rotationDirection);
        if (fOooOOO0 == 0.0f) {
            return;
        }
        RectF boundingBox2 = iNoteinDisplayItem.getBoundingBox(1.0f);
        iNoteinDisplayItem.rotate(fOooOOO0, new PointF(boundingBox2.centerX(), boundingBox2.centerY()));
    }

    public static void OooOOOo(InterfaceC31284OooO0O0 interfaceC31284OooO0O0, Page.RotationDirection rotationDirection, Matrix matrix) {
        if (rotationDirection == Page.RotationDirection.ROTATION_0) {
            return;
        }
        RectF boundingBox = interfaceC31284OooO0O0.getBoundingBox(1.0f);
        float[] fArr = {0.0f, 0.0f};
        matrix.mapPoints(fArr, new float[]{boundingBox.centerX(), boundingBox.centerY()});
        interfaceC31284OooO0O0.offset(fArr[0] - boundingBox.centerX(), fArr[1] - boundingBox.centerY());
        float fOooOOO0 = OooOOO0(rotationDirection);
        if (fOooOOO0 == 0.0f) {
            return;
        }
        RectF boundingBox2 = interfaceC31284OooO0O0.getBoundingBox(1.0f);
        interfaceC31284OooO0O0.rotate(fOooOOO0, new PointF(boundingBox2.centerX(), boundingBox2.centerY()));
    }
}
