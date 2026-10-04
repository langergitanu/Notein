package com.orion.notein.p607ui.noteeditor.textannoeditor;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.o0OoOo0;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.page.Quote;
import com.orion.notein.global.R;
import com.orion.penkit.models.LayerInfo;
import com.orion.penkit.models.QuoteInfo;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24761OooO;
import o0o000OO.C29758OooOOo0;
import o0o000OO.C29766OooOoo;
import o0o000OO.OooOO0O;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo0000O.OooO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\nR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/textannoeditor/TextAnnoEditorPanel;", "Landroid/widget/FrameLayout;", "Lcom/orion/notein/ui/noteeditor/textannoeditor/TextAnnoEditorPanel$OooO00o;", "OooOoO", "Lcom/orion/notein/ui/noteeditor/textannoeditor/TextAnnoEditorPanel$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/textannoeditor/TextAnnoEditorPanel$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/textannoeditor/TextAnnoEditorPanel$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextAnnoEditorPanel extends FrameLayout {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f76389OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public TextAnnoTextEditor f76390OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOO0O f76391OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public TextView f76393OooOoO0;

    public interface OooO00o {
        float OooO00o();

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo(QuoteInfo quoteInfo);

        void OooO0o(QuoteInfo quoteInfo, QuoteInfo quoteInfo2, boolean z);

        void OooO0o0(int i, Quote quote);

        void OooO0oO(QuoteInfo quoteInfo);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnoEditorPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
    }

    public final void OooO00o() {
        TextAnnoTextEditor textAnnoTextEditor = this.f76390OooOo;
        if (textAnnoTextEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        if (textAnnoTextEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        if (textAnnoTextEditor.getVisibility() == 0) {
            OooO0O0(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0O0(boolean z) {
        if (z) {
            OooOO0O oooOO0O = this.f76391OooOo0o;
            if (oooOO0O == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            C32443OooOOO c32443OooOOO = (C32443OooOOO) C33609OooO0oo.OooO0Oo(OooO.f123416OooOo0o, new C29758OooOOo0(null, oooOO0O));
            QuoteInfo quoteInfo = (QuoteInfo) c32443OooOOO.f116638OooOo0o;
            QuoteInfo quoteInfo2 = (QuoteInfo) c32443OooOOO.f116637OooOo;
            OooOO0O oooOO0O2 = this.f76391OooOo0o;
            if (oooOO0O2 == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            oooOO0O2.f105541OooOOOO.setValue(null);
            oooOO0O2.f105544OooOOo0.setValue(null);
            oooOO0O2.OooO0oo();
            OooO00o oooO00o = this.eventListener;
            if (oooO00o != null) {
                oooO00o.OooO0o(quoteInfo, quoteInfo2, true);
            }
        }
        OooO00o oooO00o2 = this.eventListener;
        if (oooO00o2 != null) {
            oooO00o2.OooO0OO();
        }
        OooO0OO();
    }

    public final void OooO0OO() {
        setVisibility(8);
        TextAnnoTextEditor textAnnoTextEditor = this.f76390OooOo;
        if (textAnnoTextEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        textAnnoTextEditor.setVisibility(8);
        textAnnoTextEditor.f76414Oooo0oo = null;
        OooOO0O oooOO0O = textAnnoTextEditor.f76396OooOo0o;
        if (oooOO0O != null) {
            oooOO0O.OooO0oo();
        } else {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
    }

    public final void OooO0Oo(QuoteInfo quoteInfo, String noteId, boolean z) {
        OooO00o oooO00o;
        setVisibility(0);
        TextView textView = this.f76393OooOoO0;
        if (textView == null) {
            OooOOO0.OooOOOO("insertTips");
            throw null;
        }
        textView.setVisibility(8);
        if (z) {
            TextAnnoTextEditor textAnnoTextEditor = this.f76390OooOo;
            if (textAnnoTextEditor == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            OooOOO0.OooO0oO(quoteInfo, "quoteInfo");
            OooOOO0.OooO0oO(noteId, "noteId");
            textAnnoTextEditor.OooO0o(quoteInfo);
            OooOO0O oooOO0O = textAnnoTextEditor.f76396OooOo0o;
            if (oooOO0O == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            List<String> annoItemIdList = quoteInfo.getAnnoItemIdList();
            if (annoItemIdList == null || annoItemIdList.isEmpty()) {
                oooOO0O.OooOO0O();
            } else {
                oooOO0O.OooO0oo();
            }
            C33781o00o0O c33781o00o0O = oooOO0O.f105544OooOOo0;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, quoteInfo);
        } else {
            TextAnnoTextEditor textAnnoTextEditor2 = this.f76390OooOo;
            if (textAnnoTextEditor2 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            OooOOO0.OooO0oO(quoteInfo, "quoteInfo");
            OooOOO0.OooO0oO(noteId, "noteId");
            textAnnoTextEditor2.f76404Oooo = true;
            textAnnoTextEditor2.OooO0o(quoteInfo);
            OooOO0O oooOO0O2 = textAnnoTextEditor2.f76396OooOo0o;
            if (oooOO0O2 == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            C33781o00o0O c33781o00o0O2 = oooOO0O2.f105540OooOOO0;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, noteId);
            List<String> annoItemIdList2 = quoteInfo.getAnnoItemIdList();
            C33781o00o0O c33781o00o0O3 = oooOO0O2.f105544OooOOo0;
            C33781o00o0O c33781o00o0O4 = oooOO0O2.f105541OooOOOO;
            if (annoItemIdList2 == null || annoItemIdList2.isEmpty()) {
                c33781o00o0O4.setValue(null);
                c33781o00o0O3.getClass();
                c33781o00o0O3.OooOO0(null, quoteInfo);
            } else {
                c33781o00o0O4.getClass();
                c33781o00o0O4.OooOO0(null, quoteInfo);
                String string = UUID.randomUUID().toString();
                OooOOO0.OooO0o(string, "toString(...)");
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = quoteInfo.deepCopy(string);
                OooOOO0.OooO0o0(interfaceC31284OooO0O0DeepCopy, "null cannot be cast to non-null type com.orion.penkit.models.QuoteInfo");
                c33781o00o0O3.getClass();
                c33781o00o0O3.OooOO0(null, (QuoteInfo) interfaceC31284OooO0O0DeepCopy);
            }
            List<String> annoItemIdList3 = quoteInfo.getAnnoItemIdList();
            if (annoItemIdList3 == null || annoItemIdList3.isEmpty()) {
                oooOO0O2.OooOO0O();
            } else {
                oooOO0O2.OooO0oo();
            }
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooOO0O2);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29766OooOoo(oooOO0O2, quoteInfo, null), 2);
        }
        OooOO0O oooOO0O3 = this.f76391OooOo0o;
        if (oooOO0O3 == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        OooOO0O oooOO0O4 = this.f76391OooOo0o;
        if (oooOO0O4 == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        QuoteInfo quoteInfo2 = (QuoteInfo) oooOO0O4.f105543OooOOo.getValue();
        if (quoteInfo2 == null || (oooO00o = this.eventListener) == null) {
            return;
        }
        oooO00o.OooO0oO(quoteInfo2);
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f76390OooOo = (TextAnnoTextEditor) findViewById(R.id.text_anno_editor);
        this.f76393OooOoO0 = (TextView) findViewById(R.id.txt_tip);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            TextView textView = this.f76393OooOoO0;
            if (textView == null) {
                OooOOO0.OooOOOO("insertTips");
                throw null;
            }
            if (textView.getVisibility() == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                OooOO0O oooOO0O = this.f76391OooOo0o;
                if (oooOO0O == null) {
                    OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                float f = 1;
                QuoteInfo quoteInfo = new QuoteInfo(C24761OooO.OooO00o("toString(...)"), ((Number) oooOO0O.f105537OooOO0O.f121747OooOo0o.getValue()).intValue(), 0, new RectF(), 6, OooOo.OooO0oO(new RectF(x, y, x + f, f + y)), "", C24761OooO.OooO00o("toString(...)"), LayerInfo.UNSPECIFIED_LAYER_ID, System.currentTimeMillis(), null, null, false, false, 12288, null);
                OooO00o oooO00o = this.eventListener;
                quoteInfo.recreateIconBounds(oooO00o != null ? oooO00o.OooO00o() : 1.0f);
                OooO00o oooO00o2 = this.eventListener;
                if (oooO00o2 != null) {
                    oooO00o2.OooO0Oo(quoteInfo);
                }
                OooOO0O oooOO0O2 = this.f76391OooOo0o;
                if (oooOO0O2 == null) {
                    OooOOO0.OooOOOO("viewModel");
                    throw null;
                }
                String noteId = (String) oooOO0O2.f105539OooOOO.getValue();
                OooOOO0.OooO0oO(noteId, "noteId");
                OooO00o oooO00o3 = this.eventListener;
                if (oooO00o3 != null) {
                    oooO00o3.OooO0O0();
                }
                OooO0Oo(quoteInfo, noteId, false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }
}
