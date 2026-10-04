package com.orion.notein.p607ui.noteeditor.pagelayereditor;

import Oooo0.o000000O;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditorPanel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000O0oo.RunnableC24438OooOoo0;
import o0OoO0oo.C28971o0OO00O;
import o0Ooo0O.C29375OooO00o;
import o0Ooo0O0.C29395OooOOoo;
import o0Ooo0O0.OooOo00;
import o0Ooo0O0.RunnableC29396OooOo0;
import o0oOOOoo.C30837OooO00o;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;
import oooOO0.InterfaceC35202OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0015J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditorPanel;", "Landroid/widget/FrameLayout;", "LoooOO0/OooO00o;", "Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditor$OooO00o;", "Lcom/orion/editor/PDFView;", "pdfView", "LoO00ooO/OooOooO;", "setupLayout", "(Lcom/orion/editor/PDFView;)V", "", "pageIndex", "setPageIndex", "(I)V", "Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditorPanel$OooO00o;", "OooOoo0", "Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditorPanel$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditorPanel$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/pagelayereditor/PageLayerEditorPanel$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageLayerEditorPanel extends FrameLayout implements InterfaceC35202OooO00o, PageLayerEditor.OooO00o {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f74885OooOooo = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public PageLayerEditor f74886OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0OO f74887OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public AnimatorSet f74888OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f74889OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Handler f74890OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooOo00 f74891OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RunnableC29396OooOo0 f74893OooOooO;

    public interface OooO00o {
        void OooO00o(PageLayer pageLayer, int i);

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo(PageLayer pageLayer, int i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageLayerEditorPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f74890OooOoOO = new Handler(Looper.getMainLooper());
        View.inflate(context, R.layout.layout_layer_editor_panel, this);
        this.f74891OooOoo = new OooOo00(this);
        this.f74893OooOooO = new RunnableC29396OooOo0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0oo(PageLayerEditorPanel pageLayerEditorPanel, boolean z) {
        AnimatorSet animatorSet = pageLayerEditorPanel.f74888OooOoO;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        PageLayerEditor pageLayerEditor = pageLayerEditorPanel.f74886OooOo;
        if (pageLayerEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        Object parent = pageLayerEditor.getParent();
        final View view = parent instanceof View ? (View) parent : null;
        if (view == null && (view = pageLayerEditorPanel.f74886OooOo) == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        C32443OooOOO c32443OooOOO = z ? new C32443OooOOO(Float.valueOf(view.getTranslationX()), Float.valueOf(o000000O.OooO0o0(0.0f))) : new C32443OooOOO(Float.valueOf(view.getTranslationX()), Float.valueOf(o000000O.OooO0o0(140.0f)));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Number) c32443OooOOO.f116638OooOo0o).floatValue(), ((Number) c32443OooOOO.f116637OooOo).floatValue());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0Ooo0O0.OooOOo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = PageLayerEditorPanel.f74885OooOooo;
                view.setTranslationX(((Float) C28971o0OO00O.OooO00o(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(valueAnimatorOfFloat);
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        animatorSet2.setDuration(300L);
        pageLayerEditorPanel.f74888OooOoO = animatorSet2;
        animatorSet2.addListener(new C29395OooOOoo(pageLayerEditorPanel, z));
        AnimatorSet animatorSet3 = pageLayerEditorPanel.f74888OooOoO;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public final void OooO() {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PageLayerEditorPanel");
        c20358OooO00o.OooO00o("hideInternal delay=%d visible=%s animating=%s", 0L, Boolean.valueOf(getVisibility() == 0), Boolean.valueOf(this.f74889OooOoO0));
        Handler handler = this.f74890OooOoOO;
        handler.removeCallbacks(this.f74893OooOooO);
        OooOo00 oooOo00 = this.f74891OooOoo;
        handler.removeCallbacks(oooOo00);
        if (getVisibility() == 0 || this.f74889OooOoO0) {
            handler.postDelayed(oooOo00, 0L);
        }
    }

    @Override // oooOO0.InterfaceC35202OooO00o
    public final void OooO00o() {
        PageLayerEditor pageLayerEditor = this.f74886OooOo;
        if (pageLayerEditor != null) {
            pageLayerEditor.setPdfView(null);
        } else {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    @Override // com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor.OooO00o
    public final void OooO0O0() {
        OooO00o oooO00o = this.eventListener;
        if (oooO00o != null) {
            oooO00o.OooO0O0();
        }
    }

    @Override // com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor.OooO00o
    public final void OooO0OO() {
        OooO00o oooO00o = this.eventListener;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
    }

    @Override // oooOO0.InterfaceC35202OooO00o
    public final void OooO0Oo(String layerId) {
        OooOOO0.OooO0oO(layerId, "layerId");
        PageLayerEditor pageLayerEditor = this.f74886OooOo;
        Object obj = null;
        if (pageLayerEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        C29375OooO00o c29375OooO00o = pageLayerEditor.f74868OooOoO;
        if (c29375OooO00o == null) {
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
        Iterable iterable = c29375OooO00o.f66021OooO00o.f65811OooO0o;
        OooOOO0.OooO0o(iterable, "getCurrentList(...)");
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (OooOOO0.OooO0O0(((C30837OooO00o) next).f110196OooO00o, layerId)) {
                obj = next;
                break;
            }
        }
        C30837OooO00o c30837OooO00o = (C30837OooO00o) obj;
        if (c30837OooO00o != null) {
            pageLayerEditor.OooO0Oo(c30837OooO00o);
        }
    }

    @Override // oooOO0.InterfaceC35202OooO00o
    public final void OooO0o(int i) {
        AbstractC22830OooO0Oo abstractC22830OooO0Oo;
        PageLayerEditor pageLayerEditor = this.f74886OooOo;
        if (pageLayerEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        PDFView pDFView = pageLayerEditor.f74871OooOoo;
        String strOooOOo0 = (pDFView == null || (abstractC22830OooO0Oo = pDFView.f69170OooOooO) == null) ? null : abstractC22830OooO0Oo.f69109OooO0O0.OooOOo0(i);
        if (strOooOOo0 == null) {
            return;
        }
        C29375OooO00o c29375OooO00o = pageLayerEditor.f74868OooOoO;
        if (c29375OooO00o == null) {
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
        Iterable iterable = c29375OooO00o.f66021OooO00o.f65811OooO0o;
        OooOOO0.OooO0o(iterable, "getCurrentList(...)");
        ArrayList<C30837OooO00o> arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (OooOOO0.OooO0O0(((C30837OooO00o) obj).f110198OooO0OO, strOooOOo0)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (C30837OooO00o c30837OooO00o : arrayList) {
            pageLayerEditor.f74877Oooo00O.put(c30837OooO00o.f110196OooO00o, c30837OooO00o);
        }
        pageLayerEditor.f74876Oooo000.OooO00o("batch_update", new RunnableC24438OooOoo0(pageLayerEditor, 2));
    }

    @Override // com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor.OooO00o
    public final void OooO0o0(PageLayer added, int i) {
        OooOOO0.OooO0oO(added, "added");
        OooO00o oooO00o = this.eventListener;
        if (oooO00o != null) {
            oooO00o.OooO0Oo(added, i);
        }
    }

    @Override // com.orion.notein.ui.noteeditor.pagelayereditor.PageLayerEditor.OooO00o
    public final void OooO0oO(PageLayer deleted, int i) {
        OooOOO0.OooO0oO(deleted, "deleted");
        OooO00o oooO00o = this.eventListener;
        if (oooO00o != null) {
            oooO00o.OooO00o(deleted, i);
        }
    }

    public final void OooOO0(long j) {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PageLayerEditorPanel");
        Long lValueOf = Long.valueOf(j);
        Boolean boolValueOf = Boolean.valueOf(getVisibility() == 0);
        Boolean boolValueOf2 = Boolean.valueOf(this.f74889OooOoO0);
        OooO0OO oooO0OO = this.f74887OooOo0o;
        if (oooO0OO == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        c20358OooO00o.OooO00o("showInternal delay=%d visible=%s animating=%s feature=%s", lValueOf, boolValueOf, boolValueOf2, oooO0OO.f74782OooOOOO.getValue());
        OooO0OO oooO0OO2 = this.f74887OooOo0o;
        if (oooO0OO2 == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        if (((Boolean) oooO0OO2.f74782OooOOOO.getValue()).booleanValue()) {
            Handler handler = this.f74890OooOoOO;
            RunnableC29396OooOo0 runnableC29396OooOo0 = this.f74893OooOooO;
            handler.removeCallbacks(runnableC29396OooOo0);
            handler.removeCallbacks(this.f74891OooOoo);
            handler.postDelayed(runnableC29396OooOo0, j);
        }
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    @Override // oooOO0.InterfaceC35202OooO00o
    public final void hide() {
        OooO();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        PageLayerEditor pageLayerEditor = (PageLayerEditor) findViewById(R.id.layer_editor);
        this.f74886OooOo = pageLayerEditor;
        if (pageLayerEditor != null) {
            pageLayerEditor.setEventListener(this);
        } else {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }

    @Override // oooOO0.InterfaceC35202OooO00o
    public void setPageIndex(int pageIndex) {
        PageLayerEditor pageLayerEditor = this.f74886OooOo;
        if (pageLayerEditor != null) {
            pageLayerEditor.setPageIndex(pageIndex);
        } else {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    @Override // oooOO0.InterfaceC35202OooO00o
    public void setupLayout(PDFView pdfView) {
        OooOOO0.OooO0oO(pdfView, "pdfView");
        PageLayerEditor pageLayerEditor = this.f74886OooOo;
        if (pageLayerEditor != null) {
            pageLayerEditor.setPdfView(pdfView);
        } else {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
    }

    @Override // oooOO0.InterfaceC35202OooO00o
    public final void show() {
        OooOO0(1500L);
    }
}
