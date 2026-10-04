package com.aspose.slides;

import android.graphics.Path;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes3.dex */
public class ShapeUtil {
    @Deprecated
    public static Path geometryPathToGraphicsPath(IGeometryPath iGeometryPath) {
        return (Path) C11896dy.m55506k4(m2666k4(iGeometryPath));
    }

    @Deprecated
    public static IGeometryPath graphicsPathToGeometryPath(Path path) {
        return m2665k4(C11896dy.m55504k4(path));
    }

    /* JADX INFO: renamed from: k4 */
    public static IGeometryPath m2665k4(C11896dy c11896dy) {
        GeometryPath geometryPath = new GeometryPath();
        if (c11896dy == null) {
            throw new ArgumentException("Parameter graphicsPath is null");
        }
        if (c11896dy.m55525du() == 0) {
            throw new ArgumentException("Graphics path is empty");
        }
        int i = 0;
        while (i < c11896dy.m55571to().length) {
            int i2 = c11896dy.m55571to()[i] & 7;
            if (i2 == 0) {
                geometryPath.m1581x1(c11896dy.m55565kk()[i].Clone());
            }
            if (i2 == 1) {
                geometryPath.m1575k4(c11896dy.m55565kk()[i].Clone());
            }
            if (i2 == 3) {
                C12025x6 c12025x6Clone = c11896dy.m55565kk()[i].Clone();
                C12025x6 c12025x6Clone2 = c11896dy.m55565kk()[i + 1].Clone();
                i += 2;
                geometryPath.m1579k4(c12025x6Clone, c12025x6Clone2, c11896dy.m55565kk()[i].Clone());
            }
            if ((c11896dy.m55571to()[i] & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                geometryPath.m1575k4(c11896dy.m55565kk()[i].Clone());
                geometryPath.closeFigure();
            }
            i++;
        }
        return geometryPath;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11896dy m2666k4(IGeometryPath iGeometryPath) {
        char c;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        C11896dy c11896dy = new C11896dy();
        IPathSegment[] pathData = iGeometryPath.getPathData();
        int length = pathData.length;
        float f7 = 0.0f;
        char c2 = 0;
        float f8 = 0.0f;
        float fM56895kk = 0.0f;
        int i = 0;
        while (i < length) {
            IPathSegment iPathSegment = pathData[i];
            byte pathCommand = iPathSegment.getPathCommand();
            if (pathCommand == 0) {
                c = c2;
                c11896dy.m55567m9();
            } else if (pathCommand == 1) {
                c = c2;
                c11896dy.m55585yj();
                f8 = iPathSegment.getSegmentData()[c];
                fM56895kk = iPathSegment.getSegmentData()[1];
            } else if (pathCommand != 2) {
                if (pathCommand != 3) {
                    if (pathCommand == 4) {
                        float f9 = iPathSegment.getSegmentData()[c2];
                        float f10 = iPathSegment.getSegmentData()[1];
                        float f11 = iPathSegment.getSegmentData()[2];
                        float f12 = iPathSegment.getSegmentData()[3];
                        float f13 = (((f9 - f8) * 2.0f) / 3.0f) + f8;
                        float f14 = (((f10 - fM56895kk) * 2.0f) / 3.0f) + fM56895kk;
                        float f15 = (((f9 - f11) * 2.0f) / 3.0f) + f11;
                        f = (((f10 - f12) * 2.0f) / 3.0f) + f12;
                        f2 = f11;
                        f3 = f12;
                        f4 = f13;
                        f5 = f15;
                        f6 = f14;
                    } else if (pathCommand == 5) {
                        float f16 = iPathSegment.getSegmentData()[c2];
                        float f17 = iPathSegment.getSegmentData()[1];
                        float f18 = iPathSegment.getSegmentData()[2];
                        float f19 = iPathSegment.getSegmentData()[3];
                        float f20 = iPathSegment.getSegmentData()[4];
                        f = f19;
                        f5 = f18;
                        f3 = iPathSegment.getSegmentData()[5];
                        f4 = f16;
                        f6 = f17;
                        f2 = f20;
                    }
                    c11896dy.m55536k4(f8, fM56895kk, f4, f6, f5, f, f2, f3);
                    f8 = f2;
                    fM56895kk = f3;
                } else {
                    float f21 = iPathSegment.getSegmentData()[c2];
                    float f22 = iPathSegment.getSegmentData()[1];
                    float f23 = iPathSegment.getSegmentData()[2];
                    float f24 = iPathSegment.getSegmentData()[3];
                    if (C14116yg.m67480k4(f22) + C14116yg.m67480k4(f21) >= 0.005d) {
                        if (f22 == f7) {
                            f22 = 1.0E-5f;
                        }
                        if (f21 == f7) {
                            f21 = 1.0E-5f;
                        }
                        double d = ((double) (f23 / 180.0f)) * 3.141592653589793d;
                        double dM67470dy = C14116yg.m67470dy(d);
                        double dM67495m9 = C14116yg.m67495m9(d);
                        c = c2;
                        double d2 = f21;
                        double d3 = f22;
                        double dM67496rv = C14116yg.m67496rv(1.0d / ((((dM67495m9 * dM67495m9) / d3) / d3) + (((dM67470dy * dM67470dy) / d2) / d2)));
                        c11896dy.m55535k4(((float) (((double) f8) - (dM67470dy * dM67496rv))) - f21, ((float) (((double) fM56895kk) - (dM67495m9 * dM67496rv))) - f22, f21 * 2.0f, f22 * 2.0f, f23, f24);
                        if (c11896dy.m55525du() < 2) {
                            f8 = 0.0f;
                            fM56895kk = 0.0f;
                        } else {
                            C12025x6 c12025x6Clone = c11896dy.m55565kk()[c11896dy.m55525du() - 1].Clone();
                            float fM56897x1 = c12025x6Clone.m56897x1();
                            fM56895kk = c12025x6Clone.m56895kk();
                            f8 = fM56897x1;
                        }
                    }
                }
                c = c2;
            } else {
                c = c2;
                float f25 = iPathSegment.getSegmentData()[c];
                float f26 = iPathSegment.getSegmentData()[1];
                c11896dy.m55574x1(f8, fM56895kk, f25, f26);
                fM56895kk = f26;
                f8 = f25;
            }
            i++;
            c2 = c;
            f7 = 0.0f;
        }
        return c11896dy;
    }
}
