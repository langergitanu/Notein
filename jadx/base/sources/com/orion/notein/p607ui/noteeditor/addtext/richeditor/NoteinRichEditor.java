package com.orion.notein.p607ui.noteeditor.addtext.richeditor;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.orion.notein.global.R;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.api.format.RTHtml;
import com.orion.notein.richeditor.api.format.RTSpanned;
import com.orion.notein.richeditor.api.format.RTText;
import com.orion.notein.richeditor.converter.ConverterSpannedToHtml;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o0OoOOOO.C29091OooO00o;
import oO00ooO.C32435OooO0Oo;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addtext/richeditor/NoteinRichEditor;", "Lcom/orion/notein/richeditor/RTEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteinRichEditor extends RTEditText {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ClipboardManager f74085OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteinRichEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOOO0.OooO0oO(context, "context");
        Object systemService = context.getSystemService("clipboard");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f74085OooOo0o = (ClipboardManager) systemService;
    }

    public final void OooO00o() {
        Editable text = getText();
        if (text == null) {
            text = null;
        }
        if (text == null) {
            return;
        }
        int currentTextColor = getCurrentTextColor();
        int iMax = 0;
        Object[] spans = text.getSpans(0, text.length(), ForegroundColorSpan.class);
        OooOOO0.OooO0o(spans, "getSpans(...)");
        for (ForegroundColorSpan foregroundColorSpan : OooOOO.Oooo0oO(spans, new C29091OooO00o(text))) {
            int spanStart = text.getSpanStart(foregroundColorSpan);
            int spanEnd = text.getSpanEnd(foregroundColorSpan);
            if (spanStart > iMax) {
                text.setSpan(new com.orion.notein.richeditor.spans.ForegroundColorSpan(currentTextColor), iMax, spanStart, 33);
            }
            iMax = Math.max(iMax, spanEnd);
        }
        if (iMax < text.length()) {
            text.setSpan(new com.orion.notein.richeditor.spans.ForegroundColorSpan(currentTextColor), iMax, text.length(), 33);
        }
    }

    public final ClipData OooO0O0(int i, int i2) {
        try {
            CharSequence text = getRichText(RTFormat.SPANNED).getText();
            CharSequence text2 = getRichText(RTFormat.PLAIN_TEXT).getText();
            ConverterSpannedToHtml converterSpannedToHtml = new ConverterSpannedToHtml();
            CharSequence charSequenceSubSequence = text.subSequence(i, i2);
            OooOOO0.OooO0o0(charSequenceSubSequence, "null cannot be cast to non-null type android.text.Spanned");
            return ClipData.newHtmlText("notein_styled_text", text2.subSequence(i, i2), converterSpannedToHtml.convert((Spanned) charSequenceSubSequence, RTFormat.HTML).getText());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0OO(boolean z) {
        Object objOooO00o;
        CharSequence text;
        String string;
        try {
            objOooO00o = this.f74085OooOo0o.getPrimaryClip();
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO00o);
        if (thOooO00o != null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteinRichEditor");
            c20358OooO00o.OooO0OO("clipboard.primaryClip err: ".concat(C32435OooO0Oo.OooO0O0(thOooO00o)), new Object[0]);
        }
        if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
            objOooO00o = null;
        }
        ClipData clipData = (ClipData) objOooO00o;
        if (clipData == null) {
            return;
        }
        Editable editableText = getEditableText();
        int itemCount = clipData.getItemCount();
        boolean z2 = false;
        for (int i = 0; i < itemCount; i++) {
            if (z) {
                text = clipData.getItemAt(i).coerceToText(getContext());
                Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
                if (spanned != null && (string = spanned.toString()) != null) {
                    text = string;
                }
            } else if (OooOOO0.OooO0O0(clipData.getDescription().getLabel(), "notein_styled_text")) {
                RTText rTTextConvertTo = new RTHtml(clipData.getItemAt(i).getHtmlText()).convertTo(getContext(), RTFormat.SPANNED);
                RTSpanned rTSpanned = rTTextConvertTo instanceof RTSpanned ? (RTSpanned) rTTextConvertTo : null;
                text = rTSpanned != null ? rTSpanned.getText() : null;
                if (text == null) {
                    text = clipData.getItemAt(i).coerceToStyledText(getContext());
                }
            }
            if (text != null) {
                if (z2) {
                    editableText.insert(Selection.getSelectionEnd(editableText), IOUtils.LINE_SEPARATOR_UNIX);
                    editableText.insert(Selection.getSelectionEnd(editableText), text);
                } else {
                    OooOOO0.OooO0Oo(editableText);
                    int selectionStart = Selection.getSelectionStart(editableText);
                    int selectionEnd = Selection.getSelectionEnd(editableText);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editableText, iMax2);
                    editableText.replace(iMax, iMax2, text);
                    z2 = true;
                }
            }
        }
    }

    public final boolean OooO0Oo(ClipData clipData) {
        try {
            this.f74085OooOo0o.setPrimaryClip(clipData);
            return true;
        } catch (Throwable unused) {
            Context context = getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            String string = getContext().getString(R.string.failed_to_copy_to_clipboard);
            OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
            return false;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        int iMax;
        Editable text;
        Editable text2 = getText();
        int length = text2 != null ? text2.length() : 0;
        if (isFocused()) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
            length = Math.max(0, Math.max(selectionStart, selectionEnd));
        } else {
            iMax = 0;
        }
        if (i != 16908337) {
            switch (i) {
                case android.R.id.cut:
                    ClipData clipDataOooO0O0 = OooO0O0(iMax, length);
                    if (clipDataOooO0O0 != null && OooO0Oo(clipDataOooO0O0) && (text = getText()) != null) {
                        text.delete(iMax, length);
                    }
                    break;
                case android.R.id.copy:
                    int selectionStart2 = getSelectionStart();
                    int selectionEnd2 = getSelectionEnd();
                    int iMax2 = Math.max(0, Math.min(selectionStart2, selectionEnd2));
                    int iMax3 = Math.max(0, Math.max(selectionStart2, selectionEnd2));
                    super.onTextContextMenuItem(i);
                    ClipData clipDataOooO0O02 = OooO0O0(iMax2, iMax3);
                    if (clipDataOooO0O02 != null) {
                        OooO0Oo(clipDataOooO0O02);
                    }
                    break;
                case android.R.id.paste:
                    OooO0OO(false);
                    break;
                default:
                    if (!super.onTextContextMenuItem(i)) {
                        return false;
                    }
                    break;
            }
        } else {
            OooO0OO(true);
        }
        return true;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            if (selectionStart != selectionEnd) {
                setSelection(selectionStart, selectionEnd);
            }
        } catch (IllegalArgumentException e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("NoteinRichEditor");
            c20358OooO00o.OooO0OO("setText: " + e, new Object[0]);
        }
    }
}
