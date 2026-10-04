package o0OoO;

import Oooo0.o000000O;
import Oooo0oO.C21111o0ooOoO;
import android.content.ClipData;
import android.graphics.RectF;
import android.net.Uri;
import android.os.PersistableBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.FileProvider;
import androidx.core.net.UriKt;
import androidx.core.os.PersistableBundleKt;
import com.google.gson.Gson;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.domain.models.page.Image;
import com.orion.notein.p607ui.noteeditor.addimage.ImageEditorPanel;
import com.orion.notein.p607ui.noteeditor.addimage.ImageSizeAndRotationEditor;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditorPanel;
import com.orion.notein.ui.noteeditor.itemeditor.ItemsEditorPanel.OooO0O0;
import com.orion.penkit.models.LayerInfo;
import o0OoO0oo.C28957o00oOo0O;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooOO0O implements View.OnLongClickListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f101062OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f101063OooO0O0;

    public /* synthetic */ OooOO0O(ViewGroup viewGroup, int i) {
        this.f101062OooO00o = i;
        this.f101063OooO0O0 = viewGroup;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ViewGroup viewGroup = this.f101063OooO0O0;
        switch (this.f101062OooO00o) {
            case 0:
                ImageSizeAndRotationEditor imageSizeAndRotationEditor = (ImageSizeAndRotationEditor) viewGroup;
                ImageEditorPanel.C23354OooO0Oo c23354OooO0Oo = imageSizeAndRotationEditor.f73774Oooo000;
                if (c23354OooO0Oo != null) {
                    Integer fragmentHostId = DragConstants.INSTANCE.getFragmentHostId(imageSizeAndRotationEditor);
                    int iIntValue = fragmentHostId != null ? fragmentHostId.intValue() : 0;
                    Uri uriForFile = c23354OooO0Oo.f73735OooO00o;
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(uriForFile != null ? uriForFile.getScheme() : null, "file")) {
                        uriForFile = FileProvider.getUriForFile(imageSizeAndRotationEditor.getContext(), C21111o0ooOoO.OooO0Oo(imageSizeAndRotationEditor.getContext().getPackageName(), ".fileProvider"), UriKt.toFile(uriForFile));
                    }
                    ClipData clipData = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"image/*"}, new ClipData.Item(uriForFile));
                    PersistableBundle persistableBundlePersistableBundleOf = PersistableBundleKt.persistableBundleOf(new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_TYPE, 0), new C32443OooOOO(DragConstants.NOTEIN_DRAG_HOST_FRAGMENT_ID, Integer.valueOf(iIntValue)));
                    if (c23354OooO0Oo.f73736OooO0O0 != null) {
                        persistableBundlePersistableBundleOf.putString(DragConstants.NOTEIN_DRAG_DATA_JSON, new Gson().toJson(new Image("", "", c23354OooO0Oo.f73736OooO0O0, LayerInfo.UNSPECIFIED_LAYER_ID, new RectF(imageSizeAndRotationEditor.getTranslationX() + imageSizeAndRotationEditor.getLeft() + o000000O.OooO0o(10), imageSizeAndRotationEditor.getTranslationY() + imageSizeAndRotationEditor.getTop() + o000000O.OooO0o(10), (imageSizeAndRotationEditor.getTranslationX() + imageSizeAndRotationEditor.getRight()) - o000000O.OooO0o(10), (imageSizeAndRotationEditor.getTranslationY() + imageSizeAndRotationEditor.getBottom()) - o000000O.OooO0o(10)), imageSizeAndRotationEditor.getRotation(), System.currentTimeMillis(), System.currentTimeMillis(), false, 256, null)));
                    }
                    clipData.getDescription().setExtras(persistableBundlePersistableBundleOf);
                    ImageView imageView = imageSizeAndRotationEditor.f73765OooOo0o;
                    if (imageView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("image");
                        throw null;
                    }
                    C28957o00oOo0O c28957o00oOo0O = new C28957o00oOo0O(imageView);
                    ImageView imageView2 = imageSizeAndRotationEditor.f73765OooOo0o;
                    if (imageView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("image");
                        throw null;
                    }
                    imageView2.startDragAndDrop(clipData, c28957o00oOo0O, null, 257);
                }
                return true;
            default:
                int i = ItemsEditorPanel.f74688Oooo0OO;
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, ((ItemsEditorPanel) viewGroup).new OooO0O0(null), 3);
                return true;
        }
    }
}
