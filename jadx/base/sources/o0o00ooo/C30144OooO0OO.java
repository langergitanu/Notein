package o0o00ooo;

import android.graphics.RectF;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import com.orion.notein.p607ui.widget.crop.ImageCropView;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0o00ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30144OooO0OO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f107290OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107291OooOo0o;

    public /* synthetic */ C30144OooO0OO(Object obj, int i) {
        this.f107291OooOo0o = i;
        this.f107290OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        Object obj2 = this.f107290OooOo;
        switch (this.f107291OooOo0o) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                ((FavoriteContainerFragment) obj2).OooOoo0().OooOoo(num);
                break;
            default:
                RectF it = (RectF) obj;
                int i = ImageCropView.f80139OooooO0;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                ImageCropView imageCropView = (ImageCropView) obj2;
                imageCropView.invalidate();
                imageCropView.OooO0o0();
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
