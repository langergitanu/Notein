package androidx.graphics.surface;

import android.hardware.HardwareBuffer;
import android.os.Build;
import android.view.AttachedSurfaceControl;
import android.view.Surface;
import android.view.SurfaceView;
import androidx.graphics.surface.C21932OooO0oO;
import androidx.graphics.surface.OooO00o;
import androidx.graphics.surface.SurfaceControlCompat;
import androidx.hardware.SyncFenceV19;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000OO0O.InterfaceC24492OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements androidx.graphics.surface.OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final HardwareBuffer f65115OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000OO0O.OooO0OO f65116OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21932OooO0oO f65117OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooOOOO f65118OooO0O0;

    public static final class OooO00o implements OooO00o.InterfaceC19018OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C21932OooO0oO.OooO00o f65119OooO00o;

        @Override // androidx.graphics.surface.OooO00o.InterfaceC19018OooO00o
        public final OooO00o.InterfaceC19018OooO00o OooO00o(SurfaceView surfaceView) {
            OooOOO0.OooO0oO(surfaceView, "surfaceView");
            Surface surface = surfaceView.getHolder().getSurface();
            OooOOO0.OooO0o(surface, "surfaceView.holder.surface");
            C21932OooO0oO.OooO00o oooO00o = this.f65119OooO00o;
            oooO00o.getClass();
            oooO00o.f65134OooO00o = surface;
            oooO00o.f65135OooO0O0 = null;
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.InterfaceC19018OooO00o
        public final OooO00o.InterfaceC19018OooO00o OooO0O0(SurfaceControlCompat surfaceControlCompat) {
            HardwareBuffer hardwareBuffer = OooO0O0.f65115OooO0OO;
            C21932OooO0oO c21932OooO0oOOooO00o = C19019OooO0O0.OooO00o(surfaceControlCompat.f65140OooO00o);
            C21932OooO0oO.OooO00o oooO00o = this.f65119OooO00o;
            oooO00o.getClass();
            oooO00o.f65134OooO00o = null;
            oooO00o.f65135OooO0O0 = c21932OooO0oOOooO00o;
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.InterfaceC19018OooO00o
        public final androidx.graphics.surface.OooO00o build() {
            C21932OooO0oO c21932OooO0oO;
            C21932OooO0oO.OooO00o oooO00o = this.f65119OooO00o;
            Surface surface = oooO00o.f65134OooO00o;
            C21932OooO0oO c21932OooO0oO2 = oooO00o.f65135OooO0O0;
            if (surface != null) {
                String str = oooO00o.f65136OooO0OO;
                if (str == null) {
                    OooOOO0.OooOOOO("mDebugName");
                    throw null;
                }
                c21932OooO0oO = new C21932OooO0oO();
                long jNCreateFromSurface = JniBindings.f65114OooO00o.nCreateFromSurface(surface, str);
                c21932OooO0oO.f65133OooO00o = jNCreateFromSurface;
                if (jNCreateFromSurface == 0) {
                    throw new IllegalArgumentException();
                }
            } else {
                if (c21932OooO0oO2 == null) {
                    throw new IllegalStateException("");
                }
                String str2 = oooO00o.f65136OooO0OO;
                if (str2 == null) {
                    OooOOO0.OooOOOO("mDebugName");
                    throw null;
                }
                C21932OooO0oO c21932OooO0oO3 = new C21932OooO0oO();
                long jNCreate = JniBindings.f65114OooO00o.nCreate(c21932OooO0oO2.f65133OooO00o, str2);
                c21932OooO0oO3.f65133OooO00o = jNCreate;
                if (jNCreate == 0) {
                    throw new IllegalArgumentException();
                }
                c21932OooO0oO = c21932OooO0oO3;
            }
            return new OooO0O0(c21932OooO0oO);
        }

        @Override // androidx.graphics.surface.OooO00o.InterfaceC19018OooO00o
        public final OooO00o.InterfaceC19018OooO00o setName(String str) {
            C21932OooO0oO.OooO00o oooO00o = this.f65119OooO00o;
            oooO00o.getClass();
            oooO00o.f65136OooO0OO = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.graphics.surface.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C19019OooO0O0 {
        public static C21932OooO0oO OooO00o(androidx.graphics.surface.OooO00o oooO00o) {
            OooOOO0.OooO0oO(oooO00o, "<this>");
            if (oooO00o instanceof OooO0O0) {
                return ((OooO0O0) oooO00o).f65117OooO00o;
            }
            throw new IllegalArgumentException("Parent implementation is only for Android T+.");
        }
    }

    public static final class OooO0OO implements OooO00o.OooO0O0 {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final HashMap<androidx.graphics.surface.OooO00o, OooO00o> f65120OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C21932OooO0oO.OooO0O0 f65121OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final HashMap<androidx.graphics.surface.OooO00o, Integer> f65122OooOoO0;

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final int f65123OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public final int f65124OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public final OooOOOO f65125OooO0OO;

            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(int i, int i2, InterfaceC32507OooOO0o<? super o000OO0O.OooO0OO, C32460OooOooO> interfaceC32507OooOO0o) {
                this.f65123OooO00o = i;
                this.f65124OooO0O0 = i2;
                this.f65125OooO0OO = (OooOOOO) interfaceC32507OooOO0o;
            }
        }

        public OooO0OO() {
            C21932OooO0oO.OooO0O0 oooO0O0 = new C21932OooO0oO.OooO0O0();
            long jNTransactionCreate = JniBindings.f65114OooO00o.nTransactionCreate();
            oooO0O0.f65137OooO00o = jNTransactionCreate;
            if (jNTransactionCreate == 0) {
                throw new IllegalArgumentException();
            }
            this.f65121OooOo0o = oooO0O0;
            this.f65120OooOo = new HashMap<>();
            this.f65122OooOoO0 = new HashMap<>();
        }

        public final void OooO00o(androidx.graphics.surface.OooO00o scImpl, float f) {
            OooOOO0.OooO0oO(scImpl, "scImpl");
            HardwareBuffer hardwareBuffer = OooO0O0.f65115OooO0OO;
            C21932OooO0oO c21932OooO0oOOooO00o = C19019OooO0O0.OooO00o(scImpl);
            C21932OooO0oO.OooO0O0 oooO0O0 = this.f65121OooOo0o;
            oooO0O0.getClass();
            JniBindings.f65114OooO00o.nSetFrameRate(oooO0O0.f65137OooO00o, c21932OooO0oOOooO00o.f65133OooO00o, f, 0, 0);
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 OooOoo0(androidx.graphics.surface.OooO00o surfaceControl) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            HardwareBuffer hardwareBuffer = OooO0O0.f65115OooO0OO;
            C21932OooO0oO c21932OooO0oOOooO00o = C19019OooO0O0.OooO00o(surfaceControl);
            C21932OooO0oO.OooO0O0 oooO0O0 = this.f65121OooOo0o;
            oooO0O0.getClass();
            JniBindings.f65114OooO00o.nSetPosition(oooO0O0.f65137OooO00o, c21932OooO0oOOooO00o.f65133OooO00o, 0.0f, 0.0f);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 OoooOoo(androidx.graphics.surface.OooO00o surfaceControl, boolean z) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            HardwareBuffer hardwareBuffer = OooO0O0.f65115OooO0OO;
            C21932OooO0oO c21932OooO0oOOooO00o = C19019OooO0O0.OooO00o(surfaceControl);
            C21932OooO0oO.OooO0O0 oooO0O0 = this.f65121OooOo0o;
            oooO0O0.getClass();
            JniBindings.f65114OooO00o.nSetVisibility(oooO0O0.f65137OooO00o, c21932OooO0oOOooO00o.f65133OooO00o, z ? (byte) 1 : (byte) 0);
            return this;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            C21932OooO0oO.OooO0O0 oooO0O0 = this.f65121OooOo0o;
            long j = oooO0O0.f65137OooO00o;
            if (j != 0) {
                JniBindings.f65114OooO00o.nTransactionDelete(j);
                oooO0O0.f65137OooO00o = 0L;
            }
        }

        /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final void commit() {
            HashMap<androidx.graphics.surface.OooO00o, OooO00o> map;
            C21932OooO0oO.OooO0O0 oooO0O0;
            OooO00o oooO00o;
            int i;
            int i2;
            HashMap<androidx.graphics.surface.OooO00o, Integer> map2 = this.f65122OooOoO0;
            Iterator<androidx.graphics.surface.OooO00o> it = map2.keySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = this.f65120OooOo;
                oooO0O0 = this.f65121OooOo0o;
                if (!zHasNext) {
                    break;
                }
                androidx.graphics.surface.OooO00o surfaceControl = it.next();
                OooO00o oooO00o2 = map.get(surfaceControl);
                if (oooO00o2 != null) {
                    Integer orDefault = map2.getOrDefault(surfaceControl, -1);
                    OooOOO0.OooO0o(orDefault, "pendingSetTransformCalls…ORM\n                    )");
                    int iIntValue = orDefault.intValue();
                    if (iIntValue != -1) {
                        int i3 = oooO00o2.f65124OooO0O0;
                        int i4 = oooO00o2.f65123OooO00o;
                        if (iIntValue == 4 || iIntValue == 7) {
                            i = i3;
                            i2 = i4;
                        } else {
                            i2 = i3;
                            i = i4;
                        }
                        HardwareBuffer hardwareBuffer = OooO0O0.f65115OooO0OO;
                        OooOOO0.OooO0o(surfaceControl, "surfaceControl");
                        C21932OooO0oO c21932OooO0oOOooO00o = C19019OooO0O0.OooO00o(surfaceControl);
                        oooO0O0.getClass();
                        JniBindings.f65114OooO00o.nSetGeometry(oooO0O0.f65137OooO00o, c21932OooO0oOOooO00o.f65133OooO00o, oooO00o2.f65123OooO00o, oooO00o2.f65124OooO0O0, i, i2, iIntValue);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (androidx.graphics.surface.OooO00o oooO00o3 : map.keySet()) {
                OooO0O0 oooO0O02 = oooO00o3 instanceof OooO0O0 ? (OooO0O0) oooO00o3 : null;
                if (oooO0O02 != null && (oooO00o = map.get(oooO00o3)) != null) {
                    arrayList.add(new androidx.graphics.surface.OooO0OO(oooO0O02, oooO00o.f65125OooO0OO));
                }
            }
            if (arrayList.size() > 0) {
                C21930OooO0Oo c21930OooO0Oo = new C21930OooO0Oo(arrayList);
                oooO0O0.getClass();
                JniBindings.f65114OooO00o.nTransactionSetOnComplete(oooO0O0.f65137OooO00o, c21930OooO0Oo);
            }
            map.clear();
            map2.clear();
            oooO0O0.getClass();
            JniBindings.f65114OooO00o.nTransactionApply(oooO0O0.f65137OooO00o);
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o00000(androidx.graphics.surface.OooO00o surfaceControl, int i) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            if (Build.VERSION.SDK_INT < 31) {
                this.f65122OooOoO0.put(surfaceControl, Integer.valueOf(i));
                return this;
            }
            HardwareBuffer hardwareBuffer = OooO0O0.f65115OooO0OO;
            C21932OooO0oO c21932OooO0oOOooO00o = C19019OooO0O0.OooO00o(surfaceControl);
            C21932OooO0oO.OooO0O0 oooO0O0 = this.f65121OooOo0o;
            oooO0O0.getClass();
            JniBindings.f65114OooO00o.nSetBufferTransform(oooO0O0.f65137OooO00o, c21932OooO0oOOooO00o.f65133OooO00o, i);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final /* bridge */ /* synthetic */ OooO00o.OooO0O0 o0000OO(androidx.graphics.surface.OooO00o oooO00o) {
            OooO00o(oooO00o, 1000.0f);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final void o0000o0o(AttachedSurfaceControl attachedSurfaceControl) {
            throw new UnsupportedOperationException("Committing transactions synchronously with the draw pass of an AttachedSurfaceControl is only available on Android T+.");
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o000O000(androidx.graphics.surface.OooO00o surfaceControl, androidx.graphics.surface.OooO00o oooO00o) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            HardwareBuffer hardwareBuffer = OooO0O0.f65115OooO0OO;
            C21932OooO0oO c21932OooO0oOOooO00o = C19019OooO0O0.OooO00o(surfaceControl);
            C21932OooO0oO c21932OooO0oOOooO00o2 = oooO00o != null ? C19019OooO0O0.OooO00o(oooO00o) : null;
            C21932OooO0oO.OooO0O0 oooO0O0 = this.f65121OooOo0o;
            oooO0O0.getClass();
            JniBindings.f65114OooO00o.nTransactionReparent(oooO0O0.f65137OooO00o, c21932OooO0oOOooO00o.f65133OooO00o, c21932OooO0oOOooO00o2 != null ? c21932OooO0oOOooO00o2.f65133OooO00o : 0L);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o000O0O(Executor executor, SurfaceControlCompat.TransactionCommittedListener transactionCommittedListener) {
            OooOOO0.OooO0oO(executor, "executor");
            C21932OooO0oO.OooO0O0 oooO0O0 = this.f65121OooOo0o;
            oooO0O0.getClass();
            JniBindings.f65114OooO00o.nTransactionSetOnCommit(oooO0O0.f65137OooO00o, new C21933OooO0oo(executor, transactionCommittedListener));
            return this;
        }

        /* JADX WARN: Type inference failed for: r11v6, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o000OO(androidx.graphics.surface.OooO00o surfaceControl, HardwareBuffer hardwareBuffer, InterfaceC24492OooO0Oo interfaceC24492OooO0Oo, InterfaceC32507OooOO0o<? super o000OO0O.OooO0OO, C32460OooOooO> interfaceC32507OooOO0o) {
            ?? r11;
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            HashMap<androidx.graphics.surface.OooO00o, OooO00o> map = this.f65120OooOo;
            OooO00o oooO00oPut = hardwareBuffer != null ? map.put(surfaceControl, new OooO00o(hardwareBuffer.getWidth(), hardwareBuffer.getHeight(), interfaceC32507OooOO0o)) : map.remove(surfaceControl);
            if (oooO00oPut != null && (r11 = oooO00oPut.f65125OooO0OO) != 0) {
                r11.invoke(OooO0O0.f65116OooO0Oo);
            }
            if (hardwareBuffer == null) {
                hardwareBuffer = OooO0O0.f65115OooO0OO;
            }
            HardwareBuffer hardwareBuffer2 = hardwareBuffer;
            C21932OooO0oO.OooO0O0 oooO0O0 = this.f65121OooOo0o;
            if (interfaceC24492OooO0Oo == null) {
                HardwareBuffer hardwareBuffer3 = OooO0O0.f65115OooO0OO;
                C21932OooO0oO c21932OooO0oOOooO00o = C19019OooO0O0.OooO00o(surfaceControl);
                SyncFenceV19 syncFenceV19 = new SyncFenceV19(-1);
                oooO0O0.getClass();
                JniBindings.f65114OooO00o.nSetBuffer(oooO0O0.f65137OooO00o, c21932OooO0oOOooO00o.f65133OooO00o, hardwareBuffer2, syncFenceV19);
                return this;
            }
            HardwareBuffer hardwareBuffer4 = OooO0O0.f65115OooO0OO;
            C21932OooO0oO c21932OooO0oOOooO00o2 = C19019OooO0O0.OooO00o(surfaceControl);
            if (!(interfaceC24492OooO0Oo instanceof SyncFenceV19)) {
                throw new IllegalArgumentException("Expected SyncFenceCompat implementation for API level 19");
            }
            oooO0O0.getClass();
            JniBindings.f65114OooO00o.nSetBuffer(oooO0O0.f65137OooO00o, c21932OooO0oOOooO00o2.f65133OooO00o, hardwareBuffer2, (SyncFenceV19) interfaceC24492OooO0Oo);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o00Ooo(androidx.graphics.surface.OooO00o surfaceControl, int i) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            HardwareBuffer hardwareBuffer = OooO0O0.f65115OooO0OO;
            C21932OooO0oO c21932OooO0oOOooO00o = C19019OooO0O0.OooO00o(surfaceControl);
            C21932OooO0oO.OooO0O0 oooO0O0 = this.f65121OooOo0o;
            oooO0O0.getClass();
            JniBindings.f65114OooO00o.nSetZOrder(oooO0O0.f65137OooO00o, c21932OooO0oOOooO00o.f65133OooO00o, i);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o00ooo(androidx.graphics.surface.OooO00o scImpl) {
            OooOOO0.OooO0oO(scImpl, "scImpl");
            OooO00o(scImpl, 0.0f);
            return this;
        }
    }

    static {
        HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(1, 1, 1, 1, 2816L);
        OooOOO0.OooO0o(hardwareBufferCreate, "create(\n            1,\n …Utils.BaseFlags\n        )");
        f65115OooO0OO = hardwareBufferCreate;
        f65116OooO0Oo = new o000OO0O.OooO0OO(new SyncFenceV19(-1));
    }

    public OooO0O0(C21932OooO0oO c21932OooO0oO) {
        this.f65117OooO00o = c21932OooO0oO;
    }

    @Override // androidx.graphics.surface.OooO00o
    public final boolean isValid() {
        return this.f65117OooO00o.f65133OooO00o != 0;
    }

    @Override // androidx.graphics.surface.OooO00o
    public final void release() {
        C21932OooO0oO c21932OooO0oO = this.f65117OooO00o;
        long j = c21932OooO0oO.f65133OooO00o;
        if (j != 0) {
            JniBindings.f65114OooO00o.nRelease(j);
            c21932OooO0oO.f65133OooO00o = 0L;
        }
    }
}
