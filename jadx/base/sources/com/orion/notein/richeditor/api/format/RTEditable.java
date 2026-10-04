package com.orion.notein.richeditor.api.format;

import android.content.Context;
import android.view.inputmethod.BaseInputConnection;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.converter.ConverterSpannedToHtml;
import com.orion.notein.richeditor.effects.Effect;
import com.orion.notein.richeditor.effects.Effects;

/* JADX INFO: loaded from: classes9.dex */
public final class RTEditable extends RTSpanned {
    private RTEditText mEditor;

    public RTEditable(RTEditText rTEditText) {
        super(rTEditText.getText());
        this.mEditor = rTEditText;
    }

    private void clean() {
        BaseInputConnection.removeComposingSpans(this.mEditor.getText());
        Effects.cleanupParagraphs(this.mEditor, new Effect[0]);
    }

    @Override // com.orion.notein.richeditor.api.format.RTText
    public RTText convertTo(Context context, RTFormat rTFormat) {
        if (rTFormat instanceof RTFormat.Html) {
            clean();
            return new ConverterSpannedToHtml().convert(this.mEditor.getText(), (RTFormat.Html) rTFormat);
        }
        if (!(rTFormat instanceof RTFormat.PlainText)) {
            return super.convertTo(context, rTFormat);
        }
        clean();
        return new RTPlainText(new ConverterSpannedToHtml().convert(this.mEditor.getText(), RTFormat.HTML).convertTo(context, RTFormat.PLAIN_TEXT).getText());
    }
}
