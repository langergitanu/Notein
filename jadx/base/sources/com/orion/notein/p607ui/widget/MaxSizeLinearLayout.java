package com.orion.notein.p607ui.widget;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/ui/widget/MaxSizeLinearLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "", "OooOo0o", "I", "getMaxHeight", "()I", "setMaxHeight", "(I)V", "maxHeight", "OooOo", "getMaxWidth", "setMaxWidth", "maxWidth", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MaxSizeLinearLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public int maxWidth;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public int maxHeight;

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.maxWidth;
        if (size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        int i4 = this.maxHeight;
        if (size2 > i4) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public final void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public final void setMaxWidth(int i) {
        this.maxWidth = i;
    }
}
