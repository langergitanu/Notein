package o0O0o0oO;

import android.util.Log;
import android.view.View;
import androidx.core.util.Pair;
import com.orion.editor.PDFView;
import com.orion.editor.model.ClipboardData;
import com.orion.penkit.models.ImageInfo;
import java.util.ArrayList;
import o0O0o0oO.C26029OooOoO;

/* JADX INFO: renamed from: o0O0o0oO.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26031OooOoOO implements C26029OooOoO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PDFView f88889OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C26029OooOoO.OooO00o f88890OooO0O0;

    public C26031OooOoOO(PDFView pDFView, C26029OooOoO.OooO00o oooO00o) {
        this.f88889OooO00o = pDFView;
        this.f88890OooO0O0 = oooO00o;
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO(ImageInfo imageInfo) {
        C26029OooOoO.OooO00o imageEventListener = this.f88889OooO00o.getImageEventListener();
        if (imageEventListener != null) {
            imageEventListener.OooO(imageInfo);
        }
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO00o(View view, boolean z) {
        C26029OooOoO.OooO00o oooO00o = this.f88890OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO00o(view, z);
        }
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0O0(ImageInfo imageInfo) {
        this.f88889OooO00o.OooOoO();
        C26029OooOoO.OooO00o oooO00o = this.f88890OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0O0(imageInfo);
        }
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0OO(ImageInfo imageInfo) {
        Log.d("ImageEventListenerImpl", "on Cut button clicked");
        if (imageInfo.getBoundingBox(1.0f).isEmpty()) {
            return;
        }
        PDFView pDFView = this.f88889OooO00o;
        int iIntValue = pDFView.f69170OooOooO.OooOOOo(imageInfo.getBoundingBox(1.0f)).first.intValue();
        ClipboardData clipboardData = new ClipboardData();
        Pair<Float, Float> pairOooOOO = pDFView.f69170OooOooO.OooOOO(iIntValue);
        ImageInfo imageInfoCopy = imageInfo.copy(imageInfo.getId(), imageInfo.getUri(), o00OO0O0.OooO0O0.OooO0Oo(imageInfo.getBounds(), pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue(), 1.0f / pDFView.OooOo0O(1, iIntValue)), imageInfo.getRotation(), imageInfo.getLayerId(), imageInfo.getCreationTime(), imageInfo.getBitmap(), imageInfo.getFixed());
        ArrayList arrayList = new ArrayList();
        clipboardData.f69321OooO00o = arrayList;
        arrayList.add(imageInfoCopy);
        pDFView.setClipboardData(clipboardData);
        C26029OooOoO.OooO00o oooO00o = this.f88890OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0OO(imageInfo);
        }
        pDFView.OooOoO();
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0Oo(ImageInfo imageInfo, int i) {
        this.f88889OooO00o.OooOoO();
        C26029OooOoO.OooO00o oooO00o = this.f88890OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0Oo(imageInfo, i);
        }
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0o(ImageInfo imageInfo) {
        C26029OooOoO.OooO00o imageEventListener = this.f88889OooO00o.getImageEventListener();
        if (imageEventListener != null) {
            imageEventListener.OooO0o(imageInfo);
        }
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0o0(ImageInfo imageInfo) {
        this.f88889OooO00o.OooOoO();
        C26029OooOoO.OooO00o oooO00o = this.f88890OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0o0(imageInfo);
        }
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0oO(ImageInfo imageInfo) {
        if (imageInfo.getBoundingBox(1.0f).isEmpty()) {
            return;
        }
        PDFView pDFView = this.f88889OooO00o;
        int iIntValue = pDFView.f69170OooOooO.OooOOOo(imageInfo.getBoundingBox(1.0f)).first.intValue();
        ClipboardData clipboardData = new ClipboardData();
        Pair<Float, Float> pairOooOOO = pDFView.f69170OooOooO.OooOOO(iIntValue);
        ImageInfo imageInfoCopy = imageInfo.copy(imageInfo.getId(), imageInfo.getUri(), o00OO0O0.OooO0O0.OooO0Oo(imageInfo.getBounds(), pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue(), 1.0f / pDFView.OooOo0O(1, iIntValue)), imageInfo.getRotation(), imageInfo.getLayerId(), imageInfo.getCreationTime(), imageInfo.getBitmap(), imageInfo.getFixed());
        ArrayList arrayList = new ArrayList();
        clipboardData.f69321OooO00o = arrayList;
        arrayList.add(imageInfoCopy);
        pDFView.setClipboardData(clipboardData);
        pDFView.OooOoO();
        C26029OooOoO.OooO00o oooO00o = this.f88890OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0oO(imageInfo);
        }
    }

    @Override // o0O0o0oO.C26029OooOoO.OooO00o
    public final void OooO0oo(ImageInfo imageInfo) {
        this.f88889OooO00o.OooOoO();
        C26029OooOoO.OooO00o oooO00o = this.f88890OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0oo(imageInfo);
        }
    }
}
