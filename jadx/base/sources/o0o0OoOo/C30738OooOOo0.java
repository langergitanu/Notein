package o0o0OoOo;

import android.graphics.PointF;
import com.orion.notein.domain.models.note.NoteMeta;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o0OoOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30738OooOOo0 implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f109933OooOo0o;

    public /* synthetic */ C30738OooOOo0(int i) {
        this.f109933OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f109933OooOo0o) {
            case 0:
                return ((NoteMeta) obj).toString();
            default:
                PointF p = (PointF) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(p, "p");
                return Float.valueOf(p.y);
        }
    }
}
