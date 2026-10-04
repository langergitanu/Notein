package com.orion.notein.richeditor.api.format;

import android.content.Context;
import android.text.SpannedString;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.converter.ConverterTextToHtml;

/* JADX INFO: loaded from: classes9.dex */
public final class RTPlainText extends RTText {
    public RTPlainText(CharSequence charSequence) {
        super(RTFormat.PLAIN_TEXT, charSequence);
    }

    @Override // com.orion.notein.richeditor.api.format.RTText
    public RTText convertTo(Context context, RTFormat rTFormat) {
        return rTFormat instanceof RTFormat.Html ? ConverterTextToHtml.convert(this) : rTFormat instanceof RTFormat.Spanned ? new RTSpanned(new SpannedString(getText())) : super.convertTo(context, rTFormat);
    }

    @Override // com.orion.notein.richeditor.api.format.RTText
    public String getText() {
        CharSequence text = super.getText();
        return text != null ? text.toString() : "";
    }
}
