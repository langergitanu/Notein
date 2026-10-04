package com.orion.ni_render_engine.impl.ink;

import OooOoo.C20593OooO0Oo;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.ink.strokes.OooOOO0;
import com.orion.ni_render_engine.impl.ink.OooO0O0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C24035Oooo00o;
import o0O0oOo0.C26146OooO00o;
import oO00ooO.C32442OooOO0o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: com.orion.ni_render_engine.impl.ink.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C22840OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f69449OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C22842OooO0oO f69450OooO0O0 = new C22842OooO0oO();

    public static void OooO00o(C26146OooO00o c26146OooO00o, OooOOO0 stroke, Matrix matrix, Map map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        synchronized (C22841OooO0o0.f69452OooO0O0) {
            for (OooO0o oooO0o : C22841OooO0o0.f69451OooO00o) {
                if (oooO0o.OooO00o(stroke)) {
                    oooO0o.OooO0O0(c26146OooO00o, stroke, matrix, map);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO0O0(Canvas canvas, OooOOO0 stroke, Matrix transform, o0O0oo00.OooO0OO oooO0OO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(transform, "transform");
        Matrix matrix = new Matrix(canvas.getMatrix());
        matrix.preConcat(transform);
        canvas.save();
        canvas.concat(transform);
        boolean zOooO0O0 = true;
        boolean z = Build.VERSION.SDK_INT >= 34;
        int iOrdinal = oooO0OO.ordinal();
        OooO00o oooO00o = f69449OooO00o;
        C22842OooO0oO c22842OooO0oO = f69450OooO0O0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zOooO0O0 = oooO00o.OooO0O0(canvas, stroke, matrix);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new C32442OooOO0o();
                }
                if ((!z || !oooO00o.OooO0O0(canvas, stroke, matrix)) && !OooO0OO(canvas, stroke, transform) && !c22842OooO0oO.OooO0O0(canvas, stroke, matrix)) {
                    zOooO0O0 = false;
                }
            } else if (!OooO0OO(canvas, stroke, transform) && !c22842OooO0oO.OooO0O0(canvas, stroke, matrix)) {
            }
        } else if (!canvas.isHardwareAccelerated() || !z ? !(OooO0OO(canvas, stroke, transform) || c22842OooO0oO.OooO0O0(canvas, stroke, matrix)) : !(oooO00o.OooO0O0(canvas, stroke, matrix) || c22842OooO0oO.OooO0O0(canvas, stroke, matrix))) {
        }
        if (!zOooO0O0) {
            C34406OooO00o.f123390OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("无法渲染笔画: ", stroke.f65486OooO00o.f82632OooO0O0.OooO00o()), new Object[0]);
        }
        canvas.restore();
    }

    public static boolean OooO0OO(Canvas canvas, OooOOO0 stroke, Matrix transform) {
        List<InterfaceC22843OooO0oo> listO0ooOO0;
        ArrayList arrayList = OooO0O0.f69446OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(stroke, "stroke");
        kotlin.jvm.internal.OooOOO0.OooO0oO(transform, "transform");
        synchronized (OooO0O0.f69447OooO0O0) {
            try {
                ArrayList arrayList2 = OooO0O0.f69446OooO00o;
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((OooO0O0.OooO00o) it.next()).f69448OooO00o);
                }
                listO0ooOO0 = OooOo.o0ooOO0(arrayList3);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC22843OooO0oo interfaceC22843OooO0oo : listO0ooOO0) {
            if (interfaceC22843OooO0oo.OooO00o(stroke)) {
                try {
                    if (interfaceC22843OooO0oo.OooO0O0(canvas, stroke, transform)) {
                        return true;
                    }
                } catch (Exception e) {
                    C34406OooO00o.f123390OooO00o.OooOO0o(e, C20593OooO0Oo.OooO0O0("渲染器 ", C24035Oooo00o.f80943OooO00o.OooO0O0(interfaceC22843OooO0oo.getClass()).OooOO0(), " 执行失败"), new Object[0]);
                }
            }
        }
        return false;
    }
}
