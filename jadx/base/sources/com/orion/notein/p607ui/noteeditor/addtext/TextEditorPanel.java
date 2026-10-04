package com.orion.notein.p607ui.noteeditor.addtext;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditor;
import com.orion.notein.p607ui.noteeditor.addtext.richeditor.NoteinRichEditor;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.api.format.RTHtml;
import com.orion.notein.richeditor.api.format.RTSpanned;
import com.orion.notein.richeditor.api.format.RTText;
import com.orion.penkit.models.TextBoxInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OoO0oo.InterfaceC28684OooO;
import o0OoOOO0.C29051OooOO0o;
import o0oo0OOo.C31237OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addtext/TextEditorPanel;", "Landroid/widget/FrameLayout;", "Lcom/orion/notein/ui/noteeditor/addtext/TextEditor$OooO0O0;", "Lo0OoO0oo/OooO;", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "Lcom/orion/notein/ui/noteeditor/addtext/TextEditorPanel$OooO00o;", "OooOoo0", "Lcom/orion/notein/ui/noteeditor/addtext/TextEditorPanel$OooO00o;", "getTextEditorEventListener", "()Lcom/orion/notein/ui/noteeditor/addtext/TextEditorPanel$OooO00o;", "setTextEditorEventListener", "(Lcom/orion/notein/ui/noteeditor/addtext/TextEditorPanel$OooO00o;)V", "textEditorEventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextEditorPanel extends FrameLayout implements TextEditor.OooO0O0, InterfaceC28684OooO {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final /* synthetic */ int f74078OooOoo = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public TextEditor f74079OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public View f74080OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public RectF f74081OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public long f74082OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C29051OooOO0o f74083OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name and from kotlin metadata */
    public OooO00o textEditorEventListener;

    public interface OooO00o {
        float OooO00o();

        float OooO0O0(float f);

        void OooO0OO();

        void OooO0Oo();

        void OooO0o();

        void OooO0o0();

        void OooO0oO(RectF rectF);

        void OooO0oo(TextBoxInfo textBoxInfo, boolean z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextEditorPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        View.inflate(context, R.layout.layout_text_insertion_panel, this);
    }

    public final void OooO(boolean z) {
        OooO00o oooO00o;
        if (z) {
            TextEditor textEditor = this.f74079OooOo;
            if (textEditor == null) {
                OooOOO0.OooOOOO("textEditor");
                throw null;
            }
            if (textEditor.getVisibility() == 0 && (oooO00o = this.textEditorEventListener) != null) {
                TextEditor textEditor2 = this.f74079OooOo;
                if (textEditor2 == null) {
                    OooOOO0.OooOOOO("textEditor");
                    throw null;
                }
                oooO00o.OooO0oo(textEditor2.OooO0Oo(), true);
            }
        }
        TextEditor textEditor3 = this.f74079OooOo;
        if (textEditor3 == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        textEditor3.OooO0o0();
        View view = this.f74080OooOo0o;
        if (view != null) {
            view.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("insertTips");
            throw null;
        }
    }

    @Override // com.orion.notein.ui.noteeditor.addtext.TextEditor.OooO0O0
    public final Float OooO00o() {
        OooO00o oooO00o = this.textEditorEventListener;
        if (oooO00o != null) {
            return Float.valueOf(oooO00o.OooO00o());
        }
        return null;
    }

    @Override // com.orion.notein.ui.noteeditor.addtext.TextEditor.OooO0O0
    public final float OooO0O0(float f) {
        OooO00o oooO00o = this.textEditorEventListener;
        if (oooO00o != null) {
            return oooO00o.OooO0O0(f);
        }
        return 0.0f;
    }

    @Override // com.orion.notein.ui.noteeditor.addtext.TextEditor.OooO0O0
    public final void OooO0OO() {
        OooO00o oooO00o = this.textEditorEventListener;
        if (oooO00o != null) {
            oooO00o.OooO0o();
        }
    }

    @Override // com.orion.notein.ui.noteeditor.addtext.TextEditor.OooO0O0
    public final void OooO0Oo(RectF bounds) {
        OooOOO0.OooO0oO(bounds, "bounds");
        OooO00o oooO00o = this.textEditorEventListener;
        if (oooO00o != null) {
            oooO00o.OooO0oO(bounds);
        }
    }

    public final void OooO0o() {
        OooO00o oooO00o = this.textEditorEventListener;
        if (oooO00o != null) {
            oooO00o.OooO0oo(null, true);
        }
        TextEditor textEditor = this.f74079OooOo;
        if (textEditor == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        textEditor.OooO0o0();
        View view = this.f74080OooOo0o;
        if (view != null) {
            view.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("insertTips");
            throw null;
        }
    }

    public final void OooO0o0(float f, float f2, String plainText) {
        OooOOO0.OooO0oO(plainText, "plainText");
        C29051OooOO0o c29051OooOO0o = this.f74083OooOoOO;
        if (c29051OooOO0o == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        Context context = getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        OooOO0(f, f2, c29051OooOO0o.OooO0o(context, plainText));
    }

    public final void OooO0oO(int i, TextBoxInfo textBoxInfo) {
        OooOOO0.OooO0oO(textBoxInfo, "textBoxInfo");
        if (i == 0) {
            OooO0o();
            return;
        }
        if (i == 1) {
            OooO(true);
            return;
        }
        CharSequence text = null;
        if (i != 2) {
            if (i == 3) {
                OooO0o();
                return;
            }
            if (i != 4) {
                return;
            }
            TextEditor textEditor = this.f74079OooOo;
            if (textEditor != null) {
                textEditor.OooO0O0();
                return;
            } else {
                OooOOO0.OooOOOO("textEditor");
                throw null;
            }
        }
        TextEditor textEditor2 = this.f74079OooOo;
        if (textEditor2 == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        NoteinRichEditor noteinRichEditor = textEditor2.f74051OooOoO0;
        if (noteinRichEditor == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        ClipData primaryClip = noteinRichEditor.f74085OooOo0o.getPrimaryClip();
        if (primaryClip != null) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (OooOOO0.OooO0O0(primaryClip.getDescription().getLabel(), "notein_styled_text") || OooOOO0.OooO0O0(primaryClip.getDescription().getLabel(), "notein_text_box")) {
                RTText rTTextConvertTo = new RTHtml(itemAt.getHtmlText()).convertTo(noteinRichEditor.getContext(), RTFormat.SPANNED);
                RTSpanned rTSpanned = rTTextConvertTo instanceof RTSpanned ? (RTSpanned) rTTextConvertTo : null;
                if (rTSpanned != null) {
                    text = rTSpanned.getText();
                }
            }
            if (text == null && primaryClip.getDescription().hasMimeType("text/plain")) {
                text = itemAt.coerceToStyledText(noteinRichEditor.getContext());
            }
            if (text != null && text.length() > 0) {
                noteinRichEditor.getEditableText().replace(0, noteinRichEditor.getEditableText().length(), text);
            }
        }
        OooO(true);
    }

    public final void OooO0oo(MotionEvent motionEvent) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f74082OooOoO0;
        TextEditor textEditor = this.f74079OooOo;
        if (textEditor == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        if (textEditor == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        if (textEditor.getVisibility() == 0) {
            OooO(true);
            return;
        }
        if (motionEvent == null || jCurrentTimeMillis <= 500) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        TextEditor textEditor2 = this.f74079OooOo;
        if (textEditor2 == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        textEditor2.OooO0oO(x, y, null);
        OooO00o oooO00o = this.textEditorEventListener;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
        View view = this.f74080OooOo0o;
        if (view != null) {
            view.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("insertTips");
            throw null;
        }
    }

    public final void OooOO0(float f, float f2, TextBoxInfo textBoxInfo) {
        OooOOO0.OooO0oO(textBoxInfo, "textBoxInfo");
        TextEditor textEditor = this.f74079OooOo;
        if (textEditor == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        if (textEditor.getVisibility() == 0) {
            OooO(true);
        }
        View view = this.f74080OooOo0o;
        if (view == null) {
            OooOOO0.OooOOOO("insertTips");
            throw null;
        }
        view.setVisibility(8);
        setVisibility(0);
        TextEditor textEditor2 = this.f74079OooOo;
        if (textEditor2 == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        textEditor2.OooO0oO(f, f2, textBoxInfo);
        OooO00o oooO00o = this.textEditorEventListener;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
    }

    @Override // o0OoO0oo.InterfaceC28684OooO
    public Bitmap getBitmap() {
        C31237OooO0O0 c31237OooO0O0 = C31237OooO0O0.f111407OooO0O0;
        TextEditor textEditor = this.f74079OooOo;
        if (textEditor == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        Context context = textEditor.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        TextEditor textEditor2 = this.f74079OooOo;
        if (textEditor2 == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        TextBoxInfo textBoxInfoOooO0Oo = textEditor2.OooO0Oo();
        c31237OooO0O0.getClass();
        return C31237OooO0O0.OooO0O0(context, textBoxInfoOooO0Oo);
    }

    public final OooO00o getTextEditorEventListener() {
        return this.textEditorEventListener;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        TextEditor textEditor = (TextEditor) findViewById(R.id.txt_editor);
        this.f74079OooOo = textEditor;
        if (textEditor == null) {
            OooOOO0.OooOOOO("textEditor");
            throw null;
        }
        textEditor.setEventListener(this);
        this.f74080OooOo0o = findViewById(R.id.txt_tip);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        if (event.getActionMasked() == 0) {
            if (this.f74079OooOo == null) {
                OooOOO0.OooOOOO("textEditor");
                throw null;
            }
            TextEditor textEditor = this.f74079OooOo;
            if (textEditor == null) {
                OooOOO0.OooOOOO("textEditor");
                throw null;
            }
            if (textEditor.getVisibility() == 0) {
                this.f74082OooOoO0 = System.currentTimeMillis();
                RectF rectF = this.f74081OooOoO;
                if (rectF != null && rectF.contains(event.getX(), event.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        OooOOO0.OooO0oO(changedView, "changedView");
        super.onVisibilityChanged(changedView, i);
        if (changedView.equals(this)) {
            if (i == 0) {
                OooO00o oooO00o = this.textEditorEventListener;
                if (oooO00o != null) {
                    oooO00o.OooO0Oo();
                    return;
                }
                return;
            }
            OooO00o oooO00o2 = this.textEditorEventListener;
            if (oooO00o2 != null) {
                oooO00o2.OooO0o0();
            }
        }
    }

    public final void setTextEditorEventListener(OooO00o oooO00o) {
        this.textEditorEventListener = oooO00o;
    }
}
