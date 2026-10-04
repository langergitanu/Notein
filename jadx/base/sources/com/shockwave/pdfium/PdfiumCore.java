package com.shockwave.pdfium;

import OooooOo.C21385OooOOOO;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.aspose.words.WarningType;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.util.PdfText;
import com.shockwave.pdfium.util.PointFUtils;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public class PdfiumCore {
    private static final Class FD_CLASS = FileDescriptor.class;
    private static final String FD_FIELD_NAME = "descriptor";
    private static final int SUBTYPE_TEXT = 1;
    private static final String TAG = "com.shockwave.pdfium.PdfiumCore";
    private static final Object lock;
    private static Field mFdField;
    private int mCurrentDpi;

    static {
        try {
            System.loadLibrary("absl.cr");
            System.loadLibrary("c++_chrome.cr");
            System.loadLibrary("chrome_zlib.cr");
            System.loadLibrary("icuuc.cr");
            System.loadLibrary("partition_alloc.cr");
            System.loadLibrary("pdfium.cr");
            System.loadLibrary("jniPdfium");
        } catch (UnsatisfiedLinkError e) {
            Log.e(TAG, "Native libraries failed to load - " + e);
        }
        lock = new Object();
        mFdField = null;
    }

    public PdfiumCore(int i) {
        this.mCurrentDpi = i;
    }

    private void createBookmarkRecursive(long j, long j2, PdfDocument.Bookmark bookmark) {
        long jNativeCreateBookmark = nativeCreateBookmark(j, j2, bookmark.getTitle(), (int) bookmark.pageIdx);
        Iterator<PdfDocument.Bookmark> it = bookmark.getChildren().iterator();
        while (it.hasNext()) {
            createBookmarkRecursive(j, jNativeCreateBookmark, it.next());
        }
    }

    private long ensurePagePtr(PdfDocument pdfDocument, int i) {
        Long lValueOf = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
        if (lValueOf == null) {
            lValueOf = Long.valueOf(openPage(pdfDocument, i));
        }
        return lValueOf.longValue();
    }

    public static int getNumFd(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            if (mFdField == null) {
                Field declaredField = FD_CLASS.getDeclaredField(FD_FIELD_NAME);
                mFdField = declaredField;
                declaredField.setAccessible(true);
            }
            return mFdField.getInt(parcelFileDescriptor.getFileDescriptor());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createRoundRect$1(PointF pointF, float f, PointF pointF2) {
        pointF2.set(PointFUtils.calculateRotatedPoint(pointF2, pointF, -f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createRoundRect$2(PointF pointF, float f, PointF pointF2) {
        pointF2.set(PointFUtils.calculateRotatedPoint(pointF2, pointF, -f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getPageContent$0(int i, int i2, int i3, PdfText pdfText) {
        pdfText.setBounds(mapRectWithPageRotation(pdfText.getBounds(), i, i2, i3));
    }

    private RectF mapRectWithPageRotation(RectF rectF, int i, int i2, int i3) {
        RectF rectF2 = new RectF();
        Matrix matrix = new Matrix();
        if (i == 1) {
            matrix.postRotate(-90.0f, 0.0f, 0.0f);
            matrix.postTranslate(0.0f, i3);
            matrix.mapRect(rectF2, rectF);
            return rectF2;
        }
        if (i == 2) {
            matrix.postRotate(-180.0f, 0.0f, 0.0f);
            matrix.postTranslate(i2, i3);
            matrix.mapRect(rectF2, rectF);
            return rectF2;
        }
        if (i != 3) {
            rectF2.set(rectF);
            return rectF;
        }
        matrix.postRotate(-270.0f, 0.0f, 0.0f);
        matrix.postTranslate(i2, 0.0f);
        matrix.mapRect(rectF2, rectF);
        return rectF2;
    }

    private static native void nativeAnnotSetColor(long j, float f, float f2, float f3);

    private static native boolean nativeAnnotSetString(long j, String str, String str2);

    private native void nativeCloseDocument(long j);

    private native void nativeClosePage(long j);

    private native void nativeClosePages(long[] jArr);

    private static native long nativeCreateAnnot(long j, int i);

    private native long nativeCreateBookmark(long j, long j2, String str, int i);

    private native long nativeCreateDocument();

    private native long nativeCreateImage(long j, long[] jArr, Bitmap bitmap, double d, double d2, double d3, double d4, double d5, double d6);

    private native long nativeCreatePage(long j, int i, double d, double d2);

    private native long nativeCreatePageLink(long j, long j2, float f, float f2, float f3, float f4, int i);

    private native long nativeCreatePath(float f, float f2);

    private native long nativeCreateRect(float f, float f2, float f3, float f4);

    private native long nativeCreateURLLink(long j, float f, float f2, float f3, float f4, String str);

    private native void nativeGenerateContent(long j);

    private static native long nativeGetAnnotByIndex(long j, int i);

    private native long nativeGetAnnotByPageLink(long j, long j2);

    private static native int nativeGetAnnotCount(long j);

    private static native int nativeGetAnnotIndex(long j, long j2);

    private native RectF nativeGetAnnotationRect(long j);

    private native long nativeGetBookmarkDestIndex(long j, long j2);

    private native String nativeGetBookmarkTitle(long j);

    private native int nativeGetCharIndexAtPos(long j, float f, float f2, float f3, float f4);

    private native Integer nativeGetDestPageIndex(long j, long j2);

    private native String nativeGetDocumentMetaText(long j, String str);

    private native Long nativeGetFirstChildBookmark(long j, Long l);

    private native RectF nativeGetLinkRect(long j);

    private native String nativeGetLinkURI(long j, long j2);

    private native PdfText[] nativeGetPageContent(long j);

    private native int nativeGetPageCount(long j);

    private native RectF nativeGetPageCropBox(long j);

    private native int nativeGetPageHeightPixel(long j, int i);

    private native int nativeGetPageHeightPoint(long j);

    private native long[] nativeGetPageLinks(long j);

    private native RectF nativeGetPageMediaBox(long j);

    private native SizeF nativeGetPageOffset(long j);

    private native int nativeGetPageRotation(long j);

    private native Size nativeGetPageSizeByIndex(long j, int i, int i2);

    private native int nativeGetPageWidthPixel(long j, int i);

    private native int nativeGetPageWidthPoint(long j);

    private native RectF[] nativeGetRects(long j, int i, int i2);

    private native Long nativeGetSiblingBookmark(long j, long j2);

    private static native int nativeGetSubtype(long j);

    private native String nativeGetText(long j, int i, int i2);

    private native boolean nativeImportPage(long j, long j2, int i, int i2);

    private native long nativeLoadPage(long j, int i);

    private native long[] nativeLoadPages(long j, int i, int i2);

    private static native void nativeLogRedirectToAndroidLogStatic();

    private native long nativeOpenDocument(int i, String str);

    private native long nativeOpenMemDocument(byte[] bArr, String str);

    private native Point nativePageCoordsToDevice(long j, int i, int i2, int i3, int i4, int i5, double d, double d2);

    private native void nativePageInsertObject(long j, long j2);

    private native boolean nativePathBezierTo(long j, float f, float f2, float f3, float f4, float f5, float f6);

    private native boolean nativePathClose(long j);

    private native boolean nativePathLineTo(long j, float f, float f2);

    private native boolean nativePathMoveTo(long j, float f, float f2);

    private native boolean nativePathSetDrawMode(long j, int i, int i2);

    private static native boolean nativeRemoveAnnotByIndex(long j, int i);

    private static native boolean nativeRemoveAnnotPopup(long j);

    private native void nativeRenderPage(long j, Surface surface, int i, int i2, int i3, int i4, int i5, boolean z);

    private native void nativeRenderPageBitmap(long j, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, boolean z);

    private native boolean nativeSaveDocument(long j, int i);

    private native int[] nativeSearch(long j, String str);

    private native boolean nativeSetBlendMode(long j, String str);

    private native boolean nativeSetDashArray(long j, float[] fArr, float f);

    private native void nativeSetFillColor(long j, int i, int i2, int i3, int i4);

    private native boolean nativeSetLineCap(long j, int i);

    private native boolean nativeSetLineJoin(long j, int i);

    private native boolean nativeSetLinkPageIndex(long j, long j2, int i);

    private native void nativeSetPageMargins(long j, float f, float f2, float f3, float f4);

    private native void nativeSetPageRotation(long j, int i);

    private native boolean nativeSetStrokeColor(long j, int i, int i2, int i3, int i4);

    private native boolean nativeSetStrokeWidth(long j, float f);

    private native void nativeTransform(long j, float f, float f2, float f3, float f4, float f5, float f6);

    private native boolean nativeUpdateAnnotationRect(long j, float f, float f2, float f3, float f4);

    private void recursiveGetBookmark(List<PdfDocument.Bookmark> list, PdfDocument pdfDocument, long j, Set<Long> set) {
        long jLongValue = j;
        while (jLongValue != 0 && !set.contains(Long.valueOf(jLongValue))) {
            set.add(Long.valueOf(jLongValue));
            PdfDocument.Bookmark bookmark = new PdfDocument.Bookmark();
            bookmark.mNativePtr = jLongValue;
            bookmark.title = nativeGetBookmarkTitle(jLongValue);
            bookmark.pageIdx = nativeGetBookmarkDestIndex(pdfDocument.mNativeDocPtr, jLongValue);
            list.add(bookmark);
            Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.mNativeDocPtr, Long.valueOf(jLongValue));
            if (lNativeGetFirstChildBookmark != null && lNativeGetFirstChildBookmark.longValue() != 0) {
                recursiveGetBookmark(bookmark.getChildren(), pdfDocument, lNativeGetFirstChildBookmark.longValue(), set);
            }
            Long lNativeGetSiblingBookmark = nativeGetSiblingBookmark(pdfDocument.mNativeDocPtr, jLongValue);
            if (lNativeGetSiblingBookmark == null || lNativeGetSiblingBookmark.longValue() == 0) {
                return;
            } else {
                jLongValue = lNativeGetSiblingBookmark.longValue();
            }
        }
    }

    public static PointF rotate(PointF pointF, PointF pointF2, float f) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = pointF2.x;
        float f5 = pointF2.y;
        double radians = Math.toRadians(f);
        double d = f2 - f4;
        double d2 = f3 - f5;
        return new PointF((float) (((Math.cos(radians) * d) - (Math.sin(radians) * d2)) + ((double) f4)), (float) (C21385OooOOOO.OooO0O0(radians, d2, Math.sin(radians) * d) + ((double) f5)));
    }

    public void closeDocument(PdfDocument pdfDocument) {
        synchronized (lock) {
            try {
                Iterator<Integer> it = pdfDocument.mNativePagesPtr.keySet().iterator();
                while (it.hasNext()) {
                    nativeClosePage(pdfDocument.mNativePagesPtr.get(it.next()).longValue());
                }
                pdfDocument.mNativePagesPtr.clear();
                nativeCloseDocument(pdfDocument.mNativeDocPtr);
                ParcelFileDescriptor parcelFileDescriptor = pdfDocument.parcelFileDescriptor;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    pdfDocument.parcelFileDescriptor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void closePage(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l != null) {
                    nativeClosePage(l.longValue());
                    pdfDocument.mNativePagesPtr.remove(Integer.valueOf(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void closePages(PdfDocument pdfDocument, List<Integer> list) {
        synchronized (lock) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Integer num : list) {
                    Long l = pdfDocument.mNativePagesPtr.get(num);
                    if (l != null) {
                        arrayList.add(l);
                        pdfDocument.mNativePagesPtr.remove(num);
                    }
                }
                long[] jArr = new long[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    jArr[i] = ((Long) arrayList.get(i)).longValue();
                }
                nativeClosePages(jArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long createBookmark(PdfDocument pdfDocument, long j, String str, int i) throws Throwable {
        synchronized (this) {
            try {
                try {
                    return nativeCreateBookmark(pdfDocument.mNativeDocPtr, j, str, i);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public boolean createBookmarks(PdfDocument pdfDocument, List<PdfDocument.Bookmark> list) {
        long j = pdfDocument.mNativeDocPtr;
        Iterator<PdfDocument.Bookmark> it = list.iterator();
        while (it.hasNext()) {
            createBookmarkRecursive(j, 0L, it.next());
        }
        return true;
    }

    public long createCircle(float f, float f2, float f3) {
        long jCreatePath;
        synchronized (lock) {
            float f4 = f - f3;
            jCreatePath = createPath(f4, f2);
            float f5 = 0.5522848f * f3;
            float f6 = f2 + f5;
            float f7 = f - f5;
            float f8 = f2 + f3;
            pathCubicTo(jCreatePath, f4, f6, f7, f8, f, f8);
            float f9 = f + f5;
            float f10 = f + f3;
            pathCubicTo(jCreatePath, f9, f8, f10, f6, f10, f2);
            float f11 = f2 - f5;
            float f12 = f2 - f3;
            pathCubicTo(jCreatePath, f10, f11, f9, f12, f, f12);
            pathCubicTo(jCreatePath, f7, f12, f4, f11, f4, f2);
        }
        return jCreatePath;
    }

    public PdfDocument createDocument() {
        PdfDocument pdfDocument = new PdfDocument();
        synchronized (lock) {
            pdfDocument.mNativeDocPtr = nativeCreateDocument();
        }
        return pdfDocument;
    }

    public long createEllipse(long j, float f, float f2, float f3, float f4, float f5) {
        return createRoundRect(j, f, f2, f3, f4, (f3 - f) / 2.0f, (f2 - f4) / 2.0f, f5);
    }

    public long createImg(PdfDocument pdfDocument, int i, Bitmap bitmap, RectF rectF, float f) {
        long jCreateImg;
        synchronized (lock) {
            jCreateImg = createImg(pdfDocument, i, bitmap, rectF.left, rectF.top, rectF.right, rectF.bottom, f);
        }
        return jCreateImg;
    }

    public long createPage(PdfDocument pdfDocument, int i, int i2, int i3) {
        long jNativeCreatePage;
        synchronized (lock) {
            jNativeCreatePage = nativeCreatePage(pdfDocument.mNativeDocPtr, i, i2, i3);
            pdfDocument.mNativePagesPtr.put(Integer.valueOf(i), Long.valueOf(jNativeCreatePage));
        }
        return jNativeCreatePage;
    }

    public boolean createPageLink(PdfDocument pdfDocument, int i, RectF rectF, int i2) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    long jOpenPage = openPage(pdfDocument, i);
                    Long lValueOf = Long.valueOf(jOpenPage);
                    if (jOpenPage == 0) {
                        return false;
                    }
                    l = lValueOf;
                }
                Log.d("PdfiumAndroid", "createPageLink begin: " + l + " " + i2);
                Long l2 = l;
                long jNativeCreatePageLink = nativeCreatePageLink(pdfDocument.mNativeDocPtr, l2.longValue(), rectF.left, rectF.top, rectF.right, rectF.bottom, i2);
                Log.d("PdfiumAndroid", "createPageLink end: " + l2 + " " + i2);
                return jNativeCreatePageLink != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long createPath(float f, float f2) {
        long jNativeCreatePath;
        synchronized (lock) {
            jNativeCreatePath = nativeCreatePath(f, f2);
        }
        return jNativeCreatePath;
    }

    public long createRect(float f, float f2, float f3, float f4) {
        long jNativeCreateRect;
        synchronized (lock) {
            jNativeCreateRect = nativeCreateRect(f, f2, f3, f4);
        }
        return jNativeCreateRect;
    }

    public long createRoundRect(long j, float f, float f2, float f3, float f4, float f5, float f6, final float f7) {
        long j2;
        synchronized (lock) {
            float f8 = f3 - f;
            float f9 = f2 - f4;
            float f10 = f8 - (f5 * 2.0f);
            float f11 = f9 - (f6 * 2.0f);
            try {
                PointF pointF = new PointF(f + f5, f2);
                PointF pointF2 = new PointF(pointF.x + f10, pointF.y);
                PointF pointF3 = new PointF(f3, f2 - f6);
                PointF pointF4 = new PointF(pointF3.x, pointF3.y - f11);
                PointF pointF5 = new PointF(f3 - f5, f4);
                PointF pointF6 = new PointF(pointF5.x - f10, pointF5.y);
                PointF pointF7 = new PointF(f, f4 + f6);
                PointF pointF8 = new PointF(pointF7.x, pointF7.y + f11);
                float f12 = f5 * 0.55191505f;
                float f13 = 0.55191505f * f6;
                final PointF pointF9 = new PointF((f8 / 2.0f) + f, f2 - (f9 / 2.0f));
                PointF pointF10 = new PointF(pointF2.x + f12, pointF2.y);
                PointF pointF11 = new PointF(pointF3.x, pointF3.y + f13);
                PointF pointF12 = new PointF(pointF4.x, pointF4.y - f13);
                PointF pointF13 = new PointF(pointF5.x + f12, pointF5.y);
                PointF pointF14 = new PointF(pointF6.x - f12, pointF6.y);
                PointF pointF15 = new PointF(pointF7.x, pointF7.y - f13);
                PointF pointF16 = new PointF(pointF8.x, pointF8.y + f13);
                PointF pointF17 = new PointF(pointF.x - f12, pointF.y);
                Arrays.asList(pointF, pointF2, pointF3, pointF4, pointF5, pointF6, pointF7, pointF8).forEach(new Consumer() { // from class: com.shockwave.pdfium.OooO0O0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        PdfiumCore.lambda$createRoundRect$1(pointF9, f7, (PointF) obj);
                    }
                });
                Arrays.asList(pointF10, pointF11, pointF12, pointF13, pointF14, pointF15, pointF16, pointF17).forEach(new Consumer() { // from class: com.shockwave.pdfium.OooO0OO
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        PdfiumCore.lambda$createRoundRect$2(pointF9, f7, (PointF) obj);
                    }
                });
                long jCreatePath = j == 0 ? createPath(pointF.x, pointF.y) : j;
                pathMoveTo(jCreatePath, pointF.x, pointF.y);
                PointF pointFCalculateMiddlePoint = PointFUtils.calculateMiddlePoint(pointF, pointF2);
                j2 = jCreatePath;
                pathQuadTo(j2, pointFCalculateMiddlePoint.x, pointFCalculateMiddlePoint.y, pointF2.x, pointF2.y);
                pathCubicTo(j2, pointF10.x, pointF10.y, pointF11.x, pointF11.y, pointF3.x, pointF3.y);
                PointF pointFCalculateMiddlePoint2 = PointFUtils.calculateMiddlePoint(pointF3, pointF4);
                pathQuadTo(j2, pointFCalculateMiddlePoint2.x, pointFCalculateMiddlePoint2.y, pointF4.x, pointF4.y);
                pathCubicTo(j2, pointF12.x, pointF12.y, pointF13.x, pointF13.y, pointF5.x, pointF5.y);
                PointF pointFCalculateMiddlePoint3 = PointFUtils.calculateMiddlePoint(pointF5, pointF6);
                pathQuadTo(j2, pointFCalculateMiddlePoint3.x, pointFCalculateMiddlePoint3.y, pointF6.x, pointF6.y);
                pathCubicTo(j2, pointF14.x, pointF14.y, pointF15.x, pointF15.y, pointF7.x, pointF7.y);
                PointF pointFCalculateMiddlePoint4 = PointFUtils.calculateMiddlePoint(pointF7, pointF8);
                pathQuadTo(j2, pointFCalculateMiddlePoint4.x, pointFCalculateMiddlePoint4.y, pointF8.x, pointF8.y);
                pathCubicTo(j2, pointF16.x, pointF16.y, pointF17.x, pointF17.y, pointF.x, pointF.y);
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2;
    }

    public boolean createTextAnnotation(PdfDocument pdfDocument, int i, RectF rectF, String str, String str2, Integer num) {
        synchronized (lock) {
            try {
                long jNativeCreateAnnot = nativeCreateAnnot(ensurePagePtr(pdfDocument, i), 1);
                if (jNativeCreateAnnot == 0) {
                    return false;
                }
                nativeUpdateAnnotationRect(jNativeCreateAnnot, rectF.left, rectF.top, rectF.right, rectF.bottom);
                if (str != null) {
                    nativeAnnotSetString(jNativeCreateAnnot, "T", str);
                }
                if (str2 != null) {
                    nativeAnnotSetString(jNativeCreateAnnot, "Contents", str2);
                }
                if (str2 != null) {
                    nativeAnnotSetString(jNativeCreateAnnot, "RC", str2);
                }
                if (num != null) {
                    nativeAnnotSetColor(jNativeCreateAnnot, ((num.intValue() >> 16) & 255) / 255.0f, ((num.intValue() >> 8) & 255) / 255.0f, (num.intValue() & 255) / 255.0f);
                }
                generateContent(pdfDocument, i);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean createURLLink(PdfDocument pdfDocument, int i, RectF rectF, String str) {
        boolean z;
        synchronized (lock) {
            z = nativeCreateURLLink(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), rectF.left, rectF.top, rectF.right, rectF.bottom, str) != 0;
        }
        return z;
    }

    public boolean deleteLink(PdfDocument pdfDocument, int i, PdfDocument.Link link) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    Log.e(TAG, "Page ptr is null. pageIndex: " + i);
                    return false;
                }
                long jNativeGetAnnotByPageLink = nativeGetAnnotByPageLink(l.longValue(), link.getNativePtr());
                if (jNativeGetAnnotByPageLink == 0) {
                    Log.e(TAG, "Annot ptr is null. pageIndex: " + i);
                    return false;
                }
                int iNativeGetAnnotIndex = nativeGetAnnotIndex(l.longValue(), jNativeGetAnnotByPageLink);
                if (iNativeGetAnnotIndex != -1) {
                    return removePageAnnotByIndex(pdfDocument, i, iNativeGetAnnotIndex);
                }
                Log.e(TAG, "Annot index is -1. pageIndex: " + i);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void generateContent(long j) {
        synchronized (lock) {
            nativeGenerateContent(j);
        }
    }

    public long getAnnotByIndex(PdfDocument pdfDocument, int i, int i2) {
        long jNativeGetAnnotByIndex;
        synchronized (lock) {
            try {
                Long lValueOf = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(openPage(pdfDocument, i));
                }
                jNativeGetAnnotByIndex = nativeGetAnnotByIndex(lValueOf.longValue(), i2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jNativeGetAnnotByIndex;
    }

    public RectF getAnnotationRect(long j) {
        return nativeGetAnnotationRect(j);
    }

    public int getCharIndexAtPos(PdfDocument pdfDocument, int i, float f, float f2, float f3, float f4) {
        int iNativeGetCharIndexAtPos;
        synchronized (lock) {
            String str = TAG;
            Log.d(str, "getCharIndexAtPos: pageIndex = " + i + ", x = " + f + ", y = " + f2 + ", toleranceX = " + f3 + ", toleranceY = " + f4);
            PointF pointFMapPointWithPageRotation = mapPointWithPageRotation(f, f2, getRotation(pdfDocument, i), getPageWidthPoint(pdfDocument, i), getPageHeightPoint(pdfDocument, i));
            StringBuilder sb = new StringBuilder("getCharIndexAtPos: rotatedPoint = ");
            sb.append(pointFMapPointWithPageRotation);
            Log.d(str, sb.toString());
            iNativeGetCharIndexAtPos = nativeGetCharIndexAtPos(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), pointFMapPointWithPageRotation.x, pointFMapPointWithPageRotation.y, f3, f4);
        }
        return iNativeGetCharIndexAtPos;
    }

    public PdfDocument.Meta getDocumentMeta(PdfDocument pdfDocument) {
        PdfDocument.Meta meta;
        synchronized (lock) {
            meta = new PdfDocument.Meta();
            meta.title = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Title");
            meta.author = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Author");
            meta.subject = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Subject");
            meta.keywords = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Keywords");
            meta.creator = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Creator");
            meta.producer = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "Producer");
            meta.creationDate = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "CreationDate");
            meta.modDate = nativeGetDocumentMetaText(pdfDocument.mNativeDocPtr, "ModDate");
        }
        return meta;
    }

    public int getPageAnnotCount(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    return 0;
                }
                return nativeGetAnnotCount(l.longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getPageAnnotSubtype(PdfDocument pdfDocument, int i, int i2) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    return 0;
                }
                long jNativeGetAnnotByIndex = nativeGetAnnotByIndex(l.longValue(), i2);
                if (jNativeGetAnnotByIndex == 0) {
                    return 0;
                }
                return nativeGetSubtype(jNativeGetAnnotByIndex);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<PdfText> getPageContent(PdfDocument pdfDocument, int i) {
        List<PdfText> listAsList;
        synchronized (lock) {
            try {
                try {
                    long jLongValue = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue();
                    final int pageWidthPoint = getPageWidthPoint(pdfDocument, i);
                    final int pageHeightPoint = getPageHeightPoint(pdfDocument, i);
                    final int rotation = getRotation(pdfDocument, i);
                    PdfText[] pdfTextArrNativeGetPageContent = nativeGetPageContent(jLongValue);
                    Arrays.asList(pdfTextArrNativeGetPageContent).stream().forEach(new Consumer() { // from class: com.shockwave.pdfium.OooO00o
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            this.f80199OooOo0o.lambda$getPageContent$0(rotation, pageWidthPoint, pageHeightPoint, (PdfText) obj);
                        }
                    });
                    listAsList = Arrays.asList(pdfTextArrNativeGetPageContent);
                } catch (Exception e) {
                    e.printStackTrace();
                    return new ArrayList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return listAsList;
    }

    public int getPageCount(PdfDocument pdfDocument) {
        int iNativeGetPageCount;
        synchronized (lock) {
            iNativeGetPageCount = nativeGetPageCount(pdfDocument.mNativeDocPtr);
        }
        return iNativeGetPageCount;
    }

    public RectF getPageCropBox(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            try {
                RectF rectFNativeGetPageCropBox = nativeGetPageCropBox(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue());
                if (rectFNativeGetPageCropBox == null) {
                    return null;
                }
                return new RectF(rectFNativeGetPageCropBox.left, rectFNativeGetPageCropBox.top, rectFNativeGetPageCropBox.right, rectFNativeGetPageCropBox.bottom);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getPageHeight(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    return 0;
                }
                return nativeGetPageHeightPixel(l.longValue(), this.mCurrentDpi);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getPageHeightPoint(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    return 0;
                }
                return nativeGetPageHeightPoint(l.longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<PdfDocument.Link> getPageLinks(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            try {
                ArrayList arrayList = new ArrayList();
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    return arrayList;
                }
                for (long j : nativeGetPageLinks(l.longValue())) {
                    Integer numNativeGetDestPageIndex = nativeGetDestPageIndex(pdfDocument.mNativeDocPtr, j);
                    String strNativeGetLinkURI = nativeGetLinkURI(pdfDocument.mNativeDocPtr, j);
                    RectF rectFNativeGetLinkRect = nativeGetLinkRect(j);
                    if (rectFNativeGetLinkRect != null && (numNativeGetDestPageIndex != null || strNativeGetLinkURI != null)) {
                        arrayList.add(new PdfDocument.Link(rectFNativeGetLinkRect, numNativeGetDestPageIndex, strNativeGetLinkURI, j));
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public RectF getPageMediaBox(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            try {
                RectF rectFNativeGetPageMediaBox = nativeGetPageMediaBox(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue());
                if (rectFNativeGetPageMediaBox == null) {
                    return null;
                }
                return new RectF(rectFNativeGetPageMediaBox.left, rectFNativeGetPageMediaBox.top, rectFNativeGetPageMediaBox.right, rectFNativeGetPageMediaBox.bottom);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SizeF getPageOffset(PdfDocument pdfDocument, int i) {
        SizeF sizeF;
        synchronized (lock) {
            SizeF sizeFNativeGetPageOffset = nativeGetPageOffset(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue());
            sizeF = new SizeF(sizeFNativeGetPageOffset.getWidth(), sizeFNativeGetPageOffset.getHeight());
        }
        return sizeF;
    }

    public Size getPageSize(PdfDocument pdfDocument, int i) {
        Size sizeNativeGetPageSizeByIndex;
        synchronized (lock) {
            sizeNativeGetPageSizeByIndex = nativeGetPageSizeByIndex(pdfDocument.mNativeDocPtr, i, this.mCurrentDpi);
        }
        return sizeNativeGetPageSizeByIndex;
    }

    public int getPageWidth(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    return 0;
                }
                return nativeGetPageWidthPixel(l.longValue(), this.mCurrentDpi);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getPageWidthPoint(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    return 0;
                }
                return nativeGetPageWidthPoint(l.longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public RectF[] getRectGroups(RectF[] rectFArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < rectFArr.length; i++) {
            RectF rectF = rectFArr[i];
            if (i == 0) {
                arrayList.add(new RectF(rectF));
            } else {
                RectF rectF2 = rectFArr[i - 1];
                if (rectF.left < (rectF2.width() / 2.0f) + rectF2.left) {
                    arrayList.add(new RectF(rectF));
                } else {
                    ((RectF) C21505OooO0Oo.OooO00o(1, arrayList)).right = rectF.right;
                }
            }
        }
        return (RectF[]) arrayList.toArray(new RectF[0]);
    }

    public RectF[] getRectsByIndexRange(PdfDocument pdfDocument, int i, int i2, int i3, boolean z) {
        RectF[] rectFArrNativeGetRects;
        synchronized (lock) {
            try {
                int pageWidthPoint = getPageWidthPoint(pdfDocument, i);
                int pageHeightPoint = getPageHeightPoint(pdfDocument, i);
                int rotation = getRotation(pdfDocument, i);
                rectFArrNativeGetRects = nativeGetRects(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), i2, i3);
                for (int i4 = 0; i4 < rectFArrNativeGetRects.length; i4++) {
                    RectF rectFMapRectWithPageRotation = mapRectWithPageRotation(rectFArrNativeGetRects[i4], rotation, pageWidthPoint, pageHeightPoint);
                    rectFArrNativeGetRects[i4] = rectFMapRectWithPageRotation;
                    float f = rectFMapRectWithPageRotation.left;
                    float f2 = rectFMapRectWithPageRotation.right;
                    rectFMapRectWithPageRotation.left = Math.min(f, f2);
                    rectFArrNativeGetRects[i4].right = Math.max(f, f2);
                    RectF rectF = rectFArrNativeGetRects[i4];
                    float f3 = rectF.top;
                    float f4 = rectF.bottom;
                    rectF.top = Math.max(f3, f4);
                    rectFArrNativeGetRects[i4].bottom = Math.min(f3, f4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rectFArrNativeGetRects;
    }

    public int getRotation(PdfDocument pdfDocument, int i) {
        int iNativeGetPageRotation;
        synchronized (lock) {
            try {
                Long lValueOf = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(openPage(pdfDocument, i));
                }
                iNativeGetPageRotation = nativeGetPageRotation(lValueOf.longValue());
            } catch (Throwable th) {
                throw th;
            }
        }
        return iNativeGetPageRotation;
    }

    public List<PdfDocument.Bookmark> getTableOfContents(PdfDocument pdfDocument) {
        ArrayList arrayList;
        synchronized (lock) {
            try {
                arrayList = new ArrayList();
                Long lNativeGetFirstChildBookmark = nativeGetFirstChildBookmark(pdfDocument.mNativeDocPtr, null);
                if (lNativeGetFirstChildBookmark != null) {
                    recursiveGetBookmark(arrayList, pdfDocument, lNativeGetFirstChildBookmark.longValue(), new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public String getText(PdfDocument pdfDocument, int i, int i2, int i3) {
        String strNativeGetText;
        synchronized (lock) {
            try {
                Long lValueOf = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(openPage(pdfDocument, i));
                }
                strNativeGetText = nativeGetText(lValueOf.longValue(), i2, (i3 - i2) + 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return strNativeGetText;
    }

    public long importPage(PdfDocument pdfDocument, PdfDocument pdfDocument2, int i, int i2) throws Throwable {
        synchronized (lock) {
            try {
                try {
                    if (!nativeImportPage(pdfDocument.mNativeDocPtr, pdfDocument2.mNativeDocPtr, i, i2)) {
                        return -1L;
                    }
                    long jOpenPage = openPage(pdfDocument2, i2);
                    pdfDocument2.mNativePagesPtr.put(Integer.valueOf(i2), Long.valueOf(jOpenPage));
                    return jOpenPage;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public boolean isPageOpened(PdfDocument pdfDocument, int i) {
        boolean z;
        synchronized (lock) {
            z = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)) != null;
        }
        return z;
    }

    public Point mapPageCoordsToDevice(PdfDocument pdfDocument, int i, int i2, int i3, int i4, int i5, int i6, double d, double d2) {
        return nativePageCoordsToDevice(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), i2, i3, i4, i5, i6, d, d2);
    }

    public PointF mapPointWithPageRotation(float f, float f2, int i, int i2, int i3) {
        PointF pointF;
        synchronized (lock) {
            try {
                pointF = new PointF(f, f2);
                if (i == 1) {
                    pointF = rotate(pointF, new PointF(0.0f, 0.0f), 90.0f);
                    pointF.offset(i3, 0.0f);
                } else if (i == 2) {
                    pointF = rotate(pointF, new PointF(0.0f, 0.0f), 180.0f);
                    pointF.offset(i2, i3);
                } else if (i == 3) {
                    pointF = rotate(pointF, new PointF(0.0f, 0.0f), 270.0f);
                    pointF.offset(0.0f, i2);
                }
            } finally {
            }
        }
        return pointF;
    }

    public RectF mapRectToDevice(PdfDocument pdfDocument, int i, int i2, int i3, int i4, int i5, int i6, RectF rectF) {
        Point pointMapPageCoordsToDevice = mapPageCoordsToDevice(pdfDocument, i, i2, i3, i4, i5, i6, rectF.left, rectF.top);
        Point pointMapPageCoordsToDevice2 = mapPageCoordsToDevice(pdfDocument, i, i2, i3, i4, i5, i6, rectF.right, rectF.bottom);
        return new RectF(pointMapPageCoordsToDevice.x, pointMapPageCoordsToDevice.y, pointMapPageCoordsToDevice2.x, pointMapPageCoordsToDevice2.y);
    }

    public PdfDocument newDocument(String str, String str2) throws IOException {
        if (str != null && !str.trim().isEmpty()) {
            return newDocument(ParcelFileDescriptor.open(new File(str), WarningType.HINT), str2);
        }
        Log.e("PdfiumCore", "Path cannot be null or empty");
        throw new IllegalArgumentException("Path cannot be null or empty");
    }

    public long openPage(PdfDocument pdfDocument, int i) {
        long jNativeLoadPage;
        synchronized (lock) {
            jNativeLoadPage = nativeLoadPage(pdfDocument.mNativeDocPtr, i);
            pdfDocument.mNativePagesPtr.put(Integer.valueOf(i), Long.valueOf(jNativeLoadPage));
        }
        return jNativeLoadPage;
    }

    public void pageInsertObject(long j, long j2) {
        synchronized (lock) {
            nativePageInsertObject(j, j2);
        }
    }

    public boolean pathClose(long j) {
        boolean zNativePathClose;
        synchronized (lock) {
            zNativePathClose = nativePathClose(j);
        }
        return zNativePathClose;
    }

    public boolean pathCubicTo(long j, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean zNativePathBezierTo;
        synchronized (lock) {
            zNativePathBezierTo = nativePathBezierTo(j, f, f2, f3, f4, f5, f6);
        }
        return zNativePathBezierTo;
    }

    public boolean pathLineTo(long j, float f, float f2) {
        boolean zNativePathLineTo;
        synchronized (lock) {
            zNativePathLineTo = nativePathLineTo(j, f, f2);
        }
        return zNativePathLineTo;
    }

    public boolean pathMoveTo(long j, float f, float f2) {
        boolean zNativePathMoveTo;
        synchronized (lock) {
            zNativePathMoveTo = nativePathMoveTo(j, f, f2);
        }
        return zNativePathMoveTo;
    }

    public boolean pathQuadTo(long j, float f, float f2, float f3, float f4) {
        boolean zNativePathBezierTo;
        synchronized (lock) {
            zNativePathBezierTo = nativePathBezierTo(j, f, f2, f, f2, f3, f4);
        }
        return zNativePathBezierTo;
    }

    public boolean removeAnnotPopup(PdfDocument pdfDocument, int i, int i2) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    return false;
                }
                long jNativeGetAnnotByIndex = nativeGetAnnotByIndex(l.longValue(), i2);
                if (jNativeGetAnnotByIndex == 0) {
                    return false;
                }
                return nativeRemoveAnnotPopup(jNativeGetAnnotByIndex);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean removePageAnnotByIndex(PdfDocument pdfDocument, int i, int i2) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    return false;
                }
                return nativeRemoveAnnotByIndex(l.longValue(), i2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void renderPage(PdfDocument pdfDocument, Surface surface, int i, int i2, int i3, int i4, int i5) {
        renderPage(pdfDocument, surface, i, i2, i3, i4, i5, false);
    }

    public void renderPageBitmap(PdfDocument pdfDocument, Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        renderPageBitmap(pdfDocument, bitmap, i, i2, i3, i4, i5, false);
    }

    public Bitmap reverseBitmapByteOrder(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPremultiplied(false);
        int i = width * height;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            iArr2[i2] = ((i3 >> 16) & 255) | ((-16711936) & i3) | ((i3 << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY);
        }
        bitmapCreateBitmap.setPixels(iArr2, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    public void saveAndCloseDocument(PdfDocument pdfDocument, ParcelFileDescriptor parcelFileDescriptor) {
        synchronized (lock) {
            nativeSaveDocument(pdfDocument.mNativeDocPtr, getNumFd(parcelFileDescriptor));
        }
        pdfDocument.parcelFileDescriptor = parcelFileDescriptor;
        closeDocument(pdfDocument);
    }

    public RectF[] search(PdfDocument pdfDocument, int i, String str) throws Throwable {
        synchronized (lock) {
            try {
                int[] iArrNativeSearch = nativeSearch(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), str);
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i2 < iArrNativeSearch.length) {
                    PdfDocument pdfDocument2 = pdfDocument;
                    int i3 = i;
                    try {
                        Collections.addAll(arrayList, getRectGroups(getRectsByIndexRange(pdfDocument2, i3, iArrNativeSearch[i2], (str.length() + r9) - 1, true)));
                        i2++;
                        pdfDocument = pdfDocument2;
                        i = i3;
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                return (RectF[]) arrayList.toArray(new RectF[0]);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void setBlendMode(long j, String str) {
        synchronized (lock) {
            nativeSetBlendMode(j, str);
        }
    }

    public boolean setDashPattern(long j, float[] fArr, float f) {
        boolean zNativeSetDashArray;
        synchronized (lock) {
            zNativeSetDashArray = nativeSetDashArray(j, fArr, f);
        }
        return zNativeSetDashArray;
    }

    public void setFillColor(long j, int i) {
        synchronized (lock) {
            nativeSetFillColor(j, Color.red(i), Color.green(i), Color.blue(i), Color.alpha(i));
        }
    }

    public boolean setLineCap(long j, int i) {
        boolean zNativeSetLineCap;
        synchronized (lock) {
            zNativeSetLineCap = nativeSetLineCap(j, i);
        }
        return zNativeSetLineCap;
    }

    public boolean setLineJoin(long j, int i) {
        boolean zNativeSetLineJoin;
        synchronized (lock) {
            zNativeSetLineJoin = nativeSetLineJoin(j, i);
        }
        return zNativeSetLineJoin;
    }

    public boolean setLinkDestPageIndex(PdfDocument pdfDocument, PdfDocument.Link link, int i) {
        boolean zNativeSetLinkPageIndex;
        synchronized (lock) {
            zNativeSetLinkPageIndex = nativeSetLinkPageIndex(pdfDocument.mNativeDocPtr, link.getNativePtr(), i);
        }
        return zNativeSetLinkPageIndex;
    }

    public void setPageMargins(PdfDocument pdfDocument, int i, float f, float f2, float f3, float f4) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l == null) {
                    return;
                }
                int rotation = getRotation(pdfDocument, i);
                RectF rectF = rotation != 1 ? rotation != 2 ? rotation != 3 ? new RectF(f, f2, f3, f4) : new RectF(f4, f, f2, f3) : new RectF(f3, f4, f, f2) : new RectF(f2, f3, f4, f);
                nativeSetPageMargins(l.longValue(), rectF.left, rectF.top, rectF.right, rectF.bottom);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean setPathDrawMode(long j, int i, int i2) {
        boolean zNativePathSetDrawMode;
        synchronized (lock) {
            zNativePathSetDrawMode = nativePathSetDrawMode(j, i, i2);
        }
        return zNativePathSetDrawMode;
    }

    public void setRotation(PdfDocument pdfDocument, int i, int i2) {
        synchronized (lock) {
            try {
                Long lValueOf = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(openPage(pdfDocument, i));
                }
                nativeSetPageRotation(lValueOf.longValue(), i2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean setStrokeColor(long j, int i) {
        boolean zNativeSetStrokeColor;
        synchronized (lock) {
            zNativeSetStrokeColor = nativeSetStrokeColor(j, Color.red(i), Color.green(i), Color.blue(i), Color.alpha(i));
        }
        return zNativeSetStrokeColor;
    }

    public boolean setStrokeWidth(long j, float f) {
        boolean zNativeSetStrokeWidth;
        synchronized (lock) {
            zNativeSetStrokeWidth = nativeSetStrokeWidth(j, f);
        }
        return zNativeSetStrokeWidth;
    }

    public void setTransform(long j, Matrix matrix) {
        synchronized (lock) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            setTransform(j, fArr[0], fArr[3], fArr[1], fArr[4], fArr[2], fArr[5]);
        }
    }

    public boolean updateAnnotationRect(long j, RectF rectF) {
        return nativeUpdateAnnotationRect(j, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void renderPage(PdfDocument pdfDocument, Surface surface, int i, int i2, int i3, int i4, int i5, boolean z) {
        synchronized (lock) {
            try {
                nativeRenderPage(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), surface, this.mCurrentDpi, i2, i3, i4, i5, z);
            } catch (NullPointerException e) {
                Log.e(TAG, "mContext may be null");
                e.printStackTrace();
            } catch (Exception e2) {
                Log.e(TAG, "Exception throw from native");
                e2.printStackTrace();
            }
        }
    }

    public void renderPageBitmap(PdfDocument pdfDocument, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, boolean z) {
        synchronized (lock) {
            try {
                nativeRenderPageBitmap(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), bitmap, this.mCurrentDpi, i2, i3, i4, i5, z);
            } catch (NullPointerException e) {
                Log.e(TAG, "mContext may be null");
                e.printStackTrace();
            } catch (Exception e2) {
                Log.e(TAG, "Exception throw from native");
                e2.printStackTrace();
            }
        }
    }

    public PdfiumCore(Context context) {
        this.mCurrentDpi = context.getResources().getDisplayMetrics().densityDpi;
    }

    public long createImg(PdfDocument pdfDocument, int i, Bitmap bitmap, float f, float f2, float f3, float f4, float f5) {
        long jNativeCreateImage;
        synchronized (lock) {
            long jLongValue = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue();
            float f6 = f3 - f;
            float f7 = f2 - f4;
            Matrix matrix = new Matrix();
            matrix.setScale(f6, f7);
            matrix.postTranslate(f, f4);
            matrix.postRotate(-f5, (f6 / 2.0f) + f, (f7 / 2.0f) + f4);
            matrix.getValues(new float[9]);
            jNativeCreateImage = nativeCreateImage(pdfDocument.mNativeDocPtr, new long[]{jLongValue}, bitmap, r1[0], r1[3], r1[1], r1[4], r1[2], r1[5]);
        }
        return jNativeCreateImage;
    }

    public void generateContent(PdfDocument pdfDocument, int i) {
        synchronized (lock) {
            try {
                Long l = pdfDocument.mNativePagesPtr.get(Integer.valueOf(i));
                if (l != null) {
                    nativeGenerateContent(l.longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void pageInsertObject(PdfDocument pdfDocument, int i, long j) {
        synchronized (lock) {
            nativePageInsertObject(pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue(), j);
        }
    }

    public long[] openPage(PdfDocument pdfDocument, int i, int i2) {
        long[] jArrNativeLoadPages;
        synchronized (lock) {
            try {
                jArrNativeLoadPages = nativeLoadPages(pdfDocument.mNativeDocPtr, i, i2);
                for (long j : jArrNativeLoadPages) {
                    if (i <= i2) {
                        pdfDocument.mNativePagesPtr.put(Integer.valueOf(i), Long.valueOf(j));
                        i++;
                    }
                }
            } finally {
            }
        }
        return jArrNativeLoadPages;
    }

    public PdfDocument newDocument(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        PdfDocument pdfDocument = new PdfDocument();
        pdfDocument.parcelFileDescriptor = parcelFileDescriptor;
        synchronized (lock) {
            pdfDocument.mNativeDocPtr = nativeOpenDocument(getNumFd(parcelFileDescriptor), str);
        }
        return pdfDocument;
    }

    public PdfDocument newDocument(byte[] bArr) throws IOException {
        return newDocument(bArr, (String) null);
    }

    public void setTransform(long j, float f, float f2, float f3, float f4, float f5, float f6) {
        synchronized (lock) {
            nativeTransform(j, f, f2, f3, f4, f5, f6);
        }
    }

    public PdfDocument newDocument(byte[] bArr, String str) throws IOException {
        PdfDocument pdfDocument = new PdfDocument();
        synchronized (lock) {
            pdfDocument.mNativeDocPtr = nativeOpenMemDocument(bArr, str);
        }
        return pdfDocument;
    }

    public long createImg(PdfDocument pdfDocument, int i, Bitmap bitmap, double d, double d2, double d3, double d4, double d5, double d6) {
        long jNativeCreateImage;
        synchronized (lock) {
            jNativeCreateImage = nativeCreateImage(pdfDocument.mNativeDocPtr, new long[]{pdfDocument.mNativePagesPtr.get(Integer.valueOf(i)).longValue()}, bitmap, d, d2, d3, d4, d5, d6);
        }
        return jNativeCreateImage;
    }
}
