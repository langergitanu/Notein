package com.orion.notein.domain.models.papertheme.paperstyle;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/domain/models/papertheme/paperstyle/AccenturePaperStyleFixed1;", "Lcom/orion/notein/domain/models/papertheme/paperstyle/AccenturePaperStyle;", "paperWidth", "", "paperHeight", "leftPadding", "topPadding", "rightPadding", "bottomPadding", "<init>", "(FFLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "getPaperWidth", "()F", "setPaperWidth", "(F)V", "getPaperHeight", "setPaperHeight", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AccenturePaperStyleFixed1 extends AccenturePaperStyle {
    private float paperHeight;
    private float paperWidth;

    public AccenturePaperStyleFixed1() {
        this(0.0f, 0.0f, null, null, null, null, 63, null);
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

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AccenturePaperStyleFixed1(float r2, float r3, java.lang.Float r4, java.lang.Float r5, java.lang.Float r6, java.lang.Float r7, int r8, kotlin.jvm.internal.C24018OooO0oo r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto Lb
            r2 = 1142210560(0x4414c000, float:595.0)
            float r2 = Oooo0.o000000O.OooO0o0(r2)
        Lb:
            r9 = r8 & 2
            if (r9 == 0) goto L16
            r3 = 1146257408(0x44528000, float:842.0)
            float r3 = Oooo0.o000000O.OooO0o0(r3)
        L16:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L1c
            r4 = r0
        L1c:
            r9 = r8 & 8
            if (r9 == 0) goto L21
            r5 = r0
        L21:
            r9 = r8 & 16
            if (r9 == 0) goto L26
            r6 = r0
        L26:
            r8 = r8 & 32
            if (r8 == 0) goto L32
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L39
        L32:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L39:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.domain.models.papertheme.paperstyle.AccenturePaperStyleFixed1.<init>(float, float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.OooO0oo):void");
    }

    public AccenturePaperStyleFixed1(float f, float f2, Float f3, Float f4, Float f5, Float f6) {
        super(f, f2, f3, f4, f5, f6);
        this.paperWidth = f;
        this.paperHeight = f2;
    }
}
