package o0O0o0oO;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.util.Log;
import android.view.View;
import androidx.core.util.Pair;
import com.orion.editor.PDFView;
import com.orion.editor.model.ClipboardData;
import com.orion.penkit.models.TextBoxInfo;
import java.util.ArrayList;
import o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o;

/* JADX INFO: loaded from: classes9.dex */
public final class o00000 implements ViewOnAttachStateChangeListenerC26064o000000o.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final PDFView f88966OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC26064o000000o.OooO00o f88967OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC26048OoooO0O f88968OooO0OO;

    public o00000(PDFView pDFView, ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o, InterfaceC26048OoooO0O interfaceC26048OoooO0O) {
        this.f88966OooO00o = pDFView;
        this.f88967OooO0O0 = oooO00o;
        this.f88968OooO0OO = interfaceC26048OoooO0O;
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO(TextBoxInfo textBoxInfo) {
        Log.d("LassoEventImpl", "on Cut button clicked");
        if (textBoxInfo.getBoundingBox(1.0f).isEmpty()) {
            return;
        }
        PDFView pDFView = this.f88966OooO00o;
        int iIntValue = pDFView.f69170OooOooO.OooOOOo(textBoxInfo.getBoundingBox(1.0f)).first.intValue();
        ClipboardData clipboardData = new ClipboardData();
        Pair<Float, Float> pairOooOOO = pDFView.f69170OooOooO.OooOOO(iIntValue);
        TextBoxInfo textBoxInfoCopy = textBoxInfo.copy(textBoxInfo.getId(), textBoxInfo.getText(), textBoxInfo.getTextSize(), textBoxInfo.getBoxWidth(), textBoxInfo.getBoxHeight(), o00OO0O0.OooO0O0.OooO0Oo(textBoxInfo.getBounds(), pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue(), 1.0f / pDFView.OooOo0O(1, iIntValue)), textBoxInfo.getLineHeight(), textBoxInfo.getBackgroundColor(), textBoxInfo.getLayerId(), textBoxInfo.getCreationTime(), textBoxInfo.getDefaultTextColor(), textBoxInfo.getLocalTransform());
        ArrayList arrayList = new ArrayList();
        clipboardData.f69321OooO00o = arrayList;
        arrayList.add(textBoxInfoCopy);
        pDFView.setClipboardData(clipboardData);
        try {
            ((ClipboardManager) pDFView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("notein_text_box", "", textBoxInfo.getText()));
        } catch (Exception unused) {
        }
        pDFView.OooOooO();
        pDFView.invalidate();
        ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o = this.f88967OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO(textBoxInfoCopy);
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO00o(View view, boolean z) {
        ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o = this.f88967OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO00o(view, z);
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0O0(TextBoxInfo textBoxInfo) {
        this.f88966OooO00o.OooOooO();
        ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o = this.f88967OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0O0(textBoxInfo);
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0OO(TextBoxInfo textBoxInfo) {
        this.f88966OooO00o.OooOooO();
        ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o = this.f88967OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0OO(textBoxInfo);
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0Oo(TextBoxInfo textBoxInfo) {
        this.f88966OooO00o.OooOooO();
        ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o = this.f88967OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0Oo(textBoxInfo);
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0o(TextBoxInfo textBoxInfo) {
        this.f88966OooO00o.OooOooO();
        ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o = this.f88967OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0o(textBoxInfo);
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0o0(TextBoxInfo textBoxInfo) {
        PDFView pDFView = this.f88966OooO00o;
        int iIntValue = pDFView.f69170OooOooO.OooOOOo(textBoxInfo.getBoundingBox(1.0f)).first.intValue();
        ClipboardData clipboardData = new ClipboardData();
        Pair<Float, Float> pairOooOOO = pDFView.f69170OooOooO.OooOOO(iIntValue);
        TextBoxInfo textBoxInfoCopy = textBoxInfo.copy(textBoxInfo.getId(), textBoxInfo.getText(), textBoxInfo.getTextSize(), textBoxInfo.getBoxWidth(), textBoxInfo.getBoxHeight(), o00OO0O0.OooO0O0.OooO0Oo(textBoxInfo.getBounds(), pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue(), 1.0f / pDFView.OooOo0O(1, iIntValue)), textBoxInfo.getLineHeight(), textBoxInfo.getBackgroundColor(), textBoxInfo.getLayerId(), textBoxInfo.getCreationTime(), textBoxInfo.getDefaultTextColor(), textBoxInfo.getLocalTransform());
        ArrayList arrayList = new ArrayList();
        clipboardData.f69321OooO00o = arrayList;
        arrayList.add(textBoxInfoCopy);
        pDFView.setClipboardData(clipboardData);
        try {
            ((ClipboardManager) pDFView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newHtmlText("notein_text_box", "", textBoxInfo.getText()));
        } catch (Exception unused) {
        }
        pDFView.OooOooO();
        ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o = this.f88967OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0o0(textBoxInfoCopy);
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0oO(TextBoxInfo textBoxInfo) {
        this.f88966OooO00o.OooOooO();
        ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o = this.f88967OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0oO(textBoxInfo);
        }
    }

    @Override // o0O0o0oO.ViewOnAttachStateChangeListenerC26064o000000o.OooO00o
    public final void OooO0oo() {
        ViewOnAttachStateChangeListenerC26064o000000o.OooO00o oooO00o = this.f88967OooO0O0;
        if (oooO00o != null) {
            oooO00o.OooO0oo();
        }
    }
}
