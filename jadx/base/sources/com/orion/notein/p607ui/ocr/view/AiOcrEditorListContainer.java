package com.orion.notein.p607ui.ocr.view;

import OooO0o.OooOO0;
import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.RTEditTextListener;
import com.orion.notein.richeditor.effects.AbsoluteSizeEffect;
import com.orion.notein.richeditor.effects.AlignmentEffect;
import com.orion.notein.richeditor.effects.BackgroundColorEffect;
import com.orion.notein.richeditor.effects.BoldEffect;
import com.orion.notein.richeditor.effects.BulletEffect;
import com.orion.notein.richeditor.effects.Effect;
import com.orion.notein.richeditor.effects.Effects;
import com.orion.notein.richeditor.effects.ForegroundColorEffect;
import com.orion.notein.richeditor.effects.HeadingEffect;
import com.orion.notein.richeditor.effects.ItalicEffect;
import com.orion.notein.richeditor.effects.NumberEffect;
import com.orion.notein.richeditor.effects.StrikethroughEffect;
import com.orion.notein.richeditor.effects.UnderlineEffect;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.utils.Selection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0o0O.C30176OooO0o0;
import o0o0O.C30177OooO0oO;
import o0o0O.OooO;
import o0o0OO0.C30394OooOOOO;
import o0oo0OOo.C31236OooO00o;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0012J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/ui/ocr/view/AiOcrEditorListContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/text/Editable;", "getText", "()Landroid/text/Editable;", "LoO00ooO/OooOOO;", "", "Landroid/text/Spannable;", "getFocusedEditorContent", "()LoO00ooO/OooOOO;", "Lcom/orion/notein/ui/ocr/view/AiOcrEditorListContainer$OooO00o;", "o000oOoO", "Lcom/orion/notein/ui/ocr/view/AiOcrEditorListContainer$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/ocr/view/AiOcrEditorListContainer$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/ocr/view/AiOcrEditorListContainer$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AiOcrEditorListContainer extends ConstraintLayout {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f78420OoooOOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AiOcrEditorList f78421OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C30394OooOOOO f78422OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f78423OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AiOcrRichEditor f78424OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public ViewGroup f78425OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public ImageView f78426OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public View f78427OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f78428OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f78429OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooO0o.OooO0O0<OooOO0> f78430Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f78431Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f78432Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f78433Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f78434Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public View f78435Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public View f78436Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f78437Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public TextView f78438Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f78439Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f78440Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final OooO0OO f78441OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public C30176OooO0o0 f78442OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO f78443OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public C30177OooO0oO f78444OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final OooO0O0 f78445OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    public interface OooO00o {
        void OooO00o();

        void OooO0O0(String str, Spannable spannable);

        void OooO0OO(String str);
    }

    public final class OooO0O0 implements View.OnKeyListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View v, int i, KeyEvent event) {
            OooOOO0.OooO0oO(v, "v");
            OooOOO0.OooO0oO(event, "event");
            AiOcrEditorListContainer aiOcrEditorListContainer = AiOcrEditorListContainer.this;
            String str = aiOcrEditorListContainer.f78423OooOoO;
            if (str == null) {
                return false;
            }
            Editable text = ((AiOcrRichEditor) v).getText();
            if (text != null && text.length() > 0) {
                return false;
            }
            if ((i != 67 && i != 112) || event.getAction() != 1) {
                return false;
            }
            OooO00o eventListener = aiOcrEditorListContainer.getEventListener();
            if (eventListener != null) {
                eventListener.OooO0OO(str);
            }
            return true;
        }
    }

    public final class OooO0OO implements RTEditTextListener {
        public OooO0OO() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        
            if (r2 >= (r8.end() - r8.start())) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean OooO00o(List<? extends RTSpan> list, Selection selection) {
            AiOcrRichEditor aiOcrRichEditor = AiOcrEditorListContainer.this.f78424OooOoO0;
            if (aiOcrRichEditor != null) {
                try {
                    Iterator<T> it = list.iterator();
                    int iMin = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        RTSpan rTSpan = (RTSpan) it.next();
                        Editable text = aiOcrRichEditor.getText();
                        int spanStart = text != null ? text.getSpanStart(rTSpan) : 0;
                        Editable text2 = aiOcrRichEditor.getText();
                        int spanEnd = text2 != null ? text2.getSpanEnd(rTSpan) : 0;
                        if (spanStart <= selection.start() && spanEnd >= selection.end()) {
                            break;
                        }
                        iMin += Math.min(selection.end(), spanEnd) - Math.max(selection.start(), spanStart);
                    }
                } catch (Exception e) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("hasNonStyledText");
                    c20358OooO00o.OooO0O0(e);
                    return false;
                }
            }
            return false;
        }

        @Override // com.orion.notein.richeditor.RTEditTextListener
        public final void onFocusChanged(RTEditText rTEditText, boolean z) {
        }

        @Override // com.orion.notein.richeditor.RTEditTextListener
        public final void onRichTextEditingChanged(RTEditText rTEditText, boolean z) {
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
        @Override // com.orion.notein.richeditor.RTEditTextListener
        public final void onSelectionChanged(RTEditText editor, int i, int i2, int i3) {
            int i4;
            int i5;
            RTSpan rTSpan;
            Object value;
            OooOOO0.OooO0oO(editor, "editor");
            LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(C31236OooO00o.f111404OooO00o);
            Selection selection = new Selection(editor.getSelectionStart(), editor.getSelectionEnd());
            AiOcrEditorListContainer aiOcrEditorListContainer = AiOcrEditorListContainer.this;
            View view = aiOcrEditorListContainer.f78437Oooo0o;
            if (view == null) {
                OooOOO0.OooOOOO("btnTextCopy");
                throw null;
            }
            view.setEnabled(!selection.isEmpty());
            View view2 = aiOcrEditorListContainer.f78439Oooo0oO;
            if (view2 == null) {
                OooOOO0.OooOOOO("btnTextCut");
                throw null;
            }
            view2.setEnabled(!selection.isEmpty());
            ArrayList<Effect> ALL_EFFECTS = Effects.ALL_EFFECTS;
            OooOOO0.OooO0o(ALL_EFFECTS, "ALL_EFFECTS");
            for (Effect effect : ALL_EFFECTS) {
                if (effect instanceof AbsoluteSizeEffect) {
                    List<RTSpan> listSpansInSelection = Effects.FONT_SIZE.spansInSelection(editor, selection);
                    OooOOO0.OooO0Oo(listSpansInSelection);
                    if (!listSpansInSelection.isEmpty()) {
                        List<RTSpan> list = listSpansInSelection;
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((RTSpan) it.next()).getValue());
                        }
                        if (OooOo.o0OO00O(arrayList).size() > 1) {
                            linkedHashMapOooOOOO.put(13, -1);
                        } else if (OooO00o(listSpansInSelection, selection)) {
                            linkedHashMapOooOOOO.put(13, -1);
                        } else {
                            OooOOO0.OooO0o0(((RTSpan) OooOo.Oooo0oO(listSpansInSelection)).getValue(), "null cannot be cast to non-null type kotlin.Int");
                            linkedHashMapOooOOOO.put(13, Float.valueOf(((Integer) r8).intValue()));
                        }
                    }
                } else if (effect instanceof BoldEffect) {
                    OooOOO0.OooO0o(Effects.BOLD.spansInSelection(editor, selection), "spansInSelection(...)");
                    linkedHashMapOooOOOO.put(0, Boolean.valueOf(!r10.isEmpty()));
                } else if (effect instanceof ItalicEffect) {
                    OooOOO0.OooO0o(Effects.ITALIC.spansInSelection(editor, selection), "spansInSelection(...)");
                    linkedHashMapOooOOOO.put(1, Boolean.valueOf(!r10.isEmpty()));
                } else if (effect instanceof UnderlineEffect) {
                    OooOOO0.OooO0o(Effects.UNDERLINE.spansInSelection(editor, selection), "spansInSelection(...)");
                    linkedHashMapOooOOOO.put(2, Boolean.valueOf(!r10.isEmpty()));
                } else if (effect instanceof StrikethroughEffect) {
                    OooOOO0.OooO0o(Effects.STRIKETHROUGH.spansInSelection(editor, selection), "spansInSelection(...)");
                    linkedHashMapOooOOOO.put(14, Boolean.valueOf(!r10.isEmpty()));
                } else if (effect instanceof BulletEffect) {
                    OooOOO0.OooO0o(Effects.BULLET.spansInSelection(editor, selection), "spansInSelection(...)");
                    linkedHashMapOooOOOO.put(3, Boolean.valueOf(!r10.isEmpty()));
                } else if (effect instanceof NumberEffect) {
                    OooOOO0.OooO0o(Effects.NUMBER.spansInSelection(editor, selection), "spansInSelection(...)");
                    linkedHashMapOooOOOO.put(4, Boolean.valueOf(!r10.isEmpty()));
                } else if (effect instanceof AlignmentEffect) {
                    List<RTSpan> listSpansInSelection2 = Effects.ALIGNMENT.spansInSelection(editor, selection);
                    OooOOO0.OooO0Oo(listSpansInSelection2);
                    if (listSpansInSelection2.isEmpty()) {
                        i4 = 9;
                        i5 = 8;
                    } else {
                        List<RTSpan> list2 = listSpansInSelection2;
                        i4 = 9;
                        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            Object value2 = ((RTSpan) it2.next()).getValue();
                            OooOOO0.OooO0o0(value2, "null cannot be cast to non-null type android.text.Layout.Alignment");
                            arrayList2.add(Integer.valueOf(((Layout.Alignment) value2).ordinal()));
                        }
                        i5 = 8;
                        if (OooOo.o0OO00O(arrayList2).size() <= 1 && !OooO00o(listSpansInSelection2, selection)) {
                            RTSpan rTSpan2 = (RTSpan) OooOo.Oooo(listSpansInSelection2);
                            Object value3 = rTSpan2 != null ? rTSpan2.getValue() : null;
                            linkedHashMapOooOOOO.put(7, Boolean.valueOf(value3 == Layout.Alignment.ALIGN_NORMAL));
                            linkedHashMapOooOOOO.put(8, Boolean.valueOf(value3 == Layout.Alignment.ALIGN_CENTER));
                            linkedHashMapOooOOOO.put(9, Boolean.valueOf(value3 == Layout.Alignment.ALIGN_OPPOSITE));
                        }
                    }
                    Object obj = linkedHashMapOooOOOO.get(7);
                    Boolean bool = Boolean.FALSE;
                    if (OooOOO0.OooO0O0(obj, bool) && OooOOO0.OooO0O0(linkedHashMapOooOOOO.get(Integer.valueOf(i5)), bool) && OooOOO0.OooO0O0(linkedHashMapOooOOOO.get(Integer.valueOf(i4)), bool)) {
                        linkedHashMapOooOOOO.put(7, Boolean.TRUE);
                    }
                } else if (effect instanceof HeadingEffect) {
                    List<RTSpan> listSpansInSelection3 = Effects.HEADING.spansInSelection(editor, selection);
                    OooOOO0.OooO0Oo(listSpansInSelection3);
                    if (!listSpansInSelection3.isEmpty()) {
                        List<RTSpan> list3 = listSpansInSelection3;
                        ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                        Iterator<T> it3 = list3.iterator();
                        while (it3.hasNext()) {
                            Object value4 = ((RTSpan) it3.next()).getValue();
                            OooOOO0.OooO0o0(value4, "null cannot be cast to non-null type kotlin.Int");
                            arrayList3.add((Integer) value4);
                        }
                        if (OooOo.o0OO00O(arrayList3).size() <= 1 && !OooO00o(listSpansInSelection3, selection) && (rTSpan = (RTSpan) OooOo.Oooo(listSpansInSelection3)) != null && (value = rTSpan.getValue()) != null) {
                            linkedHashMapOooOOOO.put(19, value);
                        }
                    }
                } else if (effect instanceof ForegroundColorEffect) {
                    List<RTSpan> listSpansInSelection4 = Effects.FOREGROUND_COLOR.spansInSelection(editor, selection);
                    if (i3 == 1) {
                        linkedHashMapOooOOOO.remove(12);
                    } else {
                        OooOOO0.OooO0Oo(listSpansInSelection4);
                        if (!listSpansInSelection4.isEmpty()) {
                            List<RTSpan> list4 = listSpansInSelection4;
                            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
                            Iterator<T> it4 = list4.iterator();
                            while (it4.hasNext()) {
                                arrayList4.add(((RTSpan) it4.next()).getValue());
                            }
                            if (OooOo.o0OO00O(arrayList4).size() > 1) {
                                linkedHashMapOooOOOO.put(12, ((RTSpan) OooOo.Oooo0oO(listSpansInSelection4)).getValue());
                            } else if (OooO00o(listSpansInSelection4, selection)) {
                                linkedHashMapOooOOOO.put(12, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK));
                            } else {
                                linkedHashMapOooOOOO.put(12, ((RTSpan) OooOo.Oooo0oO(listSpansInSelection4)).getValue());
                            }
                        }
                    }
                } else if (effect instanceof BackgroundColorEffect) {
                    List<RTSpan> listSpansInSelection5 = Effects.BACKGROUND_COLOR.spansInSelection(editor, selection);
                    if (i3 == 1) {
                        linkedHashMapOooOOOO.remove(16);
                    } else {
                        OooOOO0.OooO0Oo(listSpansInSelection5);
                        if (!listSpansInSelection5.isEmpty()) {
                            List<RTSpan> list5 = listSpansInSelection5;
                            ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
                            Iterator<T> it5 = list5.iterator();
                            while (it5.hasNext()) {
                                arrayList5.add(((RTSpan) it5.next()).getValue());
                            }
                            if (OooOo.o0OO00O(arrayList5).size() > 1) {
                                linkedHashMapOooOOOO.put(16, ((RTSpan) OooOo.Oooo0oO(listSpansInSelection5)).getValue());
                            } else if (OooO00o(listSpansInSelection5, selection)) {
                                linkedHashMapOooOOOO.put(16, 0);
                            } else {
                                linkedHashMapOooOOOO.put(16, ((RTSpan) OooOo.Oooo0oO(listSpansInSelection5)).getValue());
                            }
                        }
                    }
                }
            }
            C30394OooOOOO c30394OooOOOO = aiOcrEditorListContainer.f78422OooOo0o;
            if (c30394OooOOOO == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30394OooOOOO), null, null, new o0o0OO0.OooOo(c30394OooOOOO, linkedHashMapOooOOOO, null), 3);
        }

        @Override // com.orion.notein.richeditor.RTEditTextListener
        public final void onTextChanged(RTEditText editor, int i, Spannable spannable, Spannable spannable2, int i2, int i3, int i4, int i5) {
            OooO00o eventListener;
            OooOOO0.OooO0oO(editor, "editor");
            AiOcrEditorListContainer aiOcrEditorListContainer = AiOcrEditorListContainer.this;
            String str = aiOcrEditorListContainer.f78423OooOoO;
            if (str == null || (eventListener = aiOcrEditorListContainer.getEventListener()) == null) {
                return;
            }
            eventListener.OooO0O0(str, spannable2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiOcrEditorListContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f78441OoooO = new OooO0OO();
        this.f78445OoooOO0 = new OooO0O0();
    }

    public final void OooO00o(Effect effect, boolean z) throws Throwable {
        AiOcrRichEditor aiOcrRichEditor = this.f78424OooOoO0;
        if (aiOcrRichEditor == null) {
            return;
        }
        if (z) {
            aiOcrRichEditor.applyEffect(effect, Boolean.TRUE, false);
        } else {
            aiOcrRichEditor.applyEffect(effect, Boolean.FALSE, false);
        }
    }

    public final void OooO0O0(int i, Object obj) {
        AiOcrRichEditor aiOcrRichEditor = this.f78424OooOoO0;
        if (aiOcrRichEditor == null) {
            return;
        }
        if (i == 0) {
            BoldEffect BOLD = Effects.BOLD;
            OooOOO0.OooO0o(BOLD, "BOLD");
            OooO00o(BOLD, ((Boolean) obj).booleanValue());
            return;
        }
        if (i == 1) {
            ItalicEffect ITALIC = Effects.ITALIC;
            OooOOO0.OooO0o(ITALIC, "ITALIC");
            OooO00o(ITALIC, ((Boolean) obj).booleanValue());
            return;
        }
        if (i == 2) {
            UnderlineEffect UNDERLINE = Effects.UNDERLINE;
            OooOOO0.OooO0o(UNDERLINE, "UNDERLINE");
            OooO00o(UNDERLINE, ((Boolean) obj).booleanValue());
            return;
        }
        if (i == 3) {
            BulletEffect BULLET = Effects.BULLET;
            OooOOO0.OooO0o(BULLET, "BULLET");
            OooO00o(BULLET, ((Boolean) obj).booleanValue());
            return;
        }
        if (i == 4) {
            NumberEffect NUMBER = Effects.NUMBER;
            OooOOO0.OooO0o(NUMBER, "NUMBER");
            OooO00o(NUMBER, ((Boolean) obj).booleanValue());
            return;
        }
        if (i == 7) {
            aiOcrRichEditor.applyEffect(Effects.ALIGNMENT, Layout.Alignment.ALIGN_NORMAL, false);
            return;
        }
        if (i == 8) {
            aiOcrRichEditor.applyEffect(Effects.ALIGNMENT, Layout.Alignment.ALIGN_CENTER, false);
            return;
        }
        if (i == 9) {
            aiOcrRichEditor.applyEffect(Effects.ALIGNMENT, Layout.Alignment.ALIGN_OPPOSITE, false);
            return;
        }
        if (i == 12) {
            Integer num = (Integer) obj;
            int iIntValue = num.intValue();
            AiOcrRichEditor aiOcrRichEditor2 = this.f78424OooOoO0;
            if (aiOcrRichEditor2 == null) {
                return;
            }
            if (iIntValue == -16777216) {
                aiOcrRichEditor2.removeEffect(Effects.FOREGROUND_COLOR, false);
                return;
            } else {
                aiOcrRichEditor2.applyEffect(Effects.FOREGROUND_COLOR, num, false);
                return;
            }
        }
        if (i == 14) {
            StrikethroughEffect STRIKETHROUGH = Effects.STRIKETHROUGH;
            OooOOO0.OooO0o(STRIKETHROUGH, "STRIKETHROUGH");
            OooO00o(STRIKETHROUGH, ((Boolean) obj).booleanValue());
        } else {
            if (i != 16) {
                if (i != 19) {
                    return;
                }
                aiOcrRichEditor.applyEffect(Effects.HEADING, (Integer) obj, false);
                return;
            }
            Integer num2 = (Integer) obj;
            int iIntValue2 = num2.intValue();
            AiOcrRichEditor aiOcrRichEditor3 = this.f78424OooOoO0;
            if (aiOcrRichEditor3 == null) {
                return;
            }
            if (iIntValue2 == 0) {
                aiOcrRichEditor3.removeEffect(Effects.BACKGROUND_COLOR, false);
            } else {
                aiOcrRichEditor3.applyEffect(Effects.BACKGROUND_COLOR, num2, false);
            }
        }
    }

    public final void OooO0OO() {
        OooO oooO = this.f78443OoooO00;
        if (oooO != null) {
            oooO.OooO00o();
        }
        C30176OooO0o0 c30176OooO0o0 = this.f78442OoooO0;
        if (c30176OooO0o0 != null) {
            c30176OooO0o0.OooO00o();
        }
        C30177OooO0oO c30177OooO0oO = this.f78444OoooO0O;
        if (c30177OooO0oO != null) {
            c30177OooO0oO.OooO00o();
        }
    }

    public final void OooO0Oo(String pageId, AiOcrRichEditor aiOcrRichEditor) {
        OooOOO0.OooO0oO(pageId, "pageId");
        if (OooOOO0.OooO0O0(this.f78424OooOoO0, aiOcrRichEditor)) {
            AiOcrRichEditor aiOcrRichEditor2 = this.f78424OooOoO0;
            if (aiOcrRichEditor2 != null) {
                aiOcrRichEditor2.setRTEditTextListener(null);
            }
            AiOcrRichEditor aiOcrRichEditor3 = this.f78424OooOoO0;
            if (aiOcrRichEditor3 != null) {
                aiOcrRichEditor3.setOnKeyListener(null);
            }
            this.f78424OooOoO0 = null;
            this.f78423OooOoO = null;
        }
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    public final C32443OooOOO<String, Spannable> getFocusedEditorContent() {
        AiOcrRichEditor aiOcrRichEditor;
        Editable text;
        String str = this.f78423OooOoO;
        if (str == null || (aiOcrRichEditor = this.f78424OooOoO0) == null || (text = aiOcrRichEditor.getText()) == null) {
            return null;
        }
        return new C32443OooOOO<>(str, text);
    }

    public final Editable getText() {
        AiOcrRichEditor aiOcrRichEditor = this.f78424OooOoO0;
        if (aiOcrRichEditor != null) {
            return aiOcrRichEditor.getText();
        }
        return null;
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }
}
