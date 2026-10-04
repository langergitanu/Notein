package o000O00;

import android.graphics.ColorSpace;
import android.hardware.HardwareBuffer;
import android.os.Build;
import android.os.Handler;
import androidx.core.util.Consumer;
import androidx.graphics.surface.OooO00o;
import androidx.graphics.surface.OooO0o;
import androidx.graphics.surface.SurfaceControlCompat;
import androidx.ink.authoring.internal.OooO0O0;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C24034Oooo00O;
import o000O00.OooO00o;
import o000O00O.C24392OooOO0o;
import o000O00O.C24394OooOOo;
import o000O00O.C24397OooOo0;
import o000O00O.C24398OooOo0O;
import o000O00O.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34426OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RunnableC24375OooOo0 f82230OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000O0Oo.OooO00o f82231OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O00O.OooOo00 f82232OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24397OooOo0 f82233OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AtomicBoolean f82234OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f82235OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final C34426OooOO0o<OooO00o> f82236OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C24398OooOo0O f82237OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final AtomicBoolean f82238OooO0oo;

    public interface OooO00o {
        default boolean OooO00o() {
            return true;
        }

        void execute();

        int getId();

        void onComplete();
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<HardwareBuffer, o000OO0O.OooO0OO, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ OooO00o f82239OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooO00o oooO00o) {
            super(2);
            this.f82239OooOo = oooO00o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(HardwareBuffer hardwareBuffer, o000OO0O.OooO0OO oooO0OO) {
            HardwareBuffer hardwareBuffer2 = hardwareBuffer;
            o000OO0O.OooO0OO oooO0OO2 = oooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(hardwareBuffer2, "hardwareBuffer");
            OooOo oooOo = OooOo.this;
            oooOo.f82235OooO0o = false;
            boolean andSet = oooOo.f82234OooO0Oo.getAndSet(false);
            C24394OooOOo c24394OooOOo = (C24394OooOOo) oooOo.f82233OooO0OO.f82371OooO00o;
            if (andSet) {
                OooOOO0.OooO00o oooO00o = c24394OooOOo.f82361OooO0Oo;
            } else {
                OooOOO0.OooO00o oooO00o2 = c24394OooOOo.f82361OooO0Oo;
                SurfaceControlCompat surfaceControlCompat = oooO00o2.f82350OooO0O0;
                androidx.graphics.surface.OooO00o oooO00o3 = surfaceControlCompat.f65140OooO00o;
                if (oooO00o3.isValid()) {
                    HashMap map = new HashMap();
                    int i = Build.VERSION.SDK_INT;
                    OooO0o.OooO00o oooO00o4 = androidx.graphics.surface.OooO0o.f65129OooO00o;
                    OooO00o.OooO0O0 oooO0O0OooO0Oo = i >= 33 ? oooO00o4.OooO0Oo() : oooO00o4.OooO0OO();
                    oooO0O0OooO0Oo.o00Ooo(oooO00o3, Integer.MAX_VALUE);
                    C24034Oooo00O<C24394OooOOo<T>> c24034Oooo00O = oooO00o2.f82351OooO0OO;
                    C24394OooOOo c24394OooOOo2 = (C24394OooOOo) c24034Oooo00O.f80942OooOo0o;
                    o000OO0O.OooO0OO oooO0OO3 = (c24394OooOOo2 == null || !c24394OooOOo2.f82364OooO0oO.get()) ? oooO0OO2 : null;
                    o000O00O.OooOOO0<T> oooOOO0 = oooO00o2.f82349OooO00o;
                    oooO0O0OooO0Oo.o000OO(oooO00o3, hardwareBuffer2, oooO0OO3 != null ? oooO0OO3.f82811OooOo0o : null, new C24392OooOO0o(oooOOO0));
                    oooO0O0OooO0Oo.OoooOoo(oooO00o3, true);
                    oooO0O0OooO0Oo.o000O000(oooO00o3, oooO00o2.f82352OooO0Oo.f65140OooO00o);
                    if (oooO00o2.f82354OooO0o0 != -1) {
                        int i2 = oooO00o2.f82353OooO0o;
                        map.put(surfaceControlCompat, Integer.valueOf(i2));
                        oooO0O0OooO0Oo.o00000(oooO00o3, i2);
                    }
                    OooO0O0.C19023OooO0O0.OooO00o oooO00o5 = oooOOO0.f82330OooO0OO;
                    if (oooO00o5 != null) {
                        oooO00o5.f65200OooO00o.OooO00o();
                    }
                    map.clear();
                    oooO0O0OooO0Oo.commit();
                    C24394OooOOo c24394OooOOo3 = (C24394OooOOo) c24034Oooo00O.f80942OooOo0o;
                    if (c24394OooOOo3 != null) {
                        c24394OooOOo3.f82364OooO0oO.set(true);
                    }
                }
                if (oooO0OO2 != null) {
                    oooO0OO2.close();
                }
            }
            this.f82239OooOo.onComplete();
            C34426OooOO0o<OooO00o> c34426OooOO0o = oooOo.f82236OooO0o0;
            if (!c34426OooOO0o.isEmpty()) {
                oooOo.OooO0O0(c34426OooOO0o.removeFirst());
            } else if (oooOo.f82238OooO0oo.get()) {
                C24398OooOo0O c24398OooOo0O = oooOo.f82237OooO0oO;
                if (c24398OooOo0O != null) {
                    c24398OooOo0O.invoke();
                }
                oooOo.f82237OooO0oO = null;
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [o000O00.OooOo0] */
    public OooOo(o000O0Oo.OooO00o handlerThread, o000O00O.OooOo00 oooOo00, C24397OooOo0 c24397OooOo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(handlerThread, "handlerThread");
        this.f82231OooO00o = handlerThread;
        this.f82232OooO0O0 = oooOo00;
        this.f82233OooO0OO = c24397OooOo0;
        this.f82234OooO0Oo = new AtomicBoolean(false);
        this.f82236OooO0o0 = new C34426OooOO0o<>();
        this.f82238OooO0oo = new AtomicBoolean(false);
        this.f82230OooO = new Runnable() { // from class: o000O00.OooOo0
            @Override // java.lang.Runnable
            public final void run() {
                OooOo this$0 = this.f82241OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(this$0, "this$0");
                this$0.f82236OooO0o0.clear();
                if (this$0.f82235OooO0o) {
                    return;
                }
                this$0.f82234OooO0Oo.set(false);
            }
        };
    }

    public final void OooO00o() {
        if (this.f82238OooO0oo.get()) {
            return;
        }
        this.f82234OooO0Oo.set(true);
        o000O0Oo.OooO00o oooO00o = this.f82231OooO00o;
        oooO00o.getClass();
        Handler handler = oooO00o.f82379OooOo;
        handler.removeCallbacksAndMessages(this);
        RunnableC24375OooOo0 runnable = this.f82230OooO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(runnable, "runnable");
        handler.post(runnable);
    }

    public final void OooO0O0(OooO00o oooO00o) {
        if (this.f82235OooO0o) {
            C34426OooOO0o<OooO00o> c34426OooOO0o = this.f82236OooO0o0;
            OooO00o oooO00oOooO0oo = c34426OooOO0o.OooO0oo();
            if (oooO00o.OooO00o() && oooO00oOooO0oo != null && oooO00oOooO0oo.getId() == oooO00o.getId()) {
                return;
            }
            c34426OooOO0o.addLast(oooO00o);
            return;
        }
        this.f82235OooO0o = true;
        oooO00o.execute();
        final OooO0O0 oooO0O0 = new OooO0O0(oooO00o);
        o000O00O.OooOo00 oooOo00 = this.f82232OooO0O0;
        o000O0Oo.OooO00o executor = this.f82231OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
        C24394OooOOo<Object> c24394OooOOo = oooOo00.f82372OooO00o;
        OooO00o.OooO0O0 oooO0O0OooO00o = c24394OooOOo.f82365OooO0oo.OooO00o();
        int i = c24394OooOOo.f82360OooO0OO;
        if (i != -1) {
            oooO0O0OooO00o.OooO0O0(i);
        }
        oooO0O0OooO00o.f82172OooO0OO = true;
        ColorSpace colorSpace = c24394OooOOo.f82366OooOO0;
        if (colorSpace == null) {
            colorSpace = o000O00.OooO00o.f82167OooOoO0;
        }
        oooO0O0OooO00o.f82170OooO00o = colorSpace;
        oooO0O0OooO00o.OooO00o(executor, new Consumer() { // from class: o000O00O.OooOOoo
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) obj;
                oooO0O0.invoke(oooO0OO.f82174OooO00o, oooO0OO.f82175OooO0O0);
            }
        });
    }
}
