package com.orion.notein.p607ui.noteeditor.shapeeditor;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.orion.penkit.models.ShapeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0o000O0.OooO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/shapeeditor/AbstractShapeEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lcom/orion/penkit/models/ShapeInfo;", "getItems", "()Ljava/util/List;", "Lo0o000O0/OooO0o;", "OooOo0o", "Lo0o000O0/OooO0o;", "getEventListener", "()Lo0o000O0/OooO0o;", "setEventListener", "(Lo0o000O0/OooO0o;)V", "eventListener", "", "OooOo", "Z", "getColorInversion", "()Z", "setColorInversion", "(Z)V", "colorInversion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class AbstractShapeEditor extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    public boolean colorInversion;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name and from kotlin metadata */
    public OooO0o eventListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractShapeEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
    }

    public abstract void OooO00o(float f, float f2);

    public abstract void OooO0O0(List<ShapeInfo> list, RectF rectF, float f, boolean z);

    public abstract void OooO0OO(float f, float f2);

    public final boolean getColorInversion() {
        return this.colorInversion;
    }

    public final OooO0o getEventListener() {
        return this.eventListener;
    }

    public abstract List<ShapeInfo> getItems();

    public final void setColorInversion(boolean z) {
        this.colorInversion = z;
    }

    public final void setEventListener(OooO0o oooO0o) {
        this.eventListener = oooO0o;
    }
}
