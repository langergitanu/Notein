package o000O00O;

import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.os.Build;
import androidx.graphics.surface.OooO00o;
import androidx.graphics.surface.OooO0o;
import androidx.graphics.surface.SurfaceControlCompat;
import java.util.HashMap;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o000O00O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24391OooO0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ SurfaceControlCompat f82313OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0<Object> f82314OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ o000O00.OooO00o f82315OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ SurfaceControlCompat f82316OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ RenderNode f82317OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C24390OooO0oO f82318OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24391OooO0oo(OooOOO0 oooOOO0, SurfaceControlCompat surfaceControlCompat, SurfaceControlCompat surfaceControlCompat2, o000O00.OooO00o oooO00o, RenderNode renderNode, C24390OooO0oO c24390OooO0oO) {
        super(0);
        this.f82314OooOo0o = oooOOO0;
        this.f82313OooOo = surfaceControlCompat;
        this.f82316OooOoO0 = surfaceControlCompat2;
        this.f82315OooOoO = oooO00o;
        this.f82317OooOoOO = renderNode;
        this.f82318OooOoo0 = c24390OooO0oO;
    }

    @Override // oO0O000o.OooO00o
    public final C32460OooOooO invoke() throws Exception {
        OooOOO0<Object> oooOOO0 = this.f82314OooOo0o;
        HardwareBuffer hardwareBuffer = oooOOO0.f82340OooOOO0;
        if (hardwareBuffer != null) {
            hardwareBuffer.close();
        }
        oooOOO0.f82340OooOOO0 = null;
        HashMap map = new HashMap();
        int i = Build.VERSION.SDK_INT;
        OooO0o.OooO00o oooO00o = androidx.graphics.surface.OooO0o.f65129OooO00o;
        OooO00o.OooO0O0 oooO0O0OooO0Oo = i >= 33 ? oooO00o.OooO0Oo() : oooO00o.OooO0OO();
        SurfaceControlCompat surfaceControlCompat = this.f82313OooOo;
        if (surfaceControlCompat != null) {
            androidx.graphics.surface.OooO00o oooO00o2 = surfaceControlCompat.f65140OooO00o;
            if (oooO00o2.isValid()) {
                oooO0O0OooO0Oo.o000O000(oooO00o2, null);
            }
        }
        SurfaceControlCompat surfaceControlCompat2 = this.f82316OooOoO0;
        if (surfaceControlCompat2 != null) {
            androidx.graphics.surface.OooO00o oooO00o3 = surfaceControlCompat2.f65140OooO00o;
            if (oooO00o3.isValid()) {
                oooO0O0OooO0Oo.o000O000(oooO00o3, null);
            }
        }
        map.clear();
        oooO0O0OooO0Oo.commit();
        oooO0O0OooO0Oo.close();
        if (surfaceControlCompat != null) {
            surfaceControlCompat.f65140OooO00o.release();
        }
        if (surfaceControlCompat2 != null) {
            surfaceControlCompat2.f65140OooO00o.release();
        }
        o000O00.OooO00o oooO00o4 = this.f82315OooOoO;
        if (oooO00o4 != null) {
            oooO00o4.close();
        }
        RenderNode renderNode = this.f82317OooOoOO;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        C24390OooO0oO c24390OooO0oO = this.f82318OooOoo0;
        if (c24390OooO0oO != null) {
            c24390OooO0oO.invoke();
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
