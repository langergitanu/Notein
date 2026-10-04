package com.orion.notein.richeditor.converter;

import android.text.Layout;
import android.text.style.ParagraphStyle;
import com.orion.notein.richeditor.spans.AlignmentSpan;
import com.orion.notein.richeditor.spans.BulletSpan;
import com.orion.notein.richeditor.spans.IndentationSpan;
import com.orion.notein.richeditor.spans.NumberSpan;

/* JADX INFO: loaded from: classes9.dex */
public enum ParagraphType {
    NONE,
    ALIGNMENT_LEFT,
    ALIGNMENT_CENTER,
    ALIGNMENT_RIGHT,
    BULLET,
    NUMBERING,
    INDENTATION_UL,
    INDENTATION_OL;

    public static ParagraphType getInstance(ParagraphStyle paragraphStyle) {
        if (paragraphStyle instanceof AlignmentSpan) {
            Layout.Alignment value = ((AlignmentSpan) paragraphStyle).getValue();
            return value == Layout.Alignment.ALIGN_NORMAL ? ALIGNMENT_LEFT : value == Layout.Alignment.ALIGN_CENTER ? ALIGNMENT_CENTER : ALIGNMENT_RIGHT;
        }
        if (paragraphStyle instanceof BulletSpan) {
            return BULLET;
        }
        if (paragraphStyle instanceof NumberSpan) {
            return NUMBERING;
        }
        if (paragraphStyle instanceof IndentationSpan) {
            return INDENTATION_UL;
        }
        return null;
    }

    public boolean isBullet() {
        return this == BULLET;
    }

    public boolean isIndentation() {
        return this == INDENTATION_UL || this == INDENTATION_OL;
    }

    public boolean isNumbering() {
        return this == NUMBERING;
    }
}
