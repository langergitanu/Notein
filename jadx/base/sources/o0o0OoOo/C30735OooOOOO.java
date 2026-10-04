package o0o0OoOo;

import android.graphics.PointF;
import com.orion.notein.domain.models.folder.Folder;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o0OoOo.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30735OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f109929OooOo0o;

    public /* synthetic */ C30735OooOOOO(int i) {
        this.f109929OooOo0o = i;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f109929OooOo0o) {
            case 0:
                return ((Folder) obj).toString();
            default:
                PointF p = (PointF) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(p, "p");
                return Float.valueOf(p.x);
        }
    }
}
