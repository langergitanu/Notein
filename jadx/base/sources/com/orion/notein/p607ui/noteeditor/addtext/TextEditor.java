package com.orion.notein.p607ui.noteeditor.addtext;

import Oooo0.o000000O;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.PersistableBundleKt;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o0OoOo0;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.common.cache.RunnableC22497OooO0Oo;
import com.google.gson.Gson;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.addtext.TextEditor;
import com.orion.notein.p607ui.noteeditor.addtext.richeditor.NoteinRichEditor;
import com.orion.notein.richeditor.RTEditText;
import com.orion.notein.richeditor.RTEditTextListener;
import com.orion.notein.richeditor.api.format.RTFormat;
import com.orion.notein.richeditor.api.format.RTText;
import com.orion.notein.richeditor.converter.ConverterSpannedToHtml;
import com.orion.notein.richeditor.effects.AbsoluteSizeEffect;
import com.orion.notein.richeditor.effects.AlignmentEffect;
import com.orion.notein.richeditor.effects.BoldEffect;
import com.orion.notein.richeditor.effects.Effect;
import com.orion.notein.richeditor.effects.Effects;
import com.orion.notein.richeditor.effects.ForegroundColorEffect;
import com.orion.notein.richeditor.effects.ItalicEffect;
import com.orion.notein.richeditor.effects.TypefaceEffect;
import com.orion.notein.richeditor.effects.UnderlineEffect;
import com.orion.notein.richeditor.fonts.FontManager;
import com.orion.notein.richeditor.fonts.RTTypeface;
import com.orion.notein.richeditor.spans.AbsoluteSizeSpan;
import com.orion.notein.richeditor.spans.AlignmentSpan;
import com.orion.notein.richeditor.spans.RTSpan;
import com.orion.notein.richeditor.utils.Selection;
import com.orion.penkit.models.LayerInfo;
import com.orion.penkit.models.TextBoxInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000oooo.C24761OooO;
import o00o00.C25206OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26295OoooO00;
import o0OoO0oo.ViewOnClickListenerC28700OooOOo;
import o0OoO0oo.ViewOnClickListenerC28701OooOOo0;
import o0OoO0oo.ViewOnClickListenerC28702OooOOoo;
import o0OoOOO0.C29040OooO;
import o0OoOOO0.C29048OooO0oo;
import o0OoOOO0.C29051OooOO0o;
import o0OoOOO0.C29061OooOOo0;
import o0OoOOO0.RunnableC29075Oooo;
import o0OoOOO0.ViewOnClickListenerC29047OooO0oO;
import o0oOoOo.C31083OooooO0;
import o0oo0OOo.C31237OooO0O0;
import oO00ooO.C32443OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0O0o.C33600OooOo0o;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/addtext/TextEditor;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/RectF;", "getUnrotatedTextBoxBounds", "()Landroid/graphics/RectF;", "Lcom/orion/notein/ui/noteeditor/addtext/TextEditor$OooO0O0;", "Oooo0", "Lcom/orion/notein/ui/noteeditor/addtext/TextEditor$OooO0O0;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/addtext/TextEditor$OooO0O0;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/addtext/TextEditor$OooO0O0;)V", "eventListener", "OooO0O0", "OooO0OO", "OooO0Oo", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TextEditor extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final /* synthetic */ int f74047Oooo0o0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public OooOo f74048OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C29051OooOO0o f74049OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ViewGroup f74050OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public NoteinRichEditor f74051OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f74052OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Handler f74053OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C29048OooO0oo f74054OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public float f74055OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public float f74056OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name and from kotlin metadata */
    public OooO0O0 eventListener;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f74058Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f74059Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public String f74060Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final C23382OooO0o0 f74061Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final RunnableC29075Oooo f74062Oooo0OO;

    public final class OooO00o implements View.OnTouchListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f74063OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public long f74064OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public float f74066OooOoO0;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final PointF f74065OooOoO = new PointF();

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final PointF f74067OooOoOO = new PointF();

        public OooO00o() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View v, MotionEvent event) {
            OooO0O0 eventListener;
            OooO0O0 eventListener2;
            OooOOO0.OooO0oO(v, "v");
            OooOOO0.OooO0oO(event, "event");
            int action = event.getAction() & 255;
            PointF pointF = this.f74065OooOoO;
            TextEditor textEditor = TextEditor.this;
            if (action != 0) {
                PointF pointF2 = this.f74067OooOoOO;
                if (action == 1) {
                    boolean z = false;
                    textEditor.requestDisallowInterceptTouchEvent(false);
                    textEditor.f74053OooOoo.removeCallbacks(textEditor.f74062Oooo0OO);
                    pointF2.set(event.getRawX(), event.getRawY());
                    if (Math.abs(pointF2.x - pointF.x) < 20.0f && Math.abs(pointF2.y - pointF.y) < 20.0f) {
                        z = true;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f74064OooOo0o;
                    NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                    if (noteinRichEditor == null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    if (!noteinRichEditor.isEnabled() && z && jCurrentTimeMillis < 100) {
                        float x = event.getX();
                        NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor2 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float scaleX = x / noteinRichEditor2.getScaleX();
                        float y = event.getY();
                        NoteinRichEditor noteinRichEditor3 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor3 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        float scaleY = y / noteinRichEditor3.getScaleY();
                        NoteinRichEditor noteinRichEditor4 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor4 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        int offsetForPosition = noteinRichEditor4.getOffsetForPosition(scaleX, scaleY);
                        if (offsetForPosition > 0) {
                            textEditor.OooO0OO(offsetForPosition);
                            return true;
                        }
                        textEditor.OooO0O0();
                        return true;
                    }
                    NoteinRichEditor noteinRichEditor5 = textEditor.f74051OooOoO0;
                    if (noteinRichEditor5 == null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    if (!noteinRichEditor5.hasFocus() && (eventListener2 = textEditor.getEventListener()) != null) {
                        eventListener2.OooO0Oo(textEditor.getUnrotatedTextBoxBounds());
                        return true;
                    }
                } else if (action == 2) {
                    pointF2.set(event.getRawX(), event.getRawY());
                    if (Math.abs(pointF2.x - pointF.x) > 20.0f || Math.abs(pointF2.y - pointF.y) > 20.0f) {
                        textEditor.f74053OooOoo.removeCallbacks(textEditor.f74062Oooo0OO);
                    }
                    float rawX = event.getRawX() - this.f74063OooOo;
                    float rawY = event.getRawY() - this.f74066OooOoO0;
                    this.f74063OooOo = event.getRawX();
                    this.f74066OooOoO0 = event.getRawY();
                    int i = (int) rawX;
                    int i2 = (int) rawY;
                    NoteinRichEditor noteinRichEditor6 = textEditor.f74051OooOoO0;
                    if (noteinRichEditor6 == null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    noteinRichEditor6.setX(noteinRichEditor6.getX() + i);
                    NoteinRichEditor noteinRichEditor7 = textEditor.f74051OooOoO0;
                    if (noteinRichEditor7 == null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    noteinRichEditor7.setY(noteinRichEditor7.getY() + i2);
                    textEditor.OooO();
                    return true;
                }
            } else {
                textEditor.requestDisallowInterceptTouchEvent(true);
                this.f74064OooOo0o = System.currentTimeMillis();
                pointF.set(event.getRawX(), event.getRawY());
                this.f74063OooOo = event.getRawX();
                this.f74066OooOoO0 = event.getRawY();
                textEditor.f74053OooOoo.postDelayed(textEditor.f74062Oooo0OO, 1500L);
                NoteinRichEditor noteinRichEditor8 = textEditor.f74051OooOoO0;
                if (noteinRichEditor8 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                if (!noteinRichEditor8.hasFocus() && (eventListener = textEditor.getEventListener()) != null) {
                    eventListener.OooO0OO();
                }
            }
            return true;
        }
    }

    public interface OooO0O0 {
        Float OooO00o();

        float OooO0O0(float f);

        void OooO0OO();

        void OooO0Oo(RectF rectF);
    }

    public static final class OooO0OO extends View.DragShadowBuilder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final StaticLayout f74069OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f74070OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float f74071OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(View v, StaticLayout staticLayout, float f) {
            super(v);
            OooOOO0.OooO0oO(v, "v");
            this.f74069OooO00o = staticLayout;
            this.f74070OooO0O0 = f;
            if (staticLayout == null) {
                this.f74071OooO0OO = -1.0f;
                return;
            }
            int lineCount = staticLayout.getLineCount();
            float fMax = 0.0f;
            for (int i = 0; i < lineCount; i++) {
                fMax = Math.max(fMax, this.f74069OooO00o.getLineWidth(i));
            }
            this.f74071OooO0OO = fMax;
        }

        @Override // android.view.View.DragShadowBuilder
        public final void onDrawShadow(Canvas canvas) {
            OooOOO0.OooO0oO(canvas, "canvas");
            canvas.save();
            float f = this.f74070OooO0O0;
            canvas.scale(f, f);
            StaticLayout staticLayout = this.f74069OooO00o;
            if (staticLayout != null) {
                staticLayout.draw(canvas);
            } else {
                getView().draw(canvas);
            }
            canvas.drawColor(Color.parseColor("#66CCCCCC"));
            canvas.restore();
        }

        @Override // android.view.View.DragShadowBuilder
        public final void onProvideShadowMetrics(Point size, Point touch) {
            int height;
            int width;
            OooOOO0.OooO0oO(size, "size");
            OooOOO0.OooO0oO(touch, "touch");
            float f = this.f74070OooO0O0;
            if (this.f74069OooO00o == null) {
                width = (int) (getView().getWidth() * f);
                height = (int) (getView().getHeight() * f);
            } else {
                int iOooO0o = (int) ((this.f74071OooO0OO + o000000O.OooO0o(4)) * f);
                height = (int) (r1.getHeight() * f);
                width = iOooO0o;
            }
            size.set(width, height);
            if (ManufacturerUtils.isSamsungDevice()) {
                touch.set(width / 2, height / 2);
            } else {
                touch.set(0, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.TextEditor$OooO0Oo, reason: case insensitive filesystem */
    public final class ViewOnTouchListenerC23381OooO0Oo implements View.OnTouchListener {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public float f74072OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public float f74073OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final PointF f74075OooOoO0 = new PointF();

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final PointF f74074OooOoO = new PointF();

        public ViewOnTouchListenerC23381OooO0Oo() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0151  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onTouch(View v, MotionEvent event) {
            OooO0O0 eventListener;
            OooO0O0 eventListener2;
            boolean z;
            NoteinRichEditor noteinRichEditor;
            boolean z2 = false;
            OooOOO0.OooO0oO(v, "v");
            OooOOO0.OooO0oO(event, "event");
            int action = event.getAction();
            TextEditor textEditor = TextEditor.this;
            if (action == 0) {
                textEditor.requestDisallowInterceptTouchEvent(true);
                this.f74075OooOoO0.set(event.getRawX(), event.getRawY());
                this.f74073OooOo0o = event.getRawX();
                this.f74072OooOo = event.getRawY();
                NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                if (noteinRichEditor2 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                if (!noteinRichEditor2.hasFocus() && (eventListener = textEditor.getEventListener()) != null) {
                    eventListener.OooO0OO();
                }
            } else if (action == 1) {
                this.f74073OooOo0o = event.getRawX();
                this.f74072OooOo = event.getRawY();
                textEditor.requestDisallowInterceptTouchEvent(false);
                NoteinRichEditor noteinRichEditor3 = textEditor.f74051OooOoO0;
                if (noteinRichEditor3 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                if (!noteinRichEditor3.hasFocus() && (eventListener2 = textEditor.getEventListener()) != null) {
                    eventListener2.OooO0Oo(textEditor.getUnrotatedTextBoxBounds());
                    return true;
                }
            } else if (action == 2) {
                this.f74074OooOoO.set(event.getRawX(), event.getRawY());
                float rawX = event.getRawX() - this.f74073OooOo0o;
                float rawY = event.getRawY() - this.f74072OooOo;
                this.f74073OooOo0o = event.getRawX();
                this.f74072OooOo = event.getRawY();
                int i = (int) rawY;
                int i2 = TextEditor.f74047Oooo0o0;
                textEditor.getClass();
                float[] fArr = {(int) rawX, i};
                Matrix matrix = new Matrix();
                NoteinRichEditor noteinRichEditor4 = textEditor.f74051OooOoO0;
                if (noteinRichEditor4 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                matrix.postRotate(-noteinRichEditor4.getRotation());
                matrix.mapPoints(fArr);
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = textEditor.f74056OooOooo;
                int i3 = (int) (f / f3);
                int i4 = (int) (f2 / f3);
                if (i3 >= 0) {
                    z = false;
                    if (i4 < 0) {
                        NoteinRichEditor noteinRichEditor5 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor5 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        int height = noteinRichEditor5.getHeight() + i4;
                        NoteinRichEditor noteinRichEditor6 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor6 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        if (height < noteinRichEditor6.getMinHeight()) {
                            z2 = true;
                        }
                    }
                    if (!z && !z2) {
                        noteinRichEditor = textEditor.f74051OooOoO0;
                        if (noteinRichEditor != null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        ViewGroup.LayoutParams layoutParams = noteinRichEditor.getLayoutParams();
                        NoteinRichEditor noteinRichEditor7 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor7 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        int width = noteinRichEditor7.getWidth() + i3;
                        NoteinRichEditor noteinRichEditor8 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor8 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        layoutParams.width = Math.min(width, noteinRichEditor8.getMaxWidth());
                        NoteinRichEditor noteinRichEditor9 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor9 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        int height2 = noteinRichEditor9.getHeight() + i4;
                        if (textEditor.f74058Oooo000) {
                            NoteinRichEditor noteinRichEditor10 = textEditor.f74051OooOoO0;
                            if (noteinRichEditor10 == null) {
                                OooOOO0.OooOOOO("richEditor");
                                throw null;
                            }
                            layoutParams.height = Math.min(height2, noteinRichEditor10.getMaxHeight());
                            NoteinRichEditor noteinRichEditor11 = textEditor.f74051OooOoO0;
                            if (noteinRichEditor11 == null) {
                                OooOOO0.OooOOOO("richEditor");
                                throw null;
                            }
                            if (height2 > noteinRichEditor11.getMaxHeight() && System.currentTimeMillis() - textEditor.f74059Oooo00O >= 9000) {
                                textEditor.f74059Oooo00O = System.currentTimeMillis();
                                Context context = textEditor.getContext();
                                if (context != null) {
                                    String string = textEditor.getContext().getString(R.string.text_editor_height_limit);
                                    OooOOO0.OooO0o(string, "getString(...)");
                                    C25206OooO0Oo.OooO0oO(context, string);
                                }
                            }
                        } else {
                            layoutParams.height = height2;
                        }
                        noteinRichEditor.setLayoutParams(layoutParams);
                        textEditor.requestLayout();
                        return true;
                    }
                } else {
                    NoteinRichEditor noteinRichEditor12 = textEditor.f74051OooOoO0;
                    if (noteinRichEditor12 == null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    int width2 = noteinRichEditor12.getWidth() + i3;
                    NoteinRichEditor noteinRichEditor13 = textEditor.f74051OooOoO0;
                    if (noteinRichEditor13 == null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    if (width2 < noteinRichEditor13.getMinWidth()) {
                        z = true;
                    }
                    if (i4 < 0) {
                    }
                    if (!z) {
                        noteinRichEditor = textEditor.f74051OooOoO0;
                        if (noteinRichEditor != null) {
                        }
                    }
                }
            } else if (action == 3) {
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.addtext.TextEditor$OooO0o0, reason: case insensitive filesystem */
    public final class C23382OooO0o0 implements RTEditTextListener {
        public C23382OooO0o0() {
        }

        public final boolean OooO00o(List<? extends RTSpan> list, Selection selection) {
            try {
                TextEditor textEditor = TextEditor.this;
                Iterator<T> it = list.iterator();
                int iMin = 0;
                while (true) {
                    if (it.hasNext()) {
                        RTSpan rTSpan = (RTSpan) it.next();
                        NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                        if (noteinRichEditor == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        Editable text = noteinRichEditor.getText();
                        int spanStart = text != null ? text.getSpanStart(rTSpan) : 0;
                        NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor2 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        Editable text2 = noteinRichEditor2.getText();
                        int spanEnd = text2 != null ? text2.getSpanEnd(rTSpan) : 0;
                        if (spanStart <= selection.start() && spanEnd >= selection.end()) {
                            break;
                        }
                        iMin += Math.min(selection.end(), spanEnd) - Math.max(selection.start(), spanStart);
                    } else if (iMin < selection.end() - selection.start()) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }

        @Override // com.orion.notein.richeditor.RTEditTextListener
        public final void onFocusChanged(RTEditText rTEditText, boolean z) {
        }

        @Override // com.orion.notein.richeditor.RTEditTextListener
        public final void onRichTextEditingChanged(RTEditText rTEditText, boolean z) {
        }

        @Override // com.orion.notein.richeditor.RTEditTextListener
        public final void onSelectionChanged(RTEditText editor, int i, int i2, int i3) {
            TextEditor textEditor;
            Object obj;
            Boolean bool;
            OooOOO0.OooO0oO(editor, "editor");
            C32443OooOOO c32443OooOOO = new C32443OooOOO(10, "");
            C32443OooOOO c32443OooOOO2 = new C32443OooOOO(13, 30);
            Boolean bool2 = Boolean.FALSE;
            C32443OooOOO c32443OooOOO3 = new C32443OooOOO(0, bool2);
            C32443OooOOO c32443OooOOO4 = new C32443OooOOO(1, bool2);
            C32443OooOOO c32443OooOOO5 = new C32443OooOOO(2, bool2);
            C32443OooOOO c32443OooOOO6 = new C32443OooOOO(3, bool2);
            C32443OooOOO c32443OooOOO7 = new C32443OooOOO(4, bool2);
            C32443OooOOO c32443OooOOO8 = new C32443OooOOO(7, bool2);
            C32443OooOOO c32443OooOOO9 = new C32443OooOOO(8, bool2);
            C32443OooOOO c32443OooOOO10 = new C32443OooOOO(9, bool2);
            TextEditor textEditor2 = TextEditor.this;
            NoteinRichEditor noteinRichEditor = textEditor2.f74051OooOoO0;
            if (noteinRichEditor == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            TextEditor textEditor3 = textEditor2;
            LinkedHashMap linkedHashMapOooO = C34444Oooo0O0.OooO(c32443OooOOO, c32443OooOOO2, c32443OooOOO3, c32443OooOOO4, c32443OooOOO5, c32443OooOOO6, c32443OooOOO7, c32443OooOOO8, c32443OooOOO9, c32443OooOOO10, new C32443OooOOO(12, Integer.valueOf(noteinRichEditor.getCurrentTextColor())));
            Selection selection = new Selection(i, i2);
            ArrayList<Effect> ALL_EFFECTS = Effects.ALL_EFFECTS;
            OooOOO0.OooO0o(ALL_EFFECTS, "ALL_EFFECTS");
            for (Effect effect : ALL_EFFECTS) {
                if (effect instanceof TypefaceEffect) {
                    List<RTSpan> listSpansInSelection = Effects.TYPEFACE.spansInSelection(editor, selection);
                    OooOOO0.OooO0Oo(listSpansInSelection);
                    if (!listSpansInSelection.isEmpty()) {
                        List<RTSpan> list = listSpansInSelection;
                        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object value = ((RTSpan) it.next()).getValue();
                            OooOOO0.OooO0o0(value, "null cannot be cast to non-null type com.orion.notein.richeditor.fonts.RTTypeface");
                            arrayList.add(((RTTypeface) value).getName());
                        }
                        if (oOo000Oo.OooOo.o0OO00O(arrayList).size() <= 1 && !OooO00o(listSpansInSelection, selection)) {
                            Object value2 = ((RTSpan) oOo000Oo.OooOo.Oooo0oO(listSpansInSelection)).getValue();
                            OooOOO0.OooO0o0(value2, "null cannot be cast to non-null type com.orion.notein.richeditor.fonts.RTTypeface");
                            linkedHashMapOooO.put(10, ((RTTypeface) value2).getName());
                        } else {
                            linkedHashMapOooO.put(10, "多种字体");
                        }
                    }
                } else if (effect instanceof AbsoluteSizeEffect) {
                    List<RTSpan> listSpansInSelection2 = Effects.FONT_SIZE.spansInSelection(editor, selection);
                    OooOOO0.OooO0Oo(listSpansInSelection2);
                    if (!listSpansInSelection2.isEmpty()) {
                        List<RTSpan> list2 = listSpansInSelection2;
                        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((RTSpan) it2.next()).getValue());
                        }
                        if (oOo000Oo.OooOo.o0OO00O(arrayList2).size() <= 1 && !OooO00o(listSpansInSelection2, selection)) {
                            OooOOO0.OooO0o0(oOo000Oo.OooOo.Oooo0oO(listSpansInSelection2), "null cannot be cast to non-null type com.orion.notein.richeditor.spans.AbsoluteSizeSpan");
                            linkedHashMapOooO.put(13, Float.valueOf(((AbsoluteSizeSpan) r7).getValue().intValue()));
                        } else {
                            linkedHashMapOooO.put(13, -1);
                        }
                    }
                } else if (effect instanceof BoldEffect) {
                    OooOOO0.OooO0o(Effects.BOLD.spansInSelection(editor, selection), "spansInSelection(...)");
                    linkedHashMapOooO.put(0, Boolean.valueOf(!r8.isEmpty()));
                } else if (effect instanceof ItalicEffect) {
                    OooOOO0.OooO0o(Effects.ITALIC.spansInSelection(editor, selection), "spansInSelection(...)");
                    linkedHashMapOooO.put(1, Boolean.valueOf(!r8.isEmpty()));
                } else if (effect instanceof UnderlineEffect) {
                    OooOOO0.OooO0o(Effects.UNDERLINE.spansInSelection(editor, selection), "spansInSelection(...)");
                    linkedHashMapOooO.put(2, Boolean.valueOf(!r8.isEmpty()));
                } else {
                    if (effect instanceof AlignmentEffect) {
                        AlignmentEffect alignmentEffect = Effects.ALIGNMENT;
                        textEditor = textEditor3;
                        NoteinRichEditor noteinRichEditor2 = textEditor.f74051OooOoO0;
                        if (noteinRichEditor2 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        List<RTSpan> listSpansInSelection3 = alignmentEffect.spansInSelection(noteinRichEditor2, selection);
                        OooOOO0.OooO0Oo(listSpansInSelection3);
                        if (listSpansInSelection3.isEmpty()) {
                            obj = linkedHashMapOooO.get(7);
                            bool = Boolean.FALSE;
                            if (OooOOO0.OooO0O0(obj, bool)) {
                                linkedHashMapOooO.put(7, Boolean.TRUE);
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : listSpansInSelection3) {
                                if (obj2 instanceof AlignmentSpan) {
                                    arrayList3.add(obj2);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(arrayList3, 10));
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(Integer.valueOf(((AlignmentSpan) it3.next()).getValue().ordinal()));
                            }
                            if (oOo000Oo.OooOo.o0OO00O(arrayList4).size() <= 1 && !OooO00o(listSpansInSelection3, selection)) {
                                RTSpan rTSpan = (RTSpan) oOo000Oo.OooOo.Oooo(listSpansInSelection3);
                                Object value3 = rTSpan != null ? rTSpan.getValue() : null;
                                if (value3 == Layout.Alignment.ALIGN_NORMAL) {
                                    linkedHashMapOooO.put(7, Boolean.TRUE);
                                } else if (value3 == Layout.Alignment.ALIGN_CENTER) {
                                    linkedHashMapOooO.put(8, Boolean.TRUE);
                                } else if (value3 == Layout.Alignment.ALIGN_OPPOSITE) {
                                    linkedHashMapOooO.put(9, Boolean.TRUE);
                                } else {
                                    linkedHashMapOooO.put(7, Boolean.TRUE);
                                }
                                obj = linkedHashMapOooO.get(7);
                                bool = Boolean.FALSE;
                                if (OooOOO0.OooO0O0(obj, bool) && OooOOO0.OooO0O0(linkedHashMapOooO.get(8), bool) && OooOOO0.OooO0O0(linkedHashMapOooO.get(9), bool)) {
                                    linkedHashMapOooO.put(7, Boolean.TRUE);
                                }
                            }
                        }
                        textEditor3 = textEditor;
                    } else {
                        textEditor = textEditor3;
                        if (effect instanceof ForegroundColorEffect) {
                            List<RTSpan> listSpansInSelection4 = Effects.FOREGROUND_COLOR.spansInSelection(editor, selection);
                            if (i3 == 1) {
                                linkedHashMapOooO.remove(12);
                            } else {
                                OooOOO0.OooO0Oo(listSpansInSelection4);
                                if (listSpansInSelection4.isEmpty()) {
                                    continue;
                                } else {
                                    List<RTSpan> list3 = listSpansInSelection4;
                                    ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
                                    Iterator<T> it4 = list3.iterator();
                                    while (it4.hasNext()) {
                                        arrayList5.add(((RTSpan) it4.next()).getValue());
                                    }
                                    if (oOo000Oo.OooOo.o0OO00O(arrayList5).size() > 1) {
                                        linkedHashMapOooO.put(12, ((RTSpan) oOo000Oo.OooOo.Oooo0oO(listSpansInSelection4)).getValue());
                                    } else if (OooO00o(listSpansInSelection4, selection)) {
                                        NoteinRichEditor noteinRichEditor3 = textEditor.f74051OooOoO0;
                                        if (noteinRichEditor3 == null) {
                                            OooOOO0.OooOOOO("richEditor");
                                            throw null;
                                        }
                                        linkedHashMapOooO.put(12, Integer.valueOf(noteinRichEditor3.getCurrentTextColor()));
                                    } else {
                                        linkedHashMapOooO.put(12, ((RTSpan) oOo000Oo.OooOo.Oooo0oO(listSpansInSelection4)).getValue());
                                    }
                                }
                            }
                        }
                        textEditor3 = textEditor;
                    }
                    textEditor3 = textEditor;
                }
                textEditor = textEditor3;
                textEditor3 = textEditor;
            }
            C29051OooOO0o c29051OooOO0o = textEditor3.f74049OooOo0o;
            if (c29051OooOO0o == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            c29051OooOO0o.OooOOOO(linkedHashMapOooO);
        }

        @Override // com.orion.notein.richeditor.RTEditTextListener
        public final void onTextChanged(RTEditText rTEditText, int i, Spannable spannable, Spannable spannable2, int i2, int i3, int i4, int i5) throws Throwable {
            TextEditor textEditor = TextEditor.this;
            if (i == 5) {
                NoteinRichEditor noteinRichEditor = textEditor.f74051OooOoO0;
                if (noteinRichEditor == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor.OooO00o();
            }
            String string = spannable != null ? spannable.toString() : null;
            if (string == null || string.length() == 0) {
                if (OooOOO0.OooO0O0(spannable2 != null ? spannable2.toString() : null, " ")) {
                    int i6 = TextEditor.f74047Oooo0o0;
                    textEditor.OooO0o();
                    return;
                }
            }
            if (spannable == null || !C33599OooOo0O.OoooOOO(spannable, " ")) {
                return;
            }
            if (spannable2 == null || !C33599OooOo0O.OoooOOO(spannable2, " ")) {
                int i7 = TextEditor.f74047Oooo0o0;
                textEditor.OooO0o();
            }
        }
    }

    static {
        o000000O.OooO0o(10);
        o000000O.OooO0o(20);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        C29048OooO0oo c29048OooO0oo = new C29048OooO0oo();
        Object systemService = context.getSystemService("layout_inflater");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_text_box_operation, (ViewGroup) null);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        viewInflate.findViewById(R.id.cut).setOnClickListener(new ViewOnClickListenerC26295OoooO00(c29048OooO0oo, 2));
        viewInflate.findViewById(R.id.copy).setOnClickListener(new ViewOnClickListenerC28701OooOOo0(c29048OooO0oo, 1));
        viewInflate.findViewById(R.id.edit).setOnClickListener(new ViewOnClickListenerC28700OooOOo(c29048OooO0oo, 1));
        viewInflate.findViewById(R.id.delete).setOnClickListener(new ViewOnClickListenerC28702OooOOoo(c29048OooO0oo, 1));
        viewInflate.findViewById(R.id.paste).setOnClickListener(new ViewOnClickListenerC29047OooO0oO(c29048OooO0oo, 0));
        PopupWindow popupWindow = new PopupWindow(viewInflate, C29048OooO0oo.f102885OooO0O0, C29048OooO0oo.f102886OooO0OO, false);
        c29048OooO0oo.f102887OooO00o = popupWindow;
        popupWindow.setElevation(10.0f);
        this.f74054OooOoo0 = c29048OooO0oo;
        this.f74053OooOoo = new Handler(Looper.getMainLooper());
        this.f74056OooOooo = 1.0f;
        this.f74058Oooo000 = true;
        this.f74060Oooo00o = LayerInfo.UNSPECIFIED_LAYER_ID;
        View.inflate(context, R.layout.layout_text_editor, this);
        this.f74061Oooo0O0 = new C23382OooO0o0();
        this.f74062Oooo0OO = new RunnableC29075Oooo(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectF getUnrotatedTextBoxBounds() {
        int iMax;
        TextPaint textPaint = new TextPaint();
        NoteinRichEditor noteinRichEditor = this.f74051OooOoO0;
        if (noteinRichEditor == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        textPaint.setTextSize(noteinRichEditor.getTextSize());
        NoteinRichEditor noteinRichEditor2 = this.f74051OooOoO0;
        if (noteinRichEditor2 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        CharSequence text = noteinRichEditor2.getRichText(RTFormat.SPANNED).getText();
        C31237OooO0O0 c31237OooO0O0 = C31237OooO0O0.f111407OooO0O0;
        Context context = getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        OooOOO0.OooO0Oo(text);
        NoteinRichEditor noteinRichEditor3 = this.f74051OooOoO0;
        if (noteinRichEditor3 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        int width = noteinRichEditor3.getWidth();
        NoteinRichEditor noteinRichEditor4 = this.f74051OooOoO0;
        if (noteinRichEditor4 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        float lineSpacingMultiplier = noteinRichEditor4.getLineSpacingMultiplier();
        c31237OooO0O0.getClass();
        StaticLayout staticLayoutOooO0OO = C31237OooO0O0.OooO0OO(context, text, width, lineSpacingMultiplier, textPaint);
        NoteinRichEditor noteinRichEditor5 = this.f74051OooOoO0;
        if (noteinRichEditor5 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        int width2 = noteinRichEditor5.getWidth();
        if (this.f74058Oooo000) {
            int height = staticLayoutOooO0OO.getHeight();
            NoteinRichEditor noteinRichEditor6 = this.f74051OooOoO0;
            if (noteinRichEditor6 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            iMax = Math.max(height, noteinRichEditor6.getHeight());
            NoteinRichEditor noteinRichEditor7 = this.f74051OooOoO0;
            if (noteinRichEditor7 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            int maxHeight = noteinRichEditor7.getMaxHeight();
            if (iMax > maxHeight) {
                iMax = maxHeight;
            }
        } else {
            int height2 = staticLayoutOooO0OO.getHeight();
            NoteinRichEditor noteinRichEditor8 = this.f74051OooOoO0;
            if (noteinRichEditor8 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            iMax = Math.max(height2, noteinRichEditor8.getHeight());
        }
        NoteinRichEditor noteinRichEditor9 = this.f74051OooOoO0;
        if (noteinRichEditor9 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        float x = noteinRichEditor9.getX();
        NoteinRichEditor noteinRichEditor10 = this.f74051OooOoO0;
        if (noteinRichEditor10 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        float y = noteinRichEditor10.getY();
        NoteinRichEditor noteinRichEditor11 = this.f74051OooOoO0;
        if (noteinRichEditor11 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        float x2 = (width2 * this.f74056OooOooo) + noteinRichEditor11.getX();
        NoteinRichEditor noteinRichEditor12 = this.f74051OooOoO0;
        if (noteinRichEditor12 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        RectF rectF = new RectF(x, y, x2, (iMax * this.f74056OooOooo) + noteinRichEditor12.getY());
        rectF.offset(0.0f, this.f74055OooOooO);
        NoteinRichEditor noteinRichEditor13 = this.f74051OooOoO0;
        if (noteinRichEditor13 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        if (noteinRichEditor13.getRotation() == 0.0f) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        NoteinRichEditor noteinRichEditor14 = this.f74051OooOoO0;
        if (noteinRichEditor14 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        float rotation = noteinRichEditor14.getRotation();
        NoteinRichEditor noteinRichEditor15 = this.f74051OooOoO0;
        if (noteinRichEditor15 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        float x3 = noteinRichEditor15.getX();
        NoteinRichEditor noteinRichEditor16 = this.f74051OooOoO0;
        if (noteinRichEditor16 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        matrix.postRotate(rotation, x3, noteinRichEditor16.getY());
        RectF rectF2 = new RectF(rectF);
        matrix.mapRect(rectF2);
        rectF.offset(rectF2.centerX() - rectF.centerX(), rectF2.centerY() - rectF.centerY());
        return rectF;
    }

    public final void OooO() {
        C29048OooO0oo c29048OooO0oo = this.f74054OooOoo0;
        if (c29048OooO0oo.f102887OooO00o.isShowing()) {
            NoteinRichEditor noteinRichEditor = this.f74051OooOoO0;
            if (noteinRichEditor == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            float scaleX = ((noteinRichEditor.getScaleX() * noteinRichEditor.getWidth()) / 2) + noteinRichEditor.getX();
            int i = C29048OooO0oo.f102885OooO0O0;
            float y = noteinRichEditor.getY();
            int i2 = C29048OooO0oo.f102886OooO0OO;
            c29048OooO0oo.f102887OooO00o.update((int) (scaleX - (i / 2)), (int) ((y - i2) - o000000O.OooO0o(23)), i, i2);
        }
        if (this.f74051OooOoO0 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        int width = (int) ((r0.getWidth() * this.f74056OooOooo) + o000000O.OooO0o(50));
        if (this.f74051OooOoO0 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        int height = (int) ((r4.getHeight() * this.f74056OooOooo) + o000000O.OooO0o(50));
        NoteinRichEditor noteinRichEditor2 = this.f74051OooOoO0;
        if (noteinRichEditor2 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        final float x = noteinRichEditor2.getX() - o000000O.OooO0o(25);
        NoteinRichEditor noteinRichEditor3 = this.f74051OooOoO0;
        if (noteinRichEditor3 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        final float y2 = noteinRichEditor3.getY() - o000000O.OooO0o(25);
        ViewGroup viewGroup = this.f74050OooOoO;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("border");
            throw null;
        }
        if (viewGroup.getWidth() == width) {
            ViewGroup viewGroup2 = this.f74050OooOoO;
            if (viewGroup2 == null) {
                OooOOO0.OooOOOO("border");
                throw null;
            }
            if (viewGroup2.getHeight() == height) {
                ViewGroup viewGroup3 = this.f74050OooOoO;
                if (viewGroup3 == null) {
                    OooOOO0.OooOOOO("border");
                    throw null;
                }
                if (viewGroup3.getX() == x) {
                    ViewGroup viewGroup4 = this.f74050OooOoO;
                    if (viewGroup4 == null) {
                        OooOOO0.OooOOOO("border");
                        throw null;
                    }
                    if (viewGroup4.getY() == y2) {
                        return;
                    }
                }
            }
        }
        ViewGroup viewGroup5 = this.f74050OooOoO;
        if (viewGroup5 == null) {
            OooOOO0.OooOOOO("border");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup5.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = height;
        this.f74053OooOoo.post(new Runnable() { // from class: o0OoOOO0.Oooo0oo
            @Override // java.lang.Runnable
            public final void run() {
                TextEditor textEditor = this.f103068OooOo0o;
                ViewGroup viewGroup6 = textEditor.f74050OooOoO;
                if (viewGroup6 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("border");
                    throw null;
                }
                viewGroup6.setX(x);
                ViewGroup viewGroup7 = textEditor.f74050OooOoO;
                if (viewGroup7 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("border");
                    throw null;
                }
                viewGroup7.setY(y2);
                ViewGroup viewGroup8 = textEditor.f74050OooOoO;
                if (viewGroup8 != null) {
                    viewGroup8.requestLayout();
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("border");
                    throw null;
                }
            }
        });
    }

    public final void OooO0O0() {
        NoteinRichEditor noteinRichEditor = this.f74051OooOoO0;
        if (noteinRichEditor != null) {
            OooO0OO(noteinRichEditor.length());
        } else {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
    }

    public final void OooO0OO(int i) {
        ViewGroup viewGroup = this.f74050OooOoO;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("border");
            throw null;
        }
        NoteinRichEditor noteinRichEditor = this.f74051OooOoO0;
        if (noteinRichEditor == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        viewGroup.setTranslationZ(noteinRichEditor.getTranslationZ() - 1);
        NoteinRichEditor noteinRichEditor2 = this.f74051OooOoO0;
        if (noteinRichEditor2 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor2.setEnabled(true);
        NoteinRichEditor noteinRichEditor3 = this.f74051OooOoO0;
        if (noteinRichEditor3 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor3.requestFocus();
        NoteinRichEditor noteinRichEditor4 = this.f74051OooOoO0;
        if (noteinRichEditor4 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor4.setSelection(i);
        NoteinRichEditor noteinRichEditor5 = this.f74051OooOoO0;
        if (noteinRichEditor5 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        if (noteinRichEditor5.requestFocus()) {
            Object systemService = getContext().getSystemService("input_method");
            OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            NoteinRichEditor noteinRichEditor6 = this.f74051OooOoO0;
            if (noteinRichEditor6 != null) {
                inputMethodManager.showSoftInput(noteinRichEditor6, 1);
            } else {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
        }
    }

    public final TextBoxInfo OooO0Oo() {
        int color;
        NoteinRichEditor noteinRichEditor = this.f74051OooOoO0;
        if (noteinRichEditor == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        if (noteinRichEditor.getBackground() instanceof ColorDrawable) {
            NoteinRichEditor noteinRichEditor2 = this.f74051OooOoO0;
            if (noteinRichEditor2 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            Drawable background = noteinRichEditor2.getBackground();
            OooOOO0.OooO0o0(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            color = ((ColorDrawable) background).getColor();
        } else {
            color = 0;
        }
        int i = color;
        NoteinRichEditor noteinRichEditor3 = this.f74051OooOoO0;
        if (noteinRichEditor3 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        RTText richText = noteinRichEditor3.getRichText(RTFormat.HTML);
        CharSequence text = richText.convertTo(getContext(), RTFormat.PLAIN_TEXT).getText();
        String string = (text == null || text.length() == 0) ? "" : richText.getText().toString();
        RectF unrotatedTextBoxBounds = getUnrotatedTextBoxBounds();
        String strOooO00o = C24761OooO.OooO00o("toString(...)");
        NoteinRichEditor noteinRichEditor4 = this.f74051OooOoO0;
        if (noteinRichEditor4 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        float textSize = noteinRichEditor4.getTextSize();
        NoteinRichEditor noteinRichEditor5 = this.f74051OooOoO0;
        if (noteinRichEditor5 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        float width = noteinRichEditor5.getWidth();
        float fHeight = unrotatedTextBoxBounds.height() / this.f74056OooOooo;
        NoteinRichEditor noteinRichEditor6 = this.f74051OooOoO0;
        if (noteinRichEditor6 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        float lineSpacingMultiplier = noteinRichEditor6.getLineSpacingMultiplier();
        NoteinRichEditor noteinRichEditor7 = this.f74051OooOoO0;
        if (noteinRichEditor7 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        TextBoxInfo textBoxInfo = new TextBoxInfo(strOooO00o, string, textSize, width, fHeight, unrotatedTextBoxBounds, lineSpacingMultiplier, i, this.f74060Oooo00o, 0L, noteinRichEditor7.getCurrentTextColor(), null, 2560, null);
        NoteinRichEditor noteinRichEditor8 = this.f74051OooOoO0;
        if (noteinRichEditor8 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        if (noteinRichEditor8.getRotation() == 0.0f) {
            return textBoxInfo;
        }
        NoteinRichEditor noteinRichEditor9 = this.f74051OooOoO0;
        if (noteinRichEditor9 != null) {
            textBoxInfo.rotate(noteinRichEditor9.getRotation(), new PointF(0.0f, 0.0f));
            return textBoxInfo;
        }
        OooOOO0.OooOOOO("richEditor");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x001b, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x010a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0o() throws Throwable {
        Object next;
        int iIntValue;
        NoteinRichEditor noteinRichEditor;
        int currentTextColor;
        boolean zBooleanValue;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        C29051OooOO0o c29051OooOO0o = this.f74049OooOo0o;
        if (c29051OooOO0o == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        for (Map.Entry entry : ((Map) c29051OooOO0o.f102902OooOO0o.f121747OooOo0o.getValue()).entrySet()) {
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            Object value = entry.getValue();
            if (iIntValue2 == 0) {
                Boolean bool = value instanceof Boolean ? (Boolean) value : null;
                zBooleanValue = bool != null ? bool.booleanValue() : false;
                NoteinRichEditor noteinRichEditor2 = this.f74051OooOoO0;
                if (noteinRichEditor2 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor2.applyEffect(Effects.BOLD, Boolean.valueOf(zBooleanValue), true);
            } else if (iIntValue2 == 1) {
                Boolean bool2 = value instanceof Boolean ? (Boolean) value : null;
                zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                NoteinRichEditor noteinRichEditor3 = this.f74051OooOoO0;
                if (noteinRichEditor3 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor3.applyEffect(Effects.ITALIC, Boolean.valueOf(zBooleanValue), true);
            } else if (iIntValue2 == 2) {
                Boolean bool3 = value instanceof Boolean ? (Boolean) value : null;
                zBooleanValue = bool3 != null ? bool3.booleanValue() : false;
                NoteinRichEditor noteinRichEditor4 = this.f74051OooOoO0;
                if (noteinRichEditor4 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor4.applyEffect(Effects.UNDERLINE, Boolean.valueOf(zBooleanValue), true);
            } else if (iIntValue2 == 12) {
                Integer num = value instanceof Integer ? (Integer) value : null;
                if (num != null) {
                    currentTextColor = num.intValue();
                } else {
                    NoteinRichEditor noteinRichEditor5 = this.f74051OooOoO0;
                    if (noteinRichEditor5 == null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    currentTextColor = noteinRichEditor5.getCurrentTextColor();
                }
                NoteinRichEditor noteinRichEditor6 = this.f74051OooOoO0;
                if (noteinRichEditor6 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor6.setTextColor(currentTextColor);
                NoteinRichEditor noteinRichEditor7 = this.f74051OooOoO0;
                if (noteinRichEditor7 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                noteinRichEditor7.applyEffect(Effects.FOREGROUND_COLOR, Integer.valueOf(currentTextColor), true);
            } else if (iIntValue2 != 13) {
                switch (iIntValue2) {
                    case 7:
                        Boolean bool4 = value instanceof Boolean ? (Boolean) value : null;
                        if (bool4 != null) {
                            bool4.booleanValue();
                        }
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        NoteinRichEditor noteinRichEditor8 = this.f74051OooOoO0;
                        if (noteinRichEditor8 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor8.applyEffect(Effects.ALIGNMENT, alignment, true);
                        break;
                        break;
                    case 8:
                        Boolean bool5 = value instanceof Boolean ? (Boolean) value : null;
                        Layout.Alignment alignment3 = bool5 != null ? bool5.booleanValue() : false ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_NORMAL;
                        NoteinRichEditor noteinRichEditor9 = this.f74051OooOoO0;
                        if (noteinRichEditor9 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor9.applyEffect(Effects.ALIGNMENT, alignment3, true);
                        break;
                        break;
                    case 9:
                        Boolean bool6 = value instanceof Boolean ? (Boolean) value : null;
                        Layout.Alignment alignment4 = bool6 != null ? bool6.booleanValue() : false ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                        NoteinRichEditor noteinRichEditor10 = this.f74051OooOoO0;
                        if (noteinRichEditor10 == null) {
                            OooOOO0.OooOOOO("richEditor");
                            throw null;
                        }
                        noteinRichEditor10.applyEffect(Effects.ALIGNMENT, alignment4, true);
                        break;
                        break;
                    case 10:
                        String str = value instanceof String ? (String) value : null;
                        if (str == null) {
                            str = "";
                        }
                        RTTypeface typeface = FontManager.getTypeface(str);
                        if (typeface != null) {
                            NoteinRichEditor noteinRichEditor11 = this.f74051OooOoO0;
                            if (noteinRichEditor11 == null) {
                                OooOOO0.OooOOOO("richEditor");
                                throw null;
                            }
                            noteinRichEditor11.applyEffect(Effects.TYPEFACE, typeface, true);
                        } else {
                            NoteinRichEditor noteinRichEditor12 = this.f74051OooOoO0;
                            if (noteinRichEditor12 == null) {
                                OooOOO0.OooOOOO("richEditor");
                                throw null;
                            }
                            noteinRichEditor12.setTypeface(Typeface.DEFAULT);
                        }
                        break;
                }
            } else {
                Integer num2 = value instanceof Integer ? (Integer) value : null;
                if (num2 == null) {
                    iIntValue = 30;
                    noteinRichEditor = this.f74051OooOoO0;
                    if (noteinRichEditor != null) {
                        OooOOO0.OooOOOO("richEditor");
                        throw null;
                    }
                    noteinRichEditor.applyEffect(Effects.FONT_SIZE, Integer.valueOf(iIntValue), true);
                } else {
                    if (num2.intValue() <= 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    }
                    noteinRichEditor = this.f74051OooOoO0;
                    if (noteinRichEditor != null) {
                    }
                }
            }
        }
        C29051OooOO0o c29051OooOO0o2 = this.f74049OooOo0o;
        if (c29051OooOO0o2 == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        float fFloatValue = ((Number) c29051OooOO0o2.f102907OooOOo.f121747OooOo0o.getValue()).floatValue();
        if (fFloatValue > 0.0f) {
            NoteinRichEditor noteinRichEditor13 = this.f74051OooOoO0;
            if (noteinRichEditor13 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor13.setLineSpacing(0.0f, fFloatValue);
        }
        C29051OooOO0o c29051OooOO0o3 = this.f74049OooOo0o;
        if (c29051OooOO0o3 == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        Iterator it = ((Iterable) c29051OooOO0o3.f102906OooOOOo.f121747OooOo0o.getValue()).iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((C31083OooooO0) next).f110938OooO0OO) {
                }
            } else {
                next = null;
            }
        }
        C31083OooooO0 c31083OooooO0 = (C31083OooooO0) next;
        if (c31083OooooO0 != null) {
            NoteinRichEditor noteinRichEditor14 = this.f74051OooOoO0;
            if (noteinRichEditor14 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor14.setBackgroundColor(c31083OooooO0.f110936OooO00o);
        }
    }

    public final void OooO0o0() {
        NoteinRichEditor noteinRichEditor = this.f74051OooOoO0;
        if (noteinRichEditor == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor.setScaleX(1.0f);
        NoteinRichEditor noteinRichEditor2 = this.f74051OooOoO0;
        if (noteinRichEditor2 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor2.setScaleY(1.0f);
        setVisibility(8);
        this.f74054OooOoo0.dismiss();
        NoteinRichEditor noteinRichEditor3 = this.f74051OooOoO0;
        if (noteinRichEditor3 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor3.setRTEditTextListener(null);
        NoteinRichEditor noteinRichEditor4 = this.f74051OooOoO0;
        if (noteinRichEditor4 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor4.setRichTextEditing(true, "");
        Object systemService = getContext().getSystemService("input_method");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    public final void OooO0oO(float f, float f2, TextBoxInfo textBoxInfo) throws Throwable {
        ?? r1;
        TextBoxInfo textBoxInfo2;
        Float fOooO00o;
        OooO0O0 oooO0O0 = this.eventListener;
        if (oooO0O0 != null && (fOooO00o = oooO0O0.OooO00o()) != null) {
            this.f74056OooOooo = fOooO00o.floatValue();
        }
        if (textBoxInfo != null) {
            this.f74060Oooo00o = textBoxInfo.getLayerId();
        }
        if (textBoxInfo == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TextEditor");
            StringBuilder sb = new StringBuilder("Show new text editor at (x=");
            sb.append(f);
            sb.append(", y=");
            c20358OooO00o.OooO00o(Oooo00o.OooO0OO.OooO0OO(sb, f2, ")"), new Object[0]);
            r1 = 0;
            textBoxInfo2 = textBoxInfo;
        } else {
            r1 = 0;
            textBoxInfo2 = textBoxInfo;
            TextBoxInfo textBoxInfoCopy$default = TextBoxInfo.copy$default(textBoxInfo2, null, C33600OooOo0o.o0OoOo0(200, textBoxInfo.getText()), 0.0f, 0.0f, 0.0f, null, 0.0f, 0, null, 0L, 0, null, 4093, null);
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("TextEditor");
            c20358OooO00o2.OooO0o0("Show existing text editor with info: " + textBoxInfoCopy$default, new Object[0]);
        }
        C29051OooOO0o c29051OooOO0o = this.f74049OooOo0o;
        if (c29051OooOO0o == null) {
            OooOOO0.OooOOOO("viewModel");
            throw null;
        }
        c29051OooOO0o.f102894OooO.setValue(textBoxInfo2);
        this.f74055OooOooO = 0.0f;
        this.f74058Oooo000 = true;
        if (textBoxInfo2 != null) {
            C29051OooOO0o c29051OooOO0o2 = this.f74049OooOo0o;
            if (c29051OooOO0o2 == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c29051OooOO0o2), null, null, new C29061OooOOo0(c29051OooOO0o2, null), 3);
            NoteinRichEditor noteinRichEditor = this.f74051OooOoO0;
            if (noteinRichEditor == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = noteinRichEditor.getLayoutParams();
            layoutParams.width = (int) textBoxInfo2.getBoxWidth();
            int boxHeight = (int) textBoxInfo2.getBoxHeight();
            layoutParams.height = boxHeight;
            if (boxHeight > 1754) {
                this.f74058Oooo000 = r1;
            }
            C29051OooOO0o c29051OooOO0o3 = this.f74049OooOo0o;
            if (c29051OooOO0o3 == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            c29051OooOO0o3.OooOOO(textBoxInfo2.getLineHeight());
            NoteinRichEditor noteinRichEditor2 = this.f74051OooOoO0;
            if (noteinRichEditor2 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor2.setLineSpacing(0.0f, textBoxInfo2.getLineHeight());
            C29051OooOO0o c29051OooOO0o4 = this.f74049OooOo0o;
            if (c29051OooOO0o4 == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            c29051OooOO0o4.OooOOO0(textBoxInfo2.getBackgroundColor());
            NoteinRichEditor noteinRichEditor3 = this.f74051OooOoO0;
            if (noteinRichEditor3 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor3.setBackgroundColor(textBoxInfo2.getBackgroundColor());
            NoteinRichEditor noteinRichEditor4 = this.f74051OooOoO0;
            if (noteinRichEditor4 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor4.setRichTextEditing(true, textBoxInfo2.getText());
            NoteinRichEditor noteinRichEditor5 = this.f74051OooOoO0;
            if (noteinRichEditor5 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor5.setTextColor(textBoxInfo2.getDefaultTextColor());
            NoteinRichEditor noteinRichEditor6 = this.f74051OooOoO0;
            if (noteinRichEditor6 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor6.OooO00o();
        } else {
            C29051OooOO0o c29051OooOO0o5 = this.f74049OooOo0o;
            if (c29051OooOO0o5 == null) {
                OooOOO0.OooOOOO("viewModel");
                throw null;
            }
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c29051OooOO0o5), null, null, new C29040OooO(c29051OooOO0o5, null), 3);
            NoteinRichEditor noteinRichEditor7 = this.f74051OooOoO0;
            if (noteinRichEditor7 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = noteinRichEditor7.getLayoutParams();
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            OooO0o();
        }
        NoteinRichEditor noteinRichEditor8 = this.f74051OooOoO0;
        if (noteinRichEditor8 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor8.setScaleX(this.f74056OooOooo);
        NoteinRichEditor noteinRichEditor9 = this.f74051OooOoO0;
        if (noteinRichEditor9 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        noteinRichEditor9.setScaleY(this.f74056OooOooo);
        float rotationDeg = textBoxInfo2 != null ? textBoxInfo2.getRotationDeg() : 0.0f;
        if (textBoxInfo2 == null || rotationDeg == 0.0f) {
            ViewGroup viewGroup = this.f74050OooOoO;
            if (viewGroup == null) {
                OooOOO0.OooOOOO("border");
                throw null;
            }
            viewGroup.setRotation(0.0f);
            NoteinRichEditor noteinRichEditor10 = this.f74051OooOoO0;
            if (noteinRichEditor10 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor10.setRotation(0.0f);
            NoteinRichEditor noteinRichEditor11 = this.f74051OooOoO0;
            if (noteinRichEditor11 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor11.setX(f);
            NoteinRichEditor noteinRichEditor12 = this.f74051OooOoO0;
            if (noteinRichEditor12 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor12.setY(f2);
        } else {
            PointF pointF = new PointF(textBoxInfo2.getBounds().centerX(), textBoxInfo2.getBounds().centerY());
            Matrix matrix = new Matrix();
            matrix.postRotate(rotationDeg, pointF.x, pointF.y);
            float[] fArr = new float[2];
            fArr[r1] = f;
            fArr[1] = f2;
            matrix.mapPoints(fArr);
            NoteinRichEditor noteinRichEditor13 = this.f74051OooOoO0;
            if (noteinRichEditor13 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor13.setRotation(rotationDeg);
            NoteinRichEditor noteinRichEditor14 = this.f74051OooOoO0;
            if (noteinRichEditor14 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor14.setX(fArr[r1]);
            NoteinRichEditor noteinRichEditor15 = this.f74051OooOoO0;
            if (noteinRichEditor15 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            noteinRichEditor15.setY(fArr[1]);
            ViewGroup viewGroup2 = this.f74050OooOoO;
            if (viewGroup2 == null) {
                OooOOO0.OooOOOO("border");
                throw null;
            }
            viewGroup2.setRotation(rotationDeg);
        }
        requestLayout();
        this.f74053OooOoo.post(new RunnableC22497OooO0Oo(1, this, textBoxInfo2));
    }

    public final void OooO0oo(boolean z) {
        Throwable th;
        int color;
        ClipData clipData;
        StaticLayout staticLayout;
        Integer fragmentHostId = DragConstants.INSTANCE.getFragmentHostId(this);
        int iIntValue = fragmentHostId != null ? fragmentHostId.intValue() : 0;
        if (z) {
            NoteinRichEditor noteinRichEditor = this.f74051OooOoO0;
            if (noteinRichEditor == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            clipData = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"text/plain"}, new ClipData.Item(noteinRichEditor.getText(RTFormat.PLAIN_TEXT)));
            PersistableBundle persistableBundlePersistableBundleOf = PersistableBundleKt.persistableBundleOf(new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_TYPE, 1), new C32443OooOOO(DragConstants.NOTEIN_DRAG_HOST_FRAGMENT_ID, Integer.valueOf(iIntValue)));
            persistableBundlePersistableBundleOf.putString(DragConstants.NOTEIN_DRAG_DATA_JSON, new Gson().toJson(OooO0Oo()));
            clipData.getDescription().setExtras(persistableBundlePersistableBundleOf);
            staticLayout = null;
            th = null;
        } else {
            NoteinRichEditor noteinRichEditor2 = this.f74051OooOoO0;
            if (noteinRichEditor2 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            String text = noteinRichEditor2.getText(RTFormat.PLAIN_TEXT);
            NoteinRichEditor noteinRichEditor3 = this.f74051OooOoO0;
            if (noteinRichEditor3 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            CharSequence text2 = noteinRichEditor3.getRichText(RTFormat.SPANNED).getText();
            OooOOO0.OooO0Oo(text);
            if (text.length() == 0) {
                return;
            }
            OooOOO0.OooO0Oo(text2);
            if (text2.length() == 0) {
                return;
            }
            NoteinRichEditor noteinRichEditor4 = this.f74051OooOoO0;
            if (noteinRichEditor4 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            int selectionStart = noteinRichEditor4.getSelectionStart();
            NoteinRichEditor noteinRichEditor5 = this.f74051OooOoO0;
            if (noteinRichEditor5 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            int[] iArr = {selectionStart, noteinRichEditor5.getSelectionEnd()};
            int i = iArr[0];
            if (i < 0) {
                i = 0;
            }
            int i2 = iArr[1];
            int length = text2.length();
            if (i2 > length) {
                i2 = length;
            }
            int i3 = iArr[1];
            int length2 = text.length();
            if (i3 > length2) {
                i3 = length2;
            }
            CharSequence charSequenceSubSequence = text2.subSequence(i, i2);
            ConverterSpannedToHtml converterSpannedToHtml = new ConverterSpannedToHtml();
            OooOOO0.OooO0o0(charSequenceSubSequence, "null cannot be cast to non-null type android.text.Spanned");
            th = null;
            String text3 = converterSpannedToHtml.convert((Spanned) charSequenceSubSequence, RTFormat.HTML).getText();
            TextPaint textPaint = new TextPaint();
            NoteinRichEditor noteinRichEditor6 = this.f74051OooOoO0;
            if (noteinRichEditor6 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            textPaint.setTextSize(noteinRichEditor6.getTextSize());
            C31237OooO0O0 c31237OooO0O0 = C31237OooO0O0.f111407OooO0O0;
            Context context = getContext();
            OooOOO0.OooO0o(context, "getContext(...)");
            NoteinRichEditor noteinRichEditor7 = this.f74051OooOoO0;
            if (noteinRichEditor7 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            int width = noteinRichEditor7.getWidth();
            int i4 = iIntValue;
            NoteinRichEditor noteinRichEditor8 = this.f74051OooOoO0;
            if (noteinRichEditor8 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            float lineSpacingMultiplier = noteinRichEditor8.getLineSpacingMultiplier();
            c31237OooO0O0.getClass();
            StaticLayout staticLayoutOooO0OO = C31237OooO0O0.OooO0OO(context, charSequenceSubSequence, width, lineSpacingMultiplier, textPaint);
            NoteinRichEditor noteinRichEditor9 = this.f74051OooOoO0;
            if (noteinRichEditor9 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            if (noteinRichEditor9.getBackground() instanceof ColorDrawable) {
                NoteinRichEditor noteinRichEditor10 = this.f74051OooOoO0;
                if (noteinRichEditor10 == null) {
                    OooOOO0.OooOOOO("richEditor");
                    throw null;
                }
                Drawable background = noteinRichEditor10.getBackground();
                OooOOO0.OooO0o0(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                color = ((ColorDrawable) background).getColor();
            } else {
                color = 0;
            }
            String string = UUID.randomUUID().toString();
            OooOOO0.OooO0o(string, "toString(...)");
            OooOOO0.OooO0Oo(text3);
            NoteinRichEditor noteinRichEditor11 = this.f74051OooOoO0;
            if (noteinRichEditor11 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            float textSize = noteinRichEditor11.getTextSize();
            NoteinRichEditor noteinRichEditor12 = this.f74051OooOoO0;
            if (noteinRichEditor12 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            float width2 = noteinRichEditor12.getWidth();
            float height = staticLayoutOooO0OO.getHeight();
            if (this.f74051OooOoO0 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            RectF rectF = new RectF(0.0f, 0.0f, r15.getWidth(), staticLayoutOooO0OO.getHeight());
            NoteinRichEditor noteinRichEditor13 = this.f74051OooOoO0;
            if (noteinRichEditor13 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            float lineSpacingMultiplier2 = noteinRichEditor13.getLineSpacingMultiplier();
            NoteinRichEditor noteinRichEditor14 = this.f74051OooOoO0;
            if (noteinRichEditor14 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            TextBoxInfo textBoxInfo = new TextBoxInfo(string, text3, textSize, width2, height, rectF, lineSpacingMultiplier2, color, this.f74060Oooo00o, 0L, noteinRichEditor14.getCurrentTextColor(), null, 2560, null);
            NoteinRichEditor noteinRichEditor15 = this.f74051OooOoO0;
            if (noteinRichEditor15 == null) {
                OooOOO0.OooOOOO("richEditor");
                throw null;
            }
            textBoxInfo.rotate(noteinRichEditor15.getRotation(), new PointF(0.0f, 0.0f));
            clipData = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"text/plain"}, new ClipData.Item(text.subSequence(i, i3)));
            clipData.getDescription().setExtras(PersistableBundleKt.persistableBundleOf(new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_TYPE, 1), new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_JSON, new Gson().toJson(textBoxInfo)), new C32443OooOOO(DragConstants.NOTEIN_DRAG_HOST_FRAGMENT_ID, Integer.valueOf(i4))));
            staticLayout = staticLayoutOooO0OO;
        }
        NoteinRichEditor noteinRichEditor16 = this.f74051OooOoO0;
        if (noteinRichEditor16 == null) {
            OooOOO0.OooOOOO("richEditor");
            throw th;
        }
        OooO0OO oooO0OO = new OooO0OO(noteinRichEditor16, staticLayout, this.f74056OooOooo);
        NoteinRichEditor noteinRichEditor17 = this.f74051OooOoO0;
        if (noteinRichEditor17 != null) {
            noteinRichEditor17.startDragAndDrop(clipData, oooO0OO, "Test", 257);
        } else {
            OooOOO0.OooOOOO("richEditor");
            throw th;
        }
    }

    public final void OooOO0() {
        NoteinRichEditor noteinRichEditor = this.f74051OooOoO0;
        if (noteinRichEditor == null) {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
        float f = 1754;
        noteinRichEditor.setMaxWidth((int) (f / this.f74056OooOooo));
        NoteinRichEditor noteinRichEditor2 = this.f74051OooOoO0;
        if (noteinRichEditor2 != null) {
            noteinRichEditor2.setMaxHeight((int) (f / this.f74056OooOooo));
        } else {
            OooOOO0.OooOOOO("richEditor");
            throw null;
        }
    }

    public final OooO0O0 getEventListener() {
        return this.eventListener;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    public final void setEventListener(OooO0O0 oooO0O0) {
        this.eventListener = oooO0O0;
    }
}
