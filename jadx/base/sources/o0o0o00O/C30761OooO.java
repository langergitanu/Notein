package o0o0o00O;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.lifecycle.AbstractC22019Ooooooo;
import androidx.lifecycle.o0OoOo0;
import com.facebook.soloader.OooOo;
import com.orion.notein.domain.models.handwriting.RecognizedTextElement;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import com.orion.penkit.models.DrawRecord;
import com.orion.penkit.models.InkStrokeInfo;
import com.orion.penkit.models.LassoParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000oo0.C24684Oooo;
import o00o00O0.C25252OooO0Oo;
import o0O0oOo.AbstractC26133OooOO0o;
import o0OOo0Oo.InterfaceC27324Oooo0oo;
import o0OOo0o.C27545o00o0oo0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32449OooOOoo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33633Oooo0;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.C33784o00ooo;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0Oo.InterfaceC33788ooOO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: renamed from: o0o0o00O.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m80612d2 = {"Lo0o0o00O/OooO;", "Landroidx/lifecycle/Ooooooo;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class C30761OooO extends AbstractC22019Ooooooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C27545o00o0oo0 f110007OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C33781o00o0O f110008OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC27324Oooo0oo f110009OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C33769Ooooo0o f110010OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C33769Ooooo0o f110011OooO0oo;

    /* JADX INFO: renamed from: o0o0o00O.OooO$OooO00o */
    public static final class OooO00o implements InterfaceC33721OooO0o<String> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33781o00o0O f110012OooOo0o;

        /* JADX INFO: renamed from: o0o0o00O.OooO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20125OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33723OooO0oO f110013OooOo0o;

            /* JADX INFO: renamed from: o0o0o00O.OooO$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.recognize.TextRecognizeViewModel$special$$inlined$map$1$2", m80623f = "TextRecognizeViewModel.kt", m80624l = {50}, m80625m = "emit")
            public static final class C20126OooO00o extends AbstractC32479OooO0OO {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public int f110014OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f110015OooOo0o;

                public C20126OooO00o(Continuation continuation) {
                    super(continuation);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    this.f110015OooOo0o = obj;
                    this.f110014OooOo |= Integer.MIN_VALUE;
                    return C20125OooO00o.this.emit(null, this);
                }
            }

            public C20125OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO) {
                this.f110013OooOo0o = interfaceC33723OooO0oO;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) {
                C20126OooO00o c20126OooO00o;
                if (continuation instanceof C20126OooO00o) {
                    c20126OooO00o = (C20126OooO00o) continuation;
                    int i = c20126OooO00o.f110014OooOo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c20126OooO00o.f110014OooOo = i - Integer.MIN_VALUE;
                    } else {
                        c20126OooO00o = new C20126OooO00o(continuation);
                    }
                }
                Object obj2 = c20126OooO00o.f110015OooOo0o;
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i2 = c20126OooO00o.f110014OooOo;
                if (i2 == 0) {
                    C32446OooOOOo.OooO0O0(obj2);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                    String str = c32443OooOOO != null ? (String) c32443OooOOO.f116637OooOo : null;
                    c20126OooO00o.f110014OooOo = 1;
                    if (this.f110013OooOo0o.emit(str, c20126OooO00o) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj2);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(C33781o00o0O c33781o00o0O) {
            this.f110012OooOo0o = c33781o00o0O;
        }

        @Override // oO0o0Oo.InterfaceC33721OooO0o
        public final Object collect(InterfaceC33723OooO0oO<? super String> interfaceC33723OooO0oO, Continuation continuation) {
            this.f110012OooOo0o.collect(new C20125OooO00o(interfaceC33723OooO0oO), continuation);
            return EnumC32485OooO00o.f116726OooOo0o;
        }
    }

    public C30761OooO(C27545o00o0oo0 c27545o00o0oo0, InterfaceC27324Oooo0oo textBoxRepo) {
        OooOOO0.OooO0oO(textBoxRepo, "textBoxRepo");
        this.f110007OooO0Oo = c27545o00o0oo0;
        this.f110009OooO0o0 = textBoxRepo;
        C33781o00o0O c33781o00o0OOooO00o = C33784o00ooo.OooO00o(null);
        this.f110008OooO0o = c33781o00o0OOooO00o;
        this.f110010OooO0oO = C25252OooO0Oo.OooOoO0(new OooO00o(c33781o00o0OOooO00o), o0OoOo0.OooO00o(this), InterfaceC33788ooOO.OooO00o.OooO00o(2), null);
        this.f110011OooO0oo = C25252OooO0Oo.OooOoO0(textBoxRepo.getTextStyle(), C33633Oooo0.OooO0oO(o0OoOo0.OooO00o(this), ExecutorC33873OooO0O0.f122045OooOoO0), InterfaceC33788ooOO.OooO00o.OooO00o(2), C34436OooOoOO.f123455OooOo0o);
    }

    public static int OooO0o(PointF pointF, PointF pointF2, PointF pointF3) {
        float f = pointF2.y;
        float f2 = f - pointF.y;
        float f3 = pointF3.x;
        float f4 = pointF2.x;
        float f5 = ((f3 - f4) * f2) - ((pointF3.y - f) * (f4 - pointF.x));
        if (f5 > 0.0f) {
            return 1;
        }
        return f5 < 0.0f ? -1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x02e1, code lost:
    
        r0 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0o0(C30761OooO c30761OooO, ArrayList arrayList, LassoParams lassoParams, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C30768OooO0oO c30768OooO0oO;
        Object objOooO;
        LassoParams lassoParams2;
        List list;
        C30761OooO c30761OooO2;
        float f;
        C30761OooO c30761OooO3;
        LassoParams lassoParams3;
        List list2;
        PointF pointF;
        float f2;
        Serializable serializableOooOO0o;
        List list3;
        int i;
        RecognizedTextElement recognizedTextElement;
        Iterator it;
        Iterator it2;
        ?? Intersects;
        int i2 = 1;
        if (abstractC32479OooO0OO instanceof C30768OooO0oO) {
            c30768OooO0oO = (C30768OooO0oO) abstractC32479OooO0OO;
            int i3 = c30768OooO0oO.f110032OooOooO;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c30768OooO0oO.f110032OooOooO = i3 - Integer.MIN_VALUE;
            } else {
                c30768OooO0oO = new C30768OooO0oO(c30761OooO, abstractC32479OooO0OO);
            }
        }
        C30768OooO0oO c30768OooO0oO2 = c30768OooO0oO;
        Object obj = c30768OooO0oO2.f110031OooOoo0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i4 = c30768OooO0oO2.f110032OooOooO;
        if (i4 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c30761OooO.f110008OooO0o.setValue(null);
            List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : selectedItems) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O0 = (InterfaceC31284OooO0O0) obj2;
                if ((interfaceC31284OooO0O0 instanceof DrawRecord) || (interfaceC31284OooO0O0 instanceof InkStrokeInfo)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                c30761OooO.OooO0oO();
                return C32460OooOooO.f116667OooO00o;
            }
            RectF rectF = new RectF(lassoParams.getBorder());
            float fWidth = rectF.width() / 2.0f;
            float fHeight = rectF.height() / 2.0f;
            rectF.left -= fWidth;
            rectF.right += fWidth;
            rectF.top -= fHeight;
            rectF.bottom += fHeight;
            C32465OooO0O0 c32465OooO0O0OooO0Oo = OooOo.OooO0Oo();
            c32465OooO0O0OooO0Oo.addAll(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList) {
                InterfaceC31284OooO0O0 interfaceC31284OooO0O02 = (InterfaceC31284OooO0O0) obj3;
                if ((interfaceC31284OooO0O02 instanceof DrawRecord) || (interfaceC31284OooO0O02 instanceof InkStrokeInfo)) {
                    arrayList3.add(obj3);
                }
            }
            c32465OooO0O0OooO0Oo.addAll(arrayList3);
            C32465OooO0O0 c32465OooO0O0OooO0O0 = OooOo.OooO0O0(c32465OooO0O0OooO0Oo);
            HashSet hashSet = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            ListIterator listIterator = c32465OooO0O0OooO0O0.listIterator(0);
            while (true) {
                C32465OooO0O0.C20232OooO0O0 c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                if (!c20232OooO0O0.hasNext()) {
                    break;
                }
                Object next = c20232OooO0O0.next();
                if (hashSet.add(((InterfaceC31284OooO0O0) next).getId())) {
                    arrayList4.add(next);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList4) {
                if (RectF.intersects(((InterfaceC31284OooO0O0) obj4).getBoundingBox(1.0f), rectF)) {
                    arrayList5.add(obj4);
                }
            }
            c30768OooO0oO2.f110026OooOo0o = c30761OooO;
            c30768OooO0oO2.f110025OooOo = lassoParams;
            c30768OooO0oO2.f110028OooOoO0 = arrayList5;
            c30768OooO0oO2.f110032OooOooO = 1;
            objOooO = c30761OooO.f110007OooO0Oo.OooO(arrayList5);
            if (objOooO != enumC32485OooO00o) {
                lassoParams2 = lassoParams;
                list = arrayList5;
                c30761OooO2 = c30761OooO;
            }
            return enumC32485OooO00o;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f2 = c30768OooO0oO2.f110029OooOoOO;
            pointF = c30768OooO0oO2.f110027OooOoO;
            list2 = c30768OooO0oO2.f110028OooOoO0;
            lassoParams3 = c30768OooO0oO2.f110025OooOo;
            c30761OooO3 = c30768OooO0oO2.f110026OooOo0o;
            try {
                C32446OooOOOo.OooO0O0(obj);
                list3 = (List) obj;
            } catch (Exception e) {
                e = e;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "TextRecognizeViewModel", "recognizeHandWriting error: ", e), new Object[0]);
                list3 = null;
            }
            if (list3 != null) {
                c30761OooO3.OooO0oO();
                return C32460OooOooO.f116667OooO00o;
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                List<RecognizedTextElement.CharElement> chars = ((RecognizedTextElement) it3.next()).getChars();
                ArrayList arrayList7 = new ArrayList();
                Iterator it4 = chars.iterator();
                while (it4.hasNext()) {
                    RecognizedTextElement.CharElement charElement = (RecognizedTextElement.CharElement) it4.next();
                    RectF rectF2 = new RectF(charElement.getBounds());
                    o00OO0O0.OooO0O0.OooOO0O(rectF2, i2 / f2);
                    int i5 = i2;
                    rectF2.offset(-pointF.x, -pointF.y);
                    List<PointF> polygonBorder = lassoParams3.getPolygonBorder();
                    if (polygonBorder != null) {
                        c30761OooO3.getClass();
                        it = it3;
                        it2 = it4;
                        List listOooOO0o = C34429OooOOo0.OooOO0o(new PointF(rectF2.left, rectF2.top), new PointF(rectF2.right, rectF2.top), new PointF(rectF2.right, rectF2.bottom), new PointF(rectF2.left, rectF2.bottom));
                        ArrayList<C32443OooOOO> arrayList8 = new ArrayList();
                        int size = polygonBorder.size();
                        int i6 = 0;
                        while (i6 < size) {
                            PointF pointF2 = polygonBorder.get(i6);
                            i6++;
                            arrayList8.add(new C32443OooOOO(pointF2, polygonBorder.get(i6 % polygonBorder.size())));
                            listOooOO0o = listOooOO0o;
                        }
                        List list4 = listOooOO0o;
                        PointF pointF3 = new PointF(rectF2.left, rectF2.top);
                        PointF pointF4 = new PointF(rectF2.right, rectF2.top);
                        PointF pointF5 = new PointF(rectF2.right, rectF2.bottom);
                        PointF pointF6 = new PointF(rectF2.left, rectF2.bottom);
                        List listOooOO0o2 = C34429OooOOo0.OooOO0o(new C32443OooOOO(pointF3, pointF4), new C32443OooOOO(pointF4, pointF5), new C32443OooOOO(pointF5, pointF6), new C32443OooOOO(pointF6, pointF3));
                        Iterator it5 = list4.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                PointF pointF7 = (PointF) it5.next();
                                String str = AbstractC26133OooOO0o.f89191OooO0O0;
                                if (AbstractC26133OooOO0o.OooO00o.OooO0oO(pointF7, polygonBorder)) {
                                    break;
                                }
                            } else {
                                Iterator<PointF> it6 = polygonBorder.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        PointF next2 = it6.next();
                                        if (rectF2.contains(next2.x, next2.y)) {
                                            break;
                                        }
                                    } else {
                                        Iterator it7 = listOooOO0o2.iterator();
                                        while (it7.hasNext()) {
                                            C32443OooOOO c32443OooOOO = (C32443OooOOO) it7.next();
                                            for (C32443OooOOO c32443OooOOO2 : arrayList8) {
                                                PointF pointF8 = (PointF) c32443OooOOO.f116638OooOo0o;
                                                PointF pointF9 = (PointF) c32443OooOOO.f116637OooOo;
                                                PointF pointF10 = (PointF) c32443OooOOO2.f116638OooOo0o;
                                                PointF pointF11 = (PointF) c32443OooOOO2.f116637OooOo;
                                                Iterator it8 = it7;
                                                int iOooO0o = OooO0o(pointF8, pointF9, pointF10);
                                                C32443OooOOO c32443OooOOO3 = c32443OooOOO;
                                                int iOooO0o2 = OooO0o(pointF8, pointF9, pointF11);
                                                int iOooO0o3 = OooO0o(pointF10, pointF11, pointF8);
                                                int iOooO0o4 = OooO0o(pointF10, pointF11, pointF9);
                                                if (iOooO0o == iOooO0o2 || iOooO0o3 == iOooO0o4) {
                                                    it7 = it8;
                                                    c32443OooOOO = c32443OooOOO3;
                                                }
                                            }
                                        }
                                        Intersects = 0;
                                    }
                                }
                            }
                        }
                    } else {
                        it = it3;
                        it2 = it4;
                        Intersects = RectF.intersects(rectF2, lassoParams3.getBorder());
                    }
                    RecognizedTextElement.CharElement charElement2 = Intersects == 0 ? null : new RecognizedTextElement.CharElement(charElement.getChar(), rectF2);
                    if (charElement2 != null) {
                        arrayList7.add(charElement2);
                    }
                    it3 = it;
                    it4 = it2;
                    i2 = i5;
                }
                Iterator it9 = it3;
                int i7 = i2;
                if (arrayList7.isEmpty()) {
                    recognizedTextElement = null;
                } else {
                    String strO000oOoO = oOo000Oo.OooOo.o000oOoO(arrayList7, "", null, null, new C30764OooO0OO(), 30);
                    ArrayList arrayList9 = new ArrayList(C34428OooOOo.OooOOoo(arrayList7, 10));
                    Iterator it10 = arrayList7.iterator();
                    while (it10.hasNext()) {
                        arrayList9.add(((RecognizedTextElement.CharElement) it10.next()).getBounds());
                    }
                    Iterator it11 = arrayList9.iterator();
                    if (!it11.hasNext()) {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                    Object next3 = it11.next();
                    while (it11.hasNext()) {
                        RectF rectF3 = (RectF) next3;
                        rectF3.union((RectF) it11.next());
                        next3 = rectF3;
                    }
                    recognizedTextElement = new RecognizedTextElement(strO000oOoO, (RectF) next3, arrayList7);
                }
                if (recognizedTextElement != null) {
                    arrayList6.add(recognizedTextElement);
                }
                it3 = it9;
                i2 = i7;
            }
            int i8 = i2;
            ArrayList arrayList10 = new ArrayList();
            for (Object obj5 : list2) {
                RectF boundingBox = ((InterfaceC31284OooO0O0) obj5).getBoundingBox(1.0f);
                if (arrayList6.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it12 = arrayList6.iterator();
                    while (it12.hasNext()) {
                        if (RectF.intersects(boundingBox, ((RecognizedTextElement) it12.next()).getBounds())) {
                            i = i8;
                            break;
                        }
                    }
                    i = 0;
                }
                if (i != 0) {
                    arrayList10.add(obj5);
                }
            }
            String strO000oOoO2 = oOo000Oo.OooOo.o000oOoO(arrayList6, IOUtils.LINE_SEPARATOR_UNIX, null, null, new C30765OooO0Oo(), 30);
            C33781o00o0O c33781o00o0O = c30761OooO3.f110008OooO0o;
            C32443OooOOO c32443OooOOO4 = new C32443OooOOO(arrayList10, strO000oOoO2);
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, c32443OooOOO4);
            return C32460OooOooO.f116667OooO00o;
        }
        List list5 = c30768OooO0oO2.f110028OooOoO0;
        LassoParams lassoParams4 = c30768OooO0oO2.f110025OooOo;
        C30761OooO c30761OooO4 = c30768OooO0oO2.f110026OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        objOooO = obj;
        c30761OooO2 = c30761OooO4;
        list = list5;
        lassoParams2 = lassoParams4;
        C32449OooOOoo c32449OooOOoo = (C32449OooOOoo) objOooO;
        if (c32449OooOOoo == null) {
            c30761OooO2.OooO0oO();
            return C32460OooOooO.f116667OooO00o;
        }
        Bitmap bitmap = (Bitmap) c32449OooOOoo.f116648OooOo0o;
        PointF pointF12 = (PointF) c32449OooOOoo.f116647OooOo;
        float fFloatValue = ((Number) c32449OooOOoo.f116649OooOoO0).floatValue();
        try {
            C27545o00o0oo0 c27545o00o0oo0 = c30761OooO2.f110007OooO0Oo;
            c30768OooO0oO2.f110026OooOo0o = c30761OooO2;
            c30768OooO0oO2.f110025OooOo = lassoParams2;
            c30768OooO0oO2.f110028OooOoO0 = list;
            c30768OooO0oO2.f110027OooOoO = pointF12;
            c30768OooO0oO2.f110029OooOoOO = fFloatValue;
            c30768OooO0oO2.f110032OooOooO = 2;
            c27545o00o0oo0.getClass();
            try {
                f = fFloatValue;
            } catch (Exception e2) {
                e = e2;
                f = fFloatValue;
            }
            try {
                serializableOooOO0o = c27545o00o0oo0.OooOO0o(bitmap, new PointF(0.0f, 0.0f), 1.0f, true, c30768OooO0oO2);
            } catch (Exception e3) {
                e = e3;
                c30761OooO3 = c30761OooO2;
                lassoParams3 = lassoParams2;
                list2 = list;
                pointF = pointF12;
                f2 = f;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o2, "TextRecognizeViewModel", "recognizeHandWriting error: ", e), new Object[0]);
                list3 = null;
            }
        } catch (Exception e4) {
            e = e4;
            f = fFloatValue;
        }
        if (serializableOooOO0o != enumC32485OooO00o) {
            c30761OooO3 = c30761OooO2;
            lassoParams3 = lassoParams2;
            list2 = list;
            pointF = pointF12;
            f2 = f;
            obj = serializableOooOO0o;
            list3 = (List) obj;
            if (list3 != null) {
            }
        }
        return enumC32485OooO00o;
    }

    public final void OooO0oO() {
        C32443OooOOO c32443OooOOO = new C32443OooOOO(C34434OooOoO.f123453OooOo0o, "");
        C33781o00o0O c33781o00o0O = this.f110008OooO0o;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, c32443OooOOO);
    }
}
