package com.orion.notein.domain.models.papertheme.paperstyle.threecolumns;

import Oooo0.o000000O;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/LineThreeColumnPaperStyleFixed1;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/threecolumns/LineThreeColumnPaperStyle;", "paperWidth", "", "paperHeight", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "horizontalFlip", "", "nameStrRes", "", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;I)V", "getPaperWidth", "()F", "setPaperWidth", "(F)V", "getPaperHeight", "setPaperHeight", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LineThreeColumnPaperStyleFixed1 extends LineThreeColumnPaperStyle {
    private float paperHeight;
    private float paperWidth;

    public LineThreeColumnPaperStyleFixed1() {
        this(0.0f, 0.0f, null, null, null, null, null, 0, 255, null);
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public float getPaperHeight() {
        return this.paperHeight;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public float getPaperWidth() {
        return this.paperWidth;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void setPaperHeight(float f) {
        this.paperHeight = f;
    }

    @Override // com.orion.notein.domain.models.papertheme.paperstyle.PaperStyle
    public void setPaperWidth(float f) {
        this.paperWidth = f;
    }

    public /* synthetic */ LineThreeColumnPaperStyleFixed1(float f, float f2, Float f3, Float f4, Float f5, Float f6, Boolean bool, int i, int i2, C24018OooO0oo c24018OooO0oo) {
        this((i2 & 1) != 0 ? o000000O.OooO0o0(595.0f) : f, (i2 & 2) != 0 ? o000000O.OooO0o0(842.0f) : f2, (i2 & 4) != 0 ? null : f3, (i2 & 8) != 0 ? null : f4, (i2 & 16) != 0 ? null : f5, (i2 & 32) != 0 ? null : f6, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? R.string.paper_style_cornell_02 : i);
    }

    public LineThreeColumnPaperStyleFixed1(float f, float f2, Float f3, Float f4, Float f5, Float f6, Boolean bool, int i) {
        super(f, f2, f3, f4, f5, f6, bool, i);
        this.paperWidth = f;
        this.paperHeight = f2;
    }
}
