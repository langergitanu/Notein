package com.orion.notein.p607ui.noteeditor.itemeditor;

import Oooo0.o000000O;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.os.PersistableBundleKt;
import com.orion.notein.domain.models.DragConstants;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditor;
import com.orion.notein.p607ui.noteeditor.itemeditor.ItemsEditorPanel;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.LassoParams;
import com.orion.penkit.models.QuoteInfo;
import com.orion.penkit.models.TextBoxInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OoO.OooOO0O;
import o0OoO.ViewOnTouchListenerC28505OooOO0o;
import o0OoO0oo.C28957o00oOo0O;
import o0OoO0oo.InterfaceC28684OooO;
import o0Ooo00O.C29370OooO0o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0014J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditorPanel;", "Landroid/widget/FrameLayout;", "Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditor$OooO00o;", "Lo0OoO0oo/OooO;", "", "enabled", "LoO00ooO/OooOooO;", "setColorInversion", "(Z)V", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditorPanel$OooO00o;", "OooOooO", "Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditorPanel$OooO00o;", "getEventListener", "()Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditorPanel$OooO00o;", "setEventListener", "(Lcom/orion/notein/ui/noteeditor/itemeditor/ItemsEditorPanel$OooO00o;)V", "eventListener", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ItemsEditorPanel extends FrameLayout implements ItemsEditor.OooO00o, InterfaceC28684OooO {

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final /* synthetic */ int f74688Oooo0OO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView f74689OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ItemsEditor f74690OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f74691OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f74692OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public LassoParams f74693OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public float f74694OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final RectF f74695OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name and from kotlin metadata */
    public OooO00o eventListener;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Handler f74697OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final Paint f74698Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final RectF f74699Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final PointF f74700Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final PointF f74701Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final ViewOnTouchListenerC28505OooOO0o f74702Oooo0O0;

    public interface OooO00o {
        void OooO00o();

        void OooO0OO(ArrayList arrayList);

        Object OooO0Oo(C29370OooO0o c29370OooO0o);

        void OooO0o(LassoParams lassoParams, RectF rectF, float f);

        void OooO0o0(List list, float f, RectF rectF, float f2, boolean z, LassoParams lassoParams);
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.itemeditor.ItemsEditorPanel$onFinishInflate$1$1", m80623f = "ItemsEditorPanel.kt", m80624l = {166}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f74704OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return ItemsEditorPanel.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f74704OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f74704OooOo0o = 1;
                if (ItemsEditorPanel.OooO0OO(ItemsEditorPanel.this, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemsEditorPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO0.OooO0oO(context, "context");
        this.f74692OooOoO0 = 1.0f;
        this.f74695OooOoo0 = new RectF();
        this.f74697OooOooo = new Handler(Looper.getMainLooper());
        this.f74699Oooo000 = new RectF();
        this.f74700Oooo00O = new PointF();
        this.f74701Oooo00o = new PointF();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(Color.parseColor("#007AFF"));
        paint.setStrokeWidth(o000000O.OooO0o0(1.5f));
        paint.setPathEffect(new DashPathEffect(new float[]{o000000O.OooO0o0(4.0f), o000000O.OooO0o0(4.0f)}, 0.0f));
        this.f74698Oooo0 = paint;
        this.f74702Oooo0O0 = new ViewOnTouchListenerC28505OooOO0o(this, 1);
        View.inflate(context, R.layout.layout_items_editor_panel, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0OO(ItemsEditorPanel itemsEditorPanel, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C29370OooO0o c29370OooO0o;
        ClipData clipData;
        if (abstractC32479OooO0OO instanceof C29370OooO0o) {
            c29370OooO0o = (C29370OooO0o) abstractC32479OooO0OO;
            int i = c29370OooO0o.f104147OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c29370OooO0o.f104147OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c29370OooO0o = new C29370OooO0o(itemsEditorPanel, abstractC32479OooO0OO);
            }
        }
        Object obj = c29370OooO0o.f104146OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c29370OooO0o.f104147OooOoOO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ClipData.Item item = new ClipData.Item("");
            Integer fragmentHostId = DragConstants.INSTANCE.getFragmentHostId(itemsEditorPanel);
            clipData = new ClipData(DragConstants.NOTEIN_DRAG_LABEL, new String[]{"application/octet-stream"}, item);
            clipData.getDescription().setExtras(PersistableBundleKt.persistableBundleOf(new C32443OooOOO(DragConstants.NOTEIN_DRAG_DATA_TYPE, new Integer(7)), new C32443OooOOO(DragConstants.NOTEIN_DRAG_HOST_FRAGMENT_ID, fragmentHostId)));
            OooO00o oooO00o = itemsEditorPanel.eventListener;
            if (oooO00o != null) {
                c29370OooO0o.f104144OooOo0o = itemsEditorPanel;
                c29370OooO0o.f104143OooOo = clipData;
                c29370OooO0o.f104147OooOoOO = 1;
                if (oooO00o.OooO0Oo(c29370OooO0o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ClipData clipData2 = c29370OooO0o.f104143OooOo;
            ItemsEditorPanel itemsEditorPanel2 = c29370OooO0o.f104144OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            clipData = clipData2;
            itemsEditorPanel = itemsEditorPanel2;
        }
        ImageView imageView = (ImageView) itemsEditorPanel.findViewById(R.id.img_content);
        OooOOO0.OooO0Oo(imageView);
        imageView.startDragAndDrop(clipData, new C28957o00oOo0O(imageView), null, 257);
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // com.orion.notein.ui.noteeditor.itemeditor.ItemsEditor.OooO00o
    public final void OooO00o(float f, float f2) {
        double d = this.f74694OooOoo + f;
        double dOooO00o = oO0O00O.OooO00o.OooO00o(d / ((double) 45.0f)) * 45.0f;
        if (Math.abs(d - dOooO00o) < 6.0f) {
            d = dOooO00o;
        }
        ItemsEditor itemsEditor = this.f74690OooOo0o;
        if (itemsEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        itemsEditor.setRotation((float) d);
        RectF rectF = this.f74695OooOoo0;
        float fWidth = ((rectF.width() - o000000O.OooO0o(20)) * f2) + o000000O.OooO0o(20);
        float fHeight = ((rectF.height() - o000000O.OooO0o(20)) * f2) + o000000O.OooO0o(20);
        ItemsEditor itemsEditor2 = this.f74690OooOo0o;
        if (itemsEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = itemsEditor2.getLayoutParams();
        if (fWidth >= 0.0f || layoutParams.width > o000000O.OooO0o(30)) {
            if (fHeight >= 0.0f || layoutParams.height > o000000O.OooO0o(30)) {
                ItemsEditor itemsEditor3 = this.f74690OooOo0o;
                if (itemsEditor3 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                float f3 = 2;
                itemsEditor3.setTranslationX(rectF.left - ((fWidth - rectF.width()) / f3));
                ItemsEditor itemsEditor4 = this.f74690OooOo0o;
                if (itemsEditor4 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                itemsEditor4.setTranslationY(rectF.top - ((fHeight - rectF.height()) / f3));
                layoutParams.width = oO0O00O.OooO00o.OooO0O0(fWidth);
                layoutParams.height = oO0O00O.OooO00o.OooO0O0(fHeight);
                ItemsEditor itemsEditor5 = this.f74690OooOo0o;
                if (itemsEditor5 == null) {
                    OooOOO0.OooOOOO("editor");
                    throw null;
                }
                itemsEditor5.setLayoutParams(layoutParams);
                requestLayout();
            }
        }
    }

    @Override // com.orion.notein.ui.noteeditor.itemeditor.ItemsEditor.OooO00o
    public final void OooO0O0(int i, int i2) {
        ItemsEditor itemsEditor = this.f74690OooOo0o;
        if (itemsEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = itemsEditor.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        ItemsEditor itemsEditor2 = this.f74690OooOo0o;
        if (itemsEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        itemsEditor2.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void OooO0Oo(List<? extends InterfaceC31284OooO0O0> list, final float f, boolean z) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        ItemsEditor itemsEditor = this.f74690OooOo0o;
        if (itemsEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        itemsEditor.setColorInversion(this.f74691OooOoO);
        InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
        RectF rectF = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(f, list2));
        rectF.left -= o000000O.OooO0o(10);
        rectF.top -= o000000O.OooO0o(10);
        rectF.right += o000000O.OooO0o(10);
        rectF.bottom += o000000O.OooO0o(10);
        final ItemsEditor itemsEditor2 = this.f74690OooOo0o;
        if (itemsEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        itemsEditor2.setTranslationX(rectF.left);
        itemsEditor2.setTranslationY(rectF.top);
        itemsEditor2.f74677OooOoO = z;
        if (itemsEditor2.colorInversion) {
            List<Object> list3 = list2;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list3, 10));
            for (Object objCopyWithColorIntArgb : list3) {
                if (objCopyWithColorIntArgb instanceof InkStrokeInfo) {
                    InkStrokeInfo inkStrokeInfo = (InkStrokeInfo) objCopyWithColorIntArgb;
                    String id = inkStrokeInfo.getId();
                    int iOooO0O0 = inkStrokeInfo.getStroke().f65486OooO00o.OooO0O0();
                    objCopyWithColorIntArgb = inkStrokeInfo.copyWithColorIntArgb(id, Color.argb(Color.alpha(iOooO0O0), 255 - Color.red(iOooO0O0), 255 - Color.green(iOooO0O0), 255 - Color.blue(iOooO0O0)));
                }
                arrayList.add(objCopyWithColorIntArgb);
            }
            list2 = arrayList;
        }
        InterfaceC31284OooO0O0.f111702OooO0O0.getClass();
        RectF rectF2 = new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(f, list2));
        List<InterfaceC31284OooO0O0> list4 = list2;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list4, 10));
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list4) {
            InterfaceC31284OooO0O0 interfaceC31284OooO0O0DeepCopy = interfaceC31284OooO0O0.deepCopy(interfaceC31284OooO0O0.getId());
            interfaceC31284OooO0O0DeepCopy.offset(-rectF2.left, -rectF2.top);
            arrayList2.add(interfaceC31284OooO0O0DeepCopy);
        }
        int iWidth = (int) rectF2.width();
        if (iWidth < 1) {
            iWidth = 1;
        }
        int iHeight = (int) rectF2.height();
        final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, iHeight >= 1 ? iHeight : 1, Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        List listOooOO0o = C34429OooOOo0.OooOO0o(5, 0, 9, 2, 4, 7, 3);
        final ArrayList arrayList3 = new ArrayList();
        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: o0Ooo00O.OooO0Oo
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                int i = ItemsEditor.f74674Oooo0O0;
                boolean z2 = Build.VERSION.SDK_INT >= 34;
                ArrayList arrayList4 = arrayList3;
                Canvas canvas2 = canvas;
                ItemsEditor itemsEditor3 = itemsEditor2;
                float f2 = f;
                if (z2) {
                    Picture picture = new Picture();
                    Bitmap bitmap = bitmapCreateBitmap;
                    Canvas canvasBeginRecording = picture.beginRecording(bitmap.getWidth(), bitmap.getHeight());
                    OooOOO0.OooO0o(canvasBeginRecording, "beginRecording(...)");
                    canvasBeginRecording.drawColor(0, PorterDuff.Mode.CLEAR);
                    itemsEditor3.OooO00o(canvasBeginRecording, arrayList4, f2, z2);
                    picture.endRecording();
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(picture, width, height, Bitmap.Config.ARGB_8888);
                    OooOOO0.OooO0o(bitmapCreateBitmap2, "createBitmap(...)");
                    canvas2.drawBitmap(bitmapCreateBitmap2, 0.0f, 0.0f, (Paint) null);
                    bitmapCreateBitmap2.recycle();
                } else {
                    itemsEditor3.OooO00o(canvas2, arrayList4, f2, z2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        };
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList2) {
            Integer numValueOf = Integer.valueOf(((InterfaceC31284OooO0O0) obj).getItemType());
            Object arrayList4 = linkedHashMap.get(numValueOf);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList4);
            }
            ((List) arrayList4).add(obj);
        }
        Iterator it = listOooOO0o.iterator();
        while (it.hasNext()) {
            List list5 = (List) linkedHashMap.get(Integer.valueOf(((Number) it.next()).intValue()));
            if (list5 != null) {
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((InterfaceC31284OooO0O0) it2.next());
                    if (arrayList3.size() >= 500) {
                        oooO00o.invoke();
                        arrayList3.clear();
                    }
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            oooO00o.invoke();
            arrayList3.clear();
        }
        canvas.setBitmap(null);
        itemsEditor2.bitmap = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            ImageView imageView = itemsEditor2.f74676OooOo0o;
            if (imageView == null) {
                OooOOO0.OooOOOO("image");
                throw null;
            }
            imageView.setImageBitmap(bitmapCreateBitmap);
        }
        int iWidth2 = (int) rectF.width();
        int iHeight2 = (int) rectF.height();
        ItemsEditor.OooO00o oooO00o2 = itemsEditor2.eventListener;
        if (oooO00o2 != null) {
            oooO00o2.OooO0O0(iWidth2, iHeight2);
        }
        ItemsEditor itemsEditor3 = this.f74690OooOo0o;
        if (itemsEditor3 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float f2 = rectF.left;
        float f3 = rectF.top;
        itemsEditor3.setRotation(0.0f);
        itemsEditor3.setTranslationX(f2);
        itemsEditor3.setTranslationY(f3);
        itemsEditor3.setVisibility(0);
        itemsEditor3.requestFocus();
        this.f74695OooOoo0.set(rectF);
        this.f74694OooOoo = 0.0f;
    }

    public final void OooO0o(boolean z, boolean z2) {
        if (getVisibility() == 0) {
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o() { // from class: o0Ooo00O.OooO0o0
                @Override // oO0O000o.OooO00o
                public final Object invoke() {
                    ItemsEditorPanel itemsEditorPanel = this.f104148OooOo0o;
                    itemsEditorPanel.f74693OooOoOO = null;
                    ItemsEditor itemsEditor = itemsEditorPanel.f74690OooOo0o;
                    if (itemsEditor == null) {
                        OooOOO0.OooOOOO("editor");
                        throw null;
                    }
                    itemsEditor.OooO0OO();
                    itemsEditorPanel.setVisibility(8);
                    return C32460OooOooO.f116667OooO00o;
                }
            };
            if (!z) {
                oooO00o.invoke();
                return;
            }
            LassoParams lassoParams = this.f74693OooOoOO;
            if (lassoParams == null) {
                oooO00o.invoke();
                return;
            }
            List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
            if (selectedItems == null) {
                selectedItems = C34434OooOoO.f123453OooOo0o;
            }
            List<InterfaceC31284OooO0O0> list = selectedItems;
            ItemsEditor itemsEditor = this.f74690OooOo0o;
            if (itemsEditor == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float left = itemsEditor.getLeft();
            ItemsEditor itemsEditor2 = this.f74690OooOo0o;
            if (itemsEditor2 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float translationX = itemsEditor2.getTranslationX() + left + o000000O.OooO0o(10);
            ItemsEditor itemsEditor3 = this.f74690OooOo0o;
            if (itemsEditor3 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float top = itemsEditor3.getTop();
            ItemsEditor itemsEditor4 = this.f74690OooOo0o;
            if (itemsEditor4 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float translationY = itemsEditor4.getTranslationY() + top + o000000O.OooO0o(10);
            ItemsEditor itemsEditor5 = this.f74690OooOo0o;
            if (itemsEditor5 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float right = itemsEditor5.getRight();
            ItemsEditor itemsEditor6 = this.f74690OooOo0o;
            if (itemsEditor6 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float translationX2 = (itemsEditor6.getTranslationX() + right) - o000000O.OooO0o(10);
            ItemsEditor itemsEditor7 = this.f74690OooOo0o;
            if (itemsEditor7 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float bottom = itemsEditor7.getBottom();
            ItemsEditor itemsEditor8 = this.f74690OooOo0o;
            if (itemsEditor8 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            RectF rectF = new RectF(translationX, translationY, translationX2, (itemsEditor8.getTranslationY() + bottom) - o000000O.OooO0o(10));
            InterfaceC31284OooO0O0.OooO00o oooO00o2 = InterfaceC31284OooO0O0.f111702OooO0O0;
            float f = this.f74692OooOoO0;
            oooO00o2.getClass();
            float fWidth = rectF.width() / new RectF(InterfaceC31284OooO0O0.OooO00o.OooO00o(f, list)).width();
            ItemsEditor itemsEditor9 = this.f74690OooOo0o;
            if (itemsEditor9 == null) {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
            float rotation = itemsEditor9.getRotation();
            oooO00o.invoke();
            OooO00o oooO00o3 = this.eventListener;
            if (oooO00o3 != null) {
                oooO00o3.OooO0o0(list, fWidth, rectF, rotation, z2, lassoParams);
            }
        }
    }

    public final void OooO0o0() {
        List<InterfaceC31284OooO0O0> selectedItems;
        ImageView imageView = this.f74689OooOo;
        if (imageView == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        imageView.setVisibility(8);
        ItemsEditor itemsEditor = this.f74690OooOo0o;
        if (itemsEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        itemsEditor.OooO0O0();
        LassoParams lassoParams = this.f74693OooOoOO;
        if (lassoParams == null || (selectedItems = lassoParams.getSelectedItems()) == null) {
            return;
        }
        List<InterfaceC31284OooO0O0> list = selectedItems;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (InterfaceC31284OooO0O0 interfaceC31284OooO0O0 : list) {
            if ((interfaceC31284OooO0O0 instanceof TextBoxInfo) || (interfaceC31284OooO0O0 instanceof QuoteInfo)) {
                OooO0o(true, true);
                return;
            }
        }
    }

    @Override // o0OoO0oo.InterfaceC28684OooO
    public Bitmap getBitmap() {
        ItemsEditor itemsEditor = this.f74690OooOo0o;
        if (itemsEditor != null) {
            return itemsEditor.getBitmap();
        }
        OooOOO0.OooOOOO("editor");
        throw null;
    }

    public final OooO00o getEventListener() {
        return this.eventListener;
    }

    @Override // com.orion.notein.ui.noteeditor.itemeditor.ItemsEditor.OooO00o
    public final void onCancel() {
        List<InterfaceC31284OooO0O0> selectedItems;
        LassoParams lassoParams = this.f74693OooOoOO;
        if (lassoParams == null || (selectedItems = lassoParams.getSelectedItems()) == null) {
            selectedItems = C34434OooOoO.f123453OooOo0o;
        }
        OooO00o oooO00o = this.eventListener;
        if (oooO00o != null) {
            List<InterfaceC31284OooO0O0> list = selectedItems;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC31284OooO0O0) it.next()).getId());
            }
            oooO00o.OooO0OO(arrayList);
        }
        ItemsEditor itemsEditor = this.f74690OooOo0o;
        if (itemsEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        itemsEditor.OooO0OO();
        setVisibility(8);
    }

    @Override // com.orion.notein.ui.noteeditor.itemeditor.ItemsEditor.OooO00o
    public final void onFinish() {
        List<PointF> polygonBorder;
        RectF rectF = this.f74695OooOoo0;
        ItemsEditor itemsEditor = this.f74690OooOo0o;
        if (itemsEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationX = itemsEditor.getTranslationX();
        ItemsEditor itemsEditor2 = this.f74690OooOo0o;
        if (itemsEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationY = itemsEditor2.getTranslationY();
        ItemsEditor itemsEditor3 = this.f74690OooOo0o;
        if (itemsEditor3 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationX2 = itemsEditor3.getTranslationX();
        if (this.f74690OooOo0o == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float width = translationX2 + r6.getWidth();
        ItemsEditor itemsEditor4 = this.f74690OooOo0o;
        if (itemsEditor4 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float translationY2 = itemsEditor4.getTranslationY();
        if (this.f74690OooOo0o == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        rectF.set(translationX, translationY, width, translationY2 + r7.getHeight());
        ItemsEditor itemsEditor5 = this.f74690OooOo0o;
        if (itemsEditor5 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        this.f74694OooOoo = itemsEditor5.getRotation();
        LassoParams lassoParams = this.f74693OooOoOO;
        RectF rectF2 = this.f74699Oooo000;
        if (lassoParams != null && (polygonBorder = lassoParams.getPolygonBorder()) != null) {
            for (PointF pointF : polygonBorder) {
                ImageView imageView = this.f74689OooOo;
                if (imageView == null) {
                    OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                float translationX3 = imageView.getTranslationX() - rectF2.left;
                ImageView imageView2 = this.f74689OooOo;
                if (imageView2 == null) {
                    OooOOO0.OooOOOO("lasso");
                    throw null;
                }
                pointF.offset(translationX3, imageView2.getTranslationY() - rectF2.top);
            }
        }
        ImageView imageView3 = this.f74689OooOo;
        if (imageView3 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationX4 = imageView3.getTranslationX();
        ImageView imageView4 = this.f74689OooOo;
        if (imageView4 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationY3 = imageView4.getTranslationY();
        ImageView imageView5 = this.f74689OooOo;
        if (imageView5 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationX5 = imageView5.getTranslationX();
        if (this.f74689OooOo == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float width2 = translationX5 + r6.getWidth();
        ImageView imageView6 = this.f74689OooOo;
        if (imageView6 == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        float translationY4 = imageView6.getTranslationY();
        if (this.f74689OooOo == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        rectF2.set(translationX4, translationY3, width2, translationY4 + r7.getHeight());
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ItemsEditor itemsEditor = (ItemsEditor) findViewById(R.id.items_editor);
        this.f74690OooOo0o = itemsEditor;
        if (itemsEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        itemsEditor.setEventListener(this);
        ItemsEditor itemsEditor2 = this.f74690OooOo0o;
        if (itemsEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        itemsEditor2.setColorInversion(this.f74691OooOoO);
        ImageView imageView = (ImageView) findViewById(R.id.lasso);
        this.f74689OooOo = imageView;
        if (imageView == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        imageView.setOnTouchListener(this.f74702Oooo0O0);
        ImageView imageView2 = this.f74689OooOo;
        if (imageView2 != null) {
            imageView2.setOnLongClickListener(new OooOO0O(this, 1));
        } else {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
    }

    @Override // com.orion.notein.ui.noteeditor.itemeditor.ItemsEditor.OooO00o
    public final void onMove(int i, int i2) {
        ItemsEditor itemsEditor = this.f74690OooOo0o;
        if (itemsEditor == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        RectF rectF = this.f74695OooOoo0;
        float f = i;
        itemsEditor.setTranslationX(rectF.left + f);
        ItemsEditor itemsEditor2 = this.f74690OooOo0o;
        if (itemsEditor2 == null) {
            OooOOO0.OooOOOO("editor");
            throw null;
        }
        float f2 = i2;
        itemsEditor2.setTranslationY(rectF.top + f2);
        ImageView imageView = this.f74689OooOo;
        if (imageView == null) {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
        RectF rectF2 = this.f74699Oooo000;
        imageView.setTranslationX(rectF2.left + f);
        ImageView imageView2 = this.f74689OooOo;
        if (imageView2 != null) {
            imageView2.setTranslationY(rectF2.top + f2);
        } else {
            OooOOO0.OooOOOO("lasso");
            throw null;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        OooOOO0.OooO0oO(event, "event");
        if (event.getActionMasked() == 0) {
            LassoParams lassoParams = this.f74693OooOoOO;
            List<InterfaceC31284OooO0O0> selectedItems = lassoParams != null ? lassoParams.getSelectedItems() : null;
            if (selectedItems != null && !selectedItems.isEmpty()) {
                RectF rectF = this.f74699Oooo000;
                float f = 20;
                if (new RectF(rectF.centerX() - o000000O.OooO0o0(169.0f), (rectF.top - f) - o000000O.OooO0o0(37.0f), o000000O.OooO0o0(169.0f) + rectF.centerX(), rectF.top - f).contains(event.getX(), event.getY())) {
                    return false;
                }
            }
            OooO0o(true, false);
        }
        return true;
    }

    public final void setColorInversion(boolean enabled) {
        this.f74691OooOoO = enabled;
        ItemsEditor itemsEditor = this.f74690OooOo0o;
        if (itemsEditor != null) {
            if (itemsEditor != null) {
                itemsEditor.setColorInversion(enabled);
            } else {
                OooOOO0.OooOOOO("editor");
                throw null;
            }
        }
    }

    public final void setEventListener(OooO00o oooO00o) {
        this.eventListener = oooO00o;
    }
}
