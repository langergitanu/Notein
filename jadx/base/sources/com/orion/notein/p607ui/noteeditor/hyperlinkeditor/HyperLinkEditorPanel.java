package com.orion.notein.p607ui.noteeditor.hyperlinkeditor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.OooO0OO;
import com.orion.penkit.models.HyperLinkInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/HyperLinkEditorPanel;", "Landroid/widget/FrameLayout;", "Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/HyperLinkEditorPanel$OooO00o;", "OooOoO0", "Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/HyperLinkEditorPanel$OooO00o;", "getHyperLinkEditorEventListener", "()Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/HyperLinkEditorPanel$OooO00o;", "setHyperLinkEditorEventListener", "(Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/HyperLinkEditorPanel$OooO00o;)V", "hyperLinkEditorEventListener", "Landroidx/cardview/widget/CardView;", "OooOoO", "Landroidx/cardview/widget/CardView;", "getPageLinkDialog$annotations", "()V", "pageLinkDialog", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class HyperLinkEditorPanel extends FrameLayout {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final /* synthetic */ int f74492Oooo00o = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public HyperLinkResizeEditor f74493OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO0OO f74494OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name and from kotlin metadata */
    public CardView pageLinkDialog;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name and from kotlin metadata */
    public OooO00o hyperLinkEditorEventListener;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public TextView f74497OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f74498OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f74499OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public CardView f74500OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f74501OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f74502Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f74503Oooo00O;

    public interface OooO00o {
        void OooO0O0();

        void OooO0OO();

        void OooO0Oo(HyperLinkInfo hyperLinkInfo, HyperLinkInfo hyperLinkInfo2, boolean z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyperLinkEditorPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.bg_hyperlink_editor));
        paint.setStyle(Paint.Style.FILL);
        View.inflate(context, R.layout.layout_hyperlink_editor_panel, this);
    }

    private static /* synthetic */ void getPageLinkDialog$annotations() {
    }

    public final void OooO00o() {
        HyperLinkResizeEditor hyperLinkResizeEditor = this.f74493OooOo;
        if (hyperLinkResizeEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        hyperLinkResizeEditor.setVisibility(8);
        hyperLinkResizeEditor.OooO00o();
    }

    public final void OooO0O0() {
        setVisibility(8);
        CardView cardView = this.pageLinkDialog;
        if (cardView == null) {
            OooOOO0.OooOOOO("pageLinkDialog");
            throw null;
        }
        cardView.setVisibility(8);
        CardView cardView2 = this.f74500OooOooO;
        if (cardView2 == null) {
            OooOOO0.OooOOOO("exitTipsDialog");
            throw null;
        }
        cardView2.setVisibility(8);
        HyperLinkResizeEditor hyperLinkResizeEditor = this.f74493OooOo;
        if (hyperLinkResizeEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        if (hyperLinkResizeEditor.getVisibility() == 0) {
            OooO00o();
        }
        OooO0OO oooO0OO = this.f74494OooOo0o;
        if (oooO0OO == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        if (oooO0OO.f74563OooOOO == null && oooO0OO.f74564OooOOO0 == null) {
            return;
        }
        oooO0OO.OooO0oo(OooO0OO.OooO00o.f74571OooOoo, null);
    }

    public final void OooO0OO(String noteId) {
        OooOOO0.OooO0oO(noteId, "noteId");
        OooO0OO oooO0OO = this.f74494OooOo0o;
        if (oooO0OO == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        C33781o00o0O c33781o00o0O = oooO0OO.f74558OooO0oO;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, noteId);
        setVisibility(0);
        OooO00o();
        OooO0OO oooO0OO2 = this.f74494OooOo0o;
        if (oooO0OO2 != null) {
            oooO0OO2.OooO0oo(OooO0OO.OooO00o.f74567OooOo0o, null);
        } else {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
    }

    public final OooO00o getHyperLinkEditorEventListener() {
        return this.hyperLinkEditorEventListener;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f74493OooOo = (HyperLinkResizeEditor) findViewById(R.id.hyperlink_editor);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        OooOOO0.OooO0oO(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (changedView.equals(this)) {
            if (i == 0) {
                OooO00o oooO00o = this.hyperLinkEditorEventListener;
                if (oooO00o != null) {
                    oooO00o.OooO0O0();
                    return;
                }
                return;
            }
            OooO00o oooO00o2 = this.hyperLinkEditorEventListener;
            if (oooO00o2 != null) {
                oooO00o2.OooO0OO();
            }
        }
    }

    public final void setHyperLinkEditorEventListener(OooO00o oooO00o) {
        this.hyperLinkEditorEventListener = oooO00o;
    }
}
