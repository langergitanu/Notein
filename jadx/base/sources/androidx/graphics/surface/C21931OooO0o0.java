package androidx.graphics.surface;

import OooooOO.C21309OooOOOO;
import OooooOO.C21316OooOo00;
import android.hardware.HardwareBuffer;
import android.hardware.SyncFence;
import android.os.Build;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import androidx.graphics.surface.OooO00o;
import androidx.graphics.surface.SurfaceControlCompat;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000O0.OooO;
import o000O0.OooOO0O;
import o000OO0O.C24494OooO0oO;
import o000OO0O.InterfaceC24492OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: androidx.graphics.surface.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21931OooO0o0 implements androidx.graphics.surface.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SurfaceControl f65130OooO00o;

    /* JADX INFO: renamed from: androidx.graphics.surface.OooO0o0$OooO00o */
    public static final class OooO00o implements OooO00o.InterfaceC19018OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SurfaceControl.Builder f65131OooO00o = C21309OooOOOO.OooO0O0();

        @Override // androidx.graphics.surface.OooO00o.InterfaceC19018OooO00o
        public final OooO00o.InterfaceC19018OooO00o OooO00o(SurfaceView surfaceView) {
            OooOOO0.OooO0oO(surfaceView, "surfaceView");
            this.f65131OooO00o.setParent(surfaceView.getSurfaceControl());
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.InterfaceC19018OooO00o
        public final OooO00o.InterfaceC19018OooO00o OooO0O0(SurfaceControlCompat surfaceControlCompat) {
            SurfaceControl.Builder builder = this.f65131OooO00o;
            androidx.graphics.surface.OooO00o oooO00o = surfaceControlCompat.f65140OooO00o;
            OooOOO0.OooO0oO(oooO00o, "<this>");
            if (!(oooO00o instanceof C21931OooO0o0)) {
                throw new IllegalArgumentException("Parent implementation is not for Android T");
            }
            builder.setParent(((C21931OooO0o0) oooO00o).f65130OooO00o);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.InterfaceC19018OooO00o
        public final androidx.graphics.surface.OooO00o build() {
            SurfaceControl surfaceControlBuild = this.f65131OooO00o.build();
            OooOOO0.OooO0o(surfaceControlBuild, "builder.build()");
            return new C21931OooO0o0(surfaceControlBuild);
        }

        @Override // androidx.graphics.surface.OooO00o.InterfaceC19018OooO00o
        public final OooO00o.InterfaceC19018OooO00o setName(String str) {
            this.f65131OooO00o.setName(str);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.graphics.surface.OooO0o0$OooO0O0 */
    public static final class OooO0O0 implements OooO00o.OooO0O0 {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final SurfaceControl.Transaction f65132OooOo0o = C21316OooOo00.OooO0O0();

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 OooOoo0(androidx.graphics.surface.OooO00o surfaceControl) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            SurfaceControl.Transaction transaction = this.f65132OooOo0o;
            if (!(surfaceControl instanceof C21931OooO0o0)) {
                throw new IllegalArgumentException("Parent implementation is not for Android T");
            }
            transaction.setPosition(((C21931OooO0o0) surfaceControl).f65130OooO00o, 0.0f, 0.0f);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 OoooOoo(androidx.graphics.surface.OooO00o surfaceControl, boolean z) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            SurfaceControl.Transaction transaction = this.f65132OooOo0o;
            if (!(surfaceControl instanceof C21931OooO0o0)) {
                throw new IllegalArgumentException("Parent implementation is not for Android T");
            }
            transaction.setVisibility(((C21931OooO0o0) surfaceControl).f65130OooO00o, z);
            return this;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f65132OooOo0o.close();
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final void commit() {
            this.f65132OooOo0o.apply();
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o00000(androidx.graphics.surface.OooO00o surfaceControl, int i) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            SurfaceControl.Transaction transaction = this.f65132OooOo0o;
            if (!(surfaceControl instanceof C21931OooO0o0)) {
                throw new IllegalArgumentException("Parent implementation is not for Android T");
            }
            transaction.setBufferTransform(((C21931OooO0o0) surfaceControl).f65130OooO00o, i);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o0000OO(androidx.graphics.surface.OooO00o scImpl) {
            OooOOO0.OooO0oO(scImpl, "scImpl");
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                OooOO0O oooOO0O = OooOO0O.f82165OooO00o;
                SurfaceControl.Transaction transaction = this.f65132OooOo0o;
                if (!(scImpl instanceof C21931OooO0o0)) {
                    throw new IllegalArgumentException("Parent implementation is not for Android T");
                }
                oooOO0O.OooO00o(transaction, ((C21931OooO0o0) scImpl).f65130OooO00o, 1000.0f, 0, 0);
                return this;
            }
            if (i < 30) {
                return this;
            }
            OooO oooO = OooO.f82162OooO00o;
            SurfaceControl.Transaction transaction2 = this.f65132OooOo0o;
            if (!(scImpl instanceof C21931OooO0o0)) {
                throw new IllegalArgumentException("Parent implementation is not for Android T");
            }
            oooO.OooO00o(transaction2, ((C21931OooO0o0) scImpl).f65130OooO00o, 1000.0f, 0);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final void o0000o0o(AttachedSurfaceControl attachedSurfaceControl) {
            attachedSurfaceControl.applyTransactionOnDraw(this.f65132OooOo0o);
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o000O000(androidx.graphics.surface.OooO00o surfaceControl, androidx.graphics.surface.OooO00o oooO00o) {
            SurfaceControl surfaceControl2;
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            SurfaceControl.Transaction transaction = this.f65132OooOo0o;
            if (!(surfaceControl instanceof C21931OooO0o0)) {
                throw new IllegalArgumentException("Parent implementation is not for Android T");
            }
            SurfaceControl surfaceControl3 = ((C21931OooO0o0) surfaceControl).f65130OooO00o;
            if (oooO00o == null) {
                surfaceControl2 = null;
            } else {
                if (!(oooO00o instanceof C21931OooO0o0)) {
                    throw new IllegalArgumentException("Parent implementation is not for Android T");
                }
                surfaceControl2 = ((C21931OooO0o0) oooO00o).f65130OooO00o;
            }
            transaction.reparent(surfaceControl3, surfaceControl2);
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [o000O0.OooO0oO] */
        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o000O0O(Executor executor, final SurfaceControlCompat.TransactionCommittedListener transactionCommittedListener) {
            OooOOO0.OooO0oO(executor, "executor");
            this.f65132OooOo0o.addTransactionCommittedListener(executor, new SurfaceControl.TransactionCommittedListener() { // from class: o000O0.OooO0oO
                @Override // android.view.SurfaceControl.TransactionCommittedListener
                public final void onTransactionCommitted() {
                    SurfaceControlCompat.TransactionCommittedListener listener = transactionCommittedListener;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(listener, "$listener");
                    listener.onTransactionCommitted();
                }
            });
            return this;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o000O0.OooO0o] */
        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o000OO(androidx.graphics.surface.OooO00o surfaceControl, HardwareBuffer hardwareBuffer, InterfaceC24492OooO0Oo interfaceC24492OooO0Oo, final InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
            SyncFence syncFence;
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            SurfaceControl.Transaction transaction = this.f65132OooOo0o;
            if (!(surfaceControl instanceof C21931OooO0o0)) {
                throw new IllegalArgumentException("Parent implementation is not for Android T");
            }
            SurfaceControl surfaceControl2 = ((C21931OooO0o0) surfaceControl).f65130OooO00o;
            if (interfaceC24492OooO0Oo == null) {
                syncFence = null;
            } else {
                if (!(interfaceC24492OooO0Oo instanceof C24494OooO0oO)) {
                    throw new IllegalArgumentException("Expected SyncFenceCompat implementation for API level 33");
                }
                syncFence = ((C24494OooO0oO) interfaceC24492OooO0Oo).f82812OooOo0o;
            }
            transaction.setBuffer(surfaceControl2, hardwareBuffer, syncFence, new Consumer(interfaceC32507OooOO0o) { // from class: o000O0.OooO0o

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ OooOOOO f82163OooOo0o;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.f82163OooOo0o = (OooOOOO) interfaceC32507OooOO0o;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    SyncFence syncFence2 = (SyncFence) obj;
                    ?? r0 = this.f82163OooOo0o;
                    if (r0 != 0) {
                        kotlin.jvm.internal.OooOOO0.OooO0o(syncFence2, "syncFence");
                        r0.invoke(new o000OO0O.OooO0OO(syncFence2));
                    }
                }
            });
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o00Ooo(androidx.graphics.surface.OooO00o surfaceControl, int i) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            SurfaceControl.Transaction transaction = this.f65132OooOo0o;
            if (!(surfaceControl instanceof C21931OooO0o0)) {
                throw new IllegalArgumentException("Parent implementation is not for Android T");
            }
            transaction.setLayer(((C21931OooO0o0) surfaceControl).f65130OooO00o, i);
            return this;
        }

        @Override // androidx.graphics.surface.OooO00o.OooO0O0
        public final OooO00o.OooO0O0 o00ooo(androidx.graphics.surface.OooO00o scImpl) {
            OooOOO0.OooO0oO(scImpl, "scImpl");
            if (Build.VERSION.SDK_INT < 34) {
                return this;
            }
            o000O0.OooOOO0 oooOOO0 = o000O0.OooOOO0.f82166OooO00o;
            SurfaceControl.Transaction transaction = this.f65132OooOo0o;
            if (!(scImpl instanceof C21931OooO0o0)) {
                throw new IllegalArgumentException("Parent implementation is not for Android T");
            }
            oooOOO0.OooO00o(transaction, ((C21931OooO0o0) scImpl).f65130OooO00o);
            return this;
        }
    }

    public C21931OooO0o0(SurfaceControl surfaceControl) {
        this.f65130OooO00o = surfaceControl;
    }

    @Override // androidx.graphics.surface.OooO00o
    public final boolean isValid() {
        return this.f65130OooO00o.isValid();
    }

    @Override // androidx.graphics.surface.OooO00o
    public final void release() {
        this.f65130OooO00o.release();
    }
}
