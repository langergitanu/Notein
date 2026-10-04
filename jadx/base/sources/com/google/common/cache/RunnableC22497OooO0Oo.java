package com.google.common.cache;

import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditor;
import com.orion.notein.p607ui.noteeditor.addtext.richeditor.NoteinRichEditor;
import com.orion.penkit.models.TextBoxInfo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: com.google.common.cache.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC22497OooO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67792OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67793OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f67794OooOoO0;

    public /* synthetic */ RunnableC22497OooO0Oo(int i, Object obj, Object obj2) {
        this.f67793OooOo0o = i;
        this.f67792OooOo = obj;
        this.f67794OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f67794OooOoO0;
        Object obj2 = this.f67792OooOo;
        switch (this.f67793OooOo0o) {
            case 0:
                ((RemovalListener) obj2).onRemoval((RemovalNotification) obj);
                return;
            default:
                int i = TextEditor.f74047Oooo0o0;
                TextEditor textEditor = (TextEditor) obj2;
                textEditor.OooOO0();
                textEditor.OooO();
                textEditor.setVisibility(0);
                NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                if (noteinRichEditor == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                TextEditor.C23382OooO0o0 c23382OooO0o0 = textEditor.f74061Oooo0O0;
                noteinRichEditor.setRTEditTextListener(c23382OooO0o0);
                if (((TextBoxInfo) obj) == null) {
                    textEditor.OooO0O0();
                    return;
                }
                NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                if (noteinRichEditor2 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor2.setEnabled(false);
                NoteinRichEditor noteinRichEditor3 = textEditor.f74051OooOoO0;
                if (noteinRichEditor3 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor3.setLongClickable(true);
                ViewGroup viewGroup = textEditor.f74050OooOoO;
                if (viewGroup == null) {
                    OooOOO0.OooOOOO("border");
                    throw null;
                }
                NoteinRichEditor noteinRichEditor4 = textEditor.f74051OooOoO0;
                if (noteinRichEditor4 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                viewGroup.setTranslationZ(noteinRichEditor4.getTranslationZ());
                NoteinRichEditor noteinRichEditor5 = textEditor.f74051OooOoO0;
                if (noteinRichEditor5 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                c23382OooO0o0.onSelectionChanged(noteinRichEditor5, 0, noteinRichEditor5.length(), 4);
                Object parent = textEditor.getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view != null) {
                    int bottom = view.getBottom();
                    NoteinRichEditor noteinRichEditor6 = textEditor.f74051OooOoO0;
                    if (noteinRichEditor6 == null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    float y = noteinRichEditor6.getY();
                    if (textEditor.f74051OooOoO0 == null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    float height = (r3.getHeight() * textEditor.f74056OooOooo) + y;
                    if (height > 0.0f) {
                        return;
                    }
                    float f = (bottom / 2) - height;
                    TextEditor.OooO0O0 oooO0O0 = textEditor.f74057Oooo0;
                    float fOooO0O0 = oooO0O0 != null ? oooO0O0.OooO0O0(f) : 0.0f;
                    NoteinRichEditor noteinRichEditor7 = textEditor.f74051OooOoO0;
                    if (noteinRichEditor7 == null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    noteinRichEditor7.setTranslationY(noteinRichEditor7.getTranslationY() + fOooO0O0);
                    textEditor.OooO();
                    return;
                }
                return;
        }
    }
}
