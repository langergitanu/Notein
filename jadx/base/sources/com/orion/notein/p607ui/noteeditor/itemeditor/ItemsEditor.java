package com.orion.notein.p607ui.noteeditor.itemeditor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditor;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.PressurePoint;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.TextBoxInfo;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o00o0o0o.C25446OooO0Oo;
import o0O0oOOO.C26120OooO0Oo;
import o0O0oOOO.C26121OooO0o0;
import o0Ooo00O.ViewOnClickListenerC29368OooO0OO;
import o0Ooo00O.ViewOnTouchListenerC29366OooO00o;
import o0Ooo00O.ViewOnTouchListenerC29367OooO0O0;
import o0oo0OOo.C31237OooO0O0;
import o0oo0Oo.AbstractC31239OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "OooOoOO", "Z", "getColorInversion", "()Z", "setColorInversion", "(Z)V", "colorInversion", "Lo0O0oOOO/OooO0Oo;", "OooOoo0", "Lo0O0oOOO/OooO0Oo;", "getEngine", "()Lo0O0oOOO/OooO0Oo;", "engine", "Landroid/graphics/Bitmap;", "OooOoo", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "bitmap", "Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditor$OooO00o;", "Oooo00O", "Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditor$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditor$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditor$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ItemsEditor extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final /* synthetic */ int f74674Oooo0O0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public View f74675OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ImageView f74676OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f74677OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View f74678OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name and from kotlin metadata */
    public boolean colorInversion;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name and from kotlin metadata */
    public Bitmap bitmap;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name and from kotlin metadata */
    public final C26120OooO0Oo engine;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final PointF f74682OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final PointF f74683OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final ViewOnTouchListenerC29367OooO0O0 f74684Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final PointF f74685Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final ViewOnTouchListenerC29366OooO00o f74687Oooo00o;

    public interface OooO00o {
        void OooO00o(float f, float f2);

        void OooO0O0(int i, int i2);

        void onCancel();

        void onFinish();

        void onMove(int i, int i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [o0Ooo00O.OooO00o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o0Ooo00O.OooO0O0] */
    public ItemsEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f74677OooOoO = true;
        this.engine = new C26120OooO0Oo();
        this.f74682OooOooO = new PointF();
        this.f74683OooOooo = new PointF();
        this.f74685Oooo000 = new PointF();
        View.inflate(context, R.layout.layout_items_editor, this);
        this.f74687Oooo00o = new View.OnTouchListener() { // from class: o0Ooo00O.OooO00o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = ItemsEditor.f74674Oooo0O0;
                int action = motionEvent.getAction();
                ItemsEditor itemsEditor = this.f104134OooOo0o;
                if (action == 0) {
                    itemsEditor.requestDisallowInterceptTouchEvent(true);
                    itemsEditor.f74682OooOooO.set(motionEvent.getRawX(), motionEvent.getRawY());
                    itemsEditor.getLocationOnScreen(new int[2]);
                    PointF pointFOooOO0O = C25446OooO0Oo.OooOO0O(new PointF((-itemsEditor.getWidth()) / 2.0f, (-itemsEditor.getHeight()) / 2.0f), new PointF(0.0f, 0.0f), itemsEditor.getRotation());
                    itemsEditor.f74685Oooo000.set(r14[0] - pointFOooOO0O.x, r14[1] - pointFOooOO0O.y);
                    return true;
                }
                if (action == 1) {
                    ItemsEditor.OooO00o oooO00o = itemsEditor.eventListener;
                    if (oooO00o != null) {
                        oooO00o.onFinish();
                    }
                    itemsEditor.requestDisallowInterceptTouchEvent(false);
                    return true;
                }
                if (action == 2) {
                    itemsEditor.f74683OooOooo.set(motionEvent.getRawX(), motionEvent.getRawY());
                    PointF pointF = itemsEditor.f74685Oooo000;
                    PointF pointF2 = itemsEditor.f74682OooOooO;
                    PointF pointF3 = itemsEditor.f74683OooOooo;
                    float f = pointF2.x;
                    float f2 = pointF.x;
                    float f3 = pointF2.y;
                    float f4 = pointF.y;
                    double dAtan2 = ((double) ((float) Math.atan2(f - f2, f3 - f4))) - ((double) ((float) Math.atan2(pointF3.x - f2, pointF3.y - f4)));
                    if (dAtan2 > 3.141592653589793d) {
                        dAtan2 -= 6.283185307179586d;
                    }
                    if (dAtan2 < -3.141592653589793d) {
                        dAtan2 += 6.283185307179586d;
                    }
                    double d = (dAtan2 * ((double) 180)) / 3.141592653589793d;
                    float f5 = pointF2.x;
                    float f6 = pointF.x;
                    float f7 = f5 - f6;
                    float f8 = pointF2.y;
                    float f9 = pointF.y;
                    float f10 = f8 - f9;
                    float f11 = pointF3.x - f6;
                    float f12 = pointF3.y - f9;
                    float fSqrt = ((float) Math.sqrt((f11 * f11) + (f12 * f12))) / ((float) Math.sqrt((f7 * f7) + (f10 * f10)));
                    C34406OooO00o.f123390OooO00o.OooO00o("ACTION_MOVE angle: " + d + ", scale: " + fSqrt, new Object[0]);
                    ItemsEditor.OooO00o oooO00o2 = itemsEditor.eventListener;
                    if (oooO00o2 != null) {
                        oooO00o2.OooO00o((float) d, fSqrt);
                    }
                }
                return true;
            }
        };
        this.f74684Oooo0 = new View.OnTouchListener() { // from class: o0Ooo00O.OooO0O0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ItemsEditor.OooO00o oooO00o;
                int i = ItemsEditor.f74674Oooo0O0;
                int action = motionEvent.getAction();
                ItemsEditor itemsEditor = this.f104135OooOo0o;
                if (action == 0) {
                    itemsEditor.requestDisallowInterceptTouchEvent(true);
                    itemsEditor.f74682OooOooO.set(motionEvent.getRawX(), motionEvent.getRawY());
                } else if (action == 1) {
                    ItemsEditor.OooO00o oooO00o2 = itemsEditor.eventListener;
                    if (oooO00o2 != null) {
                        oooO00o2.onFinish();
                    }
                    itemsEditor.requestDisallowInterceptTouchEvent(false);
                } else if (action == 2) {
                    itemsEditor.f74683OooOooo.set(motionEvent.getRawX(), motionEvent.getRawY());
                    PointF pointF = itemsEditor.f74683OooOooo;
                    float f = pointF.x;
                    PointF pointF2 = itemsEditor.f74682OooOooO;
                    float f2 = f - pointF2.x;
                    float f3 = pointF.y - pointF2.y;
                    if (view.getId() == R.id.img_content && (oooO00o = itemsEditor.eventListener) != null) {
                        oooO00o.onMove((int) f2, (int) f3);
                    }
                }
                return true;
            }
        };
    }

    public final void OooO00o(Canvas canvas, ArrayList arrayList, float f, boolean z) {
        RectF iconBoundingBox;
        C26121OooO0o0 c26121OooO0o0 = new C26121OooO0o0(canvas, getContext());
        c26121OooO0o0.f89175OooO0OO = this.colorInversion;
        c26121OooO0o0.f89176OooO0Oo = true;
        C26120OooO0Oo c26120OooO0Oo = this.engine;
        c26120OooO0Oo.OooOo00(c26121OooO0o0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) it.next();
            int itemType = interfaceC31284OooO0O0.getItemType();
            if (itemType == 0) {
                DrawRecord drawRecord = (DrawRecord) interfaceC31284OooO0O0;
                AbstractC31239OooO00o abstractC31239OooO00oCreateTool = DrawToolFactory.INSTANCE.createTool(drawRecord.getType(), drawRecord.getColor(), drawRecord.getWidth(), new Bundle(), new C26120OooO0Oo());
                if (this.f74677OooOoO) {
                    abstractC31239OooO00oCreateTool.OooOO0o(f);
                }
                abstractC31239OooO00oCreateTool.f111424OooOO0o = f;
                for (PressurePoint pressurePoint : drawRecord.getPoints()) {
                    abstractC31239OooO00oCreateTool.OooO(pressurePoint.getX(), pressurePoint.getY(), pressurePoint.getP(), pressurePoint.getAction(), C34434OooOoO.f123453OooOo0o);
                    if (pressurePoint.getAction() == 1) {
                        abstractC31239OooO00oCreateTool.OooOO0(c26121OooO0o0, false);
                    }
                }
            } else if (itemType == 9) {
                ((InkStrokeInfo) interfaceC31284OooO0O0).render(c26120OooO0Oo, c26121OooO0o0, 1.0f, z);
            } else if (itemType != 2) {
                if (itemType != 3) {
                    if (itemType != 4) {
                        interfaceC31284OooO0O0.render(c26120OooO0Oo, c26121OooO0o0, f);
                    } else {
                        TextBoxInfo textBoxInfo = (TextBoxInfo) interfaceC31284OooO0O0;
                        C31237OooO0O0 c31237OooO0O0 = C31237OooO0O0.f111407OooO0O0;
                        Context context = getContext();
                        OooOOO0.OooO0o(context, "getContext(...)");
                        c31237OooO0O0.getClass();
                        textBoxInfo.render(c26120OooO0Oo, c26121OooO0o0, C31237OooO0O0.OooO0O0(context, textBoxInfo), 1.0f);
                    }
                } else if (interfaceC31284OooO0O0 instanceof QuoteInfo) {
                    QuoteInfo quoteInfo = (QuoteInfo) interfaceC31284OooO0O0;
                    if (quoteInfo.getType() == 6 && (iconBoundingBox = quoteInfo.getIconBoundingBox()) != null) {
                        c26121OooO0o0.OooO0OO().drawBitmap(DrawToolFactory.INSTANCE.getTextAnnoIconLargeBitmap(), (Rect) null, iconBoundingBox, (Paint) null);
                    }
                }
            } else if (this.f74677OooOoO) {
                interfaceC31284OooO0O0.render(c26120OooO0Oo, c26121OooO0o0, f);
            } else {
                interfaceC31284OooO0O0.render(c26120OooO0Oo, c26121OooO0o0, 1.0f);
            }
        }
    }

    public final void OooO0O0() {
        ImageView imageView = this.f74676OooOo0o;
        if (imageView == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView.setBackground(getContext().getDrawable(R.drawable.bg_strokes_editor));
        ImageView imageView2 = this.f74676OooOo0o;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView2.setOnTouchListener(this.f74684Oooo0);
        View view = this.f74675OooOo;
        if (view == null) {
            OooOOO0.OooOOOO("cancel");
            throw null;
        }
        view.setVisibility(0);
        View view2 = this.f74678OooOoO0;
        if (view2 != null) {
            view2.setVisibility(0);
        } else {
            OooOOO0.OooOOOO("scale");
            throw null;
        }
    }

    public final void OooO0OO() {
        Log.d("ItemsEditor", "hide");
        setRotation(0.0f);
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        setVisibility(8);
        ImageView imageView = this.f74676OooOo0o;
        if (imageView == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView.setBackground(null);
        ImageView imageView2 = this.f74676OooOo0o;
        if (imageView2 == null) {
            OooOOO0.OooOOOO("image");
            throw null;
        }
        imageView2.setOnTouchListener(null);
        View view = this.f74675OooOo;
        if (view == null) {
            OooOOO0.OooOOOO("cancel");
            throw null;
        }
        view.setVisibility(8);
        View view2 = this.f74678OooOoO0;
        if (view2 != null) {
            view2.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("scale");
            throw null;
        }
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final boolean getColorInversion() {
        return this.colorInversion;
    }

    public final C26120OooO0Oo getEngine() {
        return this.engine;
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ImageView imageView = (ImageView) findViewById(R.id.img_content);
        imageView.setClickable(false);
        imageView.setLongClickable(false);
        this.f74676OooOo0o = imageView;
        View viewFindViewById = findViewById(R.id.img_cancel);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC29368OooO0OO(this, 0));
        this.f74675OooOo = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.img_scale);
        viewFindViewById2.setOnTouchListener(this.f74687Oooo00o);
        this.f74678OooOoO0 = viewFindViewById2;
    }

    public final void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public final void setColorInversion(boolean z) {
        this.colorInversion = z;
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }
}
