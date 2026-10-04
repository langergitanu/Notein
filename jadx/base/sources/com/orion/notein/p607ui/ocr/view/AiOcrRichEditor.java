package com.orion.notein.p607ui.ocr.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
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
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import oO0o0O0o.EnumC33590OooOO0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/orion/notein/ui/ocr/view/AiOcrRichEditor;", "Lcom/orion/notein/richeditor/RTEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AiOcrRichEditor extends RTEditText {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ClipboardManager f78449OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiOcrRichEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooOOO0.OooO0oO(context, "context");
        Object systemService = context.getSystemService("clipboard");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f78449OooOo0o = (ClipboardManager) systemService;
    }

    public final ClipData OooO00o(int i, int i2) {
        try {
            CharSequence text = getRichText(RTFormat.SPANNED).getText();
            CharSequence text2 = getRichText(RTFormat.PLAIN_TEXT).getText();
            ConverterSpannedToHtml converterSpannedToHtml = new ConverterSpannedToHtml();
            CharSequence charSequenceSubSequence = text.subSequence(i, i2);
            OooOOO0.OooO0o0(charSequenceSubSequence, "null cannot be cast to non-null type android.text.Spanned");
            RTHtml rTHtmlConvert = converterSpannedToHtml.convert((Spanned) charSequenceSubSequence, RTFormat.HTML);
            EnumC33590OooOO0o[] enumC33590OooOO0oArr = EnumC33590OooOO0o.f121266OooOo0o;
            Pattern patternCompile = Pattern.compile("<style[^>]*?>[\\s\\S]*?</style>", (2 & 2) != 0 ? 2 | 64 : 2);
            OooOOO0.OooO0o(patternCompile, "compile(...)");
            String text3 = rTHtmlConvert.getText();
            OooOOO0.OooO0o(text3, "getText(...)");
            String strReplaceAll = patternCompile.matcher(text3).replaceAll("");
            OooOOO0.OooO0o(strReplaceAll, "replaceAll(...)");
            return ClipData.newHtmlText("label_styled_text", text2.subSequence(i, i2), strReplaceAll);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[PHI: r6
      0x007a: PHI (r6v7 java.lang.CharSequence) = (r6v1 java.lang.CharSequence), (r6v9 java.lang.String) binds: [B:24:0x006b, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0O0(boolean z) {
        CharSequence charSequenceCoerceToStyledText;
        ClipData primaryClip = this.f78449OooOo0o.getPrimaryClip();
        if (primaryClip == null) {
            return;
        }
        Editable editableText = getEditableText();
        int itemCount = primaryClip.getItemCount();
        boolean z2 = false;
        for (int i = 0; i < itemCount; i++) {
            if (z) {
                charSequenceCoerceToStyledText = primaryClip.getItemAt(i).coerceToText(getContext());
                text = charSequenceCoerceToStyledText instanceof Spanned ? (Spanned) charSequenceCoerceToStyledText : null;
                if (text != null && (text = text.toString()) != null) {
                    charSequenceCoerceToStyledText = text;
                }
            } else {
                if (OooOOO0.OooO0O0(primaryClip.getDescription().getLabel(), "label_styled_text")) {
                    RTText rTTextConvertTo = new RTHtml(primaryClip.getItemAt(i).getHtmlText()).convertTo(getContext(), RTFormat.SPANNED);
                    RTSpanned rTSpanned = rTTextConvertTo instanceof RTSpanned ? (RTSpanned) rTTextConvertTo : null;
                    if (rTSpanned != null) {
                        text = rTSpanned.getText();
                    }
                }
                if (text == null) {
                    charSequenceCoerceToStyledText = primaryClip.getItemAt(i).coerceToStyledText(getContext());
                }
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z2) {
                    editableText.insert(Selection.getSelectionEnd(editableText), IOUtils.LINE_SEPARATOR_UNIX);
                    editableText.insert(Selection.getSelectionEnd(editableText), charSequenceCoerceToStyledText);
                } else {
                    OooOOO0.OooO0Oo(editableText);
                    int selectionStart = Selection.getSelectionStart(editableText);
                    int selectionEnd = Selection.getSelectionEnd(editableText);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editableText, iMax2);
                    editableText.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z2 = true;
                }
            }
        }
    }

    public final boolean OooO0OO(ClipData clipData) {
        try {
            this.f78449OooOo0o.setPrimaryClip(clipData);
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
                    ClipData clipDataOooO00o = OooO00o(iMax, length);
                    if (clipDataOooO00o != null && OooO0OO(clipDataOooO00o) && (text = getText()) != null) {
                        text.delete(iMax, length);
                    }
                    break;
                case android.R.id.copy:
                    int selectionStart2 = getSelectionStart();
                    int selectionEnd2 = getSelectionEnd();
                    int iMax2 = Math.max(0, Math.min(selectionStart2, selectionEnd2));
                    int iMax3 = Math.max(0, Math.max(selectionStart2, selectionEnd2));
                    super.onTextContextMenuItem(i);
                    ClipData clipDataOooO00o2 = OooO00o(iMax2, iMax3);
                    if (clipDataOooO00o2 != null) {
                        OooO0OO(clipDataOooO00o2);
                    }
                    break;
                case android.R.id.paste:
                    OooO0O0(false);
                    break;
                default:
                    if (!super.onTextContextMenuItem(i)) {
                        return false;
                    }
                    break;
            }
        } else {
            OooO0O0(true);
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
