package o0oo0Oo;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import com.android.billingclient.api.C22172OooOoO;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.penkit.models.DrawResult;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.List;
import o0O0oo00.OooO00o;
import o0Oo0ooO.C28460OooooO0;
import o0oo0o.InterfaceC31284OooO0O0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34435OooOoO0;

/* JADX INFO: renamed from: o0oo0Oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31251OooOOO0<T> extends AbstractC31239OooO00o<T> {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final int f111530OooOo0O = C28460OooooO0.OooO0O0(3);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o0O0oo00.OooO00o<T> f111531OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f111532OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float f111533OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f111534OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final PointF f111535OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final PointF f111536OooOo00;

    public C31251OooOOO0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C31251OooOOO0(o0O0oo00.OooO00o oooO00o) {
        Integer num;
        int color = Color.parseColor("#007AFF");
        float fOooO00o = C28460OooooO0.OooO00o(1.5f);
        this.f111531OooOOOo = oooO00o;
        this.f111533OooOOo0 = fOooO00o;
        this.f111532OooOOo = color;
        new PointF();
        this.f111536OooOo00 = new PointF();
        this.f111535OooOo0 = new PointF();
        ArrayList arrayList = new ArrayList();
        C34435OooOoO0 c34435OooOoO0 = C34435OooOoO0.f123454OooOo0o;
        while (c34435OooOoO0.hasNext()) {
            String str = (String) c34435OooOoO0.next();
            int iHashCode = str.hashCode();
            if (iHashCode != -891980232) {
                if (iHashCode != 100313435) {
                    num = (iHashCode == 109399969 && str.equals("shape")) ? 2 : null;
                } else if (str.equals("image")) {
                    num = 5;
                }
            } else if (str.equals("stroke")) {
                num = 0;
            }
            if (num != null) {
                arrayList.add(num);
            }
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final DrawResult OooO(float f, float f2, float f3, int i, List<? extends InterfaceC31284OooO0O0> displayItems) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(displayItems, "displayItems");
        DrawResult drawResultOooO = super.OooO(f, f2, f3, i, displayItems);
        if (i == 0) {
            this.f111534OooOOoo = 1;
            new PointF(0.0f, 0.0f);
            this.f111536OooOo00.set(f, f2);
            this.f111535OooOo0.set(f, f2);
            return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    this.f111534OooOOoo = 0;
                    return drawResultOooO;
                }
            } else if (this.f111534OooOOoo == 1) {
                this.f111535OooOo0.set(f, f2);
                return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
            }
        } else if (this.f111534OooOOoo == 1) {
            this.f111534OooOOoo = 0;
            RectF rectFOooOOOO = OooOOOO();
            float f4 = rectFOooOOOO.right - rectFOooOOOO.left;
            float f5 = f111530OooOo0O;
            if (f4 <= f5 && rectFOooOOOO.bottom - rectFOooOOOO.top <= f5) {
                return new DrawResult(1, drawResultOooO.getItem(), null, null, null, false, false, null, null, false, null, 2044, null);
            }
            OooOOOO();
            return new DrawResult(1, drawResultOooO.getItem(), null, null, C34434OooOoO.f123453OooOo0o, false, false, null, null, false, null, 1964, null);
        }
        return drawResultOooO;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0Oo() {
        return this.f111532OooOOo;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final Bundle OooO0o0() {
        return C22172OooOoO.OooO00o(C18437z2.f56754h, DrawToolFactory.LASSO_TYPE_CAPTURE);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final int OooO0oO() {
        return 4;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final float OooO0oo() {
        return this.f111533OooOOo0;
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0(o0O0oo00.OooO0O0<T> target, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(target, "target");
        if (z) {
            o0O0oo00.OooO00o<T> oooO00o = this.f111531OooOOOo;
            oooO00o.OooOo00(target);
            OooO00o.C19734OooO00o.OooO00o(this.f111531OooOOOo, this.f111532OooOOo, this.f111533OooOOo0, 0, -1, false, 16);
            oooO00o.OooOOoo(OooOOOO());
            oooO00o.OooOOOO(1.0f);
            int i = this.f111532OooOOo;
            OooO00o.C19734OooO00o.OooO00o(this.f111531OooOOOo, Color.argb(51, Color.red(i), Color.green(i), Color.blue(i)), 0.0f, 1, -1, false, 16);
            oooO00o.OooOOoo(OooOOOO());
            oooO00o.OooOOOO(1.0f);
        }
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0O() {
        this.f111534OooOOoo = 0;
        new PointF(0.0f, 0.0f);
        this.f111536OooOo00.set(0.0f, 0.0f);
        this.f111535OooOo0.set(0.0f, 0.0f);
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOO0o(float f) {
    }

    @Override // o0oo0Oo.AbstractC31239OooO00o
    public final void OooOOO(List<? extends InterfaceC31284OooO0O0> list) {
    }

    public final RectF OooOOOO() {
        PointF pointF = this.f111536OooOo00;
        float f = pointF.x;
        PointF pointF2 = this.f111535OooOo0;
        return new RectF(Math.min(f, pointF2.x), Math.min(pointF.y, pointF2.y), Math.max(pointF.x, pointF2.x), Math.max(pointF.y, pointF2.y));
    }
}
