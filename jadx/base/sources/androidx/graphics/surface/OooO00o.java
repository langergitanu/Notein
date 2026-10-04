package androidx.graphics.surface;

import android.hardware.HardwareBuffer;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import androidx.graphics.surface.SurfaceControlCompat;
import java.util.concurrent.Executor;
import o000OO0O.InterfaceC24492OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public interface OooO00o {

    /* JADX INFO: renamed from: androidx.graphics.surface.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC19018OooO00o {
        InterfaceC19018OooO00o OooO00o(SurfaceView surfaceView);

        InterfaceC19018OooO00o OooO0O0(SurfaceControlCompat surfaceControlCompat);

        OooO00o build();

        InterfaceC19018OooO00o setName(String str);
    }

    public interface OooO0O0 extends AutoCloseable {
        OooO0O0 OooOoo0(OooO00o oooO00o);

        OooO0O0 OoooOoo(OooO00o oooO00o, boolean z);

        void commit();

        OooO0O0 o00000(OooO00o oooO00o, int i);

        OooO0O0 o0000OO(OooO00o oooO00o);

        void o0000o0o(AttachedSurfaceControl attachedSurfaceControl);

        OooO0O0 o000O000(OooO00o oooO00o, OooO00o oooO00o2);

        OooO0O0 o000O0O(Executor executor, SurfaceControlCompat.TransactionCommittedListener transactionCommittedListener);

        OooO0O0 o000OO(OooO00o oooO00o, HardwareBuffer hardwareBuffer, InterfaceC24492OooO0Oo interfaceC24492OooO0Oo, InterfaceC32507OooOO0o<? super o000OO0O.OooO0OO, C32460OooOooO> interfaceC32507OooOO0o);

        OooO0O0 o00Ooo(OooO00o oooO00o, int i);

        OooO0O0 o00ooo(OooO00o oooO00o);
    }

    boolean isValid();

    void release();
}
