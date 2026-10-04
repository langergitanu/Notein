package com.orion.notein.p607ui.noteeditor.propertypanel.p608ai;

import android.view.MotionEvent;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/ai/AiFabView;", "Landroidx/cardview/widget/CardView;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AiFabView extends CardView {
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        int action = event.getAction();
        if (action == 0) {
            event.getX();
            event.getY();
            throw null;
        }
        if (action == 1) {
            event.getX();
            throw null;
        }
        if (action != 2) {
            return true;
        }
        event.getX();
        throw null;
    }
}
