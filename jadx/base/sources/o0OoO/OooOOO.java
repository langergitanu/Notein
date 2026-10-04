package o0OoO;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.orion.notein.p607ui.noteeditor.addimage.ImageSizeAndRotationEditor;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditorPanel;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooOOO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f101066OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101067OooOo0o;

    public /* synthetic */ OooOOO(ViewGroup viewGroup, int i) {
        this.f101067OooOo0o = i;
        this.f101066OooOo = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f101067OooOo0o) {
            case 0:
                ImageView imageView = ((ImageSizeAndRotationEditor) this.f101066OooOo).f73765OooOo0o;
                if (imageView != null) {
                    imageView.performLongClick();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("image");
                    throw null;
                }
            default:
                ImageView imageView2 = ((ItemsEditorPanel) this.f101066OooOo).f74689OooOo;
                if (imageView2 != null) {
                    imageView2.performLongClick();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("lasso");
                    throw null;
                }
        }
    }
}
