package o000O00;

import android.graphics.ColorSpace;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.os.Build;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements AutoCloseable {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final ColorSpace f82167OooOoO0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f82168OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC19613OooO00o f82169OooOo0o;

    /* JADX INFO: renamed from: o000O00.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19613OooO00o extends AutoCloseable {
        void Oooooo0(HardwareBuffer hardwareBuffer, o000OO0O.OooO0OO oooO0OO);

        boolean isClosed();

        void o000O0o(OooO0O0 oooO0O0, Executor executor, Consumer<OooO0OO> consumer);

        void oo000o(RenderNode renderNode);
    }

    public final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public ColorSpace f82170OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f82171OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f82172OooO0OO;

        public OooO0O0() {
            ColorSpace colorSpace = OooO00o.f82167OooOoO0;
            this.f82170OooO00o = OooO00o.f82167OooOoO0;
        }

        public final void OooO00o(Executor executor, Consumer<OooO0OO> consumer) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(executor, "executor");
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.f82169OooOo0o.isClosed()) {
                throw new IllegalStateException("Attempt to draw after renderer has been closed");
            }
            oooO00o.f82169OooOo0o.o000O0o(this, executor, consumer);
        }

        public final void OooO0O0(int i) {
            if (i != 0 && i != 4 && i != 3 && i != 7) {
                throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Invalid transform provided, must be one of the SurfaceControlCompat.BufferTransform values received: "));
            }
            this.f82171OooO0O0 = i;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HardwareBuffer f82174OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000OO0O.OooO0OO f82175OooO0O0;

        public OooO0OO(HardwareBuffer hardwareBuffer, o000OO0O.OooO0OO oooO0OO) {
            this.f82174OooO00o = hardwareBuffer;
            this.f82175OooO0O0 = oooO0OO;
        }
    }

    static {
        ColorSpace colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        kotlin.jvm.internal.OooOOO0.OooO0o(colorSpace, "get(ColorSpace.Named.SRGB)");
        f82167OooOoO0 = colorSpace;
    }

    public OooO00o(int i, int i2, int i3, int i4, int i5, long j) {
        this.f82169OooOo0o = (Build.VERSION.SDK_INT < 34 || i5 != 0) ? new OooO0o(i, i2, i3, i4, i5, j) : new C24372OooOOo(i, i2, i3, j, i4);
        this.f82168OooOo = new OooO0O0();
    }

    public final OooO0O0 OooO00o() {
        OooO0O0 oooO0O0 = this.f82168OooOo;
        oooO0O0.getClass();
        oooO0O0.f82170OooO00o = f82167OooOoO0;
        oooO0O0.f82171OooO0O0 = 0;
        oooO0O0.f82172OooO0OO = false;
        return oooO0O0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f82169OooOo0o.close();
    }

    public final void oo000o(RenderNode renderNode) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(renderNode, "renderNode");
        this.f82169OooOo0o.oo000o(renderNode);
    }
}
