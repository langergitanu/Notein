package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.a3u;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10431f3;
import com.aspose.slides.internal.p407st.C10477i9;
import com.aspose.slides.internal.p407st.C10487j0;
import com.aspose.slides.internal.p407st.C10495ji;
import com.aspose.slides.internal.p407st.C10556n5;
import com.aspose.slides.internal.p407st.C10601q9;
import com.aspose.slides.internal.p407st.C10626rv;
import com.aspose.slides.internal.p407st.C10678v6;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18115b5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class gh7 {
    /* JADX INFO: renamed from: c5 */
    private static void m6645c5(rpo rpoVar) {
        C10678v6 c10678v6;
        rpo rpoVarM70214k4 = rpoVar.m70214k4(0);
        if (rpoVarM70214k4.m70231up() >= 0 && (c10678v6 = (C10678v6) C7019kk.m27452k4((Object) rpoVar.m70228to(), C10678v6.class)) != null) {
            C10601q9 c10601q9 = new C10601q9();
            c10601q9.m51557k4(((long) rpoVarM70214k4.m70231up()) & 4294967295L);
            c10678v6.m50507k4(c10601q9);
        }
    }

    /* JADX INFO: renamed from: du */
    private static void m6646du(rpo rpoVar) {
        C10431f3 c10431f3 = (C10431f3) C7019kk.m27452k4((Object) rpoVar.m70228to(), C10431f3.class);
        rpoVar.m70214k4(0);
        if (c10431f3 != null) {
            m6649jd(rpoVar);
            return;
        }
        if (rpoVar.m70204bv()) {
            if (rpoVar.m70234wl()) {
                rpoVar.m70210h4().m74356k4(rpoVar.m70235x1().f1077kk);
                m6659m9(rpoVar);
                td3.m71113kk(rpoVar);
                return;
            }
            m6647dy(rpoVar);
            m6659m9(rpoVar);
            byte type = rpoVar.m70235x1().getBackground().getType();
            rpoVar.m70235x1().getBackground().setType((byte) -1);
            BaseOverrideThemeManager baseOverrideThemeManager = (BaseOverrideThemeManager) ((LayoutSlide) rpoVar.m70235x1()).getThemeManager();
            boolean zM63294k4 = baseOverrideThemeManager.m423to().m63294k4();
            baseOverrideThemeManager.m423to().m63293k4(false);
            td3.m71113kk(rpoVar);
            baseOverrideThemeManager.m423to().m63293k4(zM63294k4);
            rpoVar.m70235x1().getBackground().setType(type);
            m6645c5(rpoVar);
        }
    }

    /* JADX INFO: renamed from: dy */
    private static void m6647dy(rpo rpoVar) {
        MasterSlide masterSlide = (MasterSlide) C7019kk.m27452k4((Object) ((LayoutSlide) rpoVar.m70235x1()).getMasterSlide(), MasterSlide.class);
        rpoVar.m70215k4().m73701k4(masterSlide);
        yiz.m73916x1(rpoVar);
        td3.m71110k4(rpoVar);
        C1240i5.m7464k4(rpoVar);
        C10678v6 c10678v6 = (C10678v6) rpoVar.m70228to();
        C10626rv c10626rv = new C10626rv("Office Theme", (short) 2);
        c10626rv.m51409um().m51916k4((byte) 0);
        c10678v6.m50513yj().addItem(c10626rv);
        yiz.m73914kk(rpoVar);
        c10678v6.m51844k4(C14113y2.m67408k4(C14057f9.m66591x1(rpoVar.m70226qq()), C18115b5.CONNECTOR, masterSlide.getThemeManager().getOverrideTheme().getName()));
        cn8.m4692k4(rpoVar);
        yiz.m73913k4(rpoVar, (TextStyle) masterSlide.getTitleStyle());
        yiz.m73913k4(rpoVar, (TextStyle) masterSlide.getBodyStyle());
        yiz.m73913k4(rpoVar, (TextStyle) masterSlide.getOtherStyle());
        yiz.m73913k4(rpoVar, (TextStyle) masterSlide.m1941uz());
        yiz.m73913k4(rpoVar, (TextStyle) masterSlide.m1942wl());
        yiz.m73913k4(rpoVar, (TextStyle) masterSlide.m1940u4());
    }

    /* JADX INFO: renamed from: h4 */
    private static void m6648h4(rpo rpoVar) {
        LayoutSlide layoutSlide = (LayoutSlide) rpoVar.m70235x1();
        IGenericEnumerator<IControl> it = layoutSlide.getShapes().iterator();
        while (it.hasNext()) {
            try {
                ((Shape) it.next()).m2569kk(false);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        it = layoutSlide.getControls().iterator();
        while (it.hasNext()) {
            try {
                ((Control) it.next()).m1250k4(false);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: jd */
    private static void m6649jd(rpo rpoVar) {
        LayoutSlide layoutSlide = (LayoutSlide) rpoVar.m70235x1();
        y2n y2nVarM70215k4 = rpoVar.m70215k4();
        C10431f3 c10431f3 = (C10431f3) rpoVar.m70228to();
        C10495ji c10495jiM70209fa = rpoVar.m70209fa();
        y2nVarM70215k4.m73731x6().addItem(layoutSlide, Long.valueOf(c10495jiM70209fa.m51011to()));
        c10495jiM70209fa.m51009k4(layoutSlide.mo404to().m6945x1());
        rpo rpoVarM70214k4 = rpoVar.m70214k4(0);
        C10487j0 c10487j0M51360qq = c10431f3.m51360qq();
        c10487j0M51360qq.m50980k4(2);
        c10487j0M51360qq.m50981k4(rpoVarM70214k4.m70209fa().m51011to());
        c10487j0M51360qq.m50983x1(0L);
        c10487j0M51360qq.m51114kk(layoutSlide.getBackground().getType() == -1);
        c10487j0M51360qq.m51113k4(false);
        c10487j0M51360qq.m51117x1(false);
        C1240i5.m7464k4(rpoVar);
        c10487j0M51360qq.m50979dy()[0] = 3;
        c10487j0M51360qq.m50979dy()[1] = 4;
        c10487j0M51360qq.m50979dy()[2] = 7;
        c10487j0M51360qq.m50979dy()[3] = 9;
        c10487j0M51360qq.m50979dy()[4] = 8;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m6650k4(C10487j0 c10487j0) {
        int iM50982m9 = c10487j0.m50982m9();
        byte bM5914kk = f6b.m5914kk(c10487j0.m50982m9());
        c10487j0.m50980k4(iM50982m9);
        return bM5914kk;
    }

    /* JADX INFO: renamed from: kk */
    public static void m6658kk(rpo rpoVar) {
        rpo rpoVarM70214k4;
        if (rpoVar.m70220kk() != 4 || (rpoVarM70214k4 = rpoVar.m70214k4(3)) == null || C7019kk.m27452k4((Object) rpoVarM70214k4.m70228to(), C10431f3.class) == null) {
            return;
        }
        List.Enumerator<uz3> it = rpoVar.m70205c5().iterator();
        while (it.hasNext()) {
            try {
                uz3 next = it.next();
                if (next.m3744m9()) {
                    kiv kivVarM72008uz = next.m72008uz();
                    if (kivVarM72008uz != null) {
                        int iM63899du = kivVarM72008uz.m63899du();
                        if (iM63899du != 15 && iM63899du != 16) {
                            rpoVar.m70221kk(true);
                        }
                    } else {
                        oiv oivVarM72006u4 = next.m72006u4();
                        if (oivVarM72006u4 != null) {
                            int iM68592k4 = oivVarM72006u4.m68592k4();
                            if (iM68592k4 != 5 && iM68592k4 != 6) {
                                rpoVar.m70221kk(true);
                            }
                        }
                    }
                    if (rpoVar.m70233v4()) {
                        rpoVar.m70224m9().removeItemByKey(3);
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: m9 */
    private static void m6659m9(rpo rpoVar) {
        Shape shape;
        LayoutSlide layoutSlide = (LayoutSlide) rpoVar.m70235x1();
        IGenericEnumerator<IShape> it = layoutSlide.getShapes().iterator();
        while (true) {
            try {
                boolean zM7179k4 = true;
                if (!it.hasNext()) {
                    break;
                }
                IShape next = it.next();
                Placeholder placeholder = (Placeholder) C7019kk.m27452k4((Object) next.getPlaceholder(), Placeholder.class);
                if (placeholder == null) {
                    shape = (Shape) next;
                } else {
                    shape = (Shape) next;
                    zM7179k4 = hi8.m7179k4(placeholder);
                }
                shape.m2569kk(zM7179k4);
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<IControl> it2 = layoutSlide.getControls().iterator();
        while (it2.hasNext()) {
            try {
                ((Control) it2.next()).m1250k4(true);
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private static void m6660to(rpo rpoVar) {
        C10678v6 c10678v6;
        if (rpoVar.m70231up() >= 0 && (c10678v6 = (C10678v6) C7019kk.m27452k4((Object) rpoVar.m70228to(), C10678v6.class)) != null) {
            C10477i9 c10477i9 = new C10477i9();
            c10477i9.m50909k4(((long) rpoVar.m70231up()) & 4294967295L);
            c10678v6.m50507k4(c10477i9);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m6661x1(m4c m4cVar) {
        if (m4cVar.m64714fa() == 0) {
            IGenericEnumerator<qah> it = m4cVar.m64736uz().iterator();
            while (it.hasNext()) {
                try {
                    qah next = it.next();
                    if (next.m69481du().m70145ne() == null) {
                        next.m69488k4(false);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6651k4(BaseSlide baseSlide, LayoutSlide layoutSlide) {
        ShapeCollection shapeCollection = (ShapeCollection) baseSlide.getShapes();
        ShapeCollection shapeCollection2 = (ShapeCollection) layoutSlide.getShapes();
        List<Shape> listM64704x1 = m4c.m64704x1(baseSlide);
        List<Shape> listM64704x12 = m4c.m64704x1(layoutSlide);
        SortedList sortedList = new SortedList(listM64704x1.size());
        List.Enumerator<Shape> it = listM64704x12.iterator();
        long index = 10;
        while (it.hasNext()) {
            try {
                Placeholder placeholder = (Placeholder) C7019kk.m27452k4((Object) it.next().getPlaceholder(), Placeholder.class);
                if ((index & 4294967295L) <= (placeholder.getIndex() & 4294967295L)) {
                    index = ((placeholder.getIndex() & 4294967295L) + 1) & 4294967295L;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        List.Enumerator<Shape> it2 = listM64704x1.iterator();
        while (it2.hasNext()) {
            try {
                Shape next = it2.next();
                Placeholder placeholder2 = (Placeholder) C7019kk.m27452k4((Object) next.getPlaceholder(), Placeholder.class);
                if ((placeholder2.getIndex() & 4294967295L) >= 0) {
                    if (hi8.m7179k4(placeholder2)) {
                        placeholder2.m2270k4(index);
                        sortedList.addItem(Long.valueOf(placeholder2.getIndex()), next);
                        index++;
                    } else {
                        shapeCollection.remove(next);
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        it = listM64704x12.iterator();
        while (it.hasNext()) {
            try {
                Placeholder placeholder3 = (Placeholder) C7019kk.m27452k4((Object) it.next().getPlaceholder(), Placeholder.class);
                if (sortedList.containsKey(Long.valueOf(placeholder3.getIndex()))) {
                    shapeCollection.remove((IShape) sortedList.get_Item(Long.valueOf(placeholder3.getIndex())));
                    sortedList.removeItemByKey(Long.valueOf(placeholder3.getIndex()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        IGenericEnumerator<IShape> it3 = shapeCollection2.iterator();
        while (it3.hasNext()) {
            try {
                Shape shape = (Shape) it3.next();
                shape.m2592x1(shapeCollection);
                shapeCollection.m2636k4(shape);
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        IGenericEnumerator<T> it4 = sortedList.getValues().iterator();
        while (it4.hasNext()) {
            try {
                Shape shape2 = (Shape) it4.next();
                shapeCollection.f3345k4.removeItem(shape2);
                shapeCollection.f3345k4.addItem(shape2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.aspose.slides.rpo] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX INFO: renamed from: x1 */
    public static void m6662x1(rpo rpoVar) {
        int i;
        int i2;
        y2n y2nVar;
        int i3;
        List.Enumerator it;
        int i4;
        int i5;
        y2n y2nVarM70215k4 = rpoVar.m70215k4();
        MasterSlide masterSlide = (MasterSlide) rpoVar.m70235x1();
        if (rpoVar.m70228to() == null) {
            throw new NullReferenceException();
        }
        int i6 = 0;
        if (!rpoVar.m70204bv()) {
            while (i6 < masterSlide.getLayoutSlides().size()) {
                LayoutSlide layoutSlide = (LayoutSlide) masterSlide.getLayoutSlides().get_Item(i6);
                if (m6657k4(layoutSlide) && ((C10556n5) C7019kk.m27452k4((Object) rpoVar.m70228to(), C10556n5.class)) != null) {
                    new rpo(layoutSlide, y2nVarM70215k4);
                }
                i6++;
            }
            return;
        }
        boolean zM73697gi = y2nVarM70215k4.m73697gi();
        List list = new List();
        m6656k4(masterSlide.getShapes(), 0, list);
        IGenericEnumerator<ILayoutSlide> it2 = masterSlide.getLayoutSlides().iterator();
        ?? r7 = 0;
        int i7 = 0;
        ?? r4 = zM73697gi;
        while (it2.hasNext()) {
            try {
                ILayoutSlide next = it2.next();
                i7++;
                rpo rpoVar2 = new rpo((LayoutSlide) next, y2nVarM70215k4);
                rpoVar2.m70236x1(i7);
                int i8 = r4 | (next.hasDependingSlides() ? 1 : 0);
                String strM67400k4 = ((LayoutSlide) next).m1849x6().m71157fa() ? C14113y2.m67400k4(" ... ", "IsUserDrawn | ") : " ... ";
                if (next.getBackground() == null || next.getBackground().getType() == -1) {
                    i = i6;
                } else {
                    strM67400k4 = C14113y2.m67400k4(strM67400k4, "OwnBackground | ");
                    i = 1;
                }
                if (next.getThemeManager().isOverrideThemeEnabled()) {
                    strM67400k4 = C14113y2.m67400k4(strM67400k4, "OwnTheme | ");
                }
                int i9 = i | (next.getThemeManager().isOverrideThemeEnabled() ? 1 : 0);
                if (!next.getShowMasterShapes()) {
                    strM67400k4 = C14113y2.m67400k4(strM67400k4, "HideMaster | ");
                }
                int i10 = i9 | (!next.getShowMasterShapes() ? 1 : 0);
                List list2 = new List();
                if (i10 == 0) {
                    i2 = 1;
                    i10 |= m6656k4(next.getShapes(), i6, list2) ? 1 : 0;
                } else {
                    i2 = 1;
                }
                if (i10 == 0) {
                    SortedList sortedList = new SortedList();
                    SortedList sortedList2 = new SortedList();
                    if (list2.size() < list.size()) {
                        List.Enumerator it3 = list.iterator();
                        while (it3.hasNext()) {
                            try {
                                Placeholder placeholder = (Placeholder) it3.next();
                                y2n y2nVar2 = y2nVarM70215k4;
                                if (!sortedList.containsKey(Long.valueOf(placeholder.getIndex()))) {
                                    sortedList.addItem(Long.valueOf(placeholder.getIndex()), placeholder);
                                }
                                if (!sortedList2.containsKey(Byte.valueOf(placeholder.getType()))) {
                                    sortedList2.addItem(Byte.valueOf(placeholder.getType()), placeholder);
                                }
                                y2nVarM70215k4 = y2nVar2;
                            } finally {
                            }
                        }
                        y2nVar = y2nVarM70215k4;
                        if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                            it3.dispose();
                        }
                        it = list2.iterator();
                        i4 = i2;
                        while (it.hasNext()) {
                            try {
                                Placeholder placeholder2 = (Placeholder) it.next();
                                ?? ContainsKey = sortedList.containsKey(Long.valueOf(placeholder2.getIndex()));
                                if (ContainsKey == 0 && hi8.m7179k4(placeholder2)) {
                                    i5 = i8;
                                    if (sortedList2.containsKey(Byte.valueOf(placeholder2.getType()))) {
                                        ContainsKey = (placeholder2.getIndex() & 4294967295L) >= 10 ? i2 : 0;
                                    }
                                } else {
                                    i5 = i8;
                                }
                                i4 &= ContainsKey;
                                i8 = i5;
                            } catch (Throwable th) {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                                throw th;
                            }
                        }
                        i3 = i8;
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        i10 = i4 ^ 1;
                    } else {
                        y2nVar = y2nVarM70215k4;
                        i3 = i8;
                        List.Enumerator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            try {
                                Placeholder placeholder3 = (Placeholder) it4.next();
                                if (!sortedList.containsKey(Long.valueOf(placeholder3.getIndex()))) {
                                    sortedList.addItem(Long.valueOf(placeholder3.getIndex()), placeholder3);
                                }
                                if (!sortedList2.containsKey(Byte.valueOf(placeholder3.getType()))) {
                                    sortedList2.addItem(Byte.valueOf(placeholder3.getType()), placeholder3);
                                }
                            } finally {
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                            it4.dispose();
                        }
                        it = list.iterator();
                        i4 = i2;
                        while (it.hasNext()) {
                            try {
                                Placeholder placeholder4 = (Placeholder) it.next();
                                ?? ContainsKey2 = sortedList.containsKey(Long.valueOf(placeholder4.getIndex()));
                                if (ContainsKey2 == 0 && hi8.m7179k4(placeholder4) && sortedList2.containsKey(Byte.valueOf(placeholder4.getType()))) {
                                    ContainsKey2 = (((Placeholder) sortedList2.get_Item(Byte.valueOf(placeholder4.getType()))).getIndex() & 4294967295L) >= 10 ? i2 : 0;
                                }
                                i4 &= ContainsKey2;
                            } catch (Throwable th2) {
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                                throw th2;
                            }
                        }
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        i10 = i4 ^ 1;
                    }
                } else {
                    y2nVar = y2nVarM70215k4;
                    i3 = i8;
                }
                if (next.hasDependingSlides()) {
                    strM67400k4 = C14113y2.m67400k4(strM67400k4, " [USED] |");
                }
                if (next.getLayoutType() == -1) {
                    C14113y2.m67400k4(strM67400k4, " [Custom] |");
                }
                if (i10 == 0) {
                    rpoVar2.m70218k4((rpo) rpoVar);
                }
                y2nVarM70215k4 = y2nVar;
                i6 = 0;
                r4 = i3 | i10;
                r7 |= i10;
            } catch (Throwable th3) {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                throw th3;
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        rpoVar.m70238x1(r7);
        if (r4 != 0) {
            rpoVar.m70225ne();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6652k4(a3u a3uVar) {
        IGenericEnumerator<a3u.C0703k4> it = a3uVar.m3195uz().getValues().iterator();
        while (it.hasNext()) {
            try {
                a3u.C0703k4 next = it.next();
                if (!next.m3202k4().containsKey(-1)) {
                    throw new NullReferenceException("Haven't original master for existed list!");
                }
                m4c m4cVar = next.m3202k4().get_Item(-1);
                MasterSlide masterSlide = (MasterSlide) m4cVar.m64735up();
                IGenericEnumerator<KeyValuePair<Integer, m4c>> it2 = next.m3202k4().iterator();
                while (it2.hasNext()) {
                    try {
                        KeyValuePair<Integer, m4c> next2 = it2.next();
                        if (next2.getKey().intValue() != -1) {
                            m4c value = next2.getValue();
                            ILayoutSlide iLayoutSlideM71103k4 = td3.m71103k4(((C10678v6) value.m64717jd()).m51846rv().get_Item(next2.getKey()), value);
                            if (iLayoutSlideM71103k4 != null) {
                                if (!a3uVar.m3176ar()) {
                                    m6654k4(m4cVar, (LayoutSlide) iLayoutSlideM71103k4);
                                    ((LayoutSlide) iLayoutSlideM71103k4).setShowMasterShapes(true);
                                    value.m64726ks().addItem(Integer.valueOf(next2.getKey().intValue() & 65535), (LayoutSlide) iLayoutSlideM71103k4);
                                    if (value != m4cVar) {
                                        m4cVar.m64726ks().addItem(Integer.valueOf(next2.getKey().intValue() & 65535), (LayoutSlide) iLayoutSlideM71103k4);
                                    }
                                } else if (value != m4cVar) {
                                    LayoutSlide layoutSlide = (LayoutSlide) masterSlide.m1943x1(iLayoutSlideM71103k4.getLayoutType());
                                    value.m64720k4(layoutSlide);
                                    value.m64738wl().clear();
                                    value.m64723k4(true);
                                    C1240i5.m7462k4(value);
                                    layoutSlide.setName(iLayoutSlideM71103k4.getName());
                                    m6651k4(value.m64735up(), (LayoutSlide) iLayoutSlideM71103k4);
                                    value.m64740x1();
                                    if (((BaseOverrideThemeManager) iLayoutSlideM71103k4.getThemeManager()).m423to().m63294k4()) {
                                        ((BaseOverrideThemeManager) layoutSlide.getThemeManager()).m423to().m63292k4(((BaseOverrideThemeManager) iLayoutSlideM71103k4.getThemeManager()).m423to());
                                        ((BaseOverrideThemeManager) layoutSlide.getThemeManager()).m423to().m63293k4(true);
                                    }
                                    layoutSlide.setShowMasterShapes(((LayoutSlide) iLayoutSlideM71103k4).getShowMasterShapes());
                                    m4cVar.m64726ks().addItem(Integer.valueOf(next2.getKey().intValue() & 65535), layoutSlide);
                                    value.m64726ks().addItem(Integer.valueOf(next2.getKey().intValue() & 65535), layoutSlide);
                                } else if (value.m64707b3()) {
                                    LayoutSlide layoutSlide2 = (LayoutSlide) masterSlide.m1943x1(iLayoutSlideM71103k4.getLayoutType());
                                    value.m64720k4(layoutSlide2);
                                    layoutSlide2.setName(iLayoutSlideM71103k4.getName());
                                    m6651k4(value.m64735up(), (LayoutSlide) iLayoutSlideM71103k4);
                                    value.m64740x1();
                                    layoutSlide2.setShowMasterShapes(((LayoutSlide) iLayoutSlideM71103k4).getShowMasterShapes());
                                } else {
                                    m4cVar.m64726ks().addItem(Integer.valueOf(next2.getKey().intValue() & 65535), (LayoutSlide) iLayoutSlideM71103k4);
                                    m6654k4(m4cVar, (LayoutSlide) iLayoutSlideM71103k4);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        IGenericEnumerator<ILayoutSlide> it3 = a3uVar.m71946k4().getLayoutSlides().iterator();
        while (it3.hasNext()) {
            try {
                LayoutSlide layoutSlide3 = (LayoutSlide) it3.next();
                if ((layoutSlide3.m1849x6().m5309to() & 4294967295L) == 0) {
                    layoutSlide3.m1849x6().m5302k4(a3uVar.m71946k4().m2351fa().m68390um());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6653k4(m4c m4cVar) {
        LayoutSlide layoutSlide = (LayoutSlide) C7019kk.m27452k4((Object) m4cVar.m64735up(), LayoutSlide.class);
        if (layoutSlide == null) {
            return;
        }
        C10431f3 c10431f3 = (C10431f3) C7019kk.m27452k4((Object) m4cVar.m64717jd(), C10431f3.class);
        if (layoutSlide.getLayoutType() != 0) {
            throw new NotImplementedException("Non Title-Layout occured.");
        }
        layoutSlide.setName("Title Slide");
        m4c m4cVarM64713dy = m4cVar.m64713dy();
        m4c m4cVarM64713dy2 = m4cVarM64713dy.m64713dy();
        boolean z = m4cVar.m64712du().m3176ar() && m4cVarM64713dy.m64714fa() == 2 && m4cVarM64713dy2 != null;
        if (z) {
            m4cVarM64713dy.m64719k4();
        }
        C1240i5.m7462k4(m4cVar);
        if (c10431f3 == null) {
            return;
        }
        layoutSlide.m1848ne().m5780k4(true);
        C10431f3 c10431f32 = (C10431f3) C7019kk.m27452k4((Object) m4cVar.m64717jd(), C10431f3.class);
        layoutSlide.setShowMasterShapes(c10431f3.m51360qq().m51118x1());
        if (c10431f32 != null) {
            dki.m5123k4(layoutSlide.m1848ne(), c10431f32);
        }
        if (z) {
            LayoutSlide layoutSlide2 = (LayoutSlide) ((MasterSlide) m4cVarM64713dy2.m64735up()).m1943x1(layoutSlide.getLayoutType());
            m4cVar.m64720k4(layoutSlide2);
            layoutSlide2.setName(layoutSlide.getName());
            layoutSlide2.setShowMasterShapes(layoutSlide.getShowMasterShapes());
            m6651k4(m4cVar.m64735up(), layoutSlide);
            sfn.m70613k4(layoutSlide2.getShapes(), layoutSlide.getShapes());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m6654k4(m4c m4cVar, LayoutSlide layoutSlide) {
        List<Shape> listM64704x1 = m4c.m64704x1(layoutSlide);
        SortedList sortedList = new SortedList(listM64704x1.size());
        List.Enumerator<Shape> it = listM64704x1.iterator();
        long index = 0;
        while (it.hasNext()) {
            try {
                Shape next = it.next();
                Placeholder placeholder = (Placeholder) C7019kk.m27452k4((Object) next.getPlaceholder(), Placeholder.class);
                if ((placeholder.getIndex() & 4294967295L) >= 0) {
                    if ((index & 4294967295L) < (4294967295L & placeholder.getIndex())) {
                        index = placeholder.getIndex();
                    }
                    if (!sortedList.containsKey(Long.valueOf(placeholder.getIndex()))) {
                        sortedList.addItem(Long.valueOf(placeholder.getIndex()), next);
                    }
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        long j = index + 1;
        if ((j & 4294967295L) < 10) {
            j = 10;
        }
        List.Enumerator<Shape> it2 = m4c.m64704x1(m4cVar.m64735up()).iterator();
        while (it2.hasNext()) {
            try {
                Shape next2 = it2.next();
                Placeholder placeholder2 = (Placeholder) C7019kk.m27452k4((Object) next2.getPlaceholder(), Placeholder.class);
                if (hi8.m7179k4(placeholder2)) {
                    long index2 = next2.getPlaceholder().getIndex();
                    long j2 = j + 1;
                    placeholder2.m2270k4(j);
                    layoutSlide.getShapes().addClone(next2);
                    placeholder2.m2270k4(index2);
                    j = j2;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6655k4(rpo rpoVar) {
        SortedList sortedList = new SortedList(rpoVar.m70227rv().size());
        List.Enumerator<rpo> it = rpoVar.m70227rv().iterator();
        while (it.hasNext()) {
            try {
                rpo next = it.next();
                m6646du(next);
                m6648h4(next);
                if (next.m70234wl()) {
                    sortedList.addItem(Integer.valueOf(next.m70226qq()), next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        int size = sortedList.getKeys().size();
        while (size > 0) {
            size--;
            rpoVar.m70228to().m50507k4(((rpo) sortedList.get_Item(sortedList.getKeys().get_Item(size))).m70202ar());
        }
        m6660to(rpoVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m6656k4(IShapeCollection iShapeCollection, int i, List<Placeholder> list) {
        IGenericEnumerator<IShape> it = iShapeCollection.iterator();
        boolean zM6656k4 = false;
        while (it.hasNext()) {
            try {
                IShape next = it.next();
                GroupShape groupShape = (GroupShape) C7019kk.m27452k4((Object) next, GroupShape.class);
                if (groupShape != null) {
                    zM6656k4 |= m6656k4(groupShape.getShapes(), 1 + i, list);
                } else if (next.getPlaceholder() != null) {
                    list.addItem((Placeholder) next.getPlaceholder());
                } else {
                    zM6656k4 = true;
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return zM6656k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m6657k4(LayoutSlide layoutSlide) {
        if (layoutSlide.getLayoutType() != 0) {
            return false;
        }
        List.Enumerator<Shape> it = m4c.m64704x1(layoutSlide).iterator();
        while (it.hasNext()) {
            try {
                byte type = ((Placeholder) C7019kk.m27452k4((Object) it.next().getPlaceholder(), Placeholder.class)).getType();
                if (type != 2 && type != 3 && type != 4 && type != 5 && type != 6) {
                    return false;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return true;
        }
        it.dispose();
        return true;
    }
}
