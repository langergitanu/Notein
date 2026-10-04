package com.orion.editor.p600ui.contextmenu.textselect.p601vo;

import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes9.dex */
public class TextBasicStyleVO {
    public static final TextBasicStyleVO EMPTY = new TextBasicStyleVO(0, 0, false);

    @Expose
    public final int highlightColor;

    @Expose
    public final boolean isSelected;

    @Expose
    public final int underlineColor;

    public TextBasicStyleVO(int i, int i2) {
        this(i, i2, false);
    }

    public boolean isEmpty() {
        return this.highlightColor == 0 && this.underlineColor == 0;
    }

    public TextBasicStyleVO(int i, int i2, boolean z) {
        this.highlightColor = i;
        this.underlineColor = i2;
        this.isSelected = z;
    }
}
