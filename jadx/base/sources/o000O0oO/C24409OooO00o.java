package o000O0oO;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.OooOOO0;
import o0000OO0.OooOOOO;
import o000O0oo.C24431OooOo0;
import o000Oo00.InterfaceC24514OooO00o;

/* JADX INFO: renamed from: o000O0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24409OooO00o<CompletedShapeT> extends View {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final LinkedHashMap f82417OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC24414OooOO0o<?, ?, CompletedShapeT> f82418OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24409OooO00o(Context context, InterfaceC24414OooOO0o shapeWorkflow) {
        super(context);
        OooOOO0.OooO0oO(shapeWorkflow, "shapeWorkflow");
        this.f82418OooOo0o = shapeWorkflow;
        this.f82417OooOo = new LinkedHashMap();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOOO oooOOOOOooO0OO = this.f82418OooOo0o.OooO0OO();
        Iterator it = this.f82417OooOo.entrySet().iterator();
        while (it.hasNext()) {
            C24431OooOo0 c24431OooOo0 = (C24431OooOo0) ((Map.Entry) it.next()).getValue();
            Matrix matrix = c24431OooOo0.f82454OooO0OO;
            int iSave = canvas.save();
            canvas.concat(matrix);
            try {
                CompletedShapeT completedshapet = c24431OooOo0.f82453OooO0O0;
                Matrix matrix2 = c24431OooOo0.f82454OooO0OO;
                oooOOOOOooO0OO.getClass();
                ((InterfaceC24514OooO00o) oooOOOOOooO0OO.f81436OooO00o).OooO00o(canvas, (androidx.ink.strokes.OooOOO0) completedshapet, matrix2);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }
}
