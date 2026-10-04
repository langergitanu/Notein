package com.orion.notein.p607ui.noteeditor.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/view/EditorSwitchPanel;", "Landroid/widget/FrameLayout;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class EditorSwitchPanel extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorSwitchPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchDragEvent(DragEvent dragEvent) {
        return false;
    }
}
