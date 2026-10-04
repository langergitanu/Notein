package com.aspose.slides;

import com.aspose.slides.internal.p080dd.C3142to;

/* JADX INFO: loaded from: classes3.dex */
public class MarkdownSaveOptions extends SaveOptions {

    /* JADX INFO: renamed from: du */
    private boolean f2665du;

    /* JADX INFO: renamed from: dy */
    private int f2666dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f2667h4;

    /* JADX INFO: renamed from: k4 */
    private int f2668k4;

    /* JADX INFO: renamed from: kk */
    private String f2669kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f2670m9;

    /* JADX INFO: renamed from: to */
    private int f2671to;

    /* JADX INFO: renamed from: x1 */
    private String f2672x1;

    public MarkdownSaveOptions() {
        setExportType(1);
        setImagesSaveFolderName("Images");
        setBasePath(C3142to.m13417k4());
        setFlavor(23);
    }

    public final String getBasePath() {
        return this.f2672x1;
    }

    public final int getExportType() {
        return this.f2668k4;
    }

    public final int getFlavor() {
        return this.f2666dy;
    }

    public final String getImagesSaveFolderName() {
        return this.f2669kk;
    }

    public final int getNewLineType() {
        return this.f2671to;
    }

    public final boolean getShowComments() {
        return this.f2665du;
    }

    public final boolean getShowHiddenSlides() {
        return this.f2667h4;
    }

    public final boolean getShowSlideNumber() {
        return this.f2670m9;
    }

    public final void setBasePath(String str) {
        this.f2672x1 = str;
    }

    public final void setExportType(int i) {
        this.f2668k4 = i;
    }

    public final void setFlavor(int i) {
        this.f2666dy = i;
    }

    public final void setImagesSaveFolderName(String str) {
        this.f2669kk = str;
    }

    public final void setNewLineType(int i) {
        this.f2671to = i;
    }

    public final void setShowComments(boolean z) {
        this.f2665du = z;
    }

    public final void setShowHiddenSlides(boolean z) {
        this.f2667h4 = z;
    }

    public final void setShowSlideNumber(boolean z) {
        this.f2670m9 = z;
    }
}
