package com.orion.notein.richeditor.api.format;

import android.content.Context;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.converter.ConverterHtmlToSpanned;
import com.orion.notein.richeditor.converter.ConverterHtmlToText;

/* JADX INFO: loaded from: classes9.dex */
public class RTHtml extends RTText {
    public RTHtml(CharSequence charSequence) {
        this(RTFormat.HTML, charSequence);
    }

    @Override // com.orion.notein.richeditor.api.format.RTText
    public RTText convertTo(Context context, RTFormat rTFormat) {
        return rTFormat instanceof RTFormat.PlainText ? ConverterHtmlToText.convert(this) : rTFormat instanceof RTFormat.Spanned ? new ConverterHtmlToSpanned(context).convert(this) : super.convertTo(context, rTFormat);
    }

    public RTHtml(RTFormat.Html html, CharSequence charSequence) {
        super(html, charSequence);
    }

    @Override // com.orion.notein.richeditor.api.format.RTText
    public String getText() {
        CharSequence text = super.getText();
        return text != null ? text.toString() : "";
    }
}
