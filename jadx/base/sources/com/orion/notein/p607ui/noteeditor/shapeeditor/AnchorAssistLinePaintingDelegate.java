package com.orion.notein.p607ui.noteeditor.shapeeditor;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.shapeeditor.AnchorAssistLinePaintingDelegate;
import com.orion.notein.p607ui.noteeditor.shapeeditor.ShapesEditorPanel;
import com.orion.penkit.models.AnchorAssistAware;
import com.orion.penkit.models.AnchorAssistLine;
import com.orion.penkit.models.DelegateAdapter;
import com.orion.penkit.models.IntPoint;
import com.orion.penkit.models.OnAssistLinesChangedListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C24023OooOOoo;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o0Ooo0oo.C29457OooOo;
import o0o000O0.C29739OooO00o;
import o0o000O0.C29741OooO0o0;
import o0o000O0.OooO0OO;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32447OooOOo;
import oO0O000o.OooO00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;
import oOo000Oo.OooOo;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\u0019R?\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b2\u0010\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010-\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u000f¨\u00060"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/shapeeditor/AnchorAssistLinePaintingDelegate;", "Landroid/view/View;", "", "Lo0oo0o/OooO0O0;", "getScreenDisplayItems", "()Ljava/util/List;", "Landroid/graphics/Paint;", "OooOo", "LoO00ooO/OooOO0;", "getAssistLinePaint", "()Landroid/graphics/Paint;", "assistLinePaint", "Landroid/graphics/Bitmap;", "OooOoO0", "getEmptyBitmap", "()Landroid/graphics/Bitmap;", "emptyBitmap", "Landroid/graphics/Canvas;", "OooOoO", "getAnchorAssistLineCanvas", "()Landroid/graphics/Canvas;", "anchorAssistLineCanvas", "Landroid/os/Handler;", "OooOoOO", "getMainHandler", "()Landroid/os/Handler;", "mainHandler", "", "Lcom/orion/penkit/models/AnchorAssistLine;", "<set-?>", "OooOoo", "LoO0O00o0/OooO0OO;", "getMAssistLines", "()Ljava/util/Set;", "setMAssistLines", "(Ljava/util/Set;)V", "mAssistLines", "Lcom/orion/penkit/models/OnAssistLinesChangedListener;", "", "OooOooO", "Lcom/orion/penkit/models/OnAssistLinesChangedListener;", "getOnAssistLineChangeListener", "()Lcom/orion/penkit/models/OnAssistLinesChangedListener;", "setOnAssistLineChangeListener", "(Lcom/orion/penkit/models/OnAssistLinesChangedListener;)V", "onAssistLineChangeListener", "getCoverBitmap", "coverBitmap", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AnchorAssistLinePaintingDelegate extends View {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f76270OooOooo = {C24035Oooo00o.f80943OooO00o.OooO0o0(new C24023OooOOoo(AnchorAssistLinePaintingDelegate.class, "mAssistLines", "getMAssistLines()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C32447OooOOo f76271OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final View f76272OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C32447OooOOo f76273OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C32447OooOOo f76274OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C32447OooOOo f76275OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C29741OooO0o0 f76276OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final long f76277OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name and from kotlin metadata */
    public OnAssistLinesChangedListener<Integer> onAssistLineChangeListener;

    public AnchorAssistLinePaintingDelegate(Context context, View view) {
        super(context, null, 0);
        this.f76272OooOo0o = view;
        this.f76271OooOo = C20519OooO0Oo.OooO0OO(new C29739OooO00o());
        this.f76274OooOoO0 = C20519OooO0Oo.OooO0OO(new OooO00o() { // from class: o0o000O0.OooO0O0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                AnchorAssistLinePaintingDelegate anchorAssistLinePaintingDelegate = this.f105465OooOo0o;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(anchorAssistLinePaintingDelegate.f76272OooOo0o.getWidth(), anchorAssistLinePaintingDelegate.f76272OooOo0o.getHeight(), Bitmap.Config.ARGB_8888);
                kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                return bitmapCreateBitmap;
            }
        });
        this.f76273OooOoO = C20519OooO0Oo.OooO0OO(new C29457OooOo(this, 1));
        this.f76275OooOoOO = C20519OooO0Oo.OooO0OO(new OooO0OO());
        this.f76277OooOoo0 = 100L;
        DelegateAdapter delegateAdapter = DelegateAdapter.INSTANCE;
        this.f76276OooOoo = new C29741OooO0o0(this);
    }

    public static Canvas OooO00o(AnchorAssistLinePaintingDelegate anchorAssistLinePaintingDelegate) {
        return new Canvas(anchorAssistLinePaintingDelegate.getEmptyBitmap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Canvas getAnchorAssistLineCanvas() {
        return (Canvas) this.f76273OooOoO.getValue();
    }

    private final Paint getAssistLinePaint() {
        return (Paint) this.f76271OooOo.getValue();
    }

    private final Bitmap getCoverBitmap() {
        return getEmptyBitmap();
    }

    private final Bitmap getEmptyBitmap() {
        return (Bitmap) this.f76274OooOoO0.getValue();
    }

    private final Set<AnchorAssistLine<?>> getMAssistLines() {
        return (Set) this.f76276OooOoo.getValue(this, f76270OooOooo[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getMainHandler() {
        return (Handler) this.f76275OooOoOO.getValue();
    }

    private final List<InterfaceC31284OooO0O0> getScreenDisplayItems() {
        ShapesEditorPanel.OooO00o eventListener;
        View view = this.f76272OooOo0o;
        ShapesEditorPanel shapesEditorPanel = view instanceof ShapesEditorPanel ? (ShapesEditorPanel) view : null;
        if (shapesEditorPanel == null || (eventListener = shapesEditorPanel.getEventListener()) == null) {
            return null;
        }
        return eventListener.OooO0o();
    }

    private final void setMAssistLines(Set<? extends AnchorAssistLine<?>> set) {
        this.f76276OooOoo.setValue(this, f76270OooOooo[0], set);
    }

    public final void OooO0Oo(AnchorAssistAware<Integer, IntPoint> cur) {
        OooOOO0.OooO0oO(cur, "cur");
        List<InterfaceC31284OooO0O0> screenDisplayItems = getScreenDisplayItems();
        if (screenDisplayItems != null) {
            ArrayList<AnchorAssistAware> arrayList = new ArrayList();
            for (Object obj : screenDisplayItems) {
                if (obj instanceof AnchorAssistAware) {
                    arrayList.add(obj);
                }
            }
            Set<? extends AnchorAssistLine<?>> setOooO0oo = C34438OooOoo0.f123458OooOo0o;
            for (AnchorAssistAware anchorAssistAware : arrayList) {
                Iterable allAssistPoints = cur.getAllAssistPoints();
                ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(allAssistPoints, 10));
                Iterator it = allAssistPoints.iterator();
                while (true) {
                    AnchorAssistLine assistLine = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    IntPoint intPoint = (IntPoint) it.next();
                    if (anchorAssistAware.getYCoordinates().contains(intPoint.getY())) {
                        assistLine = anchorAssistAware.getAssistLine(AnchorAssistAware.Horizontal.INSTANCE, intPoint);
                    }
                    arrayList2.add(assistLine);
                }
                Set setO0OO00O = OooOo.o0OO00O(OooOo.Oooo0o0(arrayList2));
                Iterable<IntPoint> allAssistPoints2 = cur.getAllAssistPoints();
                ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(allAssistPoints2, 10));
                for (IntPoint intPoint2 : allAssistPoints2) {
                    arrayList3.add(anchorAssistAware.getXCoordinates().contains(intPoint2.getX()) ? anchorAssistAware.getAssistLine(AnchorAssistAware.Vertical.INSTANCE, intPoint2) : null);
                }
                setOooO0oo = C34449Oooo0oo.OooO0oo(C34449Oooo0oo.OooO0oo(setOooO0oo, setO0OO00O), OooOo.o0OO00O(OooOo.Oooo0o0(arrayList3)));
            }
            setMAssistLines(setOooO0oo);
        }
    }

    public final void OooO0o0() {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("AnchorAssistLineTAG");
        c20358OooO00o.OooO00o("clearAnchorLinesCanvas.", new Object[0]);
        getAnchorAssistLineCanvas().drawColor(0, PorterDuff.Mode.MULTIPLY);
        invalidate();
    }

    public final OnAssistLinesChangedListener<Integer> getOnAssistLineChangeListener() {
        return this.onAssistLineChangeListener;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        OooOOO0.OooO0oO(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawBitmap(getCoverBitmap(), 0.0f, 0.0f, getAssistLinePaint());
    }

    public final void setOnAssistLineChangeListener(OnAssistLinesChangedListener<Integer> onAssistLinesChangedListener) {
        this.onAssistLineChangeListener = onAssistLinesChangedListener;
    }
}
