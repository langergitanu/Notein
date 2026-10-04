package o0o0OoOo;

import android.graphics.PointF;
import com.orion.notein.domain.models.page.Page;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o0OoOo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30743OooOo0O implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f109948OooOo0o;

    public /* synthetic */ C30743OooOo0O(int i) {
        this.f109948OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f109948OooOo0o) {
            case 0:
                return ((Page) obj).getId();
            default:
                PointF p = (PointF) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(p, "p");
                return Float.valueOf(p.x);
        }
    }
}
