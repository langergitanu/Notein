package androidx.graphics.surface;

import android.hardware.HardwareBuffer;
import android.os.Build;
import androidx.graphics.surface.OooO00o;
import androidx.graphics.surface.OooO0o;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceControlCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.graphics.surface.OooO00o f65140OooO00o;

    public static final class OooO00o implements AutoCloseable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final OooO00o.OooO0O0 f65141OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final HashMap<SurfaceControlCompat, Integer> f65142OooOo0o = new HashMap<>();

        public OooO00o() {
            int i = Build.VERSION.SDK_INT;
            OooO0o.OooO00o oooO00o = OooO0o.f65129OooO00o;
            this.f65141OooOo = i >= 33 ? oooO00o.OooO0Oo() : oooO00o.OooO0OO();
        }

        public final void OooO00o(Executor executor, TransactionCommittedListener transactionCommittedListener) {
            OooOOO0.OooO0oO(executor, "executor");
            this.f65141OooOo.o000O0O(executor, transactionCommittedListener);
        }

        public final void OooO0OO(SurfaceControlCompat surfaceControl, HardwareBuffer hardwareBuffer, o000OO0O.OooO0OO oooO0OO, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            this.f65141OooOo.o000OO(surfaceControl.f65140OooO00o, hardwareBuffer, oooO0OO != null ? oooO0OO.f82811OooOo0o : null, interfaceC32507OooOO0o);
        }

        public final void OooOOO0(SurfaceControlCompat surfaceControl, int i) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            this.f65142OooOo0o.put(surfaceControl, Integer.valueOf(i));
            this.f65141OooOo.o00000(surfaceControl.f65140OooO00o, i);
        }

        public final void OooOOo0(SurfaceControlCompat surfaceControl, boolean z) {
            OooOOO0.OooO0oO(surfaceControl, "surfaceControl");
            this.f65141OooOo.OoooOoo(surfaceControl.f65140OooO00o, z);
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            this.f65141OooOo.close();
        }

        public final void commit() {
            this.f65142OooOo0o.clear();
            this.f65141OooOo.commit();
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m80612d2 = {"Landroidx/graphics/surface/SurfaceControlCompat$TransactionCommittedListener;", "", "LoO00ooO/OooOooO;", "onTransactionCommitted", "()V", "graphics-core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public interface TransactionCommittedListener {
        void onTransactionCommitted();
    }

    @Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m80612d2 = {"Landroidx/graphics/surface/SurfaceControlCompat$TransactionCompletedListener;", "", "", "transactionStats", "LoO00ooO/OooOooO;", "onTransactionCompleted", "(J)V", "graphics-core_release"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public interface TransactionCompletedListener {
        void onTransactionCompleted(long transactionStats);
    }

    public SurfaceControlCompat(androidx.graphics.surface.OooO00o scImpl) {
        OooOOO0.OooO0oO(scImpl, "scImpl");
        this.f65140OooO00o = scImpl;
    }
}
