package com.orion.editor;

import Oooo0.C20857Oooooo;
import android.content.Context;
import android.content.Intent;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import com.aspose.slides.C22202OooO0oo;
import com.aspose.slides.OooO;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.editor.C22831OooO0o0;
import com.orion.editor.OooO00o;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.note.PdfInfo;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import com.orion.penkit.models.DualLinkRefInfo;
import com.orion.penkit.models.HyperLinkInfo;
import com.orion.penkit.models.ImageInfo;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.ShapeInfo;
import com.orion.penkit.models.TextBoxInfo;
import com.shockwave.pdfium.PdfDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import kotlin.jvm.internal.OooOOO0;
import o00Oo000.C25034OooO00o;
import o0O0o00.C25909OooO00o;
import o0O0o00.C25935OooOoo;
import o0O0o00.C25938OooOooo;
import o0O0o00.HandlerC25978o0000o;
import o0O0o00o.C25998OooO00o;
import o0O0o0OO.InterfaceC26008OooO0o0;
import o0O0o0Oo.InterfaceC26010OooO00o;
import o0O0oO0O.InterfaceC26093OooO00o;
import o0O0oO0o.C26094OooO00o;
import o0O0oOO.C26106OooO0O0;
import o0O0oOO.C26108OooO0Oo;
import o0O0oOO.C26112OooO0oo;
import o0O0oooo.C26363OooO0oO;
import o0O0oooo.C26395Oooo0o0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00o.AbstractC32314OooO00o;
import oO00o.AbstractC32316OooO0OO;
import oO00o.InterfaceC32317OooO0Oo;
import oO00o0oo.C32394OooO00o;
import oO00oO00.InterfaceC32402OooO0O0;
import oO00oO0O.C32408OooO0Oo;
import oO00oOO.C32416OooO0OO;
import oO00oOo.C32428OooO00o;
import oO00ooO.C32443OooOOO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;
import oOo00ooO.InterfaceC34574OooO0o0;
import oOo00ooo.C34576OooO;
import oOo00ooo.C34578OooO0O0;
import oOo00ooo.C34579OooO0OO;
import oOo00ooo.C34580OooO0Oo;
import oOo00ooo.C34581OooO0o;
import oOo00ooo.C34585OooOO0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, C22831OooO0o0.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public GestureDetector f69055OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public PDFView f69056OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C25909OooO00o f69057OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0o f69058OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public GestureDetector f69059OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C25935OooOoo f69060OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public GestureDetector f69061OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public GestureDetector f69062OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ScaleGestureDetector f69063OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C22831OooO0o0 f69064OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public GestureDetector f69065OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public GestureDetector f69066OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f69067OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public GestureDetector f69068OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f69069OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public GestureDetector f69070OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f69071OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public PointF f69072OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f69073OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C26094OooO00o f69074OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f69075OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f69076OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public Handler f69077OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f69078OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f69079OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooO0O0 f69080OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f69081OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f69082OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f69083OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f69084OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public float f69085OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public C19124OooO00o f69086Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f69087Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f69088Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f69089Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f69090Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f69091Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public InterfaceC31284OooO0O0 f69092Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f69093Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f69094Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public InterfaceC31284OooO0O0 f69095Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public InterfaceC26008OooO0o0 f69096Oooo0oo;

    /* JADX INFO: renamed from: com.orion.editor.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19124OooO00o {
        public C19124OooO00o() {
        }
    }

    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO00o.this.f69078OooOo0o = false;
        }
    }

    public class OooO0OO implements GestureDetector.OnGestureListener {
        public OooO0OO() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            C25909OooO00o c25909OooO00o = OooO00o.this.f69057OooO0O0;
            c25909OooO00o.f88446OooO0Oo = false;
            c25909OooO00o.f88445OooO0OO.forceFinished(true);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.orion.editor.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public class ScaleGestureDetectorOnScaleGestureListenerC22828OooO0Oo implements ScaleGestureDetector.OnScaleGestureListener {
        public ScaleGestureDetectorOnScaleGestureListenerC22828OooO0Oo() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan();
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            boolean zOooO0o0 = OooO00o.OooO0o0();
            OooO00o oooO00o = OooO00o.this;
            if (!zOooO0o0) {
                OooO00o.OooO0OO(oooO00o, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
            if (oooO00o.f69057OooO0O0.OooO0O0()) {
                oooO00o.f69085OooOooo = currentSpan;
                return true;
            }
            float f = oooO00o.f69085OooOooo;
            if (f > 0.0f) {
                oooO00o.f69088Oooo000 = (currentSpan - f) + oooO00o.f69088Oooo000;
            }
            oooO00o.f69085OooOooo = currentSpan;
            if (!oooO00o.f69084OooOooO) {
                if (Math.abs(oooO00o.f69088Oooo000) < 150.0f) {
                    return true;
                }
                oooO00o.f69084OooOooO = true;
            }
            OooO00o.OooO0OO(oooO00o, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            boolean zOooO0o0 = OooO00o.OooO0o0();
            OooO00o oooO00o = OooO00o.this;
            if (!zOooO0o0) {
                OooO00o.OooO00o(oooO00o);
                return true;
            }
            if (oooO00o.f69057OooO0O0.OooO0O0()) {
                return false;
            }
            if (oooO00o.f69082OooOoo) {
                return true;
            }
            float currentSpan = scaleGestureDetector.getCurrentSpan();
            oooO00o.f69082OooOoo = true;
            oooO00o.f69085OooOooo = currentSpan;
            oooO00o.f69088Oooo000 = 0.0f;
            oooO00o.f69084OooOooO = false;
            OooO00o.OooO00o(oooO00o);
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            OooO00o.OooO0O0(OooO00o.this);
        }
    }

    /* JADX INFO: renamed from: com.orion.editor.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public class C22829OooO0o0 extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f69101OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f69102OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public List<InterfaceC31284OooO0O0> f69103OooO0OO = new ArrayList();

        public C22829OooO0o0() {
            this.f69102OooO0O0 = C20857Oooooo.OooO0O0(OooO00o.this.f69056OooO00o.getContext(), 24);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO00o(MotionEvent motionEvent) throws Throwable {
            AbstractC32316OooO0OO c34579OooO0OO;
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.f69067OooOOO) {
                return;
            }
            final PDFView pDFView = oooO00o.f69056OooO00o;
            final int x = (int) motionEvent.getX();
            final int y = (int) motionEvent.getY();
            pDFView.OooOo0o();
            Context context = pDFView.getContext();
            C34580OooO0Oo c34580OooO0Oo = new C34580OooO0Oo(new InterfaceC32317OooO0Oo[]{new C34581OooO0o(C26106OooO0O0.OooO0O0(context, "image"), new C22202OooO0oo()), new C34581OooO0o(C26106OooO0O0.OooO0O0(context, "text"), new OooO())});
            int i = AbstractC32314OooO00o.f116231OooOo0o;
            C25034OooO00o.OooO0O0(2, "maxConcurrency");
            C25034OooO00o.OooO0O0(i, "bufferSize");
            if (c34580OooO0Oo instanceof InterfaceC34574OooO0o0) {
                T t = ((InterfaceC34574OooO0o0) c34580OooO0Oo).get();
                c34579OooO0OO = t == 0 ? C34578OooO0O0.f123832OooO00o : new C34576OooO(t);
            } else {
                c34579OooO0OO = new C34579OooO0OO(c34580OooO0Oo, i);
            }
            C32416OooO0OO c32416OooO0OO = C32428OooO00o.f116617OooO00o;
            c34579OooO0OO.getClass();
            Objects.requireNonNull(c32416OooO0OO, "scheduler is null");
            new C34585OooOO0(c34579OooO0OO, c32416OooO0OO).OooO0O0(C32394OooO00o.OooO00o()).OooO00o(new C32408OooO0Oo(new InterfaceC32402OooO0O0() { // from class: o0O0o00.o0ooOOo
                @Override // oO00oO00.InterfaceC32402OooO0O0
                public final void accept(Object obj) {
                    PDFView.OooO00o(pDFView, x, y, (Pair) obj);
                }
            }));
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(final MotionEvent motionEvent) {
            this.f69103OooO0OO.clear();
            final PDFView pDFView = OooO00o.this.f69056OooO00o;
            pDFView.getClass();
            this.f69103OooO0OO = (List) pDFView.OooOOo(true, new Function() { // from class: o0O0o00.o00Ooo
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    C26395Oooo0o0 c26395Oooo0o0 = pDFView.f69170OooOooO.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    return c26395Oooo0o0.OooOOO(((Integer) obj).intValue(), new C26363OooO0oO(c26395Oooo0o0, 0));
                }
            }).stream().filter(new Predicate() { // from class: o0O0o00.OooOOO0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    Context context;
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj;
                    OooO00o.C22829OooO0o0 c22829OooO0o0 = this.f88483OooO00o;
                    c22829OooO0o0.getClass();
                    MotionEvent motionEvent2 = motionEvent;
                    float x = motionEvent2.getX();
                    float y = motionEvent2.getY();
                    if (c22829OooO0o0.f69101OooO00o <= 0 && (context = com.orion.editor.OooO00o.this.f69056OooO00o.getContext()) != null) {
                        c22829OooO0o0.f69101OooO00o = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
                    }
                    if (!(interfaceC31284OooO0O0 instanceof ShapeInfo)) {
                        if (!(interfaceC31284OooO0O0 instanceof QuoteInfo)) {
                            return o00OO0O0.OooO0O0.OooO0oo(x, y, o00OO0O0.OooO0O0.OooO0oO(interfaceC31284OooO0O0.getBoundingBox(1.0f), 0.0f));
                        }
                        QuoteInfo quoteInfo = (QuoteInfo) interfaceC31284OooO0O0;
                        if (o00OO0O0.OooO0O0.OooO0oo(x, y, quoteInfo.getContentBoundingBox())) {
                            return true;
                        }
                        RectF iconBoundingBox = quoteInfo.getIconBoundingBox();
                        if (iconBoundingBox == null || iconBoundingBox.isEmpty()) {
                            return false;
                        }
                        float fWidth = iconBoundingBox.width();
                        float f = c22829OooO0o0.f69102OooO0O0;
                        if (fWidth < f || iconBoundingBox.height() < f) {
                            float fCenterX = iconBoundingBox.centerX();
                            float fCenterY = iconBoundingBox.centerY();
                            float f2 = f / 2.0f;
                            iconBoundingBox.set(fCenterX - f2, fCenterY - f2, fCenterX + f2, f2 + fCenterY);
                        }
                        return o00OO0O0.OooO0O0.OooO0oo(x, y, iconBoundingBox);
                    }
                    ShapeInfo shapeInfo = (ShapeInfo) interfaceC31284OooO0O0;
                    RectF boundingBox = shapeInfo.getBoundingBox(1.0f);
                    int type = shapeInfo.getType();
                    if ((type == 7 || type == 19) && c22829OooO0o0.f69101OooO00o > 0) {
                        float fAbs = Math.abs(boundingBox.top - boundingBox.bottom);
                        float f3 = c22829OooO0o0.f69101OooO00o;
                        if (fAbs < f3) {
                            float f4 = (boundingBox.top + boundingBox.bottom) / 2.0f;
                            float f5 = f3 / 2.0f;
                            boundingBox.top = f5 + f4;
                            boundingBox.bottom = f4 - f5;
                        } else {
                            float fAbs2 = Math.abs(boundingBox.left - boundingBox.right);
                            float f6 = c22829OooO0o0.f69101OooO00o;
                            if (fAbs2 < f6) {
                                float f7 = (boundingBox.left + boundingBox.right) / 2.0f;
                                float f8 = f6 / 2.0f;
                                boundingBox.left = f8 + f7;
                                boundingBox.right = f7 - f8;
                            }
                        }
                    }
                    return o00OO0O0.OooO0O0.OooO0oo(x, y, o00OO0O0.OooO0O0.OooO0oO(boundingBox, 0.0f));
                }
            }).collect(Collectors.toList());
            return super.onDown(motionEvent);
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [long] */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) throws Throwable {
            if (this.f69103OooO0OO.isEmpty()) {
                OooO00o(motionEvent);
                return;
            }
            List<InterfaceC31284OooO0O0> list = this.f69103OooO0OO;
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) System.currentTimeMillis();
            boolean z = interfaceC31284OooO0O0 instanceof ImageInfo;
            OooO00o oooO00o = OooO00o.this;
            if (!z && !(interfaceC31284OooO0O0 instanceof ShapeInfo) && !(interfaceC31284OooO0O0 instanceof DualLinkRefInfo)) {
                if (interfaceC31284OooO0O0 instanceof TextBoxInfo) {
                    oooO00o.f69056OooO00o.Oooo000();
                    oooO00o.f69067OooOOO = false;
                    oooO00o.f69072OooOOo0 = new PointF();
                    new PointF();
                    PDFView pDFView = oooO00o.f69056OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    oooO00o.f69090Oooo00o = true;
                    oooO00o.f69064OooOO0.OooO0OO();
                    pDFView.getTool().OooOO0O();
                    pDFView.OoooOOo();
                    abstractC22830OooO0Oo.f69109OooO0O0.OoooO((TextBoxInfo) interfaceC31284OooO0O0, null);
                    return;
                }
                if (interfaceC31284OooO0O0 instanceof HyperLinkInfo) {
                    return;
                }
                if (!(interfaceC31284OooO0O0 instanceof QuoteInfo)) {
                    OooO00o(motionEvent);
                    return;
                }
                QuoteInfo quoteInfo = (QuoteInfo) interfaceC31284OooO0O0;
                if (quoteInfo == null || quoteInfo.getType() == 3 || quoteInfo.getType() == 6) {
                    return;
                }
                Iterator<RectF> it = quoteInfo.getRectList().iterator();
                while (it.hasNext()) {
                    if (it.next().contains(motionEvent.getX(), motionEvent.getY())) {
                        oooO00o.f69087Oooo0 = true;
                        oooO00o.f69064OooOO0.OooO0OO();
                        PDFView pDFView2 = oooO00o.f69056OooO00o;
                        pDFView2.getTool().OooOO0O();
                        pDFView2.OoooOOo();
                        pDFView2.OooooOO(quoteInfo);
                        return;
                    }
                }
                return;
            }
            AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = oooO00o.f69056OooO00o.f69170OooOooO;
            boolean z2 = interfaceC31284OooO0O0 instanceof ShapeInfo;
            if (z2 && ((ShapeInfo) interfaceC31284OooO0O0).getTapeLike()) {
                return;
            }
            oooO00o.f69089Oooo00O = true;
            oooO00o.f69064OooOO0.OooO0OO();
            PDFView pDFView3 = oooO00o.f69056OooO00o;
            pDFView3.getTool().OooOO0O();
            pDFView3.OoooOOo();
            if (z) {
                ImageInfo imageInfo = (ImageInfo) interfaceC31284OooO0O0;
                abstractC22830OooO0Oo2.f69109OooO0O0.OoooO(imageInfo, null);
                pDFView3.OoooOo0(o00OO0O0.OooO0O0.OooO0oO(imageInfo.getBounds(), imageInfo.getRotation()));
                pDFView3.Ooooooo(imageInfo, true);
            }
            if (interfaceC31284OooO0O0 instanceof DualLinkRefInfo) {
                DualLinkRefInfo dualLinkRefInfo = (DualLinkRefInfo) interfaceC31284OooO0O0;
                if (o00OO0O0.OooO0O0.OooO0oo(motionEvent.getX(), motionEvent.getY(), dualLinkRefInfo.getClickableBound(pDFView3.getZoomLevel()))) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("DragPinchManager");
                    c20358OooO00o.OooO00o("long press on icon", new Object[0]);
                    return;
                }
                abstractC22830OooO0Oo2.f69109OooO0O0.OoooO(interfaceC31284OooO0O0, null);
                ImageInfo imageInfo2 = (ImageInfo) dualLinkRefInfo.getItem();
                RectF boundingBox = interfaceC31284OooO0O0.getBoundingBox(1.0f);
                androidx.core.util.Pair<Integer, Integer> pairOooOOOo = abstractC22830OooO0Oo2.OooOOOo(boundingBox);
                int iIntValue = pairOooOOOo.first.intValue();
                while (iIntValue <= pairOooOOOo.second.intValue()) {
                    androidx.core.util.Pair<Float, Float> pairOooOOO = abstractC22830OooO0Oo2.OooOOO(iIntValue);
                    RectF rectF = new RectF(boundingBox);
                    rectF.offset(pairOooOOO.first.floatValue(), pairOooOOO.second.floatValue());
                    pDFView3.Ooooo00(rectF, abstractC22830OooO0Oo2, iIntValue);
                    oooO00o.f69056OooO00o.OoooOoo(rectF, abstractC22830OooO0Oo2, iIntValue, false, false);
                    iIntValue++;
                    pairOooOOOo = pairOooOOOo;
                }
                pDFView3.invalidate();
                pDFView3.Ooooooo(imageInfo2, false);
            }
            if (z2) {
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("DragPinchManager");
                c20358OooO00o2.OooO00o("ShapeInfo long clicked", new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putBoolean("showContextMenu", true);
                pDFView3.f69170OooOooO.f69109OooO0O0.OoooO((ShapeInfo) interfaceC31284OooO0O0, bundle);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:171:0x036f A[LOOP:3: B:169:0x0369->B:171:0x036f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x038a  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x0462  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x018b A[EDGE_INSN: B:230:0x018b->B:82:0x018b BREAK  A[LOOP:1: B:60:0x012b->B:81:0x0189], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:233:0x0189 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01e2  */
        /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r10v13, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r10v2, types: [oOo000Oo.OooOoO] */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r15v17 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4, types: [oO00ooO.OooOOO] */
        /* JADX WARN: Type inference failed for: r4v22, types: [long] */
        /* JADX WARN: Type inference failed for: r6v24 */
        /* JADX WARN: Type inference failed for: r6v25, types: [com.orion.notein.domain.models.papertheme.PdfPaperTheme] */
        /* JADX WARN: Type inference failed for: r6v43 */
        /* JADX WARN: Type inference failed for: r7v17, types: [android.os.Bundle] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) throws Throwable {
            Throwable th;
            HyperLinkInfo hyperLinkInfo;
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0;
            boolean z;
            boolean z2;
            boolean zOooOOO0;
            boolean z3;
            Throwable th2;
            ?? arrayList;
            Iterator it;
            Page page;
            Throwable th3;
            ?? r15;
            Object next;
            String pdfPath;
            PdfInfo pdfInfo;
            boolean z4;
            int iIntValue;
            RectF iconBoundingBox;
            boolean z5 = true;
            OooO00o oooO00o = OooO00o.this;
            if (oooO00o.f69069OooOOOO) {
                return false;
            }
            int size = this.f69103OooO0OO.size() - 1;
            while (true) {
                th = null;
                if (size < 0) {
                    hyperLinkInfo = null;
                    break;
                }
                InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = this.f69103OooO0OO.get(size);
                if (interfaceC31284OooO0O02 instanceof HyperLinkInfo) {
                    hyperLinkInfo = (HyperLinkInfo) interfaceC31284OooO0O02;
                    break;
                }
                size--;
            }
            if (this.f69103OooO0OO.isEmpty()) {
                interfaceC31284OooO0O0 = null;
            } else {
                List<InterfaceC31284OooO0O0> list = this.f69103OooO0OO;
                interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) System.currentTimeMillis();
            }
            if (hyperLinkInfo != null) {
                PDFView pDFView = oooO00o.f69056OooO00o;
                if (pDFView.f69170OooOooO == null) {
                    z = false;
                } else {
                    pDFView.getTool().OooOO0O();
                    PDFView pDFView2 = oooO00o.f69056OooO00o;
                    pDFView2.OoooOOo();
                    if (pDFView2.getEditMode() == PDFView.EnumC22832OooO0Oo.f69316OooOoO) {
                        pDFView2.OooooOO(hyperLinkInfo);
                        pDFView2.OoooOo0(o00OO0O0.OooO0O0.OooO0oO(hyperLinkInfo.getBounds(), 0.0f));
                    } else {
                        if (pDFView2.getEditMode() == PDFView.EnumC22832OooO0Oo.f69314OooOo || pDFView2.getEditMode() == PDFView.EnumC22832OooO0Oo.f69320OooOoo0) {
                            if (hyperLinkInfo.getClickableBound(pDFView2.getZoomLevel()).contains(motionEvent.getX(), motionEvent.getY()) && pDFView2.getShowHyperLinkIcon()) {
                                pDFView2.OoooooO(hyperLinkInfo);
                            } else {
                                pDFView2.OoooO0(hyperLinkInfo, false);
                            }
                        }
                        z = false;
                    }
                    z = true;
                }
            }
            if (!z && (interfaceC31284OooO0O0 instanceof ImageInfo)) {
                ImageInfo imageInfo = (ImageInfo) interfaceC31284OooO0O0;
                boolean z6 = imageInfo.getFixedIconBounds(oooO00o.f69056OooO00o.getZoomLevel()).contains(motionEvent.getX(), motionEvent.getY()) && imageInfo.getFixed();
                if (z6) {
                    PDFView pDFView3 = oooO00o.f69056OooO00o;
                    pDFView3.OooOoO();
                    pDFView3.getTool().OooOO0O();
                    pDFView3.OoooO0(imageInfo, true);
                }
                z = z6;
            }
            if (!z && (interfaceC31284OooO0O0 instanceof TextBoxInfo)) {
                TextBoxInfo textBoxInfo = (TextBoxInfo) interfaceC31284OooO0O0;
                if (oooO00o.f69056OooO00o.getEditMode() == PDFView.EnumC22832OooO0Oo.f69317OooOoO0) {
                    PDFView pDFView4 = oooO00o.f69056OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView4.f69170OooOooO;
                    if (abstractC22830OooO0Oo == null) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("DragPinchManager");
                        c20358OooO00o.OooO0OO("pdfFile is null in onSingleTapForTextBoxInfo", new Object[0]);
                        z = false;
                    } else {
                        oooO00o.f69090Oooo00o = true;
                        pDFView4.getTool().OooOO0O();
                        pDFView4.OoooOOo();
                        abstractC22830OooO0Oo.f69109OooO0O0.OoooO(textBoxInfo, null);
                        pDFView4.OoooOo0(o00OO0O0.OooO0O0.OooO0oO(textBoxInfo.getBounds(), 0.0f));
                        pDFView4.o00Ooo(textBoxInfo);
                        z = true;
                    }
                } else {
                    z = false;
                }
            }
            if (!z) {
                for (int size2 = this.f69103OooO0OO.size() - 1; size2 >= 0; size2--) {
                    InterfaceC31284OooO0O0 interfaceC31284OooO0O03 = this.f69103OooO0OO.get(size2);
                    if (interfaceC31284OooO0O03 instanceof QuoteInfo) {
                        QuoteInfo quoteInfo = (QuoteInfo) interfaceC31284OooO0O03;
                        if (quoteInfo != null && (iconBoundingBox = quoteInfo.getIconBoundingBox()) != null && !iconBoundingBox.isEmpty()) {
                            float fWidth = iconBoundingBox.width();
                            float f = this.f69102OooO0O0;
                            if (fWidth < f || iconBoundingBox.height() < f) {
                                float fCenterX = iconBoundingBox.centerX();
                                float fCenterY = iconBoundingBox.centerY();
                                float f2 = f / 2.0f;
                                iconBoundingBox.set(fCenterX - f2, fCenterY - f2, fCenterX + f2, f2 + fCenterY);
                            }
                            if (o00OO0O0.OooO0O0.OooO0oo(motionEvent.getX(), motionEvent.getY(), iconBoundingBox)) {
                                oooO00o.f69056OooO00o.OooooOO(quoteInfo);
                                z = true;
                            }
                            if (!z) {
                                break;
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                }
            }
            if (z) {
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                PDFView pDFView5 = oooO00o.f69056OooO00o;
                AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = pDFView5.f69170OooOooO;
                if (abstractC22830OooO0Oo2 == null) {
                    z2 = false;
                } else {
                    int iOooOO0o = abstractC22830OooO0Oo2.OooOO0o(pDFView5.getZoom(), new PointF(x, y));
                    RectF rectFOooOOO = pDFView5.OooOOO(new RectF(x, y, x, y), iOooOO0o);
                    int iOooO0oo = abstractC22830OooO0Oo2.OooO0oo(iOooOO0o);
                    if (iOooO0oo < 0) {
                        arrayList = new ArrayList();
                        z3 = true;
                        th2 = null;
                    } else {
                        ?? arrayList2 = C34434OooOoO.f123453OooOo0o;
                        C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo2.f69109OooO0O0;
                        if (iOooO0oo < 0 || iOooO0oo >= c26395Oooo0o0.f90560OooOO0.size() || (page = (Page) OooOo.OoooO00(iOooO0oo, c26395Oooo0o0.f90560OooOO0)) == null) {
                            z3 = true;
                            th2 = th;
                            arrayList = arrayList2;
                            C26112OooO0oo c26112OooO0ooOooOo0O = c26395Oooo0o0.OooOo0O(iOooO0oo);
                            Iterable iterable = (Iterable) arrayList;
                            ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(iterable, 10));
                            it = iterable.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((C26108OooO0Oo) it.next()).f89131OooO00o);
                            }
                            ArrayList arrayListOooO0oO = c26395Oooo0o0.OooO0oO(iOooO0oo, arrayList3, c26112OooO0ooOooOo0O);
                            int i = 0;
                            for (Object obj : iterable) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    C34429OooOOo0.OooOOo();
                                    throw th2;
                                }
                                C26108OooO0Oo c26108OooO0Oo = (C26108OooO0Oo) obj;
                                c26108OooO0Oo.f89131OooO00o.set((RectF) arrayListOooO0oO.get(i));
                                c26108OooO0Oo.f89131OooO00o.sort();
                                i = i2;
                            }
                        } else {
                            PaperTheme paperTheme = page.getPaperTheme();
                            if (paperTheme instanceof PdfPaperTheme) {
                                PdfPaperTheme pdfPaperTheme = (PdfPaperTheme) paperTheme;
                                PdfDocument pdfDocument = c26395Oooo0o0.f90561OooOO0O.get(pdfPaperTheme.getPdfInfo().getPdfPath());
                                if (pdfDocument != null) {
                                    List<Page> list2 = c26395Oooo0o0.f90560OooOO0;
                                    ArrayList arrayList4 = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                                    int i3 = 0;
                                    for (Object obj2 : list2) {
                                        int i4 = i3 + 1;
                                        if (i3 < 0) {
                                            C34429OooOOo0.OooOOo();
                                            throw null;
                                        }
                                        arrayList4.add(new C32443OooOOO(Integer.valueOf(i3), (Page) obj2));
                                        z5 = z5;
                                        i3 = i4;
                                    }
                                    z3 = z5;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Object obj3 : arrayList4) {
                                        PaperTheme paperTheme2 = ((Page) ((C32443OooOOO) obj3).f116637OooOo).getPaperTheme();
                                        PdfPaperTheme pdfPaperTheme2 = paperTheme2 instanceof PdfPaperTheme ? (PdfPaperTheme) paperTheme2 : null;
                                        if (pdfPaperTheme2 == null || (pdfInfo = pdfPaperTheme2.getPdfInfo()) == null || (pdfPath = pdfInfo.getPdfPath()) == null) {
                                            pdfPath = "";
                                        }
                                        Object arrayList5 = linkedHashMap.get(pdfPath);
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                            linkedHashMap.put(pdfPath, arrayList5);
                                        }
                                        ((List) arrayList5).add(obj3);
                                    }
                                    List<PdfDocument.Link> pageLinks = c26395Oooo0o0.f90551OooO.getPageLinks(pdfDocument, pdfPaperTheme.getPageNum());
                                    OooOOO0.OooO0o(pageLinks, "getPageLinks(...)");
                                    arrayList2 = new ArrayList();
                                    for (PdfDocument.Link link : pageLinks) {
                                        List list3 = (List) linkedHashMap.get(pdfPaperTheme.getPdfInfo().getPdfPath());
                                        if (list3 != null) {
                                            Iterator it2 = list3.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    th3 = th;
                                                    next = th3;
                                                    break;
                                                }
                                                next = it2.next();
                                                th3 = th;
                                                PaperTheme paperTheme3 = ((Page) ((C32443OooOOO) next).f116637OooOo).getPaperTheme();
                                                ?? r6 = paperTheme3 instanceof PdfPaperTheme ? (PdfPaperTheme) paperTheme3 : th3;
                                                if (r6 != 0) {
                                                    int pageNum = r6.getPageNum();
                                                    Integer destPageIdx = link.getDestPageIdx();
                                                    if (destPageIdx != null && pageNum == destPageIdx.intValue()) {
                                                        break;
                                                    }
                                                }
                                                th = th3;
                                            }
                                            r15 = (C32443OooOOO) next;
                                        } else {
                                            th3 = th;
                                            r15 = th3;
                                        }
                                        String uri = link.getUri();
                                        Object c26108OooO0Oo2 = (uri == null || uri.length() == 0) ? r15 != 0 ? new C26108OooO0Oo(link.getBounds(), (Integer) r15.f116638OooOo0o, link.getUri()) : th3 : new C26108OooO0Oo(link.getBounds(), Integer.valueOf(r15 != 0 ? ((Number) r15.f116638OooOo0o).intValue() : -1), uri);
                                        if (c26108OooO0Oo2 != null) {
                                            arrayList2.add(c26108OooO0Oo2);
                                        }
                                        th = th3;
                                    }
                                }
                                th2 = th;
                                arrayList = arrayList2;
                                C26112OooO0oo c26112OooO0ooOooOo0O2 = c26395Oooo0o0.OooOo0O(iOooO0oo);
                                Iterable iterable2 = (Iterable) arrayList;
                                ArrayList arrayList32 = new ArrayList(C34428OooOOo.OooOOoo(iterable2, 10));
                                it = iterable2.iterator();
                                while (it.hasNext()) {
                                }
                                ArrayList arrayListOooO0oO2 = c26395Oooo0o0.OooO0oO(iOooO0oo, arrayList32, c26112OooO0ooOooOo0O2);
                                int i5 = 0;
                                while (r5.hasNext()) {
                                }
                            }
                        }
                    }
                    for (C26108OooO0Oo c26108OooO0Oo3 : arrayList) {
                        if (RectF.intersects(rectFOooOOO, c26108OooO0Oo3.f89131OooO00o)) {
                            C25998OooO00o c25998OooO00o = (C25998OooO00o) pDFView5.f69179Oooo0o.f85156OooO0O0;
                            if (c25998OooO00o != null) {
                                String str = c26108OooO0Oo3.f89133OooO0OO;
                                PDFView pDFView6 = c25998OooO00o.f88813OooO00o;
                                if (str == null || str.isEmpty()) {
                                    z2 = false;
                                    Integer num = c26108OooO0Oo3.f89132OooO0O0;
                                    if (num != null && (iIntValue = num.intValue()) >= 0) {
                                        pDFView6.Oooo0O0(iIntValue);
                                    }
                                } else {
                                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                    c20358OooO00o2.OooOOO0("OooO00o");
                                    c20358OooO00o2.OooO0o0("DefaultLinkHandler handle uri: %s", str);
                                    if (str.startsWith("notein")) {
                                        c20358OooO00o2.OooOOO0("OooO00o");
                                        c20358OooO00o2.OooO0o0("handleNoteDeepLink, uriString: %s", str);
                                        try {
                                            pDFView6.OoooO00(Uri.parse(str));
                                            z2 = false;
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o3.OooOOO0("OooO00o");
                                            z2 = false;
                                            c20358OooO00o3.OooO0Oo(e, "handleNoteDeepLink parse uri err", new Object[0]);
                                        }
                                    } else {
                                        z2 = false;
                                        try {
                                            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                                            intent.setData(Uri.parse(str));
                                            ContextCompat.startActivity(pDFView6.getContext(), intent, th2);
                                        } catch (Exception e2) {
                                            C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o4.OooOOO0("OooO00o");
                                            c20358OooO00o4.OooO0Oo(e2, "handleUri error: %s", str);
                                        }
                                    }
                                }
                                z4 = z3;
                                z = z4;
                            } else {
                                z2 = false;
                                z4 = z3;
                                z = z4;
                            }
                        }
                    }
                    z2 = false;
                }
                z4 = z2;
                z = z4;
            }
            if (z) {
                return z;
            }
            oooO00o.f69056OooO00o.OooOo0o();
            AbstractC22830OooO0Oo abstractC22830OooO0Oo3 = oooO00o.f69056OooO00o.f69170OooOooO;
            if (abstractC22830OooO0Oo3 == null) {
                zOooOOO0 = z2;
            } else {
                MotionEvent e3 = MotionEvent.obtain(motionEvent);
                C26395Oooo0o0 c26395Oooo0o02 = abstractC22830OooO0Oo3.f69109OooO0O0;
                if (c26395Oooo0o02 != null) {
                    OooOOO0.OooO0oO(e3, "e");
                    zOooOOO0 = c26395Oooo0o02.f90558OooO0oO.OooOOO0(e3);
                }
            }
            return zOooOOO0;
        }
    }

    public static void OooO00o(OooO00o oooO00o) {
        PDFView pDFView = oooO00o.f69056OooO00o;
        if (pDFView.getZoomHandle().OooO0OO()) {
            return;
        }
        C26395Oooo0o0 c26395Oooo0o0 = pDFView.f69170OooOooO.f69109OooO0O0;
        if (c26395Oooo0o0 != null) {
            c26395Oooo0o0.f90558OooO0oO.OooOo();
        }
        pDFView.OooOo(Boolean.FALSE);
        oooO00o.f69073OooOOoo = true;
    }

    public static void OooO0O0(OooO00o oooO00o) {
        PDFView pDFView = oooO00o.f69056OooO00o;
        if (pDFView.getZoomHandle().OooO0OO()) {
            return;
        }
        oooO00o.f69073OooOOoo = false;
        pDFView.Oooo0oO();
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        if (abstractC22830OooO0Oo != null) {
            abstractC22830OooO0Oo.Oooo00o();
        }
        QuoteInfo quoteInfoOooO0O0 = oooO00o.f69058OooO0OO.OooO0O0();
        if (quoteInfoOooO0O0 != null) {
            pDFView.o00ooo(quoteInfoOooO0O0);
        }
        InterfaceC26093OooO00o scrollHandle = oooO00o.f69056OooO00o.getScrollHandle();
        if (scrollHandle == null || !scrollHandle.OooO0o0()) {
            return;
        }
        scrollHandle.OooO0Oo();
    }

    public static void OooO0OO(OooO00o oooO00o, float f, float f2, float f3) {
        C25938OooOooo c25938OooOooo;
        PDFView pDFView = oooO00o.f69056OooO00o;
        if (pDFView.getZoomHandle().OooO0OO()) {
            pDFView.getZoomHandle().show();
            return;
        }
        float zoom = pDFView.getZoom() * f;
        float minZoomForScaling = pDFView.getMinZoomForScaling();
        float maxZoom = pDFView.getMaxZoom();
        if (zoom < minZoomForScaling) {
            f = minZoomForScaling / pDFView.getZoom();
        } else if (zoom > maxZoom) {
            f = maxZoom / pDFView.getZoom();
        }
        pDFView.o0ooOoO(pDFView.f69176Oooo00o * f, new PointF(f2, f3));
        if (pDFView.f69170OooOooO == null || (c25938OooOooo = pDFView.f69180Oooo0o0) == null) {
            return;
        }
        HandlerC25978o0000o handlerC25978o0000o = c25938OooOooo.f88586OooO0o0;
        if (handlerC25978o0000o != null) {
            handlerC25978o0000o.removeMessages(100);
            handlerC25978o0000o.sendEmptyMessage(100);
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("PDFRenderManager");
            c20358OooO00o.OooOO0O("No default render handler available to mark unbounded page thumbnail dirty.", new Object[0]);
        }
        pDFView.invalidate();
    }

    public static void OooO0Oo(OooO00o oooO00o, MotionEvent motionEvent) {
        oooO00o.f69064OooOO0.OooO0OO();
        oooO00o.f69064OooOO0.OooO0Oo(motionEvent);
        PDFView pDFView = oooO00o.f69056OooO00o;
        pDFView.OoooOOo();
        pDFView.getTool().OooOO0O();
        oooO00o.f69070OooOOOo.onTouchEvent(motionEvent);
        oooO00o.f69065OooOO0O.onTouchEvent(motionEvent);
        pDFView.Oooo000();
    }

    public static boolean OooO0o0() {
        return Build.MANUFACTURER.toLowerCase().indexOf("samsung") != -1;
    }

    public final void OooO0o() {
        PDFView pDFView = this.f69056OooO00o;
        pDFView.Oooo0oO();
        InterfaceC26093OooO00o scrollHandle = this.f69056OooO00o.getScrollHandle();
        if (scrollHandle != null && scrollHandle.OooO0o0()) {
            scrollHandle.OooO0Oo();
        }
        if (this.f69057OooO0O0.OooO0O0()) {
            pDFView.OooOo(Boolean.TRUE);
            return;
        }
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        if (abstractC22830OooO0Oo != null) {
            abstractC22830OooO0Oo.Oooo00o();
        }
        QuoteInfo quoteInfoOooO0O0 = this.f69058OooO0OO.OooO0O0();
        if (quoteInfoOooO0O0 != null) {
            pDFView.o00ooo(quoteInfoOooO0O0);
        }
    }

    public final boolean OooO0oO(float f, float f2) {
        if (this.f69078OooOo0o) {
            C34406OooO00o.f123390OooO00o.OooO00o("onScroll: ignoreScrollOnPenUp", new Object[0]);
            return false;
        }
        Boolean bool = Boolean.FALSE;
        PDFView pDFView = this.f69056OooO00o;
        pDFView.OooOo(bool);
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        if (abstractC22830OooO0Oo == null) {
            return false;
        }
        C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
        if (c26395Oooo0o0 != null) {
            c26395Oooo0o0.f90558OooO0oO.OooOo();
        }
        this.f69071OooOOo = true;
        if (this.f69075OooOo0) {
            this.f69075OooOo0 = false;
            return true;
        }
        if (pDFView.f69176Oooo00o != pDFView.f69164OooOo0o || pDFView.f69183OoooO) {
            pDFView.Oooo(pDFView.f69174Oooo000 + (-f), pDFView.f69175Oooo00O + (-f2), true);
        }
        if (this.f69073OooOOoo) {
            return true;
        }
        pDFView.Oooo0o();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f;
        float width;
        float f2;
        if (this.f69095Oooo0oO == null) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO00o("onDoubleTap in onDoubleTap", new Object[0]);
            PDFView pDFView = this.f69056OooO00o;
            int doubleTapMode = pDFView.getDoubleTapMode();
            if (doubleTapMode != 0 && pDFView.getEditMode() != PDFView.EnumC22832OooO0Oo.f69318OooOoOO) {
                if (!pDFView.f69232o0000oOo || this.f69096Oooo0oo.OooO00o()) {
                    if (pDFView.getZoomHandle().OooO0OO()) {
                        pDFView.getZoomHandle().show();
                        return false;
                    }
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    float zoom = pDFView.getZoom();
                    int iOooOO0o = abstractC22830OooO0Oo.OooOO0o(zoom, new PointF(motionEvent.getX(), motionEvent.getY()));
                    C26112OooO0oo c26112OooO0ooOooOo0o = abstractC22830OooO0Oo.OooOo0o(iOooOO0o, zoom);
                    C26112OooO0oo c26112OooO0ooOooOOo0 = abstractC22830OooO0Oo.OooOOo0(iOooOO0o);
                    if (doubleTapMode == 1) {
                        pDFView.o0Oo0oo(motionEvent.getX(), motionEvent.getY(), pDFView.getWidth() / c26112OooO0ooOooOOo0.f89149OooO00o);
                        return true;
                    }
                    if (doubleTapMode == 2) {
                        pDFView.o0Oo0oo(motionEvent.getX(), motionEvent.getY(), pDFView.getHeight() / c26112OooO0ooOooOOo0.f89150OooO0O0);
                        return true;
                    }
                    if (doubleTapMode != 3) {
                        c20358OooO00o.OooOOO0("DragPinchManager");
                        c20358OooO00o.OooO0OO("unknown double tap mode: %d", Integer.valueOf(doubleTapMode));
                        return true;
                    }
                    if (Math.abs(c26112OooO0ooOooOo0o.f89150OooO0O0 - pDFView.getHeight()) < 10.0f) {
                        width = pDFView.getWidth();
                        f2 = c26112OooO0ooOooOOo0.f89149OooO00o;
                    } else {
                        if (Math.abs(c26112OooO0ooOooOo0o.f89149OooO00o - pDFView.getWidth()) < 10.0f) {
                            width = pDFView.getHeight();
                            f2 = c26112OooO0ooOooOOo0.f89150OooO0O0;
                        } else {
                            if (Math.abs(pDFView.getZoom() - 1.0f) >= 0.1d) {
                                f = 1.0f;
                                pDFView.o0Oo0oo(motionEvent.getX(), motionEvent.getY(), f);
                                return true;
                            }
                            width = pDFView.getWidth();
                            f2 = c26112OooO0ooOooOOo0.f89149OooO00o;
                        }
                    }
                    f = width / f2;
                    pDFView.o0Oo0oo(motionEvent.getX(), motionEvent.getY(), f);
                    return true;
                }
                c20358OooO00o.OooOOO0("DragPinchManager");
                c20358OooO00o.OooO0o0("intercept double tap event by palm detection.", new Object[0]);
                InterfaceC26010OooO00o interfaceC26010OooO00o = pDFView.o0000o0;
                if (interfaceC26010OooO00o != null) {
                    interfaceC26010OooO00o.stats();
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        PDFView pDFView = this.f69056OooO00o;
        if (!pDFView.f69183OoooO) {
            return false;
        }
        PDFView.EnumC22832OooO0Oo editMode = pDFView.getEditMode();
        if (editMode != PDFView.EnumC22832OooO0Oo.f69314OooOo && editMode != PDFView.EnumC22832OooO0Oo.f69320OooOoo0) {
            return false;
        }
        C26395Oooo0o0 c26395Oooo0o0 = pDFView.f69170OooOooO.f69109OooO0O0;
        if (c26395Oooo0o0 != null) {
            c26395Oooo0o0.f90558OooO0oO.OooOo();
        }
        if (!pDFView.f69288oo0o0Oo) {
            AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
            if (abstractC22830OooO0Oo == null) {
                return true;
            }
            abstractC22830OooO0Oo.OooO(f, f2);
            return true;
        }
        AbstractC22830OooO0Oo abstractC22830OooO0Oo2 = pDFView.f69170OooOooO;
        if (abstractC22830OooO0Oo2 == null) {
            return true;
        }
        if (abstractC22830OooO0Oo2.OooOooo(pDFView.f69171OooOooo)) {
            pDFView.f69170OooOooO.OooO0O0(f, f2);
            return true;
        }
        pDFView.f69170OooOooO.Oooo000(f, f2);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.f69056OooO00o.f69179Oooo0o.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return OooO0oO(f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        PDFView pDFView = this.f69056OooO00o;
        pDFView.f69179Oooo0o.getClass();
        InterfaceC26093OooO00o scrollHandle = pDFView.getScrollHandle();
        if (scrollHandle == null) {
            return true;
        }
        AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
        if (abstractC22830OooO0Oo == null ? false : abstractC22830OooO0Oo.OooO0oO()) {
            return true;
        }
        if (scrollHandle.OooO0o0()) {
            scrollHandle.hide();
            return true;
        }
        scrollHandle.show();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
