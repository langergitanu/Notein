package com.orion.notein.p607ui.ocr.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/ui/ocr/view/AiOcrEditorList;", "Landroidx/recyclerview/widget/RecyclerView;", "", "OooOo0o", "Z", "getInterceptTouchEvents", "()Z", "setInterceptTouchEvents", "(Z)V", "interceptTouchEvents", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AiOcrEditorList extends RecyclerView {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public boolean interceptTouchEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiOcrEditorList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
    }

    public final boolean getInterceptTouchEvents() {
        return this.interceptTouchEvents;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        return this.interceptTouchEvents;
    }

    public final void setInterceptTouchEvents(boolean z) {
        this.interceptTouchEvents = z;
    }
}
