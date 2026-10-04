package o00O0oOo;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.vivo.penengine.impl.VivoAlgorithmManagerImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import o00OO00o.C24988OooO00o;

/* JADX INFO: renamed from: o00O0oOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24953OooO0o0 implements InterfaceC24957OooOO0O, o0oo0.OooO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Object f84648OooOo0o;

    public C24953OooO0o0(Context context) {
        this.f84648OooOo0o = new VivoAlgorithmManagerImpl(context);
    }

    @Override // o0oo0.OooO0o
    public PointF OooO00o(MotionEvent motionEvent) {
        return ((VivoAlgorithmManagerImpl) this.f84648OooOo0o).computeEstimatePoint(motionEvent);
    }

    @Override // o0oo0.OooO0o
    public void OooO0O0(View changedView, int i) {
        OooOOO0.OooO0oO(changedView, "changedView");
    }

    @Override // o0oo0.OooO0o
    public void OooO0OO(float f) {
    }

    @Override // o00O0oOo.InterfaceC24957OooOO0O
    public boolean OooO0o0() {
        ArrayList arrayList = (ArrayList) this.f84648OooOo0o;
        return arrayList.size() == 1 && ((C24988OooO00o) arrayList.get(0)).OooO00o();
    }

    @Override // o00O0oOo.InterfaceC24957OooOO0O
    public List OooO0oo() {
        return (ArrayList) this.f84648OooOo0o;
    }

    @Override // o0oo0.OooO0o
    public String getTypeName() {
        return "vivo";
    }

    public C24953OooO0o0(ArrayList arrayList) {
        this.f84648OooOo0o = arrayList;
    }
}
